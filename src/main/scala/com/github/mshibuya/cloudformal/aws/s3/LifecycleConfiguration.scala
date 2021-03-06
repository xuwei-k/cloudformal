package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig.html
 */

case class LifecycleConfiguration(
    rules: NonEmptyProperty[Seq[Rule]]) extends Expression[LifecycleConfiguration] {
  def render: Formattable = Value(
    "Rules" -> rules
  )
}
