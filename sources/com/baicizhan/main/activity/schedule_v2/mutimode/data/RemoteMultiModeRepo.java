package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.r0;
import com.baicizhan.client.business.thrift.m;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nIMutiModeRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMutiModeRepo.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/data/RemoteMultiModeRepo\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,64:1\n49#2:65\n51#2:69\n49#2:70\n51#2:74\n46#3:66\n51#3:68\n46#3:71\n51#3:73\n105#4:67\n105#4:72\n*S KotlinDebug\n*F\n+ 1 IMutiModeRepo.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/data/RemoteMultiModeRepo\n*L\n30#1:65\n30#1:69\n33#1:70\n33#1:74\n30#1:66\n30#1:68\n33#1:71\n33#1:73\n30#1:67\n33#1:72\n*E\n"})
/* loaded from: classes4.dex */
public final class RemoteMultiModeRepo implements com.baicizhan.main.activity.schedule_v2.mutimode.data.b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19284c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final nc.a f19285a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19286b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$isModeDescRead$1", f = "IMutiModeRepo.kt", i = {0}, l = {45}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class a extends SuspendLambda implements p<j<? super Boolean>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19291a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19292b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f19294d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f19294d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = RemoteMultiModeRepo.this.new a(this.f19294d, cVar);
            aVar.f19292b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f19292b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19291a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                Boolean a11 = l00.a.a(RemoteMultiModeRepo.this.e().getBoolean(RemoteMultiModeRepo.this.f19286b + this.f19294d.a(), false));
                this.f19292b = l00.k.a(jVar);
                this.f19291a = 1;
                if (jVar.emit(a11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }

        @Override // x00.p
        public final Object invoke(j<? super Boolean> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeDescRead$2", f = "IMutiModeRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19295a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f19297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f19297c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return RemoteMultiModeRepo.this.new b(this.f19297c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19295a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            RemoteMultiModeRepo.this.e().j(RemoteMultiModeRepo.this.f19286b + this.f19297c.a(), true);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements l<com.baicizhan.online.user_study_api.ModeDetail, ModeDetail> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f19298a = new c();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ModeDetail invoke(com.baicizhan.online.user_study_api.ModeDetail modeDetail) {
            ModeDetail c11;
            g0.m(modeDetail);
            c11 = d.c(modeDetail);
            return c11;
        }
    }

    @Inject
    public RemoteMultiModeRepo(@q9.k @k nc.a kv2) {
        g0.p(kv2, "kv");
        this.f19285a = kv2;
        this.f19286b = "mode_desc_";
    }

    @Override // com.baicizhan.main.activity.schedule_v2.mutimode.data.b
    @k
    public i<Boolean> a(@k e modeType) {
        g0.p(modeType, "modeType");
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.K0(new a(modeType, null)), h1.c());
    }

    @Override // com.baicizhan.main.activity.schedule_v2.mutimode.data.b
    @k
    public i<List<ModeDetail>> b() {
        final i b11 = m.f16659a.b("/rpc/user_study");
        final i<List<com.baicizhan.online.user_study_api.ModeDetail>> iVar = new i<List<com.baicizhan.online.user_study_api.ModeDetail>>() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IMutiModeRepo.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/data/RemoteMultiModeRepo\n*L\n1#1,49:1\n50#2:50\n31#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f19288a;

                @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1$2", f = "IMutiModeRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar) {
                    this.f19288a = jVar;
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
                        boolean r0 = r7 instanceof com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1$2$1
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
                        com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1$2$1 r6 = (com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L69
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f19288a
                        r2 = r6
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        java.util.List r2 = r2.book_mode_list()
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
                        if (r6 != r1) goto L69
                        return r1
                    L69:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super List<com.baicizhan.online.user_study_api.ModeDetail>> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
        return kotlinx.coroutines.flow.k.P0(new i<List<? extends ModeDetail>>() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IMutiModeRepo.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/data/RemoteMultiModeRepo\n*L\n1#1,49:1\n50#2:50\n34#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f19290a;

                @l00.d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2$2", f = "IMutiModeRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar) {
                    this.f19290a = jVar;
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
                        boolean r0 = r7 instanceof com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2$2$1 r0 = (com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2$2$1 r0 = new com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2$2$1
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
                        com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2$2$1 r6 = (com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L78
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f19290a
                        r2 = r6
                        java.util.List r2 = (java.util.List) r2
                        kotlin.jvm.internal.g0.m(r2)
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        q30.m r2 = a00.r0.E1(r2)
                        com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$c r4 = com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo.c.f19298a
                        q30.m r2 = q30.k0.N1(r2, r4)
                        java.util.List r2 = q30.k0.I3(r2)
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
                        if (r6 != r1) goto L78
                        return r1
                    L78:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo$modeList$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super List<? extends ModeDetail>> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, h1.c());
    }

    @Override // com.baicizhan.main.activity.schedule_v2.mutimode.data.b
    @m80.l
    public Object c(@k e eVar, @k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(h1.c(), new b(eVar, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @k
    public final nc.a e() {
        return this.f19285a;
    }
}
