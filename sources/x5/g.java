package x5;

import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import p8.s;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {x5.c.class})
@u0({"SMAP\nSentenceRoadMapRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceRoadMapRepo.kt\ncom/baicizhan/app/biz/game/repo/sentence/SentenceRoadMapRepo\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,91:1\n6#2:92\n64#3,2:93\n66#3:96\n67#3,2:102\n6#4:95\n124#5,4:97\n142#6:101\n116#7,11:104\n*S KotlinDebug\n*F\n+ 1 SentenceRoadMapRepo.kt\ncom/baicizhan/app/biz/game/repo/sentence/SentenceRoadMapRepo\n*L\n34#1:92\n34#1:93,2\n34#1:96\n34#1:102,2\n34#1:95\n34#1:97,4\n34#1:101\n74#1:104,11\n*E\n"})
/* loaded from: classes3.dex */
public final class g implements x5.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f97500a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f97501b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x<Boolean> f97502c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final n40.a f97503d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.sentence.SentenceRoadMapRepo", f = "SentenceRoadMapRepo.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {97, 76, 78, 79}, m = "fetch", n = {"$this$withLock_u24default$iv", "skuId", "$i$f$withLock", "$this$withLock_u24default$iv", "$this$fetch_u24lambda_u240_u240", "skuId", "$i$f$withLock", "$i$a$-withLock$default-SentenceRoadMapRepo$fetch$2", "$i$a$-runCatching-SentenceRoadMapRepo$fetch$2$1", "$this$withLock_u24default$iv", "$this$fetch_u24lambda_u240_u240", "roadMap", "skuId", "$i$f$withLock", "$i$a$-withLock$default-SentenceRoadMapRepo$fetch$2", "$i$a$-runCatching-SentenceRoadMapRepo$fetch$2$1", "$this$withLock_u24default$iv", "$this$fetch_u24lambda_u240_u240", "roadMap", "skuId", "$i$f$withLock", "$i$a$-withLock$default-SentenceRoadMapRepo$fetch$2", "$i$a$-runCatching-SentenceRoadMapRepo$fetch$2$1"}, s = {"L$0", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97504a;

        /* renamed from: b, reason: collision with root package name */
        public int f97505b;

        /* renamed from: c, reason: collision with root package name */
        public int f97506c;

        /* renamed from: d, reason: collision with root package name */
        public int f97507d;

        /* renamed from: e, reason: collision with root package name */
        public Object f97508e;

        /* renamed from: f, reason: collision with root package name */
        public Object f97509f;

        /* renamed from: g, reason: collision with root package name */
        public Object f97510g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f97511h;

