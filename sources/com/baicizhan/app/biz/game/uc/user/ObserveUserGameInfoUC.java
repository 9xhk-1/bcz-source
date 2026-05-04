package com.baicizhan.app.biz.game.uc.user;

import c40.r0;
import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import h5.w0;
import h5.x;
import h5.y;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l6.o;
import m80.k;
import oa0.r;
import r6.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nObserveUserGameInfoUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserveUserGameInfoUC.kt\ncom/baicizhan/app/biz/game/uc/user/ObserveUserGameInfoUC\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,203:1\n189#2:204\n774#3:205\n865#3,2:206\n*S KotlinDebug\n*F\n+ 1 ObserveUserGameInfoUC.kt\ncom/baicizhan/app/biz/game/uc/user/ObserveUserGameInfoUC\n*L\n52#1:204\n193#1:205\n193#1:206,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveUserGameInfoUC {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f15363e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f15364f = "ObserveUserGameInfoUC";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c6.b f15365a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f15366b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f15367c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final GetABTestUC f15368d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC", f = "ObserveUserGameInfoUC.kt", i = {0, 1, 2, 2, 3, 3}, l = {85, 86, 94, 97}, m = "createCurrentSnapshot", n = {"energyModel", "energyModel", "energyModel", "memberShip", "energyModel", "memberShip"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15379a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15380b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15381c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15382d;

        /* renamed from: e, reason: collision with root package name */
        public Object f15383e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f15384f;

        /* renamed from: h, reason: collision with root package name */
        public int f15386h;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f15384f = obj;
            this.f15386h |= Integer.MIN_VALUE;
            return ObserveUserGameInfoUC.this.f(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$createTimeTriggeredFlow$2", f = "ObserveUserGameInfoUC.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {123, 125, 129, 130}, m = "invokeSuspend", n = {"$this$flow", "currentTime", "nextTriggerTime", "delayTime", "$this$flow", "currentTime", "nextTriggerTime", "delayTime", "$this$flow", "currentTime", "nextTriggerTime", "$this$flow", "currentTime", "nextTriggerTime"}, s = {"L$0", "J$0", "J$1", "J$2", "L$0", "J$0", "J$1", "J$2", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"}, v = 1)
    public static final class c extends SuspendLambda implements p<j<? super g2>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f15387a;

        /* renamed from: b, reason: collision with root package name */
        public long f15388b;

        /* renamed from: c, reason: collision with root package name */
        public long f15389c;

        /* renamed from: d, reason: collision with root package name */
        public int f15390d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f15391e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ w0 f15393g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w0 w0Var, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f15393g = w0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = ObserveUserGameInfoUC.this.new c(this.f15393g, cVar);
            cVar2.f15391e = obj;
            return cVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0114, code lost:
        
            if (r1.emit(r3, r20) == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0126, code lost:
        
            if (c40.a1.b(1000, r20) == r2) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00f5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0126 -> B:8:0x0129). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(j<? super g2> jVar, j00.c<? super g2> cVar) {
            return ((c) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC", f = "ObserveUserGameInfoUC.kt", i = {0}, l = {48}, m = "invoke", n = {"languageType"}, s = {"L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15394a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15395b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15396c;

        /* renamed from: e, reason: collision with root package name */
        public int f15398e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f15396c = obj;
            this.f15398e |= Integer.MIN_VALUE;
            return ObserveUserGameInfoUC.this.h(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$invoke$2", f = "ObserveUserGameInfoUC.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements q<Boolean, h5.g, j00.c<? super h5.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15399a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15400b;

        public e(j00.c<? super e> cVar) {
            super(3, cVar);
        }

        public final Object i(boolean z11, h5.g gVar, j00.c<? super h5.g> cVar) {
            e eVar = new e(cVar);
            eVar.f15400b = gVar;
            return eVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, h5.g gVar, j00.c<? super h5.g> cVar) {
            return i(bool.booleanValue(), gVar, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h5.g gVar = (h5.g) this.f15400b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15399a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return gVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$invoke$3$1", f = "ObserveUserGameInfoUC.kt", i = {0}, l = {61}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class f extends SuspendLambda implements p<j<? super g2>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15401a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15402b;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = new f(cVar);
            fVar.f15402b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f15402b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f15401a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                g2 g2Var = g2.f100423a;
                this.f15402b = l00.k.a(jVar);
                this.f15401a = 1;
                if (jVar.emit(g2Var, this) == l11) {
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
        public final Object invoke(j<? super g2> jVar, j00.c<? super g2> cVar) {
            return ((f) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$invoke$3$3$1", f = "ObserveUserGameInfoUC.kt", i = {0, 0, 0}, l = {71}, m = "invokeSuspend", n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-ObserveUserGameInfoUC$invoke$3$3$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class g extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f15403a;

        /* renamed from: b, reason: collision with root package name */
        public int f15404b;

        /* renamed from: c, reason: collision with root package name */
        public int f15405c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15406d;

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = ObserveUserGameInfoUC.this.new g(cVar);
            gVar.f15406d = obj;
            return gVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            r0 r0Var = (r0) this.f15406d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f15405c;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    ObserveUserGameInfoUC observeUserGameInfoUC = ObserveUserGameInfoUC.this;
                    Result.a aVar = Result.Companion;
                    l lVar = observeUserGameInfoUC.f15366b;
                    this.f15406d = l00.k.a(r0Var);
                    this.f15403a = l00.k.a(r0Var);
                    this.f15404b = 0;
                    this.f15405c = 1;
                    if (lVar.c(this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            return Result.m6307boximpl(m6308constructorimpl);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
            return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
        }
    }

    public ObserveUserGameInfoUC(@k c6.b userRepo, @k l fetchEntitlementsUC, @k o getEnergyUC, @k GetABTestUC getABTestUC) {
        g0.p(userRepo, "userRepo");
        g0.p(fetchEntitlementsUC, "fetchEntitlementsUC");
        g0.p(getEnergyUC, "getEnergyUC");
        g0.p(getABTestUC, "getABTestUC");
        this.f15365a = userRepo;
        this.f15366b = fetchEntitlementsUC;
        this.f15367c = getEnergyUC;
        this.f15368d = getABTestUC;
    }

    public final long e(w0 w0Var, long j11) {
        z6.b bVar = z6.b.f101032b;
        z6.b.d(bVar, "ObserveUserGameInfoUC", "calculateNextTriggerTime - currentTime: " + j11, null, 4, null);
        ArrayList arrayList = new ArrayList();
        y i11 = w0Var.i();
        if (com.baicizhan.app.biz.game.model.a.d(i11)) {
            arrayList.add(Long.valueOf(i11.e()));
            z6.b.d(bVar, "ObserveUserGameInfoUC", "added VIP expiration trigger: " + i11.e(), null, 4, null);
        }
        h5.g h11 = w0Var.h();
        long d11 = h11.j().d();
        if (d11 > j11) {
            arrayList.add(Long.valueOf(d11));
            z6.b.d(bVar, "ObserveUserGameInfoUC", "added unlimited energy expiration trigger: " + d11, null, 4, null);
        }
        x h12 = h11.h();
        if (h12.p() > 0) {
            long j12 = h12.j() + h12.p();
            if (j12 > j11) {
                arrayList.add(Long.valueOf(j12));
                z6.b.d(bVar, "ObserveUserGameInfoUC", "added energy recovery trigger: " + j12, null, 4, null);
            }
            if (h12.h() < h12.l()) {
                long l11 = (((h12.l() - h12.h()) + h12.n()) - 1) / h12.n();
                z6.b.d(bVar, "ObserveUserGameInfoUC", "energy not full - current: " + h12.h() + ", max: " + h12.l() + ", periods needed: " + l11, null, 4, null);
                if (1 <= l11) {
                    long j13 = 1;
                    while (true) {
                        long p11 = (h12.p() * j13) + j12;
                        if (p11 > j11) {
                            arrayList.add(Long.valueOf(p11));
                            z6.b.d(z6.b.f101032b, "ObserveUserGameInfoUC", "added future energy recovery trigger [" + j13 + "]: " + p11, null, 4, null);
                        }
                        if (j13 == l11) {
                            break;
                        }
                        j13++;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).longValue() > j11) {
                arrayList2.add(obj);
            }
        }
        Long l12 = (Long) a00.r0.m4(arrayList2);
        long longValue = l12 != null ? l12.longValue() : j11 + 3600000;
        if (arrayList.isEmpty()) {
            z6.b.j(z6.b.f101032b, "ObserveUserGameInfoUC", "no specific triggers found, using default 1 hour delay: " + longValue, null, 4, null);
            return longValue;
        }
        z6.b.j(z6.b.f101032b, "ObserveUserGameInfoUC", "next trigger time selected: " + longValue + " (" + arrayList.size() + " candidates)", null, 4, null);
        return longValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(h5.g r11, j00.c<? super h5.w0> r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC.f(h5.g, j00.c):java.lang.Object");
    }

    public final Object g(w0 w0Var, j00.c<? super i<g2>> cVar) {
        return kotlinx.coroutines.flow.k.K0(new c(w0Var, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@m80.k com.baicizhan.app.biz.game.repo.userresource.LanguageType r12, @m80.k j00.c<? super kotlinx.coroutines.flow.i<h5.w0>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC.d
            if (r0 == 0) goto L13
            r0 = r13
            com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$d r0 = (com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC.d) r0
            int r1 = r0.f15398e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15398e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$d r0 = new com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f15396c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15398e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.f15395b
            kotlinx.coroutines.flow.i r12 = (kotlinx.coroutines.flow.i) r12
            java.lang.Object r0 = r0.f15394a
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r0 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r0
            kotlin.e.n(r13)
            goto L73
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.e.n(r13)
            z6.b r4 = z6.b.f101032b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "invoke started for languageType: "
            r13.append(r2)
            r13.append(r12)
            java.lang.String r6 = r13.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "ObserveUserGameInfoUC"
            r7 = 0
            z6.b.j(r4, r5, r6, r7, r8, r9)
            c6.b r13 = r11.f15365a
            kotlinx.coroutines.flow.i r13 = r13.n()
            l6.o r2 = r11.f15367c
            java.lang.Object r4 = l00.k.a(r12)
            r0.f15394a = r4
            r0.f15395b = r13
            r0.f15398e = r3
            java.lang.Object r12 = r2.f(r12, r0)
            if (r12 != r1) goto L70
            return r1
        L70:
            r10 = r13
            r13 = r12
            r12 = r10
        L73:
            kotlinx.coroutines.flow.i r13 = (kotlinx.coroutines.flow.i) r13
            com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$e r0 = new com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$e
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.flow.i r12 = kotlinx.coroutines.flow.k.I(r12, r13, r0)
            com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$invoke$$inlined$flatMapLatest$1 r13 = new com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$invoke$$inlined$flatMapLatest$1
            r13.<init>(r1, r11)
            kotlinx.coroutines.flow.i r12 = kotlinx.coroutines.flow.k.f2(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC.h(com.baicizhan.app.biz.game.repo.userresource.LanguageType, j00.c):java.lang.Object");
    }
}
