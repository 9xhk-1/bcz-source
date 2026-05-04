package f4;

import f4.n2;
import j.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n2 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50746b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n2 f50747c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2 n2Var, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50747c = n2Var;
            this.f50746b = j11;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50746b));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50747c.C().c5(2030505022, "SELECT islandMapInfo.id, islandMapInfo.bookId, islandMapInfo.wordIndex, islandMapInfo.resourceId FROM islandMapInfo  WHERE bookId = ? ORDER BY wordIndex ASC", mapper, 1, new x00.l() { // from class: f4.m2
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = n2.a.m(n2.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50747c.C().Y1(new String[]{"islandMapInfo"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50747c.C().F6(new String[]{"islandMapInfo"}, listener);
        }

        public final long n() {
            return this.f50746b;
        }

        @m80.k
        public String toString() {
            return "IsLandMap.sq:queryByBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.IsLandMapQueries", f = "IsLandMapQueries.kt", i = {0}, l = {38}, m = "deleltByBookId", n = {"bookId"}, s = {"J$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f50748a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50749b;

        /* renamed from: d, reason: collision with root package name */
        public int f50751d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50749b = obj;
            this.f50751d |= Integer.MIN_VALUE;
            return n2.this.R(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.IsLandMapQueries", f = "IsLandMapQueries.kt", i = {0}, l = {60}, m = "insertOrReplace", n = {"islandMapInfo"}, s = {"L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50752a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50753b;

        /* renamed from: d, reason: collision with root package name */
        public int f50755d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50753b = obj;
            this.f50755d |= Integer.MIN_VALUE;
            return n2.this.U(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements x00.r<Long, Long, Long, Long, o2> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f50756a = new d();

        public d() {
            super(4, o2.class, "<init>", "<init>(JJJJ)V", 0);
        }

        public final o2 a(long j11, long j12, long j13, long j14) {
            return new o2(j11, j12, j13, j14);
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ o2 invoke(Long l11, Long l12, Long l13, Long l14) {
            return a(l11.longValue(), l12.longValue(), l13.longValue(), l14.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 S(long j11, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("islandMapInfo");
        return yz.g2.f100423a;
    }

    public static final yz.g2 V(o2 o2Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(o2Var.g()));
        execute.c(1, Long.valueOf(o2Var.j()));
        execute.c(2, Long.valueOf(o2Var.i()));
        return yz.g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 W(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("islandMapInfo");
        return yz.g2.f100423a;
    }

    public static final Object Z(x00.r rVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l14);
        return rVar.invoke(l11, l12, l13, l14);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(final long r8, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof f4.n2.b
            if (r0 == 0) goto L13
            r0 = r10
            f4.n2$b r0 = (f4.n2.b) r0
            int r1 = r0.f50751d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50751d = r1
            goto L18
        L13:
            f4.n2$b r0 = new f4.n2$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50749b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50751d
            r3 = 982944034(0x3a968922, float:0.001148496)
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
            f4.j2 r5 = new f4.j2
            r5.<init>()
            java.lang.String r6 = "DELETE FROM islandMapInfo WHERE bookId = ?"
            l.c r10 = r10.v3(r2, r6, r4, r5)
            r0.f50748a = r8
            r0.f50751d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            java.lang.Number r10 = (java.lang.Number) r10
            long r8 = r10.longValue()
            f4.k2 r10 = new f4.k2
            r10.<init>()
            r7.D(r3, r10)
            java.lang.Long r8 = l00.a.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.n2.R(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(@m80.k final f4.o2 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.n2.c
            if (r0 == 0) goto L13
            r0 = r10
            f4.n2$c r0 = (f4.n2.c) r0
            int r1 = r0.f50755d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50755d = r1
            goto L18
        L13:
            f4.n2$c r0 = new f4.n2$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50753b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50755d
            r3 = -1158369261(0xffffffffbaf4b013, float:-0.0018668197)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50752a
            f4.o2 r9 = (f4.o2) r9
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
            f4.h2 r5 = new f4.h2
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO islandMapInfo(\n    bookId,\n    wordIndex,\n    resourceId\n) VALUES (?, ?, ?)"
            r7 = 3
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50752a = r9
            r0.f50755d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.i2 r0 = new f4.i2
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.n2.U(f4.o2, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<o2> X(long j11) {
        return Y(j11, d.f50756a);
    }

    @m80.k
    public final <T> j.j<T> Y(long j11, @m80.k final x00.r<? super Long, ? super Long, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: f4.l2
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object Z;
                Z = n2.Z(x00.r.this, (l.d) obj);
                return Z;
            }
        });
    }
}
