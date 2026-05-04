package com.tencent.open.utils;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static Context f44590a;

    public static final Context a() {
        Context context = f44590a;
        if (context == null) {
            return null;
        }
        return context;
    }

    public static final String b() {
        return a() == null ? "" : a().getPackageName();
    }

    public static final File c() {
        if (a() == null) {
            return null;
        }
        return a().getFilesDir();
    }

    public static final File d() {
        Context a11 = a();
        if (a11 != null) {
            return a11.getCacheDir();
        }
        return null;
    }

    public static final File e() {
        return a((String) null);
    }

    public static final void a(Context context) {
        f44590a = context;
    }

    public static final File a(String str) {
        return m.h(a(), str);
    }
}
