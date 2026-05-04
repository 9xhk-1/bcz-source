package com.baicizhan.app.biz.game.uc.monetization;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s5.a f14938a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c6.b f14939b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.GetMemberPopupUC", f = "GetMemberPopupUC.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2}, l = {67, 68, 69}, m = "handleFreePop", n = {"sale", "todayNumber", "sale", "todayNumber", "showPopDate", "sale", "todayNumber", "showPopDate", "showCount"}, s = {"L$0", "J$0", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14940a;

        /* renamed from: b, reason: collision with root package name */
        public long f14941b;

        /* renamed from: c, reason: collision with root package name */
        public long f14942c;

        /* renamed from: d, reason: collision with root package name */
        public int f14943d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14944e;

        /* renamed from: g, reason: collision with root package name */
        public int f14946g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14944e = obj;
            this.f14946g |= Integer.MIN_VALUE;
            return i.this.c(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.GetMemberPopupUC", f = "GetMemberPopupUC.kt", i = {0, 0, 1, 1, 1}, l = {89, 90}, m = "handleSellPop", n = {"sale", "todayNumber", "sale", "todayNumber", "showPopDate"}, s = {"L$0", "J$0", "L$0", "J$0", "J$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14947a;

        /* renamed from: b, reason: collision with root package name */
        public long f14948b;

        /* renamed from: c, reason: collision with root package name */
        public long f14949c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14950d;

        /* renamed from: f, reason: collision with root package name */
        public int f14952f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14950d = obj;
            this.f14952f |= Integer.MIN_VALUE;
            return i.this.d(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.GetMemberPopupUC", f = "GetMemberPopupUC.kt", i = {1, 1, 2, 2, 3, 3, 3}, l = {22, 44, 48, 57}, m = "invoke", n = {"memberSaleInfo", "currentTime", "memberSaleInfo", "currentTime", "memberSaleInfo", "currentTime", "shouldShow"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14953a;

        /* renamed from: b, reason: collision with root package name */
        public long f14954b;

        /* renamed from: c, reason: collision with root package name */
        public int f14955c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14956d;

        /* renamed from: f, reason: collision with root package name */
        public int f14958f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14956d = obj;
            this.f14958f |= Integer.MIN_VALUE;
            return i.this.e(this);
        }
    }

    public i(@m80.k s5.a promotionPopupRepo, @m80.k c6.b userGameInfoRepo) {
        g0.p(promotionPopupRepo, "promotionPopupRepo");
        g0.p(userGameInfoRepo, "userGameInfoRepo");
        this.f14938a = promotionPopupRepo;
        this.f14939b = userGameInfoRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r1 == r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(u8.e r22, j00.c<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.i.c(u8.e, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r15 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(u8.e r14, j00.c<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.i.d(u8.e, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0079, code lost:
    
        if (r1 == r3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0213 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k j00.c<? super kotlin.Pair<u8.e, java.lang.Boolean>> r20) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.i.e(j00.c):java.lang.Object");
    }
}
