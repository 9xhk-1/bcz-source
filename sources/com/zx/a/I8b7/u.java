package com.zx.a.I8b7;

import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f46705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f46707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f46708d;

    public u(v vVar, File file, String str, File file2, File file3) {
        this.f46705a = file;
        this.f46706b = str;
        this.f46707c = file2;
        this.f46708d = file3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(1000L);
            this.f46705a.delete();
            new File(this.f46706b).delete();
            this.f46707c.delete();
            this.f46708d.delete();
            m0.a(this.f46708d);
        } catch (Throwable th2) {
            r2.a(th2);
        }
    }
}
