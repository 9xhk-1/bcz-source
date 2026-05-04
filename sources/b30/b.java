package b30;

import a00.i0;
import a30.a0;
import a30.e;
import a30.m;
import a30.n;
import a30.p;
import a30.v;
import a30.w;
import d30.n;
import h10.h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import n10.o;
import p10.a0;
import p10.f0;
import p10.h0;
import p10.k0;
import x00.l;
import x10.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBuiltInsLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1557#2:94\n1628#2,3:95\n*S KotlinDebug\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n*L\n57#1:94\n57#1:95,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements n10.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f5755b = new d();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReference implements l<String, InputStream> {
        public a(Object obj) {
            super(1, obj);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p02) {
            g0.p(p02, "p0");
            return ((d) this.receiver).a(p02);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h getOwner() {
            return o0.d(d.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }
    }

    @Override // n10.b
    @k
    public h0 a(@k n storageManager, @k a0 builtInsModule, @k Iterable<? extends r10.b> classDescriptorFactories, @k r10.c platformDependentDeclarationFilter, @k r10.a additionalClassPartsProvider, boolean z11) {
        g0.p(storageManager, "storageManager");
        g0.p(builtInsModule, "builtInsModule");
        g0.p(classDescriptorFactories, "classDescriptorFactories");
        g0.p(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        g0.p(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, o.H, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z11, new a(this.f5755b));
    }

    @k
    public final h0 b(@k n nVar, @k a0 a0Var, @k Set<n20.c> packageFqNames, @k Iterable<? extends r10.b> classDescriptorFactories, @k r10.c platformDependentDeclarationFilter, @k r10.a additionalClassPartsProvider, boolean z11, @k l<? super String, ? extends InputStream> loadResource) {
        n storageManager = nVar;
        a0 module = a0Var;
        g0.p(storageManager, "storageManager");
        g0.p(module, "module");
        g0.p(packageFqNames, "packageFqNames");
        g0.p(classDescriptorFactories, "classDescriptorFactories");
        g0.p(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        g0.p(additionalClassPartsProvider, "additionalClassPartsProvider");
        g0.p(loadResource, "loadResource");
        Set<n20.c> set = packageFqNames;
        ArrayList arrayList = new ArrayList(i0.d0(set, 10));
        for (n20.c cVar : set) {
            String r11 = b30.a.f5754r.r(cVar);
            InputStream invoke = loadResource.invoke(r11);
            if (invoke == null) {
                throw new IllegalStateException("Resource not found in classpath: " + r11);
            }
            a0 a0Var2 = module;
            storageManager = nVar;
            module = a0Var2;
            arrayList.add(c.f5756o.a(cVar, nVar, a0Var2, invoke, z11));
        }
        k0 k0Var = new k0(arrayList);
        f0 f0Var = new f0(storageManager, module);
        n.a aVar = n.a.f1823a;
        p pVar = new p(k0Var);
        b30.a aVar2 = b30.a.f5754r;
        e eVar = new e(module, f0Var, aVar2);
        a0.a aVar3 = a0.a.f1734a;
        v DO_NOTHING = v.f1864a;
        g0.o(DO_NOTHING, "DO_NOTHING");
        m mVar = new m(storageManager, a0Var, aVar, pVar, eVar, k0Var, aVar3, DO_NOTHING, c.a.f97054a, w.a.f1873a, classDescriptorFactories, f0Var, a30.l.f1785a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, aVar2.e(), null, new w20.b(storageManager, a00.h0.J()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).G0(mVar);
        }
        return k0Var;
    }
}
