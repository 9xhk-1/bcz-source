package yz;

import java.util.List;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "TuplesKt")
/* loaded from: classes8.dex */
public final class h1 {
    @m80.k
    public static final <A, B> Pair<A, B> a(A a11, B b11) {
        return new Pair<>(a11, b11);
    }

    @m80.k
    public static final <T> List<T> b(@m80.k Pair<? extends T, ? extends T> pair) {
        kotlin.jvm.internal.g0.p(pair, "<this>");
        return a00.h0.Q(pair.getFirst(), pair.getSecond());
    }

    @m80.k
    public static final <T> List<T> c(@m80.k Triple<? extends T, ? extends T, ? extends T> triple) {
        kotlin.jvm.internal.g0.p(triple, "<this>");
        return a00.h0.Q(triple.getFirst(), triple.getSecond(), triple.getThird());
    }
}
