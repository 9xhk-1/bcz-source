package com.baicizhan.app.biz.game.uc.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import m80.k;
import o6.q;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nObserveUserCurrentBookIdUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserveUserCurrentBookIdUC.kt\ncom/baicizhan/app/biz/game/uc/user/ObserveUserCurrentBookIdUC\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,24:1\n49#2:25\n51#2:29\n46#3:26\n51#3:28\n105#4:27\n*S KotlinDebug\n*F\n+ 1 ObserveUserCurrentBookIdUC.kt\ncom/baicizhan/app/biz/game/uc/user/ObserveUserCurrentBookIdUC\n*L\n19#1:25\n19#1:29\n19#1:26\n19#1:28\n19#1:27\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveUserCurrentBookIdUC {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c6.b f15351a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q f15352b;

    public ObserveUserCurrentBookIdUC(@k c6.b userRepo, @k q getLegalCurrentBookIdUC) {
        g0.p(userRepo, "userRepo");
        g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        this.f15351a = userRepo;
        this.f15352b = getLegalCurrentBookIdUC;
    }

    @k
    public final i<Long> b() {
        final i<Boolean> n11 = this.f15351a.n();
        return kotlinx.coroutines.flow.k.i0(new i<Long>() { // from class: com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ObserveUserCurrentBookIdUC.kt\ncom/baicizhan/app/biz/game/uc/user/ObserveUserCurrentBookIdUC\n*L\n1#1,49:1\n50#2:50\n20#3:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f15355a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ObserveUserCurrentBookIdUC f15356b;

                @l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1$2", f = "ObserveUserCurrentBookIdUC.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ObserveUserCurrentBookIdUC$invoke$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, ObserveUserCurrentBookIdUC observeUserCurrentBookIdUC) {
                    this.f15355a = jVar;
                    this.f15356b = observeUserCurrentBookIdUC;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
                
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
                        boolean r0 = r11 instanceof com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1$2$1
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
                        com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1$2$1 r10 = (com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r10
                        kotlin.e.n(r11)
                        goto Lc8
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
                        com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1$2$1 r6 = (com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        java.lang.Object r7 = r0.L$0
                        kotlin.e.n(r11)
                        r8 = r6
                        r6 = r10
                        r10 = r7
                        r7 = r8
                        goto La0
                    L5b:
                        kotlin.e.n(r11)
                        kotlinx.coroutines.flow.j r2 = r9.f15355a
                        r11 = r10
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC r5 = r9.f15356b
                        o6.q r5 = com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC.a(r5)
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
                        java.lang.Object r11 = r5.a(r0)
                        if (r11 != r1) goto L9d
                        goto Lc7
                    L9d:
                        r5 = r10
                        r7 = r0
                        r4 = r2
                    La0:
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
                        if (r10 != r1) goto Lc8
                    Lc7:
                        return r1
                    Lc8:
                        yz.g2 r10 = yz.g2.f100423a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Long> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        });
    }
}
