package ws;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import okio.ByteString;
import u30.f0;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCompactProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompactProtocol.kt\ncom/microsoft/thrifty/protocol/CompactProtocol\n*L\n1#1,618:1\n376#1,8:619\n376#1,8:627\n*S KotlinDebug\n*F\n+ 1 CompactProtocol.kt\ncom/microsoft/thrifty/protocol/CompactProtocol\n*L\n362#1:619,8\n372#1:627,8\n*E\n"})
/* loaded from: classes7.dex */
public final class c extends ws.a {

    /* renamed from: j, reason: collision with root package name */
    public static final byte f96765j = -126;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f96766k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f96767l = 31;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f96768m = -32;

    /* renamed from: n, reason: collision with root package name */
    public static final byte f96769n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static final int f96770o = 5;

    /* renamed from: b, reason: collision with root package name */
    public int f96773b;

    /* renamed from: c, reason: collision with root package name */
    public byte f96774c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final byte[] f96775d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final C1296c f96776e;

    /* renamed from: f, reason: collision with root package name */
    public short f96777f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final C1296c f96778g;

    /* renamed from: h, reason: collision with root package name */
    public short f96779h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f96764i = new b(null);

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final k f96771p = new k("");

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final d f96772q = new d("", (byte) 0, 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final C1295a f96780a = new C1295a(null);

        /* renamed from: b, reason: collision with root package name */
        public static final byte f96781b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final byte f96782c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final byte f96783d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final byte f96784e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final byte f96785f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final byte f96786g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final byte f96787h = 7;

        /* renamed from: i, reason: collision with root package name */
        public static final byte f96788i = 8;

        /* renamed from: j, reason: collision with root package name */
        public static final byte f96789j = 9;

        /* renamed from: k, reason: collision with root package name */
        public static final byte f96790k = 10;

        /* renamed from: l, reason: collision with root package name */
        public static final byte f96791l = 11;

        /* renamed from: m, reason: collision with root package name */
        public static final byte f96792m = 12;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ws.c$a$a, reason: collision with other inner class name */
        public static final class C1295a {
            public /* synthetic */ C1295a(v vVar) {
                this();
            }

            public final byte a(byte b11) {
                if (b11 == 0) {
                    return (byte) 0;
                }
                if (b11 == 1 || b11 == 2) {
                    return (byte) 2;
                }
                if (b11 == 3) {
                    return (byte) 3;
                }
                if (b11 == 4) {
                    return (byte) 6;
                }
                if (b11 == 5) {
                    return (byte) 8;
                }
                if (b11 == 6) {
                    return (byte) 10;
                }
                if (b11 == 7) {
                    return (byte) 4;
                }
                if (b11 == 8) {
                    return (byte) 11;
                }
                if (b11 == 9) {
                    return (byte) 15;
                }
                if (b11 == 10) {
                    return (byte) 14;
                }
                if (b11 == 11) {
                    return (byte) 13;
                }
                if (b11 == 12) {
                    return (byte) 12;
                }
                throw new IllegalArgumentException("Unknown compact type ID: " + ((int) b11));
            }

            public final byte b(byte b11) {
                if (b11 == 0) {
                    return (byte) 0;
                }
                if (b11 == 1) {
                    throw new IllegalArgumentException("Unexpected VOID type");
                }
                if (b11 == 2) {
                    return (byte) 1;
                }
                if (b11 == 3) {
                    return (byte) 3;
                }
                if (b11 == 4) {
                    return (byte) 7;
                }
                if (b11 == 6) {
                    return (byte) 4;
                }
                if (b11 == 8) {
                    return (byte) 5;
                }
                if (b11 == 10) {
                    return (byte) 6;
                }
                if (b11 == 11) {
                    return (byte) 8;
                }
                if (b11 == 12) {
                    return (byte) 12;
                }
                if (b11 == 13) {
                    return (byte) 11;
                }
                if (b11 == 14) {
                    return (byte) 10;
                }
                if (b11 == 15) {
                    return (byte) 9;
                }
                throw new IllegalArgumentException("Unknown TType ID: " + ((int) b11));
            }

            public C1295a() {
            }
        }

        public a() {
            throw new AssertionError("no instances");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public final int e(int i11) {
            return (i11 >> 31) ^ (i11 << 1);
        }

        public final long f(long j11) {
            return (j11 >> 63) ^ (j11 << 1);
        }

        public final int g(int i11) {
            return (-(i11 & 1)) ^ (i11 >>> 1);
        }

        public final long h(long j11) {
            return (-(j11 & 1)) ^ (j11 >>> 1);
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ws.c$c, reason: collision with other inner class name */
    public static final class C1296c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public short[] f96793a = new short[16];

        /* renamed from: b, reason: collision with root package name */
        public int f96794b = -1;

        public final short a() {
            short[] sArr = this.f96793a;
            int i11 = this.f96794b;
            this.f96794b = i11 - 1;
            return sArr[i11];
        }

        public final void b(short s11) {
            int i11 = this.f96794b + 1;
            short[] sArr = this.f96793a;
            if (i11 == sArr.length) {
                short[] copyOf = Arrays.copyOf(sArr, sArr.length << 1);
                g0.o(copyOf, "copyOf(...)");
                this.f96793a = copyOf;
            }
            short[] sArr2 = this.f96793a;
            int i12 = this.f96794b + 1;
            this.f96794b = i12;
            sArr2[i12] = s11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.k zs.e transport) {
        super(transport);
        g0.p(transport, "transport");
        this.f96773b = -1;
        this.f96774c = (byte) -1;
        this.f96775d = new byte[16];
        this.f96776e = new C1296c();
        this.f96778g = new C1296c();
    }

    private final void e(byte[] bArr, int i11) throws IOException {
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f96754a.read(bArr, i12, i11);
            if (read == -1) {
                throw new EOFException("Unexpected end of input");
            }
            i11 -= read;
            i12 += read;
        }
    }

    @Override // ws.i
    public void E6() throws IOException {
        this.f96777f = this.f96776e.a();
    }

    @Override // ws.i
    public void H7(byte b11, int i11) throws IOException {
        w(b11, i11);
    }

    @Override // ws.i
    public void I4() throws IOException {
        this.f96779h = this.f96778g.a();
    }

    @Override // ws.i
    @m80.k
    public ByteString K3() throws IOException {
        int f11 = f();
        if (f11 == 0) {
            return ByteString.EMPTY;
        }
        byte[] bArr = new byte[f11];
        e(bArr, f11);
        return ByteString.a.p(ByteString.Companion, bArr, 0, 0, 3, null);
    }

    @Override // ws.i
    public void L2(short s11) throws IOException {
        q(f96764i.e(s11));
    }

    @Override // ws.i
    @m80.k
    public g O() throws IOException {
        int f11 = f();
        byte readByte = f11 == 0 ? (byte) 0 : readByte();
        a.C1295a c1295a = a.f96780a;
        return new g(c1295a.a((byte) ((readByte >> 4) & 15)), c1295a.a((byte) (readByte & 15)), f11);
    }

    @Override // ws.i
    public void Q6(@m80.k String fieldName, int i11, byte b11) throws IOException {
        g0.p(fieldName, "fieldName");
        if (b11 != 2) {
            k(i11, a.f96780a.b(b11));
        } else {
            if (this.f96773b != -1) {
                throw new ProtocolException("Nested invocation of writeFieldBegin");
            }
            this.f96773b = i11;
        }
    }

    @Override // ws.i
    public long T1() throws IOException {
        return f96764i.h(j());
    }

    @Override // ws.i
    @m80.k
    public h T8() throws IOException {
        byte readByte = readByte();
        if (readByte != -126) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected protocol ID -126 but got ");
            String num = Integer.toString(readByte, kotlin.text.a.a(16));
            g0.o(num, "toString(...)");
            sb2.append(num);
            throw new ProtocolException(sb2.toString());
        }
        byte readByte2 = readByte();
        byte b11 = (byte) (readByte2 & 31);
        if (b11 == 1) {
            return new h(readString(), (byte) ((readByte2 >> 5) & 7), f());
        }
        throw new ProtocolException("Version mismatch; expected version 1 but got " + ((int) b11));
    }

    @Override // ws.i
    public void U3(@m80.k String name, byte b11, int i11) throws IOException {
        g0.p(name, "name");
        u(f96765j);
        u((byte) (((b11 << 5) & (-32)) | 1));
        q(i11);
        p1(name);
    }

    @Override // ws.i
    @m80.k
    public j X0() throws IOException {
        byte readByte = readByte();
        int i11 = (readByte >> 4) & 15;
        if (i11 == 15) {
            i11 = f();
        }
        return new j(a.f96780a.a((byte) (readByte & 15)), i11);
    }

    @Override // ws.i
    public void a4(boolean z11) throws IOException {
        byte b11 = z11 ? (byte) 1 : (byte) 2;
        int i11 = this.f96773b;
        if (i11 == -1) {
            u(b11);
        } else {
            k(i11, b11);
            this.f96773b = -1;
        }
    }

    @Override // ws.i
    @m80.k
    public d a6() throws IOException {
        byte readByte = readByte();
        byte b11 = (byte) (readByte & 15);
        byte a11 = a.f96780a.a(b11);
        if (readByte == 0) {
            return f96772q;
        }
        short s11 = (short) ((readByte & 240) >> 4);
        short w62 = s11 == 0 ? w6() : (short) (this.f96779h + s11);
        if (a11 == 2) {
            this.f96774c = b11;
        }
        this.f96779h = w62;
        return new d("", a11, w62);
    }

    @Override // ws.i
    public void b3(byte b11, byte b12, int i11) throws IOException {
        if (i11 == 0) {
            u((byte) 0);
            return;
        }
        a.C1295a c1295a = a.f96780a;
        byte b13 = c1295a.b(b11);
        byte b14 = c1295a.b(b12);
        q(i11);
        u((byte) ((b13 << 4) | b14));
    }

    public final <T> T c(p<? super Byte, ? super Integer, ? extends T> pVar) {
        byte readByte = readByte();
        int i11 = (readByte >> 4) & 15;
        if (i11 == 15) {
            i11 = f();
        }
        return pVar.invoke(Byte.valueOf(a.f96780a.a((byte) (readByte & 15))), Integer.valueOf(i11));
    }

    public final int f() throws IOException {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte readByte = readByte();
            i11 |= (readByte & Byte.MAX_VALUE) << i12;
            if ((readByte & 128) != 128) {
                return i11;
            }
            i12 += 7;
        }
    }

