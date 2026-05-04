package n0;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import l60.m;
import m80.k;
import m80.l;
import okhttp3.h;
import okhttp3.j;
import okhttp3.n;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f73929a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f73930b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73931c;

    /* renamed from: d, reason: collision with root package name */
    public final long f73932d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f73933e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h f73934f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: n0.a$a, reason: collision with other inner class name */
    public static final class C0896a extends Lambda implements x00.a<okhttp3.c> {
        public C0896a() {
            super(0);
        }

        @Override // x00.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final okhttp3.c invoke() {
            return okhttp3.c.f77156n.c(a.this.d());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<j> {
        public b() {
            super(0);
        }

        @Override // x00.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            String d11 = a.this.d().d("Content-Type");
            if (d11 != null) {
                return j.f77447e.d(d11);
            }
            return null;
        }
    }

    public a(@k m mVar) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f73929a = e0.b(lazyThreadSafetyMode, new C0896a());
        this.f73930b = e0.b(lazyThreadSafetyMode, new b());
        this.f73931c = Long.parseLong(mVar.L5());
        this.f73932d = Long.parseLong(mVar.L5());
        this.f73933e = Integer.parseInt(mVar.L5()) > 0;
        int parseInt = Integer.parseInt(mVar.L5());
        h.a aVar = new h.a();
        for (int i11 = 0; i11 < parseInt; i11++) {
            u0.l.d(aVar, mVar.L5());
        }
        this.f73934f = aVar.i();
    }

    @k
    public final okhttp3.c a() {
        return (okhttp3.c) this.f73929a.getValue();
    }

    @l
    public final j b() {
        return (j) this.f73930b.getValue();
    }

    public final long c() {
        return this.f73932d;
    }

    @k
    public final h d() {
        return this.f73934f;
    }

    public final long e() {
        return this.f73931c;
    }

    public final boolean f() {
        return this.f73933e;
    }

    public final void g(@k l60.l lVar) {
        lVar.Q1(this.f73931c).writeByte(10);
        lVar.Q1(this.f73932d).writeByte(10);
        lVar.Q1(this.f73933e ? 1L : 0L).writeByte(10);
        lVar.Q1(this.f73934f.size()).writeByte(10);
        int size = this.f73934f.size();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.n5(this.f73934f.h(i11)).n5(": ").n5(this.f73934f.o(i11)).writeByte(10);
        }
    }

    public a(@k n nVar) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f73929a = e0.b(lazyThreadSafetyMode, new C0896a());
        this.f73930b = e0.b(lazyThreadSafetyMode, new b());
        this.f73931c = nVar.C0();
        this.f73932d = nVar.z0();
        this.f73933e = nVar.c0() != null;
        this.f73934f = nVar.k0();
    }
}
