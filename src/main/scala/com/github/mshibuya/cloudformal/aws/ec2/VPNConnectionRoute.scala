package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpn-connection-route.html
 */

trait VPNConnectionRoute extends Resource[VPNConnectionRoute] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::VPNConnectionRoute"

  def destinationCidrBlock: NonEmptyProperty[String]
  def vpnConnectionId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "DestinationCidrBlock" -> destinationCidrBlock,
    "VpnConnectionId" -> vpnConnectionId
  )
}
