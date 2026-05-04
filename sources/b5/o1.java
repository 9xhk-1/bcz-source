package b5;

import com.baicizhan.online.playground_api.PlaygroundApiService;
import com.igexin.assist.sdk.AssistPushConsts;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l7.i0;
import y7.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
@kotlin.jvm.internal.u0({"SMAP\nReviveLavaQuestCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviveLavaQuestCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/ReviveLavaQuestCommand\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,22:1\n6#2:23\n64#3,2:24\n66#3:27\n67#3,2:33\n6#4:26\n124#5,4:28\n142#6:32\n*S KotlinDebug\n*F\n+ 1 ReviveLavaQuestCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/ReviveLavaQuestCommand\n*L\n16#1:23\n16#1:24,2\n16#1:27\n16#1:33,2\n16#1:26\n16#1:28,4\n16#1:32\n*E\n"})
/* loaded from: classes3.dex */
public final class o1 implements d5.f<x0, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f5977a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5978b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<x0> f5979c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.ReviveLavaQuestCommand", f = "ReviveLavaQuestCommand.kt", i = {0}, l = {19}, m = "execute", n = {AssistPushConsts.MSG_TYPE_PAYLOAD}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5980a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5981b;

        /* renamed from: d, reason: collision with root package name */
        public int f5983d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5981b = obj;
            this.f5983d |= Integer.MIN_VALUE;
            return o1.this.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<PlaygroundApiService>, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f5984a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f5985b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f5986c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @kotlin.jvm.internal.u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f5987a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f5988b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f5989c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f5987a = eVar;
                this.f5988b = cVar;
                this.f5989c = dVar;
            }

            public final void a(d.a randomRetry) {
                kotlin.jvm.internal.g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f5987a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f5987a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f5988b.b(this.f5989c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(d.a aVar) {
                a(aVar);
                return yz.g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f5984a = dVar;
            this.f5985b = eVar;
            this.f5986c = cVar;
        }

        public final void a(w7.d<PlaygroundApiService> thriftBuilder) {
            kotlin.jvm.internal.g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f5985b, this.f5986c, this.f5984a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = l7.i0.o().get(this.f5984a);
            kotlin.jvm.internal.g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) kotlin.jvm.internal.x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(w7.d<PlaygroundApiService> dVar) {
            a(dVar);
            return yz.g2.f100423a;
        }
    }

    public o1(@m80.k l7.p thriftService) {
        kotlin.jvm.internal.g0.p(thriftService, "thriftService");
        this.f5977a = thriftService;
        this.f5978b = "biz.wordsgame.revivelavaquest";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // d5.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k b5.x0 r5, @m80.k j00.c<? super b5.c1> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.o1.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.o1$a r0 = (b5.o1.a) r0
            int r1 = r0.f5983d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5983d = r1
            goto L18
        L13:
            b5.o1$a r0 = new b5.o1$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5981b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5983d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5980a
            b5.x0 r5 = (b5.x0) r5
            kotlin.e.n(r6)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            com.baicizhan.online.playground_api.PlaygroundApiService r6 = r4.d()
            java.lang.Object r5 = l00.k.a(r5)
            r0.f5980a = r5
            r0.f5983d = r3
            java.lang.Object r5 = r6.resurrect(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            b5.e1 r5 = b5.e1.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.o1.a(b5.x0, j00.c):java.lang.Object");
    }

    @Override // d5.f
    @m80.l
    public f50.e<x0> b() {
        return this.f5979c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5978b;
    }

    public final PlaygroundApiService d() {
        return (PlaygroundApiService) w7.f.b(new b(kotlin.jvm.internal.o0.d(PlaygroundApiService.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(l7.c.class), null, null)));
    }
}
