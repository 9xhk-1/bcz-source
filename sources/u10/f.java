package u10;

import h20.x;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f implements x {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f91513c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Class<?> f91514a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final KotlinClassHeader f91515b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.l
        public final f a(@m80.k Class<?> klass) {
            g0.p(klass, "klass");
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a();
            c.f91511a.b(klass, aVar);
            KotlinClassHeader n11 = aVar.n();
            v vVar = null;
            if (n11 == null) {
                return null;
            }
            return new f(klass, n11, vVar);
        }

        public a() {
        }
    }

    public /* synthetic */ f(Class cls, KotlinClassHeader kotlinClassHeader, v vVar) {
        this(cls, kotlinClassHeader);
    }

    @Override // h20.x
    @m80.k
    public n20.b a() {
        return v10.f.e(this.f91514a);
    }

    @Override // h20.x
    @m80.k
    public KotlinClassHeader b() {
        return this.f91515b;
    }

    @Override // h20.x
    public void c(@m80.k x.d visitor, @m80.l byte[] bArr) {
        g0.p(visitor, "visitor");
        c.f91511a.i(this.f91514a, visitor);
    }

    @Override // h20.x
    public void d(@m80.k x.c visitor, @m80.l byte[] bArr) {
        g0.p(visitor, "visitor");
        c.f91511a.b(this.f91514a, visitor);
    }

    @m80.k
    public final Class<?> e() {
        return this.f91514a;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof f) && g0.g(this.f91514a, ((f) obj).f91514a);
    }

    @Override // h20.x
    @m80.k
    public String getLocation() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f91514a.getName();
        g0.o(name, "getName(...)");
        sb2.append(f0.y2(name, '.', '/', false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    public int hashCode() {
        return this.f91514a.hashCode();
    }

    @m80.k
    public String toString() {
        return f.class.getName() + ": " + this.f91514a;
    }

    public f(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.f91514a = cls;
        this.f91515b = kotlinClassHeader;
    }
}
