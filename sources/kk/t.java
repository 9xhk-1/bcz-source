package kk;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import gl.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class t<Z> implements u<Z>, a.f {

    /* renamed from: e, reason: collision with root package name */
    public static final Pools.Pool<t<?>> f66809e = gl.a.e(20, new a());

    /* renamed from: a, reason: collision with root package name */
    public final gl.c f66810a = gl.c.a();

    /* renamed from: b, reason: collision with root package name */
    public u<Z> f66811b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f66812c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f66813d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.d<t<?>> {
        @Override // gl.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t<?> create() {
            return new t<>();
        }
    }

    @NonNull
    public static <Z> t<Z> c(u<Z> uVar) {
        t<Z> tVar = (t) fl.m.e(f66809e.acquire());
        tVar.b(uVar);
        return tVar;
    }

    private void e() {
        this.f66811b = null;
        f66809e.release(this);
    }

    @Override // kk.u
    @NonNull
    public Class<Z> a() {
        return this.f66811b.a();
    }

    public final void b(u<Z> uVar) {
        this.f66813d = false;
        this.f66812c = true;
        this.f66811b = uVar;
    }

    @Override // gl.a.f
    @NonNull
    public gl.c d() {
        return this.f66810a;
    }

    public synchronized void f() {
        this.f66810a.c();
        if (!this.f66812c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f66812c = false;
        if (this.f66813d) {
            recycle();
        }
    }

    @Override // kk.u
    @NonNull
    public Z get() {
        return this.f66811b.get();
    }

    @Override // kk.u
    public int getSize() {
        return this.f66811b.getSize();
    }

    @Override // kk.u
    public synchronized void recycle() {
        this.f66810a.c();
        this.f66813d = true;
        if (!this.f66812c) {
            this.f66811b.recycle();
            e();
        }
    }
}
