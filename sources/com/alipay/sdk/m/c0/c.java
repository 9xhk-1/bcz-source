package com.alipay.sdk.m.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f10509a;

    public c(b bVar) {
        this.f10509a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10509a.b();
        } catch (Exception e11) {
            d.a(e11);
        }
    }
}
