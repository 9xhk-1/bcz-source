package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static b f10373a = new b();

    /* renamed from: b, reason: collision with root package name */
    public Thread f10374b = null;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList<Runnable> f10375c = new LinkedList<>();

    public static b a() {
        return f10373a;
    }

    public static /* synthetic */ Thread b(b bVar) {
        bVar.f10374b = null;
        return null;
    }

    public final synchronized void a(Runnable runnable) {
        this.f10375c.add(runnable);
        if (this.f10374b == null) {
            Thread thread = new Thread(new c(this));
            this.f10374b = thread;
            thread.start();
        }
    }
}
