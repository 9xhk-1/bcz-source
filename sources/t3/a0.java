package t3;

import com.baicizhan.app.biz.base.cache.CacheStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import t3.e;
import t3.n;
import t3.z;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89212a;

        static {
            int[] iArr = new int[CacheStrategy.values().length];
            try {
                iArr[CacheStrategy.CACHE_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheStrategy.NETWORK_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheStrategy.NETWORK_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89212a = iArr;
        }
    }

    @m80.k
    public static final <T> g<T> a(@m80.k x00.l<? super b<T>, g2> config) {
        w wVar;
        j jVar;
        g0.p(config, "config");
        b bVar = new b();
        b(bVar);
        config.invoke(bVar);
        bVar.b();
        e c11 = bVar.c();
        if (g0.g(c11, e.b.f89242a)) {
            jVar = new q();
        } else {
            if (c11 instanceof e.c) {
                e.c cVar = (e.c) c11;
                if (!(cVar.f() instanceof z.b)) {
                    throw new IllegalArgumentException("not support");
                }
                y yVar = new y(cVar.e(), bVar.a());
                z f11 = cVar.f();
                g0.n(f11, "null cannot be cast to non-null type com.baicizhan.app.biz.base.cache.Protocol.Thrift<T of com.baicizhan.app.biz.base.cache.ThriftCacheKt.cache>");
                wVar = new w(yVar, new b0(((z.b) f11).d()));
            } else {
                if (!(c11 instanceof e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                e.a aVar = (e.a) c11;
                if (!(aVar.f() instanceof z.b)) {
                    throw new IllegalArgumentException("not support");
                }
                f fVar = new f(bVar.a(), aVar.e());
                z f12 = aVar.f();
                g0.n(f12, "null cannot be cast to non-null type com.baicizhan.app.biz.base.cache.Protocol.Thrift<T of com.baicizhan.app.biz.base.cache.ThriftCacheKt.cache>");
                wVar = new w(fVar, new b0(((z.b) f12).d()));
            }
            jVar = wVar;
        }
        n d11 = bVar.d();
        h oVar = d11 instanceof n.b ? new o() : d11 instanceof n.a ? new t3.a() : d11 instanceof n.c ? new t(bVar.a()) : d11 instanceof n.d ? new e0(((n.d) d11).d(), bVar.a()) : new o();
        int i11 = a.f89212a[bVar.b().ordinal()];
        if (i11 == 1) {
            return new c(jVar, bVar.e(), oVar);
        }
        if (i11 == 2) {
            return new u(jVar, bVar.e(), oVar);
        }
        if (i11 == 3) {
            return new v(jVar, bVar.e(), oVar);
        }
        throw new IllegalArgumentException("not support");
    }

    public static final <T> void b(b<T> bVar) {
        bVar.g(CacheStrategy.NETWORK_FIRST);
        bVar.i(n.b.f89275a);
    }
}
