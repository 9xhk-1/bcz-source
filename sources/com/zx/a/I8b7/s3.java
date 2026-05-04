package com.zx.a.I8b7;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class s3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f46686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3 f46687b;

    public s3(t3 t3Var, Context context) {
        this.f46687b = t3Var;
        this.f46686a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m3.a(this.f46686a);
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXCore init failed: "));
            this.f46687b.f46703b.set(false);
        }
    }
}
