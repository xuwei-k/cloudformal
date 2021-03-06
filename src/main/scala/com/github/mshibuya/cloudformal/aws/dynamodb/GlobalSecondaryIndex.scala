package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-gsi.html
 */

case class GlobalSecondaryIndex(
    indexName: NonEmptyProperty[String],
    keySchema: NonEmptyProperty[Seq[KeySchema]],
    projection: NonEmptyProperty[Projection],
    provisionedThroughput: NonEmptyProperty[ProvisionedThroughput]) extends Expression[GlobalSecondaryIndex] {
  def render: Formattable = Value(
    "IndexName" -> indexName,
    "KeySchema" -> keySchema,
    "Projection" -> projection,
    "ProvisionedThroughput" -> provisionedThroughput
  )
}
