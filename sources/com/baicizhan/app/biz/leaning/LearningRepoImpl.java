package com.baicizhan.app.biz.leaning;

import c4.j;
import c4.o;
import c40.r0;
import com.baicizhan.app.biz.auth.n;
import com.baicizhan.app.biz.auth.p;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.m0;
import m80.k;
import m80.l;
import oa0.r;
import yz.g2;
import z8.c1;
import z8.p0;
import z8.s0;
import z8.t1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {com.baicizhan.app.biz.leaning.a.class})
@u0({"SMAP\nILearningRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ILearningRepo.kt\ncom/baicizhan/app/biz/leaning/LearningRepoImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,182:1\n49#2:183\n51#2:187\n46#3:184\n51#3:186\n105#4:185\n*S KotlinDebug\n*F\n+ 1 ILearningRepo.kt\ncom/baicizhan/app/biz/leaning/LearningRepoImpl\n*L\n48#1:183\n48#1:187\n48#1:184\n48#1:186\n48#1:185\n*E\n"})
/* loaded from: classes3.dex */
public final class LearningRepoImpl implements com.baicizhan.app.biz.leaning.a, j, p, com.baicizhan.app.biz.auth.j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n7.e f15452b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h7.g f15453c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final y6.a f15454d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.leaning.LearningRepoImpl$2", f = "ILearningRepo.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<p0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15457a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15458b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = LearningRepoImpl.this.new a(cVar);
            aVar.f15458b = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p0 p0Var, j00.c<? super g2> cVar) {
            return ((a) create(p0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.f15458b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f15457a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                LearningRepoImpl learningRepoImpl = LearningRepoImpl.this;
                this.f15458b = l00.k.a(p0Var);
                this.f15457a = 1;
                if (learningRepoImpl.j(p0Var, this) == l11) {
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
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.leaning.LearningRepoImpl$3", f = "ILearningRepo.kt", i = {0}, l = {59}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<t1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15460a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15461b;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = LearningRepoImpl.this.new b(cVar);
            bVar.f15461b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t1 t1Var, j00.c<? super g2> cVar) {
            return ((b) create(t1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t1 t1Var = (t1) this.f15461b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f15460a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                LearningRepoImpl learningRepoImpl = LearningRepoImpl.this;
                this.f15461b = l00.k.a(t1Var);
                this.f15460a = 1;
                if (learningRepoImpl.k(t1Var, this) == l11) {
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
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.leaning.LearningRepoImpl", f = "ILearningRepo.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7}, l = {79, 86, 87, 90, 94, 102, 103, 117}, m = "loadSchedule", n = {"scope", "update", "scope", "old", "basicInfoTask", "update", "scope", "old", "basicInfoTask", "basicInfo", "update", "scope", "old", "basicInfoTask", "basicInfo", "update", "scope", "old", "basicInfoTask", "basicInfo", "update", "scope", "old", "basicInfoTask", "basicInfo", "studyHomeTask", "update", "scope", "old", "basicInfoTask", "basicInfo", "studyHomeTask", "studyHome", "update", "scope", "old", "basicInfoTask", "basicInfo", "studyHomeTask", "studyHome", "learnInfo", "it", "update", "$i$a$-also-LearningRepoImpl$loadSchedule$2"}, s = {"L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "Z$0", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15463a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15464b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15465c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15466d;

        /* renamed from: e, reason: collision with root package name */
        public Object f15467e;

        /* renamed from: f, reason: collision with root package name */
        public Object f15468f;

        /* renamed from: g, reason: collision with root package name */
        public Object f15469g;

        /* renamed from: h, reason: collision with root package name */
        public Object f15470h;

        /* renamed from: i, reason: collision with root package name */
        public Object f15471i;

        /* renamed from: j, reason: collision with root package name */
        public Object f15472j;

        /* renamed from: k, reason: collision with root package name */
        public int f15473k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f15474l;

        /* renamed from: n, reason: collision with root package name */
        public int f15476n;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f15474l = obj;
            this.f15476n |= Integer.MIN_VALUE;
            return LearningRepoImpl.this.g(false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.leaning.LearningRepoImpl$loadSchedule$basicInfoTask$1", f = "ILearningRepo.kt", i = {}, l = {82, 84}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super c1>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15477a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f15478b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LearningRepoImpl f15479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z11, LearningRepoImpl learningRepoImpl, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f15478b = z11;
            this.f15479c = learningRepoImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f15478b, this.f15479c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super c1> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        
            if (r5.u2(false, r4) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f15477a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                return r5
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L35
            L1e:
                kotlin.e.n(r5)
                boolean r5 = r4.f15478b
                if (r5 == 0) goto L35
                com.baicizhan.app.biz.leaning.LearningRepoImpl r5 = r4.f15479c
                n7.e r5 = com.baicizhan.app.biz.leaning.LearningRepoImpl.a(r5)
                r4.f15477a = r3
                r1 = 0
                java.lang.Object r5 = r5.u2(r1, r4)
                if (r5 != r0) goto L35
                goto L43
            L35:
                com.baicizhan.app.biz.leaning.LearningRepoImpl r5 = r4.f15479c
                n7.e r5 = com.baicizhan.app.biz.leaning.LearningRepoImpl.a(r5)
                r4.f15477a = r2
                java.lang.Object r5 = r5.p1(r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.leaning.LearningRepoImpl.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.leaning.LearningRepoImpl$loadSchedule$studyHomeTask$1", f = "ILearningRepo.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super s0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15480a;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return LearningRepoImpl.this.new e(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super s0> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f15480a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            h7.g gVar = LearningRepoImpl.this.f15453c;
            this.f15480a = 1;
            Object g11 = gVar.g(this);
            return g11 == l11 ? l11 : g11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.leaning.LearningRepoImpl", f = "ILearningRepo.kt", i = {}, l = {73, 74}, m = "onLogout", n = {}, s = {}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15482a;

        /* renamed from: c, reason: collision with root package name */
        public int f15484c;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f15482a = obj;
            this.f15484c |= Integer.MIN_VALUE;
            return LearningRepoImpl.this.A2(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.leaning.LearningRepoImpl", f = "ILearningRepo.kt", i = {0, 1, 1, 1}, l = {123, 131}, m = "updateBookInfo", n = {"studyHome", "studyHome", "it", "$i$a$-also-LearningRepoImpl$updateBookInfo$3"}, s = {"L$0", "L$0", "L$2", "I$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15485a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15486b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15487c;

        /* renamed from: d, reason: collision with root package name */
        public int f15488d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f15489e;

        /* renamed from: g, reason: collision with root package name */
        public int f15491g;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f15489e = obj;
            this.f15491g |= Integer.MIN_VALUE;
            return LearningRepoImpl.this.j(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.leaning.LearningRepoImpl", f = "ILearningRepo.kt", i = {0, 1, 1, 1}, l = {143, 150}, m = "updateDailyCount", n = {"userLearnInfo", "userLearnInfo", "it", "$i$a$-also-LearningRepoImpl$updateDailyCount$3"}, s = {"L$0", "L$0", "L$2", "I$0"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15492a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15493b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15494c;

        /* renamed from: d, reason: collision with root package name */
        public int f15495d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f15496e;

        /* renamed from: g, reason: collision with root package name */
        public int f15498g;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f15496e = obj;
            this.f15498g |= Integer.MIN_VALUE;
            return LearningRepoImpl.this.k(null, this);
        }
    }

    public LearningRepoImpl(@k n7.e baseInfoRepo, @k h7.g homeRepo, @k y6.a scheduleStorage, @k n logoutHub, @k com.baicizhan.app.biz.auth.k devicesChangeHub) {
        g0.p(baseInfoRepo, "baseInfoRepo");
        g0.p(homeRepo, "homeRepo");
        g0.p(scheduleStorage, "scheduleStorage");
        g0.p(logoutHub, "logoutHub");
        g0.p(devicesChangeHub, "devicesChangeHub");
        this.f15452b = baseInfoRepo;
        this.f15453c = homeRepo;
        this.f15454d = scheduleStorage;
        logoutHub.b(this);
        devicesChangeHub.a(this);
        r0 a11 = c40.s0.a(o.b());
        final m0<s0> state = homeRepo.getState();
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.v0(new i<p0>() { // from class: com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ILearningRepo.kt\ncom/baicizhan/app/biz/leaning/LearningRepoImpl\n*L\n1#1,49:1\n50#2:50\n49#3:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f15456a;

                @l00.d(c = "com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1$2", f = "ILearningRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1$2$1, reason: invalid class name */
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
                    this.f15456a = jVar;
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
                        boolean r0 = r7 instanceof com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1$2$1
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
                        com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1$2$1 r6 = (com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6b
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f15456a
                        r2 = r6
                        z8.s0 r2 = (z8.s0) r2
                        if (r2 == 0) goto L46
                        z8.p0 r2 = r2.f102002b
                        goto L47
                    L46:
                        r2 = 0
                    L47:
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
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.leaning.LearningRepoImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super p0> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }), new a(null)), a11);
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.v0(baseInfoRepo.I0()), new b(null)), a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0291, code lost:
    
        if (r1 != r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020a, code lost:
    
        if (r1.a(r2) == r3) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r24, j00.c<? super com.baicizhan.app.biz.leaning.c> r25) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.leaning.LearningRepoImpl.g(boolean, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object i(LearningRepoImpl learningRepoImpl, boolean z11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return learningRepoImpl.g(z11, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r6.v(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.biz.auth.p
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A2(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.biz.leaning.LearningRepoImpl.f
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.biz.leaning.LearningRepoImpl$f r0 = (com.baicizhan.app.biz.leaning.LearningRepoImpl.f) r0
            int r1 = r0.f15484c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15484c = r1
            goto L18
        L13:
            com.baicizhan.app.biz.leaning.LearningRepoImpl$f r0 = new com.baicizhan.app.biz.leaning.LearningRepoImpl$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15482a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15484c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.e.n(r6)
            goto L46
        L38:
            kotlin.e.n(r6)
            y6.a r6 = r5.f15454d
            r0.f15484c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            n7.e r6 = r5.f15452b
            r0.f15484c = r3
            java.lang.Object r6 = r6.v(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.leaning.LearningRepoImpl.A2(j00.c):java.lang.Object");
    }

    @Override // com.baicizhan.app.biz.auth.j
    @l
    public Object c(@k j00.c<? super g2> cVar) {
        Object v11 = this.f15452b.v(cVar);
        return v11 == kotlin.coroutines.intrinsics.b.l() ? v11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x013a, code lost:
    
        if (r2.c(r5, r3) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r2 == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(z8.p0 r23, j00.c<? super yz.g2> r24) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.leaning.LearningRepoImpl.j(z8.p0, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
    
        if (r1.c(r7, r2) == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0115, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        if (r1 == r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(z8.t1 r20, j00.c<? super yz.g2> r21) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.leaning.LearningRepoImpl.k(z8.t1, j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    @Override // com.baicizhan.app.biz.leaning.a
    @l
    public Object t(@k j00.c<? super com.baicizhan.app.biz.leaning.c> cVar) {
        return g(false, cVar);
    }

    @Override // com.baicizhan.app.biz.leaning.a
    @l
    public Object u(int i11, @k j00.c<? super g2> cVar) {
        Object g11 = g(true, cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
