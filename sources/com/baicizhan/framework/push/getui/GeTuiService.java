package com.baicizhan.framework.push.getui;

import android.content.Context;
import com.google.android.material.timepicker.TimeModel;
import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTTransmitMessage;
import oc.i;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class GeTuiService extends GTIntentService {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17802a = "getui_push";

    @Override // com.igexin.sdk.GTIntentService
    public void onNotificationMessageArrived(Context context, GTNotificationMessage gtNotificationMessage) {
        c.i("getui_push", "[%s, %s, %s]", gtNotificationMessage.getTitle(), gtNotificationMessage.getContent(), gtNotificationMessage.getMessageId());
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onNotificationMessageClicked(Context context, GTNotificationMessage gtNotificationMessage) {
        c.i("getui_push", "[%s, %s, %s]", gtNotificationMessage.getTitle(), gtNotificationMessage.getContent(), gtNotificationMessage.getMessageId());
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveClientId(Context context, String s11) {
        c.i("getui_push", "%s", s11);
        i.f().a("getui", s11);
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveCommandResult(Context context, GTCmdMessage gtCmdMessage) {
        c.i("getui_push", TimeModel.f32588i, Integer.valueOf(gtCmdMessage.getAction()));
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveMessageData(Context context, GTTransmitMessage gtTransmitMessage) {
        c.i("getui_push", "%s", gtTransmitMessage.toString());
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveOnlineState(Context context, boolean b11) {
        c.i("getui_push", "%b", Boolean.valueOf(b11));
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveServicePid(Context context, int i11) {
        c.i("getui_push", TimeModel.f32588i, Integer.valueOf(i11));
    }
}
