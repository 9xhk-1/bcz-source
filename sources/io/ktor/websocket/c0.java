package io.ktor.websocket;

import a00.r0;
import java.util.List;
import kotlin.Pair;
import org.junit.jupiter.api.j2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62379a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<String> f62380b;

    public c0(@m80.k String name, @m80.k List<String> parameters) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(parameters, "parameters");
        this.f62379a = name;
        this.f62380b = parameters;
    }

    public static final Pair f(String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        int I3 = u30.k0.I3(it, '=', 0, false, 6, null);
        String str = "";
        if (I3 < 0) {
            return h1.a(it, "");
        }
        String H5 = u30.k0.H5(it, g10.u.W1(0, I3));
        int i11 = I3 + 1;
        if (i11 < it.length()) {
            str = it.substring(i11);
            kotlin.jvm.internal.g0.o(str, "substring(...)");
        }
        return h1.a(H5, str);
    }

    @m80.k
    public final String b() {
        return this.f62379a;
    }

    @m80.k
    public final List<String> c() {
        return this.f62380b;
    }

    public final String d() {
        if (this.f62380b.isEmpty()) {
            return "";
        }
        return j2.O + r0.r3(this.f62380b, ",", null, null, 0, null, null, 62, null);
    }

    @m80.k
    public final q30.m<Pair<String, String>> e() {
        return q30.k0.N1(r0.E1(this.f62380b), new x00.l() { // from class: io.ktor.websocket.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair f11;
                f11 = c0.f((String) obj);
                return f11;
            }
        });
    }

    @m80.k
    public String toString() {
        return this.f62379a + ' ' + d();
    }
}
