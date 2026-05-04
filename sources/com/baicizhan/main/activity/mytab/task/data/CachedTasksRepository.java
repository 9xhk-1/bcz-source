package com.baicizhan.main.activity.mytab.task.data;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import com.baicizhan.client.business.thrift.m;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.user_study_api.CreditCenter;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nCachedTasksRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedTasksRepository.kt\ncom/baicizhan/main/activity/mytab/task/data/CachedTasksRepository\n+ 2 thrift_utils.kt\ncom/baicizhan/client/business/util/Thrift_utilsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,142:1\n28#2:143\n43#2,4:144\n29#2,11:148\n17#3:159\n19#3:163\n49#3:164\n51#3:168\n49#3:169\n51#3:173\n49#3:174\n51#3:178\n49#3:179\n51#3:183\n49#3:184\n51#3:188\n46#4:160\n51#4:162\n46#4:165\n51#4:167\n46#4:170\n51#4:172\n46#4:175\n51#4:177\n46#4:180\n51#4:182\n46#4:185\n51#4:187\n105#5:161\n105#5:166\n105#5:171\n105#5:176\n105#5:181\n105#5:186\n*S KotlinDebug\n*F\n+ 1 CachedTasksRepository.kt\ncom/baicizhan/main/activity/mytab/task/data/CachedTasksRepository\n*L\n43#1:143\n43#1:144,4\n43#1:148,11\n46#1:159\n46#1:163\n47#1:164\n47#1:168\n48#1:169\n48#1:173\n53#1:174\n53#1:178\n92#1:179\n92#1:183\n97#1:184\n97#1:188\n46#1:160\n46#1:162\n47#1:165\n47#1:167\n48#1:170\n48#1:172\n53#1:175\n53#1:177\n92#1:180\n92#1:182\n97#1:185\n97#1:187\n46#1:161\n47#1:166\n48#1:171\n53#1:176\n92#1:181\n97#1:186\n*E\n"})
/* loaded from: classes4.dex */
public final class CachedTasksRepository implements h {

