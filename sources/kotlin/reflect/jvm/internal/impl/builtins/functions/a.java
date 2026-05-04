package kotlin.reflect.jvm.internal.impl.builtins.functions;

import a00.r0;
import a00.w1;
import d30.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.f;
import m80.k;
import m80.l;
import n10.h;
import p10.a0;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBuiltInFictitiousFunctionClassFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n808#2,11:71\n808#2,11:82\n*S KotlinDebug\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n*L\n55#1:71,11\n59#1:82,11\n*E\n"})
/* loaded from: classes8.dex */
public final class a implements r10.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f67186a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a0 f67187b;

    public a(@k n storageManager, @k a0 module) {
        g0.p(storageManager, "storageManager");
        g0.p(module, "module");
        this.f67186a = storageManager;
        this.f67187b = module;
    }

    @Override // r10.b
    public boolean a(@k n20.c packageFqName, @k n20.f name) {
        g0.p(packageFqName, "packageFqName");
        g0.p(name, "name");
        String b11 = name.b();
        g0.o(b11, "asString(...)");
        return (f0.J2(b11, "Function", false, 2, null) || f0.J2(b11, "KFunction", false, 2, null) || f0.J2(b11, "SuspendFunction", false, 2, null) || f0.J2(b11, "KSuspendFunction", false, 2, null)) && f.f67208c.a().c(packageFqName, b11) != null;
    }

    @Override // r10.b
    @k
    public Collection<p10.b> b(@k n20.c packageFqName) {
        g0.p(packageFqName, "packageFqName");
        return w1.k();
    }

    @Override // r10.b
    @l
    public p10.b c(@k n20.b classId) {
        n20.c f11;
        f.b c11;
        g0.p(classId, "classId");
        if (classId.i() || classId.j()) {
            return null;
        }
        String b11 = classId.g().b();
        g0.o(b11, "asString(...)");
        if (!k0.n3(b11, "Function", false, 2, null) || (c11 = f.f67208c.a().c((f11 = classId.f()), b11)) == null) {
            return null;
        }
        e a11 = c11.a();
        int b12 = c11.b();
        List<p10.g0> N = this.f67187b.h0(f11).N();
        ArrayList arrayList = new ArrayList();
        for (Object obj : N) {
            if (obj instanceof n10.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof h) {
                arrayList2.add(obj2);
            }
        }
        p10.g0 g0Var = (h) r0.L2(arrayList2);
        if (g0Var == null) {
            g0Var = (n10.c) r0.G2(arrayList);
        }
        return new b(this.f67186a, g0Var, a11, b12);
    }
}
