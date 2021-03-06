package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html
 */

case class DataExport(
    destination: NonEmptyProperty[Destination],
    outputSchemaVersion: NonEmptyProperty[String]) extends Expression[DataExport] {
  def render: Formattable = Value(
    "Destination" -> destination,
    "OutputSchemaVersion" -> outputSchemaVersion
  )
}
