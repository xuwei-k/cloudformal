package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule-noncurrentversiontransition.html
 */

case class NoncurrentVersionTransition(
    storageClass: NonEmptyProperty[String],
    transitionInDays: NonEmptyProperty[Int]) extends Expression[NoncurrentVersionTransition] {
  def render: Formattable = Value(
    "StorageClass" -> storageClass,
    "TransitionInDays" -> transitionInDays
  )
}
