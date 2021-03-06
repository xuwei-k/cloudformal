package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetcidrblock.html
 */

trait SubnetCidrBlock extends Resource[SubnetCidrBlock] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::SubnetCidrBlock"

  def ipv6CidrBlock: NonEmptyProperty[String]
  def subnetId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "Ipv6CidrBlock" -> ipv6CidrBlock,
    "SubnetId" -> subnetId
  )
}
