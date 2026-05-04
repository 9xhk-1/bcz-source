package a3;

import com.badlogic.gdx.utils.JsonValue;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d1 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final DataOutputStream f1489a;

    /* renamed from: b, reason: collision with root package name */
    public a f1490b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1491c;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a> f1492d = new com.badlogic.gdx.utils.a<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1493a;

        public a(boolean z11) throws IOException {
            this.f1493a = z11;
            d1.this.f1489a.writeByte(z11 ? 91 : 123);
        }

        public void a() throws IOException {
            d1.this.f1489a.writeByte(this.f1493a ? 93 : 125);
        }
    }

    public d1(OutputStream outputStream) {
        this.f1489a = (DataOutputStream) (outputStream instanceof DataOutputStream ? outputStream : new DataOutputStream(outputStream));
    }

    public d1 A0(long j11) throws IOException {
        e();
        this.f1489a.writeByte(76);
        this.f1489a.writeLong(j11);
        return this;
    }

    public d1 C(String str, byte b11) throws IOException {
        return f(str).v0(b11);
    }

    public d1 C0(JsonValue jsonValue) throws IOException {
        if (jsonValue.k0()) {
            String str = jsonValue.f13155e;
            if (str != null) {
                k(str);
            } else {
                j();
            }
            for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
                C0(jsonValue2);
            }
            q();
            return this;
        }
        if (jsonValue.c0()) {
            String str2 = jsonValue.f13155e;
            if (str2 != null) {
                c(str2);
            } else {
                a();
            }
            for (JsonValue jsonValue3 = jsonValue.f13156f; jsonValue3 != null; jsonValue3 = jsonValue3.f13158h) {
                C0(jsonValue3);
            }
            q();
            return this;
        }
        if (jsonValue.d0()) {
            String str3 = jsonValue.f13155e;
            if (str3 != null) {
                f(str3);
            }
            G0(jsonValue.d());
            return this;
        }
        if (jsonValue.e0()) {
            String str4 = jsonValue.f13155e;
            if (str4 != null) {
                f(str4);
            }
            x0(jsonValue.l());
            return this;
        }
        if (jsonValue.g0()) {
            String str5 = jsonValue.f13155e;
            if (str5 != null) {
                f(str5);
            }
            A0(jsonValue.r());
            return this;
        }
        if (jsonValue.l0()) {
            String str6 = jsonValue.f13155e;
            if (str6 != null) {
                f(str6);
            }
            E0(jsonValue.v());
            return this;
        }
        if (!jsonValue.h0()) {
            throw new IOException("Unhandled JsonValue type");
        }
        String str7 = jsonValue.f13155e;
        if (str7 != null) {
            f(str7);
        }
        s0();
        return this;
    }

    public d1 D0(Object obj) throws IOException {
        if (obj == null) {
            return s0();
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return obj instanceof Byte ? v0(number.byteValue()) : obj instanceof Short ? F0(number.shortValue()) : obj instanceof Integer ? z0(number.intValue()) : obj instanceof Long ? A0(number.longValue()) : obj instanceof Float ? y0(number.floatValue()) : obj instanceof Double ? x0(number.doubleValue()) : this;
        }
        if (obj instanceof Character) {
            return w0(((Character) obj).charValue());
        }
        if (obj instanceof CharSequence) {
            return E0(obj.toString());
        }
        throw new IOException("Unknown object type.");
    }

    public d1 E(String str, char c11) throws IOException {
        return f(str).w0(c11);
    }

    public d1 E0(String str) throws IOException {
        e();
        byte[] bytes = str.getBytes("UTF-8");
        this.f1489a.writeByte(83);
        if (bytes.length <= 127) {
            this.f1489a.writeByte(105);
            this.f1489a.writeByte(bytes.length);
        } else if (bytes.length <= 32767) {
            this.f1489a.writeByte(73);
            this.f1489a.writeShort(bytes.length);
        } else {
            this.f1489a.writeByte(108);
            this.f1489a.writeInt(bytes.length);
        }
        this.f1489a.write(bytes);
        return this;
    }

    public d1 F0(short s11) throws IOException {
        e();
        this.f1489a.writeByte(73);
        this.f1489a.writeShort(s11);
        return this;
    }

    public d1 G0(boolean z11) throws IOException {
        e();
        this.f1489a.writeByte(z11 ? 84 : 70);
        return this;
    }

    public d1 H(String str, double d11) throws IOException {
        return f(str).x0(d11);
    }

    public d1 H0(byte[] bArr) throws IOException {
        a();
        this.f1489a.writeByte(36);
        this.f1489a.writeByte(105);
        this.f1489a.writeByte(35);
        z0(bArr.length);
        for (byte b11 : bArr) {
            this.f1489a.writeByte(b11);
        }
        r(true);
        return this;
    }

    public d1 I(String str, float f11) throws IOException {
        return f(str).y0(f11);
    }

    public d1 K0(char[] cArr) throws IOException {
        a();
        this.f1489a.writeByte(36);
        this.f1489a.writeByte(67);
        this.f1489a.writeByte(35);
        z0(cArr.length);
        for (char c11 : cArr) {
            this.f1489a.writeChar(c11);
        }
        r(true);
        return this;
    }

    public d1 L(String str, int i11) throws IOException {
        return f(str).z0(i11);
    }

    public d1 L0(double[] dArr) throws IOException {
        a();
        this.f1489a.writeByte(36);
        this.f1489a.writeByte(68);
        this.f1489a.writeByte(35);
        z0(dArr.length);
        for (double d11 : dArr) {
            this.f1489a.writeDouble(d11);
        }
        r(true);
        return this;
    }

    public d1 N0(float[] fArr) throws IOException {
        a();
        this.f1489a.writeByte(36);
        this.f1489a.writeByte(100);
        this.f1489a.writeByte(35);
        z0(fArr.length);
        for (float f11 : fArr) {
            this.f1489a.writeFloat(f11);
        }
        r(true);
        return this;
    }

    public d1 P0(int[] iArr) throws IOException {
        a();
        this.f1489a.writeByte(36);
        this.f1489a.writeByte(108);
        this.f1489a.writeByte(35);
        z0(iArr.length);
        for (int i11 : iArr) {
            this.f1489a.writeInt(i11);
        }
        r(true);
        return this;
    }

    public d1 Q0(long[] jArr) throws IOException {
        a();
        this.f1489a.writeByte(36);
        this.f1489a.writeByte(76);
        this.f1489a.writeByte(35);
        z0(jArr.length);
        for (long j11 : jArr) {
            this.f1489a.writeLong(j11);
        }
        r(true);
        return this;
    }

    public d1 R0(String[] strArr) throws IOException {
        a();
        this.f1489a.writeByte(36);
        this.f1489a.writeByte(83);
        this.f1489a.writeByte(35);
        z0(strArr.length);
        for (String str : strArr) {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= 127) {
                this.f1489a.writeByte(105);
                this.f1489a.writeByte(bytes.length);
            } else if (bytes.length <= 32767) {
                this.f1489a.writeByte(73);
                this.f1489a.writeShort(bytes.length);
            } else {
                this.f1489a.writeByte(108);
                this.f1489a.writeInt(bytes.length);
            }
            this.f1489a.write(bytes);
        }
        r(true);
        return this;
    }

    public d1 S(String str, long j11) throws IOException {
        return f(str).A0(j11);
    }

    public d1 U(String str, String str2) throws IOException {
        return f(str).E0(str2);
    }

    public d1 V(String str, short s11) throws IOException {
        return f(str).F0(s11);
    }

    public d1 W0(short[] sArr) throws IOException {
        a();
        this.f1489a.writeByte(36);
        this.f1489a.writeByte(73);
        this.f1489a.writeByte(35);
        z0(sArr.length);
        for (short s11 : sArr) {
            this.f1489a.writeShort(s11);
        }
        r(true);
        return this;
    }

    public d1 Y0(boolean[] zArr) throws IOException {
        a();
        for (boolean z11 : zArr) {
            this.f1489a.writeByte(z11 ? 84 : 70);
        }
        q();
        return this;
    }

    public d1 Z(String str, boolean z11) throws IOException {
        return f(str).G0(z11);
    }

    public d1 a() throws IOException {
        a aVar = this.f1490b;
        if (aVar != null && !aVar.f1493a) {
            if (!this.f1491c) {
                throw new IllegalStateException("Name must be set.");
            }
            this.f1491c = false;
        }
        com.badlogic.gdx.utils.a<a> aVar2 = this.f1492d;
        a aVar3 = new a(true);
        this.f1490b = aVar3;
        aVar2.a(aVar3);
        return this;
    }

    public d1 a0(String str, byte[] bArr) throws IOException {
        return f(str).H0(bArr);
    }

    public d1 c(String str) throws IOException {
        f(str).a();
        return this;
    }

    public d1 c0(String str, char[] cArr) throws IOException {
        return f(str).K0(cArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.f1492d.f13179b > 0) {
            q();
        }
        this.f1489a.close();
    }

    public d1 d0(String str, double[] dArr) throws IOException {
        return f(str).L0(dArr);
    }

    public final void e() {
        a aVar = this.f1490b;
        if (aVar == null || aVar.f1493a) {
            return;
        }
        if (!this.f1491c) {
            throw new IllegalStateException("Name must be set.");
        }
        this.f1491c = false;
    }

    public d1 f(String str) throws IOException {
        a aVar = this.f1490b;
        if (aVar == null || aVar.f1493a) {
            throw new IllegalStateException("Current item must be an object.");
        }
        byte[] bytes = str.getBytes("UTF-8");
        if (bytes.length <= 127) {
            this.f1489a.writeByte(105);
            this.f1489a.writeByte(bytes.length);
        } else if (bytes.length <= 32767) {
            this.f1489a.writeByte(73);
            this.f1489a.writeShort(bytes.length);
        } else {
            this.f1489a.writeByte(108);
            this.f1489a.writeInt(bytes.length);
        }
        this.f1489a.write(bytes);
        this.f1491c = true;
        return this;
    }

    public d1 f0(String str, float[] fArr) throws IOException {
        return f(str).N0(fArr);
    }

    public void flush() throws IOException {
        this.f1489a.flush();
    }

    public d1 h0(String str, int[] iArr) throws IOException {
        return f(str).P0(iArr);
    }

    public d1 i0(String str, long[] jArr) throws IOException {
        return f(str).Q0(jArr);
    }

    public d1 j() throws IOException {
        a aVar = this.f1490b;
        if (aVar != null && !aVar.f1493a) {
            if (!this.f1491c) {
                throw new IllegalStateException("Name must be set.");
            }
            this.f1491c = false;
        }
        com.badlogic.gdx.utils.a<a> aVar2 = this.f1492d;
        a aVar3 = new a(false);
        this.f1490b = aVar3;
        aVar2.a(aVar3);
        return this;
    }

    public d1 k(String str) throws IOException {
        f(str).j();
        return this;
    }

    public d1 k0(String str, String[] strArr) throws IOException {
        return f(str).R0(strArr);
    }

    public d1 m0(String str, short[] sArr) throws IOException {
        return f(str).W0(sArr);
    }

    public d1 o0(String str, boolean[] zArr) throws IOException {
        return f(str).Y0(zArr);
    }

    public d1 q() throws IOException {
        return r(false);
    }

    public d1 r(boolean z11) throws IOException {
        if (this.f1491c) {
            throw new IllegalStateException("Expected an object, array, or value since a name was set.");
        }
        if (z11) {
            this.f1492d.pop();
        } else {
            this.f1492d.pop().a();
        }
        com.badlogic.gdx.utils.a<a> aVar = this.f1492d;
        this.f1490b = aVar.f13179b == 0 ? null : aVar.peek();
        return this;
    }

    public d1 s0() throws IOException {
        e();
        this.f1489a.writeByte(90);
        return this;
    }

    public d1 v0(byte b11) throws IOException {
        e();
        this.f1489a.writeByte(105);
        this.f1489a.writeByte(b11);
        return this;
    }

    public d1 w(String str) throws IOException {
        return f(str).s0();
    }

    public d1 w0(char c11) throws IOException {
        e();
        this.f1489a.writeByte(73);
        this.f1489a.writeChar(c11);
        return this;
    }

    public d1 x0(double d11) throws IOException {
        e();
        this.f1489a.writeByte(68);
        this.f1489a.writeDouble(d11);
        return this;
    }

    public d1 y0(float f11) throws IOException {
        e();
        this.f1489a.writeByte(100);
        this.f1489a.writeFloat(f11);
        return this;
    }

    public d1 z0(int i11) throws IOException {
        e();
        this.f1489a.writeByte(108);
        this.f1489a.writeInt(i11);
        return this;
    }
}
