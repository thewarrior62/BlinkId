package com.microblink.blinkid.plugins.cordova.recognizers;

import com.microblink.blinkid.entities.recognizers.Recognizer;

import org.json.JSONObject;

public interface RecognizerSerialization {
    Recognizer<?> createRecognizer(JSONObject jsonObject);
    JSONObject serializeResult(Recognizer<?> recognizer);

    String getJsonName();
    Class<?> getRecognizerClass();
}