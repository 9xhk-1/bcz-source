package u10;

import h20.v;
import java.io.InputStream;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import n10.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectKotlinClassFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectKotlinClassFinder.kt\norg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClassFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes8.dex */
public final class g implements v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ClassLoader f91516a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b30.d f91517b;

    public g(@m80.k ClassLoader classLoader) {
        g0.p(classLoader, "classLoader");
        this.f91516a = classLoader;
        this.f91517b = new b30.d();
    }

    @Override // h20.v
    @m80.l
    public v.a a(@m80.k f20.g javaClass, @m80.k m20.e jvmMetadataVersion) {
        String b11;
        g0.p(javaClass, "javaClass");
        g0.p(jvmMetadataVersion, "jvmMetadataVersion");
        n20.c d11 = javaClass.d();
        if (d11 == null || (b11 = d11.b()) == null) {
            return null;
        }
        return d(b11);
    }

    @Override // a30.z
    @m80.l
    public InputStream b(@m80.k n20.c packageFqName) {
        g0.p(packageFqName, "packageFqName");
        if (packageFqName.i(o.f74028z)) {
            return this.f91517b.a(b30.a.f5754r.r(packageFqName));
        }
        return null;
    }

    @Override // h20.v
    @m80.l
    public v.a c(@m80.k n20.b classId, @m80.k m20.e jvmMetadataVersion) {
        String b11;
        g0.p(classId, "classId");
        g0.p(jvmMetadataVersion, "jvmMetadataVersion");
        b11 = h.b(classId);
        return d(b11);
    }

    public final v.a d(String str) {
        f a11;
        Class<?> a12 = e.a(this.f91516a, str);
        if (a12 == null || (a11 = f.f91513c.a(a12)) == null) {
            return null;
        }
        return new v.a.b(a11, null, 2, null);
    }
}
