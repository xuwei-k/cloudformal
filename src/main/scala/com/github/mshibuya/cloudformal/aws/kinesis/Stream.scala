package com.github.mshibuya.cloudformal.aws.kinesis

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html
 */

trait Stream extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Kinesis::Stream"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def name: Property[String] = Empty
  def retentionPeriodHours: Property[Int] = Empty
  def shardCount: NonEmptyProperty[Int]
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name,
    "RetentionPeriodHours" -> retentionPeriodHours,
    "ShardCount" -> shardCount,
    "Tags" -> tags
  )
}
