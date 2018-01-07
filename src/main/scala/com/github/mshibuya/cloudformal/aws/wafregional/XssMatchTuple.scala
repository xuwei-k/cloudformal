package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html
 */

case class XssMatchTuple(
    textTransformation: NonEmptyProperty[String],
    fieldToMatch: NonEmptyProperty[FieldToMatch]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "TextTransformation" -> textTransformation,
    "FieldToMatch" -> fieldToMatch
  )
}