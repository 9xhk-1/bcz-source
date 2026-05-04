package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f31606a = "lge";

    /* renamed from: b, reason: collision with root package name */
    public static final String f31607b = "samsung";

    /* renamed from: c, reason: collision with root package name */
    public static final String f31608c = "meizu";

    @NonNull
    public static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return c() || e();
    }

    public static boolean c() {
        return a().equals(f31606a);
    }

    public static boolean d() {
        return a().equals("meizu");
    }

    public static boolean e() {
        return a().equals(f31607b);
    }
}
