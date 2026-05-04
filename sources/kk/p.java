package kk;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class p<Z> implements u<Z> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f66796a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66797b;

    /* renamed from: c, reason: collision with root package name */
    public final u<Z> f66798c;

    /* renamed from: d, reason: collision with root package name */
    public final a f66799d;

    /* renamed from: e, reason: collision with root package name */
    public final ik.b f66800e;

    /* renamed from: f, reason: collision with root package name */
    public int f66801f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f66802g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void c(ik.b bVar, p<?> pVar);
    }

    public p(u<Z> uVar, boolean z11, boolean z12, ik.b bVar, a aVar) {
        this.f66798c = (u) fl.m.e(uVar);
        this.f66796a = z11;
        this.f66797b = z12;
        this.f66800e = bVar;
        this.f66799d = (a) fl.m.e(aVar);
    }

    @Override // kk.u
    @NonNull
    public Class<Z> a() {
        return this.f66798c.a();
    }

    public synchronized void b() {
        if (this.f66802g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f66801f++;
    }

    public u<Z> c() {
        return this.f66798c;
    }

    public boolean d() {
        return this.f66796a;
    }

    public void e() {
        boolean z11;
        synchronized (this) {
            int i11 = this.f66801f;
            if (i11 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z11 = true;
            int i12 = i11 - 1;
            this.f66801f = i12;
            if (i12 != 0) {
                z11 = false;
            }
        }
        if (z11) {
            this.f66799d.c(this.f66800e, this);
        }
    }

    @Override // kk.u
    @NonNull
    public Z get() {
        return this.f66798c.get();
    }

    @Override // kk.u
    public int getSize() {
        return this.f66798c.getSize();
    }

    @Override // kk.u
    public synchronized void recycle() {
        if (this.f66801f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f66802g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f66802g = true;
        if (this.f66797b) {
            this.f66798c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f66796a + ", listener=" + this.f66799d + ", key=" + this.f66800e + ", acquired=" + this.f66801f + ", isRecycled=" + this.f66802g + ", resource=" + this.f66798c + l50.b.f69928j;
    }
}
