package com.tencent.open.b;

import com.tencent.open.utils.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f {
    public static int a(String str) {
        int a11;
        if (com.tencent.open.utils.g.a() == null || (a11 = i.a(com.tencent.open.utils.g.a(), str).a("Common_BusinessReportFrequency")) == 0) {
            return 100;
        }
        return a11;
    }

    public static int a() {
        int a11 = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_HttpRetryCount");
        if (a11 == 0) {
            return 2;
        }
        return a11;
    }
}
