package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html
 */

case class CreditSpecification(
    cpuCredits: Property[String] = Empty) extends Expression[CreditSpecification] {
  def render: Formattable = Value(
    "CPUCredits" -> cpuCredits
  )
}
