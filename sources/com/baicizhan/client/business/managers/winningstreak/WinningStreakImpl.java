package com.baicizhan.client.business.managers.winningstreak;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.r0;
import c40.s0;
import com.baicizhan.client.business.managers.winningstreak.d;
import com.baicizhan.client.business.managers.winningstreak.data.CurrentCount;
import com.baicizhan.client.business.thrift.m;
import com.baicizhan.online.user_study_api.WinStreakStatus;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import m80.k;
import q9.x;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nIWinningStreak.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IWinningStreak.kt\ncom/baicizhan/client/business/managers/winningstreak/WinningStreakImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n49#2:186\n51#2:190\n49#2:191\n51#2:195\n49#2:196\n51#2:200\n46#3:187\n51#3:189\n46#3:192\n51#3:194\n46#3:197\n51#3:199\n105#4:188\n105#4:193\n105#4:198\n1#5:201\n*S KotlinDebug\n*F\n+ 1 IWinningStreak.kt\ncom/baicizhan/client/business/managers/winningstreak/WinningStreakImpl\n*L\n58#1:186\n58#1:190\n106#1:191\n106#1:195\n124#1:196\n124#1:200\n58#1:187\n58#1:189\n106#1:192\n106#1:194\n124#1:197\n124#1:199\n58#1:188\n106#1:193\n124#1:198\n*E\n"})
/* loaded from: classes4.dex */
public final class WinningStreakImpl implements com.baicizhan.client.business.managers.winningstreak.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f16473e = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ca.b f16474a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final aa.a f16475b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x f16476c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r0 f16477d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$checkSpanDay$1", f = "IWinningStreak.kt", i = {0, 0, 0}, l = {158}, m = "invokeSuspend", n = {"$this$flow", "current", "date"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class a extends SuspendLambda implements p<j<? super Integer>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f16490a;

        /* renamed from: b, reason: collision with root package name */
        public int f16491b;

        /* renamed from: c, reason: collision with root package name */
        public int f16492c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f16493d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f16494e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ WinningStreakImpl f16495f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, WinningStreakImpl winningStreakImpl, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f16494e = j11;
            this.f16495f = winningStreakImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f16494e, this.f16495f, cVar);
            aVar.f16493d = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f16493d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f16492c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                int c11 = com.baicizhan.client.business.managers.winningstreak.b.c(this.f16494e);
                CurrentCount d11 = this.f16495f.f16474a.d();
                qb.c.i(com.baicizhan.client.business.managers.winningstreak.b.f16506a, d11 + " , " + c11, new Object[0]);
                if (d11.g() != c11) {
                    this.f16495f.f16474a.j(new CurrentCount(0, c11));
                }
                Integer f11 = l00.a.f(c11);
                this.f16493d = l00.k.a(jVar);
                this.f16490a = l00.k.a(d11);
                this.f16491b = c11;
                this.f16492c = 1;
                if (jVar.emit(f11, this) == l11) {
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
        public final Object invoke(j<? super Integer> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$sync$1", f = "IWinningStreak.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<Integer, j00.c<? super i<? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16496a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WinningStreakImpl.this.new b(cVar);
        }

        public final Object invoke(int i11, j00.c<? super i<Boolean>> cVar) {
            return ((b) create(Integer.valueOf(i11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f16496a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return WinningStreakImpl.this.o();
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, j00.c<? super i<? extends Boolean>> cVar) {
            return invoke(num.intValue(), (j00.c<? super i<Boolean>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$sync$2", f = "IWinningStreak.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements p<Boolean, j00.c<? super i<? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16498a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WinningStreakImpl.this.new c(cVar);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super i<? extends Boolean>> cVar) {
            return invoke(bool.booleanValue(), (j00.c<? super i<Boolean>>) cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f16498a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return WinningStreakImpl.this.n();
        }

        public final Object invoke(boolean z11, j00.c<? super i<Boolean>> cVar) {
            return ((c) create(Boolean.valueOf(z11), cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements l<ca.e, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f16500a = new d();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(ca.e it) {
            g0.p(it, "it");
            return Integer.valueOf(it.e());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$winning$2", f = "IWinningStreak.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements p<com.baicizhan.client.business.managers.winningstreak.d, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16501a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16502b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$winning$2$1", f = "IWinningStreak.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements q<j<? super Boolean>, Throwable, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16504a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f16505b;

            public a(j00.c<? super a> cVar) {
                super(3, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Throwable th2 = (Throwable) this.f16505b;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f16504a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                qb.c.c(com.baicizhan.client.business.managers.winningstreak.b.f16506a, "", th2);
                return g2.f100423a;
            }

            @Override // x00.q
            public final Object invoke(j<? super Boolean> jVar, Throwable th2, j00.c<? super g2> cVar) {
                a aVar = new a(cVar);
                aVar.f16505b = th2;
                return aVar.invokeSuspend(g2.f100423a);
            }
        }

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = WinningStreakImpl.this.new e(cVar);
            eVar.f16502b = obj;
            return eVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.baicizhan.client.business.managers.winningstreak.d dVar, j00.c<? super g2> cVar) {
            return ((e) create(dVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.baicizhan.client.business.managers.winningstreak.d dVar = (com.baicizhan.client.business.managers.winningstreak.d) this.f16502b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f16501a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if ((dVar instanceof d.c) || (dVar instanceof d.C0269d)) {
                kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(WinningStreakImpl.this.o(), new a(null)), WinningStreakImpl.this.f16477d);
            }
            return g2.f100423a;
        }
    }

    @Inject
    public WinningStreakImpl(@k ca.b local, @k aa.a serverTime, @k x studyMgr) {
        g0.p(local, "local");
        g0.p(serverTime, "serverTime");
        g0.p(studyMgr, "studyMgr");
        this.f16474a = local;
        this.f16475b = serverTime;
        this.f16476c = studyMgr;
        this.f16477d = s0.a(h1.c());
    }

    @Override // com.baicizhan.client.business.managers.winningstreak.a
    @k
    public i<Boolean> a() {
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.C0(kotlinx.coroutines.flow.k.C0(m(this.f16475b.currentTimeMillis()), new b(null)), new c(null)), h1.c());
    }

    @Override // com.baicizhan.client.business.managers.winningstreak.a
    @k
    public f b() {
        return com.baicizhan.client.business.managers.winningstreak.b.d(this.f16474a.g());
    }

    @Override // com.baicizhan.client.business.managers.winningstreak.a
    @k
    public com.baicizhan.client.business.managers.winningstreak.c c() {
        WinStreakStatus g11 = this.f16474a.g();
        boolean z11 = false;
        if (g11 != null && g11.taskStatus == 2) {
            z11 = true;
        }
        return new com.baicizhan.client.business.managers.winningstreak.c(z11);
    }

    @Override // com.baicizhan.client.business.managers.winningstreak.a
    public boolean d() {
        WinStreakStatus g11 = this.f16474a.g();
        return g11 != null && g11.enableExperienceRanking == 1;
    }

    @Override // com.baicizhan.client.business.managers.winningstreak.a
    public void e() {
        this.f16474a.c();
    }

    @Override // com.baicizhan.client.business.managers.winningstreak.a
    public boolean enable() {
        WinStreakStatus g11 = this.f16474a.g();
        return g11 != null && g11.enable == 1;
    }

    @Override // com.baicizhan.client.business.managers.winningstreak.a
    @k
    public i<com.baicizhan.client.business.managers.winningstreak.d> f() {
        final i<Integer> m11 = m(this.f16476c.H());
        return kotlinx.coroutines.flow.k.h1(new i<com.baicizhan.client.business.managers.winningstreak.d>() { // from class: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$winning$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IWinningStreak.kt\ncom/baicizhan/client/business/managers/winningstreak/WinningStreakImpl\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n50#2:50\n59#3,6:51\n65#3,21:58\n1#4:57\n*E\n"})
            /* renamed from: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$winning$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f16488a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WinningStreakImpl f16489b;

                @l00.d(c = "com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$winning$$inlined$map$1$2", f = "IWinningStreak.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$winning$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, WinningStreakImpl winningStreakImpl) {
                    this.f16488a = jVar;
                    this.f16489b = winningStreakImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x012f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r12, j00.c r13) {
                    /*
                        Method dump skipped, instructions count: 307
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$winning$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super d> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, new e(null));
    }

    @Override // com.baicizhan.client.business.managers.winningstreak.a
    public boolean g() {
        WinStreakStatus g11 = this.f16474a.g();
        return (g11 == null || g11.taskStatus == 0) ? false : true;
    }

    public final i<Integer> m(long j11) {
        return kotlinx.coroutines.flow.k.K0(new a(j11, this, null));
    }

    public final i<Boolean> n() {
        final i b11 = m.f16659a.b("/rpc/user_study");
        return new i<Boolean>() { // from class: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IWinningStreak.kt\ncom/baicizhan/client/business/managers/winningstreak/WinningStreakImpl\n*L\n1#1,49:1\n50#2:50\n125#3,5:51\n*E\n"})
            /* renamed from: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f16480a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WinningStreakImpl f16481b;

                @l00.d(c = "com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1$2", f = "IWinningStreak.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, WinningStreakImpl winningStreakImpl) {
                    this.f16480a = jVar;
                    this.f16481b = winningStreakImpl;
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
                        boolean r0 = r8 instanceof com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1$2$1 r0 = (com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1$2$1 r0 = new com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1$2$1
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
                        com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1$2$1 r7 = (com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L87
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f16480a
                        r2 = r7
                        com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
                        com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl r4 = r6.f16481b
                        aa.a r4 = com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl.k(r4)
                        long r4 = r4.currentTimeMillis()
                        int r4 = com.baicizhan.client.business.managers.winningstreak.b.c(r4)
                        com.baicizhan.online.user_study_api.WinStreakStatus r2 = r2.win_streak_status(r4)
                        com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl r4 = r6.f16481b
                        ca.b r4 = com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl.i(r4)
                        kotlin.jvm.internal.g0.m(r2)
                        r4.k(r2)
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
                        if (r7 != r1) goto L87
                        return r1
                    L87:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$fetchWinningStreak$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Boolean> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    public final i<Boolean> o() {
        final i b11 = m.f16659a.b("/rpc/user_study");
        return new i<Boolean>() { // from class: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$uploadRecord$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 IWinningStreak.kt\ncom/baicizhan/client/business/managers/winningstreak/WinningStreakImpl\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n107#3,2:51\n109#3,4:54\n113#3,7:62\n1#4:53\n1788#5,4:58\n*S KotlinDebug\n*F\n+ 1 IWinningStreak.kt\ncom/baicizhan/client/business/managers/winningstreak/WinningStreakImpl\n*L\n112#1:58,4\n*E\n"})
            /* renamed from: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$uploadRecord$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f16484a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WinningStreakImpl f16485b;

                @l00.d(c = "com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$uploadRecord$$inlined$map$1$2", f = "IWinningStreak.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$uploadRecord$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, WinningStreakImpl winningStreakImpl) {
                    this.f16484a = jVar;
                    this.f16485b = winningStreakImpl;
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
                        Method dump skipped, instructions count: 293
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl$uploadRecord$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super Boolean> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }
}
