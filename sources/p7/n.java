package p7;

import j.j;
import j.o;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import l.c;
import p7.n;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f79398b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f79399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f79399c = nVar;
            this.f79398b = j11;
        }

        public static final g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f79398b));
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f79399c.C().c5(-488883062, "SELECT UserBookRecord.userBookId, UserBookRecord.bookName, UserBookRecord.wordNum, UserBookRecord.cover, UserBookRecord.remoteVersion, UserBookRecord.localVersion FROM UserBookRecord WHERE userBookId = ?", mapper, 1, new x00.l() { // from class: p7.m
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = n.a.m(n.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f79399c.C().Y1(new String[]{"UserBookRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f79399c.C().F6(new String[]{"UserBookRecord"}, listener);
        }

        public final long n() {
            return this.f79398b;
        }

        @m80.k
        public String toString() {
            return "UserBook.sq:queryById";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b<T> extends j.i<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f79400b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f79401c;

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookQueries$SelectByTopicIdQuery$execute$1", f = "UserBookQueries.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a<R> extends SuspendLambda implements x00.l<j00.c<? super R>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f79402a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f79403b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.l<l.d, l.c<R>> f79404c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b<T> f79405d;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookQueries$SelectByTopicIdQuery$execute$1$1", f = "UserBookQueries.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: p7.n$b$a$a, reason: collision with other inner class name */
            public static final class C0979a extends SuspendLambda implements x00.p<j.q<R>, j00.c<? super R>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f79406a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f79407b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ x00.l<l.d, l.c<R>> f79408c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ b<T> f79409d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0979a(n nVar, x00.l<? super l.d, ? extends l.c<R>> lVar, b<? extends T> bVar, j00.c<? super C0979a> cVar) {
                    super(2, cVar);
                    this.f79407b = nVar;
                    this.f79408c = lVar;
                    this.f79409d = bVar;
                }

                public static final g2 k(b bVar, l.f fVar) {
                    fVar.c(0, Long.valueOf(bVar.j()));
                    return g2.f100423a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    return new C0979a(this.f79407b, this.f79408c, this.f79409d, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.f79406a;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                        return obj;
                    }
                    kotlin.e.n(obj);
                    l.e C = this.f79407b.C();
                    Integer f11 = l00.a.f(950090360);
                    x00.l<l.d, l.c<R>> lVar = this.f79408c;
                    final b<T> bVar = this.f79409d;
                    l.c<R> c52 = C.c5(f11, "SELECT UserBookRecord.userBookId, UserBookRecord.bookName, UserBookRecord.wordNum, UserBookRecord.cover, UserBookRecord.remoteVersion, UserBookRecord.localVersion FROM UserBookRecord WHERE userBookId IN (SELECT userBookId FROM UserBookWordRecord WHERE topicId = ?)", lVar, 1, new x00.l() { // from class: p7.o
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            g2 k11;
                            k11 = n.b.a.C0979a.k(n.b.this, (l.f) obj2);
                            return k11;
                        }
                    });
                    this.f79406a = 1;
                    Object i12 = c52.i(this);
                    return i12 == l11 ? l11 : i12;
                }

                @Override // x00.p
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public final Object invoke(j.q<R> qVar, j00.c<? super R> cVar) {
                    return ((C0979a) create(qVar, cVar)).invokeSuspend(g2.f100423a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(n nVar, x00.l<? super l.d, ? extends l.c<R>> lVar, b<? extends T> bVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f79403b = nVar;
                this.f79404c = lVar;
                this.f79405d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f79403b, this.f79404c, this.f79405d, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super R> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f79402a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                n nVar = this.f79403b;
                C0979a c0979a = new C0979a(nVar, this.f79404c, this.f79405d, null);
                this.f79402a = 1;
                Object b11 = o.a.b(nVar, false, c0979a, this, 1, null);
                return b11 == l11 ? l11 : b11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f79401c = nVar;
            this.f79400b = j11;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return c.a.b(c.a.c(new a(this.f79401c, mapper, this, null)));
        }

        public final long j() {
            return this.f79400b;
        }

        @m80.k
        public String toString() {
            return "UserBook.sq:selectByTopicId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookQueries", f = "UserBookQueries.kt", i = {}, l = {80}, m = "deleteAll", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f79410a;

        /* renamed from: c, reason: collision with root package name */
        public int f79412c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79410a = obj;
            this.f79412c |= Integer.MIN_VALUE;
            return n.this.U(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookQueries", f = "UserBookQueries.kt", i = {0}, l = {116}, m = "deleteById", n = {"userBookId"}, s = {"J$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79413a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f79414b;

        /* renamed from: d, reason: collision with root package name */
        public int f79416d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79414b = obj;
            this.f79416d |= Integer.MIN_VALUE;
            return n.this.W(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookQueries", f = "UserBookQueries.kt", i = {0}, l = {102}, m = "insertOrUpdateBook", n = {"UserBookRecord"}, s = {"L$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79417a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f79418b;

        /* renamed from: d, reason: collision with root package name */
        public int f79420d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79418b = obj;
            this.f79420d |= Integer.MIN_VALUE;
            return n.this.Z(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements x00.t<Long, String, Long, String, Long, Long, p> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f79421a = new f();

        public f() {
            super(6, p.class, "<init>", "<init>(JLjava/lang/String;JLjava/lang/String;JJ)V", 0);
        }

        public final p a(long j11, String p12, long j12, String str, long j13, long j14) {
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new p(j11, p12, j12, str, j13, j14);
        }

        @Override // x00.t
        public /* bridge */ /* synthetic */ p invoke(Long l11, String str, Long l12, String str2, Long l13, Long l14) {
            return a(l11.longValue(), str, l12.longValue(), str2, l13.longValue(), l14.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements x00.t<Long, String, Long, String, Long, Long, p> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f79422a = new g();

        public g() {
            super(6, p.class, "<init>", "<init>(JLjava/lang/String;JLjava/lang/String;JJ)V", 0);
        }

        public final p a(long j11, String p12, long j12, String str, long j13, long j14) {
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new p(j11, p12, j12, str, j13, j14);
        }

        @Override // x00.t
        public /* bridge */ /* synthetic */ p invoke(Long l11, String str, Long l12, String str2, Long l13, Long l14) {
            return a(l11.longValue(), str, l12.longValue(), str2, l13.longValue(), l14.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements x00.t<Long, String, Long, String, Long, Long, p> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f79423a = new h();

        public h() {
            super(6, p.class, "<init>", "<init>(JLjava/lang/String;JLjava/lang/String;JJ)V", 0);
        }

        public final p a(long j11, String p12, long j12, String str, long j13, long j14) {
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new p(j11, p12, j12, str, j13, j14);
        }

        @Override // x00.t
        public /* bridge */ /* synthetic */ p invoke(Long l11, String str, Long l12, String str2, Long l13, Long l14) {
            return a(l11.longValue(), str, l12.longValue(), str2, l13.longValue(), l14.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 V(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("UserBookRecord");
        return g2.f100423a;
    }

    public static final g2 X(long j11, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        return g2.f100423a;
    }

    public static final g2 Y(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("UserBookRecord");
        return g2.f100423a;
    }

    public static final g2 a0(p pVar, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(pVar.m()));
        execute.bindString(1, pVar.i());
        execute.c(2, Long.valueOf(pVar.n()));
        execute.bindString(3, pVar.j());
        execute.c(4, Long.valueOf(pVar.l()));
        execute.c(5, Long.valueOf(pVar.k()));
        return g2.f100423a;
    }

    public static final g2 b0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("UserBookRecord");
        return g2.f100423a;
    }

    public static final Object e0(x00.t tVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        String string = cursor.getString(1);
        kotlin.jvm.internal.g0.m(string);
        Long l12 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l12);
        String string2 = cursor.getString(3);
        Long l13 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        return tVar.invoke(l11, string, l12, string2, l13, l14);
    }

    public static final Object h0(x00.t tVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        String string = cursor.getString(1);
        kotlin.jvm.internal.g0.m(string);
        Long l12 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l12);
        String string2 = cursor.getString(3);
        Long l13 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        return tVar.invoke(l11, string, l12, string2, l13, l14);
    }

    public static final Object k0(x00.t tVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        String string = cursor.getString(1);
        kotlin.jvm.internal.g0.m(string);
        Long l12 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l12);
        String string2 = cursor.getString(3);
        Long l13 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        return tVar.invoke(l11, string, l12, string2, l13, l14);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(@m80.k j00.c<? super java.lang.Long> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p7.n.c
            if (r0 == 0) goto L13
            r0 = r13
            p7.n$c r0 = (p7.n.c) r0
            int r1 = r0.f79412c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79412c = r1
            goto L18
        L13:
            p7.n$c r0 = new p7.n$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f79410a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79412c
            r3 = 959778758(0x39350fc6, float:1.7267381E-4)
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
            java.lang.String r7 = "DELETE FROM UserBookRecord"
            r8 = 0
            r9 = 0
            l.c r13 = l.e.a.a(r5, r6, r7, r8, r9, r10, r11)
            r0.f79412c = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L53
            return r1
        L53:
            java.lang.Number r13 = (java.lang.Number) r13
            long r0 = r13.longValue()
            p7.e r13 = new p7.e
            r13.<init>()
            r12.D(r3, r13)
            java.lang.Long r13 = l00.a.g(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.n.U(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(final long r8, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p7.n.d
            if (r0 == 0) goto L13
            r0 = r10
            p7.n$d r0 = (p7.n.d) r0
            int r1 = r0.f79416d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79416d = r1
            goto L18
        L13:
            p7.n$d r0 = new p7.n$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f79414b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79416d
            r3 = -311588275(0xffffffffed6d8a4d, float:-4.5946964E27)
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r10)
            goto L55
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.e.n(r10)
            l.e r10 = r7.C()
            java.lang.Integer r2 = l00.a.f(r3)
            p7.h r5 = new p7.h
            r5.<init>()
            java.lang.String r6 = "DELETE FROM UserBookRecord WHERE userBookId = ?"
            l.c r10 = r10.v3(r2, r6, r4, r5)
            r0.f79413a = r8
            r0.f79416d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            java.lang.Number r10 = (java.lang.Number) r10
            long r8 = r10.longValue()
            p7.i r10 = new p7.i
            r10.<init>()
            r7.D(r3, r10)
            java.lang.Long r8 = l00.a.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.n.W(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(@m80.k final p7.p r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p7.n.e
            if (r0 == 0) goto L13
            r0 = r10
            p7.n$e r0 = (p7.n.e) r0
            int r1 = r0.f79420d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79420d = r1
            goto L18
        L13:
            p7.n$e r0 = new p7.n$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f79418b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79420d
            r3 = -573038306(0xffffffffddd8211e, float:-1.94672025E18)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f79417a
            p7.p r9 = (p7.p) r9
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
            p7.f r5 = new p7.f
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO UserBookRecord(userBookId, bookName, wordNum, cover, remoteVersion, localVersion)\nVALUES (?, ?, ?, ?, ?, ?)"
            r7 = 6
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f79417a = r9
            r0.f79420d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            p7.g r0 = new p7.g
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.n.Z(p7.p, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<p> c0(long j11) {
        return d0(j11, f.f79421a);
    }

    @m80.k
    public final <T> j.j<T> d0(long j11, @m80.k final x00.t<? super Long, ? super String, ? super Long, ? super String, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: p7.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object e02;
                e02 = n.e0(x00.t.this, (l.d) obj);
                return e02;
            }
        });
    }

    @m80.k
    public final j.j<p> f0() {
        return g0(g.f79422a);
    }

    @m80.k
    public final <T> j.j<T> g0(@m80.k final x00.t<? super Long, ? super String, ? super Long, ? super String, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return j.k.c(-397487403, new String[]{"UserBookRecord"}, C(), "UserBook.sq", "selectAll", "SELECT UserBookRecord.userBookId, UserBookRecord.bookName, UserBookRecord.wordNum, UserBookRecord.cover, UserBookRecord.remoteVersion, UserBookRecord.localVersion FROM UserBookRecord", new x00.l() { // from class: p7.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object h02;
                h02 = n.h0(x00.t.this, (l.d) obj);
                return h02;
            }
        });
    }

    @m80.k
    public final j.i<p> i0(long j11) {
        return j0(j11, h.f79423a);
    }

    @m80.k
    public final <T> j.i<T> j0(long j11, @m80.k final x00.t<? super Long, ? super String, ? super Long, ? super String, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new b(this, j11, new x00.l() { // from class: p7.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object k02;
                k02 = n.k0(x00.t.this, (l.d) obj);
                return k02;
            }
        });
    }
}
