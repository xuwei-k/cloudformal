package com.github.mshibuya.cloudformal.aws.ec2

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html
 */

case class EC2InstanceSsmAssociations(
    associationParameters: Option[Seq[EC2InstanceSsmAssociationsAssociationParameters]] = None,
    documentName: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AssociationParameters" -> associationParameters.map(Formattable(_)),
    "DocumentName" -> Some(Formattable(documentName))
  )
}