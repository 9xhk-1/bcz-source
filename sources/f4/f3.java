package f4;

import f4.f3;
import j.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f3 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyRecordQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecordQueries.kt\ncom/baicizhan/app/biz/game/StudyRecordQueries$QueryStudyRecordByBookIdAndTopicIdsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n1869#2,2:199\n*S KotlinDebug\n*F\n+ 1 StudyRecordQueries.kt\ncom/baicizhan/app/biz/game/StudyRecordQueries$QueryStudyRecordByBookIdAndTopicIdsQuery\n*L\n169#1:199,2\n*E\n"})
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50589b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f50590c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f3 f50591d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f3 f3Var, @m80.k long j11, @m80.k Collection<Long> topicId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(topicId, "topicId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50591d = f3Var;
            this.f50589b = j11;
            this.f50590c = topicId;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50589b));
            Iterator<T> it = aVar.f50590c.iterator();
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
            String B = this.f50591d.B(this.f50590c.size());
            return this.f50591d.C().c5(null, "SELECT studyRecord.bookId, studyRecord.topicId, studyRecord.stage, studyRecord.isKilled, studyRecord.halfTime, studyRecord.nextReviewTime, studyRecord.learnTime, studyRecord.lastModifyTime FROM studyRecord WHERE bookId = ? AND topicId IN " + B + " AND topicId > 0", mapper, this.f50590c.size() + 1, new x00.l() { // from class: f4.e3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = f3.a.m(f3.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50591d.C().Y1(new String[]{"studyRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50591d.C().F6(new String[]{"studyRecord"}, listener);
        }

        public final long n() {
            return this.f50589b;
        }

        @m80.k
        public final Collection<Long> o() {
            return this.f50590c;
        }

        @m80.k
        public String toString() {
            return "StudyRecord.sq:queryStudyRecordByBookIdAndTopicIds";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50592b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f3 f50593c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f3 f3Var, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50593c = f3Var;
            this.f50592b = j11;
        }

        public static final yz.g2 m(b bVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(bVar.f50592b));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50593c.C().c5(-1106424379, "SELECT studyRecord.bookId, studyRecord.topicId, studyRecord.stage, studyRecord.isKilled, studyRecord.halfTime, studyRecord.nextReviewTime, studyRecord.learnTime, studyRecord.lastModifyTime FROM studyRecord WHERE bookId = ? AND topicId > 0", mapper, 1, new x00.l() { // from class: f4.g3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = f3.b.m(f3.b.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50593c.C().Y1(new String[]{"studyRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50593c.C().F6(new String[]{"studyRecord"}, listener);
        }

        public final long n() {
            return this.f50592b;
        }

        @m80.k
        public String toString() {
            return "StudyRecord.sq:queryStudyRecordByBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50594b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f3 f50595c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f3 f3Var, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50595c = f3Var;
            this.f50594b = j11;
        }

        public static final yz.g2 m(c cVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(cVar.f50594b));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50595c.C().c5(-1143332119, "SELECT studyRecord.bookId, studyRecord.topicId, studyRecord.stage, studyRecord.isKilled, studyRecord.halfTime, studyRecord.nextReviewTime, studyRecord.learnTime, studyRecord.lastModifyTime FROM studyRecord WHERE topicId = ?", mapper, 1, new x00.l() { // from class: f4.h3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = f3.c.m(f3.c.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50595c.C().Y1(new String[]{"studyRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50595c.C().F6(new String[]{"studyRecord"}, listener);
        }

        public final long n() {
            return this.f50594b;
        }

        @m80.k
        public String toString() {
            return "StudyRecord.sq:queryStudyRecordByTopicId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.StudyRecordQueries", f = "StudyRecordQueries.kt", i = {0}, l = {124}, m = "deleteStudyRecordByBookId", n = {"bookId"}, s = {"J$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f50596a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50597b;

        /* renamed from: d, reason: collision with root package name */
        public int f50599d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50597b = obj;
            this.f50599d |= Integer.MIN_VALUE;
            return f3.this.U(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.StudyRecordQueries", f = "StudyRecordQueries.kt", i = {0}, l = {110}, m = "insertOrReplace", n = {"studyRecord"}, s = {"L$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50600a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50601b;

        /* renamed from: d, reason: collision with root package name */
        public int f50603d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50601b = obj;
            this.f50603d |= Integer.MIN_VALUE;
            return f3.this.X(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements x00.v<Long, Long, Long, Long, Long, Long, Long, Long, w2> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f50604a = new f();

        public f() {
            super(8, w2.class, "<init>", "<init>(JJJJJJJJ)V", 0);
        }

        public final w2 a(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
            return new w2(j11, j12, j13, j14, j15, j16, j17, j18);
        }

        @Override // x00.v
        public /* bridge */ /* synthetic */ w2 invoke(Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18) {
            return a(l11.longValue(), l12.longValue(), l13.longValue(), l14.longValue(), l15.longValue(), l16.longValue(), l17.longValue(), l18.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements x00.v<Long, Long, Long, Long, Long, Long, Long, Long, w2> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f50605a = new g();

        public g() {
            super(8, w2.class, "<init>", "<init>(JJJJJJJJ)V", 0);
        }

        public final w2 a(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
            return new w2(j11, j12, j13, j14, j15, j16, j17, j18);
        }

        @Override // x00.v
        public /* bridge */ /* synthetic */ w2 invoke(Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18) {
            return a(l11.longValue(), l12.longValue(), l13.longValue(), l14.longValue(), l15.longValue(), l16.longValue(), l17.longValue(), l18.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements x00.v<Long, Long, Long, Long, Long, Long, Long, Long, w2> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f50606a = new h();

        public h() {
            super(8, w2.class, "<init>", "<init>(JJJJJJJJ)V", 0);
        }

        public final w2 a(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
            return new w2(j11, j12, j13, j14, j15, j16, j17, j18);
        }

        @Override // x00.v
        public /* bridge */ /* synthetic */ w2 invoke(Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18) {
            return a(l11.longValue(), l12.longValue(), l13.longValue(), l14.longValue(), l15.longValue(), l16.longValue(), l17.longValue(), l18.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 V(long j11, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        return yz.g2.f100423a;
    }

    public static final yz.g2 W(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("studyRecord");
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y(w2 w2Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(w2Var.k()));
        execute.c(1, Long.valueOf(w2Var.q()));
        execute.c(2, Long.valueOf(w2Var.p()));
        execute.c(3, Long.valueOf(w2Var.r()));
        execute.c(4, Long.valueOf(w2Var.l()));
        execute.c(5, Long.valueOf(w2Var.o()));
        execute.c(6, Long.valueOf(w2Var.n()));
        execute.c(7, Long.valueOf(w2Var.m()));
        return yz.g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 Z(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("studyRecord");
        return yz.g2.f100423a;
    }

    public static final Object c0(x00.v vVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l14);
        Long l15 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l15);
        Long l16 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l16);
        Long l17 = cursor.getLong(6);
        kotlin.jvm.internal.g0.m(l17);
        Long l18 = cursor.getLong(7);
        kotlin.jvm.internal.g0.m(l18);
        return vVar.invoke(l11, l12, l13, l14, l15, l16, l17, l18);
    }

    public static final Object f0(x00.v vVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l14);
        Long l15 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l15);
        Long l16 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l16);
        Long l17 = cursor.getLong(6);
        kotlin.jvm.internal.g0.m(l17);
        Long l18 = cursor.getLong(7);
        kotlin.jvm.internal.g0.m(l18);
        return vVar.invoke(l11, l12, l13, l14, l15, l16, l17, l18);
    }

    public static final Object i0(x00.v vVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l14);
        Long l15 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l15);
        Long l16 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l16);
        Long l17 = cursor.getLong(6);
        kotlin.jvm.internal.g0.m(l17);
        Long l18 = cursor.getLong(7);
        kotlin.jvm.internal.g0.m(l18);
        return vVar.invoke(l11, l12, l13, l14, l15, l16, l17, l18);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(final long r8, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof f4.f3.d
            if (r0 == 0) goto L13
            r0 = r10
            f4.f3$d r0 = (f4.f3.d) r0
            int r1 = r0.f50599d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50599d = r1
            goto L18
        L13:
            f4.f3$d r0 = new f4.f3$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50597b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50599d
            r3 = -667857646(0xffffffffd8314d12, float:-7.7977829E14)
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
            f4.c3 r5 = new f4.c3
            r5.<init>()
            java.lang.String r6 = "DELETE FROM studyRecord WHERE bookId = ?"
            l.c r10 = r10.v3(r2, r6, r4, r5)
            r0.f50596a = r8
            r0.f50599d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            java.lang.Number r10 = (java.lang.Number) r10
            long r8 = r10.longValue()
            f4.d3 r10 = new f4.d3
            r10.<init>()
            r7.D(r3, r10)
            java.lang.Long r8 = l00.a.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f3.U(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(@m80.k final f4.w2 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.f3.e
            if (r0 == 0) goto L13
            r0 = r10
            f4.f3$e r0 = (f4.f3.e) r0
            int r1 = r0.f50603d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50603d = r1
            goto L18
        L13:
            f4.f3$e r0 = new f4.f3$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50601b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50603d
            r3 = -1737987936(0xffffffff986868a0, float:-3.003812E-24)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50600a
            f4.w2 r9 = (f4.w2) r9
            kotlin.e.n(r10)
            goto L5f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.e.n(r10)
            l.e r10 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            f4.y2 r5 = new f4.y2
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO studyRecord(\n    bookId, topicId, stage, isKilled, halfTime, nextReviewTime, learnTime, lastModifyTime\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            r7 = 8
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50600a = r9
            r0.f50603d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.z2 r0 = new f4.z2
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f3.X(f4.w2, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<w2> a0(long j11) {
        return b0(j11, f.f50604a);
    }

    @m80.k
    public final <T> j.j<T> b0(long j11, @m80.k final x00.v<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new b(this, j11, new x00.l() { // from class: f4.a3
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object c02;
                c02 = f3.c0(x00.v.this, (l.d) obj);
                return c02;
            }
        });
    }

    @m80.k
    public final j.j<w2> d0(long j11, @m80.k Collection<Long> topicId) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        return e0(j11, topicId, g.f50605a);
    }

    @m80.k
    public final <T> j.j<T> e0(long j11, @m80.k Collection<Long> topicId, @m80.k final x00.v<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, topicId, new x00.l() { // from class: f4.b3
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object f02;
                f02 = f3.f0(x00.v.this, (l.d) obj);
                return f02;
            }
        });
    }

    @m80.k
    public final j.j<w2> g0(long j11) {
        return h0(j11, h.f50606a);
    }

    @m80.k
    public final <T> j.j<T> h0(long j11, @m80.k final x00.v<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new c(this, j11, new x00.l() { // from class: f4.x2
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object i02;
                i02 = f3.i0(x00.v.this, (l.d) obj);
                return i02;
            }
        });
    }
}
