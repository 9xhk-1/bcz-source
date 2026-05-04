package com.igexin.push.a;

import android.app.Activity;
import android.text.TextUtils;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f37308a;

    public static a a() {
        if (f37308a == null) {
            synchronized (a.class) {
                try {
                    if (f37308a == null) {
                        f37308a = new a();
                    }
                } finally {
                }
            }
        }
        return f37308a;
    }

    public static b a(Activity activity) {
        String stringExtra = activity.getIntent().getStringExtra("action");
        if (TextUtils.isEmpty(stringExtra)) {
            activity.finish();
            return null;
        }
        stringExtra.getClass();
        if (stringExtra.equals("popup")) {
            return new g();
        }
        if (stringExtra.equals("com.igexin.action.notification.click")) {
            return new f();
        }
        activity.finish();
        return null;
    }
}
