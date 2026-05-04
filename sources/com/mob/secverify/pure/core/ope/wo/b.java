package com.mob.secverify.pure.core.ope.wo;

import android.content.Context;
import com.mob.secverify.pure.core.ope.wo.core.c;
import com.mob.secverify.pure.core.ope.wo.listener.ResultListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f41058a;

    /* renamed from: b, reason: collision with root package name */
    private Context f41059b;

    public static b a() {
        if (f41058a == null) {
            synchronized (b.class) {
                try {
                    if (f41058a == null) {
                        f41058a = new b();
                    }
                } finally {
                }
            }
        }
        return f41058a;
    }

    public boolean a(Context context, String str, String str2) {
        this.f41059b = context;
        com.mob.secverify.pure.core.ope.wo.a.b.a(str);
        com.mob.secverify.pure.core.ope.wo.a.b.b(str2);
        c.a().a(this.f41059b, str, str2);
        return true;
    }

    public void a(int i11, ResultListener resultListener) {
        c.a().a(this.f41059b, i11, 1, resultListener);
    }
}
