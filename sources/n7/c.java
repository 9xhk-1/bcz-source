package n7;

import c4.j;
import com.microsoft.thrifty.service.a;
import j8.i;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {g.class})
@u0({"SMAP\nICheckInfoRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ICheckInfoRepo.kt\ncom/baicizhan/app/biz/userbasicinfo/CheckInfoRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,40:1\n6#2:41\n64#3,2:42\n66#3:45\n67#3,2:51\n6#4:44\n124#5,4:46\n142#6:50\n*S KotlinDebug\n*F\n+ 1 ICheckInfoRepo.kt\ncom/baicizhan/app/biz/userbasicinfo/CheckInfoRepoImpl\n*L\n23#1:41\n23#1:42,2\n23#1:45\n23#1:51,2\n23#1:44\n23#1:46,4\n23#1:50\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f74597a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final y<i> f74598b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final m0<i> f74599c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbasicinfo.CheckInfoRepoImpl", f = "ICheckInfoRepo.kt", i = {}, l = {26}, m = "fetch", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f74600a;

        /* renamed from: c, reason: collision with root package name */
        public int f74602c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f74600a = obj;
            this.f74602c |= Integer.MIN_VALUE;
            return c.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<j8.g>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f74603a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f74604b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f74605c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f74606a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f74607b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f74608c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f74606a = eVar;
                this.f74607b = cVar;
                this.f74608c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f74606a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f74606a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f74607b.b(this.f74608c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f74603a = dVar;
            this.f74604b = eVar;
            this.f74605c = cVar;
        }

        public final void a(w7.d<j8.g> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f74604b, this.f74605c, this.f74603a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f74603a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<j8.g> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public c(@k p thrift) {
        g0.p(thrift, "thrift");
        this.f74597a = thrift;
        y<i> a11 = o0.a(null);
        this.f74598b = a11;
        this.f74599c = a11;
    }

    public final j8.g a() {
        return (j8.g) w7.f.b(new b(kotlin.jvm.internal.o0.d(j8.g.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n7.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof n7.c.a
            if (r0 == 0) goto L13
            r0 = r5
            n7.c$a r0 = (n7.c.a) r0
            int r1 = r0.f74602c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74602c = r1
            goto L18
        L13:
            n7.c$a r0 = new n7.c$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f74600a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74602c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            j8.g r5 = r4.a()
            r0.f74602c = r3
            java.lang.Object r5 = r5.s3(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            j8.i r5 = (j8.i) r5
            kotlinx.coroutines.flow.y<j8.i> r0 = r4.f74598b
            r0.d(r5)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.c.b(j00.c):java.lang.Object");
    }

    @Override // n7.g
    @k
    public m0<i> getState() {
        return this.f74599c;
    }
}
