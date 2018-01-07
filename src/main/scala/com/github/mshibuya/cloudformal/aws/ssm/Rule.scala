package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html
 */

case class Rule(
    patchFilterGroup: Property[PatchFilterGroup] = Empty,
    approveAfterDays: Property[Int] = Empty,
    complianceLevel: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "PatchFilterGroup" -> patchFilterGroup,
    "ApproveAfterDays" -> approveAfterDays,
    "ComplianceLevel" -> complianceLevel
  )
}