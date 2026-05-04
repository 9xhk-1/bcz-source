package l30;

import e30.r0;
import kotlin.jvm.internal.g0;
import l30.f;
import n10.n;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final j f69785a = new j();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f69786b = "second parameter must be of type KProperty<*> or its supertype";

    @Override // l30.f
    @m80.l
    public String a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // l30.f
    public boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        g0.p(functionDescriptor, "functionDescriptor");
        j1 j1Var = functionDescriptor.g().get(1);
        n.b bVar = n10.n.f73990k;
        g0.m(j1Var);
        r0 a11 = bVar.a(u20.e.s(j1Var));
        if (a11 == null) {
            return false;
        }
        r0 type = j1Var.getType();
        g0.o(type, "getType(...)");
        return j30.e.x(a11, j30.e.B(type));
    }

    @Override // l30.f
    @m80.k
    public String getDescription() {
        return f69786b;
    }
}
