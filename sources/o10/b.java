package o10;

import a00.h0;
import a00.v1;
import a00.w1;
import java.util.Collection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJavaToKotlinClassMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMapper.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMapper\n*L\n1#1,80:1\n75#1,3:81\n75#1,3:84\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMapper.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMapper\n*L\n59#1:81,3\n65#1:84,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f75542a = new b();

    public static /* synthetic */ p10.b f(b bVar, n20.c cVar, n10.j jVar, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        return bVar.e(cVar, jVar, num);
    }

    @m80.k
    public final p10.b a(@m80.k p10.b mutable) {
        g0.p(mutable, "mutable");
        n20.c o11 = a.f75522a.o(q20.h.m(mutable));
        if (o11 != null) {
            p10.b o12 = u20.e.m(mutable).o(o11);
            g0.o(o12, "getBuiltInClassByFqName(...)");
            return o12;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    @m80.k
    public final p10.b b(@m80.k p10.b readOnly) {
        g0.p(readOnly, "readOnly");
        n20.c p11 = a.f75522a.p(q20.h.m(readOnly));
        if (p11 != null) {
            p10.b o11 = u20.e.m(readOnly).o(p11);
            g0.o(o11, "getBuiltInClassByFqName(...)");
            return o11;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(@m80.k p10.b mutable) {
        g0.p(mutable, "mutable");
        return a.f75522a.k(q20.h.m(mutable));
    }

    public final boolean d(@m80.k p10.b readOnly) {
        g0.p(readOnly, "readOnly");
        return a.f75522a.l(q20.h.m(readOnly));
    }

    @m80.l
    public final p10.b e(@m80.k n20.c fqName, @m80.k n10.j builtIns, @m80.l Integer num) {
        g0.p(fqName, "fqName");
        g0.p(builtIns, "builtIns");
        n20.b m11 = (num == null || !g0.g(fqName, a.f75522a.h())) ? a.f75522a.m(fqName) : n10.o.a(num.intValue());
        if (m11 != null) {
            return builtIns.o(m11.a());
        }
        return null;
    }

    @m80.k
    public final Collection<p10.b> g(@m80.k n20.c fqName, @m80.k n10.j builtIns) {
        g0.p(fqName, "fqName");
        g0.p(builtIns, "builtIns");
        p10.b f11 = f(this, fqName, builtIns, null, 4, null);
        if (f11 == null) {
            return w1.k();
        }
        n20.c p11 = a.f75522a.p(u20.e.p(f11));
        return p11 == null ? v1.f(f11) : h0.Q(f11, builtIns.o(p11));
    }
}
