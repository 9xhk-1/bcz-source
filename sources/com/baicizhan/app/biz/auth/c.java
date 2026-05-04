package com.baicizhan.app.biz.auth;

import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import v8.t;
import y7.d;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {IAuthRepo.class})
@u0({"SMAP\nAuthCheckRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthCheckRepo.kt\ncom/baicizhan/app/biz/auth/AuthCheckImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,66:1\n6#2:67\n64#3,2:68\n66#3:71\n67#3,2:77\n6#4:70\n124#5,4:72\n127#5:87\n142#6:76\n142#6:85\n41#7,6:79\n48#7:86\n*S KotlinDebug\n*F\n+ 1 AuthCheckRepo.kt\ncom/baicizhan/app/biz/auth/AuthCheckImpl\n*L\n33#1:67\n33#1:68,2\n33#1:71\n33#1:77,2\n33#1:70\n33#1:72,4\n31#1:87\n33#1:76\n31#1:85\n31#1:79,6\n31#1:86\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements IAuthRepo, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l7.p f13678b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c7.e f13679c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final r3.d f13680d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final k f13681e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final c0 f13682f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthCheckImpl", f = "AuthCheckRepo.kt", i = {1, 2, 2, 2, 3, 3}, l = {37, 45, 49, 58}, m = "checkAuth", n = {"tokenRsp", "tokenRsp", "it", "$i$a$-also-AuthCheckImpl$checkAuth$3", "tokenRsp", "notChange"}, s = {"L$0", "L$0", "L$2", "I$0", "L$0", "Z$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13683a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13684b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13685c;

        /* renamed from: d, reason: collision with root package name */
        public int f13686d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13687e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f13688f;

        /* renamed from: h, reason: collision with root package name */
        public int f13690h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13688f = obj;
            this.f13690h |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f13691a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f13692b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f13693c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f13694a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f13695b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f13696c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f13694a = eVar;
                this.f13695b = cVar;
                this.f13696c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f13694a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f13694a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f13695b.b(this.f13696c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f13691a = dVar;
            this.f13692b = eVar;
            this.f13693c = cVar;
        }

        public final void a(w7.d<t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f13692b, this.f13693c, this.f13691a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f13691a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public c(@m80.k l7.p thrift, @m80.k c7.e device, @m80.k r3.d userStorage, @m80.k k devicesChangeHub) {
        g0.p(thrift, "thrift");
        g0.p(device, "device");
        g0.p(userStorage, "userStorage");
        g0.p(devicesChangeHub, "devicesChangeHub");
        this.f13678b = thrift;
        this.f13679c = device;
        this.f13680d = userStorage;
        this.f13681e = devicesChangeHub;
        this.f13682f = e0.c(new x00.a() { // from class: com.baicizhan.app.biz.auth.a
            @Override // x00.a
            public final Object invoke() {
                com.baicizhan.app.preferences.g f11;
                f11 = c.f(c.this);
                return f11;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.baicizhan.app.preferences.g f(c cVar) {
        return (com.baicizhan.app.preferences.g) (cVar instanceof pa0.c ? ((pa0.c) cVar).getScope() : cVar.r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), null, new x00.a() { // from class: com.baicizhan.app.biz.auth.b
            @Override // x00.a
            public final Object invoke() {
                ya0.a g11;
                g11 = c.g();
                return g11;
            }
        });
    }

    public static final ya0.a g() {
        return ya0.b.d(d.f13697a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
    
        if (r0.g(r7, r2) == r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // com.baicizhan.app.biz.auth.IAuthRepo
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super java.lang.Boolean> r29) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.c.a(j00.c):java.lang.Object");
    }

    public final com.baicizhan.app.preferences.g d() {
        return (com.baicizhan.app.preferences.g) this.f13682f.getValue();
    }

    public final t e() {
        return (t) w7.f.b(new b(o0.d(t.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
