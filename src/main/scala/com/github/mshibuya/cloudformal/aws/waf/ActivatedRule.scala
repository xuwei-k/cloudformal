package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html
 */

case class ActivatedRule(
    action: NonEmptyProperty[WafAction],
    priority: NonEmptyProperty[Int],
    ruleId: NonEmptyProperty[String]) extends Expression[ActivatedRule] {
  def render: Formattable = Value(
    "Action" -> action,
    "Priority" -> priority,
    "RuleId" -> ruleId
  )
}
