package ix;

import ix.p1;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\nio/ktor/http/ParametersKt\n+ 2 Parameters.kt\nio/ktor/http/Parameters$Companion\n*L\n1#1,111:1\n24#2:112\n24#2:113\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\nio/ktor/http/ParametersKt\n*L\n71#1:112\n91#1:113\n*E\n"})
/* loaded from: classes8.dex */
public final class t1 {
    @m80.k
    public static final q1 a(int i11) {
        return new r1(i11);
    }

    public static /* synthetic */ q1 b(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        return a(i11);
    }

    @m80.k
    public static final p1 c(@m80.k x00.l<? super q1, yz.g2> builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        p1.a aVar = p1.f62972b;
        q1 b11 = b(0, 1, null);
        builder.invoke(b11);
        return b11.build();
    }

    @m80.k
    public static final p1 d() {
        return p1.f62972b.b();
    }

    @m80.k
    public static final p1 e(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        return new u1(name, a00.g0.l(value));
    }

    @m80.k
    public static final p1 f(@m80.k String name, @m80.k List<String> values) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        return new u1(name, values);
    }

    @m80.k
    public static final p1 g(@m80.k Map<String, ? extends List<String>> map) {
        kotlin.jvm.internal.g0.p(map, "map");
        return new s1(map);
    }

    @m80.k
    public static final p1 h(@m80.k Pair<String, ? extends List<String>>... pairs) {
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        return new s1(a00.l1.B0(a00.q.t(pairs)));
    }

    @m80.k
    public static final p1 i(@m80.k p1 p1Var, @m80.k p1 other) {
        kotlin.jvm.internal.g0.p(p1Var, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        if (p1Var.b() != other.b()) {
            throw new IllegalArgumentException("Cannot concatenate Parameters with case-sensitive and case-insensitive names");
        }
        if (p1Var.isEmpty()) {
            return other;
        }
        if (other.isEmpty()) {
            return p1Var;
        }
        p1.a aVar = p1.f62972b;
        q1 b11 = b(0, 1, null);
        b11.j(p1Var);
        b11.j(other);
        return b11.build();
    }
}
