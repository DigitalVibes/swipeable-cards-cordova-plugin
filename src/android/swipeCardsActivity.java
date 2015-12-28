package com.digitalvibes.swipeCards;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cordova.*;

public class swipeCardsActivity extends CordovaPlugin {

    public static CordovaWebView example;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("invokeCards")) {
            JSONObject x = args.getJSONObject(0);
            JSONObject y = x.getJSONObject("items");
            String successFunciton = x.getString("success");
            String failureFunction = x.getString("failure");
            //Log.i("SwipeCardsSuccessCallb", successFunciton);
            //Log.i("SwipeCardsFailuerCallb",failureFunction);
            //Log.i("SwipeableCards", new Integer(y.length()).toString());
            this.invokeCards(y, callbackContext,successFunciton,failureFunction);
            return true;
        }
        return false;
    }

    private void invokeCards(JSONObject cards, CallbackContext callbackContext,
                            String successFunction, String failureFunction) {
        example = this.webView;
        Context context=this.cordova.getActivity().getApplicationContext();
        Intent intent=new Intent(context,MainActivity.class);
        intent.putExtra("cards",cards.toString());
        intent.putExtra("successCallback",successFunction);
        intent.putExtra("failureCallback",failureFunction);

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        //Log.i("cordova plugin", "its coming here");
        
        

    }
}
