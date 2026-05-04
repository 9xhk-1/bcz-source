package cp;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import n6.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f46803j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f46804k = new String[128];

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f46805l;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f46806a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f46807b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    public int f46808c = 0;

    /* renamed from: d, reason: collision with root package name */
    public String f46809d;

    /* renamed from: e, reason: collision with root package name */
    public String f46810e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46811f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46812g;

    /* renamed from: h, reason: collision with root package name */
    public String f46813h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f46814i;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f46804k[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f46804k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f46805l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        V(6);
        this.f46810e = ":";
        this.f46814i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f46806a = writer;
    }

    public static boolean C(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    public c E(String str) throws IOException {
        if (str == null) {
            return L();
        }
        x0();
        c();
        this.f46806a.append((CharSequence) str);
        return this;
    }

    public c H(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f46813h != null) {
            throw new IllegalStateException();
        }
        if (this.f46808c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f46813h = str;
        return this;
    }

    public final void I() throws IOException {
        if (this.f46809d == null) {
            return;
        }
        this.f46806a.write(10);
        int i11 = this.f46808c;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f46806a.write(this.f46809d);
        }
    }

    public c L() throws IOException {
        if (this.f46813h != null) {
            if (!this.f46814i) {
                this.f46813h = null;
                return this;
            }
            x0();
        }
        c();
        this.f46806a.write("null");
        return this;
    }

    public final c S(int i11, char c11) throws IOException {
        c();
        V(i11);
        this.f46806a.write(c11);
        return this;
    }

    public final int U() {
        int i11 = this.f46808c;
        if (i11 != 0) {
            return this.f46807b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void V(int i11) {
        int i12 = this.f46808c;
        int[] iArr = this.f46807b;
        if (i12 == iArr.length) {
            this.f46807b = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.f46807b;
        int i13 = this.f46808c;
        this.f46808c = i13 + 1;
        iArr2[i13] = i11;
    }

    public final void Z(int i11) {
        this.f46807b[this.f46808c - 1] = i11;
    }

    public final void a() throws IOException {
        int U = U();
        if (U == 5) {
            this.f46806a.write(44);
        } else if (U != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        I();
        Z(4);
    }

    public final void a0(boolean z11) {
        this.f46812g = z11;
    }

    public final void c() throws IOException {
        int U = U();
        if (U == 1) {
            Z(2);
            I();
            return;
        }
        if (U == 2) {
            this.f46806a.append(',');
            I();
        } else {
            if (U == 4) {
                this.f46806a.append((CharSequence) this.f46810e);
                Z(5);
                return;
            }
            if (U != 6) {
                if (U != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f46811f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            Z(7);
        }
    }

    public final void c0(String str) {
        if (str.length() == 0) {
            this.f46809d = null;
            this.f46810e = ":";
        } else {
            this.f46809d = str;
            this.f46810e = ": ";
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46806a.close();
        int i11 = this.f46808c;
        if (i11 > 1 || (i11 == 1 && this.f46807b[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f46808c = 0;
    }

    public final void d0(boolean z11) {
        this.f46811f = z11;
    }

    public c e() throws IOException {
        x0();
        return S(1, '[');
    }

    public c f() throws IOException {
        x0();
        return S(3, l50.b.f69927i);
    }

    public final void f0(boolean z11) {
        this.f46814i = z11;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f46808c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f46806a.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f46812g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = cp.c.f46805l
            goto L9
        L7:
            java.lang.String[] r0 = cp.c.f46804k
        L9:
            java.io.Writer r1 = r8.f46806a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f46806a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f46806a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f46806a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f46806a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.c.h0(java.lang.String):void");
    }

    public final c i(int i11, int i12, char c11) throws IOException {
        int U = U();
        if (U != i12 && U != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f46813h != null) {
            throw new IllegalStateException("Dangling name: " + this.f46813h);
        }
        this.f46808c--;
        if (U == i12) {
            I();
        }
        this.f46806a.write(c11);
        return this;
    }

    public c i0(double d11) throws IOException {
        x0();
        if (this.f46811f || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
            c();
            this.f46806a.append((CharSequence) Double.toString(d11));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
    }

    public c j() throws IOException {
        return i(1, 2, l50.b.f69930l);
    }

    public c k() throws IOException {
        return i(3, 5, l50.b.f69928j);
    }

    public c k0(float f11) throws IOException {
        x0();
        if (this.f46811f || !(Float.isNaN(f11) || Float.isInfinite(f11))) {
            c();
            this.f46806a.append((CharSequence) Float.toString(f11));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + f11);
    }

    public c m0(long j11) throws IOException {
        x0();
        c();
        this.f46806a.write(Long.toString(j11));
        return this;
    }

    public c o0(Boolean bool) throws IOException {
        if (bool == null) {
            return L();
        }
        x0();
        c();
        this.f46806a.write(bool.booleanValue() ? m.f74525c : "false");
        return this;
    }

    public final boolean q() {
        return this.f46814i;
    }

    public final boolean r() {
        return this.f46812g;
    }

    public c s0(Number number) throws IOException {
        if (number == null) {
            return L();
        }
        x0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!C(cls) && !f46803j.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f46811f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        c();
        this.f46806a.append((CharSequence) obj);
        return this;
    }

    public c v0(String str) throws IOException {
        if (str == null) {
            return L();
        }
        x0();
        c();
        h0(str);
        return this;
    }

    public boolean w() {
        return this.f46811f;
    }

    public c w0(boolean z11) throws IOException {
        x0();
        c();
        this.f46806a.write(z11 ? m.f74525c : "false");
        return this;
    }

    public final void x0() throws IOException {
        if (this.f46813h != null) {
            a();
            h0(this.f46813h);
            this.f46813h = null;
        }
    }
}
