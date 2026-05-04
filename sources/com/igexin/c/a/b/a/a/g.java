package com.igexin.c.a.b.a.a;

import android.text.TextUtils;
import com.igexin.c.a.b.a.a.a;
import java.util.concurrent.locks.Lock;

/* loaded from: classes7.dex */
public final class g extends a {
    private static final String P = "GS-W";

    /* renamed from: a, reason: collision with root package name */
    public static final int f37119a = -2036;

    /* renamed from: j, reason: collision with root package name */
    com.igexin.c.a.b.a.a.a.c f37120j;

    /* renamed from: k, reason: collision with root package name */
    protected com.igexin.c.a.b.d f37121k;

    /* renamed from: l, reason: collision with root package name */
    protected i f37122l;

    public g(i iVar, com.igexin.c.a.b.d dVar) {
        super(-2036, dVar);
        this.f37121k = dVar;
        this.f37122l = iVar;
    }

    @Override // com.igexin.c.a.b.f, com.igexin.c.a.d.f, com.igexin.c.a.d.a.a
    public final void a() {
        super.a();
        com.igexin.c.a.c.a.a(P, "wt dispose");
        com.igexin.c.a.c.a.a("GS-W|wt dispose", new Object[0]);
        if (this.f37120j != null) {
            if (this.f37080g != a.EnumC0460a.f37084b) {
                this.f37120j.a();
            } else if (!TextUtils.isEmpty(this.f37081h)) {
                this.f37120j.a(new Exception(this.f37081h));
            }
        }
        this.f37120j = null;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void b_() throws Exception {
        Lock lock;
        super.b_();
        Thread currentThread = Thread.currentThread();
        com.igexin.c.a.c.a.a("GS-W|" + currentThread + " running", new Object[0]);
        d a11 = d.a();
        while (this.f37082i && !currentThread.isInterrupted() && !this.f37079f) {
            try {
                a11.f37100g.lock();
                if (a11.f37103k.isEmpty() && this.f37082i) {
                    a11.f37101h.await();
                }
                f poll = a11.f37103k.poll();
                if (poll != null && this.f37082i && this.f37122l != null && this.f37082i) {
                    this.f37080g = a.EnumC0460a.f37083a;
                    if (this.f37120j != null && this.f37082i) {
                        this.f37120j.a(poll);
                    }
                    Object obj = poll.f37164d;
                    if (obj != null) {
                        i iVar = this.f37122l;
                        byte[] bArr = (byte[]) this.f37121k.a(null, obj);
                        iVar.f37124a.write(bArr, 0, bArr.length);
                        iVar.f37124a.flush();
                    }
                    if (poll.f37164d != null) {
                        com.igexin.c.a.c.a.a("GS-W|" + poll.f37164d.getClass().getName() + " -- send success", new Object[0]);
                    }
                }
                lock = a11.f37100g;
            } finally {
                try {
                    try {
                        lock.unlock();
                    } catch (Exception e11) {
                        com.igexin.c.a.c.a.a(e11);
                    }
                } catch (Throwable th2) {
                }
            }
            lock.unlock();
        }
        this.f37079f = true;
        com.igexin.c.a.c.a.a("GS-W|finish ~~~~~~", new Object[0]);
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return -2036;
    }

    @Override // com.igexin.c.a.b.a.a.a
    public final void c_() {
        this.f37082i = false;
        this.f37080g = a.EnumC0460a.f37085c;
        d a11 = d.a();
        try {
            try {
                if (!this.f37079f) {
                    a11.f37100g.lock();
                    a11.f37101h.signalAll();
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                com.igexin.c.a.c.a.a(P, e11.toString());
                try {
                    a11.f37100g.unlock();
                } catch (Exception e12) {
                    com.igexin.c.a.c.a.a(e12);
                }
            }
        } finally {
            try {
                a11.f37100g.unlock();
            } catch (Exception e13) {
                com.igexin.c.a.c.a.a(e13);
            }
        }
    }

    private void a(com.igexin.c.a.b.a.a.a.c cVar) {
        this.f37120j = cVar;
    }
}
