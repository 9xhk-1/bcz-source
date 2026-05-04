package u10;

import a00.r0;
import h20.n;
import h20.w;
import h20.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import n20.b;
import s10.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPackagePartScopeCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n72#2,2:43\n1611#3,9:45\n1863#3:54\n1864#3:56\n1620#3:57\n1611#3,9:58\n1863#3:67\n1864#3:69\n1620#3:70\n1#4:55\n1#4:68\n1#4:71\n*S KotlinDebug\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n*L\n22#1:43,2\n27#1:45,9\n27#1:54\n27#1:56\n27#1:57\n35#1:58,9\n35#1:67\n35#1:69\n35#1:70\n27#1:55\n35#1:68\n22#1:71\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n f91507a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final g f91508b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ConcurrentHashMap<n20.b, x20.k> f91509c;

    public a(@m80.k n resolver, @m80.k g kotlinClassFinder) {
        g0.p(resolver, "resolver");
        g0.p(kotlinClassFinder, "kotlinClassFinder");
        this.f91507a = resolver;
        this.f91508b = kotlinClassFinder;
        this.f91509c = new ConcurrentHashMap<>();
    }

    @m80.k
    public final x20.k a(@m80.k f fileClass) {
        Collection l11;
        g0.p(fileClass, "fileClass");
        ConcurrentHashMap<n20.b, x20.k> concurrentHashMap = this.f91509c;
        n20.b a11 = fileClass.a();
        x20.k kVar = concurrentHashMap.get(a11);
        if (kVar == null) {
            n20.c f11 = fileClass.a().f();
            if (fileClass.b().c() == KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                List<String> f12 = fileClass.b().f();
                l11 = new ArrayList();
                for (String str : f12) {
                    b.a aVar = n20.b.f74280d;
                    n20.c e11 = v20.d.d(str).e();
                    g0.o(e11, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    x b11 = w.b(this.f91508b, aVar.c(e11), o30.c.a(this.f91507a.f().g()));
                    if (b11 != null) {
                        l11.add(b11);
                    }
                }
            } else {
                l11 = a00.g0.l(fileClass);
            }
            p pVar = new p(this.f91507a.f().q(), f11);
            ArrayList arrayList = new ArrayList();
            Iterator it = l11.iterator();
            while (it.hasNext()) {
                x20.k c11 = this.f91507a.c(pVar, (x) it.next());
                if (c11 != null) {
                    arrayList.add(c11);
                }
            }
            List a62 = r0.a6(arrayList);
            x20.k a12 = x20.b.f97072d.a("package " + f11 + " (" + fileClass + ')', a62);
            x20.k putIfAbsent = concurrentHashMap.putIfAbsent(a11, a12);
            kVar = putIfAbsent == null ? a12 : putIfAbsent;
        }
        g0.o(kVar, "getOrPut(...)");
        return kVar;
    }
}
