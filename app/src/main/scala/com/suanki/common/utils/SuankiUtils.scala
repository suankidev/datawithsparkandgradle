package com.suanki.common.utils

import org.apache.spark.sql.SparkSession

class SuankiUtils {

  def get_spark_session():SparkSession={


    val spark=SparkSession.builder().master("local[2]")
      .appName("demo gradle app")
      .getOrCreate()

    spark
  }

}
