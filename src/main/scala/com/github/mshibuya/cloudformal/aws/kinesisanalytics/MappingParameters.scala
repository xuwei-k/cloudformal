package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html
 */

case class MappingParameters(
    jSONMappingParameters: Property[JSONMappingParameters] = Empty,
    cSVMappingParameters: Property[CSVMappingParameters] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "JSONMappingParameters" -> jSONMappingParameters,
    "CSVMappingParameters" -> cSVMappingParameters
  )
}