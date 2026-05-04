package f4;

import f4.e2;
import j.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e2 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nGameTopicResourceQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameTopicResourceQueries.kt\ncom/baicizhan/app/biz/game/GameTopicResourceQueries$QueryLocalVersionsByBookIdAndTopicIdsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,167:1\n1869#2,2:168\n*S KotlinDebug\n*F\n+ 1 GameTopicResourceQueries.kt\ncom/baicizhan/app/biz/game/GameTopicResourceQueries$QueryLocalVersionsByBookIdAndTopicIdsQuery\n*L\n158#1:168,2\n*E\n"})
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50561b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f50562c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e2 f50563d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2 e2Var, @m80.k long j11, @m80.k Collection<Long> topicId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(topicId, "topicId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50563d = e2Var;
            this.f50561b = j11;
            this.f50562c = topicId;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50561b));
            Iterator<T> it = aVar.f50562c.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                executeQuery.c(i11, Long.valueOf(((Number) it.next()).longValue()));
                i11++;
            }
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            String B = this.f50563d.B(this.f50562c.size());
            return this.f50563d.C().c5(null, u30.y.x("\n          |SELECT topicId, topicVersion FROM gameTopicResourceRecord\n          |WHERE bookId = ? AND topicId IN " + B + "\n          ", null, 1, null), mapper, this.f50562c.size() + 1, new x00.l() { // from class: f4.d2
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = e2.a.m(e2.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50563d.C().Y1(new String[]{"gameTopicResourceRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50563d.C().F6(new String[]{"gameTopicResourceRecord"}, listener);
        }

        public final long n() {
            return this.f50561b;
        }

        @m80.k
        public final Collection<Long> o() {
            return this.f50562c;
        }

        @m80.k
        public String toString() {
            return "GameTopicResource.sq:queryLocalVersionsByBookIdAndTopicIds";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nGameTopicResourceQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameTopicResourceQueries.kt\ncom/baicizhan/app/biz/game/GameTopicResourceQueries$QueryTopicResourceRecordByBookIdAndTopicIdsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,167:1\n1869#2,2:168\n*S KotlinDebug\n*F\n+ 1 GameTopicResourceQueries.kt\ncom/baicizhan/app/biz/game/GameTopicResourceQueries$QueryTopicResourceRecordByBookIdAndTopicIdsQuery\n*L\n128#1:168,2\n*E\n"})
    public final class b<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50564b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f50565c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e2 f50566d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e2 e2Var, @m80.k long j11, @m80.k Collection<Long> topicId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(topicId, "topicId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50566d = e2Var;
            this.f50564b = j11;
            this.f50565c = topicId;
        }

        public static final yz.g2 m(b bVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(bVar.f50564b));
            Iterator<T> it = bVar.f50565c.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                executeQuery.c(i11, Long.valueOf(((Number) it.next()).longValue()));
                i11++;
            }
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            String B = this.f50566d.B(this.f50565c.size());
            return this.f50566d.C().c5(null, u30.y.x("\n          |SELECT gameTopicResourceRecord.bookId, gameTopicResourceRecord.topicId, gameTopicResourceRecord.updateTime, gameTopicResourceRecord.payload, gameTopicResourceRecord.topicVersion FROM gameTopicResourceRecord\n          |WHERE bookId = ? AND topicId IN " + B + "\n          ", null, 1, null), mapper, this.f50565c.size() + 1, new x00.l() { // from class: f4.f2
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = e2.b.m(e2.b.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50566d.C().Y1(new String[]{"gameTopicResourceRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50566d.C().F6(new String[]{"gameTopicResourceRecord"}, listener);
        }

        public final long n() {
            return this.f50564b;
        }

        @m80.k
        public final Collection<Long> o() {
            return this.f50565c;
        }

        @m80.k
        public String toString() {
            return "GameTopicResource.sq:queryTopicResourceRecordByBookIdAndTopicIds";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameTopicResourceQueries", f = "GameTopicResourceQueries.kt", i = {}, l = {100}, m = "deleteAllResourceRecord", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50567a;

        /* renamed from: c, reason: collision with root package name */
        public int f50569c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50567a = obj;
            this.f50569c |= Integer.MIN_VALUE;
            return e2.this.U(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameTopicResourceQueries", f = "GameTopicResourceQueries.kt", i = {0}, l = {65}, m = "insertOrReplaceTopicResourceRecord", n = {"gameTopicResourceRecord"}, s = {"L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50570a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50571b;

        /* renamed from: d, reason: collision with root package name */
        public int f50573d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50571b = obj;
            this.f50573d |= Integer.MIN_VALUE;
            return e2.this.W(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements x00.p<Long, Long, p2> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f50574a = new e();

        public e() {
            super(2, p2.class, "<init>", "<init>(JJ)V", 0);
        }

        public final p2 a(long j11, long j12) {
            return new p2(j11, j12);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ p2 invoke(Long l11, Long l12) {
            return a(l11.longValue(), l12.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements x00.s<Long, Long, Long, String, Long, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f50575a = new f();

        public f() {
            super(5, g2.class, "<init>", "<init>(JJJLjava/lang/String;J)V", 0);
        }

        public final g2 a(long j11, long j12, long j13, String p32, long j14) {
            kotlin.jvm.internal.g0.p(p32, "p3");
            return new g2(j11, j12, j13, p32, j14);
        }

        @Override // x00.s
        public /* bridge */ /* synthetic */ g2 invoke(Long l11, Long l12, Long l13, String str, Long l14) {
            return a(l11.longValue(), l12.longValue(), l13.longValue(), str, l14.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameTopicResourceQueries", f = "GameTopicResourceQueries.kt", i = {0, 0, 0}, l = {89}, m = "updateTopicVersion", n = {"topicVersion", "bookId", "topicId"}, s = {"J$0", "J$1", "J$2"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f50576a;

        /* renamed from: b, reason: collision with root package name */
        public long f50577b;

        /* renamed from: c, reason: collision with root package name */
        public long f50578c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f50579d;

        /* renamed from: f, reason: collision with root package name */
        public int f50581f;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50579d = obj;
            this.f50581f |= Integer.MIN_VALUE;
            return e2.this.f0(0L, 0L, 0L, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 V(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameTopicResourceRecord");
        return yz.g2.f100423a;
    }

    public static final yz.g2 X(g2 g2Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(g2Var.h()));
        execute.c(1, Long.valueOf(g2Var.j()));
        execute.c(2, Long.valueOf(g2Var.l()));
        execute.bindString(3, g2Var.i());
        execute.c(4, Long.valueOf(g2Var.k()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameTopicResourceRecord");
        return yz.g2.f100423a;
    }

    public static final Object b0(x00.p pVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        return pVar.invoke(l11, l12);
    }

    public static final Object e0(x00.s sVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        String string = cursor.getString(3);
        kotlin.jvm.internal.g0.m(string);
        Long l14 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l14);
        return sVar.invoke(l11, l12, l13, string, l14);
    }

    public static final yz.g2 g0(long j11, long j12, long j13, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        execute.c(1, Long.valueOf(j12));
        execute.c(2, Long.valueOf(j13));
        return yz.g2.f100423a;
    }

    public static final yz.g2 h0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameTopicResourceRecord");
        return yz.g2.f100423a;
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
            boolean r0 = r13 instanceof f4.e2.c
            if (r0 == 0) goto L13
            r0 = r13
            f4.e2$c r0 = (f4.e2.c) r0
            int r1 = r0.f50569c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50569c = r1
            goto L18
        L13:
            f4.e2$c r0 = new f4.e2$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f50567a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50569c
            r3 = 1180091628(0x4656c4ec, float:13745.23)
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
            java.lang.String r7 = "DELETE FROM gameTopicResourceRecord"
            r8 = 0
            r9 = 0
            l.c r13 = l.e.a.a(r5, r6, r7, r8, r9, r10, r11)
            r0.f50569c = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L53
            return r1
        L53:
            java.lang.Number r13 = (java.lang.Number) r13
            long r0 = r13.longValue()
            f4.b2 r13 = new f4.b2
            r13.<init>()
            r12.D(r3, r13)
            java.lang.Long r13 = l00.a.g(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e2.U(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(@m80.k final f4.g2 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.e2.d
            if (r0 == 0) goto L13
            r0 = r10
            f4.e2$d r0 = (f4.e2.d) r0
            int r1 = r0.f50573d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50573d = r1
            goto L18
        L13:
            f4.e2$d r0 = new f4.e2$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50571b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50573d
            r3 = -2051283041(0xffffffff85bbe79f, float:-1.767048E-35)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50570a
            f4.g2 r9 = (f4.g2) r9
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
            f4.y1 r5 = new f4.y1
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO gameTopicResourceRecord (bookId, topicId, updateTime, payload, topicVersion)\nVALUES (?, ?, ?, ?, ?)"
            r7 = 5
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50570a = r9
            r0.f50573d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.z1 r0 = new f4.z1
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e2.W(f4.g2, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<p2> Z(long j11, @m80.k Collection<Long> topicId) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        return a0(j11, topicId, e.f50574a);
    }

    @m80.k
    public final <T> j.j<T> a0(long j11, @m80.k Collection<Long> topicId, @m80.k final x00.p<? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, topicId, new x00.l() { // from class: f4.c2
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object b02;
                b02 = e2.b0(x00.p.this, (l.d) obj);
                return b02;
            }
        });
    }

    @m80.k
    public final j.j<g2> c0(long j11, @m80.k Collection<Long> topicId) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        return d0(j11, topicId, f.f50575a);
    }

    @m80.k
    public final <T> j.j<T> d0(long j11, @m80.k Collection<Long> topicId, @m80.k final x00.s<? super Long, ? super Long, ? super Long, ? super String, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new b(this, j11, topicId, new x00.l() { // from class: f4.a2
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object e02;
                e02 = e2.e0(x00.s.this, (l.d) obj);
                return e02;
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
    public final java.lang.Object f0(final long r14, final long r16, final long r18, @m80.k j00.c<? super java.lang.Long> r20) {
        /*
            r13 = this;
            r0 = r20
            boolean r1 = r0 instanceof f4.e2.g
            if (r1 == 0) goto L15
            r1 = r0
            f4.e2$g r1 = (f4.e2.g) r1
            int r2 = r1.f50581f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f50581f = r2
            goto L1a
        L15:
            f4.e2$g r1 = new f4.e2$g
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f50579d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r1.f50581f
            r4 = -1068284837(0xffffffffc053445b, float:-3.301047)
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
            f4.w1 r6 = new f4.w1
            r7 = r14
            r9 = r16
            r11 = r18
            r6.<init>()
            java.lang.String r9 = "UPDATE gameTopicResourceRecord\nSET topicVersion = ?\nWHERE bookId = ? AND topicId = ?"
            r10 = 3
            l.c r0 = r0.v3(r3, r9, r10, r6)
            r1.f50576a = r14
            r9 = r16
            r1.f50577b = r9
            r1.f50578c = r11
            r1.f50581f = r5
            java.lang.Object r0 = r0.i(r1)
            if (r0 != r2) goto L63
            return r2
        L63:
            java.lang.Number r0 = (java.lang.Number) r0
            long r14 = r0.longValue()
            f4.x1 r0 = new f4.x1
            r0.<init>()
            r13.D(r4, r0)
            java.lang.Long r14 = l00.a.g(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e2.f0(long, long, long, j00.c):java.lang.Object");
    }
}
