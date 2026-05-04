package b8;

import b8.g;
import j.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f6373b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f6374c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            g0.p(mapper, "mapper");
            this.f6374c = gVar;
            this.f6373b = j11;
        }

        public static final g2 m(a aVar, l.f executeQuery) {
            g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f6373b));
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            g0.p(mapper, "mapper");
            return this.f6374c.C().c5(1202279215, "SELECT Test22.id, Test22.name, Test22.boy, Test22.photo FROM Test22 WHERE id = ?", mapper, 1, new x00.l() { // from class: b8.f
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = g.a.m(g.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f6374c.C().Y1(new String[]{"Test22"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f6374c.C().F6(new String[]{"Test22"}, listener);
        }

        public final long n() {
            return this.f6373b;
        }

        @m80.k
        public String toString() {
            return "Test22.sq:queryById";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.test.Test22Queries", f = "Test22Queries.kt", i = {0}, l = {65}, m = "insertObj", n = {"Test22"}, s = {"L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6375a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6376b;

        /* renamed from: d, reason: collision with root package name */
        public int f6378d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6376b = obj;
            this.f6378d |= Integer.MIN_VALUE;
            return g.this.Q(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements x00.r<Long, String, Boolean, byte[], b8.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6379a = new c();

        public c() {
            super(4, b8.a.class, "<init>", "<init>(JLjava/lang/String;Z[B)V", 0);
        }

        public final b8.a a(long j11, String p12, boolean z11, byte[] bArr) {
            g0.p(p12, "p1");
            return new b8.a(j11, p12, z11, bArr);
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ b8.a invoke(Long l11, String str, Boolean bool, byte[] bArr) {
            return a(l11.longValue(), str, bool.booleanValue(), bArr);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements x00.r<Long, String, Boolean, byte[], b8.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f6380a = new d();

        public d() {
            super(4, b8.a.class, "<init>", "<init>(JLjava/lang/String;Z[B)V", 0);
        }

        public final b8.a a(long j11, String p12, boolean z11, byte[] bArr) {
            g0.p(p12, "p1");
            return new b8.a(j11, p12, z11, bArr);
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ b8.a invoke(Long l11, String str, Boolean bool, byte[] bArr) {
            return a(l11.longValue(), str, bool.booleanValue(), bArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@m80.k l.e driver) {
        super(driver);
        g0.p(driver, "driver");
    }

    public static final g2 R(b8.a aVar, l.f execute) {
        g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(aVar.h()));
        execute.bindString(1, aVar.i());
        execute.a(2, Boolean.valueOf(aVar.g()));
        execute.e(3, aVar.j());
        return g2.f100423a;
    }

    public static final g2 S(x00.l emit) {
        g0.p(emit, "emit");
        emit.invoke("Test22");
        return g2.f100423a;
    }

    public static final Object V(x00.r rVar, l.d cursor) {
        g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        g0.m(l11);
        String string = cursor.getString(1);
        g0.m(string);
        Boolean bool = cursor.getBoolean(2);
        g0.m(bool);
        return rVar.invoke(l11, string, bool, cursor.getBytes(3));
    }

    public static final Object Y(x00.r rVar, l.d cursor) {
        g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        g0.m(l11);
        String string = cursor.getString(1);
        g0.m(string);
        Boolean bool = cursor.getBoolean(2);
        g0.m(bool);
        return rVar.invoke(l11, string, bool, cursor.getBytes(3));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(@m80.k final b8.a r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b8.g.b
            if (r0 == 0) goto L13
            r0 = r10
            b8.g$b r0 = (b8.g.b) r0
            int r1 = r0.f6378d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6378d = r1
            goto L18
        L13:
            b8.g$b r0 = new b8.g$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6376b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6378d
            r3 = -1669768717(0xffffffff9c7959f3, float:-8.2503446E-22)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f6375a
            b8.a r9 = (b8.a) r9
            kotlin.e.n(r10)
            goto L5e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.e.n(r10)
            l.e r10 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            b8.d r5 = new b8.d
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO Test22(id, name, boy, photo)\nVALUES (?, ?, ?, ?)"
            r7 = 4
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f6375a = r9
            r0.f6378d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            b8.e r0 = new b8.e
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.g.Q(b8.a, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<b8.a> T(long j11) {
        return U(j11, c.f6379a);
    }

    @m80.k
    public final <T> j.j<T> U(long j11, @m80.k final x00.r<? super Long, ? super String, ? super Boolean, ? super byte[], ? extends T> mapper) {
        g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: b8.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object V;
                V = g.V(x00.r.this, (l.d) obj);
                return V;
            }
        });
    }

    @m80.k
    public final j.j<b8.a> W() {
        return X(d.f6380a);
    }

    @m80.k
    public final <T> j.j<T> X(@m80.k final x00.r<? super Long, ? super String, ? super Boolean, ? super byte[], ? extends T> mapper) {
        g0.p(mapper, "mapper");
        return j.k.c(1293674874, new String[]{"Test22"}, C(), "Test22.sq", "selectAll", "SELECT Test22.id, Test22.name, Test22.boy, Test22.photo\nFROM Test22", new x00.l() { // from class: b8.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object Y;
                Y = g.Y(x00.r.this, (l.d) obj);
                return Y;
            }
        });
    }
}
