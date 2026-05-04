package com.baicizhan.framework.push.oppopush;

import android.content.Context;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.service.DataMessageCallbackService;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AppPushMessageService extends DataMessageCallbackService {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17823a = "oppo_push";

    @Override // com.heytap.msp.push.service.DataMessageCallbackService, com.heytap.msp.push.callback.IDataMessageCallBackService
    public void processMessage(Context context, DataMessage message) {
        super.processMessage(context, message);
        c.i("oppo_push", "msg " + message, new Object[0]);
    }
}
