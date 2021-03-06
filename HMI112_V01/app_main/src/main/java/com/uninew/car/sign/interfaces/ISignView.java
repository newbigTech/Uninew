package com.uninew.car.sign.interfaces;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2017/9/14.
 */

public interface ISignView {
    /**显示司机信息
     * @param bitmap 司机图像
     * @param name    司机姓名
     */
    void ShowDriverInfo(Bitmap bitmap, String name);

    /**
     * 运营金额
     * @param money
     */
    void ShowOperateMoney(float money);

    /**
     * 当班时间
     * @param startTime
     * @param endTime
     */
    void ShowOperateTime(String startTime,String endTime);

    /**
     * 运营信息
     * @param OperNumber 运营次数
     * @param runKm     行驶里程
     * @param carryNumber   载客里程
     */
    void ShowOperateData(int OperNumber,float runKm,float carryNumber);
    /**
     * 签到应答 0x00：成功；0x01：失败
     *
     * @param result
     */
    void SignIn(int result);

    /**
     * 签退应答 0x00：成功；0x01：失败
     *
     * @param result
     */
    void SignOut(int result);
}
