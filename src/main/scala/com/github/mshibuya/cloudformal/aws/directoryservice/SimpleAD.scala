package com.github.mshibuya.cloudformal.aws.directoryservice

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-directoryservice-simplead.html
 */

trait SimpleAD extends Resource[SimpleAD] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DirectoryService::SimpleAD"

  object attributes {
    val alias: Expression[String] = Fn.GetAtt(logicalId, "Alias")
    val dnsIpAddresses: Expression[Seq[String]] = Fn.GetAtt(logicalId, "DnsIpAddresses")
  }

  def createAlias: Property[Boolean] = Empty
  def description: Property[String] = Empty
  def enableSso: Property[Boolean] = Empty
  def name: NonEmptyProperty[String]
  def password: NonEmptyProperty[String]
  def shortName: Property[String] = Empty
  def size: NonEmptyProperty[String]
  def vpcSettings: NonEmptyProperty[VpcSettings]

  def render(): MapValue[_] = Value(
    "CreateAlias" -> createAlias,
    "Description" -> description,
    "EnableSso" -> enableSso,
    "Name" -> name,
    "Password" -> password,
    "ShortName" -> shortName,
    "Size" -> size,
    "VpcSettings" -> vpcSettings
  )
}
