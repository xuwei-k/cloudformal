package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html
 */

trait Route extends Resource {
  val resourceTypeName = "AWS::EC2::Route"

  def destinationCidrBlock: Property[String] = Empty
  def destinationIpv6CidrBlock: Property[String] = Empty
  def egressOnlyInternetGatewayId: Property[String] = Empty
  def gatewayId: Property[String] = Empty
  def instanceId: Property[String] = Empty
  def natGatewayId: Property[String] = Empty
  def networkInterfaceId: Property[String] = Empty
  def routeTableId: NonEmptyProperty[String]
  def vpcPeeringConnectionId: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DestinationCidrBlock" -> destinationCidrBlock,
    "DestinationIpv6CidrBlock" -> destinationIpv6CidrBlock,
    "EgressOnlyInternetGatewayId" -> egressOnlyInternetGatewayId,
    "GatewayId" -> gatewayId,
    "InstanceId" -> instanceId,
    "NatGatewayId" -> natGatewayId,
    "NetworkInterfaceId" -> networkInterfaceId,
    "RouteTableId" -> routeTableId,
    "VpcPeeringConnectionId" -> vpcPeeringConnectionId
  )
}