package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html
 */

trait InstanceProfile extends Resource {
  val resourceTypeName = "AWS::IAM::InstanceProfile"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def instanceProfileName: Property[String] = Empty
  def path: Property[String] = Empty
  def roles: NonEmptyProperty[Seq[String]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "InstanceProfileName" -> instanceProfileName,
    "Path" -> path,
    "Roles" -> roles
  )
}