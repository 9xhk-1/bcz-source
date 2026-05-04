package x3;

import j.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import x3.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f97218b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f97219c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f97219c = kVar;
            this.f97218b = j11;
        }

        public static final g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f97218b));
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f97219c.C().c5(2005015635, "SELECT AllBooksRecord.id, AllBooksRecord.payload, AllBooksRecord.localVersion FROM AllBooksRecord WHERE id = ?", mapper, 1, new x00.l() { // from class: x3.j
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = k.a.m(k.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f97219c.C().Y1(new String[]{"AllBooksRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f97219c.C().F6(new String[]{"AllBooksRecord"}, listener);
        }

        public final long n() {
            return this.f97218b;
        }

        @m80.k
        public String toString() {
            return "Books.sq:queryBookById";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f97220b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f97221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f97221c = kVar;
            this.f97220b = j11;
        }

        public static final g2 m(b bVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(bVar.f97220b));
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f97221c.C().c5(1626517458, "SELECT localVersion FROM AllBooksRecord WHERE id = ?", mapper, 1, new x00.l() { // from class: x3.l
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = k.b.m(k.b.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f97221c.C().Y1(new String[]{"AllBooksRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f97221c.C().F6(new String[]{"AllBooksRecord"}, listener);
        }

        public final long n() {
            return this.f97220b;
        }

        @m80.k
        public String toString() {
            return "Books.sq:queryVersionById";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksQueries", f = "BooksQueries.kt", i = {0}, l = {46}, m = "insertOrUpdateRecord", n = {"AllBooksRecord"}, s = {"L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f97222a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f97223b;

        /* renamed from: d, reason: collision with root package name */
        public int f97225d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97223b = obj;
            this.f97225d |= Integer.MIN_VALUE;
            return k.this.Q(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements x00.q<Long, byte[], Long, x3.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f97226a = new d();

        public d() {
            super(3, x3.a.class, "<init>", "<init>(J[BJ)V", 0);
        }

        public final x3.a a(long j11, byte[] p12, long j12) {
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new x3.a(j11, p12, j12);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ x3.a invoke(Long l11, byte[] bArr, Long l12) {
            return a(l11.longValue(), bArr, l12.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final g2 R(x3.a aVar, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(aVar.f()));
        execute.e(1, aVar.h());
        execute.c(2, Long.valueOf(aVar.g()));
        return g2.f100423a;
    }

    public static final g2 S(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("AllBooksRecord");
        return g2.f100423a;
    }

    public static final Object V(x00.q qVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        byte[] bytes = cursor.getBytes(1);
        kotlin.jvm.internal.g0.m(bytes);
        Long l12 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l12);
        return qVar.invoke(l11, bytes, l12);
    }

    public static final long X(l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        return l11.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(@m80.k final x3.a r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof x3.k.c
            if (r0 == 0) goto L13
            r0 = r10
            x3.k$c r0 = (x3.k.c) r0
            int r1 = r0.f97225d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97225d = r1
            goto L18
        L13:
            x3.k$c r0 = new x3.k$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f97223b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f97225d
            r3 = 1615054854(0x6043c806, float:5.643013E19)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f97222a
            x3.a r9 = (x3.a) r9
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
            x3.g r5 = new x3.g
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO AllBooksRecord(id, payload, localVersion)\nVALUES (?, ?, ?)"
            r7 = 3
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f97222a = r9
            r0.f97225d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            x3.h r0 = new x3.h
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.k.Q(x3.a, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<x3.a> T(long j11) {
        return U(j11, d.f97226a);
    }

    @m80.k
    public final <T> j.j<T> U(long j11, @m80.k final x00.q<? super Long, ? super byte[], ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: x3.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object V;
                V = k.V(x00.q.this, (l.d) obj);
                return V;
            }
        });
    }

    @m80.k
    public final j.j<Long> W(long j11) {
        return new b(this, j11, new x00.l() { // from class: x3.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                long X;
                X = k.X((l.d) obj);
                return Long.valueOf(X);
            }
        });
    }
}
