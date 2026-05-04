package com.baicizhan.app.biz.game.uc.advertisement;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import l6.i;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nFetchPopupAdUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchPopupAdUC.kt\ncom/baicizhan/app/biz/game/uc/advertisement/FetchPopupAdUC\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final t5.a f14432a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f14433b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.advertisement.FetchPopupAdUC", f = "FetchPopupAdUC.kt", i = {1, 1}, l = {14, 15}, m = "invoke", n = {"it", "$i$a$-let-FetchPopupAdUC$invoke$3"}, s = {"L$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14434a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14435b;

        /* renamed from: c, reason: collision with root package name */
        public int f14436c;

        /* renamed from: d, reason: collision with root package name */
        public int f14437d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14438e;

        /* renamed from: g, reason: collision with root package name */
        public int f14440g;

        public a(c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f14438e = obj;
            this.f14440g |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    public b(@k t5.a notificationRepo, @k i downloadFileUC) {
        g0.p(notificationRepo, "notificationRepo");
        g0.p(downloadFileUC, "downloadFileUC");
        this.f14432a = notificationRepo;
        this.f14433b = downloadFileUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super r8.b> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.baicizhan.app.biz.game.uc.advertisement.b.a
            if (r0 == 0) goto L13
            r0 = r12
            com.baicizhan.app.biz.game.uc.advertisement.b$a r0 = (com.baicizhan.app.biz.game.uc.advertisement.b.a) r0
            int r1 = r0.f14440g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14440g = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.advertisement.b$a r0 = new com.baicizhan.app.biz.game.uc.advertisement.b$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f14438e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14440g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            int r1 = r0.f14437d
            java.lang.Object r2 = r0.f14435b
            r8.b r2 = (r8.b) r2
            java.lang.Object r0 = r0.f14434a
            r8.b r0 = (r8.b) r0
            kotlin.e.n(r12)
            r0 = r2
            goto L89
        L37:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3f:
            kotlin.e.n(r12)
            goto L51
        L43:
            kotlin.e.n(r12)
            t5.a r12 = r11.f14432a
            r0.f14440g = r4
            java.lang.Object r12 = r12.c(r0)
            if (r12 != r1) goto L51
            goto L84
        L51:
            r8.b r12 = (r8.b) r12
            r2 = 0
            if (r12 == 0) goto L9a
            java.lang.String r5 = r12.f83602e
            r6 = 0
            if (r5 == 0) goto L63
            boolean r5 = u30.k0.O3(r5)
            if (r5 == 0) goto L62
            goto L63
        L62:
            r4 = r6
        L63:
            if (r4 != 0) goto L66
            goto L67
        L66:
            r12 = r2
        L67:
            if (r12 == 0) goto L9a
            l6.i r2 = r11.f14433b
            java.lang.String r4 = r12.f83602e
            kotlin.jvm.internal.g0.m(r4)
            java.lang.Object r5 = l00.k.a(r12)
            r0.f14434a = r5
            r0.f14435b = r12
            r0.f14436c = r6
            r0.f14437d = r6
            r0.f14440g = r3
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L85
        L84:
            return r1
        L85:
            r1 = r0
            r0 = r12
            r12 = r1
            r1 = r6
        L89:
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            r9 = 239(0xef, float:3.35E-43)
            r10 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r8.b r12 = r8.b.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.advertisement.b.a(j00.c):java.lang.Object");
    }
}
