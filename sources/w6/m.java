package w6;

import com.baicizhan.app.biz.base.cache.CacheStrategy;
import com.microsoft.thrifty.service.a;
import java.util.Map;
import k3.i1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import oa0.r;
import t3.a0;
import t3.e;
import t3.n;
import y7.d;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f.class})
@u0({"SMAP\nUrlRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlRepo.kt\ncom/baicizhan/app/biz/h5/UrlRepo\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,82:1\n6#2:83\n64#3,2:84\n66#3:87\n67#3,2:93\n6#4:86\n124#5,4:88\n142#6:92\n*S KotlinDebug\n*F\n+ 1 UrlRepo.kt\ncom/baicizhan/app/biz/h5/UrlRepo\n*L\n25#1:83\n25#1:84,2\n25#1:87\n25#1:93,2\n25#1:86\n25#1:88,4\n25#1:92\n*E\n"})
/* loaded from: classes3.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f95421a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f95422b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.h5.UrlRepo$cache$2$1$1", f = "UrlRepo.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.l<j00.c<? super r8.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f95423a;

        public a(j00.c<? super a> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return m.this.new a(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super r8.c> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f95423a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            r8.d i12 = m.this.i();
            this.f95423a = 1;
            Object e12 = i12.e1(this);
            return e12 == l11 ? l11 : e12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.h5.UrlRepo", f = "UrlRepo.kt", i = {}, l = {47}, m = "getNotifyUrl", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f95425a;

        /* renamed from: c, reason: collision with root package name */
        public int f95427c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95425a = obj;
            this.f95427c |= Integer.MIN_VALUE;
            return m.this.j(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<r8.d>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f95428a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f95429b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f95430c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f95431a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f95432b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f95433c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f95431a = eVar;
                this.f95432b = cVar;
                this.f95433c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f95431a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f95431a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f95432b.b(this.f95433c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f95428a = dVar;
            this.f95429b = eVar;
            this.f95430c = cVar;
        }

        public final void a(w7.d<r8.d> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f95429b, this.f95430c, this.f95428a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f95428a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<r8.d> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public m(@m80.k l7.p thrift) {
        g0.p(thrift, "thrift");
        this.f95421a = thrift;
        this.f95422b = e0.c(new x00.a() { // from class: w6.k
            @Override // x00.a
            public final Object invoke() {
                t3.g f11;
                f11 = m.f(m.this);
                return f11;
            }
        });
    }

    public static final t3.g f(final m mVar) {
        return a0.a(new x00.l() { // from class: w6.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = m.g(m.this, (t3.b) obj);
                return g11;
            }
        });
    }

    public static final g2 g(m mVar, t3.b cache) {
        g0.p(cache, "$this$cache");
        cache.f("Notify_Url");
        cache.g(CacheStrategy.CACHE_FIRST);
        cache.i(n.a.f89274a);
        cache.h(e.b.f89242a);
        cache.j(mVar.new a(null));
        return g2.f100423a;
    }

    @Override // w6.f
    @m80.l
    public Object a(@m80.k String str, @m80.k j00.c<? super String> cVar) {
        Map map;
        z6.b.j(z6.b.f101032b, "UrlRepo", "getUrl key=" + str, null, 4, null);
        map = n.f95434a;
        String str2 = (String) map.get(str);
        return str2 == null ? g0.g(str, i1.f65366a.a()) ? j(cVar) : "" : str2;
    }

    public final t3.g<r8.c> h() {
        return (t3.g) this.f95422b.getValue();
    }

    public final r8.d i() {
        return (r8.d) w7.f.b(new c(o0.d(r8.d.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(j00.c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w6.m.b
            if (r0 == 0) goto L13
            r0 = r5
            w6.m$b r0 = (w6.m.b) r0
            int r1 = r0.f95427c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95427c = r1
            goto L18
        L13:
            w6.m$b r0 = new w6.m$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f95425a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f95427c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.e.n(r5)     // Catch: java.lang.Exception -> L29
            goto L43
        L29:
            r5 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.e.n(r5)
            t3.g r5 = r4.h()     // Catch: java.lang.Exception -> L29
            r0.f95427c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L43
            return r1
        L43:
            r8.c r5 = (r8.c) r5     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = r5.f83618c     // Catch: java.lang.Exception -> L29
            return r5
        L48:
            z6.b r0 = z6.b.f101032b
            java.lang.String r1 = "UrlRepo"
            java.lang.String r2 = "getNotifyUrl error"
            r0.e(r1, r2, r5)
            java.lang.String r5 = w6.n.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.m.j(j00.c):java.lang.Object");
    }
}
