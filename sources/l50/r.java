package l50;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final InputStream f70057a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Charset f70058b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final CharsetDecoder f70059c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ByteBuffer f70060d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70061e;

    /* renamed from: f, reason: collision with root package name */
    public char f70062f;

    public r(@m80.k InputStream inputStream, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(inputStream, "inputStream");
        kotlin.jvm.internal.g0.p(charset, "charset");
        this.f70057a = inputStream;
        this.f70058b = charset;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        kotlin.jvm.internal.g0.o(onUnmappableCharacter, "onUnmappableCharacter(...)");
        this.f70059c = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(k.f70012c.d());
        kotlin.jvm.internal.g0.o(wrap, "wrap(...)");
        this.f70060d = wrap;
        wrap.flip();
    }

    public final int a(char[] cArr, int i11, int i12) {
        CharBuffer wrap = CharBuffer.wrap(cArr, i11, i12);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z11 = false;
        while (true) {
            CoderResult decode = this.f70059c.decode(this.f70060d, wrap, z11);
            if (decode.isUnderflow()) {
                if (z11 || !wrap.hasRemaining()) {
                    break;
                }
                if (b() < 0) {
                    if (wrap.position() == 0 && !this.f70060d.hasRemaining()) {
                        z11 = true;
                        break;
                    }
                    this.f70059c.reset();
                    z11 = true;
                } else {
                    continue;
                }
            } else {
                if (decode.isOverflow()) {
                    wrap.position();
                    break;
                }
                decode.throwException();
            }
        }
        if (z11) {
            this.f70059c.reset();
        }
        if (wrap.position() == 0) {
            return -1;
        }
        return wrap.position();
    }

    public final int b() {
        this.f70060d.compact();
        try {
            int limit = this.f70060d.limit();
            int position = this.f70060d.position();
            int read = this.f70057a.read(this.f70060d.array(), this.f70060d.arrayOffset() + position, position <= limit ? limit - position : 0);
            if (read < 0) {
                return read;
            }
            ByteBuffer byteBuffer = this.f70060d;
            kotlin.jvm.internal.g0.n(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(position + read);
            this.f70060d.flip();
            return this.f70060d.remaining();
        } finally {
            this.f70060d.flip();
        }
    }

    public final int c() {
        if (this.f70061e) {
            this.f70061e = false;
            return this.f70062f;
        }
        char[] cArr = new char[2];
        int d11 = d(cArr, 0, 2);
        if (d11 == -1) {
            return -1;
        }
        if (d11 == 1) {
            return cArr[0];
        }
        if (d11 == 2) {
            this.f70062f = cArr[1];
            this.f70061e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + d11).toString());
    }

    public final int d(@m80.k char[] array, int i11, int i12) {
        kotlin.jvm.internal.g0.p(array, "array");
        int i13 = 0;
        if (i12 == 0) {
            return 0;
        }
        if (i11 < 0 || i11 >= array.length || i12 < 0 || i11 + i12 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i11 + j2.O + i12 + j2.O + array.length).toString());
        }
        if (this.f70061e) {
            array[i11] = this.f70062f;
            i11++;
            i12--;
            this.f70061e = false;
            if (i12 == 0) {
                return 1;
            }
            i13 = 1;
        }
        if (i12 != 1) {
            return a(array, i11, i12) + i13;
        }
        int c11 = c();
        if (c11 != -1) {
            array[i11] = (char) c11;
            return i13 + 1;
        }
        if (i13 == 0) {
            return -1;
        }
        return i13;
    }

    public final void e() {
        k kVar = k.f70012c;
        byte[] array = this.f70060d.array();
        kotlin.jvm.internal.g0.o(array, "array(...)");
        kVar.c(array);
    }
}
