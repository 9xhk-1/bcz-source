package f4;

import f4.u1;
import j.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u1 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nGameTopicRemoteVersionQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameTopicRemoteVersionQueries.kt\ncom/baicizhan/app/biz/game/GameTopicRemoteVersionQueries$QueryByBookIdAndTopicIdsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1869#2,2:99\n*S KotlinDebug\n*F\n+ 1 GameTopicRemoteVersionQueries.kt\ncom/baicizhan/app/biz/game/GameTopicRemoteVersionQueries$QueryByBookIdAndTopicIdsQuery\n*L\n89#1:99,2\n*E\n"})
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50823b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f50824c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u1 f50825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u1 u1Var, @m80.k long j11, @m80.k Collection<Long> topicId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(topicId, "topicId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50825d = u1Var;
            this.f50823b = j11;
            this.f50824c = topicId;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50823b));
            Iterator<T> it = aVar.f50824c.iterator();
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
            String B = this.f50825d.B(this.f50824c.size());
            return this.f50825d.C().c5(null, u30.y.x("\n          |SELECT gameTopicRemoteVersionRecord.bookId, gameTopicRemoteVersionRecord.topicId, gameTopicRemoteVersionRecord.remoteVersion FROM gameTopicRemoteVersionRecord\n          |WHERE bookId = ? AND topicId IN " + B + "\n          ", null, 1, null), mapper, this.f50824c.size() + 1, new x00.l() { // from class: f4.t1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = u1.a.m(u1.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50825d.C().Y1(new String[]{"gameTopicRemoteVersionRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50825d.C().F6(new String[]{"gameTopicRemoteVersionRecord"}, listener);
        }

        public final long n() {
            return this.f50823b;
        }

        @m80.k
        public final Collection<Long> o() {
            return this.f50824c;
        }

        @m80.k
        public String toString() {
            return "GameTopicRemoteVersion.sq:queryByBookIdAndTopicIds";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameTopicRemoteVersionQueries", f = "GameTopicRemoteVersionQueries.kt", i = {}, l = {61}, m = "deleteAll", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50826a;

        /* renamed from: c, reason: collision with root package name */
        public int f50828c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50826a = obj;
            this.f50828c |= Integer.MIN_VALUE;
            return u1.this.R(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameTopicRemoteVersionQueries", f = "GameTopicRemoteVersionQueries.kt", i = {0, 0, 0}, l = {50}, m = "insertOrReplace", n = {"bookId", "topicId", "remoteVersion"}, s = {"J$0", "J$1", "J$2"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f50829a;

        /* renamed from: b, reason: collision with root package name */
        public long f50830b;

        /* renamed from: c, reason: collision with root package name */
        public long f50831c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f50832d;

        /* renamed from: f, reason: collision with root package name */
        public int f50834f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50832d = obj;
            this.f50834f |= Integer.MIN_VALUE;
            return u1.this.T(0L, 0L, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements x00.q<Long, Long, Long, v1> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f50835a = new d();

        public d() {
            super(3, v1.class, "<init>", "<init>(JJJ)V", 0);
        }

        public final v1 a(long j11, long j12, long j13) {
            return new v1(j11, j12, j13);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ v1 invoke(Long l11, Long l12, Long l13) {
            return a(l11.longValue(), l12.longValue(), l13.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 S(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameTopicRemoteVersionRecord");
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(long j11, long j12, long j13, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        execute.c(1, Long.valueOf(j12));
        execute.c(2, Long.valueOf(j13));
        return yz.g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 V(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameTopicRemoteVersionRecord");
        return yz.g2.f100423a;
    }

    public static final Object Y(x00.q qVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        return qVar.invoke(l11, l12, l13);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(@m80.k j00.c<? super java.lang.Long> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof f4.u1.b
            if (r0 == 0) goto L13
            r0 = r13
            f4.u1$b r0 = (f4.u1.b) r0
            int r1 = r0.f50828c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50828c = r1
            goto L18
        L13:
            f4.u1$b r0 = new f4.u1$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f50826a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50828c
            r3 = -1469313373(0xffffffffa86c0ea3, float:-1.31038055E-14)
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
            java.lang.String r7 = "DELETE FROM gameTopicRemoteVersionRecord"
            r8 = 0
            r9 = 0
            l.c r13 = l.e.a.a(r5, r6, r7, r8, r9, r10, r11)
            r0.f50828c = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L53
            return r1
        L53:
            java.lang.Number r13 = (java.lang.Number) r13
            long r0 = r13.longValue()
            f4.p1 r13 = new f4.p1
            r13.<init>()
            r12.D(r3, r13)
            java.lang.Long r13 = l00.a.g(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.u1.R(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(final long r14, final long r16, final long r18, @m80.k j00.c<? super java.lang.Long> r20) {
        /*
            r13 = this;
            r0 = r20
            boolean r1 = r0 instanceof f4.u1.c
            if (r1 == 0) goto L15
            r1 = r0
            f4.u1$c r1 = (f4.u1.c) r1
            int r2 = r1.f50834f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f50834f = r2
            goto L1a
        L15:
            f4.u1$c r1 = new f4.u1$c
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f50832d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r1.f50834f
            r4 = 701056389(0x29c94585, float:8.938253E-14)
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
            f4.r1 r6 = new f4.r1
            r7 = r14
            r9 = r16
            r11 = r18
            r6.<init>()
            java.lang.String r9 = "INSERT OR REPLACE INTO gameTopicRemoteVersionRecord (bookId, topicId, remoteVersion)\nVALUES (?, ?, ?)"
            r10 = 3
            l.c r0 = r0.v3(r3, r9, r10, r6)
            r1.f50829a = r14
            r9 = r16
            r1.f50830b = r9
            r1.f50831c = r11
            r1.f50834f = r5
            java.lang.Object r0 = r0.i(r1)
            if (r0 != r2) goto L63
            return r2
        L63:
            java.lang.Number r0 = (java.lang.Number) r0
            long r14 = r0.longValue()
            f4.s1 r0 = new f4.s1
            r0.<init>()
            r13.D(r4, r0)
            java.lang.Long r14 = l00.a.g(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.u1.T(long, long, long, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<v1> W(long j11, @m80.k Collection<Long> topicId) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        return X(j11, topicId, d.f50835a);
    }

    @m80.k
    public final <T> j.j<T> X(long j11, @m80.k Collection<Long> topicId, @m80.k final x00.q<? super Long, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, topicId, new x00.l() { // from class: f4.q1
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object Y;
                Y = u1.Y(x00.q.this, (l.d) obj);
                return Y;
            }
        });
    }
}
