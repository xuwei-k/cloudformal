package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html
 */

trait ReceiptRule extends Resource[ReceiptRule] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SES::ReceiptRule"

  def after: Property[String] = Empty
  def rule: NonEmptyProperty[Rule]
  def ruleSetName: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "After" -> after,
    "Rule" -> rule,
    "RuleSetName" -> ruleSetName
  )
}
