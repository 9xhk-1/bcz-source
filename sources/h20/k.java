package h20;

import a30.a0;
import a30.n;
import h20.d0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import r10.a;
import r10.c;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f58117b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a30.m f58118a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: h20.k$a$a, reason: collision with other inner class name */
        public static final class C0655a {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final k f58119a;

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public final n f58120b;

            public C0655a(@m80.k k deserializationComponentsForJava, @m80.k n deserializedDescriptorResolver) {
                kotlin.jvm.internal.g0.p(deserializationComponentsForJava, "deserializationComponentsForJava");
                kotlin.jvm.internal.g0.p(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f58119a = deserializationComponentsForJava;
                this.f58120b = deserializedDescriptorResolver;
            }

            @m80.k
            public final k a() {
                return this.f58119a;
            }

            @m80.k
            public final n b() {
                return this.f58120b;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final C0655a a(@m80.k v kotlinClassFinder, @m80.k v jvmBuiltInsKotlinClassFinder, @m80.k y10.r javaClassFinder, @m80.k String moduleName, @m80.k a30.v errorReporter, @m80.k e20.b javaSourceElementFactory) {
            b20.j b11;
            kotlin.jvm.internal.g0.p(kotlinClassFinder, "kotlinClassFinder");
            kotlin.jvm.internal.g0.p(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            kotlin.jvm.internal.g0.p(javaClassFinder, "javaClassFinder");
            kotlin.jvm.internal.g0.p(moduleName, "moduleName");
            kotlin.jvm.internal.g0.p(errorReporter, "errorReporter");
            kotlin.jvm.internal.g0.p(javaSourceElementFactory, "javaSourceElementFactory");
            d30.f fVar = new d30.f("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(fVar, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            n20.f k11 = n20.f.k(u0.f91709e + moduleName + u0.f91710f);
            kotlin.jvm.internal.g0.o(k11, "special(...)");
            s10.f0 f0Var = new s10.f0(k11, fVar, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.E0(f0Var);
            jvmBuiltIns.M0(f0Var, true);
            n nVar = new n();
            b20.o oVar = new b20.o();
            p10.f0 f0Var2 = new p10.f0(fVar, f0Var);
            b11 = l.b(javaClassFinder, f0Var, fVar, f0Var2, kotlinClassFinder, nVar, errorReporter, javaSourceElementFactory, oVar, (r21 & 512) != 0 ? d0.a.f58055a : null);
            k a11 = l.a(f0Var, fVar, f0Var2, b11, kotlinClassFinder, nVar, errorReporter, m20.e.f71807i);
            nVar.p(a11);
            z10.j EMPTY = z10.j.f100618a;
            kotlin.jvm.internal.g0.o(EMPTY, "EMPTY");
            v20.c cVar = new v20.c(b11, EMPTY);
            oVar.c(cVar);
            o10.r rVar = new o10.r(fVar, jvmBuiltInsKotlinClassFinder, f0Var, f0Var2, jvmBuiltIns.L0(), jvmBuiltIns.L0(), n.a.f1823a, f30.p.f50450b.a(), new w20.b(fVar, a00.h0.J()));
            f0Var.R0(f0Var);
            f0Var.J0(new s10.l(a00.h0.Q(cVar.a(), rVar), "CompositeProvider@RuntimeModuleData for " + f0Var));
            return new C0655a(a11, nVar);
        }

        public a() {
        }
    }

    public k(@m80.k d30.n storageManager, @m80.k p10.a0 moduleDescriptor, @m80.k a30.n configuration, @m80.k o classDataFinder, @m80.k h annotationAndConstantLoader, @m80.k b20.j packageFragmentProvider, @m80.k p10.f0 notFoundClasses, @m80.k a30.v errorReporter, @m80.k x10.c lookupTracker, @m80.k a30.l contractDeserializer, @m80.k f30.p kotlinTypeChecker, @m80.k h30.a typeAttributeTranslators) {
        r10.c L0;
        r10.a L02;
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.g0.p(configuration, "configuration");
        kotlin.jvm.internal.g0.p(classDataFinder, "classDataFinder");
        kotlin.jvm.internal.g0.p(annotationAndConstantLoader, "annotationAndConstantLoader");
        kotlin.jvm.internal.g0.p(packageFragmentProvider, "packageFragmentProvider");
        kotlin.jvm.internal.g0.p(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.g0.p(errorReporter, "errorReporter");
        kotlin.jvm.internal.g0.p(lookupTracker, "lookupTracker");
        kotlin.jvm.internal.g0.p(contractDeserializer, "contractDeserializer");
        kotlin.jvm.internal.g0.p(kotlinTypeChecker, "kotlinTypeChecker");
        kotlin.jvm.internal.g0.p(typeAttributeTranslators, "typeAttributeTranslators");
        n10.j q11 = moduleDescriptor.q();
        JvmBuiltIns jvmBuiltIns = q11 instanceof JvmBuiltIns ? (JvmBuiltIns) q11 : null;
        this.f58118a = new a30.m(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, a0.a.f1734a, errorReporter, lookupTracker, p.f58131a, a00.h0.J(), notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (L02 = jvmBuiltIns.L0()) == null) ? a.C1026a.f82855a : L02, (jvmBuiltIns == null || (L0 = jvmBuiltIns.L0()) == null) ? c.b.f82857a : L0, m20.i.f71820a.a(), kotlinTypeChecker, new w20.b(storageManager, a00.h0.J()), typeAttributeTranslators.a(), a30.y.f1881a);
    }

    @m80.k
    public final a30.m a() {
        return this.f58118a;
    }
}
