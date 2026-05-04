package com.tencent.liteav.basic.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.liteav.basic.log.TXCLog;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    protected static volatile g f43446a;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f43448c;

    /* renamed from: e, reason: collision with root package name */
    private Context f43450e;

    /* renamed from: b, reason: collision with root package name */
    private final String f43447b = "TXCSpUtil";

    /* renamed from: d, reason: collision with root package name */
    private final Object f43449d = new Object();

    private g() {
    }

    public static g a() {
        if (f43446a == null) {
            synchronized (g.class) {
                try {
                    if (f43446a == null) {
                        f43446a = new g();
                    }
                } finally {
                }
            }
        }
        return f43446a;
    }

    public boolean b(String str, boolean z11) {
        Context context = this.f43450e;
        try {
            synchronized (this.f43449d) {
                try {
                    if (this.f43448c == null && context != null) {
                        this.f43448c = context.getSharedPreferences("liteav_hw_encoder_config", 0);
                    }
                    SharedPreferences sharedPreferences = this.f43448c;
                    if (sharedPreferences == null) {
                        return z11;
                    }
                    return sharedPreferences.getBoolean(str, z11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            TXCLog.e("TXCSpUtil", "saveConfigInfo: error: " + str + j2.O + z11 + " ; " + e11);
            return z11;
        }
    }

    public void a(Context context) {
        this.f43450e = context.getApplicationContext();
    }

    public void a(String str, boolean z11) {
        Context context = this.f43450e;
        try {
            synchronized (this.f43449d) {
                try {
                    if (this.f43448c == null && context != null) {
                        this.f43448c = context.getSharedPreferences("liteav_hw_encoder_config", 0);
                    }
                    SharedPreferences sharedPreferences = this.f43448c;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putBoolean(str, z11).commit();
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            TXCLog.e("TXCSpUtil", "saveConfigInfo: error: " + str + j2.O + z11 + " ; " + e11);
        }
    }
}
