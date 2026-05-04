package com.mob.tools.a;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static g f41298a = new g();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f41299b;

    /* renamed from: c, reason: collision with root package name */
    private volatile f f41300c;

    /* renamed from: d, reason: collision with root package name */
    private volatile f f41301d;

    public static g a(Context context) {
        if (f41298a.f41299b == null && context != null) {
            f41298a.f41299b = context.getApplicationContext();
        }
        return f41298a;
    }

    public f b() {
        if (this.f41301d == null) {
            this.f41301d = new d(this.f41299b);
        }
        return this.f41301d;
    }

    public void a(f fVar) {
        this.f41300c = fVar;
    }

    public f a() {
        if (this.f41300c == null) {
            return b();
        }
        return this.f41300c;
    }
}
