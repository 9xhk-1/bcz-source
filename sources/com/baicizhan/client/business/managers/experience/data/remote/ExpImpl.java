package com.baicizhan.client.business.managers.experience.data.remote;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.thrift.m;
import com.baicizhan.online.user_study_api.StudyExperienceRecord;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nIExpRemote.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IExpRemote.kt\ncom/baicizhan/client/business/managers/experience/data/remote/ExpImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,24:1\n49#2:25\n51#2:29\n46#3:26\n51#3:28\n105#4:27\n*S KotlinDebug\n*F\n+ 1 IExpRemote.kt\ncom/baicizhan/client/business/managers/experience/data/remote/ExpImpl\n*L\n18#1:25\n18#1:29\n18#1:26\n18#1:28\n18#1:27\n*E\n"})
/* loaded from: classes4.dex */
public final class ExpImpl implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16451a = 0;

    @Inject
    public ExpImpl() {
    }

    @Override // com.baicizhan.client.business.managers.experience.data.remote.b
    @k
    public i<Boolean> a(@k final List<? extends StudyExperienceRecord> assembleRecords) {
        g0.p(assembleRecords, "assembleRecords");
        final i b11 = m.f16659a.b("/rpc/user_study");
        return new i<Boolean>() { // from class: com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IExpRemote.kt\ncom/baicizhan/client/business/managers/experience/data/remote/ExpImpl\n*L\n1#1,49:1\n50#2:50\n19#3,2:51\n*E\n"})
            /* renamed from: com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f16454a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f16455b;

                @l00.d(c = "com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1$2", f = "IExpRemote.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, List list) {
                    this.f16454a = jVar;
                    this.f16455b = list;
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
                        boolean r0 = r7 instanceof com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1$2$1 r0 = (com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1$2$1 r0 = new com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1$2$1
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
                        com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1$2$1 r6 = (com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6e
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f16454a
                        r2 = r6
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        java.util.List r4 = r5.f16455b
                        r2.submit_experience_record(r4)
                        java.lang.Boolean r2 = l00.a.a(r3)
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
                        if (r6 != r1) goto L6e
                        return r1
                    L6e:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.managers.experience.data.remote.ExpImpl$submitRecord$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Boolean> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, assembleRecords), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }
}
