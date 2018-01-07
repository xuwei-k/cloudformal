package com.github.mshibuya.cloudformal.aws.iam

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html
 */

trait AccessKey extends Resource {
  val resourceTypeName = "AWS::IAM::AccessKey"

  def secretAccessKeyAttribute: Expression[String] = Fn.GetAtt(logicalId, "SecretAccessKey")

  def serial: Property[Int] = Empty
  def status: Property[String] = Empty
  def userName: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Serial" -> serial,
    "Status" -> status,
    "UserName" -> userName
  )
}