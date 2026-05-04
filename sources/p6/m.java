package p6;

import c40.r0;
import f4.w2;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {m.class})
@u0({"SMAP\nMergeStudyRemoteUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MergeStudyRemoteUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/MergeStudyRemoteUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1208#2,2:71\n1236#2,4:73\n1563#2:77\n1634#2,3:78\n1208#2,2:81\n1236#2,4:83\n827#2:87\n855#2,2:88\n1788#2,4:90\n*S KotlinDebug\n*F\n+ 1 MergeStudyRemoteUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/MergeStudyRemoteUC\n*L\n26#1:71,2\n26#1:73,4\n28#1:77\n28#1:78,3\n38#1:81,2\n38#1:83,4\n40#1:87\n40#1:88,2\n60#1:90,4\n*E\n"})
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z5.g f79264a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z5.e f79265b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.MergeStudyRemoteUC", f = "MergeStudyRemoteUC.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {25, 41}, m = "invoke", n = {"remote", "bookId", "remote", "local", "localByTopicId", "mergedFromRemote", "localOnlyRecords", "bookId", "today"}, s = {"L$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79266a;

        /* renamed from: b, reason: collision with root package name */
        public long f79267b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79268c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79269d;

        /* renamed from: e, reason: collision with root package name */
        public Object f79270e;

        /* renamed from: f, reason: collision with root package name */
        public Object f79271f;

        /* renamed from: g, reason: collision with root package name */
        public Object f79272g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f79273h;

        /* renamed from: j, reason: collision with root package name */
        public int f79275j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79273h = obj;
            this.f79275j |= Integer.MIN_VALUE;
            return m.this.c(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.MergeStudyRemoteUC$invoke$2", f = "MergeStudyRemoteUC.kt", i = {0, 0, 1, 1, 2, 2}, l = {43, 44, 45}, m = "invokeSuspend", n = {"records", "$i$a$-also-MergeStudyRemoteUC$invoke$2$1", "records", "$i$a$-also-MergeStudyRemoteUC$invoke$2$1", "records", "$i$a$-also-MergeStudyRemoteUC$invoke$2$1"}, s = {"L$2", "I$0", "L$2", "I$0", "L$1", "I$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends w2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f79276a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79277b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79278c;

        /* renamed from: d, reason: collision with root package name */
        public long f79279d;

        /* renamed from: e, reason: collision with root package name */
        public int f79280e;

        /* renamed from: f, reason: collision with root package name */
        public int f79281f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Map<Long, w2> f79282g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ m f79283h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f79284i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f79285j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<Long, w2> map, m mVar, long j11, long j12, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f79282g = map;
            this.f79283h = mVar;
            this.f79284i = j11;
            this.f79285j = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f79282g, this.f79283h, this.f79284i, this.f79285j, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<w2>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00b5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r14.f79281f
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L50
                if (r1 == r4) goto L3b
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r0 = r14.f79277b
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r14.f79276a
                java.util.List r0 = (java.util.List) r0
                kotlin.e.n(r15)
                return r0
            L1d:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L25:
                int r1 = r14.f79280e
                long r3 = r14.f79279d
                java.lang.Object r5 = r14.f79278c
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r14.f79277b
                p6.m r6 = (p6.m) r6
                java.lang.Object r7 = r14.f79276a
                java.util.List r7 = (java.util.List) r7
                kotlin.e.n(r15)
                r11 = r14
                goto L9b
            L3b:
                int r1 = r14.f79280e
                long r4 = r14.f79279d
                java.lang.Object r6 = r14.f79278c
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r14.f79277b
                p6.m r7 = (p6.m) r7
                java.lang.Object r8 = r14.f79276a
                java.util.List r8 = (java.util.List) r8
                kotlin.e.n(r15)
                r11 = r14
                goto L80
            L50:
                kotlin.e.n(r15)
                java.util.Map<java.lang.Long, f4.w2> r15 = r14.f79282g
                java.util.Collection r15 = r15.values()
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.List r10 = a00.r0.a6(r15)
                p6.m r5 = r14.f79283h
                long r6 = r14.f79284i
                long r8 = r14.f79285j
                r14.f79276a = r10
                r14.f79277b = r5
                r14.f79278c = r10
                r14.f79279d = r6
                r15 = 0
                r14.f79280e = r15
                r14.f79281f = r4
                r11 = r14
                java.lang.Object r1 = p6.m.b(r5, r6, r8, r10, r11)
                if (r1 != r0) goto L7a
                goto Lb4
            L7a:
                r12 = r6
                r7 = r5
                r4 = r12
                r1 = r15
                r6 = r10
                r8 = r6
            L80:
                z5.g r15 = p6.m.a(r7)
                r11.f79276a = r8
                r11.f79277b = r7
                r11.f79278c = r6
                r11.f79279d = r4
                r11.f79280e = r1
                r11.f79281f = r3
                java.lang.Object r15 = r15.b(r4, r14)
                if (r15 != r0) goto L97
                goto Lb4
            L97:
                r3 = r4
                r5 = r6
                r6 = r7
                r7 = r8
            L9b:
                z5.g r15 = p6.m.a(r6)
                r11.f79276a = r7
                java.lang.Object r6 = l00.k.a(r5)
                r11.f79277b = r6
                r6 = 0
                r11.f79278c = r6
                r11.f79280e = r1
                r11.f79281f = r2
                java.lang.Object r15 = r15.e(r3, r5, r14)
                if (r15 != r0) goto Lb5
            Lb4:
                return r0
            Lb5:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p6.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends w2>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<w2>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.MergeStudyRemoteUC", f = "MergeStudyRemoteUC.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {63, 64}, m = "updateDailyReviewCount", n = {"remoteRecords", "bookId", "dateNumber", "count", "remoteRecords", "bookId", "dateNumber", "count"}, s = {"L$0", "J$0", "J$1", "I$0", "L$0", "J$0", "J$1", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79286a;

        /* renamed from: b, reason: collision with root package name */
        public long f79287b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79288c;

        /* renamed from: d, reason: collision with root package name */
        public int f79289d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f79290e;

        /* renamed from: g, reason: collision with root package name */
        public int f79292g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79290e = obj;
            this.f79292g |= Integer.MIN_VALUE;
            return m.this.d(0L, 0L, null, this);
        }
    }

    public m(@m80.k z5.g recordRepo, @m80.k z5.e dailyReviewRepo) {
        kotlin.jvm.internal.g0.p(recordRepo, "recordRepo");
        kotlin.jvm.internal.g0.p(dailyReviewRepo, "dailyReviewRepo");
        this.f79264a = recordRepo;
        this.f79265b = dailyReviewRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0074, code lost:
    
        if (r3 == r9) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[LOOP:0: B:20:0x0097->B:22:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[LOOP:2: B:40:0x011f->B:42:0x0125, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r21, @m80.k java.util.List<p8.v0> r23, @m80.k j00.c<? super yz.g2> r24) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.m.c(long, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r9, long r11, java.util.List<f4.w2> r13, j00.c<? super yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.m.d(long, long, java.util.List, j00.c):java.lang.Object");
    }
}
