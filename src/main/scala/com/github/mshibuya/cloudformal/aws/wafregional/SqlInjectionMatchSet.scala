package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html
 */

trait SqlInjectionMatchSet extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAFRegional::SqlInjectionMatchSet"

  def sqlInjectionMatchTuples: Property[Seq[SqlInjectionMatchTuple]] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "SqlInjectionMatchTuples" -> sqlInjectionMatchTuples,
    "Name" -> name
  )
}
