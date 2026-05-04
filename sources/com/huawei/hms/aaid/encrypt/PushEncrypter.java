package com.huawei.hms.aaid.encrypt;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.c;
import pr.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : a.k(str, c.b(context));
    }

    public static String encrypter(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : a.t(str, c.b(context));
    }

    public static String encrypterOld(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : a.v(str, c.a(context));
    }
}
