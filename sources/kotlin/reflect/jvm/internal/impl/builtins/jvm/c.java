package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import a00.r0;
import a00.v1;
import a00.w1;
import d30.i;
import d30.m;
import h10.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import m80.k;
import n10.o;
import n20.b;
import n20.f;
import p10.a0;
import p10.h;
import p10.x0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmBuiltInClassDescriptorFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInClassDescriptorFactory.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInClassDescriptorFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n808#2,11:58\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInClassDescriptorFactory.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInClassDescriptorFactory\n*L\n23#1:58,11\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements r10.b {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final f f67228g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final n20.b f67229h;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a0 f67230a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<a0, h> f67231b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i f67232c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f67226e = {o0.u(new PropertyReference1Impl(o0.d(c.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f67225d = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final n20.c f67227f = o.A;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final n20.b a() {
            return c.f67229h;
        }

        public a() {
        }
    }

    static {
        n20.d dVar = o.a.f74035d;
        f i11 = dVar.i();
        g0.o(i11, "shortName(...)");
        f67228g = i11;
        b.a aVar = n20.b.f74280d;
        n20.c l11 = dVar.l();
        g0.o(l11, "toSafe(...)");
        f67229h = aVar.c(l11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k d30.n storageManager, @k a0 moduleDescriptor, @k l<? super a0, ? extends h> computeContainingDeclaration) {
        g0.p(storageManager, "storageManager");
        g0.p(moduleDescriptor, "moduleDescriptor");
        g0.p(computeContainingDeclaration, "computeContainingDeclaration");
        this.f67230a = moduleDescriptor;
        this.f67231b = computeContainingDeclaration;
        this.f67232c = storageManager.f(new o10.c(this, storageManager));
    }

    public static final n10.c d(a0 module) {
        g0.p(module, "module");
        List<p10.g0> N = module.h0(f67227f).N();
        ArrayList arrayList = new ArrayList();
        for (Object obj : N) {
            if (obj instanceof n10.c) {
                arrayList.add(obj);
            }
        }
        return (n10.c) r0.G2(arrayList);
    }

    public static final s10.k h(c cVar, d30.n nVar) {
        s10.k kVar = new s10.k(cVar.f67231b.invoke(cVar.f67230a), f67228g, Modality.ABSTRACT, ClassKind.INTERFACE, a00.g0.l(cVar.f67230a.q().i()), x0.f78622a, false, nVar);
        kVar.F0(new kotlin.reflect.jvm.internal.impl.builtins.jvm.a(nVar, kVar), w1.k(), null);
        return kVar;
    }

    @Override // r10.b
    public boolean a(@k n20.c packageFqName, @k f name) {
        g0.p(packageFqName, "packageFqName");
        g0.p(name, "name");
        return g0.g(name, f67228g) && g0.g(packageFqName, f67227f);
    }

    @Override // r10.b
    @k
    public Collection<p10.b> b(@k n20.c packageFqName) {
        g0.p(packageFqName, "packageFqName");
        return g0.g(packageFqName, f67227f) ? v1.f(i()) : w1.k();
    }

    @Override // r10.b
    @m80.l
    public p10.b c(@k n20.b classId) {
        g0.p(classId, "classId");
        if (g0.g(classId, f67229h)) {
            return i();
        }
        return null;
    }

    public final s10.k i() {
        return (s10.k) m.a(this.f67232c, this, f67226e[0]);
    }

    public /* synthetic */ c(d30.n nVar, a0 a0Var, l lVar, int i11, v vVar) {
        this(nVar, a0Var, (i11 & 4) != 0 ? o10.d.f75545a : lVar);
    }
}
