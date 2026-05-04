package com.baicizhan.app.biz.game.uc.ipavatar;

import c40.r0;
import com.baicizhan.app.biz.game.model.IpAvatarState;
import com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC;
import com.baicizhan.app.biz.game.uc.ipavatar.g;
import com.jiongji.andriod.card.R;
import h5.a1;
import h5.f0;
import h5.s;
import h5.u;
import h5.v;
import h8.l;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m6.o;
import oa0.r;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nObserveIpAvatarUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserveIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ObserveIpAvatarUC\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 4 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,216:1\n233#2:217\n235#2:219\n105#3:218\n105#3:223\n105#3:228\n105#3:233\n105#3:239\n189#4:220\n189#4:236\n49#5:221\n51#5:225\n49#5:226\n51#5:230\n49#5:231\n51#5:235\n49#5:237\n51#5:241\n46#6:222\n51#6:224\n46#6:227\n51#6:229\n46#6:232\n51#6:234\n46#6:238\n51#6:240\n*S KotlinDebug\n*F\n+ 1 ObserveIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ObserveIpAvatarUC\n*L\n44#1:217\n44#1:219\n44#1:218\n59#1:223\n62#1:228\n82#1:233\n88#1:239\n49#1:220\n84#1:236\n59#1:221\n59#1:225\n62#1:226\n62#1:230\n82#1:231\n82#1:235\n88#1:237\n88#1:241\n59#1:222\n59#1:224\n62#1:227\n62#1:229\n82#1:232\n82#1:234\n88#1:238\n88#1:240\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveIpAvatarUC {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q5.d f14666a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q5.a f14667b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.d f14668c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final g f14669d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ObserveStreakTasksUC f14670e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final w5.a f14671f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final o f14672g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final a6.a f14673h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$createTravelReturnTimeTriggeredFlow$1", f = "ObserveIpAvatarUC.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {145, 152, 154, 162}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "travelReturnTime", "$i$a$-also-ObserveIpAvatarUC$createTravelReturnTimeTriggeredFlow$1$2", "currentTime", "delayTime", "$this$flow", "travelReturnTime", "$i$a$-also-ObserveIpAvatarUC$createTravelReturnTimeTriggeredFlow$1$2", "currentTime", "delayTime", "$this$flow", "it", "travelReturnTime", "$i$a$-also-ObserveIpAvatarUC$createTravelReturnTimeTriggeredFlow$1$2", "currentTime", "delayTime", "$i$a$-also-ObserveIpAvatarUC$createTravelReturnTimeTriggeredFlow$1$2$2"}, s = {"L$0", "L$0", "J$0", "I$0", "J$1", "J$2", "L$0", "J$0", "I$0", "J$1", "J$2", "L$0", "L$3", "J$0", "I$0", "J$1", "J$2", "I$1"}, v = 1)
    @u0({"SMAP\nObserveIpAvatarUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserveIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ObserveIpAvatarUC$createTravelReturnTimeTriggeredFlow$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    public static final class a extends SuspendLambda implements p<kotlinx.coroutines.flow.j<? super h8.d>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14693a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14694b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14695c;

        /* renamed from: d, reason: collision with root package name */
        public long f14696d;

        /* renamed from: e, reason: collision with root package name */
        public long f14697e;

        /* renamed from: f, reason: collision with root package name */
        public long f14698f;

        /* renamed from: g, reason: collision with root package name */
        public int f14699g;

        /* renamed from: h, reason: collision with root package name */
        public int f14700h;

        /* renamed from: i, reason: collision with root package name */
        public int f14701i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f14702j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ h8.d f14703k;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$createTravelReturnTimeTriggeredFlow$1$2$1", f = "ObserveIpAvatarUC.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$a$a, reason: collision with other inner class name */
        public static final class C0211a extends SuspendLambda implements p<r0, j00.c<? super h8.d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14704a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h8.d f14705b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0211a(h8.d dVar, j00.c<? super C0211a> cVar) {
                super(2, cVar);
                this.f14705b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0211a(this.f14705b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super h8.d> cVar) {
                return ((C0211a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f14704a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                h8.d dVar = this.f14705b;
                l lVar = dVar.f58871a;
                return h8.d.i(dVar, lVar != null ? l.h(lVar, 0, 2, 0, 0, 0, null, 61, null) : null, null, null, false, null, null, null, 126, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h8.d dVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f14703k = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f14703k, cVar);
            aVar.f14702j = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0133, code lost:
        
            if (r1.emit(r5, r24) == r2) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
        
            if (r1.emit(r3, r24) == r2) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super h8.d> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC", f = "ObserveIpAvatarUC.kt", i = {0, 0, 1, 1, 1}, l = {192, 193}, m = "getIpResource", n = {"state", "home", "state", "home", "list"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14706a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14707b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14708c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14709d;

        /* renamed from: f, reason: collision with root package name */
        public int f14711f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14709d = obj;
            this.f14711f |= Integer.MIN_VALUE;
            return ObserveIpAvatarUC.this.l(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC", f = "ObserveIpAvatarUC.kt", i = {}, l = {87, 91}, m = "ownedFlow", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14712a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14713b;

        /* renamed from: d, reason: collision with root package name */
        public int f14715d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14713b = obj;
            this.f14715d |= Integer.MIN_VALUE;
            return ObserveIpAvatarUC.this.p(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$ownedFlow$5", f = "ObserveIpAvatarUC.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements q<h8.d, f0, j00.c<? super h8.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14716a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14717b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14718c;

        public d(j00.c<? super d> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h8.d dVar, f0 f0Var, j00.c<? super h8.d> cVar) {
            d dVar2 = ObserveIpAvatarUC.this.new d(cVar);
            dVar2.f14717b = dVar;
            dVar2.f14718c = f0Var;
            return dVar2.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h8.d dVar = (h8.d) this.f14717b;
            f0 f0Var = (f0) this.f14718c;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f14716a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return ObserveIpAvatarUC.this.n(dVar, f0Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$ownedFlow$6", f = "ObserveIpAvatarUC.kt", i = {0, 0, 0, 0}, l = {98}, m = "invokeSuspend", n = {"homePageInfo", "streak", "curIp", "ipState"}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 1)
    public static final class e extends SuspendLambda implements q<h8.d, a1, j00.c<? super s.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14720a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14721b;

        /* renamed from: c, reason: collision with root package name */
        public int f14722c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14723d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14724e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14726a;

            static {
                int[] iArr = new int[IpAvatarState.values().length];
                try {
                    iArr[IpAvatarState.Traveling.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f14726a = iArr;
            }
        }

        public e(j00.c<? super e> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h8.d dVar, a1 a1Var, j00.c<? super s.a> cVar) {
            e eVar = ObserveIpAvatarUC.this.new e(cVar);
            eVar.f14723d = dVar;
            eVar.f14724e = a1Var;
            return eVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l lVar;
            IpAvatarState ipAvatarState;
            h8.e eVar;
            h8.d dVar = (h8.d) this.f14723d;
            a1 a1Var = (a1) this.f14724e;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14722c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                l lVar2 = dVar.f58871a;
                g0.m(lVar2);
                IpAvatarState m11 = ObserveIpAvatarUC.this.m(a1Var, dVar);
                ObserveIpAvatarUC observeIpAvatarUC = ObserveIpAvatarUC.this;
                this.f14723d = dVar;
                this.f14724e = l00.k.a(a1Var);
                this.f14720a = lVar2;
                this.f14721b = m11;
                this.f14722c = 1;
                Object l12 = observeIpAvatarUC.l(m11, dVar, this);
                if (l12 == l11) {
                    return l11;
                }
                lVar = lVar2;
                obj = l12;
                ipAvatarState = m11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                IpAvatarState ipAvatarState2 = (IpAvatarState) this.f14721b;
                l lVar3 = (l) this.f14720a;
                kotlin.e.n(obj);
                ipAvatarState = ipAvatarState2;
                lVar = lVar3;
            }
            g.a aVar = (g.a) obj;
            if (a.f14726a[ipAvatarState.ordinal()] == 1) {
                eVar = dVar.f58877g;
                if (eVar == null) {
                    eVar = ObserveIpAvatarUC.this.j();
                }
            } else {
                eVar = null;
            }
            h8.e eVar2 = eVar;
            u e11 = aVar.e();
            v f11 = aVar.f();
            Boolean bool = dVar.f58873c;
            return new s.a(e11, f11, bool != null ? bool.booleanValue() : true, lVar, ipAvatarState, eVar2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$3", f = "ObserveIpAvatarUC.kt", i = {0, 0, 1, 1}, l = {67, 67}, m = "invokeSuspend", n = {"autoUnlockFailed", "progress", "autoUnlockFailed", "progress"}, s = {"Z$0", "I$0", "Z$0", "I$0"}, v = 1)
    public static final class f extends SuspendLambda implements q<Boolean, Integer, j00.c<? super s.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14727a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14728b;

        /* renamed from: c, reason: collision with root package name */
        public int f14729c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ boolean f14730d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ int f14731e;

        public f(j00.c<? super f> cVar) {
            super(3, cVar);
        }

        public final Object i(boolean z11, int i11, j00.c<? super s.b> cVar) {
            f fVar = ObserveIpAvatarUC.this.new f(cVar);
            fVar.f14730d = z11;
            fVar.f14731e = i11;
            return fVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Integer num, j00.c<? super s.b> cVar) {
            return i(bool.booleanValue(), num.intValue(), cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r9 == r1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            if (r9 == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                boolean r0 = r8.f14730d
                int r4 = r8.f14731e
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r8.f14729c
                r3 = 2
                r5 = 1
                if (r2 == 0) goto L2a
                if (r2 == r5) goto L1e
                if (r2 != r3) goto L16
                kotlin.e.n(r9)
                goto L5d
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r2 = r8.f14728b
                com.baicizhan.app.biz.game.model.IpAvatarState r2 = (com.baicizhan.app.biz.game.model.IpAvatarState) r2
                java.lang.Object r6 = r8.f14727a
                com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC r6 = (com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC) r6
                kotlin.e.n(r9)
                goto L46
            L2a:
                kotlin.e.n(r9)
                com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC r6 = com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.this
                com.baicizhan.app.biz.game.model.IpAvatarState r2 = com.baicizhan.app.biz.game.model.IpAvatarState.UnOwned
                q5.a r9 = com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.d(r6)
                r8.f14727a = r6
                r8.f14728b = r2
                r8.f14730d = r0
                r8.f14731e = r4
                r8.f14729c = r5
                java.lang.Object r9 = r9.a(r8)
                if (r9 != r1) goto L46
                goto L5c
            L46:
                kotlin.jvm.internal.g0.m(r9)
                h8.d r9 = (h8.d) r9
                r7 = 0
                r8.f14727a = r7
                r8.f14728b = r7
                r8.f14730d = r0
                r8.f14731e = r4
                r8.f14729c = r3
                java.lang.Object r9 = com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.f(r6, r2, r9, r8)
                if (r9 != r1) goto L5d
            L5c:
                return r1
            L5d:
                com.baicizhan.app.biz.game.uc.ipavatar.g$a r9 = (com.baicizhan.app.biz.game.uc.ipavatar.g.a) r9
                h5.s$b r1 = new h5.s$b
                h5.u r2 = r9.e()
                h5.v r3 = r9.f()
                if (r0 == 0) goto L6f
                if (r4 < r5) goto L6f
            L6d:
                r6 = r5
                goto L71
            L6f:
                r5 = 0
                goto L6d
            L71:
                r5 = 1
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ObserveIpAvatarUC(@m80.k q5.d ipPopupRepo, @m80.k q5.a ipAvatarStateRepo, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.d getUnlockedIpResourcesUC, @m80.k g processIpAvatarSnapshotUC, @m80.k ObserveStreakTasksUC observeStreakTasksUC, @m80.k w5.a rewardRepo, @m80.k o extractRewardSummaryUC, @m80.k a6.a studyRoundStatsRepo) {
        g0.p(ipPopupRepo, "ipPopupRepo");
        g0.p(ipAvatarStateRepo, "ipAvatarStateRepo");
        g0.p(getUnlockedIpResourcesUC, "getUnlockedIpResourcesUC");
        g0.p(processIpAvatarSnapshotUC, "processIpAvatarSnapshotUC");
        g0.p(observeStreakTasksUC, "observeStreakTasksUC");
        g0.p(rewardRepo, "rewardRepo");
        g0.p(extractRewardSummaryUC, "extractRewardSummaryUC");
        g0.p(studyRoundStatsRepo, "studyRoundStatsRepo");
        this.f14666a = ipPopupRepo;
        this.f14667b = ipAvatarStateRepo;
        this.f14668c = getUnlockedIpResourcesUC;
        this.f14669d = processIpAvatarSnapshotUC;
        this.f14670e = observeStreakTasksUC;
        this.f14671f = rewardRepo;
        this.f14672g = extractRewardSummaryUC;
        this.f14673h = studyRoundStatsRepo;
    }

    public final h8.e j() {
        return new h8.e(0, "神秘地点", "Mystery Location", "", "", "", "");
    }

    public final kotlinx.coroutines.flow.i<h8.d> k(h8.d dVar) {
        return kotlinx.coroutines.flow.k.K0(new a(dVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.baicizhan.app.biz.game.model.IpAvatarState r6, h8.d r7, j00.c<? super com.baicizhan.app.biz.game.uc.ipavatar.g.a> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.b
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$b r0 = (com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.b) r0
            int r1 = r0.f14711f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14711f = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$b r0 = new com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14709d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14711f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f14708c
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.f14707b
            h8.d r6 = (h8.d) r6
            java.lang.Object r6 = r0.f14706a
            com.baicizhan.app.biz.game.model.IpAvatarState r6 = (com.baicizhan.app.biz.game.model.IpAvatarState) r6
            kotlin.e.n(r8)
            return r8
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f14707b
            r7 = r6
            h8.d r7 = (h8.d) r7
            java.lang.Object r6 = r0.f14706a
            com.baicizhan.app.biz.game.model.IpAvatarState r6 = (com.baicizhan.app.biz.game.model.IpAvatarState) r6
            kotlin.e.n(r8)
            goto L67
        L4d:
            kotlin.e.n(r8)
            com.baicizhan.app.biz.game.uc.ipavatar.d r8 = r5.f14668c
            java.lang.Object r2 = l00.k.a(r6)
            r0.f14706a = r2
            java.lang.Object r2 = l00.k.a(r7)
            r0.f14707b = r2
            r0.f14711f = r4
            java.lang.Object r8 = r8.d(r6, r7, r0)
            if (r8 != r1) goto L67
            goto L85
        L67:
            java.util.List r8 = (java.util.List) r8
            com.baicizhan.app.biz.game.uc.ipavatar.g r2 = r5.f14669d
            java.lang.Object r6 = l00.k.a(r6)
            r0.f14706a = r6
            java.lang.Object r6 = l00.k.a(r7)
            r0.f14707b = r6
            java.lang.Object r6 = l00.k.a(r8)
            r0.f14708c = r6
            r0.f14711f = r3
            java.lang.Object r6 = r2.b(r8, r0)
            if (r6 != r1) goto L86
        L85:
            return r1
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.l(com.baicizhan.app.biz.game.model.IpAvatarState, h8.d, j00.c):java.lang.Object");
    }

    public final IpAvatarState m(a1 a1Var, h8.d dVar) {
        l lVar = dVar.f58871a;
        g0.m(lVar);
        int i11 = lVar.f58976b;
        Boolean bool = dVar.f58873c;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Long l11 = lVar.f58980f;
        boolean z11 = (l11 != null ? l11.longValue() : 0L) <= w3.g.n();
        return (i11 != 1 || z11) ? (i11 == 2 || (i11 == 1 && z11)) ? IpAvatarState.RewardPending : (booleanValue || lVar.f58977c < lVar.f58978d) ? a1Var.k() ? IpAvatarState.InHomeNoStreak : IpAvatarState.InHome : IpAvatarState.InHomeReady : IpAvatarState.Traveling;
    }

    public final h8.d n(h8.d dVar, f0 f0Var) {
        l lVar;
        if (f0Var.i() == 0) {
            return dVar;
        }
        l lVar2 = dVar.f58871a;
        if (lVar2 != null) {
            int u11 = g10.u.u(lVar2.f58977c - f0Var.i(), 0);
            int i11 = lVar2.f58976b;
            lVar = l.h(lVar2, (i11 != 2 || u11 >= lVar2.f58978d) ? i11 : 0, 0, u11, 0, 0, null, 58, null);
        } else {
            lVar = null;
        }
        return h8.d.i(dVar, lVar, null, null, false, null, null, null, 126, null);
    }

    @m80.l
    public final Object o(@m80.k j00.c<? super kotlinx.coroutines.flow.i<? extends s>> cVar) {
        final kotlinx.coroutines.flow.i[] iVarArr = {this.f14666a.d(), this.f14667b.b()};
        return kotlinx.coroutines.flow.k.f2(kotlinx.coroutines.flow.k.i0(new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$invoke$$inlined$combine$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$invoke$$inlined$combine$1$3", f = "ObserveIpAvatarUC.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2}, l = {R.styleable.Theme_drawable_tab_mall, R.styleable.Theme_drawable_tab_mall_1111, R.styleable.Theme_drawable_tab_lecture_new}, m = "invokeSuspend", n = {"$this$combineInternal", "it", "$completion", "it", "$i$a$-combine-ObserveIpAvatarUC$invoke$2", "$this$combineInternal", "it", "$completion", "it", "avatarBasic", "$i$a$-combine-ObserveIpAvatarUC$invoke$2", "$this$combineInternal", "it"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "L$0", "L$1", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1"}, v = 1)
            @u0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2\n+ 2 ObserveIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ObserveIpAvatarUC\n*L\n1#1,234:1\n45#2,2:235\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$invoke$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements q<kotlinx.coroutines.flow.j<? super Boolean>, Boolean[], j00.c<? super g2>, Object> {
                int I$0;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                int label;
                final /* synthetic */ ObserveIpAvatarUC this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(j00.c cVar, ObserveIpAvatarUC observeIpAvatarUC) {
                    super(3, cVar);
                    this.this$0 = observeIpAvatarUC;
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0109, code lost:
                
                    if (r1.emit(r15, r14) == r0) goto L29;
                 */
                /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        Method dump skipped, instructions count: 271
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$invoke$$inlined$combine$1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // x00.q
                public final Object invoke(kotlinx.coroutines.flow.j<? super Boolean> jVar, Boolean[] boolArr, j00.c<? super g2> cVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar, this.this$0);
                    anonymousClass3.L$0 = jVar;
                    anonymousClass3.L$1 = boolArr;
                    return anonymousClass3.invokeSuspend(g2.f100423a);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$1\n*L\n1#1,234:1\n*E\n"})
            public static final class a implements x00.a<Boolean[]> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.i[] f14676a;

                public a(kotlinx.coroutines.flow.i[] iVarArr) {
                    this.f14676a = iVarArr;
                }

                @Override // x00.a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean[] invoke() {
                    return new Boolean[this.f14676a.length];
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c cVar2) {
                kotlinx.coroutines.flow.i[] iVarArr2 = iVarArr;
                Object a11 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr2, new a(iVarArr2), new AnonymousClass3(null, this), cVar2);
                return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
            }
        }), new ObserveIpAvatarUC$invoke$$inlined$flatMapLatest$1(null, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(@m80.k j00.c<? super kotlinx.coroutines.flow.i<? extends h5.s>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.c
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$c r0 = (com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.c) r0
            int r1 = r0.f14715d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14715d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$c r0 = new com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14713b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14715d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f14712a
            kotlinx.coroutines.flow.i r0 = (kotlinx.coroutines.flow.i) r0
            kotlin.e.n(r8)
            goto L85
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f14712a
            kotlinx.coroutines.flow.i r2 = (kotlinx.coroutines.flow.i) r2
            kotlin.e.n(r8)
            goto L65
        L41:
            kotlin.e.n(r8)
            q5.a r8 = r7.f14667b
            kotlinx.coroutines.flow.i r8 = r8.b()
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$ownedFlow$$inlined$map$1 r2 = new com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$ownedFlow$$inlined$map$1
            r2.<init>()
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1 r8 = new com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1
            r8.<init>(r5, r7)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.f2(r2, r8)
            w5.a r8 = r7.f14671f
            r0.f14712a = r2
            r0.f14715d = r4
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L65
            goto L81
        L65:
            kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$ownedFlow$$inlined$map$2 r4 = new com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$ownedFlow$$inlined$map$2
            r4.<init>()
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$d r8 = new com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$d
            r8.<init>(r5)
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.I(r2, r4, r8)
            com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC r2 = r7.f14670e
            r0.f14712a = r8
            r0.f14715d = r3
            java.lang.Object r0 = r2.f(r0)
            if (r0 != r1) goto L82
        L81:
            return r1
        L82:
            r6 = r0
            r0 = r8
            r8 = r6
        L85:
            kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$e r1 = new com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$e
            r1.<init>(r5)
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.I(r0, r8, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.p(j00.c):java.lang.Object");
    }

    @m80.k
    public final kotlinx.coroutines.flow.i<s> q() {
        final kotlinx.coroutines.flow.i<Boolean> d11 = this.f14666a.d();
        kotlinx.coroutines.flow.i<Boolean> iVar = new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ObserveIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ObserveIpAvatarUC\n*L\n1#1,49:1\n50#2:50\n60#3:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f14687a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ObserveIpAvatarUC f14688b;

                @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1$2", f = "ObserveIpAvatarUC.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ObserveIpAvatarUC$unOwedFlow$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    boolean Z$0;
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, ObserveIpAvatarUC observeIpAvatarUC) {
                    this.f14687a = jVar;
                    this.f14688b = observeIpAvatarUC;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
                
                    if (r2.emit(r11, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, j00.c r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L5b
                        if (r2 == r4) goto L3d
                        if (r2 != r3) goto L35
                        java.lang.Object r10 = r0.L$3
                        kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                        java.lang.Object r10 = r0.L$1
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1$2$1 r10 = (com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r10
                        kotlin.e.n(r11)
                        goto Lc8
                    L35:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L3d:
                        int r10 = r0.I$0
                        java.lang.Object r2 = r0.L$5
                        j00.c r2 = (j00.c) r2
                        java.lang.Object r2 = r0.L$4
                        kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                        java.lang.Object r4 = r0.L$3
                        kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                        java.lang.Object r5 = r0.L$2
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1$2$1 r6 = (com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        java.lang.Object r7 = r0.L$0
                        kotlin.e.n(r11)
                        r8 = r6
                        r6 = r10
                        r10 = r7
                        r7 = r8
                        goto La0
                    L5b:
                        kotlin.e.n(r11)
                        kotlinx.coroutines.flow.j r2 = r9.f14687a
                        r11 = r10
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC r5 = r9.f14688b
                        q5.d r5 = com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.e(r5)
                        java.lang.Object r6 = l00.k.a(r10)
                        r0.L$0 = r6
                        java.lang.Object r6 = l00.k.a(r0)
                        r0.L$1 = r6
                        java.lang.Object r6 = l00.k.a(r10)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r2)
                        r0.L$3 = r6
                        r0.L$4 = r2
                        java.lang.Object r6 = l00.k.a(r0)
                        r0.L$5 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.Z$0 = r11
                        r0.I$1 = r6
                        r0.label = r4
                        java.lang.Object r11 = r5.c(r0)
                        if (r11 != r1) goto L9d
                        goto Lc7
                    L9d:
                        r5 = r10
                        r7 = r0
                        r4 = r2
                    La0:
                        java.lang.Object r10 = l00.k.a(r10)
                        r0.L$0 = r10
                        java.lang.Object r10 = l00.k.a(r7)
                        r0.L$1 = r10
                        java.lang.Object r10 = l00.k.a(r5)
                        r0.L$2 = r10
                        java.lang.Object r10 = l00.k.a(r4)
                        r0.L$3 = r10
                        r10 = 0
                        r0.L$4 = r10
                        r0.L$5 = r10
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r10 = r2.emit(r11, r0)
                        if (r10 != r1) goto Lc8
                    Lc7:
                        return r1
                    Lc8:
                        yz.g2 r10 = yz.g2.f100423a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
        final kotlinx.coroutines.flow.i<Boolean> a11 = this.f14673h.a();
        return kotlinx.coroutines.flow.k.I(iVar, kotlinx.coroutines.flow.k.i0(new kotlinx.coroutines.flow.i<Integer>() { // from class: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ObserveIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ObserveIpAvatarUC\n*L\n1#1,49:1\n50#2:50\n63#3:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f14691a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ObserveIpAvatarUC f14692b;

                @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2$2", f = "ObserveIpAvatarUC.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ObserveIpAvatarUC$unOwedFlow$2", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    boolean Z$0;
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

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, ObserveIpAvatarUC observeIpAvatarUC) {
                    this.f14691a = jVar;
                    this.f14692b = observeIpAvatarUC;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
                
                    if (r2.emit(r11, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, j00.c r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2$2$1 r0 = (com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2$2$1 r0 = new com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L5b
                        if (r2 == r4) goto L3d
                        if (r2 != r3) goto L35
                        java.lang.Object r10 = r0.L$3
                        kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                        java.lang.Object r10 = r0.L$1
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2$2$1 r10 = (com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2.AnonymousClass2.AnonymousClass1) r10
                        kotlin.e.n(r11)
                        goto Lc8
                    L35:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L3d:
                        int r10 = r0.I$0
                        java.lang.Object r2 = r0.L$5
                        j00.c r2 = (j00.c) r2
                        java.lang.Object r2 = r0.L$4
                        kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                        java.lang.Object r4 = r0.L$3
                        kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                        java.lang.Object r5 = r0.L$2
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2$2$1 r6 = (com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2.AnonymousClass2.AnonymousClass1) r6
                        java.lang.Object r7 = r0.L$0
                        kotlin.e.n(r11)
                        r8 = r6
                        r6 = r10
                        r10 = r7
                        r7 = r8
                        goto La0
                    L5b:
                        kotlin.e.n(r11)
                        kotlinx.coroutines.flow.j r2 = r9.f14691a
                        r11 = r10
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC r5 = r9.f14692b
                        a6.a r5 = com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC.h(r5)
                        java.lang.Object r6 = l00.k.a(r10)
                        r0.L$0 = r6
                        java.lang.Object r6 = l00.k.a(r0)
                        r0.L$1 = r6
                        java.lang.Object r6 = l00.k.a(r10)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r2)
                        r0.L$3 = r6
                        r0.L$4 = r2
                        java.lang.Object r6 = l00.k.a(r0)
                        r0.L$5 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.Z$0 = r11
                        r0.I$1 = r6
                        r0.label = r4
                        java.lang.Object r11 = r5.c(r0)
                        if (r11 != r1) goto L9d
                        goto Lc7
                    L9d:
                        r5 = r10
                        r7 = r0
                        r4 = r2
                    La0:
                        java.lang.Object r10 = l00.k.a(r10)
                        r0.L$0 = r10
                        java.lang.Object r10 = l00.k.a(r7)
                        r0.L$1 = r10
                        java.lang.Object r10 = l00.k.a(r5)
                        r0.L$2 = r10
                        java.lang.Object r10 = l00.k.a(r4)
                        r0.L$3 = r10
                        r10 = 0
                        r0.L$4 = r10
                        r0.L$5 = r10
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r10 = r2.emit(r11, r0)
                        if (r10 != r1) goto Lc8
                    Lc7:
                        return r1
                    Lc8:
                        yz.g2 r10 = yz.g2.f100423a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$unOwedFlow$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Integer> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }), new f(null));
    }
}
