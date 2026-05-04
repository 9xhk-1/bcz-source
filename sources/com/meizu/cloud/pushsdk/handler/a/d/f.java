package com.meizu.cloud.pushsdk.handler.a.d;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a.c.h;

/* loaded from: classes7.dex */
public class f extends com.meizu.cloud.pushsdk.handler.a.a<h> {
    public f(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 262144;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public h c(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        String stringExtra2 = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID);
        return new h(intent.getStringExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE), g(intent), stringExtra, intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY), stringExtra2);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(h hVar) {
        com.meizu.cloud.pushsdk.util.d.b(d(), hVar.c(), hVar.a().b().d(), hVar.a().b().a(), hVar.a().b().e(), hVar.a().b().b());
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public void a(h hVar, com.meizu.cloud.pushsdk.notification.c cVar) {
        NotificationManager notificationManager = (NotificationManager) d().getSystemService("notification");
        if (notificationManager != null) {
            DebugLogger.e("AbstractMessageHandler", "start cancel notification id " + hVar.b());
            notificationManager.cancel(hVar.b());
            com.meizu.cloud.pushsdk.handler.a.a.a b11 = com.meizu.cloud.pushsdk.b.a(d()).b();
            if (b11 != null) {
                b11.a(hVar.b());
            }
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        int i11;
        DebugLogger.i("AbstractMessageHandler", "start WithDrawMessageHandler match");
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        if (!TextUtils.isEmpty(stringExtra)) {
            com.meizu.cloud.pushsdk.handler.a.c.b a11 = com.meizu.cloud.pushsdk.handler.a.c.b.a(stringExtra);
            if (a11.a() != null) {
                i11 = a11.a().a();
                return !PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && "4".equals(String.valueOf(i11));
            }
        }
        i11 = 0;
        if (PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction())) {
        }
    }
}
