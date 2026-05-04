package l7;

import androidx.exifinterface.media.ExifInterface;
import com.microsoft.thrifty.service.a;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nThriftService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 2 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,13:1\n64#2,3:14\n67#2,2:22\n124#3,4:17\n142#4:21\n*S KotlinDebug\n*F\n+ 1 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n*L\n6#1:14,3\n6#1:22,2\n6#1:17,4\n6#1:21\n*E\n"})
/* loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class a<T> implements x00.l<w7.d<T>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f70653a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f70654b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f70655c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: l7.p$a$a, reason: collision with other inner class name */
        public static final class C0846a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f70656a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f70657b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f70658c;

            public C0846a(e eVar, c cVar, h10.d dVar) {
                this.f70656a = eVar;
                this.f70657b = cVar;
                this.f70658c = dVar;
            }

            public final void a(d.a randomRetry) {
                kotlin.jvm.internal.g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f70656a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f70656a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f70657b.b(this.f70658c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public a(h10.d dVar, e eVar, c cVar) {
            this.f70653a = dVar;
            this.f70654b = eVar;
            this.f70655c = cVar;
        }

        public final void a(w7.d<T> thriftBuilder) {
            kotlin.jvm.internal.g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0846a(this.f70654b, this.f70655c, this.f70653a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f70653a);
            kotlin.jvm.internal.g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
            a((w7.d) obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n*L\n1#1,13:1\n*E\n"})
    public static final class b implements x00.l<e, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f70659a = new b();

        public final void a(e eVar) {
            kotlin.jvm.internal.g0.p(eVar, "<this>");
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(e eVar) {
            a(eVar);
            return g2.f100423a;
        }
    }

    public static /* synthetic */ Object c(p pVar, x00.l config, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: thrift");
        }
        if ((i11 & 1) != 0) {
            config = b.f70659a;
        }
        kotlin.jvm.internal.g0.p(config, "config");
        e eVar = new e(null, null, 3, null);
        config.invoke(eVar);
        c cVar = (c) c4.j.f7801a.a().P().h().i(o0.d(c.class), null, null);
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        kotlin.jvm.internal.g0.w();
        return w7.f.b(new a(d11, eVar, cVar));
    }

    public final /* synthetic */ <T> T a(x00.l<? super e, g2> config) {
        kotlin.jvm.internal.g0.p(config, "config");
        e eVar = new e(null, null, 3, null);
        config.invoke(eVar);
        c cVar = (c) c4.j.f7801a.a().P().h().i(o0.d(c.class), null, null);
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        kotlin.jvm.internal.g0.w();
        return (T) w7.f.b(new a(d11, eVar, cVar));
    }

    @m80.k
    public abstract <T> T b(@m80.l x00.l<? super e, g2> lVar, @m80.k h10.d<T> dVar);
}
