package f4;

import f4.i4;
import j.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i4 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50653b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f50654c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i4 f50655d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i4 i4Var, @m80.k long j11, @m80.k String resourceId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(resourceId, "resourceId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50655d = i4Var;
            this.f50653b = j11;
            this.f50654c = resourceId;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50653b));
            executeQuery.bindString(1, aVar.f50654c);
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50655d.C().c5(1817941473, "SELECT versionInfo.id, versionInfo.bookId, versionInfo.resourceId, versionInfo.localVersion, versionInfo.remoteVersion FROM versionInfo WHERE bookId = ? AND resourceId = ?", mapper, 2, new x00.l() { // from class: f4.h4
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = i4.a.m(i4.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50655d.C().Y1(new String[]{"versionInfo"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50655d.C().F6(new String[]{"versionInfo"}, listener);
        }

        public final long n() {
            return this.f50653b;
        }

        @m80.k
        public final String o() {
            return this.f50654c;
        }

        @m80.k
        public String toString() {
            return "VersionInfo.sq:queryByBookIdAndResourceId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.VersionInfoQueries", f = "VersionInfoQueries.kt", i = {0}, l = {50}, m = "insertOrReplaceInto", n = {"versionInfo"}, s = {"L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50656a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50657b;

        /* renamed from: d, reason: collision with root package name */
        public int f50659d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50657b = obj;
            this.f50659d |= Integer.MIN_VALUE;
            return i4.this.R(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements x00.s<Long, Long, String, Long, Long, b4> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f50660a = new c();

        public c() {
            super(5, b4.class, "<init>", "<init>(JJLjava/lang/String;JJ)V", 0);
        }

        public final b4 a(long j11, long j12, String p22, long j13, long j14) {
            kotlin.jvm.internal.g0.p(p22, "p2");
            return new b4(j11, j12, p22, j13, j14);
        }

        @Override // x00.s
        public /* bridge */ /* synthetic */ b4 invoke(Long l11, Long l12, String str, Long l13, Long l14) {
            return a(l11.longValue(), l12.longValue(), str, l13.longValue(), l14.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.VersionInfoQueries", f = "VersionInfoQueries.kt", i = {0, 0}, l = {65}, m = "updateLocalVersionByResourceId", n = {"resourceId", "localVersion"}, s = {"L$0", "J$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f50661a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50662b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50663c;

        /* renamed from: e, reason: collision with root package name */
        public int f50665e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50663c = obj;
            this.f50665e |= Integer.MIN_VALUE;
            return i4.this.X(0L, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 S(b4 b4Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(b4Var.h()));
        execute.bindString(1, b4Var.l());
        execute.c(2, Long.valueOf(b4Var.j()));
        execute.c(3, Long.valueOf(b4Var.k()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("versionInfo");
        return yz.g2.f100423a;
    }

    public static final Object W(x00.s sVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        String string = cursor.getString(2);
        kotlin.jvm.internal.g0.m(string);
        Long l13 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l14);
        return sVar.invoke(l11, l12, string, l13, l14);
    }

    public static final yz.g2 Y(long j11, String str, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        execute.bindString(1, str);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("versionInfo");
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(@m80.k final f4.b4 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.i4.b
            if (r0 == 0) goto L13
            r0 = r10
            f4.i4$b r0 = (f4.i4.b) r0
            int r1 = r0.f50659d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50659d = r1
            goto L18
        L13:
            f4.i4$b r0 = new f4.i4$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50657b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50659d
            r3 = -938990732(0xffffffffc8082374, float:-139405.81)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50656a
            f4.b4 r9 = (f4.b4) r9
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
            f4.f4 r5 = new f4.f4
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO versionInfo (bookId, resourceId, localVersion, remoteVersion)\nVALUES (?, ?, ?, ?)"
            r7 = 4
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50656a = r9
            r0.f50659d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.g4 r0 = new f4.g4
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.i4.R(f4.b4, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<b4> U(long j11, @m80.k String resourceId) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        return V(j11, resourceId, c.f50660a);
    }

    @m80.k
    public final <T> j.j<T> V(long j11, @m80.k String resourceId, @m80.k final x00.s<? super Long, ? super Long, ? super String, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, resourceId, new x00.l() { // from class: f4.e4
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object W;
                W = i4.W(x00.s.this, (l.d) obj);
                return W;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(final long r9, @m80.k final java.lang.String r11, @m80.k j00.c<? super java.lang.Long> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof f4.i4.d
            if (r0 == 0) goto L13
            r0 = r12
            f4.i4$d r0 = (f4.i4.d) r0
            int r1 = r0.f50665e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50665e = r1
            goto L18
        L13:
            f4.i4$d r0 = new f4.i4$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f50663c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50665e
            r3 = 986147098(0x3ac7691a, float:0.0015213818)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50662b
            java.lang.String r9 = (java.lang.String) r9
            kotlin.e.n(r12)
            goto L60
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.e.n(r12)
            l.e r12 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            f4.c4 r5 = new f4.c4
            r5.<init>()
            java.lang.String r6 = "UPDATE versionInfo SET localVersion = ? WHERE resourceId = ?"
            r7 = 2
            l.c r12 = r12.v3(r2, r6, r7, r5)
            java.lang.Object r11 = l00.k.a(r11)
            r0.f50662b = r11
            r0.f50661a = r9
            r0.f50665e = r4
            java.lang.Object r12 = r12.i(r0)
            if (r12 != r1) goto L60
            return r1
        L60:
            java.lang.Number r12 = (java.lang.Number) r12
            long r9 = r12.longValue()
            f4.d4 r11 = new f4.d4
            r11.<init>()
            r8.D(r3, r11)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.i4.X(long, java.lang.String, j00.c):java.lang.Object");
    }
}
