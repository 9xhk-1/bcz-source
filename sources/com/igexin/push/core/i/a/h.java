package com.igexin.push.core.i.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    final com.igexin.push.core.i.a.d f38228a;

    /* renamed from: b, reason: collision with root package name */
    final List<b> f38229b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38230c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38231d;

    /* renamed from: e, reason: collision with root package name */
    a f38232e;

    /* renamed from: f, reason: collision with root package name */
    boolean f38233f;

    /* renamed from: g, reason: collision with root package name */
    a f38234g;

    /* renamed from: h, reason: collision with root package name */
    Bitmap f38235h;

    /* renamed from: i, reason: collision with root package name */
    public a f38236i;

    /* renamed from: j, reason: collision with root package name */
    int f38237j;

    /* renamed from: k, reason: collision with root package name */
    int f38238k;

    /* renamed from: l, reason: collision with root package name */
    int f38239l;

    /* renamed from: m, reason: collision with root package name */
    private final Handler f38240m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f38241n;

    /* renamed from: o, reason: collision with root package name */
    private d f38242o;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f38243a;

        /* renamed from: b, reason: collision with root package name */
        Bitmap f38244b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f38245c;

        /* renamed from: d, reason: collision with root package name */
        private final long f38246d;

        public a(Handler handler, int i11, long j11) {
            this.f38245c = handler;
            this.f38243a = i11;
            this.f38246d = j11;
        }

        private Bitmap a() {
            return this.f38244b;
        }

        private void b() {
            this.f38244b = null;
        }

        public final void a(Bitmap bitmap) {
            this.f38244b = bitmap;
            this.f38245c.sendMessageAtTime(this.f38245c.obtainMessage(1, this), this.f38246d);
        }
    }

    public interface b {
        void b();
    }

    public class c implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        static final int f38247a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f38248b = 2;

        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            try {
                h.this.a((a) message.obj);
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
            return true;
        }
    }

    public interface d {
        void a();
    }

    public h(com.igexin.push.core.i.a.d dVar, Bitmap bitmap) {
        this(dVar, bitmap, (byte) 0);
    }

    private Bitmap c() {
        return this.f38235h;
    }

    private int d() {
        return this.f38238k;
    }

    private int e() {
        return this.f38239l;
    }

    private int f() {
        return this.f38228a.m() + this.f38237j;
    }

    private int g() {
        a aVar = this.f38232e;
        if (aVar != null) {
            return aVar.f38243a;
        }
        return -1;
    }

    private ByteBuffer h() {
        return this.f38228a.c().asReadOnlyBuffer();
    }

    private int i() {
        return this.f38228a.l();
    }

    private void j() {
        if (this.f38230c) {
            return;
        }
        this.f38230c = true;
        this.f38233f = false;
        n();
    }

    private void k() {
        this.f38230c = false;
    }

    private void l() {
        this.f38229b.clear();
        b();
        this.f38230c = false;
        if (this.f38232e != null) {
            this.f38232e = null;
        }
        if (this.f38234g != null) {
            this.f38234g = null;
        }
        if (this.f38236i != null) {
            this.f38236i = null;
        }
        this.f38228a.o();
        this.f38233f = true;
    }

    private Bitmap m() {
        a aVar = this.f38232e;
        return aVar != null ? aVar.f38244b : this.f38235h;
    }

    private void n() {
        if (!this.f38230c || this.f38241n) {
            return;
        }
        if (this.f38231d) {
            k.a(this.f38236i == null, "Pending target must be null when starting from the first frame");
            this.f38228a.i();
            this.f38231d = false;
        }
        a aVar = this.f38236i;
        if (aVar != null) {
            this.f38236i = null;
            a(aVar);
            return;
        }
        this.f38241n = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f38228a.f();
        this.f38228a.e();
        this.f38234g = new a(this.f38240m, this.f38228a.h(), uptimeMillis);
        Bitmap n11 = this.f38228a.n();
        k.a(n11 != null, "nextFrame is null");
        this.f38234g.a(n11);
    }

    private void o() {
        k.a(!this.f38230c, "Can't restart a running animation");
        this.f38231d = true;
        if (this.f38236i != null) {
            this.f38236i = null;
        }
    }

    public final int a() {
        return this.f38228a.g();
    }

    public final void b() {
        if (this.f38235h != null) {
            this.f38235h = null;
        }
    }

    private h(com.igexin.push.core.i.a.d dVar, Bitmap bitmap, byte b11) {
        this.f38229b = new ArrayList();
        this.f38240m = new Handler(Looper.getMainLooper(), new c());
        this.f38228a = dVar;
        this.f38235h = (Bitmap) k.a(bitmap);
        this.f38237j = k.a(bitmap);
        this.f38238k = bitmap.getWidth();
        this.f38239l = bitmap.getHeight();
    }

    private void a(Bitmap bitmap) {
        this.f38235h = (Bitmap) k.a(bitmap);
        this.f38237j = k.a(bitmap);
        this.f38238k = bitmap.getWidth();
        this.f38239l = bitmap.getHeight();
    }

    public final void b(b bVar) {
        this.f38229b.remove(bVar);
        if (this.f38229b.isEmpty()) {
            this.f38230c = false;
        }
    }

    public final void a(a aVar) {
        this.f38241n = false;
        if (!this.f38233f) {
            if (this.f38230c) {
                if (aVar.f38244b != null) {
                    b();
                    a aVar2 = this.f38232e;
                    this.f38232e = aVar;
                    for (int size = this.f38229b.size() - 1; size >= 0; size--) {
                        this.f38229b.get(size).b();
                    }
                    if (aVar2 != null) {
                        this.f38240m.obtainMessage(2, aVar2).sendToTarget();
                    }
                }
                n();
                return;
            }
            if (!this.f38231d) {
                this.f38236i = aVar;
                return;
            }
        }
        this.f38240m.obtainMessage(2, aVar).sendToTarget();
    }

    public final void a(b bVar) {
        if (this.f38233f) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f38229b.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f38229b.isEmpty();
        this.f38229b.add(bVar);
        if (isEmpty) {
            j();
        }
    }
}
