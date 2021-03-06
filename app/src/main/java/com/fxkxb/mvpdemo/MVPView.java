package com.fxkxb.mvpdemo;

/**
 * @author : Hailong Fu (hailong.fu@thundersoft.com)
 * @version : 1.0
 * @file : MVPView.class
 * @date : September 17,2021 11:26
 * @description : View接口是Activity与Presenter层的中间层，
 * 它的作用是根据具体业务的需要，为Presenter提供调用Activity中具体UI逻辑操作的方法。
 */
public interface MVPView {
    /**
     * 显示正在加载进度框
     */
    void showLoading();

    /**
     * 隐藏正在加载进度框
     */
    void hideLoading();

    /**
     * 当数据请求成功后，调用此接口显示数据
     *
     * @param data 数据源
     */
    void showData(String data);

    /**
     * 当数据请求失败后，调用此接口提示
     *
     * @param msg 失败原因
     */
    void showFailureMessage(String msg);

    /**
     * 当数据请求异常，调用此接口提示
     */
    void showErrorMessage();
}