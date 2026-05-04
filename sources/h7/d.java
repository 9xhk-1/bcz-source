package h7;

import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import l7.i0;
import l7.p;
import oa0.r;
import y7.d;
import yz.g2;
import z8.b2;
import z8.s0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {g.class})
@u0({"SMAP\nIHomeStateRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IHomeStateRepo.kt\ncom/baicizhan/app/biz/study4ini/HomeStateRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,35:1\n6#2:36\n64#3,2:37\n66#3:40\n67#3,2:46\n6#4:39\n124#5,4:41\n142#6:45\n116#7,10:48\n*S KotlinDebug\n*F\n+ 1 IHomeStateRepo.kt\ncom/baicizhan/app/biz/study4ini/HomeStateRepoImpl\n*L\n23#1:36\n23#1:37,2\n23#1:40\n23#1:46,2\n23#1:39\n23#1:41,4\n23#1:45\n27#1:48,10\n*E\n"})
/* loaded from: classes3.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f58589a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y<s0> f58590b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final m0<s0> f58591c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f58592d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.study4ini.HomeStateRepoImpl", f = "IHomeStateRepo.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2}, l = {41, 28, 29}, m = com.alipay.sdk.m.x.d.f11177w, n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-HomeStateRepoImpl$refresh$2", "$this$withLock_u24default$iv", "new", "$i$f$withLock", "$i$a$-withLock$default-HomeStateRepoImpl$refresh$2"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f58593a;

        /* renamed from: b, reason: collision with root package name */
        public Object f58594b;

        /* renamed from: c, reason: collision with root package name */
        public int f58595c;

        /* renamed from: d, reason: collision with root package name */
        public int f58596d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f58597e;

        /* renamed from: g, reason: collision with root package name */
        public int f58599g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f58597e = obj;
            this.f58599g |= Integer.MIN_VALUE;
            return d.this.g(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f58600a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f58601b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f58602c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f58603a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f58604b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f58605c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f58603a = eVar;
                this.f58604b = cVar;
                this.f58605c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f58603a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f58603a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f58604b.b(this.f58605c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f58600a = dVar;
            this.f58601b = eVar;
            this.f58602c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f58601b, this.f58602c, this.f58600a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f58600a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public d(@m80.k p thrift) {
        g0.p(thrift, "thrift");
        this.f58589a = thrift;
        y<s0> a11 = o0.a(null);
        this.f58590b = a11;
        this.f58591c = a11;
        this.f58592d = n40.g.b(false, 1, null);
    }

    public final b2 a() {
        return (b2) w7.f.b(new b(kotlin.jvm.internal.o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // h7.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@m80.k j00.c<? super z8.s0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof h7.d.a
            if (r0 == 0) goto L13
            r0 = r10
            h7.d$a r0 = (h7.d.a) r0
            int r1 = r0.f58599g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58599g = r1
            goto L18
        L13:
            h7.d$a r0 = new h7.d$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f58597e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f58599g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L54
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r1 = r0.f58594b
            z8.s0 r1 = (z8.s0) r1
            java.lang.Object r0 = r0.f58593a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L3a
            goto L9f
        L3a:
            r10 = move-exception
            goto La7
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L45:
            int r6 = r0.f58596d
            int r2 = r0.f58595c
            java.lang.Object r4 = r0.f58593a
            n40.a r4 = (n40.a) r4
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L51
            goto L88
        L51:
            r10 = move-exception
            r0 = r4
            goto La7
        L54:
            int r2 = r0.f58595c
            java.lang.Object r5 = r0.f58593a
            n40.a r5 = (n40.a) r5
            kotlin.e.n(r10)
            r10 = r5
            goto L72
        L5f:
            kotlin.e.n(r10)
            n40.a r10 = r9.f58592d
            r0.f58593a = r10
            r0.f58595c = r6
            r0.f58599g = r5
            java.lang.Object r2 = r10.lock(r7, r0)
            if (r2 != r1) goto L71
            goto L9c
        L71:
            r2 = r6
        L72:
            z8.b2 r5 = r9.a()     // Catch: java.lang.Throwable -> La3
            r0.f58593a = r10     // Catch: java.lang.Throwable -> La3
            r0.f58595c = r2     // Catch: java.lang.Throwable -> La3
            r0.f58596d = r6     // Catch: java.lang.Throwable -> La3
            r0.f58599g = r4     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = r5.j3(r6, r0)     // Catch: java.lang.Throwable -> La3
            if (r4 != r1) goto L85
            goto L9c
        L85:
            r8 = r4
            r4 = r10
            r10 = r8
        L88:
            z8.s0 r10 = (z8.s0) r10     // Catch: java.lang.Throwable -> L51
            kotlinx.coroutines.flow.y<z8.s0> r5 = r9.f58590b     // Catch: java.lang.Throwable -> L51
            r0.f58593a = r4     // Catch: java.lang.Throwable -> L51
            r0.f58594b = r10     // Catch: java.lang.Throwable -> L51
            r0.f58595c = r2     // Catch: java.lang.Throwable -> L51
            r0.f58596d = r6     // Catch: java.lang.Throwable -> L51
            r0.f58599g = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r5.emit(r10, r0)     // Catch: java.lang.Throwable -> L51
            if (r0 != r1) goto L9d
        L9c:
            return r1
        L9d:
            r1 = r10
            r0 = r4
        L9f:
            r0.unlock(r7)
            return r1
        La3:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        La7:
            r0.unlock(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.d.g(j00.c):java.lang.Object");
    }

    @Override // h7.g
    @m80.k
    public m0<s0> getState() {
        return this.f58591c;
    }
}
