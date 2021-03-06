package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html
 */

case class PushSync(
    applicationArns: Property[Seq[String]] = Empty,
    roleArn: Property[String] = Empty) extends Expression[PushSync] {
  def render: Formattable = Value(
    "ApplicationArns" -> applicationArns,
    "RoleArn" -> roleArn
  )
}
