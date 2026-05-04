package f4;

import f4.m0;
import j.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m0 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50724b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f50725c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50725c = m0Var;
            this.f50724b = j11;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50724b));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50725c.C().c5(1900602710, "SELECT gameBookRecord.bookId, gameBookRecord.currentProgress, gameBookRecord.targetProgress, gameBookRecord.updateDay, gameBookRecord.bookInfo FROM gameBookRecord WHERE bookId = ?", mapper, 1, new x00.l() { // from class: f4.l0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = m0.a.m(m0.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50725c.C().Y1(new String[]{"gameBookRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50725c.C().F6(new String[]{"gameBookRecord"}, listener);
        }

        public final long n() {
            return this.f50724b;
        }

        @m80.k
        public String toString() {
            return "GameBook.sq:queryGameBookRecordByBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameBookQueries", f = "GameBookQueries.kt", i = {0}, l = {47}, m = "insertOrReplaceGameBookRecord", n = {"gameBookRecord"}, s = {"L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50726a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50727b;

        /* renamed from: d, reason: collision with root package name */
        public int f50729d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50727b = obj;
            this.f50729d |= Integer.MIN_VALUE;
            return m0.this.R(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements x00.s<Long, Long, Long, Long, String, n0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f50730a = new c();

        public c() {
            super(5, n0.class, "<init>", "<init>(JJJJLjava/lang/String;)V", 0);
        }

        public final n0 a(long j11, long j12, long j13, long j14, String p42) {
            kotlin.jvm.internal.g0.p(p42, "p4");
            return new n0(j11, j12, j13, j14, p42);
        }

        @Override // x00.s
        public /* bridge */ /* synthetic */ n0 invoke(Long l11, Long l12, Long l13, Long l14, String str) {
            return a(l11.longValue(), l12.longValue(), l13.longValue(), l14.longValue(), str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameBookQueries", f = "GameBookQueries.kt", i = {0, 0, 0}, l = {67}, m = "updateCurrentProgress", n = {"currentProgress", "updateDay", "bookId"}, s = {"J$0", "J$1", "J$2"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f50731a;

        /* renamed from: b, reason: collision with root package name */
        public long f50732b;

        /* renamed from: c, reason: collision with root package name */
        public long f50733c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f50734d;

        /* renamed from: f, reason: collision with root package name */
        public int f50736f;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50734d = obj;
            this.f50736f |= Integer.MIN_VALUE;
            return m0.this.X(0L, 0L, 0L, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 S(n0 n0Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(n0Var.h()));
        execute.c(1, Long.valueOf(n0Var.j()));
        execute.c(2, Long.valueOf(n0Var.k()));
        execute.c(3, Long.valueOf(n0Var.l()));
        execute.bindString(4, n0Var.i());
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameBookRecord");
        return yz.g2.f100423a;
    }

    public static final Object W(x00.s sVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l14);
        String string = cursor.getString(4);
        kotlin.jvm.internal.g0.m(string);
        return sVar.invoke(l11, l12, l13, l14, string);
    }

    public static final yz.g2 Y(long j11, long j12, long j13, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        execute.c(1, Long.valueOf(j12));
        execute.c(2, Long.valueOf(j13));
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameBookRecord");
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(@m80.k final f4.n0 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.m0.b
            if (r0 == 0) goto L13
            r0 = r10
            f4.m0$b r0 = (f4.m0.b) r0
            int r1 = r0.f50729d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50729d = r1
            goto L18
        L13:
            f4.m0$b r0 = new f4.m0$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50727b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50729d
            r3 = -1237670357(0xffffffffb63aa62b, float:-2.7812882E-6)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50726a
            f4.n0 r9 = (f4.n0) r9
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
            f4.g0 r5 = new f4.g0
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO gameBookRecord (bookId, currentProgress, targetProgress, updateDay, bookInfo)\nVALUES (?, ?, ?, ?, ?)"
            r7 = 5
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50726a = r9
            r0.f50729d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.h0 r0 = new f4.h0
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.m0.R(f4.n0, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<n0> U(long j11) {
        return V(j11, c.f50730a);
    }

    @m80.k
    public final <T> j.j<T> V(long j11, @m80.k final x00.s<? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: f4.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object W;
                W = m0.W(x00.s.this, (l.d) obj);
                return W;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(final long r14, final long r16, final long r18, @m80.k j00.c<? super java.lang.Long> r20) {
        /*
            r13 = this;
            r0 = r20
            boolean r1 = r0 instanceof f4.m0.d
            if (r1 == 0) goto L15
            r1 = r0
            f4.m0$d r1 = (f4.m0.d) r1
            int r2 = r1.f50736f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f50736f = r2
            goto L1a
        L15:
            f4.m0$d r1 = new f4.m0$d
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f50734d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r1.f50736f
            r4 = -648223996(0xffffffffd95ce304, float:-3.88588132E15)
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            kotlin.e.n(r0)
            goto L63
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L36:
            kotlin.e.n(r0)
            l.e r0 = r13.C()
            java.lang.Integer r3 = l00.a.f(r4)
            f4.j0 r6 = new f4.j0
            r7 = r14
            r9 = r16
            r11 = r18
            r6.<init>()
            java.lang.String r9 = "UPDATE gameBookRecord SET currentProgress = ? , updateDay = ? WHERE bookId = ?"
            r10 = 3
            l.c r0 = r0.v3(r3, r9, r10, r6)
            r1.f50731a = r14
            r9 = r16
            r1.f50732b = r9
            r1.f50733c = r11
            r1.f50736f = r5
            java.lang.Object r0 = r0.i(r1)
            if (r0 != r2) goto L63
            return r2
        L63:
            java.lang.Number r0 = (java.lang.Number) r0
            long r14 = r0.longValue()
            f4.k0 r0 = new f4.k0
            r0.<init>()
            r13.D(r4, r0)
            java.lang.Long r14 = l00.a.g(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.m0.X(long, long, long, j00.c):java.lang.Object");
    }
}
