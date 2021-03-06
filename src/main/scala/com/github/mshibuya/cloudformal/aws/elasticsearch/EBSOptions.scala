package com.github.mshibuya.cloudformal.aws.elasticsearch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html
 */

case class EBSOptions(
    ebsEnabled: Property[Boolean] = Empty,
    iops: Property[Int] = Empty,
    volumeSize: Property[Int] = Empty,
    volumeType: Property[String] = Empty) extends Expression[EBSOptions] {
  def render: Formattable = Value(
    "EBSEnabled" -> ebsEnabled,
    "Iops" -> iops,
    "VolumeSize" -> volumeSize,
    "VolumeType" -> volumeType
  )
}
