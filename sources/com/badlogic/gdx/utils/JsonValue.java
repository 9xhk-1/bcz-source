package com.badlogic.gdx.utils;

import a3.d0;
import a3.y0;
import com.badlogic.gdx.utils.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class JsonValue implements Iterable<JsonValue> {

    /* renamed from: a, reason: collision with root package name */
    public ValueType f13151a;

    /* renamed from: b, reason: collision with root package name */
    public String f13152b;

    /* renamed from: c, reason: collision with root package name */
    public double f13153c;

    /* renamed from: d, reason: collision with root package name */
    public long f13154d;

    /* renamed from: e, reason: collision with root package name */
    public String f13155e;

    /* renamed from: f, reason: collision with root package name */
    public JsonValue f13156f;

    /* renamed from: g, reason: collision with root package name */
    public JsonValue f13157g;

    /* renamed from: h, reason: collision with root package name */
    public JsonValue f13158h;

    /* renamed from: i, reason: collision with root package name */
    public JsonValue f13159i;

    /* renamed from: j, reason: collision with root package name */
    public int f13160j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ValueType {
        object,
        array,
        stringValue,
        doubleValue,
        longValue,
        booleanValue,
        nullValue
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13161a;

        static {
            int[] iArr = new int[ValueType.values().length];
            f13161a = iArr;
            try {
                iArr[ValueType.stringValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13161a[ValueType.doubleValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13161a[ValueType.longValue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13161a[ValueType.booleanValue.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13161a[ValueType.nullValue.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public JsonWriter.OutputType f13165a;

        /* renamed from: b, reason: collision with root package name */
        public int f13166b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13167c;
    }

    public JsonValue(ValueType valueType) {
        this.f13151a = valueType;
    }

    public static void Z(int i11, y0 y0Var) {
        for (int i12 = 0; i12 < i11; i12++) {
            y0Var.append('\t');
        }
    }

    public static void b0(int i11, Writer writer) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            writer.append('\t');
        }
    }

    public static boolean f0(JsonValue jsonValue) {
        for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
            if (jsonValue2.k0() || jsonValue2.c0()) {
                return false;
            }
        }
        return true;
    }

    public static boolean j0(JsonValue jsonValue) {
        for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
            if (!jsonValue2.i0()) {
                return false;
            }
        }
        return true;
    }

    public boolean A(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.d();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    @d0
    public JsonValue A0(int i11) {
        JsonValue y11 = y(i11);
        if (y11 == null) {
            return null;
        }
        JsonValue jsonValue = y11.f13159i;
        if (jsonValue == null) {
            JsonValue jsonValue2 = y11.f13158h;
            this.f13156f = jsonValue2;
            if (jsonValue2 != null) {
                jsonValue2.f13159i = null;
            }
        } else {
            jsonValue.f13158h = y11.f13158h;
            JsonValue jsonValue3 = y11.f13158h;
            if (jsonValue3 != null) {
                jsonValue3.f13159i = jsonValue;
            }
        }
        this.f13160j--;
        return y11;
    }

    public boolean B(String str, boolean z11) {
        JsonValue z12 = z(str);
        return (z12 == null || !z12.m0() || z12.h0()) ? z11 : z12.d();
    }

    @d0
    public JsonValue B0(String str) {
        JsonValue z11 = z(str);
        if (z11 == null) {
            return null;
        }
        JsonValue jsonValue = z11.f13159i;
        if (jsonValue == null) {
            JsonValue jsonValue2 = z11.f13158h;
            this.f13156f = jsonValue2;
            if (jsonValue2 != null) {
                jsonValue2.f13159i = null;
            }
        } else {
            jsonValue.f13158h = z11.f13158h;
            JsonValue jsonValue3 = z11.f13158h;
            if (jsonValue3 != null) {
                jsonValue3.f13159i = jsonValue;
            }
        }
        this.f13160j--;
        return z11;
    }

    public byte C(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11.g();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f13155e);
    }

    public void C0() {
        JsonValue jsonValue = this.f13157g;
        if (jsonValue == null) {
            throw new IllegalStateException();
        }
        JsonValue jsonValue2 = this.f13159i;
        if (jsonValue2 == null) {
            JsonValue jsonValue3 = this.f13158h;
            jsonValue.f13156f = jsonValue3;
            if (jsonValue3 != null) {
                jsonValue3.f13159i = null;
            }
        } else {
            jsonValue2.f13158h = this.f13158h;
            JsonValue jsonValue4 = this.f13158h;
            if (jsonValue4 != null) {
                jsonValue4.f13159i = jsonValue2;
            }
        }
        jsonValue.f13160j--;
    }

    public byte D(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.g();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public JsonValue D0(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11;
        }
        throw new IllegalArgumentException("Child not found with index: " + i11);
    }

    public byte E(String str, byte b11) {
        JsonValue z11 = z(str);
        return (z11 == null || !z11.m0() || z11.h0()) ? b11 : z11.g();
    }

    public char F(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11.j();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f13155e);
    }

    public JsonValue F0(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11;
        }
        throw new IllegalArgumentException("Child not found with name: " + str);
    }

    public char G(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.j();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public void G0(double d11, @d0 String str) {
        this.f13153c = d11;
        this.f13154d = (long) d11;
        this.f13152b = str;
        this.f13151a = ValueType.doubleValue;
    }

    public char H(String str, char c11) {
        JsonValue z11 = z(str);
        return (z11 == null || !z11.m0() || z11.h0()) ? c11 : z11.j();
    }

    public void H0(long j11, @d0 String str) {
        this.f13154d = j11;
        this.f13153c = j11;
        this.f13152b = str;
        this.f13151a = ValueType.longValue;
    }

    @d0
    public JsonValue I(String str) {
        JsonValue z11 = z(str);
        if (z11 == null) {
            return null;
        }
        return z11.f13156f;
    }

    public void I0(@d0 String str) {
        this.f13152b = str;
        this.f13151a = str == null ? ValueType.nullValue : ValueType.stringValue;
    }

    public double J(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.l();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public void J0(boolean z11) {
        this.f13154d = z11 ? 1L : 0L;
        this.f13151a = ValueType.booleanValue;
    }

    public double K(String str, double d11) {
        JsonValue z11 = z(str);
        return (z11 == null || !z11.m0() || z11.h0()) ? d11 : z11.l();
    }

    public void K0(@d0 String str) {
        this.f13155e = str;
    }

    public float L(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.n();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public void L0(@d0 JsonValue jsonValue) {
        this.f13158h = jsonValue;
    }

    public float M(String str, float f11) {
        JsonValue z11 = z(str);
        return (z11 == null || !z11.m0() || z11.h0()) ? f11 : z11.n();
    }

    public void M0(@d0 JsonValue jsonValue) {
        this.f13159i = jsonValue;
    }

    public int N(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.p();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public void N0(ValueType valueType) {
        if (valueType == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        this.f13151a = valueType;
    }

    public int O(String str, int i11) {
        JsonValue z11 = z(str);
        return (z11 == null || !z11.m0() || z11.h0()) ? i11 : z11.p();
    }

    public String O0(JsonWriter.OutputType outputType) {
        if (m0()) {
            return v();
        }
        y0 y0Var = new y0(512);
        p0(this, y0Var, outputType);
        return y0Var.toString();
    }

    public long P(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.r();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public String P0() {
        JsonValue jsonValue = this.f13157g;
        String str = okhttp3.i.f77289p;
        if (jsonValue == null) {
            ValueType valueType = this.f13151a;
            return valueType == ValueType.array ? okhttp3.i.f77289p : valueType == ValueType.object ? "{}" : "";
        }
        if (jsonValue.f13151a == ValueType.array) {
            JsonValue jsonValue2 = jsonValue.f13156f;
            int i11 = 0;
            while (true) {
                if (jsonValue2 == null) {
                    break;
                }
                if (jsonValue2 == this) {
                    str = "[" + i11 + "]";
                    break;
                }
                jsonValue2 = jsonValue2.f13158h;
                i11++;
            }
        } else if (this.f13155e.indexOf(46) != -1) {
            str = ".\"" + this.f13155e.replace("\"", "\\\"") + "\"";
        } else {
            str = '.' + this.f13155e;
        }
        return this.f13157g.P0() + str;
    }

    public long Q(String str, long j11) {
        JsonValue z11 = z(str);
        return (z11 == null || !z11.m0() || z11.h0()) ? j11 : z11.r();
    }

    public ValueType Q0() {
        return this.f13151a;
    }

    public short R(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11.t();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f13155e);
    }

    public short S(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.t();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public short T(String str, short s11) {
        JsonValue z11 = z(str);
        return (z11 == null || !z11.m0() || z11.h0()) ? s11 : z11.t();
    }

    public String U(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11.v();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f13155e);
    }

    public String V(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.v();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public String W(String str, @d0 String str2) {
        JsonValue z11 = z(str);
        return (z11 == null || !z11.m0() || z11.h0()) ? str2 : z11.v();
    }

    public boolean X(String str) {
        return z(str) != null;
    }

    public boolean Y(String str) {
        return I(str) != null;
    }

    public void a(JsonValue jsonValue) {
        if (this.f13151a == ValueType.object && jsonValue.f13155e == null) {
            throw new IllegalStateException("An object child requires a name: " + jsonValue);
        }
        jsonValue.f13157g = this;
        jsonValue.f13158h = null;
        this.f13160j++;
        JsonValue jsonValue2 = this.f13156f;
        if (jsonValue2 == null) {
            jsonValue.f13159i = null;
            this.f13156f = jsonValue;
            return;
        }
        while (true) {
            JsonValue jsonValue3 = jsonValue2.f13158h;
            if (jsonValue3 == null) {
                jsonValue2.f13158h = jsonValue;
                jsonValue.f13159i = jsonValue2;
                return;
            }
            jsonValue2 = jsonValue3;
        }
    }

    public void b(String str, JsonValue jsonValue) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        jsonValue.f13155e = str;
        a(jsonValue);
    }

    public boolean c0() {
        return this.f13151a == ValueType.array;
    }

    public boolean d() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        if (i11 == 1) {
            return this.f13152b.equalsIgnoreCase(n6.m.f74525c);
        }
        if (i11 == 2) {
            return this.f13153c != 0.0d;
        }
        if (i11 == 3) {
            return this.f13154d != 0;
        }
        if (i11 == 4) {
            return this.f13154d != 0;
        }
        throw new IllegalStateException("Value cannot be converted to boolean: " + this.f13151a);
    }

    public boolean d0() {
        return this.f13151a == ValueType.booleanValue;
    }

    public boolean e0() {
        return this.f13151a == ValueType.doubleValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r1.f13154d != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r1.f13154d == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r1.f13153c == 0.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean[] f() {
        /*
            r11 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r11.f13151a
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.array
            if (r0 != r1) goto L68
            int r0 = r11.f13160j
            boolean[] r0 = new boolean[r0]
            com.badlogic.gdx.utils.JsonValue r1 = r11.f13156f
            r2 = 0
            r3 = r2
        Le:
            if (r1 == 0) goto L67
            int[] r4 = com.badlogic.gdx.utils.JsonValue.a.f13161a
            com.badlogic.gdx.utils.JsonValue$ValueType r5 = r1.f13151a
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L5b
            r6 = 2
            if (r4 == r6) goto L52
            r6 = 3
            r7 = 0
            if (r4 == r6) goto L4b
            r6 = 4
            if (r4 != r6) goto L32
            long r9 = r1.f13154d
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 == 0) goto L30
        L2e:
            r4 = r5
            goto L61
        L30:
            r4 = r2
            goto L61
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Value cannot be converted to boolean: "
            r2.append(r3)
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r1.f13151a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L4b:
            long r9 = r1.f13154d
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L30
            goto L2e
        L52:
            double r6 = r1.f13153c
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L30
            goto L2e
        L5b:
            java.lang.String r4 = r1.f13152b
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
        L61:
            r0[r3] = r4
            com.badlogic.gdx.utils.JsonValue r1 = r1.f13158h
            int r3 = r3 + r5
            goto Le
        L67:
            return r0
        L68:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value is not an array: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r11.f13151a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.JsonValue.f():boolean[]");
    }

    public byte g() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        if (i11 == 1) {
            return Byte.parseByte(this.f13152b);
        }
        if (i11 == 2) {
            return (byte) this.f13153c;
        }
        if (i11 == 3) {
            return (byte) this.f13154d;
        }
        if (i11 == 4) {
            return this.f13154d != 0 ? (byte) 1 : (byte) 0;
        }
        throw new IllegalStateException("Value cannot be converted to byte: " + this.f13151a);
    }

    public boolean g0() {
        return this.f13151a == ValueType.longValue;
    }

    public boolean getBoolean(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11.d();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f13155e);
    }

    public double getDouble(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11.l();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f13155e);
    }

    public float getFloat(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11.n();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f13155e);
    }

    public int getInt(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11.p();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f13155e);
    }

    public long getLong(int i11) {
        JsonValue y11 = y(i11);
        if (y11 != null) {
            return y11.r();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f13155e);
    }

    public byte[] h() {
        byte parseByte;
        int i11;
        if (this.f13151a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f13151a);
        }
        byte[] bArr = new byte[this.f13160j];
        JsonValue jsonValue = this.f13156f;
        int i12 = 0;
        while (jsonValue != null) {
            int i13 = a.f13161a[jsonValue.f13151a.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    i11 = (int) jsonValue.f13153c;
                } else if (i13 == 3) {
                    i11 = (int) jsonValue.f13154d;
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException("Value cannot be converted to byte: " + jsonValue.f13151a);
                    }
                    parseByte = jsonValue.f13154d != 0 ? (byte) 1 : (byte) 0;
                }
                parseByte = (byte) i11;
            } else {
                parseByte = Byte.parseByte(jsonValue.f13152b);
            }
            bArr[i12] = parseByte;
            jsonValue = jsonValue.f13158h;
            i12++;
        }
        return bArr;
    }

    public boolean h0() {
        return this.f13151a == ValueType.nullValue;
    }

    public boolean i0() {
        ValueType valueType = this.f13151a;
        return valueType == ValueType.doubleValue || valueType == ValueType.longValue;
    }

    public boolean isEmpty() {
        return this.f13160j == 0;
    }

    public char j() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        if (i11 == 1) {
            if (this.f13152b.length() == 0) {
                return (char) 0;
            }
            return this.f13152b.charAt(0);
        }
        if (i11 == 2) {
            return (char) this.f13153c;
        }
        if (i11 == 3) {
            return (char) this.f13154d;
        }
        if (i11 == 4) {
            return this.f13154d != 0 ? (char) 1 : (char) 0;
        }
        throw new IllegalStateException("Value cannot be converted to char: " + this.f13151a);
    }

    public char[] k() {
        char charAt;
        int i11;
        if (this.f13151a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f13151a);
        }
        char[] cArr = new char[this.f13160j];
        JsonValue jsonValue = this.f13156f;
        int i12 = 0;
        while (jsonValue != null) {
            int i13 = a.f13161a[jsonValue.f13151a.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    i11 = (int) jsonValue.f13153c;
                } else if (i13 == 3) {
                    i11 = (int) jsonValue.f13154d;
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException("Value cannot be converted to char: " + jsonValue.f13151a);
                    }
                    if (jsonValue.f13154d != 0) {
                        charAt = 1;
                    }
                    charAt = 0;
                }
                charAt = (char) i11;
            } else {
                if (jsonValue.f13152b.length() != 0) {
                    charAt = jsonValue.f13152b.charAt(0);
                }
                charAt = 0;
            }
            cArr[i12] = charAt;
            jsonValue = jsonValue.f13158h;
            i12++;
        }
        return cArr;
    }

    public boolean k0() {
        return this.f13151a == ValueType.object;
    }

    public double l() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        if (i11 == 1) {
            return Double.parseDouble(this.f13152b);
        }
        if (i11 == 2) {
            return this.f13153c;
        }
        if (i11 == 3) {
            return this.f13154d;
        }
        if (i11 == 4) {
            return this.f13154d != 0 ? 1.0d : 0.0d;
        }
        throw new IllegalStateException("Value cannot be converted to double: " + this.f13151a);
    }

    public boolean l0() {
        return this.f13151a == ValueType.stringValue;
    }

    public double[] m() {
        double parseDouble;
        if (this.f13151a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f13151a);
        }
        double[] dArr = new double[this.f13160j];
        JsonValue jsonValue = this.f13156f;
        int i11 = 0;
        while (jsonValue != null) {
            int i12 = a.f13161a[jsonValue.f13151a.ordinal()];
            if (i12 == 1) {
                parseDouble = Double.parseDouble(jsonValue.f13152b);
            } else if (i12 == 2) {
                parseDouble = jsonValue.f13153c;
            } else if (i12 == 3) {
                parseDouble = jsonValue.f13154d;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("Value cannot be converted to double: " + jsonValue.f13151a);
                }
                parseDouble = jsonValue.f13154d != 0 ? 1.0d : 0.0d;
            }
            dArr[i11] = parseDouble;
            jsonValue = jsonValue.f13158h;
            i11++;
        }
        return dArr;
    }

    public boolean m0() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5;
    }

    public float n() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        if (i11 == 1) {
            return Float.parseFloat(this.f13152b);
        }
        if (i11 == 2) {
            return (float) this.f13153c;
        }
        if (i11 == 3) {
            return this.f13154d;
        }
        if (i11 == 4) {
            return this.f13154d != 0 ? 1.0f : 0.0f;
        }
        throw new IllegalStateException("Value cannot be converted to float: " + this.f13151a);
    }

    @Override // java.lang.Iterable
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public b iterator() {
        return new b();
    }

    public float[] o() {
        float parseFloat;
        if (this.f13151a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f13151a);
        }
        float[] fArr = new float[this.f13160j];
        JsonValue jsonValue = this.f13156f;
        int i11 = 0;
        while (jsonValue != null) {
            int i12 = a.f13161a[jsonValue.f13151a.ordinal()];
            if (i12 == 1) {
                parseFloat = Float.parseFloat(jsonValue.f13152b);
            } else if (i12 == 2) {
                parseFloat = (float) jsonValue.f13153c;
            } else if (i12 == 3) {
                parseFloat = jsonValue.f13154d;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("Value cannot be converted to float: " + jsonValue.f13151a);
                }
                parseFloat = jsonValue.f13154d != 0 ? 1.0f : 0.0f;
            }
            fArr[i11] = parseFloat;
            jsonValue = jsonValue.f13158h;
            i11++;
        }
        return fArr;
    }

    public b o0(String str) {
        JsonValue z11 = z(str);
        if (z11 != null) {
            return z11.iterator();
        }
        b bVar = new b();
        bVar.f13162a = null;
        return bVar;
    }

    public int p() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        if (i11 == 1) {
            return Integer.parseInt(this.f13152b);
        }
        if (i11 == 2) {
            return (int) this.f13153c;
        }
        if (i11 == 3) {
            return (int) this.f13154d;
        }
        if (i11 == 4) {
            return this.f13154d != 0 ? 1 : 0;
        }
        throw new IllegalStateException("Value cannot be converted to int: " + this.f13151a);
    }

    public final void p0(JsonValue jsonValue, y0 y0Var, JsonWriter.OutputType outputType) {
        if (jsonValue.k0()) {
            if (jsonValue.f13156f == null) {
                y0Var.O("{}");
                return;
            }
            y0Var.length();
            y0Var.append(l50.b.f69927i);
            for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
                y0Var.O(outputType.quoteName(jsonValue2.f13155e));
                y0Var.append(':');
                p0(jsonValue2, y0Var, outputType);
                if (jsonValue2.f13158h != null) {
                    y0Var.append(',');
                }
            }
            y0Var.append(l50.b.f69928j);
            return;
        }
        if (jsonValue.c0()) {
            if (jsonValue.f13156f == null) {
                y0Var.O(okhttp3.i.f77289p);
                return;
            }
            y0Var.length();
            y0Var.append('[');
            for (JsonValue jsonValue3 = jsonValue.f13156f; jsonValue3 != null; jsonValue3 = jsonValue3.f13158h) {
                p0(jsonValue3, y0Var, outputType);
                if (jsonValue3.f13158h != null) {
                    y0Var.append(',');
                }
            }
            y0Var.append(l50.b.f69930l);
            return;
        }
        if (jsonValue.l0()) {
            y0Var.O(outputType.quoteValue(jsonValue.v()));
            return;
        }
        if (jsonValue.e0()) {
            double l11 = jsonValue.l();
            double r11 = jsonValue.r();
            if (l11 == r11) {
                l11 = r11;
            }
            y0Var.j(l11);
            return;
        }
        if (jsonValue.g0()) {
            y0Var.G(jsonValue.r());
            return;
        }
        if (!jsonValue.d0()) {
            if (jsonValue.h0()) {
                y0Var.O("null");
                return;
            }
            throw new SerializationException("Unknown object type: " + jsonValue);
        }
        y0Var.Q(jsonValue.d());
    }

    public int[] q() {
        int parseInt;
        if (this.f13151a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f13151a);
        }
        int[] iArr = new int[this.f13160j];
        JsonValue jsonValue = this.f13156f;
        int i11 = 0;
        while (jsonValue != null) {
            int i12 = a.f13161a[jsonValue.f13151a.ordinal()];
            if (i12 == 1) {
                parseInt = Integer.parseInt(jsonValue.f13152b);
            } else if (i12 == 2) {
                parseInt = (int) jsonValue.f13153c;
            } else if (i12 == 3) {
                parseInt = (int) jsonValue.f13154d;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("Value cannot be converted to int: " + jsonValue.f13151a);
                }
                parseInt = jsonValue.f13154d != 0 ? 1 : 0;
            }
            iArr[i11] = parseInt;
            jsonValue = jsonValue.f13158h;
            i11++;
        }
        return iArr;
    }

    @d0
    public String q0() {
        return this.f13155e;
    }

    public long r() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        if (i11 == 1) {
            return Long.parseLong(this.f13152b);
        }
        if (i11 == 2) {
            return (long) this.f13153c;
        }
        if (i11 == 3) {
            return this.f13154d;
        }
        if (i11 == 4) {
            return this.f13154d != 0 ? 1L : 0L;
        }
        throw new IllegalStateException("Value cannot be converted to long: " + this.f13151a);
    }

    @d0
    public JsonValue r0() {
        return this.f13158h;
    }

    public long[] s() {
        long parseLong;
        if (this.f13151a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f13151a);
        }
        long[] jArr = new long[this.f13160j];
        JsonValue jsonValue = this.f13156f;
        int i11 = 0;
        while (jsonValue != null) {
            int i12 = a.f13161a[jsonValue.f13151a.ordinal()];
            if (i12 == 1) {
                parseLong = Long.parseLong(jsonValue.f13152b);
            } else if (i12 == 2) {
                parseLong = (long) jsonValue.f13153c;
            } else if (i12 == 3) {
                parseLong = jsonValue.f13154d;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("Value cannot be converted to long: " + jsonValue.f13151a);
                }
                parseLong = 0;
                if (jsonValue.f13154d != 0) {
                    parseLong = 1;
                }
            }
            jArr[i11] = parseLong;
            jsonValue = jsonValue.f13158h;
            i11++;
        }
        return jArr;
    }

    public boolean s0() {
        return this.f13160j > 0;
    }

    @Deprecated
    public int size() {
        return this.f13160j;
    }

    public short t() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        if (i11 == 1) {
            return Short.parseShort(this.f13152b);
        }
        if (i11 == 2) {
            return (short) this.f13153c;
        }
        if (i11 == 3) {
            return (short) this.f13154d;
        }
        if (i11 == 4) {
            return this.f13154d != 0 ? (short) 1 : (short) 0;
        }
        throw new IllegalStateException("Value cannot be converted to short: " + this.f13151a);
    }

    @d0
    public JsonValue t0() {
        return this.f13157g;
    }

    public String toString() {
        String str;
        if (m0()) {
            if (this.f13155e == null) {
                return v();
            }
            return this.f13155e + ": " + v();
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13155e == null) {
            str = "";
        } else {
            str = this.f13155e + ": ";
        }
        sb2.append(str);
        sb2.append(v0(JsonWriter.OutputType.minimal, 0));
        return sb2.toString();
    }

    public short[] u() {
        short parseShort;
        int i11;
        if (this.f13151a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f13151a);
        }
        short[] sArr = new short[this.f13160j];
        JsonValue jsonValue = this.f13156f;
        int i12 = 0;
        while (jsonValue != null) {
            int i13 = a.f13161a[jsonValue.f13151a.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    i11 = (int) jsonValue.f13153c;
                } else if (i13 == 3) {
                    i11 = (int) jsonValue.f13154d;
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException("Value cannot be converted to short: " + jsonValue.f13151a);
                    }
                    parseShort = jsonValue.f13154d != 0 ? (short) 1 : (short) 0;
                }
                parseShort = (short) i11;
            } else {
                parseShort = Short.parseShort(jsonValue.f13152b);
            }
            sArr[i12] = parseShort;
            jsonValue = jsonValue.f13158h;
            i12++;
        }
        return sArr;
    }

    public String u0(c cVar) {
        y0 y0Var = new y0(512);
        w0(this, y0Var, 0, cVar);
        return y0Var.toString();
    }

    @d0
    public String v() {
        int i11 = a.f13161a[this.f13151a.ordinal()];
        if (i11 == 1) {
            return this.f13152b;
        }
        if (i11 == 2) {
            String str = this.f13152b;
            return str != null ? str : Double.toString(this.f13153c);
        }
        if (i11 == 3) {
            String str2 = this.f13152b;
            return str2 != null ? str2 : Long.toString(this.f13154d);
        }
        if (i11 == 4) {
            return this.f13154d != 0 ? n6.m.f74525c : "false";
        }
        if (i11 == 5) {
            return null;
        }
        throw new IllegalStateException("Value cannot be converted to string: " + this.f13151a);
    }

    public String v0(JsonWriter.OutputType outputType, int i11) {
        c cVar = new c();
        cVar.f13165a = outputType;
        cVar.f13166b = i11;
        return u0(cVar);
    }

    public String[] w() {
        String str;
        if (this.f13151a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f13151a);
        }
        String[] strArr = new String[this.f13160j];
        JsonValue jsonValue = this.f13156f;
        int i11 = 0;
        while (jsonValue != null) {
            int i12 = a.f13161a[jsonValue.f13151a.ordinal()];
            if (i12 == 1) {
                str = jsonValue.f13152b;
            } else if (i12 == 2) {
                str = this.f13152b;
                if (str == null) {
                    str = Double.toString(jsonValue.f13153c);
                }
            } else if (i12 == 3) {
                str = this.f13152b;
                if (str == null) {
                    str = Long.toString(jsonValue.f13154d);
                }
            } else if (i12 == 4) {
                str = jsonValue.f13154d != 0 ? n6.m.f74525c : "false";
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException("Value cannot be converted to string: " + jsonValue.f13151a);
                }
                str = null;
            }
            strArr[i11] = str;
            jsonValue = jsonValue.f13158h;
            i11++;
        }
        return strArr;
    }

    public final void w0(JsonValue jsonValue, y0 y0Var, int i11, c cVar) {
        JsonWriter.OutputType outputType = cVar.f13165a;
        if (jsonValue.k0()) {
            if (jsonValue.f13156f == null) {
                y0Var.O("{}");
                return;
            }
            boolean z11 = !f0(jsonValue);
            int length = y0Var.length();
            loop0: while (true) {
                y0Var.O(z11 ? "{\n" : "{ ");
                for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
                    if (z11) {
                        Z(i11, y0Var);
                    }
                    y0Var.O(outputType.quoteName(jsonValue2.f13155e));
                    y0Var.O(": ");
                    w0(jsonValue2, y0Var, i11 + 1, cVar);
                    if ((!z11 || outputType != JsonWriter.OutputType.minimal) && jsonValue2.f13158h != null) {
                        y0Var.append(',');
                    }
                    y0Var.append(z11 ? '\n' : ' ');
                    if (z11 || y0Var.length() - length <= cVar.f13166b) {
                    }
                }
                y0Var.Y0(length);
                z11 = true;
            }
            if (z11) {
                Z(i11 - 1, y0Var);
            }
            y0Var.append(l50.b.f69928j);
            return;
        }
        if (!jsonValue.c0()) {
            if (jsonValue.l0()) {
                y0Var.O(outputType.quoteValue(jsonValue.v()));
                return;
            }
            if (jsonValue.e0()) {
                double l11 = jsonValue.l();
                double r11 = jsonValue.r();
                if (l11 == r11) {
                    l11 = r11;
                }
                y0Var.j(l11);
                return;
            }
            if (jsonValue.g0()) {
                y0Var.G(jsonValue.r());
                return;
            }
            if (jsonValue.d0()) {
                y0Var.Q(jsonValue.d());
                return;
            } else {
                if (jsonValue.h0()) {
                    y0Var.O("null");
                    return;
                }
                throw new SerializationException("Unknown object type: " + jsonValue);
            }
        }
        if (jsonValue.f13156f == null) {
            y0Var.O(okhttp3.i.f77289p);
            return;
        }
        boolean z12 = !f0(jsonValue);
        boolean z13 = cVar.f13167c || !j0(jsonValue);
        int length2 = y0Var.length();
        loop2: while (true) {
            y0Var.O(z12 ? "[\n" : "[ ");
            for (JsonValue jsonValue3 = jsonValue.f13156f; jsonValue3 != null; jsonValue3 = jsonValue3.f13158h) {
                if (z12) {
                    Z(i11, y0Var);
                }
                w0(jsonValue3, y0Var, i11 + 1, cVar);
                if ((!z12 || outputType != JsonWriter.OutputType.minimal) && jsonValue3.f13158h != null) {
                    y0Var.append(',');
                }
                y0Var.append(z12 ? '\n' : ' ');
                if (!z13 || z12 || y0Var.length() - length2 <= cVar.f13166b) {
                }
            }
            y0Var.Y0(length2);
            z12 = true;
        }
        if (z12) {
            Z(i11 - 1, y0Var);
        }
        y0Var.append(l50.b.f69930l);
    }

    @d0
    public JsonValue x() {
        return this.f13156f;
    }

    public final void x0(JsonValue jsonValue, Writer writer, int i11, c cVar) throws IOException {
        JsonWriter.OutputType outputType = cVar.f13165a;
        if (jsonValue.k0()) {
            if (jsonValue.f13156f == null) {
                writer.append("{}");
                return;
            }
            boolean z11 = !f0(jsonValue) || jsonValue.f13160j > 6;
            writer.append((CharSequence) (z11 ? "{\n" : "{ "));
            for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
                if (z11) {
                    b0(i11, writer);
                }
                writer.append((CharSequence) outputType.quoteName(jsonValue2.f13155e));
                writer.append(": ");
                x0(jsonValue2, writer, i11 + 1, cVar);
                if ((!z11 || outputType != JsonWriter.OutputType.minimal) && jsonValue2.f13158h != null) {
                    writer.append(',');
                }
                writer.append(z11 ? '\n' : ' ');
            }
            if (z11) {
                b0(i11 - 1, writer);
            }
            writer.append(l50.b.f69928j);
            return;
        }
        if (jsonValue.c0()) {
            if (jsonValue.f13156f == null) {
                writer.append(okhttp3.i.f77289p);
                return;
            }
            boolean f02 = f0(jsonValue);
            writer.append((CharSequence) (!f02 ? "[\n" : "[ "));
            for (JsonValue jsonValue3 = jsonValue.f13156f; jsonValue3 != null; jsonValue3 = jsonValue3.f13158h) {
                if (!f02) {
                    b0(i11, writer);
                }
                x0(jsonValue3, writer, i11 + 1, cVar);
                if ((f02 || outputType != JsonWriter.OutputType.minimal) && jsonValue3.f13158h != null) {
                    writer.append(',');
                }
                writer.append(!f02 ? '\n' : ' ');
            }
            if (!f02) {
                b0(i11 - 1, writer);
            }
            writer.append(l50.b.f69930l);
            return;
        }
        if (jsonValue.l0()) {
            writer.append((CharSequence) outputType.quoteValue(jsonValue.v()));
            return;
        }
        if (jsonValue.e0()) {
            double l11 = jsonValue.l();
            double r11 = jsonValue.r();
            if (l11 == r11) {
                l11 = r11;
            }
            writer.append((CharSequence) Double.toString(l11));
            return;
        }
        if (jsonValue.g0()) {
            writer.append((CharSequence) Long.toString(jsonValue.r()));
            return;
        }
        if (!jsonValue.d0()) {
            if (jsonValue.h0()) {
                writer.append("null");
                return;
            }
            throw new SerializationException("Unknown object type: " + jsonValue);
        }
        writer.append((CharSequence) Boolean.toString(jsonValue.d()));
    }

    @d0
    public JsonValue y(int i11) {
        JsonValue jsonValue = this.f13156f;
        while (jsonValue != null && i11 > 0) {
            i11--;
            jsonValue = jsonValue.f13158h;
        }
        return jsonValue;
    }

    public void y0(JsonWriter.OutputType outputType, Writer writer) throws IOException {
        c cVar = new c();
        cVar.f13165a = outputType;
        x0(this, writer, 0, cVar);
    }

    @d0
    public JsonValue z(String str) {
        JsonValue jsonValue = this.f13156f;
        while (jsonValue != null) {
            String str2 = jsonValue.f13155e;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                break;
            }
            jsonValue = jsonValue.f13158h;
        }
        return jsonValue;
    }

    @d0
    public JsonValue z0() {
        return this.f13159i;
    }

    public JsonValue(@d0 String str) {
        I0(str);
    }

    public JsonValue(double d11) {
        G0(d11, null);
    }

    public JsonValue(long j11) {
        H0(j11, null);
    }

    public JsonValue(double d11, String str) {
        G0(d11, str);
    }

    public JsonValue(long j11, String str) {
        H0(j11, str);
    }

    public JsonValue(boolean z11) {
        J0(z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Iterator<JsonValue>, Iterable<JsonValue> {

        /* renamed from: a, reason: collision with root package name */
        public JsonValue f13162a;

        /* renamed from: b, reason: collision with root package name */
        public JsonValue f13163b;

        public b() {
            this.f13162a = JsonValue.this.f13156f;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public JsonValue next() {
            JsonValue jsonValue = this.f13162a;
            this.f13163b = jsonValue;
            if (jsonValue == null) {
                throw new NoSuchElementException();
            }
            this.f13162a = jsonValue.f13158h;
            return jsonValue;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13162a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            JsonValue jsonValue = this.f13163b;
            JsonValue jsonValue2 = jsonValue.f13159i;
            if (jsonValue2 == null) {
                JsonValue jsonValue3 = JsonValue.this;
                JsonValue jsonValue4 = jsonValue.f13158h;
                jsonValue3.f13156f = jsonValue4;
                if (jsonValue4 != null) {
                    jsonValue4.f13159i = null;
                }
            } else {
                jsonValue2.f13158h = jsonValue.f13158h;
                JsonValue jsonValue5 = jsonValue.f13158h;
                if (jsonValue5 != null) {
                    jsonValue5.f13159i = jsonValue2;
                }
            }
            JsonValue jsonValue6 = JsonValue.this;
            jsonValue6.f13160j--;
        }

        @Override // java.lang.Iterable
        public Iterator<JsonValue> iterator() {
            return this;
        }
    }
}
