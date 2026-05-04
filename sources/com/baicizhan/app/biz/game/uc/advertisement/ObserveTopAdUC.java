package com.baicizhan.app.biz.game.uc.advertisement;

import g8.q;
import j00.c;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import m80.k;
import oa0.r;
import w3.g;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nObserveTopAdUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserveTopAdUC.kt\ncom/baicizhan/app/biz/game/uc/advertisement/ObserveTopAdUC\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,26:1\n49#2:27\n51#2:31\n49#2:32\n51#2:36\n46#3:28\n51#3:30\n46#3:33\n51#3:35\n105#4:29\n105#4:34\n*S KotlinDebug\n*F\n+ 1 ObserveTopAdUC.kt\ncom/baicizhan/app/biz/game/uc/advertisement/ObserveTopAdUC\n*L\n16#1:27\n16#1:31\n22#1:32\n22#1:36\n16#1:28\n16#1:30\n22#1:33\n22#1:35\n16#1:29\n22#1:34\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveTopAdUC {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final k5.a f14414a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$3$1", f = "ObserveTopAdUC.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements l<c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14423a;

        public a(c<? super a> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(c<?> cVar) {
            return ObserveTopAdUC.this.new a(cVar);
        }

        @Override // x00.l
        public final Object invoke(c<? super g2> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14423a;
            if (i11 == 0) {
                e.n(obj);
                k5.a aVar = ObserveTopAdUC.this.f14414a;
                long l12 = g.l();
                this.f14423a = 1;
                if (aVar.f(l12, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            return g2.f100423a;
        }
    }

    public ObserveTopAdUC(@k k5.a topAdvertisementRepo) {
        g0.p(topAdvertisementRepo, "topAdvertisementRepo");
        this.f14414a = topAdvertisementRepo;
    }

    @m80.l
    public final Object b(@k c<? super i<? extends Pair<q, ? extends l<? super c<? super g2>, ? extends Object>>>> cVar) {
        final i<Boolean> d11 = this.f14414a.d();
        final i i02 = kotlinx.coroutines.flow.k.i0(new i<q>() { // from class: com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ObserveTopAdUC.kt\ncom/baicizhan/app/biz/game/uc/advertisement/ObserveTopAdUC\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n50#2:50\n17#3,4:51\n1#4:55\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f14417a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ObserveTopAdUC f14418b;

                @d(c = "com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$1$2", f = "ObserveTopAdUC.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {52, 53, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ObserveTopAdUC$invoke$2", "today", "value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "ad", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ObserveTopAdUC$invoke$2", "today", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "Z$0", "I$1", "J$0", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "Z$0", "I$1", "J$0", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    long J$0;
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

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, ObserveTopAdUC observeTopAdUC) {
                    this.f14417a = jVar;
                    this.f14418b = observeTopAdUC;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x0162, code lost:
                
                    if (r9.emit(r8, r2) != r3) goto L37;
                 */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r18, j00.c r19) {
                    /*
                        Method dump skipped, instructions count: 360
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super q> jVar, c cVar2) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        });
        return new i<Pair<? extends q, ? extends l<? super c<? super g2>, ? extends Object>>>() { // from class: com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ObserveTopAdUC.kt\ncom/baicizhan/app/biz/game/uc/advertisement/ObserveTopAdUC\n*L\n1#1,49:1\n50#2:50\n23#3:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f14421a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ObserveTopAdUC f14422b;

                @d(c = "com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2$2", f = "ObserveTopAdUC.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, ObserveTopAdUC observeTopAdUC) {
                    this.f14421a = jVar;
                    this.f14422b = observeTopAdUC;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, j00.c r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2$2$1 r0 = (com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2$2$1 r0 = new com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r9 = r0.L$3
                        kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                        java.lang.Object r9 = r0.L$1
                        com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2$2$1 r9 = (com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2.AnonymousClass2.AnonymousClass1) r9
                        kotlin.e.n(r10)
                        goto L72
                    L31:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L39:
                        kotlin.e.n(r10)
                        kotlinx.coroutines.flow.j r10 = r8.f14421a
                        r2 = r9
                        g8.q r2 = (g8.q) r2
                        kotlin.Pair r4 = new kotlin.Pair
                        com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$a r5 = new com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$a
                        com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC r6 = r8.f14422b
                        r7 = 0
                        r5.<init>(r7)
                        r4.<init>(r2, r5)
                        java.lang.Object r2 = l00.k.a(r9)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r9 = l00.k.a(r9)
                        r0.L$2 = r9
                        java.lang.Object r9 = l00.k.a(r10)
                        r0.L$3 = r9
                        r9 = 0
                        r0.I$0 = r9
                        r0.label = r3
                        java.lang.Object r9 = r10.emit(r4, r0)
                        if (r9 != r1) goto L72
                        return r1
                    L72:
                        yz.g2 r9 = yz.g2.f100423a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC$invoke$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Pair<? extends q, ? extends l<? super c<? super g2>, ? extends Object>>> jVar, c cVar2) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }
}
