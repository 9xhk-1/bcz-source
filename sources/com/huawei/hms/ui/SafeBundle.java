package com.huawei.hms.ui;

import android.os.Bundle;
import com.huawei.hms.base.ui.LogUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SafeBundle {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f36446a;

    public SafeBundle() {
        this(new Bundle());
    }

    public boolean containsKey(String str) {
        try {
            return this.f36446a.containsKey(str);
        } catch (Throwable unused) {
            LogUtil.e("SafeBundle", "containsKey exception. key:");
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.f36446a.get(str);
        } catch (Exception e11) {
            LogUtil.e("SafeBundle", "get exception: " + e11.getMessage(), true);
            return null;
        }
    }

    public Bundle getBundle() {
        return this.f36446a;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public String getString(String str) {
        try {
            return this.f36446a.getString(str);
        } catch (Throwable th2) {
            LogUtil.e("SafeBundle", "getString exception: " + th2.getMessage(), true);
            return "";
        }
    }

    public boolean isEmpty() {
        try {
            return this.f36446a.isEmpty();
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "isEmpty exception");
            return true;
        }
    }

    public int size() {
        try {
            return this.f36446a.size();
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "size exception");
            return 0;
        }
    }

    public String toString() {
        return this.f36446a.toString();
    }

    public SafeBundle(Bundle bundle) {
        this.f36446a = bundle == null ? new Bundle() : bundle;
    }

    public int getInt(String str, int i11) {
        try {
            return this.f36446a.getInt(str, i11);
        } catch (Throwable th2) {
            LogUtil.e("SafeBundle", "getInt exception: " + th2.getMessage(), true);
            return i11;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f36446a.getString(str, str2);
        } catch (Exception e11) {
            LogUtil.e("SafeBundle", "getString exception: " + e11.getMessage(), true);
            return str2;
        }
    }
}
