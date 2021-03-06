package com.github.mshibuya.cloudformal.aws.route53

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html
 */

case class QueryLoggingConfig(
    cloudWatchLogsLogGroupArn: NonEmptyProperty[String]) extends Expression[QueryLoggingConfig] {
  def render: Formattable = Value(
    "CloudWatchLogsLogGroupArn" -> cloudWatchLogsLogGroupArn
  )
}
