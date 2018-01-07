package com.github.mshibuya.cloudformal.aws.inspector

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html
 */

trait ResourceGroup extends Resource {
  val resourceTypeName = "AWS::Inspector::ResourceGroup"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def resourceGroupTags: NonEmptyProperty[Seq[Tag]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ResourceGroupTags" -> resourceGroupTags
  )
}