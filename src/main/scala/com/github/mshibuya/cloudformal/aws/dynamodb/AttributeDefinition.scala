package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-attributedef.html
 */

case class AttributeDefinition(
    attributeName: NonEmptyProperty[String],
    attributeType: NonEmptyProperty[String]) extends Expression[AttributeDefinition] {
  def render: Formattable = Value(
    "AttributeName" -> attributeName,
    "AttributeType" -> attributeType
  )
}
