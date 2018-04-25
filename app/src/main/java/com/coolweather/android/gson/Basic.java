package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 睿 on 2018/4/24.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String id;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
