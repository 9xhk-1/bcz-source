package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public class bv {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bv f45318a;

    /* renamed from: a, reason: collision with other field name */
    private Context f181a;

    private bv(Context context) {
        this.f181a = context;
    }

    public synchronized long a(String str, String str2, long j11) {
        try {
        } catch (Throwable unused) {
            return j11;
        }
        return this.f181a.getSharedPreferences(str, 4).getLong(str2, j11);
    }

    public static bv a(Context context) {
        if (f45318a == null) {
            synchronized (bv.class) {
                try {
                    if (f45318a == null) {
                        f45318a = new bv(context);
                    }
                } finally {
                }
            }
        }
        return f45318a;
    }

    public synchronized String a(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f181a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m5763a(String str, String str2, long j11) {
        SharedPreferences.Editor edit = this.f181a.getSharedPreferences(str, 4).edit();
        edit.putLong(str2, j11);
        edit.commit();
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m5764a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.f181a.getSharedPreferences(str, 4).edit();
        edit.putString(str2, str3);
        edit.commit();
    }
}
