package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html
 */

trait Parameter extends Resource {
  val resourceTypeName = "AWS::SSM::Parameter"

  def typeAttribute: Expression[String] = Fn.GetAtt(logicalId, "Type")
  def valueAttribute: Expression[String] = Fn.GetAtt(logicalId, "Value")

  def `type`: NonEmptyProperty[String]
  def description: Property[String] = Empty
  def allowedPattern: Property[String] = Empty
  def value: NonEmptyProperty[String]
  def name: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Type" -> `type`,
    "Description" -> description,
    "AllowedPattern" -> allowedPattern,
    "Value" -> value,
    "Name" -> name
  )
}