package f4;

import f4.y3;
import j.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class y3 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50872b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y3 f50873c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y3 y3Var, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50873c = y3Var;
            this.f50872b = j11;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50872b));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50873c.C().c5(1165941371, "SELECT topicWordPackRecord.topicId, topicWordPackRecord.wordPack, topicWordPackRecord.updatedAt FROM topicWordPackRecord WHERE topicId = ?", mapper, 1, new x00.l() { // from class: f4.x3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = y3.a.m(y3.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50873c.C().Y1(new String[]{"topicWordPackRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50873c.C().F6(new String[]{"topicWordPackRecord"}, listener);
        }

        public final long n() {
            return this.f50872b;
        }

        @m80.k
        public String toString() {
            return "TopicWordPack.sq:queryByTopicId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTopicWordPackQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicWordPackQueries.kt\ncom/baicizhan/app/biz/game/TopicWordPackQueries$QueryByTopicIdsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1869#2,2:134\n*S KotlinDebug\n*F\n+ 1 TopicWordPackQueries.kt\ncom/baicizhan/app/biz/game/TopicWordPackQueries$QueryByTopicIdsQuery\n*L\n124#1:134,2\n*E\n"})
    public final class b<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f50874b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y3 f50875c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k y3 y3Var, @m80.k Collection<Long> topicId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(topicId, "topicId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50875c = y3Var;
            this.f50874b = topicId;
        }

        public static final yz.g2 m(b bVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            Iterator<T> it = bVar.f50874b.iterator();
            int i11 = 0;
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
            String B = this.f50875c.B(this.f50874b.size());
            return this.f50875c.C().c5(null, "SELECT topicWordPackRecord.topicId, topicWordPackRecord.wordPack, topicWordPackRecord.updatedAt FROM topicWordPackRecord WHERE topicId IN " + B, mapper, this.f50874b.size(), new x00.l() { // from class: f4.z3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = y3.b.m(y3.b.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50875c.C().Y1(new String[]{"topicWordPackRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50875c.C().F6(new String[]{"topicWordPackRecord"}, listener);
        }

        @m80.k
        public final Collection<Long> n() {
            return this.f50874b;
        }

        @m80.k
        public String toString() {
            return "TopicWordPack.sq:queryByTopicIds";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.TopicWordPackQueries", f = "TopicWordPackQueries.kt", i = {}, l = {81}, m = "deleteAll", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50876a;

        /* renamed from: c, reason: collision with root package name */
        public int f50878c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50876a = obj;
            this.f50878c |= Integer.MIN_VALUE;
            return y3.this.U(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.TopicWordPackQueries", f = "TopicWordPackQueries.kt", i = {0}, l = {70}, m = "deleteByTopicId", n = {"topicId"}, s = {"J$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f50879a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50880b;

        /* renamed from: d, reason: collision with root package name */
        public int f50882d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50880b = obj;
            this.f50882d |= Integer.MIN_VALUE;
            return y3.this.W(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.TopicWordPackQueries", f = "TopicWordPackQueries.kt", i = {0}, l = {56}, m = "insertOrReplace", n = {"topicWordPackRecord"}, s = {"L$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50883a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50884b;

        /* renamed from: d, reason: collision with root package name */
        public int f50886d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50884b = obj;
            this.f50886d |= Integer.MIN_VALUE;
            return y3.this.Z(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements x00.q<Long, String, Long, a4> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f50887a = new f();

        public f() {
            super(3, a4.class, "<init>", "<init>(JLjava/lang/String;J)V", 0);
        }

        public final a4 a(long j11, String p12, long j12) {
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new a4(j11, p12, j12);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ a4 invoke(Long l11, String str, Long l12) {
            return a(l11.longValue(), str, l12.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements x00.q<Long, String, Long, a4> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f50888a = new g();

        public g() {
            super(3, a4.class, "<init>", "<init>(JLjava/lang/String;J)V", 0);
        }

        public final a4 a(long j11, String p12, long j12) {
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new a4(j11, p12, j12);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ a4 invoke(Long l11, String str, Long l12) {
            return a(l11.longValue(), str, l12.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 V(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("topicWordPackRecord");
        return yz.g2.f100423a;
    }

    public static final yz.g2 X(long j11, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("topicWordPackRecord");
        return yz.g2.f100423a;
    }

    public static final yz.g2 a0(a4 a4Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(a4Var.f()));
        execute.bindString(1, a4Var.h());
        execute.c(2, Long.valueOf(a4Var.g()));
        return yz.g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 b0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("topicWordPackRecord");
        return yz.g2.f100423a;
    }

    public static final Object e0(x00.q qVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        String string = cursor.getString(1);
        kotlin.jvm.internal.g0.m(string);
        Long l12 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l12);
        return qVar.invoke(l11, string, l12);
    }

    public static final Object h0(x00.q qVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        String string = cursor.getString(1);
        kotlin.jvm.internal.g0.m(string);
        Long l12 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l12);
        return qVar.invoke(l11, string, l12);
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
            boolean r0 = r13 instanceof f4.y3.c
            if (r0 == 0) goto L13
            r0 = r13
            f4.y3$c r0 = (f4.y3.c) r0
            int r1 = r0.f50878c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50878c = r1
            goto L18
        L13:
            f4.y3$c r0 = new f4.y3$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f50876a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50878c
            r3 = -653824538(0xffffffffd9076de6, float:-2.38249728E15)
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
            java.lang.String r7 = "DELETE FROM topicWordPackRecord"
            r8 = 0
            r9 = 0
            l.c r13 = l.e.a.a(r5, r6, r7, r8, r9, r10, r11)
            r0.f50878c = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L53
            return r1
        L53:
            java.lang.Number r13 = (java.lang.Number) r13
            long r0 = r13.longValue()
            f4.v3 r13 = new f4.v3
            r13.<init>()
            r12.D(r3, r13)
            java.lang.Long r13 = l00.a.g(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.y3.U(j00.c):java.lang.Object");
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
            boolean r0 = r10 instanceof f4.y3.d
            if (r0 == 0) goto L13
            r0 = r10
            f4.y3$d r0 = (f4.y3.d) r0
            int r1 = r0.f50882d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50882d = r1
            goto L18
        L13:
            f4.y3$d r0 = new f4.y3$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50880b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50882d
            r3 = -289505576(0xffffffffeebe7ed8, float:-2.9477748E28)
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
            f4.s3 r5 = new f4.s3
            r5.<init>()
            java.lang.String r6 = "DELETE FROM topicWordPackRecord WHERE topicId = ?"
            l.c r10 = r10.v3(r2, r6, r4, r5)
            r0.f50879a = r8
            r0.f50882d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            java.lang.Number r10 = (java.lang.Number) r10
            long r8 = r10.longValue()
            f4.t3 r10 = new f4.t3
            r10.<init>()
            r7.D(r3, r10)
            java.lang.Long r8 = l00.a.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.y3.W(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(@m80.k final f4.a4 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.y3.e
            if (r0 == 0) goto L13
            r0 = r10
            f4.y3$e r0 = (f4.y3.e) r0
            int r1 = r0.f50886d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50886d = r1
            goto L18
        L13:
            f4.y3$e r0 = new f4.y3$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50884b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50886d
            r3 = -2107447672(0xffffffff8262e688, float:-1.6670017E-37)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50883a
            f4.a4 r9 = (f4.a4) r9
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
            f4.q3 r5 = new f4.q3
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO topicWordPackRecord(topicId, wordPack, updatedAt)\nVALUES (?, ?, ?)"
            r7 = 3
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50883a = r9
            r0.f50886d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.r3 r0 = new f4.r3
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.y3.Z(f4.a4, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<a4> c0(long j11) {
        return d0(j11, f.f50887a);
    }

    @m80.k
    public final <T> j.j<T> d0(long j11, @m80.k final x00.q<? super Long, ? super String, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: f4.w3
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object e02;
                e02 = y3.e0(x00.q.this, (l.d) obj);
                return e02;
            }
        });
    }

    @m80.k
    public final j.j<a4> f0(@m80.k Collection<Long> topicId) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        return g0(topicId, g.f50888a);
    }

    @m80.k
    public final <T> j.j<T> g0(@m80.k Collection<Long> topicId, @m80.k final x00.q<? super Long, ? super String, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new b(this, topicId, new x00.l() { // from class: f4.u3
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object h02;
                h02 = y3.h0(x00.q.this, (l.d) obj);
                return h02;
            }
        });
    }
}
