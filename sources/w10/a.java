package w10;

import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import m80.k;
import n20.f;
import q20.h;
import x10.b;
import x10.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    public static final void a(@k c cVar, @k b from, @k p10.b scopeOwner, @k f name) {
        x10.a location;
        g0.p(cVar, "<this>");
        g0.p(from, "from");
        g0.p(scopeOwner, "scopeOwner");
        g0.p(name, "name");
        if (cVar == c.a.f97054a || (location = from.getLocation()) == null) {
            return;
        }
        Position position = cVar.a() ? location.getPosition() : Position.Companion.a();
        String a11 = location.a();
        String b11 = h.m(scopeOwner).b();
        g0.o(b11, "asString(...)");
        ScopeKind scopeKind = ScopeKind.CLASSIFIER;
        String b12 = name.b();
        g0.o(b12, "asString(...)");
        cVar.b(a11, position, b11, scopeKind, b12);
    }

    public static final void b(@k c cVar, @k b from, @k p10.g0 scopeOwner, @k f name) {
        g0.p(cVar, "<this>");
        g0.p(from, "from");
        g0.p(scopeOwner, "scopeOwner");
        g0.p(name, "name");
        String b11 = scopeOwner.d().b();
        g0.o(b11, "asString(...)");
        String b12 = name.b();
        g0.o(b12, "asString(...)");
        c(cVar, from, b11, b12);
    }

    public static final void c(@k c cVar, @k b from, @k String packageFqName, @k String name) {
        x10.a location;
        g0.p(cVar, "<this>");
        g0.p(from, "from");
        g0.p(packageFqName, "packageFqName");
        g0.p(name, "name");
        if (cVar == c.a.f97054a || (location = from.getLocation()) == null) {
            return;
        }
        cVar.b(location.a(), cVar.a() ? location.getPosition() : Position.Companion.a(), packageFqName, ScopeKind.PACKAGE, name);
    }
}
