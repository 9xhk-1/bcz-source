package com.igexin.c.a.b.a.a;

import android.text.TextUtils;
import com.igexin.c.a.b.a.a.a;

/* loaded from: classes7.dex */
public final class e extends a {
    private static final String P = "GS-R";

    /* renamed from: a, reason: collision with root package name */
    public static final int f37113a = -2035;
    private byte[] Q;

    /* renamed from: j, reason: collision with root package name */
    protected h f37114j;

    /* renamed from: k, reason: collision with root package name */
    com.igexin.c.a.b.a.a.a.b f37115k;

    /* renamed from: l, reason: collision with root package name */
    protected com.igexin.c.a.b.d f37116l;

    public e(h hVar, com.igexin.c.a.b.d dVar) {
        super(-2035, dVar);
        this.f37116l = dVar;
        this.f37114j = hVar;
    }

    @Override // com.igexin.c.a.b.f, com.igexin.c.a.d.f, com.igexin.c.a.d.a.a
    public final void a() {
        super.a();
        com.igexin.c.a.c.a.a(P, "rt dispose");
        com.igexin.c.a.c.a.a("GS-R|rt dispose", new Object[0]);
        if (this.f37115k != null) {
            if (this.f37080g != a.EnumC0460a.f37084b) {
                this.f37115k.a();
            } else if (!TextUtils.isEmpty(this.f37081h)) {
                this.f37115k.a(new Exception(this.f37081h));
            }
        }
        if (this.Q != null) {
            this.Q = null;
        }
        this.f37115k = null;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void b_() throws Exception {
        super.b_();
        Thread currentThread = Thread.currentThread();
        com.igexin.c.a.c.a.a("GS-R|" + currentThread + " running", new Object[0]);
        while (this.f37082i && !currentThread.isInterrupted() && !this.f37079f) {
            try {
                com.igexin.c.a.d.a.e b11 = this.f37116l.b(null, this.f37114j);
                if (b11 != null) {
                    com.igexin.c.a.b.e.a().a(b11);
                    com.igexin.c.a.b.e.a().b();
                } else {
                    com.igexin.c.a.c.a.a(P, "read error data");
                    com.igexin.c.a.c.a.a("GS-R|read error data", new Object[0]);
                }
                this.f37080g = a.EnumC0460a.f37083a;
            } catch (Throwable th2) {
                this.f37082i = false;
                if (this.f37080g != a.EnumC0460a.f37085c) {
                    this.f37080g = a.EnumC0460a.f37084b;
                    this.f37081h = (th2.getMessage() == null || !th2.getMessage().equals("read = -1, end of stream !")) ? th2.toString() : "end of stream";
                }
                com.igexin.c.a.c.a.a(th2);
            }
        }
        currentThread.isInterrupted();
        this.f37079f = true;
        com.igexin.c.a.c.a.a("GS-R|finish ~~~~~~", new Object[0]);
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return -2035;
    }

    @Override // com.igexin.c.a.b.a.a.a
    public final void c_() {
        this.f37082i = false;
        this.f37080g = a.EnumC0460a.f37085c;
    }

    private void a(com.igexin.c.a.b.a.a.a.b bVar) {
        this.f37115k = bVar;
    }
}
