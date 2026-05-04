package com.meizu.cloud.pushsdk.handler.a.e;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;

/* loaded from: classes7.dex */
public class a extends com.meizu.cloud.pushsdk.handler.a.a<PushSwitchStatus> {
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 256;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public PushSwitchStatus c(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.MZ_MESSAGE_VALUE);
        PushSwitchStatus c11 = !TextUtils.isEmpty(stringExtra) ? com.meizu.cloud.pushsdk.platform.message.a.c(stringExtra) : (PushSwitchStatus) intent.getSerializableExtra(PushConstants.EXTRA_APP_PUSH_SWITCH_STATUS);
        if (BasicPushStatus.SUCCESS_CODE.equals(c11.getCode())) {
            String g11 = g(intent);
            DebugLogger.e("AbstractMessageHandler", "PushSwitchStatusHandler update local " + g11 + " switch status " + c11);
            com.meizu.cloud.pushsdk.util.b.a(d(), g11, c11.isSwitchNotificationMessage());
            com.meizu.cloud.pushsdk.util.b.b(d(), g11, c11.isSwitchThroughMessage());
        }
        return c11;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public void a(PushSwitchStatus pushSwitchStatus, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (c() == null || pushSwitchStatus == null) {
            return;
        }
        c().a(d(), pushSwitchStatus);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start PushSwitchStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PUSH_STATUS.equals(k(intent));
    }
}
