package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f36879a;

    private b(SharedPreferences sharedPreferences) {
        this.f36879a = sharedPreferences;
    }

    public long a(String str, long j11) {
        try {
            return this.f36879a.getLong(str, j11);
        } catch (Exception unused) {
            return j11;
        }
    }

    public void b(String str, long j11) {
        try {
            SharedPreferences.Editor edit = this.f36879a.edit();
            edit.putLong(str, j11);
            edit.commit();
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("SharedPreferencesWrapper", "putLong error!!key:" + str, e11);
        }
    }

    public static b a(String str, Context context) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("SharedPreferencesWrapper", "getSharedPreference error");
            sharedPreferences = null;
        }
        return new b(sharedPreferences);
    }

    public void b(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.f36879a.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("SharedPreferencesWrapper", "putString error!!key:" + str, e11);
        }
    }

    public String a(String str, String str2) {
        try {
            return this.f36879a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public void a(String str) {
        try {
            if (this.f36879a.contains(str)) {
                SharedPreferences.Editor edit = this.f36879a.edit();
                edit.remove(str);
                edit.commit();
            }
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("SharedPreferencesWrapper", "remove error!!key:" + str);
        }
    }
}
