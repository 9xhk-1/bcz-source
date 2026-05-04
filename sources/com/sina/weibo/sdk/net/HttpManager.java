package com.sina.weibo.sdk.net;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class HttpManager {
    static {
        System.loadLibrary("weibosdkcore");
    }

    public static String a(Context context, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty("")) {
            sb2.append("");
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
        }
        return calcOauthSignNative(context, sb2.toString(), str3);
    }

    private static native String calcOauthSignNative(Context context, String str, String str2);
}
