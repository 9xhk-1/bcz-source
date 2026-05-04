package com.baicizhan.app.biz.game.uc.ipavatar;

import c40.r0;
import c40.x0;
import com.baicizhan.app.biz.game.model.TravelGiftType;
import com.baicizhan.app.biz.resource.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.service.a;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import l6.n;
import l7.i0;
import l7.p;
import m80.l;
import oa0.r;
import r6.u;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nClaimTravelRewardUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClaimTravelRewardUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ClaimTravelRewardUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n6#2:138\n64#3,2:139\n66#3:142\n67#3,2:148\n6#4:141\n124#5,4:143\n142#6:147\n1#7:150\n295#8,2:151\n*S KotlinDebug\n*F\n+ 1 ClaimTravelRewardUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ClaimTravelRewardUC\n*L\n32#1:138\n32#1:139,2\n32#1:142\n32#1:148,2\n32#1:141\n32#1:143,4\n32#1:147\n74#1:151,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f14733a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q5.a f14734b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.c f14735c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final u f14736d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final l6.i f14737e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final q5.f f14738f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ClaimTravelRewardUC", f = "ClaimTravelRewardUC.kt", i = {0}, l = {109}, m = "getActionResourceId", n = {"actionId"}, s = {"L$0"}, v = 1)
    /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.a$a, reason: collision with other inner class name */
    public static final class C0212a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14739a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14740b;

        /* renamed from: d, reason: collision with root package name */
        public int f14742d;

        public C0212a(j00.c<? super C0212a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14740b = obj;
            this.f14742d |= Integer.MIN_VALUE;
            return a.this.f(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ClaimTravelRewardUC", f = "ClaimTravelRewardUC.kt", i = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5}, l = {41, 43, 44, 49, 82, 84}, m = "invoke", n = {"$this$invoke_u24lambda_u240", "areaId", "$i$a$-runCatching-ClaimTravelRewardUC$invoke$rsp$1", "it", "areaId", "$i$a$-onFailure-ClaimTravelRewardUC$invoke$rsp$2", HiAnalyticsConstant.Direction.RESPONSE, "gift", "areaId", "$i$a$-let-ClaimTravelRewardUC$invoke$updateGift$2", HiAnalyticsConstant.Direction.RESPONSE, "updateGift", "updateLevel", "updatedRsp", "areaId", HiAnalyticsConstant.Direction.RESPONSE, "updateGift", "updateLevel", "updatedRsp", "actionResourceId", "areaId"}, s = {"L$0", "I$0", "I$1", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f14743a;

        /* renamed from: b, reason: collision with root package name */
        public int f14744b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14745c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14746d;

        /* renamed from: e, reason: collision with root package name */
        public Object f14747e;

        /* renamed from: f, reason: collision with root package name */
        public Object f14748f;

        /* renamed from: g, reason: collision with root package name */
        public Object f14749g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f14750h;

        /* renamed from: j, reason: collision with root package name */
        public int f14752j;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14750h = obj;
            this.f14752j |= Integer.MIN_VALUE;
            return a.this.i(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ClaimTravelRewardUC$invoke$2", f = "ClaimTravelRewardUC.kt", i = {0}, l = {89}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends h8.d>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14753a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14754b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ClaimTravelRewardUC$invoke$2$1", f = "ClaimTravelRewardUC.kt", i = {0, 0, 0}, l = {87}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-ClaimTravelRewardUC$invoke$2$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nClaimTravelRewardUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClaimTravelRewardUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ClaimTravelRewardUC$invoke$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
        /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.a$c$a, reason: collision with other inner class name */
        public static final class C0213a extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f14756a;

            /* renamed from: b, reason: collision with root package name */
            public int f14757b;

            /* renamed from: c, reason: collision with root package name */
            public int f14758c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f14759d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f14760e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0213a(a aVar, j00.c<? super C0213a> cVar) {
                super(2, cVar);
                this.f14760e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C0213a c0213a = new C0213a(this.f14760e, cVar);
                c0213a.f14759d = obj;
                return c0213a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((C0213a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f14759d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f14758c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        a aVar = this.f14760e;
                        Result.a aVar2 = Result.Companion;
                        u uVar = aVar.f14736d;
                        this.f14759d = l00.k.a(r0Var);
                        this.f14756a = l00.k.a(r0Var);
                        this.f14757b = 0;
                        this.f14758c = 1;
                        if (uVar.b(0L, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar3 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ClaimTravelRewardUC$invoke$2$2", f = "ClaimTravelRewardUC.kt", i = {0, 0, 0, 0, 0}, l = {89}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$this$invokeSuspend_u24lambda_u240_u240", "$i$a$-runCatching-ClaimTravelRewardUC$invoke$2$2$1", "$i$a$-runCatching-ClaimTravelRewardUC$invoke$2$2$1$1"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nClaimTravelRewardUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClaimTravelRewardUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ClaimTravelRewardUC$invoke$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
        public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends h8.d>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f14761a;

            /* renamed from: b, reason: collision with root package name */
            public Object f14762b;

            /* renamed from: c, reason: collision with root package name */
            public int f14763c;

            /* renamed from: d, reason: collision with root package name */
            public int f14764d;

            /* renamed from: e, reason: collision with root package name */
            public int f14765e;

            /* renamed from: f, reason: collision with root package name */
            public /* synthetic */ Object f14766f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f14767g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f14767g = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                b bVar = new b(this.f14767g, cVar);
                bVar.f14766f = obj;
                return bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<h8.d>> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                Object m6308constructorimpl2;
                r0 r0Var = (r0) this.f14766f;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f14765e;
                Object obj2 = null;
                try {
                    try {
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            a aVar = this.f14767g;
                            Result.a aVar2 = Result.Companion;
                            com.baicizhan.app.biz.game.uc.ipavatar.c cVar = aVar.f14735c;
                            this.f14766f = l00.k.a(r0Var);
                            this.f14761a = l00.k.a(r0Var);
                            this.f14762b = l00.k.a(r0Var);
                            this.f14763c = 0;
                            this.f14764d = 0;
                            this.f14765e = 1;
                            obj = com.baicizhan.app.biz.game.uc.ipavatar.c.g(cVar, false, this, 1, null);
                            if (obj == l11) {
                                return l11;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.e.n(obj);
                        }
                        m6308constructorimpl = Result.m6308constructorimpl((h8.d) obj);
                    } catch (Throwable th2) {
                        Result.a aVar3 = Result.Companion;
                        m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                    }
                    if (!Result.m6314isFailureimpl(m6308constructorimpl)) {
                        obj2 = m6308constructorimpl;
                    }
                    m6308constructorimpl2 = Result.m6308constructorimpl((h8.d) obj2);
                } catch (Throwable th3) {
                    Result.a aVar4 = Result.Companion;
                    m6308constructorimpl2 = Result.m6308constructorimpl(kotlin.e.a(th3));
                }
                return Result.m6307boximpl(m6308constructorimpl2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends h8.d>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<h8.d>>) cVar);
            }
        }

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = a.this.new c(cVar);
            cVar2.f14754b = obj;
            return cVar2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Result<h8.d>> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0 b11;
            r0 r0Var = (r0) this.f14754b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14753a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            c40.k.b(r0Var, null, null, new C0213a(a.this, null), 3, null);
            b11 = c40.k.b(r0Var, null, null, new b(a.this, null), 3, null);
            this.f14754b = l00.k.a(r0Var);
            this.f14753a = 1;
            Object i12 = b11.i(this);
            return i12 == l11 ? l11 : i12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends h8.d>> cVar) {
            return invoke2(r0Var, (j00.c<? super Result<h8.d>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ClaimTravelRewardUC$invoke$updateGift$2$1", f = "ClaimTravelRewardUC.kt", i = {0, 0, 0}, l = {68}, m = "invokeSuspend", n = {"$this$coroutineScope", "cnPicDeferred", "enPicDeferred"}, s = {"L$0", "L$1", "L$2"}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super h8.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14768a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14769b;

        /* renamed from: c, reason: collision with root package name */
        public int f14770c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14771d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h8.g f14772e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a f14773f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ClaimTravelRewardUC$invoke$updateGift$2$1$cnPicDeferred$1", f = "ClaimTravelRewardUC.kt", i = {0, 0, 0, 1, 1, 1}, l = {53, 56}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-ClaimTravelRewardUC$invoke$updateGift$2$1$cnPicDeferred$1$1", "$this$async", "error", "$i$a$-getOrElse-ClaimTravelRewardUC$invoke$updateGift$2$1$cnPicDeferred$1$2"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"}, v = 1)
        /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.a$d$a, reason: collision with other inner class name */
        public static final class C0214a extends SuspendLambda implements x00.p<r0, j00.c<? super String>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f14774a;

            /* renamed from: b, reason: collision with root package name */
            public int f14775b;

            /* renamed from: c, reason: collision with root package name */
            public int f14776c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f14777d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f14778e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ h8.g f14779f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0214a(a aVar, h8.g gVar, j00.c<? super C0214a> cVar) {
                super(2, cVar);
                this.f14778e = aVar;
                this.f14779f = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C0214a c0214a = new C0214a(this.f14778e, this.f14779f, cVar);
                c0214a.f14777d = obj;
                return c0214a;
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super String> cVar) {
                return ((C0214a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
            
                if (r11 == r1) goto L26;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = r10.f14777d
                    c40.r0 r0 = (c40.r0) r0
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r10.f14776c
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L2e
                    if (r2 == r5) goto L24
                    if (r2 != r4) goto L1c
                    java.lang.Object r0 = r10.f14774a
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    kotlin.e.n(r11)
                    goto La3
                L1c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L24:
                    java.lang.Object r2 = r10.f14774a
                    c40.r0 r2 = (c40.r0) r2
                    kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L2c
                    goto L54
                L2c:
                    r11 = move-exception
                    goto L5b
                L2e:
                    kotlin.e.n(r11)
                    com.baicizhan.app.biz.game.uc.ipavatar.a r11 = r10.f14778e
                    h8.g r2 = r10.f14779f
                    kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2c
                    l6.i r11 = com.baicizhan.app.biz.game.uc.ipavatar.a.c(r11)     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r2.f58917e     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r6 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L2c
                    r10.f14777d = r6     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r6 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L2c
                    r10.f14774a = r6     // Catch: java.lang.Throwable -> L2c
                    r10.f14775b = r3     // Catch: java.lang.Throwable -> L2c
                    r10.f14776c = r5     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r11 = r11.a(r2, r10)     // Catch: java.lang.Throwable -> L2c
                    if (r11 != r1) goto L54
                    goto La2
                L54:
                    java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r11 = kotlin.Result.m6308constructorimpl(r11)     // Catch: java.lang.Throwable -> L2c
                    goto L65
                L5b:
                    kotlin.Result$a r2 = kotlin.Result.Companion
                    java.lang.Object r11 = kotlin.e.a(r11)
                    java.lang.Object r11 = kotlin.Result.m6308constructorimpl(r11)
                L65:
                    h8.g r2 = r10.f14779f
                    com.baicizhan.app.biz.game.uc.ipavatar.a r6 = r10.f14778e
                    java.lang.Throwable r7 = kotlin.Result.m6311exceptionOrNullimpl(r11)
                    if (r7 != 0) goto L70
                    goto La5
                L70:
                    z6.b r11 = z6.b.f101032b
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r9 = "Failed to download: "
                    r8.append(r9)
                    java.lang.String r9 = r2.f58917e
                    r8.append(r9)
                    java.lang.String r8 = r8.toString()
                    java.lang.String r9 = "ClaimTravelRewardUC"
                    r11.e(r9, r8, r7)
                    int r11 = r2.f58914b
                    java.lang.Object r0 = l00.k.a(r0)
                    r10.f14777d = r0
                    java.lang.Object r0 = l00.k.a(r7)
                    r10.f14774a = r0
                    r10.f14775b = r3
                    r10.f14776c = r4
                    java.lang.Object r11 = com.baicizhan.app.biz.game.uc.ipavatar.a.b(r6, r11, r5, r10)
                    if (r11 != r1) goto La3
                La2:
                    return r1
                La3:
                    java.lang.String r11 = (java.lang.String) r11
                La5:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.a.d.C0214a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ClaimTravelRewardUC$invoke$updateGift$2$1$enPicDeferred$1", f = "ClaimTravelRewardUC.kt", i = {0, 0, 0, 1, 1, 1}, l = {61, 64}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-ClaimTravelRewardUC$invoke$updateGift$2$1$enPicDeferred$1$1", "$this$async", "error", "$i$a$-getOrElse-ClaimTravelRewardUC$invoke$updateGift$2$1$enPicDeferred$1$2"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"}, v = 1)
        public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super String>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f14780a;

            /* renamed from: b, reason: collision with root package name */
            public int f14781b;

            /* renamed from: c, reason: collision with root package name */
            public int f14782c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f14783d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f14784e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ h8.g f14785f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, h8.g gVar, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f14784e = aVar;
                this.f14785f = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                b bVar = new b(this.f14784e, this.f14785f, cVar);
                bVar.f14783d = obj;
                return bVar;
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super String> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
            
                if (r10 == r1) goto L26;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = r9.f14783d
                    c40.r0 r0 = (c40.r0) r0
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r9.f14782c
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L2e
                    if (r2 == r4) goto L24
                    if (r2 != r3) goto L1c
                    java.lang.Object r0 = r9.f14780a
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    kotlin.e.n(r10)
                    goto La3
                L1c:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L24:
                    java.lang.Object r2 = r9.f14780a
                    c40.r0 r2 = (c40.r0) r2
                    kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L2c
                    goto L54
                L2c:
                    r10 = move-exception
                    goto L5b
                L2e:
                    kotlin.e.n(r10)
                    com.baicizhan.app.biz.game.uc.ipavatar.a r10 = r9.f14784e
                    h8.g r2 = r9.f14785f
                    kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2c
                    l6.i r10 = com.baicizhan.app.biz.game.uc.ipavatar.a.c(r10)     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r2.f58918f     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r6 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L2c
                    r9.f14783d = r6     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r6 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L2c
                    r9.f14780a = r6     // Catch: java.lang.Throwable -> L2c
                    r9.f14781b = r5     // Catch: java.lang.Throwable -> L2c
                    r9.f14782c = r4     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r10 = r10.a(r2, r9)     // Catch: java.lang.Throwable -> L2c
                    if (r10 != r1) goto L54
                    goto La2
                L54:
                    java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r10 = kotlin.Result.m6308constructorimpl(r10)     // Catch: java.lang.Throwable -> L2c
                    goto L65
                L5b:
                    kotlin.Result$a r2 = kotlin.Result.Companion
                    java.lang.Object r10 = kotlin.e.a(r10)
                    java.lang.Object r10 = kotlin.Result.m6308constructorimpl(r10)
                L65:
                    h8.g r2 = r9.f14785f
                    com.baicizhan.app.biz.game.uc.ipavatar.a r4 = r9.f14784e
                    java.lang.Throwable r6 = kotlin.Result.m6311exceptionOrNullimpl(r10)
                    if (r6 != 0) goto L70
                    goto La5
                L70:
                    z6.b r10 = z6.b.f101032b
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "Failed to download: "
                    r7.append(r8)
                    java.lang.String r8 = r2.f58918f
                    r7.append(r8)
                    java.lang.String r7 = r7.toString()
                    java.lang.String r8 = "ClaimTravelRewardUC"
                    r10.e(r8, r7, r6)
                    int r10 = r2.f58914b
                    java.lang.Object r0 = l00.k.a(r0)
                    r9.f14783d = r0
                    java.lang.Object r0 = l00.k.a(r6)
                    r9.f14780a = r0
                    r9.f14781b = r5
                    r9.f14782c = r3
                    java.lang.Object r10 = com.baicizhan.app.biz.game.uc.ipavatar.a.b(r4, r10, r5, r9)
                    if (r10 != r1) goto La3
                La2:
                    return r1
                La3:
                    java.lang.String r10 = (java.lang.String) r10
                La5:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.a.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h8.g gVar, a aVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f14772e = gVar;
            this.f14773f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f14772e, this.f14773f, cVar);
            dVar.f14771d = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super h8.g> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0 b11;
            x0 b12;
            Object b13;
            r0 r0Var = (r0) this.f14771d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14770c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b11 = c40.k.b(r0Var, null, null, new C0214a(this.f14773f, this.f14772e, null), 3, null);
                b12 = c40.k.b(r0Var, null, null, new b(this.f14773f, this.f14772e, null), 3, null);
                this.f14771d = l00.k.a(r0Var);
                this.f14768a = l00.k.a(b11);
                this.f14769b = l00.k.a(b12);
                this.f14770c = 1;
                b13 = c40.f.b(new x0[]{b11, b12}, this);
                if (b13 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                b13 = obj;
            }
            List list = (List) b13;
            return h8.g.h(this.f14772e, 0, 0, null, null, (String) list.get(0), (String) list.get(1), 15, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<h8.b>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f14786a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f14787b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f14788c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.a$e$a, reason: collision with other inner class name */
        public static final class C0215a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f14789a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f14790b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f14791c;

            public C0215a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f14789a = eVar;
                this.f14790b = cVar;
                this.f14791c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f14789a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f14789a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f14790b.b(this.f14791c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f14786a = dVar;
            this.f14787b = eVar;
            this.f14788c = cVar;
        }

        public final void a(w7.d<h8.b> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0215a(this.f14787b, this.f14788c, this.f14786a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f14786a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) kotlin.jvm.internal.x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<h8.b> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public a(@m80.k p thriftService, @m80.k q5.a ipAvatarStateRepo, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.c fetchIpAvatarHomeUC, @m80.k u fetchVersionInfoUC, @m80.k l6.i downloadFileUC, @m80.k q5.f ipResourceRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(ipAvatarStateRepo, "ipAvatarStateRepo");
        g0.p(fetchIpAvatarHomeUC, "fetchIpAvatarHomeUC");
        g0.p(fetchVersionInfoUC, "fetchVersionInfoUC");
        g0.p(downloadFileUC, "downloadFileUC");
        g0.p(ipResourceRepo, "ipResourceRepo");
        this.f14733a = thriftService;
        this.f14734b = ipAvatarStateRepo;
        this.f14735c = fetchIpAvatarHomeUC;
        this.f14736d = fetchVersionInfoUC;
        this.f14737e = downloadFileUC;
        this.f14738f = ipResourceRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Integer r5, j00.c<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.biz.game.uc.ipavatar.a.C0212a
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.biz.game.uc.ipavatar.a$a r0 = (com.baicizhan.app.biz.game.uc.ipavatar.a.C0212a) r0
            int r1 = r0.f14742d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14742d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.ipavatar.a$a r0 = new com.baicizhan.app.biz.game.uc.ipavatar.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14740b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14742d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f14739a
            java.lang.Integer r5 = (java.lang.Integer) r5
            kotlin.e.n(r6)
            goto L51
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            if (r5 != 0) goto L3c
            r5 = 0
            return r5
        L3c:
            q5.f r6 = r4.f14738f
            int r2 = r5.intValue()
            java.lang.Object r5 = l00.k.a(r5)
            r0.f14739a = r5
            r0.f14742d = r3
            java.lang.Object r6 = r6.b(r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = a00.r0.L2(r6)
            h5.u r5 = (h5.u) r5
            if (r5 == 0) goto L63
            java.lang.String r5 = r5.i()
            if (r5 != 0) goto L62
            goto L63
        L62:
            return r5
        L63:
            java.lang.String r5 = "NewPenguin_Sofa"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.a.f(java.lang.Integer, j00.c):java.lang.Object");
    }

    public final h8.b g() {
        return (h8.b) w7.f.b(new e(o0.d(h8.b.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public final Object h(int i11, boolean z11, j00.c<? super String> cVar) {
        String b11;
        if (i11 != TravelGiftType.PostCard.getValue() || z11) {
            TravelGiftType travelGiftType = TravelGiftType.GiftLetter;
            b11 = (i11 == travelGiftType.getValue() && z11) ? f7.b.b(a.C0228a.C0229a.C0230a.f15519a.a()) : (i11 != travelGiftType.getValue() || z11) ? f7.b.b(a.C0228a.C0229a.C0230a.f15519a.c()) : f7.b.b(a.C0228a.C0229a.C0230a.f15519a.b());
        } else {
            b11 = f7.b.b(a.C0228a.C0229a.C0230a.f15519a.d());
        }
        return n.f70249a + b11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|93|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        if (r0 == r3) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x009b, code lost:
    
        if (r0 == r3) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x008a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ce, code lost:
    
        r8 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@m80.k j00.c<? super h5.s0> r21) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.a.i(j00.c):java.lang.Object");
    }
}
