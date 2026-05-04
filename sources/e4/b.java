package e4;

import c4.j;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import ws.i;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f.class})
@u0({"SMAP\nDeviceRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceRepo.kt\ncom/baicizhan/app/biz/device/DeviceManagerImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n6#2:56\n64#3,2:57\n66#3:60\n67#3,2:66\n6#4:59\n124#5,4:61\n142#6:65\n1563#7:68\n1634#7,3:69\n1563#7:72\n1634#7,3:73\n*S KotlinDebug\n*F\n+ 1 DeviceRepo.kt\ncom/baicizhan/app/biz/device/DeviceManagerImpl\n*L\n30#1:56\n30#1:57,2\n30#1:60\n30#1:66,2\n30#1:59\n30#1:61,4\n30#1:65\n33#1:68\n33#1:69,3\n53#1:72\n53#1:73,3\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f48699a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.device.DeviceManagerImpl", f = "DeviceRepo.kt", i = {}, l = {53}, m = "getBondingTips", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f48700a;

        /* renamed from: c, reason: collision with root package name */
        public int f48702c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f48700a = obj;
            this.f48702c |= Integer.MIN_VALUE;
            return b.this.m(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.device.DeviceManagerImpl", f = "DeviceRepo.kt", i = {}, l = {33}, m = "getDevices", n = {}, s = {}, v = 1)
    /* renamed from: e4.b$b, reason: collision with other inner class name */
    public static final class C0586b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f48703a;

        /* renamed from: c, reason: collision with root package name */
        public int f48705c;

        public C0586b(j00.c<? super C0586b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f48703a = obj;
            this.f48705c |= Integer.MIN_VALUE;
            return b.this.e(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<y8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f48706a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f48707b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f48708c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f48709a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f48710b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f48711c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f48709a = eVar;
                this.f48710b = cVar;
                this.f48711c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f48709a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f48709a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f48710b.b(this.f48711c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f48706a = dVar;
            this.f48707b = eVar;
            this.f48708c = cVar;
        }

        public final void a(w7.d<y8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f48707b, this.f48708c, this.f48706a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f48706a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<y8.h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public b(@k p thirft) {
        g0.p(thirft, "thirft");
        this.f48699a = thirft;
    }

    public final y8.h a() {
        return (y8.h) w7.f.b(new c(o0.d(y8.h.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e4.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k j00.c<? super java.util.List<k3.y3>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof e4.b.C0586b
            if (r0 == 0) goto L13
            r0 = r14
            e4.b$b r0 = (e4.b.C0586b) r0
            int r1 = r0.f48705c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48705c = r1
            goto L18
        L13:
            e4.b$b r0 = new e4.b$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f48703a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f48705c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r14)
            goto L41
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L31:
            kotlin.e.n(r14)
            y8.h r14 = r13.a()
            r0.f48705c = r3
            java.lang.Object r14 = r14.U8(r0)
            if (r14 != r1) goto L41
            return r1
        L41:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = a00.i0.d0(r14, r1)
            r0.<init>(r1)
            java.util.Iterator r14 = r14.iterator()
        L52:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r14.next()
            y8.l r1 = (y8.l) r1
            k3.y3 r4 = new k3.y3
            long r5 = r1.f99651a
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Integer r2 = r1.f99658h
            if (r2 == 0) goto L70
            int r2 = r2.intValue()
        L6e:
            r6 = r2
            goto L72
        L70:
            r2 = -1
            goto L6e
        L72:
            java.lang.String r7 = r1.f99652b
            java.lang.String r8 = r1.f99656f
            java.lang.String r9 = r1.f99653c
            java.lang.String r10 = r1.f99654d
            java.lang.String r11 = r1.f99655e
            int r1 = r1.f99657g
            if (r1 == 0) goto L82
            r12 = r3
            goto L84
        L82:
            r1 = 0
            r12 = r1
        L84:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.add(r4)
            goto L52
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.b.e(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e4.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(@m80.k j00.c<? super java.util.List<k3.n>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof e4.b.a
            if (r0 == 0) goto L13
            r0 = r6
            e4.b$a r0 = (e4.b.a) r0
            int r1 = r0.f48702c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48702c = r1
            goto L18
        L13:
            e4.b$a r0 = new e4.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f48700a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f48702c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.e.n(r6)
            y8.h r6 = r5.a()
            r0.f48702c = r3
            java.lang.Object r6 = r6.P2(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = a00.i0.d0(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L52:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r6.next()
            y8.e r1 = (y8.e) r1
            k3.n r2 = new k3.n
            java.lang.String r3 = r1.f99545a
            java.lang.String r4 = ""
            if (r3 != 0) goto L67
            r3 = r4
        L67:
            java.lang.String r1 = r1.f99546b
            if (r1 != 0) goto L6c
            goto L6d
        L6c:
            r4 = r1
        L6d:
            r2.<init>(r3, r4)
            r0.add(r2)
            goto L52
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.b.m(j00.c):java.lang.Object");
    }

    @Override // e4.f
    @l
    public Object n(long j11, int i11, @k j00.c<? super g2> cVar) {
        Object L0 = a().L0(j11, i11, cVar);
        return L0 == kotlin.coroutines.intrinsics.b.l() ? L0 : g2.f100423a;
    }

    @Override // e4.f
    @l
    public Object o(long j11, int i11, @k String str, @k j00.c<? super g2> cVar) {
        Object E3 = a().E3(j11, str, i11, cVar);
        return E3 == kotlin.coroutines.intrinsics.b.l() ? E3 : g2.f100423a;
    }
}
