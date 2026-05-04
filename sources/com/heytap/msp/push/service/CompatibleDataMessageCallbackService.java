package com.heytap.msp.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.mcssdk.PushParseHelper;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.utils.LogUtil;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.DataMessage;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CompatibleDataMessageCallbackService extends Service implements IDataMessageCallBackService {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        PushService.getInstance().innerInit(getApplicationContext());
        PushParseHelper.parseIntent(getApplicationContext(), intent, this);
        return 2;
    }

    public void processMessage(Context context, DataMessage dataMessage) {
        LogUtil.d("Receive DataMessageCallbackService:messageTitle: " + dataMessage.getTitle() + " ------content:" + dataMessage.getContent() + "------describe:" + dataMessage.getDescription());
    }
}
