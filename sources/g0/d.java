package g0;

import c40.m0;
import g0.a;
import g0.b;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okio.ByteString;
import okio.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
/* loaded from: classes3.dex */
public final class d implements g0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f52485e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f52486f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f52487g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final long f52488a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f52489b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final okio.b f52490c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g0.b f52491d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache$RealEditor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    public static final class b implements a.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final b.C0621b f52492a;

        public b(@k b.C0621b c0621b) {
            this.f52492a = c0621b;
        }

        @Override // g0.a.b
        public void abort() {
            this.f52492a.a();
        }

        @Override // g0.a.b
        @l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b() {
            return a();
        }

        @Override // g0.a.b
        public void commit() {
            this.f52492a.b();
        }

        @Override // g0.a.b
        @l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a() {
            b.d c11 = this.f52492a.c();
            if (c11 != null) {
                return new c(c11);
            }
            return null;
        }

        @Override // g0.a.b
        @k
        public f getData() {
            return this.f52492a.f(1);
        }

        @Override // g0.a.b
        @k
        public f getMetadata() {
            return this.f52492a.f(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache$RealSnapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    public static final class c implements a.c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final b.d f52493a;

        public c(@k b.d dVar) {
            this.f52493a = dVar;
        }

        @Override // g0.a.c
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b m3() {
            return C7();
        }

        @Override // g0.a.c
        @l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b C7() {
            b.C0621b a11 = this.f52493a.a();
            if (a11 != null) {
                return new b(a11);
            }
            return null;
        }

        @Override // g0.a.c, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f52493a.close();
        }

        @Override // g0.a.c
        @k
        public f getData() {
            return this.f52493a.c(1);
        }

        @Override // g0.a.c
        @k
        public f getMetadata() {
            return this.f52493a.c(0);
        }
    }

    public d(long j11, @k f fVar, @k okio.b bVar, @k m0 m0Var) {
        this.f52488a = j11;
        this.f52489b = fVar;
        this.f52490c = bVar;
        this.f52491d = new g0.b(getFileSystem(), d(), m0Var, a(), 1, 2);
    }

    @Override // g0.a
    public long a() {
        return this.f52488a;
    }

    @Override // g0.a
    public void clear() {
        this.f52491d.Z();
    }

    @Override // g0.a
    @k
    public f d() {
        return this.f52489b;
    }

    @Override // g0.a
    @l
    public a.b f(@k String str) {
        b.C0621b V = this.f52491d.V(j(str));
        if (V != null) {
            return new b(V);
        }
        return null;
    }

    @Override // g0.a
    @l
    public a.c g(@k String str) {
        b.d a02 = this.f52491d.a0(j(str));
        if (a02 != null) {
            return new c(a02);
        }
        return null;
    }

    @Override // g0.a
    @l
    public a.c get(@k String str) {
        return g(str);
    }

    @Override // g0.a
    @k
    public okio.b getFileSystem() {
        return this.f52490c;
    }

    @Override // g0.a
    public long getSize() {
        return this.f52491d.size();
    }

    @Override // g0.a
    @l
    public a.b h(@k String str) {
        return f(str);
    }

    public final String j(String str) {
        return ByteString.Companion.l(str).sha256().hex();
    }

    @Override // g0.a
    public boolean remove(@k String str) {
        return this.f52491d.o0(j(str));
    }
}
