package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
 */

case class S3Action(
    bucketName: NonEmptyProperty[String],
    kmsKeyArn: Property[String] = Empty,
    topicArn: Property[String] = Empty,
    objectKeyPrefix: Property[String] = Empty) extends Expression[S3Action] {
  def render: Formattable = Value(
    "BucketName" -> bucketName,
    "KmsKeyArn" -> kmsKeyArn,
    "TopicArn" -> topicArn,
    "ObjectKeyPrefix" -> objectKeyPrefix
  )
}
