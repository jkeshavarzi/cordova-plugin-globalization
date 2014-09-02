package org.apache.cordova.globalization;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class GlobalizationReceiver extends BroadcastReceiver {
    CallbackContext callbackContext;

    public GlobalizationReceiver(CallbackContext callbackContext){
        this.callbackContext = callbackContext;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        PluginResult pr = new PluginResult(PluginResult.Status.OK);
        pr.setKeepCallback(true);
        callbackContext.sendPluginResult(pr);
    }
}
