package x20;

import a00.w1;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.g0;
import p10.q0;
import x20.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface k extends n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f97116a = a.f97117a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f97117a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final x00.l<n20.f, Boolean> f97118b = j.f97115a;

        public static final boolean a(n20.f it) {
            g0.p(it, "it");
            return true;
        }

        @m80.k
        public final x00.l<n20.f, Boolean> c() {
            return f97118b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public static void a(@m80.k k kVar, @m80.k n20.f name, @m80.k x10.b location) {
            g0.p(name, "name");
            g0.p(location, "location");
            n.a.b(kVar, name, location);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends l {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final c f97119b = new c();

        @Override // x20.l, x20.k
        @m80.k
        public Set<n20.f> b() {
            return w1.k();
        }

        @Override // x20.l, x20.k
        @m80.k
        public Set<n20.f> d() {
            return w1.k();
        }

        @Override // x20.l, x20.k
        @m80.k
        public Set<n20.f> g() {
            return w1.k();
        }
    }

    @Override // x20.n
    @m80.k
    Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f fVar, @m80.k x10.b bVar);

    @m80.k
    Set<n20.f> b();

    @m80.k
    Collection<? extends q0> c(@m80.k n20.f fVar, @m80.k x10.b bVar);

    @m80.k
    Set<n20.f> d();

    @m80.l
    Set<n20.f> g();
}
