package io.ktor.server.routing;

import io.ktor.server.routing.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRouteSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/PathSegmentTailcardRouteSelector\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,664:1\n1771#2,2:665\n1#3:667\n1567#4:668\n1598#4,4:669\n*S KotlinDebug\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/PathSegmentTailcardRouteSelector\n*L\n409#1:665,2\n425#1:668\n425#1:669,4\n*E\n"})
/* loaded from: classes8.dex */
public final class v extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61750a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f61751b;

    /* JADX WARN: Multi-variable type inference failed */
    public v() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ v e(v vVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vVar.f61750a;
        }
        if ((i11 & 2) != 0) {
            str2 = vVar.f61751b;
        }
        return vVar.d(str, str2);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        ix.p1 f11;
        String str;
        List<String> f12 = p1Var.f();
        int i12 = 0;
        if (this.f61751b.length() > 0 && ((str = (String) a00.r0.b3(f12, i11)) == null || !u30.f0.J2(str, this.f61751b, false, 2, null))) {
            return i0.f61619b.f();
        }
        if (this.f61750a.length() == 0) {
            f11 = ix.t1.d();
        } else {
            String str2 = this.f61750a;
            List g22 = a00.r0.g2(f12, i11);
            ArrayList arrayList = new ArrayList(a00.i0.d0(g22, 10));
            for (Object obj : g22) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    a00.h0.b0();
                }
                String str3 = (String) obj;
                if (i12 == 0) {
                    str3 = u30.r0.d7(str3, this.f61751b.length());
                }
                arrayList.add(str3);
                i12 = i13;
            }
            f11 = ix.t1.f(str2, arrayList);
        }
        return new i0.c(i11 < f12.size() ? 0.1d : 0.2d, f11, f12.size() - i11);
    }

    @m80.k
    public final String b() {
        return this.f61750a;
    }

    @m80.k
    public final String c() {
        return this.f61751b;
    }

    @m80.k
    public final v d(@m80.k String name, @m80.k String prefix) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        return new v(name, prefix);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.g0.g(this.f61750a, vVar.f61750a) && kotlin.jvm.internal.g0.g(this.f61751b, vVar.f61751b);
    }

    @m80.k
    public final String f() {
        return this.f61750a;
    }

    @m80.k
    public final String g() {
        return this.f61751b;
    }

    public int hashCode() {
        return (this.f61750a.hashCode() * 31) + this.f61751b.hashCode();
    }

    @m80.k
    public String toString() {
        return "{...}";
    }

    public /* synthetic */ v(String str, String str2, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }

    public v(@m80.k String name, @m80.k String prefix) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        this.f61750a = name;
        this.f61751b = prefix;
        for (int i11 = 0; i11 < prefix.length(); i11++) {
            if (prefix.charAt(i11) == '/') {
                throw new IllegalArgumentException("Multisegment prefix is not supported");
            }
        }
    }
}
