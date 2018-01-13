package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html
 */

trait Connection extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Glue::Connection"

  def connectionInput: NonEmptyProperty[ConnectionInput]
  def catalogId: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ConnectionInput" -> connectionInput,
    "CatalogId" -> catalogId
  )
}