    @Override // ws.i
    public void g6(@m80.k String structName) throws IOException {
        g0.p(structName, "structName");
        this.f96776e.b(this.f96777f);
        this.f96777f = (short) 0;
    }

    public final long j() throws IOException {
        long j11 = 0;
        int i11 = 0;
        while (true) {
            j11 |= (r3 & Byte.MAX_VALUE) << i11;
            if ((readByte() & 128) != 128) {
                return j11;
            }
            i11 += 7;
        }
    }

    public final void k(int i11, byte b11) throws IOException {
        short s11 = this.f96777f;
        if (i11 <= s11 || i11 - s11 > 15) {
            u(b11);
            L2((short) i11);
        } else {
            u((byte) (b11 | ((i11 - s11) << 4)));
        }
        this.f96777f = (short) i11;
    }

    @Override // ws.i
    public void l5(int i11) throws IOException {
        q(f96764i.e(i11));
    }

    @Override // ws.i
    public void p1(@m80.k String str) throws IOException {
        g0.p(str, "str");
        byte[] X1 = f0.X1(str);
        q(X1.length);
        this.f96754a.write(X1);
    }

    public final void q(int i11) throws IOException {
        int length = this.f96775d.length;
        for (int i12 = 0; i12 < length; i12++) {
            if ((i11 & com.alipay.sdk.m.n.a.f10855g) == 0) {
                byte[] bArr = this.f96775d;
                bArr[i12] = (byte) i11;
                this.f96754a.write(bArr, 0, i12 + 1);
                return;
            }
            this.f96775d[i12] = (byte) ((i11 & 127) | 128);
            i11 >>>= 7;
        }
        throw new IllegalArgumentException("Cannot represent " + i11 + " as a varint in 16 bytes or less");
    }

