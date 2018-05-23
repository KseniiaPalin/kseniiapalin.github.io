
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kseniia/Desktop/136m-keystrokes/conf/routes
// @DATE:Tue May 22 12:09:05 EEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTypingTest TypingTest = new controllers.ReverseTypingTest(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseExternalAssets ExternalAssets = new controllers.ReverseExternalAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTypingTest TypingTest = new controllers.javascript.ReverseTypingTest(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseExternalAssets ExternalAssets = new controllers.javascript.ReverseExternalAssets(RoutesPrefix.byNamePrefix());
  }

}
