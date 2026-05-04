package com.baicizhan.app.biz.game.uc.monetization;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nObservePopupSaleUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObservePopupSaleUC.kt\ncom/baicizhan/app/biz/game/uc/monetization/ObservePopupSaleUC\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,50:1\n49#2:51\n51#2:55\n46#3:52\n51#3:54\n105#4:53\n189#5:56\n*S KotlinDebug\n*F\n+ 1 ObservePopupSaleUC.kt\ncom/baicizhan/app/biz/game/uc/monetization/ObservePopupSaleUC\n*L\n25#1:51\n25#1:55\n25#1:52\n25#1:54\n25#1:53\n28#1:56\n*E\n"})
/* loaded from: classes3.dex */
public final class ObservePopupSaleUC {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s5.a f14883a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$memberPopFlow$2", f = "ObservePopupSaleUC.kt", i = {0, 1}, l = {42, 43}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"}, v = 1)
    public static final class a extends SuspendLambda implements p<kotlinx.coroutines.flow.j<? super u8.e>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14888a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14889b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u8.e f14890c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u8.e eVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f14890c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f14890c, cVar);
            aVar.f14889b = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            if (r0.emit(null, r9) == r1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (c40.a1.b(r5, r9) == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f14889b
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r9.f14888a
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                kotlin.e.n(r10)
                goto L4d
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                kotlin.e.n(r10)
                goto L3d
            L22:
                kotlin.e.n(r10)
                u8.e r10 = r9.f14890c
                long r5 = r10.f91917b
                long r7 = w3.g.n()
                long r5 = r5 - r7
                r10 = 100
                long r7 = (long) r10
                long r5 = r5 + r7
                r9.f14889b = r0
                r9.f14888a = r4
                java.lang.Object r10 = c40.a1.b(r5, r9)
                if (r10 != r1) goto L3d
                goto L4c
            L3d:
                java.lang.Object r10 = l00.k.a(r0)
                r9.f14889b = r10
                r9.f14888a = r3
                r10 = 0
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r1) goto L4d
            L4c:
                return r1
            L4d:
                yz.g2 r10 = yz.g2.f100423a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super u8.e> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    public ObservePopupSaleUC(@m80.k s5.a popRepo) {
        g0.p(popRepo, "popRepo");
        this.f14883a = popRepo;
    }

    @m80.l
    public final Object c(@m80.k j00.c<? super kotlinx.coroutines.flow.i<u8.e>> cVar) {
        final kotlinx.coroutines.flow.i<Boolean> j11 = this.f14883a.j();
        return kotlinx.coroutines.flow.k.f2(new kotlinx.coroutines.flow.i<u8.e>() { // from class: com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ObservePopupSaleUC.kt\ncom/baicizhan/app/biz/game/uc/monetization/ObservePopupSaleUC\n*L\n1#1,49:1\n50#2:50\n26#3:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f14886a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ObservePopupSaleUC f14887b;

                @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1$2", f = "ObservePopupSaleUC.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ObservePopupSaleUC$invoke$2", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    boolean Z$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, ObservePopupSaleUC observePopupSaleUC) {
                    this.f14886a = jVar;
                    this.f14887b = observePopupSaleUC;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x00c9, code lost:
                
                    if (r2.emit(r11, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, j00.c r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L5b
                        if (r2 == r4) goto L3d
                        if (r2 != r3) goto L35
                        java.lang.Object r10 = r0.L$3
                        kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                        java.lang.Object r10 = r0.L$1
                        com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1$2$1 r10 = (com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r10
                        kotlin.e.n(r11)
                        goto Lcc
                    L35:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L3d:
                        int r10 = r0.I$0
                        java.lang.Object r2 = r0.L$5
                        j00.c r2 = (j00.c) r2
                        java.lang.Object r2 = r0.L$4
                        kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                        java.lang.Object r4 = r0.L$3
                        kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                        java.lang.Object r5 = r0.L$2
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1$2$1 r6 = (com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        java.lang.Object r7 = r0.L$0
                        kotlin.e.n(r11)
                        r8 = r6
                        r6 = r10
                        r10 = r7
                        r7 = r8
                        goto La0
                    L5b:
                        kotlin.e.n(r11)
                        kotlinx.coroutines.flow.j r2 = r9.f14886a
                        r11 = r10
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC r5 = r9.f14887b
                        s5.a r5 = com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC.a(r5)
                        java.lang.Object r6 = l00.k.a(r10)
                        r0.L$0 = r6
                        java.lang.Object r6 = l00.k.a(r0)
                        r0.L$1 = r6
                        java.lang.Object r6 = l00.k.a(r10)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r2)
                        r0.L$3 = r6
                        r0.L$4 = r2
                        java.lang.Object r6 = l00.k.a(r0)
                        r0.L$5 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.Z$0 = r11
                        r0.I$1 = r6
                        r0.label = r4
                        java.lang.Object r11 = r5.e(r0)
                        if (r11 != r1) goto L9d
                        goto Lcb
                    L9d:
                        r5 = r10
                        r7 = r0
                        r4 = r2
                    La0:
                        u8.a r11 = (u8.a) r11
                        u8.e r11 = r11.f91888a
                        java.lang.Object r10 = l00.k.a(r10)
                        r0.L$0 = r10
                        java.lang.Object r10 = l00.k.a(r7)
                        r0.L$1 = r10
                        java.lang.Object r10 = l00.k.a(r5)
                        r0.L$2 = r10
                        java.lang.Object r10 = l00.k.a(r4)
                        r0.L$3 = r10
                        r10 = 0
                        r0.L$4 = r10
                        r0.L$5 = r10
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r10 = r2.emit(r11, r0)
                        if (r10 != r1) goto Lcc
                    Lcb:
                        return r1
                    Lcc:
                        yz.g2 r10 = yz.g2.f100423a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.ObservePopupSaleUC$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super u8.e> jVar, j00.c cVar2) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, new ObservePopupSaleUC$invoke$$inlined$flatMapLatest$1(null, this));
    }

    public final Object d(u8.e eVar, j00.c<? super kotlinx.coroutines.flow.i<u8.e>> cVar) {
        z6.b.j(z6.b.f101032b, m.f14979a, "info: " + eVar, null, 4, null);
        if (eVar == null) {
            return kotlinx.coroutines.flow.k.N0(null);
        }
        long j11 = eVar.f91917b;
        return j11 == 0 ? kotlinx.coroutines.flow.k.N0(eVar) : j11 <= w3.g.n() ? kotlinx.coroutines.flow.k.N0(null) : kotlinx.coroutines.flow.k.c1(kotlinx.coroutines.flow.k.N0(eVar), kotlinx.coroutines.flow.k.K0(new a(eVar, null)));
    }
}
