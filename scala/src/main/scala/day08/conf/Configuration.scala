package day08.conf

import java.util.ResourceBundle

/**
 * @author wsl
 * @version 2022-04-28-17:51
 *
 */
object Configuration {
  
  //加载配置文件
  private val bundle: ResourceBundle = ResourceBundle.getBundle("core")

  def getPropsValue(key:String):String={
    bundle.getString(key)
  }
}
