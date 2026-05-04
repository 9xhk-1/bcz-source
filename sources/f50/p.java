package f50;

import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p {
    @h
    @m80.k
    public static final <T> e<T> a(@m80.k j50.b<T> bVar, @m80.k i50.d decoder, @m80.l String str) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        e<T> i11 = bVar.i(decoder, str);
        if (i11 != null) {
            return i11;
        }
        j50.c.b(str, bVar.k());
        throw new KotlinNothingValueException();
    }

    @h
    @m80.k
    public static final <T> b0<T> b(@m80.k j50.b<T> bVar, @m80.k i50.h encoder, @m80.k T value) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        b0<T> j11 = bVar.j(encoder, value);
        if (j11 != null) {
            return j11;
        }
        j50.c.a(kotlin.jvm.internal.o0.d(value.getClass()), bVar.k());
        throw new KotlinNothingValueException();
    }
}
