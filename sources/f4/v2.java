package f4;

import f4.v2;
import j.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class v2 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50845b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v2 f50846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v2 v2Var, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50846c = v2Var;
            this.f50845b = j11;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50845b));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50846c.C().c5(1663046409, "SELECT roadMapInfo.bookId, roadMapInfo.roadMap FROM roadMapInfo WHERE bookId = ?", mapper, 1, new x00.l() { // from class: f4.u2
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = v2.a.m(v2.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50846c.C().Y1(new String[]{"roadMapInfo"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50846c.C().F6(new String[]{"roadMapInfo"}, listener);
        }

        public final long n() {
            return this.f50845b;
        }

        @m80.k
        public String toString() {
            return "RoadMap.sq:queryRoadMapByBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.RoadMapQueries", f = "RoadMapQueries.kt", i = {0, 0}, l = {33}, m = "insertOrReplaceRoadMap", n = {"bookId", "roadMap"}, s = {"L$0", "L$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50847a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50848b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50849c;

        /* renamed from: e, reason: collision with root package name */
        public int f50851e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50849c = obj;
            this.f50851e |= Integer.MIN_VALUE;
            return v2.this.P(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements x00.p<Long, byte[], q2> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f50852a = new c();

        public c() {
            super(2, q2.class, "<init>", "<init>(J[B)V", 0);
        }

        public final q2 a(long j11, byte[] p12) {
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new q2(j11, p12);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ q2 invoke(Long l11, byte[] bArr) {
            return a(l11.longValue(), bArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 Q(Long l11, byte[] bArr, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, l11);
        execute.e(1, bArr);
        return yz.g2.f100423a;
    }

    public static final yz.g2 R(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("roadMapInfo");
        return yz.g2.f100423a;
    }

    public static final Object U(x00.p pVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        byte[] bytes = cursor.getBytes(1);
        kotlin.jvm.internal.g0.m(bytes);
        return pVar.invoke(l11, bytes);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(@m80.l final java.lang.Long r9, @m80.k final byte[] r10, @m80.k j00.c<? super java.lang.Long> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof f4.v2.b
            if (r0 == 0) goto L13
            r0 = r11
            f4.v2$b r0 = (f4.v2.b) r0
            int r1 = r0.f50851e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50851e = r1
            goto L18
        L13:
            f4.v2$b r0 = new f4.v2$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f50849c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50851e
            r3 = -1964817026(0xffffffff8ae3457e, float:-2.1885445E-32)
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r9 = r0.f50848b
            byte[] r9 = (byte[]) r9
            java.lang.Object r9 = r0.f50847a
            java.lang.Long r9 = (java.lang.Long) r9
            kotlin.e.n(r11)
            goto L68
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.e.n(r11)
            l.e r11 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            f4.r2 r5 = new f4.r2
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO roadMapInfo (bookId, roadMap) VALUES (?, ?)"
            r7 = 2
            l.c r11 = r11.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50847a = r9
            java.lang.Object r9 = l00.k.a(r10)
            r0.f50848b = r9
            r0.f50851e = r4
            java.lang.Object r11 = r11.i(r0)
            if (r11 != r1) goto L68
            return r1
        L68:
            java.lang.Number r11 = (java.lang.Number) r11
            long r9 = r11.longValue()
            f4.s2 r11 = new f4.s2
            r11.<init>()
            r8.D(r3, r11)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.v2.P(java.lang.Long, byte[], j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<q2> S(long j11) {
        return T(j11, c.f50852a);
    }

    @m80.k
    public final <T> j.j<T> T(long j11, @m80.k final x00.p<? super Long, ? super byte[], ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: f4.t2
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object U;
                U = v2.U(x00.p.this, (l.d) obj);
                return U;
            }
        });
    }
}
