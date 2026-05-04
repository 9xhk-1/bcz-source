package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static z0 f35746a;

    private static synchronized z0 a() {
        z0 z0Var;
        synchronized (a.class) {
            try {
                if (f35746a == null) {
                    f35746a = q.c().b();
                }
                z0Var = f35746a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z0Var;
    }

    public static void b(int i11, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i11 == 1 || i11 == 0) {
            f35746a.b(i11, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i11);
    }

    public static void c() {
        if (a() == null || !q1.b().a()) {
            return;
        }
        f35746a.a(-1);
    }

    public static void a(int i11, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i11 == 1 || i11 == 0) {
            f35746a.a(i11, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i11);
    }

    public static boolean b() {
        return q.c().a();
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            f35746a.a(context, str, str2);
        }
    }
}
