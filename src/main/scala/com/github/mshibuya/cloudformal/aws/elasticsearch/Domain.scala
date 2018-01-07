package com.github.mshibuya.cloudformal.aws.elasticsearch

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html
 */

trait Domain extends Resource {
  val resourceTypeName = "AWS::Elasticsearch::Domain"

  def domainArnAttribute: Expression[String] = Fn.GetAtt(logicalId, "DomainArn")
  def domainEndpointAttribute: Expression[String] = Fn.GetAtt(logicalId, "DomainEndpoint")

  def accessPolicies: Property[Json] = Empty
  def advancedOptions: Property[ListMap[String, String]] = Empty
  def domainName: Property[String] = Empty
  def eBSOptions: Property[EBSOptions] = Empty
  def elasticsearchClusterConfig: Property[ElasticsearchClusterConfig] = Empty
  def elasticsearchVersion: Property[String] = Empty
  def snapshotOptions: Property[SnapshotOptions] = Empty
  def tags: Property[Seq[Tag]] = Empty
  def vPCOptions: Property[VPCOptions] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AccessPolicies" -> accessPolicies,
    "AdvancedOptions" -> advancedOptions,
    "DomainName" -> domainName,
    "EBSOptions" -> eBSOptions,
    "ElasticsearchClusterConfig" -> elasticsearchClusterConfig,
    "ElasticsearchVersion" -> elasticsearchVersion,
    "SnapshotOptions" -> snapshotOptions,
    "Tags" -> tags,
    "VPCOptions" -> vPCOptions
  )
}