package com.github.mshibuya.cloudformal.aws.inspector

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html
 */

trait AssessmentTarget extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Inspector::AssessmentTarget"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def assessmentTargetName: Property[String] = Empty
  def resourceGroupArn: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AssessmentTargetName" -> assessmentTargetName,
    "ResourceGroupArn" -> resourceGroupArn
  )
}
