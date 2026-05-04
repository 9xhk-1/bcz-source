package u10;

import h20.k;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import p10.a0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f91520c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a30.m f91521a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u10.a f91522b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final k a(@m80.k ClassLoader classLoader) {
            g0.p(classLoader, "classLoader");
            g gVar = new g(classLoader);
            k.a aVar = h20.k.f58117b;
            ClassLoader classLoader2 = g2.class.getClassLoader();
            g0.o(classLoader2, "getClassLoader(...)");
            k.a.C0655a a11 = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f91519b, l.f91523a);
            return new k(a11.a().a(), new u10.a(a11.b(), gVar), null);
        }

        public a() {
        }
    }

    public /* synthetic */ k(a30.m mVar, u10.a aVar, v vVar) {
        this(mVar, aVar);
    }

    @m80.k
    public final a30.m a() {
        return this.f91521a;
    }

    @m80.k
    public final a0 b() {
        return this.f91521a.q();
    }

    @m80.k
    public final u10.a c() {
        return this.f91522b;
    }

    public k(a30.m mVar, u10.a aVar) {
        this.f91521a = mVar;
        this.f91522b = aVar;
    }
}
