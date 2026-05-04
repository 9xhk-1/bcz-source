package g6;

import c4.o;
import c40.l3;
import c40.n0;
import c40.r0;
import c40.s0;
import c40.x2;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import p8.s;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nSyncComboUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncComboUC.kt\ncom/baicizhan/app/biz/game/uc/combo/SyncComboUC\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 4 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 5 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 6 Koin.kt\norg/koin/core/Koin\n+ 7 Scope.kt\norg/koin/core/scope/Scope\n+ 8 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n47#2,4:127\n6#3:131\n64#4,2:132\n66#4:135\n67#4,2:141\n6#5:134\n124#6,4:136\n142#7:140\n116#8,11:143\n1617#9,9:154\n1869#9:163\n1870#9:166\n1626#9:167\n1869#9,2:168\n1#10:164\n1#10:165\n*S KotlinDebug\n*F\n+ 1 SyncComboUC.kt\ncom/baicizhan/app/biz/game/uc/combo/SyncComboUC\n*L\n30#1:127,4\n28#1:131\n28#1:132,2\n28#1:135\n28#1:141,2\n28#1:134\n28#1:136,4\n28#1:140\n37#1:143,11\n88#1:154,9\n88#1:163\n88#1:166\n88#1:167\n109#1:168,2\n88#1:165\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f53035a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m5.c f53036b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r0 f53037c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final n40.a f53038d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.combo.SyncComboUC", f = "SyncComboUC.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4}, l = {44, 46, 47, 48, 50}, m = "checkSpanDay", n = {"today", "today", "day", "comboInfo", "today", "day", "comboInfo", "today", "day", "comboInfo", "it", "today", "day", "$i$a$-also-SyncComboUC$checkSpanDay$2"}, s = {"J$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "L$2", "J$0", "J$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f53039a;

        /* renamed from: b, reason: collision with root package name */
        public long f53040b;

        /* renamed from: c, reason: collision with root package name */
        public Object f53041c;

        /* renamed from: d, reason: collision with root package name */
        public Object f53042d;

        /* renamed from: e, reason: collision with root package name */
        public Object f53043e;

        /* renamed from: f, reason: collision with root package name */
        public int f53044f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f53045g;

        /* renamed from: i, reason: collision with root package name */
        public int f53047i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f53045g = obj;
            this.f53047i |= Integer.MIN_VALUE;
            return i.this.e(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.combo.SyncComboUC$checkUpdate$2", f = "SyncComboUC.kt", i = {}, l = {66, 67, 68}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f53048a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r6.k(r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r6.j(r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        
            if (r6.e(r5) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f53048a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.e.n(r6)
                goto L49
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.e.n(r6)
                goto L3e
            L21:
                kotlin.e.n(r6)
                goto L33
            L25:
                kotlin.e.n(r6)
                g6.i r6 = g6.i.this
                r5.f53048a = r4
                java.lang.Object r6 = r6.e(r5)
                if (r6 != r0) goto L33
                goto L48
            L33:
                g6.i r6 = g6.i.this
                r5.f53048a = r3
                java.lang.Object r6 = g6.i.c(r6, r5)
                if (r6 != r0) goto L3e
                goto L48
            L3e:
                g6.i r6 = g6.i.this
                r5.f53048a = r2
                java.lang.Object r6 = g6.i.d(r6, r5)
                if (r6 != r0) goto L49
            L48:
                return r0
            L49:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: g6.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.combo.SyncComboUC", f = "SyncComboUC.kt", i = {0, 0, 1, 1, 1}, l = {132, 38}, m = "invoke", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-SyncComboUC$invoke$2"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f53050a;

        /* renamed from: b, reason: collision with root package name */
        public int f53051b;

        /* renamed from: c, reason: collision with root package name */
        public int f53052c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f53053d;

        /* renamed from: f, reason: collision with root package name */
        public int f53055f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f53053d = obj;
            this.f53055f |= Integer.MIN_VALUE;
            return i.this.h(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.combo.SyncComboUC$invokeAsync$1", f = "SyncComboUC.kt", i = {0, 0, 1, 1, 1}, l = {132, 59}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-SyncComboUC$invokeAsync$1$1"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nSyncComboUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncComboUC.kt\ncom/baicizhan/app/biz/game/uc/combo/SyncComboUC$invokeAsync$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,126:1\n116#2,11:127\n*S KotlinDebug\n*F\n+ 1 SyncComboUC.kt\ncom/baicizhan/app/biz/game/uc/combo/SyncComboUC$invokeAsync$1\n*L\n58#1:127,11\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f53056a;

        /* renamed from: b, reason: collision with root package name */
        public Object f53057b;

        /* renamed from: c, reason: collision with root package name */
        public int f53058c;

        /* renamed from: d, reason: collision with root package name */
        public int f53059d;

        /* renamed from: e, reason: collision with root package name */
        public int f53060e;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i.this.new d(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n40.a aVar;
            i iVar;
            int i11;
            n40.a aVar2;
            Throwable th2;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f53060e;
            try {
                if (i12 == 0) {
                    kotlin.e.n(obj);
                    aVar = i.this.f53038d;
                    i iVar2 = i.this;
                    this.f53056a = aVar;
                    this.f53057b = iVar2;
                    this.f53058c = 0;
                    this.f53060e = 1;
                    if (aVar.lock(null, this) != l11) {
                        iVar = iVar2;
                        i11 = 0;
                    }
                    return l11;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (n40.a) this.f53056a;
                    try {
                        kotlin.e.n(obj);
                        g2 g2Var = g2.f100423a;
                        aVar2.unlock(null);
                        return g2Var;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.unlock(null);
                        throw th2;
                    }
                }
                i11 = this.f53058c;
                iVar = (i) this.f53057b;
                n40.a aVar3 = (n40.a) this.f53056a;
                kotlin.e.n(obj);
                aVar = aVar3;
                this.f53056a = aVar;
                this.f53057b = null;
                this.f53058c = i11;
                this.f53059d = 0;
                this.f53060e = 2;
                if (iVar.f(this) != l11) {
                    aVar2 = aVar;
                    g2 g2Var2 = g2.f100423a;
                    aVar2.unlock(null);
                    return g2Var2;
                }
                return l11;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.unlock(null);
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SyncComboUC.kt\ncom/baicizhan/app/biz/game/uc/combo/SyncComboUC\n*L\n1#1,49:1\n31#2,2:50\n*E\n"})
    public static final class e extends kotlin.coroutines.a implements n0 {
        public e(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            z6.b.f101032b.e(j.f53091a, "Uncaught exception ", th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class f implements x00.l<w7.d<s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f53062a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f53063b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f53064c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f53065a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f53066b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f53067c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f53065a = eVar;
                this.f53066b = cVar;
                this.f53067c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f53065a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f53065a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f53066b.b(this.f53067c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public f(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f53062a = dVar;
            this.f53063b = eVar;
            this.f53064c = cVar;
        }

        public final void a(w7.d<s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f53063b, this.f53064c, this.f53062a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f53062a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.combo.SyncComboUC", f = "SyncComboUC.kt", i = {1, 2, 2}, l = {73, 76, 82}, m = "syncHistoryCombo", n = {"historyCombo", "response", "historyCombo"}, s = {"I$0", "L$0", "I$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f53068a;

        /* renamed from: b, reason: collision with root package name */
        public Object f53069b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f53070c;

        /* renamed from: e, reason: collision with root package name */
        public int f53072e;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f53070c = obj;
            this.f53072e |= Integer.MIN_VALUE;
            return i.this.j(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.combo.SyncComboUC", f = "SyncComboUC.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8}, l = {87, 89, 93, 94, 97, 106, 107, 108, 110}, m = "syncLocalCombo", n = {"$this$mapNotNull$iv", "$this$mapNotNullTo$iv$iv", "destination$iv$iv", "$this$forEach$iv$iv$iv", "element$iv$iv$iv", "element$iv$iv", "localCombo", "$i$f$mapNotNull", "$i$f$mapNotNullTo", "$i$f$forEach", "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv", "propsType", "$i$a$-mapNotNull-SyncComboUC$syncLocalCombo$consumedProps$1", "consumedProps", "localCombo", "consumedProps", "localCombo", "resetTime", "consumedProps", "comboInfo", "localCombo", "resetTime", "consumedProps", "comboInfo", "response", "localCombo", "resetTime", "consumedProps", "comboInfo", "response", "localCombo", "resetTime", "consumedProps", "comboInfo", "response", "localCombo", "resetTime", "consumedProps", "comboInfo", "response", "$this$forEach$iv", "element$iv", "it", "localCombo", "resetTime", "$i$f$forEach", "$i$a$-forEach-SyncComboUC$syncLocalCombo$2"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$0", "I$0", "L$0", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "L$2", "I$0", "J$0", "L$0", "L$1", "L$2", "I$0", "J$0", "L$0", "L$1", "L$2", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "J$0", "I$1", "I$2"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f53073a;

        /* renamed from: b, reason: collision with root package name */
        public int f53074b;

        /* renamed from: c, reason: collision with root package name */
        public int f53075c;

        /* renamed from: d, reason: collision with root package name */
        public int f53076d;

        /* renamed from: e, reason: collision with root package name */
        public int f53077e;

        /* renamed from: f, reason: collision with root package name */
        public int f53078f;

        /* renamed from: g, reason: collision with root package name */
        public int f53079g;

        /* renamed from: h, reason: collision with root package name */
        public Object f53080h;

        /* renamed from: i, reason: collision with root package name */
        public Object f53081i;

        /* renamed from: j, reason: collision with root package name */
        public Object f53082j;

        /* renamed from: k, reason: collision with root package name */
        public Object f53083k;

        /* renamed from: l, reason: collision with root package name */
        public Object f53084l;

        /* renamed from: m, reason: collision with root package name */
        public Object f53085m;

        /* renamed from: n, reason: collision with root package name */
        public Object f53086n;

        /* renamed from: o, reason: collision with root package name */
        public long f53087o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f53088p;

        /* renamed from: r, reason: collision with root package name */
        public int f53090r;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f53088p = obj;
            this.f53090r |= Integer.MIN_VALUE;
            return i.this.k(this);
        }
    }

    public i(@k p thriftService, @k m5.c comboRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(comboRepo, "comboRepo");
        this.f53035a = thriftService;
        this.f53036b = comboRepo;
        this.f53037c = s0.a(o.b().plus(l3.c(null, 1, null)).plus(new e(n0.f7891d0)));
        this.f53038d = n40.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k j00.c<? super yz.g2> r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.i.e(j00.c):java.lang.Object");
    }

    public final Object f(j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(x2.f8011a, new b(null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    public final s g() {
        return (s) w7.f.b(new f(o0.d(s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@m80.k j00.c<? super yz.g2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof g6.i.c
            if (r0 == 0) goto L13
            r0 = r9
            g6.i$c r0 = (g6.i.c) r0
            int r1 = r0.f53055f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53055f = r1
            goto L18
        L13:
            g6.i$c r0 = new g6.i$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53053d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f53055f
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r0 = r0.f53050a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L32
            goto L6a
        L32:
            r9 = move-exception
            goto L74
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            int r2 = r0.f53051b
            java.lang.Object r5 = r0.f53050a
            n40.a r5 = (n40.a) r5
            kotlin.e.n(r9)
            r9 = r5
            goto L5a
        L47:
            kotlin.e.n(r9)
            n40.a r9 = r8.f53038d
            r0.f53050a = r9
            r0.f53051b = r3
            r0.f53055f = r5
            java.lang.Object r2 = r9.lock(r6, r0)
            if (r2 != r1) goto L59
            goto L68
        L59:
            r2 = r3
        L5a:
            r0.f53050a = r9     // Catch: java.lang.Throwable -> L70
            r0.f53051b = r2     // Catch: java.lang.Throwable -> L70
            r0.f53052c = r3     // Catch: java.lang.Throwable -> L70
            r0.f53055f = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r8.f(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 != r1) goto L69
        L68:
            return r1
        L69:
            r0 = r9
        L6a:
            yz.g2 r9 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L32
            r0.unlock(r6)
            return r9
        L70:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L74:
            r0.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.i.h(j00.c):java.lang.Object");
    }

    public final void i() {
        c40.k.f(this.f53037c, null, null, new d(null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(j00.c<? super yz.g2> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof g6.i.g
            if (r0 == 0) goto L13
            r0 = r10
            g6.i$g r0 = (g6.i.g) r0
            int r1 = r0.f53072e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53072e = r1
            goto L18
        L13:
            g6.i$g r0 = new g6.i$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f53070c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f53072e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            int r1 = r0.f53068a
            java.lang.Object r0 = r0.f53069b
            p8.j r0 = (p8.j) r0
            kotlin.e.n(r10)
            goto L99
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            int r2 = r0.f53068a
            kotlin.e.n(r10)
            goto L85
        L43:
            kotlin.e.n(r10)
            goto L55
        L47:
            kotlin.e.n(r10)
            m5.c r10 = r9.f53036b
            r0.f53072e = r5
            java.lang.Object r10 = r10.f(r0)
            if (r10 != r1) goto L55
            goto L96
        L55:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != 0) goto L60
            yz.g2 r10 = yz.g2.f100423a
            return r10
        L60:
            p8.s r2 = r9.g()
            p8.k$a r5 = new p8.k$a
            r5.<init>()
            p8.k$a r5 = r5.b(r10)
            r6 = 0
            p8.k$a r5 = r5.d(r6)
            p8.k r5 = r5.build()
            r0.f53068a = r10
            r0.f53072e = r4
            java.lang.Object r2 = r2.w5(r5, r0)
            if (r2 != r1) goto L82
            goto L96
        L82:
            r8 = r2
            r2 = r10
            r10 = r8
        L85:
            p8.j r10 = (p8.j) r10
            m5.c r4 = r9.f53036b
            r0.f53069b = r10
            r0.f53068a = r2
            r0.f53072e = r3
            r3 = 0
            java.lang.Object r0 = r4.m(r3, r0)
            if (r0 != r1) goto L97
        L96:
            return r1
        L97:
            r0 = r10
            r1 = r2
        L99:
            z6.b r2 = z6.b.f101032b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "History combo synced: combo="
            r10.append(r3)
            r10.append(r1)
            java.lang.String r1 = ", response="
            r10.append(r1)
            r10.append(r0)
            java.lang.String r4 = r10.toString()
            r6 = 4
            r7 = 0
            java.lang.String r3 = "SyncComboUC"
            r5 = 0
            z6.b.j(r2, r3, r4, r5, r6, r7)
            yz.g2 r10 = yz.g2.f100423a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.i.j(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x02b3, code lost:
    
        if (r1.h(r10, r2) != r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x027e, code lost:
    
        if (r0.f53036b.i(-r4, r2) != r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ee, code lost:
    
        if (r1 != r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
    
        if (r1 == r3) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x030f -> B:12:0x0311). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0188 -> B:50:0x018d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(j00.c<? super yz.g2> r26) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.i.k(j00.c):java.lang.Object");
    }
}
