package jz;

import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;
import y40.c0;
import y40.i0;
import y40.x;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nio/ktor/utils/io/core/StringsKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,122:1\n15#2,3:123\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n29#1:123,3\n*E\n"})
/* loaded from: classes8.dex */
public final class s {
    @yz.n(level = DeprecationLevel.WARNING, message = "Use decodeToString instead", replaceWith = @w0(expression = "bytes.decodeToString(offset, offset + length)", imports = {}))
    @m80.k
    public static final String a(@m80.k byte[] bytes, int i11, int i12, @m80.k Charset charset) {
        g0.p(bytes, "bytes");
        g0.p(charset, "charset");
        if (g0.g(charset, u30.d.f91599b)) {
            return f0.W1(bytes, i11, i11 + i12, false, 4, null);
        }
        y40.b bVar = new y40.b();
        h.h(bVar, bytes, i11, i12);
        return g(bVar, charset, 0, 2, null);
    }

    public static /* synthetic */ String b(byte[] bArr, int i11, int i12, Charset charset, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        if ((i13 & 8) != 0) {
            charset = u30.d.f91599b;
        }
        return a(bArr, i11, i12, charset);
    }

    public static final Void c(int i11) {
        throw new EOFException("Not enough input bytes to read " + i11 + " characters.");
    }

    @yz.n(message = "Use readByteArray instead", replaceWith = @w0(expression = "this.readByteArray()", imports = {"kotlinx.io.readByteArray"}))
    @m80.k
    public static final byte[] d(@m80.k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return y40.g0.c(c0Var);
    }

    @yz.n(message = "Use readByteArray instead", replaceWith = @w0(expression = "this.readByteArray(count)", imports = {}))
    @m80.k
    public static final byte[] e(@m80.k c0 c0Var, int i11) {
        g0.p(c0Var, "<this>");
        return y40.g0.d(c0Var, i11);
    }

    @m80.k
    public static final String f(@m80.k c0 c0Var, @m80.k Charset charset, int i11) {
        g0.p(c0Var, "<this>");
        g0.p(charset, "charset");
        return g0.g(charset, u30.d.f91599b) ? i11 == Integer.MAX_VALUE ? i0.j(c0Var) : i0.k(c0Var, Math.min(c0Var.getBuffer().r(), i11)) : iz.b.a(charset.newDecoder(), c0Var, i11);
    }

    public static /* synthetic */ String g(c0 c0Var, Charset charset, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return f(c0Var, charset, i11);
    }

    @yz.n(message = "Use readTextExactCharacters instead.", replaceWith = @w0(expression = "readTextExactCharacters(n, charset)", imports = {}))
    @m80.k
    public static final String h(@m80.k c0 c0Var, @m80.k Charset charset, int i11) {
        g0.p(c0Var, "<this>");
        g0.p(charset, "charset");
        return j(c0Var, i11, charset);
    }

    public static /* synthetic */ String i(c0 c0Var, Charset charset, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return h(c0Var, charset, i11);
    }

    @m80.k
    public static final String j(@m80.k c0 c0Var, int i11, @m80.k Charset charset) {
        g0.p(c0Var, "<this>");
        g0.p(charset, "charset");
        String f11 = f(c0Var, charset, i11);
        if (f11.length() >= i11) {
            return f11;
        }
        c(i11);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ String k(c0 c0Var, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        return j(c0Var, i11, charset);
    }

    @m80.k
    public static final byte[] l(@m80.k String str, @m80.k Charset charset) {
        g0.p(str, "<this>");
        g0.p(charset, "charset");
        return g0.g(charset, u30.d.f91599b) ? f0.Z1(str, 0, 0, true, 3, null) : iz.a.d(charset.newEncoder(), str, 0, str.length());
    }

    public static /* synthetic */ byte[] m(String str, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return l(str, charset);
    }

    public static final void n(@m80.k x xVar, @m80.k CharSequence text, int i11, int i12, @m80.k Charset charset) {
        g0.p(xVar, "<this>");
        g0.p(text, "text");
        g0.p(charset, "charset");
        if (charset == u30.d.f91599b) {
            i0.p(xVar, text.toString(), i11, i12);
        } else {
            iz.b.g(charset.newEncoder(), xVar, text, i11, i12);
        }
    }

    public static final void o(@m80.k x xVar, @m80.k char[] text, int i11, int i12, @m80.k Charset charset) {
        g0.p(xVar, "<this>");
        g0.p(text, "text");
        g0.p(charset, "charset");
        if (charset == u30.d.f91599b) {
            i0.p(xVar, f0.M1(text, i11, i11 + i12), 0, i12 - i11);
        } else {
            iz.b.d(charset.newEncoder(), text, i11, i12, xVar);
        }
    }

    public static /* synthetic */ void p(x xVar, CharSequence charSequence, int i11, int i12, Charset charset, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        if ((i13 & 8) != 0) {
            charset = u30.d.f91599b;
        }
        n(xVar, charSequence, i11, i12, charset);
    }

    public static /* synthetic */ void q(x xVar, char[] cArr, int i11, int i12, Charset charset, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = cArr.length;
        }
        if ((i13 & 8) != 0) {
            charset = u30.d.f91599b;
        }
        o(xVar, cArr, i11, i12, charset);
    }
}
