package com.easyexpress;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import java.util.Date;

public class CalculatorPlugin extends CordovaPlugin {
  private static final String TAG = "CalculatorPlugin";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

    Log.d(TAG, "Initializing CalculatorPlugin");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("add")) {
       int a = Integer.parseInt(args.getString(0));
       int b = Integer.parseInt(args.getString(1));
    
       final PluginResult result = new PluginResult(PluginResult.Status.OK, a+b);
       callbackContext.sendPluginResult(result);
 
    }  
    return true;
  }

}
