package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html
 */

trait EgressOnlyInternetGateway extends Resource[EgressOnlyInternetGateway] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::EC2::EgressOnlyInternetGateway"

  def vpcId: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "VpcId" -> vpcId
  )
}
