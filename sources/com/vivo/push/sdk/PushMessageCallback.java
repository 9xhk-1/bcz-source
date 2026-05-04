package com.vivo.push.sdk;

import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.model.UnvarnishedMessage;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface PushMessageCallback {
    boolean isAllowNet(Context context);

    void onBind(Context context, int i11, String str);

    void onDelAlias(Context context, int i11, List<String> list, List<String> list2, String str);

    void onDelTags(Context context, int i11, List<String> list, List<String> list2, String str);

    void onListTags(Context context, int i11, List<String> list, String str);

    void onLog(Context context, String str, int i11, boolean z11);

    boolean onNotificationMessageArrived(Context context, UPSNotificationMessage uPSNotificationMessage);

    void onNotificationMessageClicked(Context context, UPSNotificationMessage uPSNotificationMessage);

    void onPublish(Context context, int i11, String str);

    void onReceiveRegId(Context context, String str);

    void onSetAlias(Context context, int i11, List<String> list, List<String> list2, String str);

    void onSetTags(Context context, int i11, List<String> list, List<String> list2, String str);

    void onTransmissionMessage(Context context, UnvarnishedMessage unvarnishedMessage);

    void onUnBind(Context context, int i11, String str);
}
