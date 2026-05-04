package com.baicizhan.main.activity.mytab.task.data;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import com.baicizhan.client.business.thrift.m;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.online.user_study_api.UserAchievement;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import m80.k;
import org.apache.thrift.TBase;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nCacheAchievementRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheAchievementRepo.kt\ncom/baicizhan/main/activity/mytab/task/data/CacheAchievementRepo\n+ 2 thrift_utils.kt\ncom/baicizhan/client/business/util/Thrift_utilsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,46:1\n28#2:47\n43#2,4:48\n29#2,11:52\n17#3:63\n19#3:67\n49#3:68\n51#3:72\n49#3:73\n51#3:77\n49#3:78\n51#3:82\n46#4:64\n51#4:66\n46#4:69\n51#4:71\n46#4:74\n51#4:76\n46#4:79\n51#4:81\n105#5:65\n105#5:70\n105#5:75\n105#5:80\n*S KotlinDebug\n*F\n+ 1 CacheAchievementRepo.kt\ncom/baicizhan/main/activity/mytab/task/data/CacheAchievementRepo\n*L\n20#1:47\n20#1:48,4\n20#1:52,11\n24#1:63\n24#1:67\n27#1:68\n27#1:72\n30#1:73\n30#1:77\n39#1:78\n39#1:82\n24#1:64\n24#1:66\n27#1:69\n27#1:71\n30#1:74\n30#1:76\n39#1:79\n39#1:81\n24#1:65\n27#1:70\n30#1:75\n39#1:80\n*E\n"})
/* loaded from: classes4.dex */
public final class CacheAchievementRepo implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final int f18725d = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final nc.a f18726a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f18727b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final y<Result<UserAchievement>> f18728c;

    @Inject
    public CacheAchievementRepo(@q9.y @k nc.a mem) {
        g0.p(mem, "mem");
        this.f18726a = mem;
        this.f18727b = "key_thrift_achievement";
        byte[] e11 = mem.e("key_thrift_achievement", null);
        Constructor declaredConstructor = UserAchievement.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        TBase tBase = (TBase) declaredConstructor.newInstance(null);
        Result.a aVar = Result.Companion;
        Object m6308constructorimpl = Result.m6308constructorimpl(tBase);
        try {
            tBase.read(new TBinaryProtocol(new TIOStreamTransport(new ByteArrayInputStream(e11))));
        } catch (Exception e12) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(e12));
            qb.c.c(KotlinExtKt.TAG, "", e12);
        }
        this.f18728c = o0.a(Result.m6307boximpl(m6308constructorimpl));
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.g
    @k
    public kotlinx.coroutines.flow.i<UserAchievement> a() {
        final kotlinx.coroutines.flow.i b11 = m.f16659a.b("/rpc/user_study");
        return kotlinx.coroutines.flow.k.P0(new kotlinx.coroutines.flow.i<UserAchievement>() { // from class: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CacheAchievementRepo.kt\ncom/baicizhan/main/activity/mytab/task/data/CacheAchievementRepo\n+ 4 thrift_utils.kt\ncom/baicizhan/client/business/util/Thrift_utilsKt\n*L\n1#1,49:1\n50#2:50\n40#3,3:51\n43#3,2:64\n14#4,10:54\n*S KotlinDebug\n*F\n+ 1 CacheAchievementRepo.kt\ncom/baicizhan/main/activity/mytab/task/data/CacheAchievementRepo\n*L\n42#1:54,10\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18737a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CacheAchievementRepo f18738b;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1$2", f = "CacheAchievementRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, CacheAchievementRepo cacheAchievementRepo) {
                    this.f18737a = jVar;
                    this.f18738b = cacheAchievementRepo;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, j00.c r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L3a
                        if (r2 != r3) goto L32
                        java.lang.Object r10 = r0.L$3
                        kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                        java.lang.Object r10 = r0.L$1
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1$2$1 r10 = (com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1.AnonymousClass2.AnonymousClass1) r10
                        kotlin.e.n(r11)
                        goto Lac
                    L32:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L3a:
                        kotlin.e.n(r11)
                        kotlinx.coroutines.flow.j r11 = r9.f18737a
                        r2 = r10
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        com.baicizhan.online.user_study_api.UserAchievement r2 = r2.get_achievement()
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo r4 = r9.f18738b
                        nc.a r4 = r4.e()
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo r5 = r9.f18738b
                        java.lang.String r5 = com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo.c(r5)
                        java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
                        r6.<init>()
                        org.apache.thrift.transport.TIOStreamTransport r7 = new org.apache.thrift.transport.TIOStreamTransport
                        r7.<init>(r6)
                        org.apache.thrift.protocol.TBinaryProtocol r8 = new org.apache.thrift.protocol.TBinaryProtocol
                        r8.<init>(r7)
                        r2.write(r8)     // Catch: java.lang.Exception -> L69
                        byte[] r6 = r6.toByteArray()
                        goto L72
                    L69:
                        r6 = move-exception
                        java.lang.String r7 = "KotlinExt"
                        java.lang.String r8 = ""
                        qb.c.c(r7, r8, r6)
                        r6 = 0
                    L72:
                        r4.k(r5, r6)
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo r4 = r9.f18738b
                        kotlinx.coroutines.flow.y r4 = com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo.d(r4)
                        kotlin.Result$a r5 = kotlin.Result.Companion
                        java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r2)
                        kotlin.Result r5 = kotlin.Result.m6307boximpl(r5)
                        r4.setValue(r5)
                        java.lang.Object r4 = l00.k.a(r10)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r10 = l00.k.a(r10)
                        r0.L$2 = r10
                        java.lang.Object r10 = l00.k.a(r11)
                        r0.L$3 = r10
                        r10 = 0
                        r0.I$0 = r10
                        r0.label = r3
                        java.lang.Object r10 = r11.emit(r2, r0)
                        if (r10 != r1) goto Lac
                        return r1
                    Lac:
                        yz.g2 r10 = yz.g2.f100423a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$update$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super UserAchievement> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, h1.c());
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.g
    @k
    public kotlinx.coroutines.flow.i<a> b() {
        final m0 n11 = kotlinx.coroutines.flow.k.n(this.f18728c);
        final kotlinx.coroutines.flow.i<Result<? extends UserAchievement>> iVar = new kotlinx.coroutines.flow.i<Result<? extends UserAchievement>>() { // from class: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CacheAchievementRepo.kt\ncom/baicizhan/main/activity/mytab/task/data/CacheAchievementRepo\n*L\n1#1,49:1\n18#2:50\n19#2:52\n25#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18730a;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1$2", f = "CacheAchievementRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1$2$1, reason: invalid class name */
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
                    this.f18730a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, j00.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.L$3
                        kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                        java.lang.Object r5 = r0.L$1
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1$2$1 r5 = (com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                        kotlin.e.n(r6)
                        goto L6f
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.e.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f18730a
                        r2 = r5
                        kotlin.Result r2 = (kotlin.Result) r2
                        java.lang.Object r2 = r2.m6317unboximpl()
                        boolean r2 = kotlin.Result.m6315isSuccessimpl(r2)
                        if (r2 == 0) goto L6f
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$2 = r2
                        java.lang.Object r2 = l00.k.a(r6)
                        r0.L$3 = r2
                        r2 = 0
                        r0.I$0 = r2
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L6f
                        return r1
                    L6f:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Result<? extends UserAchievement>> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
        final kotlinx.coroutines.flow.i<UserAchievement> iVar2 = new kotlinx.coroutines.flow.i<UserAchievement>() { // from class: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CacheAchievementRepo.kt\ncom/baicizhan/main/activity/mytab/task/data/CacheAchievementRepo\n*L\n1#1,49:1\n50#2:50\n28#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18732a;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1$2", f = "CacheAchievementRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1$2$1, reason: invalid class name */
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
                    this.f18732a = jVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        boolean r0 = r7 instanceof com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1$2$1
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
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1$2$1 r6 = (com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6c
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f18732a
                        r2 = r6
                        kotlin.Result r2 = (kotlin.Result) r2
                        java.lang.Object r2 = r2.m6317unboximpl()
                        kotlin.e.n(r2)
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
                        if (r6 != r1) goto L6c
                        return r1
                    L6c:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super UserAchievement> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
        return new kotlinx.coroutines.flow.i<a>() { // from class: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CacheAchievementRepo.kt\ncom/baicizhan/main/activity/mytab/task/data/CacheAchievementRepo\n*L\n1#1,49:1\n50#2:50\n31#3,5:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18734a;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2$2", f = "CacheAchievementRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2$2$1, reason: invalid class name */
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
                    this.f18734a = jVar;
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
                        boolean r0 = r8 instanceof com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2$2$1
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
                        com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2$2$1 r7 = (com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L6e
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f18734a
                        r2 = r7
                        com.baicizhan.online.user_study_api.UserAchievement r2 = (com.baicizhan.online.user_study_api.UserAchievement) r2
                        com.baicizhan.main.activity.mytab.task.data.a r4 = new com.baicizhan.main.activity.mytab.task.data.a
                        int r5 = r2.total_daka_days
                        int r2 = r2.word_done_count
                        r4.<init>(r5, r2)
                        java.lang.Object r2 = l00.k.a(r7)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r7 = l00.k.a(r7)
                        r0.L$2 = r7
                        java.lang.Object r7 = l00.k.a(r8)
                        r0.L$3 = r7
                        r7 = 0
                        r0.I$0 = r7
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r4, r0)
                        if (r7 != r1) goto L6e
                        return r1
                    L6e:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo$getAchievement$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super a> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    @k
    public final nc.a e() {
        return this.f18726a;
    }
}