        /* renamed from: j, reason: collision with root package name */
        public int f97513j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f97511h = obj;
            this.f97513j |= Integer.MIN_VALUE;
            return g.this.f(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.sentence.SentenceRoadMapRepo", f = "SentenceRoadMapRepo.kt", i = {0}, l = {69}, m = "getLocalVersion", n = {"skuId"}, s = {"I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97514a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f97515b;

        /* renamed from: d, reason: collision with root package name */
        public int f97517d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f97515b = obj;
            this.f97517d |= Integer.MIN_VALUE;
            return g.this.c(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.sentence.SentenceRoadMapRepo", f = "SentenceRoadMapRepo.kt", i = {0}, l = {55}, m = "getSentenceRoadMap", n = {"skuId"}, s = {"I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97518a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f97519b;

        /* renamed from: d, reason: collision with root package name */
        public int f97521d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f97519b = obj;
            this.f97521d |= Integer.MIN_VALUE;
            return g.this.b(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class d implements x00.l<w7.d<s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f97522a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f97523b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f97524c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f97525a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f97526b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f97527c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f97525a = eVar;
                this.f97526b = cVar;
                this.f97527c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f97525a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f97525a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f97526b.b(this.f97527c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public d(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f97522a = dVar;
            this.f97523b = eVar;
            this.f97524c = cVar;
        }

        public final void a(w7.d<s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f97523b, this.f97524c, this.f97522a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f97522a);
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
    @l00.d(c = "com.baicizhan.app.biz.game.repo.sentence.SentenceRoadMapRepo", f = "SentenceRoadMapRepo.kt", i = {0, 0}, l = {60}, m = "updateRemoteVersion", n = {"version", "skuId"}, s = {"L$0", "I$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97528a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97529b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f97530c;

        /* renamed from: e, reason: collision with root package name */
        public int f97532e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f97530c = obj;
            this.f97532e |= Integer.MIN_VALUE;
            return g.this.e(0, null, this);
        }
    }

    public g(@k p thriftService, @k com.baicizhan.app.preferences.a factory) {
        g0.p(thriftService, "thriftService");
        g0.p(factory, "factory");
        this.f97500a = thriftService;
        this.f97501b = factory;
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.FALSE);
        this.f97502c = a11;
        this.f97503d = n40.g.b(false, 1, null);
    }

    @Override // x5.c
    @l
    public Object a(int i11, @k j00.c<? super String> cVar) {
        return h().j("remote_version_" + i11, "default", cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // x5.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r7, @m80.k j00.c<? super p8.s0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof x5.g.c
            if (r0 == 0) goto L13
            r0 = r8
            x5.g$c r0 = (x5.g.c) r0
            int r1 = r0.f97521d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97521d = r1
            goto L18
        L13:
            x5.g$c r0 = new x5.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f97519b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f97521d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r7 = r0.f97518a
            kotlin.e.n(r8)
            goto L57
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.e.n(r8)
            com.baicizhan.app.preferences.g r8 = r6.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "sentence_roadmap_data_"
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.f97518a = r7
            r0.f97521d = r3
            r3 = 0
            java.lang.Object r8 = r8.c(r2, r3, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            byte[] r8 = (byte[]) r8
            if (r8 == 0) goto L66
            ts.a<p8.s0, p8.s0$a> r0 = p8.s0.f80111g
            java.lang.Object r8 = l7.d.c(r8, r0)
            p8.s0 r8 = (p8.s0) r8
            if (r8 == 0) goto L66
            return r8
        L66:
            com.baicizhan.app.biz.base.BizInternalException r0 = new com.baicizhan.app.biz.base.BizInternalException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "SentenceRoadMap empty for skuId="
            r8.append(r1)
            r8.append(r7)
            java.lang.String r1 = r8.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.g.b(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // x5.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r6, @m80.k j00.c<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof x5.g.b
            if (r0 == 0) goto L13
            r0 = r7
            x5.g$b r0 = (x5.g.b) r0
            int r1 = r0.f97517d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97517d = r1
            goto L18
        L13:
            x5.g$b r0 = new x5.g$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f97515b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f97517d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L55
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.e.n(r7)
            com.baicizhan.app.preferences.g r7 = r5.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "sentence_roadmap_data_"
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.f97514a = r6
            r0.f97517d = r3
            r6 = 0
            java.lang.Object r7 = r7.c(r2, r6, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            byte[] r7 = (byte[]) r7
            if (r7 == 0) goto L69
            ts.a<p8.s0, p8.s0$a> r6 = p8.s0.f80111g
            java.lang.Object r6 = l7.d.c(r7, r6)
            p8.s0 r6 = (p8.s0) r6
            if (r6 == 0) goto L69
            java.lang.String r6 = r6.f80115d
            if (r6 != 0) goto L68
            goto L69
        L68:
            return r6
        L69:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.g.c(int, j00.c):java.lang.Object");
    }

    @Override // x5.c
    @l
    public Object d(@k j00.c<? super kotlinx.coroutines.flow.i<Boolean>> cVar) {
        return this.f97502c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // x5.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(int r6, @m80.k java.lang.String r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof x5.g.e
            if (r0 == 0) goto L13
            r0 = r8
            x5.g$e r0 = (x5.g.e) r0
            int r1 = r0.f97532e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97532e = r1
            goto L18
        L13:
            x5.g$e r0 = new x5.g$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f97530c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f97532e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f97529b
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L5e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.e.n(r8)
            com.baicizhan.app.preferences.g r8 = r5.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "remote_version_"
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.Object r4 = l00.k.a(r7)
            r0.f97529b = r4
            r0.f97528a = r6
            r0.f97532e = r3
            java.lang.Object r6 = r8.k(r2, r7, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r6 = r5.f97502c
            java.lang.Boolean r7 = l00.a.a(r3)
            r6.d(r7)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.g.e(int, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:(10:13|14|15|16|17|18|19|(1:21)|27|28)(2:36|37))(6:38|39|40|41|(7:44|17|18|19|(0)|27|28)|43))(7:48|49|50|51|52|53|(2:55|43)(4:56|41|(0)|43)))(1:57))(3:65|(1:67)|43)|58|59|(6:61|50|51|52|53|(0)(0))|43))|70|6|7|(0)(0)|58|59|(0)|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
    
        r16 = false;
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0073, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0074, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015d A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #3 {all -> 0x0167, blocks: (B:19:0x0157, B:21:0x015d, B:32:0x014d), top: B:31:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // x5.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(int r18, @m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.g.f(int, j00.c):java.lang.Object");
    }

    public final s g() {
        return (s) w7.f.b(new d(o0.d(s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public final com.baicizhan.app.preferences.g h() {
        return this.f97501b.a(h.f97533a);
    }
}
