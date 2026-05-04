package ix;

import ix.q0;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nio/ktor/http/HeadersKt\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,90:1\n23#2:91\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nio/ktor/http/HeadersKt\n*L\n76#1:91\n*E\n"})
/* loaded from: classes8.dex */
public final class t0 {
    @m80.k
    public static final q0 a(@m80.k x00.l<? super r0, yz.g2> builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        q0.a aVar = q0.f62976a;
        r0 r0Var = new r0(0, 1, null);
        builder.invoke(r0Var);
        return r0Var.build();
    }

    @m80.k
    public static final q0 b() {
        return q0.f62976a.b();
    }

    @m80.k
    public static final q0 c(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        return new u0(name, a00.g0.l(value));
    }

    @m80.k
    public static final q0 d(@m80.k String name, @m80.k List<String> values) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        return new u0(name, values);
    }

    @m80.k
    public static final q0 e(@m80.k Pair<String, ? extends List<String>>... pairs) {
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        return new s0(a00.l1.B0(a00.q.t(pairs)));
    }
}
