package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html
 */

trait VPC extends Resource {
  val resourceTypeName = "AWS::EC2::VPC"

  def cidrBlockAttribute: Expression[String] = Fn.GetAtt(logicalId, "CidrBlock")
  def cidrBlockAssociationsAttribute: Expression[Seq[String]] = Fn.GetAtt(logicalId, "CidrBlockAssociations")
  def defaultNetworkAclAttribute: Expression[String] = Fn.GetAtt(logicalId, "DefaultNetworkAcl")
  def defaultSecurityGroupAttribute: Expression[String] = Fn.GetAtt(logicalId, "DefaultSecurityGroup")
  def ipv6CidrBlocksAttribute: Expression[Seq[String]] = Fn.GetAtt(logicalId, "Ipv6CidrBlocks")

  def cidrBlock: NonEmptyProperty[String]
  def enableDnsHostnames: Property[Boolean] = Empty
  def enableDnsSupport: Property[Boolean] = Empty
  def instanceTenancy: Property[String] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CidrBlock" -> cidrBlock,
    "EnableDnsHostnames" -> enableDnsHostnames,
    "EnableDnsSupport" -> enableDnsSupport,
    "InstanceTenancy" -> instanceTenancy,
    "Tags" -> tags
  )
}