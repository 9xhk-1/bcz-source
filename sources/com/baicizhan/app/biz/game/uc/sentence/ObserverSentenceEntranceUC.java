package com.baicizhan.app.biz.game.uc.sentence;

import h5.h0;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;
import p8.s0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nObserverSentenceEntranceUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverSentenceEntranceUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ObserverSentenceEntranceUC\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,64:1\n49#2:65\n51#2:69\n49#2:70\n51#2:74\n49#2:76\n51#2:80\n46#3:66\n51#3:68\n46#3:71\n51#3:73\n46#3:77\n51#3:79\n105#4:67\n105#4:72\n105#4:78\n189#5:75\n*S KotlinDebug\n*F\n+ 1 ObserverSentenceEntranceUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ObserverSentenceEntranceUC\n*L\n31#1:65\n31#1:69\n34#1:70\n34#1:74\n55#1:76\n55#1:80\n31#1:66\n31#1:68\n34#1:71\n34#1:73\n55#1:77\n55#1:79\n31#1:67\n34#1:72\n55#1:78\n42#1:75\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserverSentenceEntranceUC {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c6.b f15129a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x5.c f15130b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.a f15131c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final r6.b f15132d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$4$1$1", f = "ObserverSentenceEntranceUC.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {48, 49, 51}, m = "invokeSuspend", n = {"$this$flow", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-ObserverSentenceEntranceUC$invoke$4$1$1$skuNew$1", "$this$flow", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-ObserverSentenceEntranceUC$invoke$4$1$1$skuNew$1", "$this$flow", "skuNew"}, s = {"L$0", "L$2", "I$1", "L$0", "L$1", "I$0", "L$0", "L$1"}, v = 1)
    public static final class a extends SuspendLambda implements p<kotlinx.coroutines.flow.j<? super Pair<? extends Integer, ? extends s0>>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f15143a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15144b;

        /* renamed from: c, reason: collision with root package name */
        public int f15145c;

        /* renamed from: d, reason: collision with root package name */
        public int f15146d;

        /* renamed from: e, reason: collision with root package name */
        public int f15147e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f15148f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s0 f15149g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f15150h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ObserverSentenceEntranceUC f15151i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0 s0Var, int i11, ObserverSentenceEntranceUC observerSentenceEntranceUC, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f15149g = s0Var;
            this.f15150h = i11;
            this.f15151i = observerSentenceEntranceUC;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f15149g, this.f15150h, this.f15151i, cVar);
            aVar.f15148f = obj;
            return aVar;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super Pair<? extends Integer, ? extends s0>> jVar, j00.c<? super g2> cVar) {
            return invoke2((kotlinx.coroutines.flow.j<? super Pair<Integer, s0>>) jVar, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
        
            if (r0.emit(r2, r9) != r1) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f15148f
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r9.f15147e
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L41
                if (r2 == r5) goto L31
                if (r2 == r4) goto L27
                if (r2 != r3) goto L1f
                java.lang.Object r0 = r9.f15143a
                p8.s0 r0 = (p8.s0) r0
                kotlin.e.n(r10)
                goto Lc5
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r2 = r9.f15143a
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L2f
                goto L89
            L2f:
                r10 = move-exception
                goto L90
            L31:
                int r2 = r9.f15146d
                int r5 = r9.f15145c
                java.lang.Object r7 = r9.f15144b
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                java.lang.Object r8 = r9.f15143a
                com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC r8 = (com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC) r8
                kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L2f
                goto L70
            L41:
                kotlin.e.n(r10)
                p8.s0 r10 = r9.f15149g
                if (r10 != 0) goto Lc5
                int r10 = r9.f15150h
                r2 = -1
                if (r10 == r2) goto Lc5
                com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC r8 = r9.f15151i
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2f
                r6.b r2 = com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC.a(r8)     // Catch: java.lang.Throwable -> L2f
                r9.f15148f = r0     // Catch: java.lang.Throwable -> L2f
                r9.f15143a = r8     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r7 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L2f
                r9.f15144b = r7     // Catch: java.lang.Throwable -> L2f
                r9.f15145c = r10     // Catch: java.lang.Throwable -> L2f
                r7 = 0
                r9.f15146d = r7     // Catch: java.lang.Throwable -> L2f
                r9.f15147e = r5     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r2 = r2.a(r10, r9)     // Catch: java.lang.Throwable -> L2f
                if (r2 != r1) goto L6d
                goto Lc4
            L6d:
                r5 = r10
                r2 = r7
                r7 = r0
            L70:
                x5.c r10 = com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC.c(r8)     // Catch: java.lang.Throwable -> L2f
                r9.f15148f = r0     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r7 = l00.k.a(r7)     // Catch: java.lang.Throwable -> L2f
                r9.f15143a = r7     // Catch: java.lang.Throwable -> L2f
                r9.f15144b = r6     // Catch: java.lang.Throwable -> L2f
                r9.f15145c = r2     // Catch: java.lang.Throwable -> L2f
                r9.f15147e = r4     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r10 = r10.b(r5, r9)     // Catch: java.lang.Throwable -> L2f
                if (r10 != r1) goto L89
                goto Lc4
            L89:
                p8.s0 r10 = (p8.s0) r10     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r10 = kotlin.Result.m6308constructorimpl(r10)     // Catch: java.lang.Throwable -> L2f
                goto L9a
            L90:
                kotlin.Result$a r2 = kotlin.Result.Companion
                java.lang.Object r10 = kotlin.e.a(r10)
                java.lang.Object r10 = kotlin.Result.m6308constructorimpl(r10)
            L9a:
                boolean r2 = kotlin.Result.m6314isFailureimpl(r10)
                if (r2 == 0) goto La1
                r10 = r6
            La1:
                p8.s0 r10 = (p8.s0) r10
                kotlin.Pair r2 = new kotlin.Pair
                int r4 = r9.f15150h
                java.lang.Integer r4 = l00.a.f(r4)
                r2.<init>(r4, r10)
                java.lang.Object r4 = l00.k.a(r0)
                r9.f15148f = r4
                java.lang.Object r10 = l00.k.a(r10)
                r9.f15143a = r10
                r9.f15144b = r6
                r9.f15147e = r3
                java.lang.Object r10 = r0.emit(r2, r9)
                if (r10 != r1) goto Lc5
            Lc4:
                return r1
            Lc5:
                yz.g2 r10 = yz.g2.f100423a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.flow.j<? super Pair<Integer, s0>> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    public ObserverSentenceEntranceUC(@m80.k c6.b userInfo, @m80.k x5.c sentenceSku, @m80.k com.baicizhan.app.biz.game.uc.sentence.a checkSentenceGameIntegrityUC, @m80.k r6.b checkFetchSentenceRoadMapUC) {
        g0.p(userInfo, "userInfo");
        g0.p(sentenceSku, "sentenceSku");
        g0.p(checkSentenceGameIntegrityUC, "checkSentenceGameIntegrityUC");
        g0.p(checkFetchSentenceRoadMapUC, "checkFetchSentenceRoadMapUC");
        this.f15129a = userInfo;
        this.f15130b = sentenceSku;
        this.f15131c = checkSentenceGameIntegrityUC;
        this.f15132d = checkFetchSentenceRoadMapUC;
    }

    @m80.l
    public final Object e(@m80.k j00.c<? super kotlinx.coroutines.flow.i<h0>> cVar) {
        final kotlinx.coroutines.flow.i<Boolean> n11 = this.f15129a.n();
        final kotlinx.coroutines.flow.i i02 = kotlinx.coroutines.flow.k.i0(new kotlinx.coroutines.flow.i<Pair<? extends Integer, ? extends Integer>>() { // from class: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ObserverSentenceEntranceUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ObserverSentenceEntranceUC\n*L\n1#1,49:1\n50#2:50\n32#3:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f15135a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ObserverSentenceEntranceUC f15136b;

                @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$1$2", f = "ObserverSentenceEntranceUC.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ObserverSentenceEntranceUC$invoke$2", "value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ObserverSentenceEntranceUC$invoke$2", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, ObserverSentenceEntranceUC observerSentenceEntranceUC) {
                    this.f15135a = jVar;
                    this.f15136b = observerSentenceEntranceUC;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x013f, code lost:
                
                    if (r7.emit(r5, r2) != r3) goto L29;
                 */
                /* JADX WARN: Removed duplicated region for block: B:24:0x010c  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r18, j00.c r19) {
                    /*
                        Method dump skipped, instructions count: 325
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Pair<? extends Integer, ? extends Integer>> jVar, j00.c cVar2) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        });
        final kotlinx.coroutines.flow.i f22 = kotlinx.coroutines.flow.k.f2(new kotlinx.coroutines.flow.i<Integer>() { // from class: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ObserverSentenceEntranceUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ObserverSentenceEntranceUC\n*L\n1#1,49:1\n50#2:50\n35#3,7:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f15139a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ObserverSentenceEntranceUC f15140b;

                @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$2$2", f = "ObserverSentenceEntranceUC.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "it", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-ObserverSentenceEntranceUC$invoke$3", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, ObserverSentenceEntranceUC observerSentenceEntranceUC) {
                    this.f15139a = jVar;
                    this.f15140b = observerSentenceEntranceUC;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0125, code lost:
                
                    if (r6.emit(r2, r0) == r1) goto L33;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r12, j00.c r13) {
                    /*
                        Method dump skipped, instructions count: 299
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Integer> jVar, j00.c cVar2) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, new ObserverSentenceEntranceUC$invoke$$inlined$flatMapLatest$1(null, this));
        return new kotlinx.coroutines.flow.i<h0>() { // from class: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ObserverSentenceEntranceUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ObserverSentenceEntranceUC\n*L\n1#1,49:1\n50#2:50\n56#3,6:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f15142a;

                @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3$2", f = "ObserverSentenceEntranceUC.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.f15142a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, j00.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3$2$1 r0 = (com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3$2$1 r0 = new com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.L$3
                        kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                        java.lang.Object r7 = r0.L$1
                        com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3$2$1 r7 = (com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L86
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f15142a
                        r2 = r7
                        kotlin.Pair r2 = (kotlin.Pair) r2
                        java.lang.Object r4 = r2.getFirst()
                        java.lang.Number r4 = (java.lang.Number) r4
                        int r4 = r4.intValue()
                        java.lang.Object r2 = r2.getSecond()
                        p8.s0 r2 = (p8.s0) r2
                        if (r2 == 0) goto L5b
                        int r2 = r2.f80116e
                        com.baicizhan.app.biz.game.model.SentenceLanguageType r2 = h5.i0.a(r2)
                        if (r2 != 0) goto L5d
                    L5b:
                        com.baicizhan.app.biz.game.model.SentenceLanguageType r2 = com.baicizhan.app.biz.game.model.SentenceLanguageType.Unknown
                    L5d:
                        h5.h0 r5 = new h5.h0
                        r5.<init>(r4, r2)
                        java.lang.Object r2 = l00.k.a(r7)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r7 = l00.k.a(r7)
                        r0.L$2 = r7
                        java.lang.Object r7 = l00.k.a(r8)
                        r0.L$3 = r7
                        r7 = 0
                        r0.I$0 = r7
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r5, r0)
                        if (r7 != r1) goto L86
                        return r1
                    L86:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super h0> jVar, j00.c cVar2) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }
}
