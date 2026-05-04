package com.huawei.hms.push;

import android.app.Notification;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m {
    public static n a(k kVar) {
        return (kVar.w() < 0 || kVar.w() >= n.values().length) ? n.STYLE_DEFAULT : n.values()[kVar.w()];
    }

    public static void a(Notification.Builder builder, String str, k kVar) {
        Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
        if (!TextUtils.isEmpty(kVar.h())) {
            bigTextStyle.setBigContentTitle(kVar.h());
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            bigTextStyle.bigText(str);
        }
        builder.setStyle(bigTextStyle);
    }
}
