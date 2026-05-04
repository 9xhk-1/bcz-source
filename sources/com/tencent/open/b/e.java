package com.tencent.open.b;

import com.tencent.open.utils.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    protected static e f44467a;

    public void a(int i11, String str, String str2, String str3, String str4, Long l11, int i12, int i13, String str5) {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f44467a == null) {
                    f44467a = new e();
                }
                eVar = f44467a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        h.a().a(m.a(str, str3, str4, str5, str2, str6), str2, true);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        h.a().a(m.a(str, str4, str5, str3, str2, str6, "", str7, str8, "", "", ""), str2, false);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        h.a().a(m.a(str, str4, str5, str3, str2, str6, str7, "", "", str8, str9, str10), str2, false);
    }
}
