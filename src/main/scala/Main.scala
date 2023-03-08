import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

object Main {
  def main(args: Array[String]): Unit = {
    val projectName: String = "kfuluk"
    val logAppId: String = "sxdfjkgw405934ujufk"
    val entity1: String = "client_attributes"
    val id1: Int = 902231501
    val entity2: String = "gr_group_fee"
    val id2: Int = 902231502
    val content: String =
      s"""project_name,$projectName
        |log_app_id,$logAppId
        |#########################
        |$entity1,$id1
        |$entity2,$id2
        |""".stripMargin
    Files.write(Paths.get("src/main/resources/property"), content.getBytes(StandardCharsets.UTF_8))
  }

}
