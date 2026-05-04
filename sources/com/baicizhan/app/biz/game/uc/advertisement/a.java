package com.baicizhan.app.biz.game.uc.advertisement;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nCheckFetchTopAdUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckFetchTopAdUC.kt\ncom/baicizhan/app/biz/game/uc/advertisement/CheckFetchTopAdUC\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final k5.a f14425a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.advertisement.CheckFetchTopAdUC", f = "CheckFetchTopAdUC.kt", i = {1, 1}, l = {14, 15}, m = "invoke", n = {"$this$invoke_u24lambda_u240", "$i$a$-runCatching-CheckFetchTopAdUC$invoke$2"}, s = {"L$0", "I$0"}, v = 1)
    /* renamed from: com.baicizhan.app.biz.game.uc.advertisement.a$a, reason: collision with other inner class name */
    public static final class C0207a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f14426a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14427b;

        /* renamed from: c, reason: collision with root package name */
        public int f14428c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14429d;

        /* renamed from: f, reason: collision with root package name */
        public int f14431f;

        public C0207a(c<? super C0207a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f14429d = obj;
            this.f14431f |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    public a(@k k5.a topAdvertisementRepo) {
        g0.p(topAdvertisementRepo, "topAdvertisementRepo");
        this.f14425a = topAdvertisementRepo;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(7:11|12|13|14|(1:16)|17|18)(2:21|22))(1:23))(3:29|(1:31)|28)|24|(1:26)|17|18))|34|6|7|(0)(0)|24|(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r9.a(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0030, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r0 = kotlin.Result.Companion;
        r9 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x0075, B:26:0x005f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.baicizhan.app.biz.game.uc.advertisement.a.C0207a
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.app.biz.game.uc.advertisement.a$a r0 = (com.baicizhan.app.biz.game.uc.advertisement.a.C0207a) r0
            int r1 = r0.f14431f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14431f = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.advertisement.a$a r0 = new com.baicizhan.app.biz.game.uc.advertisement.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14429d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14431f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f14427b
            com.baicizhan.app.biz.game.uc.advertisement.a r0 = (com.baicizhan.app.biz.game.uc.advertisement.a) r0
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L30
            goto L75
        L30:
            r9 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            long r4 = r0.f14426a
            kotlin.e.n(r9)
            goto L55
        L40:
            kotlin.e.n(r9)
            long r5 = w3.g.l()
            k5.a r9 = r8.f14425a
            r0.f14426a = r5
            r0.f14431f = r4
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r1) goto L54
            goto L74
        L54:
            r4 = r5
        L55:
            java.lang.Number r9 = (java.lang.Number) r9
            long r6 = r9.longValue()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L95
            kotlin.Result$a r9 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L30
            k5.a r9 = r8.f14425a     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = l00.k.a(r8)     // Catch: java.lang.Throwable -> L30
            r0.f14427b = r2     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r0.f14428c = r2     // Catch: java.lang.Throwable -> L30
            r0.f14431f = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = r9.a(r0)     // Catch: java.lang.Throwable -> L30
            if (r9 != r1) goto L75
        L74:
            return r1
        L75:
            yz.g2 r9 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = kotlin.Result.m6308constructorimpl(r9)     // Catch: java.lang.Throwable -> L30
            goto L86
        L7c:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.e.a(r9)
            java.lang.Object r9 = kotlin.Result.m6308constructorimpl(r9)
        L86:
            java.lang.Throwable r9 = kotlin.Result.m6311exceptionOrNullimpl(r9)
            if (r9 == 0) goto L95
            z6.b r0 = z6.b.f101032b
            java.lang.String r1 = "CheckFetchTopAdUC"
            java.lang.String r2 = ""
            r0.e(r1, r2, r9)
        L95:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.advertisement.a.a(j00.c):java.lang.Object");
    }
}
