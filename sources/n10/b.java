package n10;

import a00.r0;
import java.util.ServiceLoader;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import p10.a0;
import p10.h0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f73963a = a.f73964a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f73964a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final c0<b> f73965b = e0.b(LazyThreadSafetyMode.PUBLICATION, n10.a.f73962a);

        public static final b a() {
            ServiceLoader load = ServiceLoader.load(b.class, b.class.getClassLoader());
            g0.m(load);
            b bVar = (b) r0.J2(load);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        @m80.k
        public final b c() {
            return f73965b.getValue();
        }
    }

    @m80.k
    h0 a(@m80.k d30.n nVar, @m80.k a0 a0Var, @m80.k Iterable<? extends r10.b> iterable, @m80.k r10.c cVar, @m80.k r10.a aVar, boolean z11);
}
