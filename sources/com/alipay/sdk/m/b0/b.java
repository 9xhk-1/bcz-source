package com.alipay.sdk.m.b0;

import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {
    public static String a(String str) {
        String str2;
        try {
            str2 = f.a(str);
        } catch (Throwable unused) {
            str2 = "";
        }
        if (!com.alipay.sdk.m.z.a.a(str2)) {
            return str2;
        }
        return c.a(".SystemConfig" + File.separator + str);
    }
}
