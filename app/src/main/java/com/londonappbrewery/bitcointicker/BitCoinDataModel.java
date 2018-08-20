package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitCoinDataModel {
    private String mValue;

    public static BitCoinDataModel fromJson(JSONObject jsonObject) {

        // JSON parsing is risky business. Need to surround the parsing code with a try-catch block.
        try {
            BitCoinDataModel weatherData = new BitCoinDataModel();
            weatherData.mValue = jsonObject.getString("ask");
            return weatherData;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getValue() {
        return mValue;
    }
}
