package com.baicizhan.app.biz.game.repo.experiment;

import app.cash.sqldelight.coroutines.FlowQuery;
import c4.o;
import c40.r0;
import f4.v;
import j00.c;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2", f = "ExperimentRepo.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@u0({"SMAP\nExperimentRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$observeExperiments$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,108:1\n49#2:109\n51#2:113\n46#3:110\n51#3:112\n105#4:111\n*S KotlinDebug\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$observeExperiments$2\n*L\n97#1:109\n97#1:113\n97#1:110\n97#1:112\n97#1:111\n*E\n"})
/* loaded from: classes3.dex */
public final class ExperimentRepoImpl$observeExperiments$2 extends SuspendLambda implements p<r0, c<? super i<? extends Map<String, ? extends String>>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExperimentRepoImpl f14248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentRepoImpl$observeExperiments$2(ExperimentRepoImpl experimentRepoImpl, c<? super ExperimentRepoImpl$observeExperiments$2> cVar) {
        super(2, cVar);
        this.f14248b = experimentRepoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new ExperimentRepoImpl$observeExperiments$2(this.f14248b, cVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(r0 r0Var, c<? super i<? extends Map<String, String>>> cVar) {
        return ((ExperimentRepoImpl$observeExperiments$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.f14247a;
        if (i11 == 0) {
            e.n(obj);
            h4.c cVar = this.f14248b.f14208a;
            this.f14247a = 1;
            obj = cVar.a(this);
            if (obj == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        final i i02 = k.i0(FlowQuery.a(FlowQuery.f(((v) obj).i().b0()), o.b()));
        final ExperimentRepoImpl experimentRepoImpl = this.f14248b;
        return new i<Map<String, ? extends String>>() { // from class: com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$observeExperiments$2\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n98#3:51\n99#3,3:58\n1193#4,2:52\n1267#4,4:54\n*S KotlinDebug\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$observeExperiments$2\n*L\n98#1:52,2\n98#1:54,4\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f14215a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ExperimentRepoImpl f14216b;

                @d(c = "com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1$2", f = "ExperimentRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, ExperimentRepoImpl experimentRepoImpl) {
                    this.f14215a = jVar;
                    this.f14216b = experimentRepoImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, j00.c r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L3a
                        if (r2 != r3) goto L32
                        java.lang.Object r8 = r0.L$3
                        kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
                        java.lang.Object r8 = r0.L$1
                        com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1$2$1 r8 = (com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r8
                        kotlin.e.n(r9)
                        goto Lc1
                    L32:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L3a:
                        kotlin.e.n(r9)
                        kotlinx.coroutines.flow.j r9 = r7.f14215a
                        r2 = r8
                        java.util.List r2 = (java.util.List) r2
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        r4 = 10
                        int r4 = a00.i0.d0(r2, r4)
                        int r4 = a00.k1.j(r4)
                        r5 = 16
                        int r4 = g10.u.u(r4, r5)
                        java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                        r5.<init>(r4)
                        java.util.Iterator r2 = r2.iterator()
                    L5d:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L81
                        java.lang.Object r4 = r2.next()
                        f4.f0 r4 = (f4.f0) r4
                        java.lang.String r6 = r4.e()
                        java.lang.String r4 = r4.f()
                        kotlin.Pair r4 = yz.h1.a(r6, r4)
                        java.lang.Object r6 = r4.getFirst()
                        java.lang.Object r4 = r4.getSecond()
                        r5.put(r6, r4)
                        goto L5d
                    L81:
                        com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl r2 = r7.f14216b
                        a40.j r2 = com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.g(r2)
                        r2.g(r5)
                        com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl r2 = r7.f14216b
                        a40.j r2 = com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.h(r2)
                        com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl r4 = r7.f14216b
                        com.baicizhan.app.biz.auth.r r4 = com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.i(r4)
                        java.lang.Long r4 = r4.b()
                        r2.g(r4)
                        java.lang.Object r2 = l00.k.a(r8)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r8 = l00.k.a(r8)
                        r0.L$2 = r8
                        java.lang.Object r8 = l00.k.a(r9)
                        r0.L$3 = r8
                        r8 = 0
                        r0.I$0 = r8
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r5, r0)
                        if (r8 != r1) goto Lc1
                        return r1
                    Lc1:
                        yz.g2 r8 = yz.g2.f100423a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$observeExperiments$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Map<String, ? extends String>> jVar, c cVar2) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, experimentRepoImpl), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, c<? super i<? extends Map<String, ? extends String>>> cVar) {
        return invoke2(r0Var, (c<? super i<? extends Map<String, String>>>) cVar);
    }
}
