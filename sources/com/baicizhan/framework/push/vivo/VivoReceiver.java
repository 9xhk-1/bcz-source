package com.baicizhan.framework.push.vivo;

import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import oc.i;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class VivoReceiver extends OpenClientPushMessageReceiver {
    public static final String TAG = "vivo_push";

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onNotificationMessageClicked(Context context, UPSNotificationMessage upsNotificationMessage) {
        c.i("vivo_push", "onNotificationMessageClicked", new Object[0]);
    }

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String s11) {
        c.i("vivo_push", "%s", s11);
        i.f().a("vivo", s11);
    }
}
