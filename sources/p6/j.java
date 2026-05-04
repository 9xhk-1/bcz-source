package p6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nGetDailyReviewCountUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetDailyReviewCountUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/GetDailyReviewCountUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,31:1\n774#2:32\n865#2,2:33\n1491#2:35\n1516#2,3:36\n1519#2,3:46\n382#3,7:39\n*S KotlinDebug\n*F\n+ 1 GetDailyReviewCountUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/GetDailyReviewCountUC\n*L\n24#1:32\n24#1:33,2\n25#1:35\n25#1:36,3\n25#1:46,3\n25#1:39,7\n*E\n"})
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z5.e f79231a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.GetDailyReviewCountUC", f = "GetDailyReviewCountUC.kt", i = {0, 0, 0}, l = {22}, m = "getDailyReviewCount", n = {"studyRecords", "bookId", "today"}, s = {"L$0", "J$0", "J$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79232a;

        /* renamed from: b, reason: collision with root package name */
        public long f79233b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79234c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f79235d;

        /* renamed from: f, reason: collision with root package name */
        public int f79237f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79235d = obj;
            this.f79237f |= Integer.MIN_VALUE;
            return j.this.a(0L, null, this);
        }
    }

    public j(@m80.k z5.e dailyReviewRepo) {
        kotlin.jvm.internal.g0.p(dailyReviewRepo, "dailyReviewRepo");
        this.f79231a = dailyReviewRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, @m80.k java.util.List<f4.w2> r11, @m80.k j00.c<? super java.lang.Integer> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof p6.j.a
            if (r0 == 0) goto L14
            r0 = r12
            p6.j$a r0 = (p6.j.a) r0
            int r1 = r0.f79237f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f79237f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p6.j$a r0 = new p6.j$a
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f79235d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f79237f
            r7 = 1
            if (r1 == 0) goto L39
            if (r1 != r7) goto L31
            long r9 = r6.f79233b
            java.lang.Object r11 = r6.f79234c
            java.util.List r11 = (java.util.List) r11
            kotlin.e.n(r12)
            goto L53
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.e.n(r12)
            long r4 = w3.g.l()
            z5.e r1 = r8.f79231a
            r6.f79234c = r11
            r6.f79232a = r9
            r6.f79233b = r4
            r6.f79237f = r7
            r2 = r9
            java.lang.Object r12 = r1.a(r2, r4, r6)
            if (r12 != r0) goto L52
            return r0
        L52:
            r9 = r4
        L53:
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L64:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r11.next()
            r2 = r1
            f4.w2 r2 = (f4.w2) r2
            boolean r3 = z5.i.i(r2, r9)
            if (r3 == 0) goto L64
            boolean r3 = z5.i.e(r2)
            if (r3 != 0) goto L64
            boolean r2 = z5.i.f(r2)
            if (r2 != 0) goto L64
            r0.add(r1)
            goto L64
        L87:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L90:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb9
            java.lang.Object r1 = r0.next()
            r2 = r1
            f4.w2 r2 = (f4.w2) r2
            boolean r2 = z5.i.c(r2, r9)
            java.lang.Boolean r2 = l00.a.a(r2)
            java.lang.Object r3 = r11.get(r2)
            if (r3 != 0) goto Lb3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11.put(r2, r3)
        Lb3:
            java.util.List r3 = (java.util.List) r3
            r3.add(r1)
            goto L90
        Lb9:
            java.lang.Boolean r9 = l00.a.a(r7)
            java.lang.Object r9 = r11.get(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto Lca
            int r9 = r9.size()
            goto Lcb
        Lca:
            r9 = 0
        Lcb:
            int r9 = r9 + r12
            java.lang.Integer r9 = l00.a.f(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.j.a(long, java.util.List, j00.c):java.lang.Object");
    }
}
