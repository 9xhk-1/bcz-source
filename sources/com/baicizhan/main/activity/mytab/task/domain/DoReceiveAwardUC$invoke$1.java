package com.baicizhan.main.activity.mytab.task.domain;

import com.baicizhan.main.activity.mytab.task.data.h;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1", f = "DoReceiveAwardUC.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@u0({"SMAP\nDoReceiveAwardUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoReceiveAwardUC.kt\ncom/baicizhan/main/activity/mytab/task/domain/DoReceiveAwardUC$invoke$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,19:1\n49#2:20\n51#2:24\n46#3:21\n51#3:23\n105#4:22\n*S KotlinDebug\n*F\n+ 1 DoReceiveAwardUC.kt\ncom/baicizhan/main/activity/mytab/task/domain/DoReceiveAwardUC$invoke$1\n*L\n15#1:20\n15#1:24\n15#1:21\n15#1:23\n15#1:22\n*E\n"})
/* loaded from: classes4.dex */
public final class DoReceiveAwardUC$invoke$1 extends SuspendLambda implements p<String, j00.c<? super i<? extends String>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18803a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoReceiveAwardUC f18805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoReceiveAwardUC$invoke$1(DoReceiveAwardUC doReceiveAwardUC, j00.c<? super DoReceiveAwardUC$invoke$1> cVar) {
        super(2, cVar);
        this.f18805c = doReceiveAwardUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        DoReceiveAwardUC$invoke$1 doReceiveAwardUC$invoke$1 = new DoReceiveAwardUC$invoke$1(this.f18805c, cVar);
        doReceiveAwardUC$invoke$1.f18804b = obj;
        return doReceiveAwardUC$invoke$1;
    }

    @Override // x00.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, j00.c<? super i<String>> cVar) {
        return ((DoReceiveAwardUC$invoke$1) create(str, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h hVar;
        final String str = (String) this.f18804b;
        kotlin.coroutines.intrinsics.b.l();
        if (this.f18803a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        hVar = this.f18805c.f18798a;
        final i<Object> a11 = hVar.a();
        return new i<String>() { // from class: com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DoReceiveAwardUC.kt\ncom/baicizhan/main/activity/mytab/task/domain/DoReceiveAwardUC$invoke$1\n*L\n1#1,49:1\n50#2:50\n16#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18801a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f18802b;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1$2", f = "DoReceiveAwardUC.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, String str) {
                    this.f18801a = jVar;
                    this.f18802b = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, j00.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.L$3
                        kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1$2$1 r6 = (com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L64
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f18801a
                        java.lang.String r2 = r5.f18802b
                        java.lang.Object r4 = l00.k.a(r6)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r6 = l00.k.a(r6)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r7)
                        r0.L$3 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L64
                        return r1
                    L64:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC$invoke$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super String> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, str), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }
}
