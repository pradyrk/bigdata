package retail_db
import org.apache.spark.sql.SparkSession

object dataFrameExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("SQL Basic").getOrCreate()
    val df = spark.read.csv(args(0))

    df.show(5)

  }
}
