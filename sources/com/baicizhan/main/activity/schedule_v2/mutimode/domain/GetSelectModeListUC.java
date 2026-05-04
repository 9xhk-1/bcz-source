package com.baicizhan.main.activity.schedule_v2.mutimode.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.ModeDetail;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.h;
import j00.c;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nGetSelectModeListUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetSelectModeListUC.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/domain/GetSelectModeListUC\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,30:1\n49#2:31\n51#2:35\n46#3:32\n51#3:34\n105#4:33\n*S KotlinDebug\n*F\n+ 1 GetSelectModeListUC.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/domain/GetSelectModeListUC\n*L\n17#1:31\n17#1:35\n17#1:32\n17#1:34\n17#1:33\n*E\n"})
/* loaded from: classes4.dex */
public final class GetSelectModeListUC {

    /* renamed from: b, reason: collision with root package name */
    public static final int f19322b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.main.activity.schedule_v2.mutimode.data.b f19323a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements l<ModeDetail, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19326a = new a();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(ModeDetail it) {
            g0.p(it, "it");
            return Boolean.valueOf(!g0.g(it.k(), e.f.f19312d));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements l<ModeDetail, h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f19327a;

        public b(e eVar) {
            this.f19327a = eVar;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke(ModeDetail it) {
            g0.p(it, "it");
            return new h(it, g0.g(it.k(), this.f19327a));
        }
    }

    @Inject
    public GetSelectModeListUC(@k com.baicizhan.main.activity.schedule_v2.mutimode.data.b modeRepo) {
        g0.p(modeRepo, "modeRepo");
        this.f19323a = modeRepo;
    }

    @k
    public final i<List<h>> a() {
        final i<List<ModeDetail>> b11 = this.f19323a.b();
        return new i<List<? extends h>>() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GetSelectModeListUC.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/domain/GetSelectModeListUC\n*L\n1#1,49:1\n50#2:50\n18#3,11:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f19325a;

                @d(c = "com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1$2", f = "GetSelectModeListUC.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar) {
                    this.f19325a = jVar;
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
                        boolean r0 = r8 instanceof com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1$2$1
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
                        com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1$2$1 r7 = (com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L84
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f19325a
                        r2 = r7
                        java.util.List r2 = (java.util.List) r2
                        ch.m r4 = ch.m.f8648a
                        com.baicizhan.main.activity.schedule_v2.mutimode.data.e r4 = r4.a()
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        q30.m r2 = a00.r0.E1(r2)
                        com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$a r5 = com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC.a.f19326a
                        q30.m r2 = q30.k0.P0(r2, r5)
                        com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$b r5 = new com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$b
                        r5.<init>(r4)
                        q30.m r2 = q30.k0.N1(r2, r5)
                        java.util.List r2 = q30.k0.I3(r2)
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
                        if (r7 != r1) goto L84
                        return r1
                    L84:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super List<? extends h>> jVar, c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == b.l() ? collect : g2.f100423a;
            }
        };
    }
}
