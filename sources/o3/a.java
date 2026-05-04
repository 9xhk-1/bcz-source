package o3;

import com.baicizhan.app.biz.auth.j;
import com.baicizhan.app.biz.auth.n;
import com.baicizhan.app.biz.auth.p;
import com.microsoft.thrifty.service.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import m80.k;
import m80.l;
import oa0.r;
import v8.t;
import v8.v;
import ws.i;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f.class})
@u0({"SMAP\nAccountBindRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBindRepo.kt\ncom/baicizhan/app/biz/account/AccountBindRepo\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n6#2:121\n64#3,2:122\n66#3:125\n67#3,2:131\n6#4:124\n124#5,4:126\n142#6:130\n1563#7:133\n1634#7,3:134\n1563#7:137\n1634#7,3:138\n1#8:141\n*S KotlinDebug\n*F\n+ 1 AccountBindRepo.kt\ncom/baicizhan/app/biz/account/AccountBindRepo\n*L\n37#1:121\n37#1:122,2\n37#1:125\n37#1:131,2\n37#1:124\n37#1:126,4\n37#1:130\n46#1:133\n46#1:134,3\n52#1:137\n52#1:138,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements f, j, p {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l7.p f75592b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c7.e f75593c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.k f75594d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final n f75595e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<v> f75596f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.account.AccountBindRepo", f = "AccountBindRepo.kt", i = {0}, l = {58}, m = "bind", n = {"bindReq"}, s = {"L$0"}, v = 1)
    /* renamed from: o3.a$a, reason: collision with other inner class name */
    public static final class C0921a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f75597a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75598b;

        /* renamed from: d, reason: collision with root package name */
        public int f75600d;

        public C0921a(j00.c<? super C0921a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75598b = obj;
            this.f75600d |= Integer.MIN_VALUE;
            return a.this.j(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.account.AccountBindRepo", f = "AccountBindRepo.kt", i = {0, 0}, l = {90}, m = "bindPhone", n = {"phone", "code"}, s = {"L$0", "L$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f75601a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75602b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f75603c;

        /* renamed from: e, reason: collision with root package name */
        public int f75605e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75603c = obj;
            this.f75605e |= Integer.MIN_VALUE;
            return a.this.k(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.account.AccountBindRepo", f = "AccountBindRepo.kt", i = {}, l = {48}, m = "queryBindInfo", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f75606a;

        /* renamed from: c, reason: collision with root package name */
        public int f75608c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75606a = obj;
            this.f75608c |= Integer.MIN_VALUE;
            return a.this.w(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class d implements x00.l<w7.d<t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f75609a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f75610b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f75611c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: o3.a$d$a, reason: collision with other inner class name */
        public static final class C0922a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f75612a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f75613b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f75614c;

            public C0922a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f75612a = eVar;
                this.f75613b = cVar;
                this.f75614c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f75612a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f75612a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f75613b.b(this.f75614c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public d(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f75609a = dVar;
            this.f75610b = eVar;
            this.f75611c = cVar;
        }

        public final void a(w7.d<t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0922a(this.f75610b, this.f75611c, this.f75609a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f75609a);
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.account.AccountBindRepo", f = "AccountBindRepo.kt", i = {0, 0}, l = {85}, m = "unBind", n = {ma.b.f72911h1, "bind"}, s = {"L$0", "L$1"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f75615a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75616b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f75617c;

        /* renamed from: e, reason: collision with root package name */
        public int f75619e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75617c = obj;
            this.f75619e |= Integer.MIN_VALUE;
            return a.this.s(null, this);
        }
    }

    public a(@k l7.p thrift, @k c7.e device, @k com.baicizhan.app.biz.auth.k devicesChangeHub, @k n logoutHub) {
        g0.p(thrift, "thrift");
        g0.p(device, "device");
        g0.p(devicesChangeHub, "devicesChangeHub");
        g0.p(logoutHub, "logoutHub");
        this.f75592b = thrift;
        this.f75593c = device;
        this.f75594d = devicesChangeHub;
        this.f75595e = logoutHub;
        this.f75596f = new ArrayList();
        devicesChangeHub.a(this);
        logoutHub.b(this);
    }

    @Override // com.baicizhan.app.biz.auth.p
    @l
    public Object A2(@k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, o3.d.f75680a, "onLogout do clean", null, 4, null);
        Object a11 = a(cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    @Override // o3.f
    @l
    public Object a(@k j00.c<? super g2> cVar) {
        this.f75596f.clear();
        return g2.f100423a;
    }

    public final t b() {
        return (t) w7.f.b(new d(o0.d(t.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @Override // com.baicizhan.app.biz.auth.j
    @l
    public Object c(@k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, o3.d.f75680a, "deviceChange do clean", null, 4, null);
        Object a11 = a(cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    @k
    public final n d() {
        return this.f75595e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // o3.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(@m80.k k3.m r19, @m80.k j00.c<? super yz.g2> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof o3.a.C0921a
            if (r2 == 0) goto L17
            r2 = r1
            o3.a$a r2 = (o3.a.C0921a) r2
            int r3 = r2.f75600d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f75600d = r3
            goto L1c
        L17:
            o3.a$a r2 = new o3.a$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f75598b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()
            int r4 = r2.f75600d
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.f75597a
            k3.m r2 = (k3.m) r2
            kotlin.e.n(r1)
            goto L7a
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.e.n(r1)
            v8.t r1 = r0.b()
            java.lang.String r7 = r19.m()
            java.lang.String r9 = r19.k()
            java.lang.String r10 = r19.i()
            java.lang.String r16 = r19.l()
            java.lang.String r15 = r19.n()
            com.baicizhan.app.api.service.Gender r4 = r19.j()
            java.lang.String r11 = o3.e.b(r4)
            c7.e r4 = r0.f75593c
            java.lang.String r14 = r4.e()
            v8.r r6 = new v8.r
            r13 = 0
            r17 = 0
            r8 = 0
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4 = r19
            r2.f75597a = r4
            r2.f75600d = r5
            java.lang.Object r1 = r1.c6(r6, r2)
            if (r1 != r3) goto L79
            return r3
        L79:
            r2 = r4
        L7a:
            java.util.List<v8.v> r1 = r0.f75596f
            v8.v r3 = new v8.v
            java.lang.String r4 = r2.m()
            java.lang.String r5 = r2.l()
            java.lang.String r6 = r2.n()
            java.lang.String r2 = r2.k()
            r3.<init>(r4, r5, r6, r2)
            r1.add(r3)
            yz.g2 r1 = yz.g2.f100423a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.a.j(k3.m, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // o3.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(@m80.k java.lang.String r8, @m80.k java.lang.String r9, @m80.k j00.c<? super yz.g2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof o3.a.b
            if (r0 == 0) goto L13
            r0 = r10
            o3.a$b r0 = (o3.a.b) r0
            int r1 = r0.f75605e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75605e = r1
            goto L18
        L13:
            o3.a$b r0 = new o3.a$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f75603c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f75605e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f75602b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f75601a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.e.n(r10)
            goto L62
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r10)
            v8.t r10 = r7.b()
            v8.g r2 = new v8.g
            v8.h r4 = new v8.h
            r4.<init>(r8, r9)
            c7.e r5 = r7.f75593c
            java.lang.String r5 = r5.e()
            r6 = 0
            r2.<init>(r4, r6, r5)
            r0.f75601a = r8
            java.lang.Object r9 = l00.k.a(r9)
            r0.f75602b = r9
            r0.f75605e = r3
            java.lang.Object r9 = r10.O6(r2, r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            java.util.List<v8.v> r9 = r7.f75596f
            v8.v r10 = new v8.v
            com.baicizhan.app.biz.auth.q$b r0 = com.baicizhan.app.biz.auth.q.b.f13745a
            java.lang.String r0 = r0.a()
            r10.<init>(r0, r8, r8, r8)
            r9.add(r10)
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.a.k(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // o3.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(@m80.k java.lang.String r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o3.a.e
            if (r0 == 0) goto L13
            r0 = r9
            o3.a$e r0 = (o3.a.e) r0
            int r1 = r0.f75619e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75619e = r1
            goto L18
        L13:
            o3.a$e r0 = new o3.a$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f75617c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f75619e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f75616b
            v8.v r8 = (v8.v) r8
            java.lang.Object r0 = r0.f75615a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.e.n(r9)
            goto L7c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r9)
            java.util.List<v8.v> r9 = r7.f75596f
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L44:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r9.next()
            r4 = r2
            v8.v r4 = (v8.v) r4
            java.lang.String r4 = r4.f93549a
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r8)
            if (r4 == 0) goto L44
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r9 = r2
            v8.v r9 = (v8.v) r9
            if (r9 == 0) goto L84
            v8.t r2 = r7.b()
            java.lang.String r4 = r9.f93549a
            java.lang.String r5 = r9.f93550b
            java.lang.String r6 = r9.f93551c
            java.lang.Object r8 = l00.k.a(r8)
            r0.f75615a = r8
            r0.f75616b = r9
            r0.f75619e = r3
            java.lang.Object r8 = r2.m2(r4, r5, r6, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            r8 = r9
        L7c:
            java.util.List<v8.v> r9 = r7.f75596f
            r9.remove(r8)
            yz.g2 r8 = yz.g2.f100423a
            return r8
        L84:
            com.baicizhan.app.api.service.BizException r0 = new com.baicizhan.app.api.service.BizException
            r4 = 6
            r5 = 0
            java.lang.String r1 = "未绑定"
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.a.s(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098 A[LOOP:0: B:11:0x0092->B:13:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // o3.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(@m80.k j00.c<? super java.util.List<k3.l>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o3.a.c
            if (r0 == 0) goto L13
            r0 = r6
            o3.a$c r0 = (o3.a.c) r0
            int r1 = r0.f75608c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75608c = r1
            goto L18
        L13:
            o3.a$c r0 = new o3.a$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f75606a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f75608c
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.e.n(r6)
            goto L73
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.e.n(r6)
            java.util.List<v8.v> r6 = r5.f75596f
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L66
            java.util.List<v8.v> r6 = r5.f75596f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = a00.i0.d0(r6, r3)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()
            v8.v r1 = (v8.v) r1
            k3.l r1 = o3.e.a(r1)
            r0.add(r1)
            goto L51
        L65:
            return r0
        L66:
            v8.t r6 = r5.b()
            r0.f75608c = r4
            java.lang.Object r6 = r6.P6(r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            java.util.List r6 = (java.util.List) r6
            java.util.List<v8.v> r0 = r5.f75596f
            r0.clear()
            java.util.List<v8.v> r0 = r5.f75596f
            java.util.Collection r6 = (java.util.Collection) r6
            r0.addAll(r6)
            java.util.List<v8.v> r6 = r5.f75596f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = a00.i0.d0(r6, r3)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L92:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r6.next()
            v8.v r1 = (v8.v) r1
            k3.l r1 = o3.e.a(r1)
            r0.add(r1)
            goto L92
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.a.w(j00.c):java.lang.Object");
    }
}
