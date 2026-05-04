package com.mob.secverify.pure.b;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.utils.SharePrefrenceHelper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected static SharePrefrenceHelper f40740a;

    static {
        try {
            SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
            f40740a = sharePrefrenceHelper;
            sharePrefrenceHelper.open("Sec_Pure_Cache", 1);
        } catch (Throwable unused) {
        }
    }

    public static String a(String str, String str2) {
        return f40740a.getString(str, str2);
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            f40740a.remove(str);
        } else {
            f40740a.putString(str, str2);
        }
    }

    public static long a(String str, long j11) {
        return f40740a.getLong(str, j11);
    }
}
