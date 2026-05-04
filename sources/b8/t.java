package b8;

import b8.t;
import j.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f6392b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f6393c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            g0.p(mapper, "mapper");
            this.f6393c = tVar;
            this.f6392b = j11;
        }

        public static final g2 m(a aVar, l.f executeQuery) {
            g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f6392b));
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            g0.p(mapper, "mapper");
            return this.f6393c.C().c5(525732302, "SELECT TestStudent.id, TestStudent.name, TestStudent.age FROM TestStudent WHERE id = ?", mapper, 1, new x00.l() { // from class: b8.s
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = t.a.m(t.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f6393c.C().Y1(new String[]{"TestStudent"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f6393c.C().F6(new String[]{"TestStudent"}, listener);
        }

        public final long n() {
            return this.f6392b;
        }

        @m80.k
        public String toString() {
            return "TestStudent.sq:queryById";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f6394b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f6395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            g0.p(mapper, "mapper");
            this.f6395c = tVar;
            this.f6394b = j11;
        }

        public static final g2 m(b bVar, l.f executeQuery) {
            g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(bVar.f6394b));
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            g0.p(mapper, "mapper");
            return this.f6395c.C().c5(-334263201, "SELECT TestStudent.id, TestStudent.name, TestStudent.age FROM TestStudent WHERE id = ?", mapper, 1, new x00.l() { // from class: b8.u
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = t.b.m(t.b.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f6395c.C().Y1(new String[]{"TestStudent"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f6395c.C().F6(new String[]{"TestStudent"}, listener);
        }

        public final long n() {
            return this.f6394b;
        }

        @m80.k
        public String toString() {
            return "TestStudent.sq:queryByIdWithName";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.test.TestStudentQueries", f = "TestStudentQueries.kt", i = {}, l = {73}, m = "deleteAll", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6396a;

        /* renamed from: c, reason: collision with root package name */
        public int f6398c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6396a = obj;
            this.f6398c |= Integer.MIN_VALUE;
            return t.this.W(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.test.TestStudentQueries", f = "TestStudentQueries.kt", i = {0}, l = {115}, m = "insertObj", n = {"TestStudent"}, s = {"L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6399a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6400b;

        /* renamed from: d, reason: collision with root package name */
        public int f6402d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6400b = obj;
            this.f6402d |= Integer.MIN_VALUE;
            return t.this.Y(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.test.TestStudentQueries", f = "TestStudentQueries.kt", i = {0, 0, 0}, l = {96}, m = "insertWithField", n = {"id", "name", "age"}, s = {"L$0", "L$1", "J$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6403a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6404b;

        /* renamed from: c, reason: collision with root package name */
        public long f6405c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f6406d;

        /* renamed from: f, reason: collision with root package name */
        public int f6408f;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6406d = obj;
            this.f6408f |= Integer.MIN_VALUE;
            return t.this.b0(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements x00.q<Long, String, Long, b8.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f6409a = new f();

        public f() {
            super(3, b8.h.class, "<init>", "<init>(JLjava/lang/String;J)V", 0);
        }

        public final b8.h a(long j11, String p12, long j12) {
            g0.p(p12, "p1");
            return new b8.h(j11, p12, j12);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ b8.h invoke(Long l11, String str, Long l12) {
            return a(l11.longValue(), str, l12.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements x00.q<Long, String, Long, b8.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f6410a = new g();

        public g() {
            super(3, b8.h.class, "<init>", "<init>(JLjava/lang/String;J)V", 0);
        }

        public final b8.h a(long j11, String p12, long j12) {
            g0.p(p12, "p1");
            return new b8.h(j11, p12, j12);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ b8.h invoke(Long l11, String str, Long l12) {
            return a(l11.longValue(), str, l12.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements x00.q<Long, String, Long, b8.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f6411a = new h();

        public h() {
            super(3, b8.h.class, "<init>", "<init>(JLjava/lang/String;J)V", 0);
        }

        public final b8.h a(long j11, String p12, long j12) {
            g0.p(p12, "p1");
            return new b8.h(j11, p12, j12);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ b8.h invoke(Long l11, String str, Long l12) {
            return a(l11.longValue(), str, l12.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k l.e driver) {
        super(driver);
        g0.p(driver, "driver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 X(x00.l emit) {
        g0.p(emit, "emit");
        emit.invoke("TestStudent");
        return g2.f100423a;
    }

    public static final g2 Z(b8.h hVar, l.f execute) {
        g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(hVar.g()));
        execute.bindString(1, hVar.h());
        execute.c(2, Long.valueOf(hVar.f()));
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 a0(x00.l emit) {
        g0.p(emit, "emit");
        emit.invoke("TestStudent");
        return g2.f100423a;
    }

    public static final g2 c0(Long l11, String str, long j11, l.f execute) {
        g0.p(execute, "$this$execute");
        execute.c(0, l11);
        execute.bindString(1, str);
        execute.c(2, Long.valueOf(j11));
        return g2.f100423a;
    }

    public static final g2 d0(x00.l emit) {
        g0.p(emit, "emit");
        emit.invoke("TestStudent");
        return g2.f100423a;
    }

    public static final Object g0(x00.q qVar, l.d cursor) {
        g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        g0.m(l11);
        String string = cursor.getString(1);
        g0.m(string);
        Long l12 = cursor.getLong(2);
        g0.m(l12);
        return qVar.invoke(l11, string, l12);
    }

    public static final Object j0(x00.q qVar, l.d cursor) {
        g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        g0.m(l11);
        String string = cursor.getString(1);
        g0.m(string);
        Long l12 = cursor.getLong(2);
        g0.m(l12);
        return qVar.invoke(l11, string, l12);
    }

    public static final Object m0(x00.q qVar, l.d cursor) {
        g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        g0.m(l11);
        String string = cursor.getString(1);
        g0.m(string);
        Long l12 = cursor.getLong(2);
        g0.m(l12);
        return qVar.invoke(l11, string, l12);
    }

    public static final long o0(l.d cursor) {
        g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        g0.m(l11);
        return l11.longValue();
    }

    public static final long q0(l.d cursor) {
        g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        g0.m(l11);
        return l11.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(@m80.k j00.c<? super java.lang.Long> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof b8.t.c
            if (r0 == 0) goto L13
            r0 = r13
            b8.t$c r0 = (b8.t.c) r0
            int r1 = r0.f6398c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6398c = r1
            goto L18
        L13:
            b8.t$c r0 = new b8.t$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6396a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6398c
            r3 = 1974394122(0x75aedd0a, float:4.4333147E32)
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r13)
            goto L53
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L34:
            kotlin.e.n(r13)
            l.e r5 = r12.C()
            java.lang.Integer r6 = l00.a.f(r3)
            r10 = 8
            r11 = 0
            java.lang.String r7 = "DELETE FROM TestStudent"
            r8 = 0
            r9 = 0
            l.c r13 = l.e.a.a(r5, r6, r7, r8, r9, r10, r11)
            r0.f6398c = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L53
            return r1
        L53:
            java.lang.Number r13 = (java.lang.Number) r13
            long r0 = r13.longValue()
            b8.r r13 = new b8.r
            r13.<init>()
            r12.D(r3, r13)
            java.lang.Long r13 = l00.a.g(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.t.W(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(@m80.k final b8.h r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b8.t.d
            if (r0 == 0) goto L13
            r0 = r10
            b8.t$d r0 = (b8.t.d) r0
            int r1 = r0.f6402d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6402d = r1
            goto L18
        L13:
            b8.t$d r0 = new b8.t$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6400b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6402d
            r3 = 1948651666(0x74261092, float:5.2628013E31)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f6399a
            b8.h r9 = (b8.h) r9
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
            b8.i r5 = new b8.i
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO TestStudent(id, name, age)\nVALUES (?, ?, ?)"
            r7 = 3
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f6399a = r9
            r0.f6402d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            b8.j r0 = new b8.j
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.t.Y(b8.h, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(@m80.l final java.lang.Long r9, @m80.k final java.lang.String r10, final long r11, @m80.k j00.c<? super java.lang.Long> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof b8.t.e
            if (r0 == 0) goto L13
            r0 = r13
            b8.t$e r0 = (b8.t.e) r0
            int r1 = r0.f6408f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6408f = r1
            goto L18
        L13:
            b8.t$e r0 = new b8.t$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6406d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6408f
            r3 = 242585391(0xe758f2f, float:3.0267522E-30)
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r9 = r0.f6404b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f6403a
            java.lang.Long r9 = (java.lang.Long) r9
            kotlin.e.n(r13)
            goto L6a
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.e.n(r13)
            l.e r13 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            b8.m r5 = new b8.m
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO TestStudent(id, name, age)\nVALUES(?,?,?)"
            r7 = 3
            l.c r13 = r13.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f6403a = r9
            java.lang.Object r9 = l00.k.a(r10)
            r0.f6404b = r9
            r0.f6405c = r11
            r0.f6408f = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L6a
            return r1
        L6a:
            java.lang.Number r13 = (java.lang.Number) r13
            long r9 = r13.longValue()
            b8.n r11 = new b8.n
            r11.<init>()
            r8.D(r3, r11)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.t.b0(java.lang.Long, java.lang.String, long, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<b8.h> e0(long j11) {
        return f0(j11, f.f6409a);
    }

    @m80.k
    public final <T> j.j<T> f0(long j11, @m80.k final x00.q<? super Long, ? super String, ? super Long, ? extends T> mapper) {
        g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: b8.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object g02;
                g02 = t.g0(x00.q.this, (l.d) obj);
                return g02;
            }
        });
    }

    @m80.k
    public final j.j<b8.h> h0(long j11) {
        return i0(j11, g.f6410a);
    }

    @m80.k
    public final <T> j.j<T> i0(long j11, @m80.k final x00.q<? super Long, ? super String, ? super Long, ? extends T> mapper) {
        g0.p(mapper, "mapper");
        return new b(this, j11, new x00.l() { // from class: b8.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object j02;
                j02 = t.j0(x00.q.this, (l.d) obj);
                return j02;
            }
        });
    }

    @m80.k
    public final j.j<b8.h> k0() {
        return l0(h.f6411a);
    }

    @m80.k
    public final <T> j.j<T> l0(@m80.k final x00.q<? super Long, ? super String, ? super Long, ? extends T> mapper) {
        g0.p(mapper, "mapper");
        return j.k.c(617127961, new String[]{"TestStudent"}, C(), "TestStudent.sq", "selectAll", "SELECT TestStudent.id, TestStudent.name, TestStudent.age\nFROM TestStudent", new x00.l() { // from class: b8.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object m02;
                m02 = t.m0(x00.q.this, (l.d) obj);
                return m02;
            }
        });
    }

    @m80.k
    public final j.i<Long> n0() {
        return j.k.a(-1284862661, C(), "TestStudent.sq", "selectChanges", "SELECT changes()", new x00.l() { // from class: b8.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                long o02;
                o02 = t.o0((l.d) obj);
                return Long.valueOf(o02);
            }
        });
    }

    @m80.k
    public final j.i<Long> p0() {
        return j.k.a(-549411873, C(), "TestStudent.sq", "selectLastInsertedRowId", "SELECT last_insert_rowid()", new x00.l() { // from class: b8.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                long q02;
                q02 = t.q0((l.d) obj);
                return Long.valueOf(q02);
            }
        });
    }
}
