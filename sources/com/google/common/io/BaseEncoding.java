package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
import po.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@q
/* loaded from: classes7.dex */
public abstract class BaseEncoding {

    /* renamed from: a, reason: collision with root package name */
    public static final BaseEncoding f34248a = new h("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b, reason: collision with root package name */
    public static final BaseEncoding f34249b = new h("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c, reason: collision with root package name */
    public static final BaseEncoding f34250c = new j("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d, reason: collision with root package name */
    public static final BaseEncoding f34251d = new j("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e, reason: collision with root package name */
    public static final BaseEncoding f34252e = new g("base16()", "0123456789ABCDEF");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DecodingException extends IOException {
        public DecodingException(String message) {
            super(message);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends po.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ po.i f34253a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BaseEncoding f34254b;

        public a(final BaseEncoding this$0, final po.i val$encodedSink) {
            this.f34253a = val$encodedSink;
            this.f34254b = this$0;
        }

        @Override // po.e
        public OutputStream c() throws IOException {
            return this.f34254b.p(this.f34253a.b());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends po.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ po.j f34255a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BaseEncoding f34256b;

        public b(final BaseEncoding this$0, final po.j val$encodedSource) {
            this.f34255a = val$encodedSource;
            this.f34256b = this$0;
        }

        @Override // po.f
        public InputStream m() throws IOException {
            return this.f34256b.k(this.f34255a.m());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends Writer {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Appendable f34263a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Writer f34264b;

        public e(final Appendable val$separatingAppendable, final Writer val$delegate) {
            this.f34263a = val$separatingAppendable;
            this.f34264b = val$delegate;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f34264b.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.f34264b.flush();
        }

        @Override // java.io.Writer
        public void write(int c11) throws IOException {
            this.f34263a.append((char) c11);
        }

        @Override // java.io.Writer
        public void write(char[] chars, int off, int len) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final String f34265a;

        /* renamed from: b, reason: collision with root package name */
        public final char[] f34266b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34267c;

        /* renamed from: d, reason: collision with root package name */
        public final int f34268d;

        /* renamed from: e, reason: collision with root package name */
        public final int f34269e;

        /* renamed from: f, reason: collision with root package name */
        public final int f34270f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f34271g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean[] f34272h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f34273i;

        public f(String name, char[] chars) {
            this(name, chars, c(chars), false);
        }

        public static byte[] c(char[] chars) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i11 = 0; i11 < chars.length; i11++) {
                char c11 = chars[i11];
                boolean z11 = true;
                Preconditions.checkArgument(c11 < 128, "Non-ASCII character: %s", c11);
                if (bArr[c11] != -1) {
                    z11 = false;
                }
                Preconditions.checkArgument(z11, "Duplicate character: %s", c11);
                bArr[c11] = (byte) i11;
            }
            return bArr;
        }

        public boolean b(char ch2) {
            return ch2 <= 127 && this.f34271g[ch2] != -1;
        }

        public int d(char ch2) throws DecodingException {
            if (ch2 > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(ch2));
            }
            byte b11 = this.f34271g[ch2];
            if (b11 != -1) {
                return b11;
            }
            if (ch2 <= ' ' || ch2 == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(ch2));
            }
            throw new DecodingException("Unrecognized character: " + ch2);
        }

        public char e(int bits) {
            return this.f34266b[bits];
        }

        public boolean equals(@CheckForNull Object other) {
            if (other instanceof f) {
                f fVar = (f) other;
                if (this.f34273i == fVar.f34273i && Arrays.equals(this.f34266b, fVar.f34266b)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f() {
            for (char c11 : this.f34266b) {
                if (ho.c.c(c11)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean g() {
            for (char c11 : this.f34266b) {
                if (ho.c.d(c11)) {
                    return true;
                }
            }
            return false;
        }

        public f h() {
            if (this.f34273i) {
                return this;
            }
            byte[] bArr = this.f34271g;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            int i11 = 65;
            while (true) {
                if (i11 > 90) {
                    return new f(this.f34265a + ".ignoreCase()", this.f34266b, copyOf, true);
                }
                int i12 = i11 | 32;
                byte[] bArr2 = this.f34271g;
                byte b11 = bArr2[i11];
                byte b12 = bArr2[i12];
                if (b11 == -1) {
                    copyOf[i11] = b12;
                } else {
                    Preconditions.checkState(b12 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i11, (char) i12);
                    copyOf[i12] = b11;
                }
                i11++;
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.f34266b) + (this.f34273i ? 1231 : 1237);
        }

        public boolean i(int index) {
            return this.f34272h[index % this.f34269e];
        }

        public f j() {
            if (!g()) {
                return this;
            }
            Preconditions.checkState(!f(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f34266b.length];
            int i11 = 0;
            while (true) {
                char[] cArr2 = this.f34266b;
                if (i11 >= cArr2.length) {
                    break;
                }
                cArr[i11] = ho.c.e(cArr2[i11]);
                i11++;
            }
            f fVar = new f(this.f34265a + ".lowerCase()", cArr);
            return this.f34273i ? fVar.h() : fVar;
        }

        public boolean k(char c11) {
            byte[] bArr = this.f34271g;
            return c11 < bArr.length && bArr[c11] != -1;
        }

        public f l() {
            if (!f()) {
                return this;
            }
            Preconditions.checkState(!g(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f34266b.length];
            int i11 = 0;
            while (true) {
                char[] cArr2 = this.f34266b;
                if (i11 >= cArr2.length) {
                    break;
                }
                cArr[i11] = ho.c.h(cArr2[i11]);
                i11++;
            }
            f fVar = new f(this.f34265a + ".upperCase()", cArr);
            return this.f34273i ? fVar.h() : fVar;
        }

        public String toString() {
            return this.f34265a;
        }

        public f(String name, char[] chars, byte[] decodabet, boolean ignoreCase) {
            this.f34265a = (String) Preconditions.checkNotNull(name);
            this.f34266b = (char[]) Preconditions.checkNotNull(chars);
            try {
                int p11 = com.google.common.math.f.p(chars.length, RoundingMode.UNNECESSARY);
                this.f34268d = p11;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(p11);
                int i11 = 1 << (3 - numberOfTrailingZeros);
                this.f34269e = i11;
                this.f34270f = p11 >> numberOfTrailingZeros;
                this.f34267c = chars.length - 1;
                this.f34271g = decodabet;
                boolean[] zArr = new boolean[i11];
                for (int i12 = 0; i12 < this.f34270f; i12++) {
                    zArr[com.google.common.math.f.g(i12 * 8, this.f34268d, RoundingMode.CEILING)] = true;
                }
                this.f34272h = zArr;
                this.f34273i = ignoreCase;
            } catch (ArithmeticException e11) {
                throw new IllegalArgumentException("Illegal alphabet length " + chars.length, e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends j {

        /* renamed from: k, reason: collision with root package name */
        public final char[] f34274k;

        public g(String name, String alphabetChars) {
            this(new f(name, alphabetChars.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.j
        public BaseEncoding E(f alphabet, @CheckForNull Character paddingChar) {
            return new g(alphabet);
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        public int i(byte[] target, CharSequence chars) throws DecodingException {
            Preconditions.checkNotNull(target);
            if (chars.length() % 2 == 1) {
                throw new DecodingException("Invalid input length " + chars.length());
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < chars.length()) {
                target[i12] = (byte) ((this.f34278f.d(chars.charAt(i11)) << 4) | this.f34278f.d(chars.charAt(i11 + 1)));
                i11 += 2;
                i12++;
            }
            return i12;
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        public void n(Appendable target, byte[] bytes, int off, int len) throws IOException {
            Preconditions.checkNotNull(target);
            Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            for (int i11 = 0; i11 < len; i11++) {
                int i12 = bytes[off + i11] & 255;
                target.append(this.f34274k[i12]);
                target.append(this.f34274k[i12 | 256]);
            }
        }

        public g(f alphabet) {
            super(alphabet, null);
            this.f34274k = new char[512];
            Preconditions.checkArgument(alphabet.f34266b.length == 16);
            for (int i11 = 0; i11 < 256; i11++) {
                this.f34274k[i11] = alphabet.e(i11 >>> 4);
                this.f34274k[i11 | 256] = alphabet.e(i11 & 15);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends j {
        public h(String name, String alphabetChars, @CheckForNull Character paddingChar) {
            this(new f(name, alphabetChars.toCharArray()), paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding.j
        public BaseEncoding E(f alphabet, @CheckForNull Character paddingChar) {
            return new h(alphabet, paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        public int i(byte[] target, CharSequence chars) throws DecodingException {
            Preconditions.checkNotNull(target);
            CharSequence z11 = z(chars);
            if (!this.f34278f.i(z11.length())) {
                throw new DecodingException("Invalid input length " + z11.length());
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < z11.length()) {
                int i13 = i11 + 2;
                int d11 = (this.f34278f.d(z11.charAt(i11)) << 18) | (this.f34278f.d(z11.charAt(i11 + 1)) << 12);
                int i14 = i12 + 1;
                target[i12] = (byte) (d11 >>> 16);
                if (i13 < z11.length()) {
                    int i15 = i11 + 3;
                    int d12 = d11 | (this.f34278f.d(z11.charAt(i13)) << 6);
                    int i16 = i12 + 2;
                    target[i14] = (byte) ((d12 >>> 8) & 255);
                    if (i15 < z11.length()) {
                        i11 += 4;
                        i12 += 3;
                        target[i16] = (byte) ((d12 | this.f34278f.d(z11.charAt(i15))) & 255);
                    } else {
                        i12 = i16;
                        i11 = i15;
                    }
                } else {
                    i12 = i14;
                    i11 = i13;
                }
            }
            return i12;
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        public void n(Appendable target, byte[] bytes, int off, int len) throws IOException {
            Preconditions.checkNotNull(target);
            int i11 = off + len;
            Preconditions.checkPositionIndexes(off, i11, bytes.length);
            while (len >= 3) {
                int i12 = off + 2;
                int i13 = ((bytes[off + 1] & 255) << 8) | ((bytes[off] & 255) << 16);
                off += 3;
                int i14 = i13 | (bytes[i12] & 255);
                target.append(this.f34278f.e(i14 >>> 18));
                target.append(this.f34278f.e((i14 >>> 12) & 63));
                target.append(this.f34278f.e((i14 >>> 6) & 63));
                target.append(this.f34278f.e(i14 & 63));
                len -= 3;
            }
            if (off < i11) {
                D(target, bytes, off, i11 - off);
            }
        }

        public h(f alphabet, @CheckForNull Character paddingChar) {
            super(alphabet, paddingChar);
            Preconditions.checkArgument(alphabet.f34266b.length == 64);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends BaseEncoding {

        /* renamed from: f, reason: collision with root package name */
        public final BaseEncoding f34275f;

        /* renamed from: g, reason: collision with root package name */
        public final String f34276g;

        /* renamed from: h, reason: collision with root package name */
        public final int f34277h;

        public i(BaseEncoding delegate, String separator, int afterEveryChars) {
            this.f34275f = (BaseEncoding) Preconditions.checkNotNull(delegate);
            this.f34276g = (String) Preconditions.checkNotNull(separator);
            this.f34277h = afterEveryChars;
            Preconditions.checkArgument(afterEveryChars > 0, "Cannot add a separator after every %s chars", afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding A() {
            return this.f34275f.A().C(this.f34276g, this.f34277h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding B(char padChar) {
            return this.f34275f.B(padChar).C(this.f34276g, this.f34277h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding C(String separator, int afterEveryChars) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean f(CharSequence chars) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < chars.length(); i11++) {
                char charAt = chars.charAt(i11);
                if (this.f34276g.indexOf(charAt) < 0) {
                    sb2.append(charAt);
                }
            }
            return this.f34275f.f(sb2);
        }

        @Override // com.google.common.io.BaseEncoding
        public int i(byte[] target, CharSequence chars) throws DecodingException {
            StringBuilder sb2 = new StringBuilder(chars.length());
            for (int i11 = 0; i11 < chars.length(); i11++) {
                char charAt = chars.charAt(i11);
                if (this.f34276g.indexOf(charAt) < 0) {
                    sb2.append(charAt);
                }
            }
            return this.f34275f.i(target, sb2);
        }

        @Override // com.google.common.io.BaseEncoding
        @go.d
        @go.c
        public InputStream k(Reader reader) {
            return this.f34275f.k(BaseEncoding.s(reader, this.f34276g));
        }

        @Override // com.google.common.io.BaseEncoding
        public void n(Appendable target, byte[] bytes, int off, int len) throws IOException {
            this.f34275f.n(BaseEncoding.x(target, this.f34276g, this.f34277h), bytes, off, len);
        }

        @Override // com.google.common.io.BaseEncoding
        @go.d
        @go.c
        public OutputStream p(Writer output) {
            return this.f34275f.p(BaseEncoding.y(output, this.f34276g, this.f34277h));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding r() {
            return this.f34275f.r().C(this.f34276g, this.f34277h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding t() {
            return this.f34275f.t().C(this.f34276g, this.f34277h);
        }

        public String toString() {
            return this.f34275f + ".withSeparator(\"" + this.f34276g + "\", " + this.f34277h + pn.j.f81007d;
        }

        @Override // com.google.common.io.BaseEncoding
        public int u(int chars) {
            return this.f34275f.u(chars);
        }

        @Override // com.google.common.io.BaseEncoding
        public int v(int bytes) {
            int v11 = this.f34275f.v(bytes);
            return v11 + (this.f34276g.length() * com.google.common.math.f.g(Math.max(0, v11 - 1), this.f34277h, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding w() {
            return this.f34275f.w().C(this.f34276g, this.f34277h);
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence z(CharSequence chars) {
            return this.f34275f.z(chars);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j extends BaseEncoding {

        /* renamed from: f, reason: collision with root package name */
        public final f f34278f;

        /* renamed from: g, reason: collision with root package name */
        @CheckForNull
        public final Character f34279g;

        /* renamed from: h, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public volatile BaseEncoding f34280h;

        /* renamed from: i, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public volatile BaseEncoding f34281i;

        /* renamed from: j, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public volatile BaseEncoding f34282j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends OutputStream {

            /* renamed from: a, reason: collision with root package name */
            public int f34283a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f34284b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f34285c = 0;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Writer f34286d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f34287e;

            public a(final j this$0, final Writer val$out) {
                this.f34286d = val$out;
                this.f34287e = this$0;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i11 = this.f34284b;
                if (i11 > 0) {
                    int i12 = this.f34283a;
                    f fVar = this.f34287e.f34278f;
                    this.f34286d.write(fVar.e((i12 << (fVar.f34268d - i11)) & fVar.f34267c));
                    this.f34285c++;
                    if (this.f34287e.f34279g != null) {
                        while (true) {
                            int i13 = this.f34285c;
                            j jVar = this.f34287e;
                            if (i13 % jVar.f34278f.f34269e == 0) {
                                break;
                            }
                            this.f34286d.write(jVar.f34279g.charValue());
                            this.f34285c++;
                        }
                    }
                }
                this.f34286d.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.f34286d.flush();
            }

            @Override // java.io.OutputStream
            public void write(int b11) throws IOException {
                this.f34283a = (b11 & 255) | (this.f34283a << 8);
                this.f34284b += 8;
                while (true) {
                    int i11 = this.f34284b;
                    f fVar = this.f34287e.f34278f;
                    int i12 = fVar.f34268d;
                    if (i11 < i12) {
                        return;
                    }
                    this.f34286d.write(fVar.e((this.f34283a >> (i11 - i12)) & fVar.f34267c));
                    this.f34285c++;
                    this.f34284b -= this.f34287e.f34278f.f34268d;
                }
            }
        }

        public j(String name, String alphabetChars, @CheckForNull Character paddingChar) {
            this(new f(name, alphabetChars.toCharArray()), paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding A() {
            BaseEncoding baseEncoding = this.f34280h;
            if (baseEncoding == null) {
                f l11 = this.f34278f.l();
                baseEncoding = l11 == this.f34278f ? this : E(l11, this.f34279g);
                this.f34280h = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding B(char padChar) {
            Character ch2;
            return (8 % this.f34278f.f34268d == 0 || ((ch2 = this.f34279g) != null && ch2.charValue() == padChar)) ? this : E(this.f34278f, Character.valueOf(padChar));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding C(String separator, int afterEveryChars) {
            for (int i11 = 0; i11 < separator.length(); i11++) {
                Preconditions.checkArgument(!this.f34278f.k(separator.charAt(i11)), "Separator (%s) cannot contain alphabet characters", separator);
            }
            Character ch2 = this.f34279g;
            if (ch2 != null) {
                Preconditions.checkArgument(separator.indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", separator);
            }
            return new i(this, separator, afterEveryChars);
        }

        public void D(Appendable target, byte[] bytes, int off, int len) throws IOException {
            Preconditions.checkNotNull(target);
            Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i11 = 0;
            Preconditions.checkArgument(len <= this.f34278f.f34270f);
            long j11 = 0;
            for (int i12 = 0; i12 < len; i12++) {
                j11 = (j11 | (bytes[off + i12] & 255)) << 8;
            }
            int i13 = ((len + 1) * 8) - this.f34278f.f34268d;
            while (i11 < len * 8) {
                f fVar = this.f34278f;
                target.append(fVar.e(((int) (j11 >>> (i13 - i11))) & fVar.f34267c));
                i11 += this.f34278f.f34268d;
            }
            if (this.f34279g != null) {
                while (i11 < this.f34278f.f34270f * 8) {
                    target.append(this.f34279g.charValue());
                    i11 += this.f34278f.f34268d;
                }
            }
        }

        public BaseEncoding E(f alphabet, @CheckForNull Character paddingChar) {
            return new j(alphabet, paddingChar);
        }

        public boolean equals(@CheckForNull Object other) {
            if (other instanceof j) {
                j jVar = (j) other;
                if (this.f34278f.equals(jVar.f34278f) && Objects.equals(this.f34279g, jVar.f34279g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean f(CharSequence chars) {
            Preconditions.checkNotNull(chars);
            CharSequence z11 = z(chars);
            if (!this.f34278f.i(z11.length())) {
                return false;
            }
            for (int i11 = 0; i11 < z11.length(); i11++) {
                if (!this.f34278f.b(z11.charAt(i11))) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.f34278f.hashCode() ^ Objects.hashCode(this.f34279g);
        }

        @Override // com.google.common.io.BaseEncoding
        public int i(byte[] target, CharSequence chars) throws DecodingException {
            f fVar;
            Preconditions.checkNotNull(target);
            CharSequence z11 = z(chars);
            if (!this.f34278f.i(z11.length())) {
                throw new DecodingException("Invalid input length " + z11.length());
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < z11.length()) {
                long j11 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    fVar = this.f34278f;
                    if (i13 >= fVar.f34269e) {
                        break;
                    }
                    j11 <<= fVar.f34268d;
                    if (i11 + i13 < z11.length()) {
                        j11 |= this.f34278f.d(z11.charAt(i14 + i11));
                        i14++;
                    }
                    i13++;
                }
                int i15 = fVar.f34270f;
                int i16 = (i15 * 8) - (i14 * fVar.f34268d);
                int i17 = (i15 - 1) * 8;
                while (i17 >= i16) {
                    target[i12] = (byte) ((j11 >>> i17) & 255);
                    i17 -= 8;
                    i12++;
                }
                i11 += this.f34278f.f34269e;
            }
            return i12;
        }

        @Override // com.google.common.io.BaseEncoding
        @go.d
        @go.c
        public InputStream k(Reader reader) {
            Preconditions.checkNotNull(reader);
            return new b(this, reader);
        }

        @Override // com.google.common.io.BaseEncoding
        public void n(Appendable target, byte[] bytes, int off, int len) throws IOException {
            Preconditions.checkNotNull(target);
            Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i11 = 0;
            while (i11 < len) {
                D(target, bytes, off + i11, Math.min(this.f34278f.f34270f, len - i11));
                i11 += this.f34278f.f34270f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        @go.d
        @go.c
        public OutputStream p(Writer out) {
            Preconditions.checkNotNull(out);
            return new a(this, out);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding r() {
            BaseEncoding baseEncoding = this.f34282j;
            if (baseEncoding == null) {
                f h11 = this.f34278f.h();
                baseEncoding = h11 == this.f34278f ? this : E(h11, this.f34279g);
                this.f34282j = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding t() {
            BaseEncoding baseEncoding = this.f34281i;
            if (baseEncoding == null) {
                f j11 = this.f34278f.j();
                baseEncoding = j11 == this.f34278f ? this : E(j11, this.f34279g);
                this.f34281i = baseEncoding;
            }
            return baseEncoding;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f34278f);
            if (8 % this.f34278f.f34268d != 0) {
                if (this.f34279g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f34279g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        public int u(int chars) {
            return (int) (((this.f34278f.f34268d * chars) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        public int v(int bytes) {
            f fVar = this.f34278f;
            return fVar.f34269e * com.google.common.math.f.g(bytes, fVar.f34270f, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding w() {
            return this.f34279g == null ? this : E(this.f34278f, null);
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence z(CharSequence chars) {
            Preconditions.checkNotNull(chars);
            Character ch2 = this.f34279g;
            if (ch2 == null) {
                return chars;
            }
            char charValue = ch2.charValue();
            int length = chars.length() - 1;
            while (length >= 0 && chars.charAt(length) == charValue) {
                length--;
            }
            return chars.subSequence(0, length + 1);
        }

        public j(f alphabet, @CheckForNull Character paddingChar) {
            this.f34278f = (f) Preconditions.checkNotNull(alphabet);
            Preconditions.checkArgument(paddingChar == null || !alphabet.k(paddingChar.charValue()), "Padding character %s was already in alphabet", paddingChar);
            this.f34279g = paddingChar;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends InputStream {

            /* renamed from: a, reason: collision with root package name */
            public int f34288a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f34289b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f34290c = 0;

            /* renamed from: d, reason: collision with root package name */
            public boolean f34291d = false;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Reader f34292e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ j f34293f;

            public b(final j this$0, final Reader val$reader) {
                this.f34292e = val$reader;
                this.f34293f = this$0;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f34292e.close();
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
            
                throw new com.google.common.io.BaseEncoding.DecodingException("Padding cannot start at index " + r4.f34290c);
             */
            @Override // java.io.InputStream
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int read() throws java.io.IOException {
                /*
                    r4 = this;
                L0:
                    java.io.Reader r0 = r4.f34292e
                    int r0 = r0.read()
                    r1 = -1
                    if (r0 != r1) goto L34
                    boolean r0 = r4.f34291d
                    if (r0 != 0) goto L33
                    com.google.common.io.BaseEncoding$j r0 = r4.f34293f
                    com.google.common.io.BaseEncoding$f r0 = r0.f34278f
                    int r2 = r4.f34290c
                    boolean r0 = r0.i(r2)
                    if (r0 == 0) goto L1a
                    goto L33
                L1a:
                    com.google.common.io.BaseEncoding$DecodingException r0 = new com.google.common.io.BaseEncoding$DecodingException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Invalid input length "
                    r1.append(r2)
                    int r2 = r4.f34290c
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L33:
                    return r1
                L34:
                    int r1 = r4.f34290c
                    r2 = 1
                    int r1 = r1 + r2
                    r4.f34290c = r1
                    char r0 = (char) r0
                    com.google.common.io.BaseEncoding$j r1 = r4.f34293f
                    java.lang.Character r1 = r1.f34279g
                    if (r1 == 0) goto L78
                    char r1 = r1.charValue()
                    if (r1 != r0) goto L78
                    boolean r0 = r4.f34291d
                    if (r0 != 0) goto L75
                    int r0 = r4.f34290c
                    if (r0 == r2) goto L5c
                    com.google.common.io.BaseEncoding$j r1 = r4.f34293f
                    com.google.common.io.BaseEncoding$f r1 = r1.f34278f
                    int r0 = r0 + (-1)
                    boolean r0 = r1.i(r0)
                    if (r0 == 0) goto L5c
                    goto L75
                L5c:
                    com.google.common.io.BaseEncoding$DecodingException r0 = new com.google.common.io.BaseEncoding$DecodingException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Padding cannot start at index "
                    r1.append(r2)
                    int r2 = r4.f34290c
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L75:
                    r4.f34291d = r2
                    goto L0
                L78:
                    boolean r1 = r4.f34291d
                    if (r1 != 0) goto La4
                    int r1 = r4.f34288a
                    com.google.common.io.BaseEncoding$j r2 = r4.f34293f
                    com.google.common.io.BaseEncoding$f r2 = r2.f34278f
                    int r3 = r2.f34268d
                    int r1 = r1 << r3
                    r4.f34288a = r1
                    int r0 = r2.d(r0)
                    r0 = r0 | r1
                    r4.f34288a = r0
                    int r1 = r4.f34289b
                    com.google.common.io.BaseEncoding$j r2 = r4.f34293f
                    com.google.common.io.BaseEncoding$f r2 = r2.f34278f
                    int r2 = r2.f34268d
                    int r1 = r1 + r2
                    r4.f34289b = r1
                    r2 = 8
                    if (r1 < r2) goto L0
                    int r1 = r1 - r2
                    r4.f34289b = r1
                    int r0 = r0 >> r1
                    r0 = r0 & 255(0xff, float:3.57E-43)
                    return r0
                La4:
                    com.google.common.io.BaseEncoding$DecodingException r1 = new com.google.common.io.BaseEncoding$DecodingException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Expected padding character but found '"
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = "' at index "
                    r2.append(r0)
                    int r0 = r4.f34290c
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.j.b.read():int");
            }

            @Override // java.io.InputStream
            public int read(byte[] buf, int off, int len) throws IOException {
                int i11 = len + off;
                Preconditions.checkPositionIndexes(off, i11, buf.length);
                int i12 = off;
                while (i12 < i11) {
                    int read = read();
                    if (read == -1) {
                        int i13 = i12 - off;
                        if (i13 == 0) {
                            return -1;
                        }
                        return i13;
                    }
                    buf[i12] = (byte) read;
                    i12++;
                }
                return i12 - off;
            }
        }
    }

    public static BaseEncoding a() {
        return f34252e;
    }

    public static BaseEncoding b() {
        return f34250c;
    }

    public static BaseEncoding c() {
        return f34251d;
    }

    public static BaseEncoding d() {
        return f34248a;
    }

    public static BaseEncoding e() {
        return f34249b;
    }

    public static byte[] q(byte[] result, int length) {
        if (length == result.length) {
            return result;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(result, 0, bArr, 0, length);
        return bArr;
    }

    @go.d
    @go.c
    public static Reader s(Reader delegate, String toIgnore) {
        Preconditions.checkNotNull(delegate);
        Preconditions.checkNotNull(toIgnore);
        return new c(delegate, toIgnore);
    }

    public static Appendable x(Appendable delegate, String separator, int afterEveryChars) {
        Preconditions.checkNotNull(delegate);
        Preconditions.checkNotNull(separator);
        Preconditions.checkArgument(afterEveryChars > 0);
        return new d(afterEveryChars, delegate, separator);
    }

    @go.d
    @go.c
    public static Writer y(Writer delegate, String separator, int afterEveryChars) {
        return new e(x(delegate, separator, afterEveryChars), delegate);
    }

    public abstract BaseEncoding A();

    public abstract BaseEncoding B(char padChar);

    public abstract BaseEncoding C(String separator, int n11);

    public abstract boolean f(CharSequence chars);

    public final byte[] g(CharSequence chars) {
        try {
            return h(chars);
        } catch (DecodingException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final byte[] h(CharSequence chars) throws DecodingException {
        CharSequence z11 = z(chars);
        byte[] bArr = new byte[u(z11.length())];
        return q(bArr, i(bArr, z11));
    }

    public abstract int i(byte[] target, CharSequence chars) throws DecodingException;

    @go.d
    @go.c
    public final po.f j(po.j encodedSource) {
        Preconditions.checkNotNull(encodedSource);
        return new b(this, encodedSource);
    }

    @go.d
    @go.c
    public abstract InputStream k(Reader reader);

    public String l(byte[] bytes) {
        return m(bytes, 0, bytes.length);
    }

    public final String m(byte[] bytes, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        StringBuilder sb2 = new StringBuilder(v(len));
        try {
            n(sb2, bytes, off, len);
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public abstract void n(Appendable target, byte[] bytes, int off, int len) throws IOException;

    @go.d
    @go.c
    public final po.e o(po.i encodedSink) {
        Preconditions.checkNotNull(encodedSink);
        return new a(this, encodedSink);
    }

    @go.d
    @go.c
    public abstract OutputStream p(Writer writer);

    public abstract BaseEncoding r();

    public abstract BaseEncoding t();

    public abstract int u(int chars);

    public abstract int v(int bytes);

    public abstract BaseEncoding w();

    public CharSequence z(CharSequence chars) {
        return (CharSequence) Preconditions.checkNotNull(chars);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends Reader {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Reader f34257a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f34258b;

        public c(final Reader val$delegate, final String val$toIgnore) {
            this.f34257a = val$delegate;
            this.f34258b = val$toIgnore;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f34257a.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int read;
            do {
                read = this.f34257a.read();
                if (read == -1) {
                    break;
                }
            } while (this.f34258b.indexOf((char) read) >= 0);
            return read;
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        public int f34259a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34260b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Appendable f34261c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f34262d;

        public d(final int val$afterEveryChars, final Appendable val$delegate, final String val$separator) {
            this.f34260b = val$afterEveryChars;
            this.f34261c = val$delegate;
            this.f34262d = val$separator;
            this.f34259a = val$afterEveryChars;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c11) throws IOException {
            if (this.f34259a == 0) {
                this.f34261c.append(this.f34262d);
                this.f34259a = this.f34260b;
            }
            this.f34261c.append(c11);
            this.f34259a--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@CheckForNull CharSequence chars, int off, int len) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(@CheckForNull CharSequence chars) {
            throw new UnsupportedOperationException();
        }
    }
}
