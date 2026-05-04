package com.baicizhan.main.home.plan.allinone;

import com.baicizhan.online.user_study_api.StudyHomeV2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStudyServiceFX.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyServiceFX.kt\ncom/baicizhan/main/home/plan/allinone/StudyServiceFXKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,30:1\n49#2:31\n51#2:35\n49#2:36\n51#2:40\n49#2:41\n51#2:45\n46#3:32\n51#3:34\n46#3:37\n51#3:39\n46#3:42\n51#3:44\n105#4:33\n105#4:38\n105#4:43\n*S KotlinDebug\n*F\n+ 1 StudyServiceFX.kt\ncom/baicizhan/main/home/plan/allinone/StudyServiceFXKt\n*L\n13#1:31\n13#1:35\n20#1:36\n20#1:40\n26#1:41\n26#1:45\n13#1:32\n13#1:34\n20#1:37\n20#1:39\n26#1:42\n26#1:44\n13#1:33\n20#1:38\n26#1:43\n*E\n"})
/* loaded from: classes4.dex */
public final class StudyServiceFXKt {
    @m80.l
    public static final Object a(final int i11, final int i12, @m80.k j00.c<? super yz.g2> cVar) {
        final kotlinx.coroutines.flow.i b11 = com.baicizhan.client.business.thrift.m.f16659a.b("/rpc/user_study");
        Object w02 = kotlinx.coroutines.flow.k.w0(new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StudyServiceFX.kt\ncom/baicizhan/main/home/plan/allinone/StudyServiceFXKt\n*L\n1#1,49:1\n50#2:50\n14#3,2:51\n*E\n"})
            /* renamed from: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f22077a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f22078b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f22079c;

                @l00.d(c = "com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1$2", f = "StudyServiceFX.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1$2$1, reason: invalid class name */
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
                    this.f22077a = jVar;
                    this.f22078b = i11;
                    this.f22079c = i12;
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
                        boolean r0 = r8 instanceof com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1$2$1 r0 = (com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1$2$1 r0 = new com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1$2$1
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
                        com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1$2$1 r7 = (com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L70
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f22077a
                        r2 = r7
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        int r4 = r6.f22078b
                        int r5 = r6.f22079c
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
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$addCount$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c cVar2) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, i11, i12), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : yz.g2.f100423a;
            }
        }, cVar);
        return w02 == kotlin.coroutines.intrinsics.b.l() ? w02 : yz.g2.f100423a;
    }

    @m80.k
    public static final kotlinx.coroutines.flow.i<StudyHomeV2> b() {
        final kotlinx.coroutines.flow.i b11 = com.baicizhan.client.business.thrift.m.f16659a.b("/rpc/user_study");
        return new kotlinx.coroutines.flow.i<StudyHomeV2>() { // from class: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StudyServiceFX.kt\ncom/baicizhan/main/home/plan/allinone/StudyServiceFXKt\n*L\n1#1,49:1\n50#2:50\n21#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f22081a;

                @l00.d(c = "com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1$2", f = "StudyServiceFX.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1$2$1, reason: invalid class name */
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
                    this.f22081a = jVar;
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
                        boolean r0 = r8 instanceof com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1$2$1 r0 = (com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1$2$1 r0 = new com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1$2$1
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
                        com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1$2$1 r7 = (com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L69
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f22081a
                        r2 = r7
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        r4 = 0
                        com.baicizhan.online.user_study_api.StudyHomeV2 r2 = r2.get_study_home_v2(r4)
                        java.lang.Object r5 = l00.k.a(r7)
                        r0.L$0 = r5
                        java.lang.Object r5 = l00.k.a(r0)
                        r0.L$1 = r5
                        java.lang.Object r7 = l00.k.a(r7)
                        r0.L$2 = r7
                        java.lang.Object r7 = l00.k.a(r8)
                        r0.L$3 = r7
                        r0.I$0 = r4
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L69
                        return r1
                    L69:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$refreshHomeState$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super StudyHomeV2> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : yz.g2.f100423a;
            }
        };
    }

    @m80.k
    public static final kotlinx.coroutines.flow.i<Boolean> c() {
        final kotlinx.coroutines.flow.i b11 = com.baicizhan.client.business.thrift.m.f16659a.b("/rpc/user_study");
        return new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StudyServiceFX.kt\ncom/baicizhan/main/home/plan/allinone/StudyServiceFXKt\n*L\n1#1,49:1\n50#2:50\n27#3,2:51\n*E\n"})
            /* renamed from: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f22083a;

                @l00.d(c = "com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1$2", f = "StudyServiceFX.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1$2$1, reason: invalid class name */
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
                    this.f22083a = jVar;
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
                        boolean r0 = r8 instanceof com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1$2$1 r0 = (com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1$2$1 r0 = new com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1$2$1
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
                        com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1$2$1 r7 = (com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L6c
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f22083a
                        r2 = r7
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        r4 = 0
                        r2.upgrade_4in1(r4)
                        java.lang.Boolean r2 = l00.a.a(r3)
                        java.lang.Object r5 = l00.k.a(r7)
                        r0.L$0 = r5
                        java.lang.Object r5 = l00.k.a(r0)
                        r0.L$1 = r5
                        java.lang.Object r7 = l00.k.a(r7)
                        r0.L$2 = r7
                        java.lang.Object r7 = l00.k.a(r8)
                        r0.L$3 = r7
                        r0.I$0 = r4
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L6c
                        return r1
                    L6c:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.StudyServiceFXKt$upgrade4in1$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : yz.g2.f100423a;
            }
        };
    }
}
