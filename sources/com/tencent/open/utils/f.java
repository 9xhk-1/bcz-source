package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private String f44587a;

    /* renamed from: b, reason: collision with root package name */
    private String f44588b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static f f44589a = new f();
    }

    public static f a() {
        return a.f44589a;
    }

    public String b(Context context) {
        return this.f44587a;
    }

    public String c(Context context) {
        return this.f44588b;
    }

    private f() {
        this.f44587a = "";
        this.f44588b = "";
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 0);
        String str = this.f44588b;
        if (str == null || str.trim().isEmpty()) {
            this.f44588b = sharedPreferences.getString("build_model", "");
        }
        String str2 = this.f44587a;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f44587a = sharedPreferences.getString("build_device", "");
        }
    }

    public String b() {
        return this.f44588b;
    }

    public void a(Context context, String str) {
        if (str != null && !str.trim().isEmpty()) {
            String str2 = this.f44588b;
            if (str2 == null || !str2.equals(str)) {
                this.f44588b = str;
                if (context != null) {
                    context.getSharedPreferences("device_info_file", 0).edit().putString("build_model", this.f44588b).apply();
                    return;
                }
                return;
            }
            return;
        }
        this.f44588b = "";
        if (context != null) {
            context.getSharedPreferences("device_info_file", 0).edit().remove("build_model").apply();
        }
    }
}
