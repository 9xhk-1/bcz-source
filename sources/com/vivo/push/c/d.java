package com.vivo.push.c;

import android.content.Context;
import com.vivo.push.util.ContextDelegate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static volatile d f44935d;

    /* renamed from: a, reason: collision with root package name */
    private b f44936a;

    /* renamed from: b, reason: collision with root package name */
    private c f44937b;

    /* renamed from: c, reason: collision with root package name */
    private Context f44938c;

    private d(Context context) {
        if (this.f44936a == null) {
            this.f44938c = ContextDelegate.getContext(context.getApplicationContext());
            this.f44936a = new e(this.f44938c);
        }
        if (this.f44937b == null) {
            this.f44937b = new a();
        }
    }

    public static d a(Context context) {
        if (f44935d == null) {
            synchronized (d.class) {
                try {
                    if (f44935d == null && context != null) {
                        f44935d = new d(context);
                    }
                } finally {
                }
            }
        }
        return f44935d;
    }

    public final b a() {
        return this.f44936a;
    }
}
