package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html
 */

case class Source(
    owner: NonEmptyProperty[String],
    sourceDetails: Property[Seq[SourceDetail]] = Empty,
    sourceIdentifier: NonEmptyProperty[String]) extends Expression[Source] {
  def render: Formattable = Value(
    "Owner" -> owner,
    "SourceDetails" -> sourceDetails,
    "SourceIdentifier" -> sourceIdentifier
  )
}
