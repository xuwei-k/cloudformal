package com.github.mshibuya.cloudformal.aws.cloud9

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html
 */

trait EnvironmentEC2 extends Resource[EnvironmentEC2] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Cloud9::EnvironmentEC2"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
    val name: Expression[String] = Fn.GetAtt(logicalId, "Name")
  }

  def repositories: Property[Seq[Repository]] = Empty
  def ownerArn: Property[String] = Empty
  def description: Property[String] = Empty
  def automaticStopTimeMinutes: Property[Int] = Empty
  def subnetId: Property[String] = Empty
  def instanceType: NonEmptyProperty[String]
  def name: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Repositories" -> repositories,
    "OwnerArn" -> ownerArn,
    "Description" -> description,
    "AutomaticStopTimeMinutes" -> automaticStopTimeMinutes,
    "SubnetId" -> subnetId,
    "InstanceType" -> instanceType,
    "Name" -> name
  )
}
