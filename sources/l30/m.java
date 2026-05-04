package l30;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l30.f;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/NoDefaultAndVarargsCheck\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n1734#2,3:265\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/NoDefaultAndVarargsCheck\n*L\n105#1:265,3\n*E\n"})
/* loaded from: classes8.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m f69791a = new m();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f69792b = "should not have varargs or parameters with default values";

    @Override // l30.f
    @m80.l
    public String a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // l30.f
    public boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        g0.p(functionDescriptor, "functionDescriptor");
        List<j1> g11 = functionDescriptor.g();
        g0.o(g11, "getValueParameters(...)");
        List<j1> list = g11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (j1 j1Var : list) {
            g0.m(j1Var);
            if (u20.e.f(j1Var) || j1Var.y0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // l30.f
    @m80.k
    public String getDescription() {
        return f69792b;
    }
}
