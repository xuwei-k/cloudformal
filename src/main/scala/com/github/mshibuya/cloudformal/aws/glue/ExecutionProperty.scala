package com.github.mshibuya.cloudformal.aws.glue

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html
 */

case class ExecutionProperty(
    maxConcurrentRuns: Property[Double] = Empty) extends Expression[ExecutionProperty] {
  def render: Formattable = Value(
    "MaxConcurrentRuns" -> maxConcurrentRuns
  )
}
