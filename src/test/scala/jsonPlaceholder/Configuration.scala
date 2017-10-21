package jsonPlaceholder

import com.typesafe.config.{ConfigException, ConfigFactory}
import scala.util.Try

trait Configuration  {
  private[this] val config = ConfigFactory.load()

  val numOfUser = getRequiredInt("numOfUser")

  def getRequiredString(path: String) = {
    Try(config.getString(path)).getOrElse {
      handleError(path)
    }
  }

  def getRequiredInt(path: String) = {
    Try(config.getInt(path)).getOrElse {
      handleError(path)
    }
  }

  def getRequiredStringProperty(path: String) : String = {
    if(System.getProperty(path)!=null){
      return System.getProperty(path)
    }else{
      return config.getString(path)
    }
  }

  private[this] def handleError(path: String) = {
    val errMsg = "Missing required configuration entry: ${path}"
    throw new ConfigException.Missing(errMsg)
  }
}
