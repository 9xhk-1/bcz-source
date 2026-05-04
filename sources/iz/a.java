package iz;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import jz.j;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import u30.d;
import y40.c0;
import y40.i0;
import y40.x;
import z40.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCharsetJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharsetJVM.kt\nio/ktor/utils/io/charsets/CharsetJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    public static final int b(@k CharsetDecoder charsetDecoder, @k c0 input, @k Appendable dst, int i11) {
        g0.p(charsetDecoder, "<this>");
        g0.p(input, "input");
        g0.p(dst, "dst");
        if (g0.g(j(charsetDecoder), d.f91599b)) {
            String j11 = i0.j(input);
            dst.append(j11);
            return j11.length();
        }
        long j12 = j.j(input);
        dst.append(f.c(y40.f.e(input), j(charsetDecoder)));
        return (int) j12;
    }

    public static final int c(@k CharsetEncoder charsetEncoder, @k CharSequence input, int i11, int i12, @k x dst) {
        g0.p(charsetEncoder, "<this>");
        g0.p(input, "input");
        g0.p(dst, "dst");
        byte[] d11 = d(charsetEncoder, input, i11, i12);
        x.p8(dst, d11, 0, 0, 6, null);
        return d11.length;
    }

    @k
    public static final byte[] d(@k CharsetEncoder charsetEncoder, @k CharSequence input, int i11, int i12) {
        g0.p(charsetEncoder, "<this>");
        g0.p(input, "input");
        if (!(input instanceof String)) {
            return h(charsetEncoder, input, i11, i12);
        }
        if (i11 == 0) {
            String str = (String) input;
            if (i12 == str.length()) {
                byte[] bytes = str.getBytes(charsetEncoder.charset());
                g0.o(bytes, "getBytes(...)");
                return bytes;
            }
        }
        String substring = ((String) input).substring(i11, i12);
        g0.o(substring, "substring(...)");
        g0.n(substring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
        g0.o(bytes2, "getBytes(...)");
        return bytes2;
    }

    public static /* synthetic */ byte[] e(CharsetEncoder charsetEncoder, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        return d(charsetEncoder, charSequence, i11, i12);
    }

    @k
    public static final byte[] f(@k CharsetEncoder charsetEncoder, @k CharSequence input, int i11, int i12) {
        g0.p(charsetEncoder, "<this>");
        g0.p(input, "input");
        throw new IllegalStateException("Not needed on jvm");
    }

    public static /* synthetic */ byte[] g(CharsetEncoder charsetEncoder, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        return f(charsetEncoder, charSequence, i11, i12);
    }

    public static final byte[] h(CharsetEncoder charsetEncoder, CharSequence charSequence, int i11, int i12) {
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i11, i12));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[encode.remaining()];
        encode.get(bArr2);
        return bArr2;
    }

    @k
    public static final Charset i(@k d dVar, @k String name) {
        g0.p(dVar, "<this>");
        g0.p(name, "name");
        Charset forName = Charset.forName(name);
        g0.o(forName, "forName(...)");
        return forName;
    }

    @k
    public static final Charset j(@k CharsetDecoder charsetDecoder) {
        g0.p(charsetDecoder, "<this>");
        Charset charset = charsetDecoder.charset();
        g0.m(charset);
        return charset;
    }

    @k
    public static final Charset k(@k CharsetEncoder charsetEncoder) {
        g0.p(charsetEncoder, "<this>");
        Charset charset = charsetEncoder.charset();
        g0.o(charset, "charset(...)");
        return charset;
    }

    @k
    public static final String l(@k Charset charset) {
        g0.p(charset, "<this>");
        String name = charset.name();
        g0.o(name, "name(...)");
        return name;
    }

    public static final boolean m(@k d dVar, @k String name) {
        g0.p(dVar, "<this>");
        g0.p(name, "name");
        return Charset.isSupported(name);
    }

    public static /* synthetic */ void a() {
    }
}