    /* renamed from: j, reason: collision with root package name */
    public static final int f18739j = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final nc.a f18740a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final nc.a f18741b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f18742c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f18743d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f18744e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f18745f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final y<Integer> f18746g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final y<Integer> f18747h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final y<Result<CreditCenter>> f18748i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$setNewFlagRead$1", f = "CachedTasksRepository.kt", i = {0}, l = {71}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class a extends SuspendLambda implements p<j<? super Object>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18767a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18768b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = CachedTasksRepository.this.new a(cVar);
            aVar.f18768b = obj;
            return aVar;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(j<? super Object> jVar, j00.c<? super g2> cVar) {
            return invoke2((j<Object>) jVar, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f18768b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f18767a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                CachedTasksRepository cachedTasksRepository = CachedTasksRepository.this;
                cachedTasksRepository.p().m(cachedTasksRepository.f18742c, currentTimeMillis);
                cachedTasksRepository.f18746g.setValue(l00.a.f(currentTimeMillis));
                Object obj2 = new Object();
                this.f18768b = l00.k.a(jVar);
                this.f18767a = 1;
                if (jVar.emit(obj2, this) == l11) {
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

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j<Object> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$setTodayCoinRead$1", f = "CachedTasksRepository.kt", i = {0}, l = {86}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class b extends SuspendLambda implements p<j<? super Object>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18770a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18771b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f18773d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f18773d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = CachedTasksRepository.this.new b(this.f18773d, cVar);
            bVar.f18771b = obj;
            return bVar;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(j<? super Object> jVar, j00.c<? super g2> cVar) {
            return invoke2((j<Object>) jVar, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f18771b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f18770a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                CachedTasksRepository.this.p().p(CachedTasksRepository.this.f18743d, BczJson.toJson(new CoinReadStore(TimeUtil.todayStart(), this.f18773d)));
                CachedTasksRepository.this.f18747h.setValue(l00.a.f(this.f18773d));
                Object obj2 = new Object();
                this.f18771b = l00.k.a(jVar);
                this.f18770a = 1;
                if (jVar.emit(obj2, this) == l11) {
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

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j<Object> jVar, j00.c<? super g2> cVar) {
            return ((b) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @Inject
    public CachedTasksRepository(@q9.y @k nc.a mem, @q9.k @k nc.a kv2) {
        g0.p(mem, "mem");
        g0.p(kv2, "kv");
        this.f18740a = mem;
        this.f18741b = kv2;
        this.f18742c = "tasks_new_flag_read";
        this.f18743d = "tasks_today_coin_read";
        this.f18744e = "coin_center_update_time";
        this.f18745f = "key_thrift_task_center";
        int i11 = 0;
        this.f18746g = o0.a(Integer.valueOf(kv2.getInt("tasks_new_flag_read", 0)));
        try {
            CoinReadStore coinReadStore = (CoinReadStore) BczJson.fromJson(kv2.getString("tasks_today_coin_read", ""), CoinReadStore.class);
            if (coinReadStore != null) {
                if (coinReadStore.getReadDay() != TimeUtil.todayStart()) {
                    coinReadStore = null;
                }
                if (coinReadStore != null) {
                    i11 = coinReadStore.getCount();
                }
            }
        } catch (Exception unused) {
        }
        this.f18747h = o0.a(Integer.valueOf(i11));
        byte[] e11 = this.f18740a.e(this.f18745f, null);
        Constructor declaredConstructor = CreditCenter.class.getDeclaredConstructor(null);
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
        this.f18748i = o0.a(Result.m6307boximpl(m6308constructorimpl));
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.h
    @k
    public kotlinx.coroutines.flow.i<CreditCenter> a() {
        final kotlinx.coroutines.flow.i b11 = m.f16659a.b("/rpc/user_study");
        return kotlinx.coroutines.flow.k.P0(new kotlinx.coroutines.flow.i<CreditCenter>() { // from class: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CachedTasksRepository.kt\ncom/baicizhan/main/activity/mytab/task/data/CachedTasksRepository\n+ 4 thrift_utils.kt\ncom/baicizhan/client/business/util/Thrift_utilsKt\n+ 5 CommonUtils2.kt\ncom/baicizhan/main/utils/CommonUtils2Kt\n*L\n1#1,49:1\n50#2:50\n54#3,4:51\n58#3,2:65\n60#3,2:68\n14#4,10:55\n144#5:67\n*S KotlinDebug\n*F\n+ 1 CachedTasksRepository.kt\ncom/baicizhan/main/activity/mytab/task/data/CachedTasksRepository\n*L\n57#1:55,10\n59#1:67\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18765a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CachedTasksRepository f18766b;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1$2", f = "CachedTasksRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, CachedTasksRepository cachedTasksRepository) {
                    this.f18765a = jVar;
                    this.f18766b = cachedTasksRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r12, j00.c r13) {
                    /*
                        r11 = this;
                        boolean r0 = r13 instanceof com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r13
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1$2$1
                        r0.<init>(r13)
                    L18:
                        java.lang.Object r13 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L3a
                        if (r2 != r3) goto L32
                        java.lang.Object r12 = r0.L$3
                        kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.j) r12
                        java.lang.Object r12 = r0.L$1
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1$2$1 r12 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1.AnonymousClass2.AnonymousClass1) r12
                        kotlin.e.n(r13)
                        goto Le4
                    L32:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r13)
                        throw r12
                    L3a:
                        kotlin.e.n(r13)
                        kotlinx.coroutines.flow.j r13 = r11.f18765a
                        r2 = r12
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        com.baicizhan.online.user_study_api.CreditCenter r2 = r2.credit_task_center()
                        long r4 = java.lang.System.currentTimeMillis()
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository r6 = r11.f18766b
                        nc.a r6 = r6.q()
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository r7 = r11.f18766b
                        java.lang.String r7 = com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository.l(r7)
                        java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream
                        r8.<init>()
                        org.apache.thrift.transport.TIOStreamTransport r9 = new org.apache.thrift.transport.TIOStreamTransport
                        r9.<init>(r8)
                        org.apache.thrift.protocol.TBinaryProtocol r10 = new org.apache.thrift.protocol.TBinaryProtocol
                        r10.<init>(r9)
                        r2.write(r10)     // Catch: java.lang.Exception -> L6d
                        byte[] r8 = r8.toByteArray()
                        goto L76
                    L6d:
                        r8 = move-exception
                        java.lang.String r9 = "KotlinExt"
                        java.lang.String r10 = ""
                        qb.c.c(r9, r10, r8)
                        r8 = 0
                    L76:
                        r6.k(r7, r8)
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository r6 = r11.f18766b
                        nc.a r6 = r6.p()
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository r7 = r11.f18766b
                        java.lang.String r7 = com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository.i(r7)
                        r6.n(r7, r4)
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository r6 = r11.f18766b
                        java.lang.Class r6 = r6.getClass()
                        java.lang.String r6 = r6.getSimpleName()
                        java.lang.String r7 = "getSimpleName(...)"
                        kotlin.jvm.internal.g0.o(r6, r7)
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "task center updated "
                        r7.append(r8)
                        r7.append(r4)
                        java.lang.String r4 = r7.toString()
                        r5 = 0
                        java.lang.Object[] r7 = new java.lang.Object[r5]
                        qb.c.i(r6, r4, r7)
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository r4 = r11.f18766b
                        kotlinx.coroutines.flow.y r4 = com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository.m(r4)
                        kotlin.Result$a r6 = kotlin.Result.Companion
                        java.lang.Object r6 = kotlin.Result.m6308constructorimpl(r2)
                        kotlin.Result r6 = kotlin.Result.m6307boximpl(r6)
                        r4.setValue(r6)
                        java.lang.Object r4 = l00.k.a(r12)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r12 = l00.k.a(r12)
                        r0.L$2 = r12
                        java.lang.Object r12 = l00.k.a(r13)
                        r0.L$3 = r12
                        r0.I$0 = r5
                        r0.label = r3
                        java.lang.Object r12 = r13.emit(r2, r0)
                        if (r12 != r1) goto Le4
                        return r1
                    Le4:
                        yz.g2 r12 = yz.g2.f100423a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$update$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super CreditCenter> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, h1.c());
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.h
    @k
    public kotlinx.coroutines.flow.i<Integer> b() {
        return kotlinx.coroutines.flow.k.n(this.f18747h);
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.h
    @k
    public kotlinx.coroutines.flow.i<String> c(final int i11) {
        final kotlinx.coroutines.flow.i b11 = m.f16659a.b("/rpc/user_study");
        return kotlinx.coroutines.flow.k.P0(new kotlinx.coroutines.flow.i<String>() { // from class: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CachedTasksRepository.kt\ncom/baicizhan/main/activity/mytab/task/data/CachedTasksRepository\n*L\n1#1,49:1\n50#2:50\n93#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18761a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f18762b;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1$2", f = "CachedTasksRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, int i11) {
                    this.f18761a = jVar;
                    this.f18762b = i11;
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
                        boolean r0 = r7 instanceof com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1$2$1
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
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1$2$1 r6 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6b
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f18761a
                        r2 = r6
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        int r4 = r5.f18762b
                        java.lang.String r2 = r2.receive_task_award(r4)
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
                        if (r6 != r1) goto L6b
                        return r1
                    L6b:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$receiveTaskAward$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super String> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, i11), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, h1.c());
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.h
    @k
    public kotlinx.coroutines.flow.i<f> d() {
        final m0 n11 = kotlinx.coroutines.flow.k.n(this.f18748i);
        final kotlinx.coroutines.flow.i<Result<? extends CreditCenter>> iVar = new kotlinx.coroutines.flow.i<Result<? extends CreditCenter>>() { // from class: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CachedTasksRepository.kt\ncom/baicizhan/main/activity/mytab/task/data/CachedTasksRepository\n*L\n1#1,49:1\n18#2:50\n19#2:52\n46#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18750a;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1$2", f = "CachedTasksRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1$2$1, reason: invalid class name */
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
                    this.f18750a = jVar;
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
                        boolean r0 = r6 instanceof com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1$2$1
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
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1$2$1 r5 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                        kotlin.e.n(r6)
                        goto L6f
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.e.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f18750a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Result<? extends CreditCenter>> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
        final kotlinx.coroutines.flow.i<CreditCenter> iVar2 = new kotlinx.coroutines.flow.i<CreditCenter>() { // from class: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CachedTasksRepository.kt\ncom/baicizhan/main/activity/mytab/task/data/CachedTasksRepository\n*L\n1#1,49:1\n50#2:50\n47#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18752a;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1$2", f = "CachedTasksRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1$2$1, reason: invalid class name */
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
                    this.f18752a = jVar;
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
                        boolean r0 = r7 instanceof com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1$2$1
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
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1$2$1 r6 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6c
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f18752a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super CreditCenter> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
        return new kotlinx.coroutines.flow.i<f>() { // from class: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CachedTasksRepository.kt\ncom/baicizhan/main/activity/mytab/task/data/CachedTasksRepository\n*L\n1#1,49:1\n50#2:50\n49#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18755a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CachedTasksRepository f18756b;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2$2", f = "CachedTasksRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, CachedTasksRepository cachedTasksRepository) {
                    this.f18755a = jVar;
                    this.f18756b = cachedTasksRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, j00.c r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r9 = r0.L$3
                        kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                        java.lang.Object r9 = r0.L$1
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2$2$1 r9 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2.AnonymousClass2.AnonymousClass1) r9
                        kotlin.e.n(r10)
                        goto L7b
                    L31:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L39:
                        kotlin.e.n(r10)
                        kotlinx.coroutines.flow.j r10 = r8.f18755a
                        r2 = r9
                        com.baicizhan.online.user_study_api.CreditCenter r2 = (com.baicizhan.online.user_study_api.CreditCenter) r2
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository r4 = r8.f18756b
                        nc.a r4 = r4.p()
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository r5 = r8.f18756b
                        java.lang.String r5 = com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository.i(r5)
                        r6 = 0
                        long r4 = r4.getLong(r5, r6)
                        com.baicizhan.main.activity.mytab.task.data.f r2 = com.baicizhan.main.activity.mytab.task.data.d.b(r2, r4)
                        java.lang.Object r4 = l00.k.a(r9)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r9 = l00.k.a(r9)
                        r0.L$2 = r9
                        java.lang.Object r9 = l00.k.a(r10)
                        r0.L$3 = r9
                        r9 = 0
                        r0.I$0 = r9
                        r0.label = r3
                        java.lang.Object r9 = r10.emit(r2, r0)
                        if (r9 != r1) goto L7b
                        return r1
                    L7b:
                        yz.g2 r9 = yz.g2.f100423a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$getTaskInfo$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super f> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.h
    @k
    public kotlinx.coroutines.flow.i<Object> e(int i11) {
        return kotlinx.coroutines.flow.k.K0(new b(i11, null));
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.h
    @k
    public kotlinx.coroutines.flow.i<Integer> f() {
        return kotlinx.coroutines.flow.k.n(this.f18746g);
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.h
    @k
    public kotlinx.coroutines.flow.i<Boolean> g() {
        final m0 n11 = kotlinx.coroutines.flow.k.n(this.f18748i);
        return new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CachedTasksRepository.kt\ncom/baicizhan/main/activity/mytab/task/data/CachedTasksRepository\n*L\n1#1,49:1\n50#2:50\n98#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18758a;

                @l00.d(c = "com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1$2", f = "CachedTasksRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1$2$1, reason: invalid class name */
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
                    this.f18758a = jVar;
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
                        boolean r0 = r8 instanceof com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1$2$1
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
                        com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1$2$1 r7 = (com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L7f
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f18758a
                        r2 = r7
                        kotlin.Result r2 = (kotlin.Result) r2
                        java.lang.Object r2 = r2.m6317unboximpl()
                        boolean r4 = kotlin.Result.m6314isFailureimpl(r2)
                        if (r4 == 0) goto L4c
                        r2 = 0
                    L4c:
                        com.baicizhan.online.user_study_api.CreditCenter r2 = (com.baicizhan.online.user_study_api.CreditCenter) r2
                        r4 = 0
                        if (r2 == 0) goto L57
                        int r2 = r2.show_credit_center
                        if (r2 != r3) goto L57
                        r2 = r3
                        goto L58
                    L57:
                        r2 = r4
                    L58:
                        java.lang.Boolean r2 = l00.a.a(r2)
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
                        if (r7 != r1) goto L7f
                        return r1
                    L7f:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository$isABTestOpen$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Boolean> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    @Override // com.baicizhan.main.activity.mytab.task.data.h
    @k
    public kotlinx.coroutines.flow.i<Object> h() {
        return kotlinx.coroutines.flow.k.K0(new a(null));
    }

    @k
    public final nc.a p() {
        return this.f18741b;
    }

    @k
    public final nc.a q() {
        return this.f18740a;
    }
}
