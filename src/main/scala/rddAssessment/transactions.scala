package rddAssessment

import org.apache.spark.{SparkConf,SparkContext,HashPartitioner}



  object transactions{
    def main(args: Array[String]): Unit = {
      val conf = new SparkConf().setMaster(args(0)).setAppName("Get Revenue Per Order")
      val sc = new SparkContext(conf)
      val tfile = sc.textFile(args(1))
      tfile.
      Thread.sleep(50000)
    }
}
