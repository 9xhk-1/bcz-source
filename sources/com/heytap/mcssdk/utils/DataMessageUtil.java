package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.constant.IntentConstant;
import com.heytap.mcssdk.constant.MessageConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class DataMessageUtil {
    private static final String TYPE = "type";

    public void appArrive(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(PushService.getInstance().getReceiveSdkAction(context));
            intent.setPackage(PushService.getInstance().getMcsPackageName(context));
            intent.putExtra(IntentConstant.APP_PACKAGE, context.getPackageName());
            intent.putExtra(IntentConstant.MESSAGE_ID, str);
            intent.putExtra("type", MessageConstant.CommandId.COMMAND_SEND_INSTANT_ACK);
            context.startService(intent);
        } catch (Exception e11) {
            LogUtil.e("statisticMessage--Exception" + e11.getMessage());
        }
    }
}
