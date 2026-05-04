package f4;

import f4.p3;
import j.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStudyRecordSynQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecordSynQueries.kt\ncom/baicizhan/app/biz/game/StudyRecordSynQueries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1869#2,2:96\n*S KotlinDebug\n*F\n+ 1 StudyRecordSynQueries.kt\ncom/baicizhan/app/biz/game/StudyRecordSynQueries\n*L\n61#1:96,2\n*E\n"})
/* loaded from: classes3.dex */
public final class p3 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50785b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p3 f50786c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p3 p3Var, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50786c = p3Var;
            this.f50785b = j11;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50785b));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50786c.C().c5(546476132, "SELECT studyRecordSyn.id, studyRecordSyn.bookId, studyRecordSyn.topicId, studyRecordSyn.lastModifyTime\nFROM studyRecordSyn\nWHERE bookId = ? AND topicId > 0", mapper, 1, new x00.l() { // from class: f4.o3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = p3.a.m(p3.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50786c.C().Y1(new String[]{"studyRecordSyn"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50786c.C().F6(new String[]{"studyRecordSyn"}, listener);
        }

        public final long n() {
            return this.f50785b;
        }

        @m80.k
        public String toString() {
            return "StudyRecordSyn.sq:queryStudyRecordSynsByBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.StudyRecordSynQueries", f = "StudyRecordSynQueries.kt", i = {0, 0}, l = {64}, m = "deleteStudyRecordSynByIds", n = {"id", "idIndexes"}, s = {"L$0", "L$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50787a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50788b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50789c;

        /* renamed from: e, reason: collision with root package name */
        public int f50791e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50789c = obj;
            this.f50791e |= Integer.MIN_VALUE;
            return p3.this.R(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.StudyRecordSynQueries", f = "StudyRecordSynQueries.kt", i = {0}, l = {44}, m = "insertOrReplaceStudyRecordSyn", n = {"studyRecordSyn"}, s = {"L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50792a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50793b;

        /* renamed from: d, reason: collision with root package name */
        public int f50795d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50793b = obj;
            this.f50795d |= Integer.MIN_VALUE;
            return p3.this.U(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements x00.r<Long, Long, Long, Long, i3> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f50796a = new d();

        public d() {
            super(4, i3.class, "<init>", "<init>(JJJJ)V", 0);
        }

        public final i3 a(long j11, long j12, long j13, long j14) {
            return new i3(j11, j12, j13, j14);
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ i3 invoke(Long l11, Long l12, Long l13, Long l14) {
            return a(l11.longValue(), l12.longValue(), l13.longValue(), l14.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 S(Collection collection, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            execute.c(i11, Long.valueOf(((Number) it.next()).longValue()));
            i11++;
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("studyRecordSyn");
        return yz.g2.f100423a;
    }

    public static final yz.g2 V(i3 i3Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(i3Var.g()));
        execute.c(1, Long.valueOf(i3Var.j()));
        execute.c(2, Long.valueOf(i3Var.i()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 W(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("studyRecordSyn");
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(@m80.k final java.util.Collection<java.lang.Long> r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.p3.b
            if (r0 == 0) goto L13
            r0 = r10
            f4.p3$b r0 = (f4.p3.b) r0
            int r1 = r0.f50791e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50791e = r1
            goto L18
        L13:
            f4.p3$b r0 = new f4.p3$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50789c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50791e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.f50788b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f50787a
            java.util.Collection r9 = (java.util.Collection) r9
            kotlin.e.n(r10)
            goto L85
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.e.n(r10)
            int r10 = r9.size()
            java.lang.String r10 = r8.B(r10)
            l.e r2 = r8.C()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "\n        |DELETE FROM studyRecordSyn\n        |WHERE id IN "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r5 = " OR topicId <= 0\n        "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            java.lang.String r4 = u30.y.x(r4, r5, r3, r5)
            int r6 = r9.size()
            f4.j3 r7 = new f4.j3
            r7.<init>()
            l.c r2 = r2.v3(r5, r4, r6, r7)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50787a = r9
            java.lang.Object r9 = l00.k.a(r10)
            r0.f50788b = r9
            r0.f50791e = r3
            java.lang.Object r10 = r2.i(r0)
            if (r10 != r1) goto L85
            return r1
        L85:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.k3 r0 = new f4.k3
            r0.<init>()
            r1 = -2094785124(0xffffffff83241d9c, float:-4.822926E-37)
            r8.D(r1, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.p3.R(java.util.Collection, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(@m80.k final f4.i3 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.p3.c
            if (r0 == 0) goto L13
            r0 = r10
            f4.p3$c r0 = (f4.p3.c) r0
            int r1 = r0.f50795d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50795d = r1
            goto L18
        L13:
            f4.p3$c r0 = new f4.p3$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50793b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50795d
            r3 = -368786342(0xffffffffea04c45a, float:-4.0126363E25)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50792a
            f4.i3 r9 = (f4.i3) r9
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
            f4.m3 r5 = new f4.m3
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO studyRecordSyn (bookId, topicId, lastModifyTime)\nVALUES (?, ?, ?)"
            r7 = 3
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50792a = r9
            r0.f50795d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.n3 r0 = new f4.n3
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.p3.U(f4.i3, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<i3> X(long j11) {
        return Y(j11, d.f50796a);
    }

    @m80.k
    public final <T> j.j<T> Y(long j11, @m80.k final x00.r<? super Long, ? super Long, ? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: f4.l3
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object Z;
                Z = p3.Z(x00.r.this, (l.d) obj);
                return Z;
            }
        });
    }
}
