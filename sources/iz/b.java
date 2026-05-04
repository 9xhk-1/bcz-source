package iz;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import y40.c0;
import y40.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoding.kt\nio/ktor/utils/io/charsets/EncodingKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,117:1\n15#2,3:118\n*S KotlinDebug\n*F\n+ 1 Encoding.kt\nio/ktor/utils/io/charsets/EncodingKt\n*L\n47#1:118,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final String a(@k CharsetDecoder charsetDecoder, @k c0 input, int i11) {
        g0.p(charsetDecoder, "<this>");
        g0.p(input, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i11, input.getBuffer().r()));
        a.b(charsetDecoder, input, sb2, i11);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, c0 c0Var, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, c0Var, i11);
    }

    @k
    public static final c0 c(@k CharsetEncoder charsetEncoder, @k CharSequence input, int i11, int i12) {
        g0.p(charsetEncoder, "<this>");
        g0.p(input, "input");
        y40.b bVar = new y40.b();
        g(charsetEncoder, bVar, input, i11, i12);
        return bVar;
    }

    public static final void d(@k CharsetEncoder charsetEncoder, @k char[] input, int i11, int i12, @k x dst) {
        g0.p(charsetEncoder, "<this>");
        g0.p(input, "input");
        g0.p(dst, "dst");
        f(charsetEncoder, input, i11, i12, dst);
    }

    public static /* synthetic */ c0 e(CharsetEncoder charsetEncoder, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i11, i12);
    }

    public static final int f(@k CharsetEncoder charsetEncoder, @k char[] input, int i11, int i12, @k x dst) {
        g0.p(charsetEncoder, "<this>");
        g0.p(input, "input");
        g0.p(dst, "dst");
        int i13 = i12 - i11;
        return a.c(charsetEncoder, new kz.a(input, i11, i13), 0, i13, dst);
    }

    public static final void g(@k CharsetEncoder charsetEncoder, @k x destination, @k CharSequence input, int i11, int i12) {
        g0.p(charsetEncoder, "<this>");
        g0.p(destination, "destination");
        g0.p(input, "input");
        if (i11 >= i12) {
            return;
        }
        do {
            int c11 = a.c(charsetEncoder, input, i11, i12, destination);
            if (c11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            i11 += c11;
        } while (i11 < i12);
    }
}
