package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes7.dex */
public class f extends a<Boolean> {
    public f(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 32;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean c(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra(PushConstants.EXTRA_APP_IS_UNREGISTER_SUCCESS, false);
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_REGISTRATION_ERROR);
        String stringExtra2 = intent.getStringExtra(PushConstants.EXTRA_UNREGISTERED);
        DebugLogger.i("AbstractMessageHandler", "processUnRegisterCallback 5.0:" + booleanExtra + " 4.0:" + stringExtra + " 3.0:" + stringExtra2);
        if (!TextUtils.isEmpty(stringExtra) && !booleanExtra && TextUtils.isEmpty(stringExtra2)) {
            return Boolean.FALSE;
        }
        com.meizu.cloud.pushsdk.util.b.g(d(), "", d().getPackageName());
        return Boolean.TRUE;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public void a(Boolean bool, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (c() != null) {
            c().a(d(), bool.booleanValue());
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start UnRegisterMessageHandler match");
        if (PushConstants.MZ_PUSH_ON_UNREGISTER_ACTION.equals(intent.getAction())) {
            return true;
        }
        return PushConstants.REQUEST_UNREGISTER_INTENT.equals(intent.getAction()) && TextUtils.isEmpty(intent.getStringExtra(PushConstants.EXTRA_UNREGISTERED));
    }
}
