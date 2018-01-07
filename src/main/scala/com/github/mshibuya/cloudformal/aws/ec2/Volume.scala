package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html
 */

trait Volume extends Resource {
  val resourceTypeName = "AWS::EC2::Volume"

  def autoEnableIO: Property[Boolean] = Empty
  def availabilityZone: NonEmptyProperty[String]
  def encrypted: Property[Boolean] = Empty
  def iops: Property[Int] = Empty
  def kmsKeyId: Property[String] = Empty
  def size: Property[Int] = Empty
  def snapshotId: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def volumeType: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AutoEnableIO" -> autoEnableIO,
    "AvailabilityZone" -> availabilityZone,
    "Encrypted" -> encrypted,
    "Iops" -> iops,
    "KmsKeyId" -> kmsKeyId,
    "Size" -> size,
    "SnapshotId" -> snapshotId,
    "Tags" -> tags,
    "VolumeType" -> volumeType
  )
}