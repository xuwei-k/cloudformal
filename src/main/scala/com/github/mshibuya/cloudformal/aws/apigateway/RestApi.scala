package com.github.mshibuya.cloudformal.aws.apigateway

import argonaut.Json
import com.github.mshibuya.cloudformal.model
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html
 */

trait RestApi extends model.Resource[RestApi] with model.Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApiGateway::RestApi"

  object attributes {
    val rootResourceId: Expression[String] = Fn.GetAtt(logicalId, "RootResourceId")
  }

  def apiKeySourceType: Property[String] = Empty
  def binaryMediaTypes: Property[Seq[String]] = Empty
  def body: Property[Json] = Empty
  def bodyS3Location: Property[S3Location] = Empty
  def cloneFrom: Property[String] = Empty
  def description: Property[String] = Empty
  def endpointConfiguration: Property[EndpointConfiguration] = Empty
  def failOnWarnings: Property[Boolean] = Empty
  def minimumCompressionSize: Property[Int] = Empty
  def name: Property[String] = Empty
  def parameters: Property[ListMap[String, String]] = Empty

  def render(): MapValue[_] = Value(
    "ApiKeySourceType" -> apiKeySourceType,
    "BinaryMediaTypes" -> binaryMediaTypes,
    "Body" -> body,
    "BodyS3Location" -> bodyS3Location,
    "CloneFrom" -> cloneFrom,
    "Description" -> description,
    "EndpointConfiguration" -> endpointConfiguration,
    "FailOnWarnings" -> failOnWarnings,
    "MinimumCompressionSize" -> minimumCompressionSize,
    "Name" -> name,
    "Parameters" -> parameters
  )
}
