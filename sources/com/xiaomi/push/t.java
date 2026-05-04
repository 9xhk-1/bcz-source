package com.xiaomi.push;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.Collection;

/* loaded from: classes8.dex */
public class t {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f46414a;

        /* renamed from: a, reason: collision with other field name */
        private final StringBuilder f1043a;

        /* renamed from: b, reason: collision with root package name */
        private final String f46415b;

        public a() {
            this(":", ",");
        }

        public a a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f1043a.length() > 0) {
                    this.f1043a.append(this.f46415b);
                }
                StringBuilder sb2 = this.f1043a;
                sb2.append(str);
                sb2.append(this.f46414a);
                sb2.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f1043a.toString();
        }

        public a(String str, String str2) {
            this.f1043a = new StringBuilder();
            this.f46414a = str;
            this.f46415b = str2;
        }
    }

    public static int a(String str, int i11) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return i11;
    }

    public static int b(String str, int i11) {
        return !TextUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i11 : i11;
    }

    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService(c6.d.f8118j);
        return powerManager != null && powerManager.isInteractive();
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
