package com.baicizhan.main.home.experiment.repo;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStudyServiceFx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyServiceFx.kt\ncom/baicizhan/main/home/experiment/repo/StudyServiceFxKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,34:1\n49#2:35\n51#2:39\n49#2:40\n51#2:44\n46#3:36\n51#3:38\n46#3:41\n51#3:43\n105#4:37\n105#4:42\n*S KotlinDebug\n*F\n+ 1 StudyServiceFx.kt\ncom/baicizhan/main/home/experiment/repo/StudyServiceFxKt\n*L\n15#1:35\n15#1:39\n24#1:40\n24#1:44\n15#1:36\n15#1:38\n24#1:41\n24#1:43\n15#1:37\n24#1:42\n*E\n"})
/* loaded from: classes4.dex */
public final class StudyServiceFxKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.StudyServiceFxKt", f = "StudyServiceFx.kt", i = {}, l = {26}, m = "userBasicInfoV2", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f21452a;

        /* renamed from: b, reason: collision with root package name */
        public int f21453b;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21452a = obj;
            this.f21453b |= Integer.MIN_VALUE;
            return StudyServiceFxKt.b(this);
        }
    }

    @m80.l
    public static final Object a(final int i11, final int i12, @m80.k j00.c<? super g2> cVar) {
        final kotlinx.coroutines.flow.i b11 = com.baicizhan.client.business.thrift.m.f16659a.b("/rpc/user_study");
        Object w02 = kotlinx.coroutines.flow.k.w0(new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StudyServiceFx.kt\ncom/baicizhan/main/home/experiment/repo/StudyServiceFxKt\n*L\n1#1,49:1\n50#2:50\n16#3,2:51\n*E\n"})
            /* renamed from: com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f21447a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f21448b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f21449c;

                @l00.d(c = "com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1$2", f = "StudyServiceFx.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, int i11, int i12) {
                    this.f21447a = jVar;
                    this.f21448b = i11;
                    this.f21449c = i12;
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
                        boolean r0 = r8 instanceof com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1$2$1 r0 = (com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1$2$1 r0 = new com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1$2$1
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
                        com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1$2$1 r7 = (com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L70
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f21447a
                        r2 = r7
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        int r4 = r6.f21448b
                        int r5 = r6.f21449c
                        r2.study_addition(r4, r5)
                        java.lang.Boolean r2 = l00.a.a(r3)
                        java.lang.Object r4 = l00.k.a(r7)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r7 = l00.k.a(r7)
                        r0.L$2 = r7
                        java.lang.Object r7 = l00.k.a(r8)
                        r0.L$3 = r7
                        r7 = 0
                        r0.I$0 = r7
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L70
                        return r1
                    L70:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$addCount$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c cVar2) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, i11, i12), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, cVar);
        return w02 == kotlin.coroutines.intrinsics.b.l() ? w02 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@m80.k j00.c<? super com.baicizhan.online.user_study_api.UserBasicInfoPlusV2> r4) {
        /*
            boolean r0 = r4 instanceof com.baicizhan.main.home.experiment.repo.StudyServiceFxKt.a
            if (r0 == 0) goto L13
            r0 = r4
            com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$a r0 = (com.baicizhan.main.home.experiment.repo.StudyServiceFxKt.a) r0
            int r1 = r0.f21453b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21453b = r1
            goto L18
        L13:
            com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$a r0 = new com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f21452a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f21453b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r4)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L31:
            kotlin.e.n(r4)
            com.baicizhan.client.business.thrift.m r4 = com.baicizhan.client.business.thrift.m.f16659a
            java.lang.String r2 = "/rpc/user_study"
            kotlinx.coroutines.flow.i r4 = r4.b(r2)
            com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$userBasicInfoV2$$inlined$map$1 r2 = new com.baicizhan.main.home.experiment.repo.StudyServiceFxKt$userBasicInfoV2$$inlined$map$1
            r2.<init>()
            r0.f21453b = r3
            java.lang.Object r4 = kotlinx.coroutines.flow.k.w0(r2, r0)
            if (r4 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.StudyServiceFxKt.b(j00.c):java.lang.Object");
    }
}
