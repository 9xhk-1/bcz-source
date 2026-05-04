package com.alipay.sdk.m.m0;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.sdk.m.l0.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f10844a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f10845b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f10846c = null;

    /* renamed from: d, reason: collision with root package name */
    public Context f10847d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10848e;

    public a(Context context, String str, String str2, boolean z11, boolean z12) {
        this.f10845b = null;
        this.f10848e = z12;
        this.f10844a = str2;
        this.f10847d = context;
        if (context != null) {
            this.f10845b = context.getSharedPreferences(str2, 0);
        }
    }

    private void b() {
        SharedPreferences sharedPreferences;
        if (this.f10846c != null || (sharedPreferences = this.f10845b) == null) {
            return;
        }
        this.f10846c = sharedPreferences.edit();
    }

    public void a(String str, String str2) {
        if (f.m5632a(str) || str.equals("t")) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.f10846c;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }

    public void b(String str) {
        if (f.m5632a(str) || str.equals("t")) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.f10846c;
        if (editor != null) {
            editor.remove(str);
        }
    }

    public boolean a() {
        boolean z11;
        Context context;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f10846c;
        if (editor != null) {
            if (!this.f10848e && this.f10845b != null) {
                editor.putLong("t", currentTimeMillis);
            }
            if (!this.f10846c.commit()) {
                z11 = false;
                if (this.f10845b != null && (context = this.f10847d) != null) {
                    this.f10845b = context.getSharedPreferences(this.f10844a, 0);
                }
                return z11;
            }
        }
        z11 = true;
        if (this.f10845b != null) {
            this.f10845b = context.getSharedPreferences(this.f10844a, 0);
        }
        return z11;
    }

    public String a(String str) {
        SharedPreferences sharedPreferences = this.f10845b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!f.m5632a(string)) {
                return string;
            }
        }
        return "";
    }
}
