package h20;

import a30.n;
import b20.e;
import g20.b1;
import java.util.List;
import p10.a1;
import x10.c;
import y10.s;
import y10.z;
import z10.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements y10.w {
        @Override // y10.w
        public List<f20.a> a(n20.b classId) {
            kotlin.jvm.internal.g0.p(classId, "classId");
            return null;
        }
    }

    @m80.k
    public static final k a(@m80.k p10.a0 module, @m80.k d30.n storageManager, @m80.k p10.f0 notFoundClasses, @m80.k b20.j lazyJavaPackageFragmentProvider, @m80.k v reflectKotlinClassFinder, @m80.k n deserializedDescriptorResolver, @m80.k a30.v errorReporter, @m80.k m20.e jvmMetadataVersion) {
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.g0.p(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        kotlin.jvm.internal.g0.p(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        kotlin.jvm.internal.g0.p(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        kotlin.jvm.internal.g0.p(errorReporter, "errorReporter");
        kotlin.jvm.internal.g0.p(jvmMetadataVersion, "jvmMetadataVersion");
        return new k(storageManager, module, n.a.f1823a, new o(reflectKotlinClassFinder, deserializedDescriptorResolver), i.a(module, notFoundClasses, storageManager, reflectKotlinClassFinder, jvmMetadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, c.a.f97054a, a30.l.f1785a.a(), f30.p.f50450b.a(), new h30.a(a00.g0.l(e30.w.f48677a)));
    }

    @m80.k
    public static final b20.j b(@m80.k y10.r javaClassFinder, @m80.k p10.a0 module, @m80.k d30.n storageManager, @m80.k p10.f0 notFoundClasses, @m80.k v reflectKotlinClassFinder, @m80.k n deserializedDescriptorResolver, @m80.k a30.v errorReporter, @m80.k e20.b javaSourceElementFactory, @m80.k b20.n singleModuleClassResolver, @m80.k d0 packagePartProvider) {
        kotlin.jvm.internal.g0.p(javaClassFinder, "javaClassFinder");
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.g0.p(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        kotlin.jvm.internal.g0.p(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        kotlin.jvm.internal.g0.p(errorReporter, "errorReporter");
        kotlin.jvm.internal.g0.p(javaSourceElementFactory, "javaSourceElementFactory");
        kotlin.jvm.internal.g0.p(singleModuleClassResolver, "singleModuleClassResolver");
        kotlin.jvm.internal.g0.p(packagePartProvider, "packagePartProvider");
        z10.o DO_NOTHING = z10.o.f100625a;
        kotlin.jvm.internal.g0.o(DO_NOTHING, "DO_NOTHING");
        z10.j EMPTY = z10.j.f100618a;
        kotlin.jvm.internal.g0.o(EMPTY, "EMPTY");
        i.a aVar = i.a.f100617a;
        w20.b bVar = new w20.b(storageManager, a00.h0.J());
        a1.a aVar2 = a1.a.f78552a;
        c.a aVar3 = c.a.f97054a;
        n10.n nVar = new n10.n(module, notFoundClasses);
        z.b bVar2 = y10.z.f99132d;
        y10.c cVar = new y10.c(bVar2.a());
        e.b bVar3 = e.b.f5725b;
        return new b20.j(new b20.d(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, aVar, bVar, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, nVar, cVar, new b1(new g20.g(bVar3)), s.a.f99106a, bVar3, f30.p.f50450b.a(), bVar2.a(), new a(), null, 8388608, null));
    }
}
