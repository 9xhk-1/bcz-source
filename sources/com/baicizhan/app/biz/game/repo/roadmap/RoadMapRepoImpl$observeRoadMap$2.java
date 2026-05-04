package com.baicizhan.app.biz.game.repo.roadmap;

import app.cash.sqldelight.coroutines.FlowQuery;
import c4.o;
import c40.r0;
import f4.v;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import l00.d;
import p8.e0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2", f = "WordRoadMapRepo.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@u0({"SMAP\nWordRoadMapRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordRoadMapRepo.kt\ncom/baicizhan/app/biz/game/repo/roadmap/RoadMapRepoImpl$observeRoadMap$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,83:1\n49#2:84\n51#2:88\n17#2:89\n19#2:93\n46#3:85\n51#3:87\n46#3:90\n51#3:92\n105#4:86\n105#4:91\n*S KotlinDebug\n*F\n+ 1 WordRoadMapRepo.kt\ncom/baicizhan/app/biz/game/repo/roadmap/RoadMapRepoImpl$observeRoadMap$2\n*L\n43#1:84\n43#1:88\n48#1:89\n48#1:93\n43#1:85\n43#1:87\n48#1:90\n48#1:92\n43#1:86\n48#1:91\n*E\n"})
/* loaded from: classes3.dex */
public final class RoadMapRepoImpl$observeRoadMap$2 extends SuspendLambda implements p<r0, c<? super i<? extends e0>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RoadMapRepoImpl f14362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadMapRepoImpl$observeRoadMap$2(RoadMapRepoImpl roadMapRepoImpl, long j11, c<? super RoadMapRepoImpl$observeRoadMap$2> cVar) {
        super(2, cVar);
        this.f14362b = roadMapRepoImpl;
        this.f14363c = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new RoadMapRepoImpl$observeRoadMap$2(this.f14362b, this.f14363c, cVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(r0 r0Var, c<? super i<e0>> cVar) {
        return ((RoadMapRepoImpl$observeRoadMap$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.f14361a;
        if (i11 == 0) {
            e.n(obj);
            h4.c cVar = this.f14362b.f14334e;
            this.f14361a = 1;
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
        final i e11 = FlowQuery.e(FlowQuery.f(((v) obj).e().S(this.f14363c)), o.b());
        final long j11 = this.f14363c;
        final i v02 = k.v0(new i<e0>() { // from class: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WordRoadMapRepo.kt\ncom/baicizhan/app/biz/game/repo/roadmap/RoadMapRepoImpl$observeRoadMap$2\n*L\n1#1,49:1\n50#2:50\n44#3,2:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f14341a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f14342b;

                @d(c = "com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1$2", f = "WordRoadMapRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, long j11) {
                    this.f14341a = jVar;
                    this.f14342b = j11;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, j00.c r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r12
                        com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1$2$1
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r11 = r0.L$3
                        kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.j) r11
                        java.lang.Object r11 = r0.L$1
                        com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1$2$1 r11 = (com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r11
                        kotlin.e.n(r12)
                        goto L94
                    L31:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L39:
                        kotlin.e.n(r12)
                        kotlinx.coroutines.flow.j r12 = r10.f14341a
                        r2 = r11
                        f4.q2 r2 = (f4.q2) r2
                        z6.b r4 = z6.b.f101032b
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>()
                        java.lang.String r6 = "observeRoadMap: data change bookId="
                        r5.append(r6)
                        long r6 = r10.f14342b
                        r5.append(r6)
                        java.lang.String r6 = r5.toString()
                        r8 = 4
                        r9 = 0
                        java.lang.String r5 = "RoadMapRepo"
                        r7 = 0
                        z6.b.j(r4, r5, r6, r7, r8, r9)
                        if (r2 == 0) goto L6f
                        byte[] r2 = r2.f()
                        if (r2 == 0) goto L6f
                        ts.a<p8.e0, p8.e0$a> r4 = p8.e0.f79771e
                        java.lang.Object r2 = l7.d.c(r2, r4)
                        p8.e0 r2 = (p8.e0) r2
                        goto L70
                    L6f:
                        r2 = 0
                    L70:
                        java.lang.Object r4 = l00.k.a(r11)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r11 = l00.k.a(r11)
                        r0.L$2 = r11
                        java.lang.Object r11 = l00.k.a(r12)
                        r0.L$3 = r11
                        r11 = 0
                        r0.I$0 = r11
                        r0.label = r3
                        java.lang.Object r11 = r12.emit(r2, r0)
                        if (r11 != r1) goto L94
                        return r1
                    L94:
                        yz.g2 r11 = yz.g2.f100423a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super e0> jVar, c cVar2) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, j11), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        });
        final long j12 = this.f14363c;
        return k.i0(new i<e0>() { // from class: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WordRoadMapRepo.kt\ncom/baicizhan/app/biz/game/repo/roadmap/RoadMapRepoImpl$observeRoadMap$2\n*L\n1#1,49:1\n18#2:50\n19#2:53\n49#3,2:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f14337a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f14338b;

                @d(c = "com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1$2", f = "WordRoadMapRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, long j11) {
                    this.f14337a = jVar;
                    this.f14338b = j11;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, j00.c r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r12
                        com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1$2$1
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r11 = r0.L$3
                        kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.j) r11
                        java.lang.Object r11 = r0.L$1
                        com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1$2$1 r11 = (com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r11
                        kotlin.e.n(r12)
                        goto L9a
                    L31:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L39:
                        kotlin.e.n(r12)
                        kotlinx.coroutines.flow.j r12 = r10.f14337a
                        r2 = r11
                        p8.e0 r2 = (p8.e0) r2
                        z6.b r4 = z6.b.f101032b
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>()
                        java.lang.String r6 = "getRoadMap: bookId="
                        r5.append(r6)
                        long r6 = r10.f14338b
                        r5.append(r6)
                        java.lang.String r6 = ", mapSize="
                        r5.append(r6)
                        java.util.List<java.lang.Integer> r6 = r2.f79772a
                        int r6 = r6.size()
                        r5.append(r6)
                        java.lang.String r6 = r5.toString()
                        r8 = 4
                        r9 = 0
                        java.lang.String r5 = "RoadMapRepo"
                        r7 = 0
                        z6.b.j(r4, r5, r6, r7, r8, r9)
                        java.util.List<java.lang.Integer> r2 = r2.f79772a
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L9a
                        java.lang.Object r2 = l00.k.a(r11)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r2 = l00.k.a(r11)
                        r0.L$2 = r2
                        java.lang.Object r2 = l00.k.a(r12)
                        r0.L$3 = r2
                        r2 = 0
                        r0.I$0 = r2
                        r0.label = r3
                        java.lang.Object r11 = r12.emit(r11, r0)
                        if (r11 != r1) goto L9a
                        return r1
                    L9a:
                        yz.g2 r11 = yz.g2.f100423a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$observeRoadMap$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super e0> jVar, c cVar2) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, j12), cVar2);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        });
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, c<? super i<? extends e0>> cVar) {
        return invoke2(r0Var, (c<? super i<e0>>) cVar);
    }
}
