package com.mob.secverify.c;

import android.text.TextUtils;
import com.mob.MobSDK;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {
    public static String a(int i11) {
        return i11 == 1 ? MobSDK.checkRequestUrl(a("http://api.verify.mob.com")) : i11 == 2 ? MobSDK.checkRequestUrl(a("http://cache.verify.mob.com")) : i11 == 3 ? MobSDK.checkRequestUrl(a("http://cdn-api-verify.mob.com")) : i11 == 4 ? MobSDK.checkRequestUrl(a("http://log-verify.mob.com")) : MobSDK.checkRequestUrl(a("http://api.verify.mob.com"));
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str) || str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }
}
