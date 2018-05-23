
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kseniia/Desktop/136m-keystrokes/conf/routes
// @DATE:Tue May 22 12:09:05 EEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