    @Override // ws.i
    public void q7(long j11) throws IOException {
        r(f96764i.f(j11));
    }

    public final void r(long j11) throws IOException {
        int length = this.f96775d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (((-128) & j11) == 0) {
                byte[] bArr = this.f96775d;
                bArr[i11] = (byte) j11;
                this.f96754a.write(bArr, 0, i11 + 1);
                return;
            }
            this.f96775d[i11] = (byte) ((127 & j11) | 128);
            j11 >>>= 7;
        }
        throw new IllegalArgumentException("Cannot represent " + j11 + " as a varint in 16 bytes or less");
    }

    @Override // ws.i
    public void r0() throws IOException {
        u((byte) 0);
    }

    @Override // ws.i
    public boolean readBool() throws IOException {
        byte b11 = this.f96774c;
        if (b11 != -1) {
            this.f96774c = (byte) -1;
        } else {
            b11 = readByte();
        }
        return b11 == 1;
    }

    @Override // ws.i
    public byte readByte() throws IOException {
        e(this.f96775d, 1);
        return this.f96775d[0];
    }

    @Override // ws.i
    public double readDouble() throws IOException {
        e(this.f96775d, 8);
        byte[] bArr = this.f96775d;
        long j11 = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24) | ((bArr[4] & 255) << 32) | ((bArr[5] & 255) << 40) | ((bArr[6] & 255) << 48) | ((bArr[7] & 255) << 56);
        w wVar = w.f67042a;
        return Double.longBitsToDouble(j11);
    }

    @Override // ws.i
    @m80.k
    public String readString() throws IOException {
        int f11 = f();
        if (f11 == 0) {
            return "";
        }
        byte[] bArr = new byte[f11];
        e(bArr, f11);
        return f0.U1(bArr);
    }

    @Override // ws.i
    public int s8() throws IOException {
        return f96764i.g(f());
    }

    @Override // ws.i
    public void u(byte b11) throws IOException {
        byte[] bArr = this.f96775d;
        bArr[0] = b11;
        this.f96754a.write(bArr, 0, 1);
    }

    @Override // ws.i
    @m80.k
    public k u0() throws IOException {
        this.f96778g.b(this.f96779h);
        this.f96779h = (short) 0;
        return f96771p;
    }

    @Override // ws.i
    @m80.k
    public f v4() throws IOException {
        byte readByte = readByte();
        int i11 = (readByte >> 4) & 15;
        if (i11 == 15) {
            i11 = f();
        }
        return new f(a.f96780a.a((byte) (readByte & 15)), i11);
    }

    public final void w(byte b11, int i11) throws IOException {
        byte b12 = a.f96780a.b(b11);
        if (i11 <= 14) {
            u((byte) (b12 | (i11 << 4)));
        } else {
            u((byte) (b12 | 240));
            q(i11);
        }
    }

    @Override // ws.i
    public short w6() throws IOException {
        return (short) f96764i.g(f());
    }

    @Override // ws.i
    public void writeDouble(double d11) throws IOException {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d11);
        byte[] bArr = this.f96775d;
        bArr[0] = (byte) (doubleToRawLongBits & 255);
        bArr[1] = (byte) ((doubleToRawLongBits >>> 8) & 255);
        bArr[2] = (byte) ((doubleToRawLongBits >>> 16) & 255);
        bArr[3] = (byte) ((doubleToRawLongBits >>> 24) & 255);
        bArr[4] = (byte) ((doubleToRawLongBits >>> 32) & 255);
        bArr[5] = (byte) ((doubleToRawLongBits >>> 40) & 255);
        bArr[6] = (byte) ((doubleToRawLongBits >>> 48) & 255);
        bArr[7] = (byte) ((doubleToRawLongBits >>> 56) & 255);
        this.f96754a.write(bArr, 0, 8);
    }

    @Override // ws.i
    public void y2(byte b11, int i11) throws IOException {
        w(b11, i11);
    }

    @Override // ws.i
    public void z1(@m80.k ByteString buf) throws IOException {
        g0.p(buf, "buf");
        q(buf.size());
        this.f96754a.write(buf.toByteArray());
    }

    @Override // ws.i
    public void A7() throws IOException {
    }

    @Override // ws.i
    public void N2() throws IOException {
    }

    @Override // ws.i
    public void V0() throws IOException {
    }

    @Override // ws.i
    public void W1() throws IOException {
    }

    @Override // ws.i
    public void b6() throws IOException {
    }

    @Override // ws.i
    public void i5() throws IOException {
    }

    @Override // ws.i
    public void l4() throws IOException {
    }

    @Override // ws.i
    public void l8() throws IOException {
    }

    @Override // ws.i
    public void o8() throws IOException {
    }

    @Override // ws.i
    public void t4() throws IOException {
    }
}
