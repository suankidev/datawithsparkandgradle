/*
 * This Scala source file was generated by the Gradle 'init' task.
 */
package com.suanki
import  com.suanki.common.utils.SuankiUtils
object App {
  def main(args: Array[String]): Unit = {
    println("=="*50)

    println("getting spark session from utils!")
    val utilities = new SuankiUtils()

    val spark = utilities.get_spark_session()

    println(spark.range(10).show(truncate = false))
    println(greeting())

    print("=="*50)
  }

  def greeting(): String = "Hello, world!"
}
