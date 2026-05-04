package com.huawei.hms.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {
    public static ErrorEnum a(Context context) {
        if (!TextUtils.isEmpty(BaseUtils.getLocalToken(context, null))) {
            return ErrorEnum.SUCCESS;
        }
        if (!AutoInitHelper.isAutoInitEnabled(context)) {
            HMSLog.e("TokenUtil", "Token not exist");
            return ErrorEnum.ERROR_NO_TOKEN;
        }
        HMSLog.e("TokenUtil", "Token not exist, try auto init");
        AutoInitHelper.doAutoInit(context);
        return ErrorEnum.ERROR_AUTO_INITIALIZING;
    }
}
