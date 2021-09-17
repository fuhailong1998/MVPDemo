package com.fxkxb.mvpdemo;

import android.os.Handler;
import android.content.BroadcastReceiver;
import android.content.Context;
/**
 * @author : Hailong Fu (hailong.fu@thundersoft.com)
 * @version : 1.0
 * @file : MVPModel.class
 * @date : September 17,2021 11:24
 * @description : Model 类中定了具体的网络请求操作。
 * 为模拟真实的网络请求，利用postDelayed方法模拟耗时操作，通过判断请求参数反馈不同的请求状态。
 */
public class MVPModel {
    /**
     * 获取网络接口数据
     * @param param 请求参数
     * @param callback 数据回调接口
     */
    public static void getNetData(final String param, final MVPCallback callback){


        // 利用postDelayed方法模拟网络请求数据的耗时操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (param){
                    case "normal":
                        callback.onSuccess("根据参数"+param+"的请求网络数据成功");
                        break;
                    case "failure":
                        callback.onFailure("请求失败：参数有误");
                        break;
                    case "error":
                        callback.onError();
                        break;
                }
                callback.onComplete();
            }
        },2000);
    }
}