package com.meizu.cloud.pushsdk.handler.a.d;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;

/* loaded from: classes7.dex */
public class d extends com.meizu.cloud.pushsdk.handler.a.a<MessageV3> {

    /* renamed from: a, reason: collision with root package name */
    private Context f39889a;

    public d(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
        this.f39889a = context;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 128;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.d.a(d(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public MessageV3 c(Intent intent) {
        return (MessageV3) intent.getParcelableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (messageV3 == null) {
            return;
        }
        if (c() == null) {
            c().c(d(), MzPushMessage.fromMessageV3(messageV3));
        }
        c(messageV3);
        a(this.f39889a, messageV3);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationDeleteMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_DELETE.equals(k(intent));
    }
}
