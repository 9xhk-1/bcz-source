package ws;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import okio.ByteString;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b extends ws.a {

    /* renamed from: h, reason: collision with root package name */
    public static final int f96756h = -65536;

    /* renamed from: i, reason: collision with root package name */
    public static final int f96757i = -2147418112;

    /* renamed from: b, reason: collision with root package name */
    public final long f96759b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96760c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f96761d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96762e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final byte[] f96763f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f96755g = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final k f96758j = new k("");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public b(@m80.k zs.e transport) {
        this(transport, 0L, 0L, false, false, 30, null);
        g0.p(transport, "transport");
    }

    @Override // ws.i
    public void H7(byte b11, int i11) throws IOException {
        u(b11);
        l5(i11);
    }

    @Override // ws.i
    @m80.k
    public ByteString K3() throws IOException {
        int s82 = s8();
        long j11 = this.f96759b;
        if (j11 != -1 && s82 > j11) {
            throw new ProtocolException("Binary size limit exceeded");
        }
        byte[] bArr = new byte[s82];
        c(bArr, s82);
        return ByteString.a.p(ByteString.Companion, bArr, 0, 0, 3, null);
    }

    @Override // ws.i
    public void L2(short s11) throws IOException {
        byte[] bArr = this.f96763f;
        bArr[0] = (byte) ((s11 >> 8) & 255);
        bArr[1] = (byte) (s11 & 255);
        this.f96754a.write(bArr, 0, 2);
    }

    @Override // ws.i
    @m80.k
    public g O() throws IOException {
        byte readByte = readByte();
        byte readByte2 = readByte();
        int s82 = s8();
        long j11 = this.f96760c;
        if (j11 == -1 || s82 <= j11) {
            return new g(readByte, readByte2, s82);
        }
        throw new ProtocolException("Container size limit exceeded");
    }

    @Override // ws.i
    public void Q6(@m80.k String fieldName, int i11, byte b11) throws IOException {
        g0.p(fieldName, "fieldName");
        u(b11);
        L2((short) i11);
    }

    @Override // ws.i
    public long T1() throws IOException {
        c(this.f96763f, 8);
        byte[] bArr = this.f96763f;
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    @Override // ws.i
    @m80.k
    public h T8() throws IOException {
        int s82 = s8();
        if (s82 < 0) {
            if (((-65536) & s82) == -2147418112) {
                return new h(readString(), (byte) (s82 & 255), s8());
            }
            throw new ProtocolException("Bad version in readMessageBegin");
        }
        if (this.f96761d) {
            throw new ProtocolException("Missing version in readMessageBegin");
        }
        return new h(e(s82), readByte(), s8());
    }

    @Override // ws.i
    public void U3(@m80.k String name, byte b11, int i11) throws IOException {
        g0.p(name, "name");
        if (this.f96762e) {
            l5((b11 & 255) | f96757i);
            p1(name);
            l5(i11);
        } else {
            p1(name);
            u(b11);
            l5(i11);
        }
    }

    @Override // ws.i
    @m80.k
    public j X0() throws IOException {
        byte readByte = readByte();
        int s82 = s8();
        long j11 = this.f96760c;
        if (j11 == -1 || s82 <= j11) {
            return new j(readByte, s82);
        }
        throw new ProtocolException("Container size limit exceeded");
    }

    @Override // ws.i
    public void a4(boolean z11) throws IOException {
        u(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // ws.i
    @m80.k
    public d a6() throws IOException {
        byte readByte = readByte();
        return new d("", readByte, readByte == 0 ? (short) 0 : w6());
    }

    @Override // ws.i
    public void b3(byte b11, byte b12, int i11) throws IOException {
        u(b11);
        u(b12);
        l5(i11);
    }

    public final void c(byte[] bArr, int i11) throws IOException {
        int i12 = 0;
        int i13 = i11;
        while (i13 > 0) {
            int read = this.f96754a.read(bArr, i12, i13);
            if (read == -1) {
                throw new EOFException("Expected " + i11 + " bytes; got " + i12);
            }
            i13 -= read;
            i12 += read;
        }
    }

    public final String e(int i11) throws IOException {
        byte[] bArr = new byte[i11];
        c(bArr, i11);
        return f0.U1(bArr);
    }

    @Override // ws.i
    public void g6(@m80.k String structName) throws IOException {
        g0.p(structName, "structName");
    }

    @Override // ws.i
    public void l5(int i11) throws IOException {
        byte[] bArr = this.f96763f;
        bArr[0] = (byte) ((i11 >> 24) & 255);
        bArr[1] = (byte) ((i11 >> 16) & 255);
        bArr[2] = (byte) ((i11 >> 8) & 255);
        bArr[3] = (byte) (i11 & 255);
        this.f96754a.write(bArr, 0, 4);
    }

    @Override // ws.i
    public void p1(@m80.k String str) throws IOException {
        g0.p(str, "str");
        byte[] X1 = f0.X1(str);
        l5(X1.length);
        this.f96754a.write(X1);
    }

    @Override // ws.i
    public void q7(long j11) throws IOException {
        byte[] bArr = this.f96763f;
        bArr[0] = (byte) ((j11 >> 56) & 255);
        bArr[1] = (byte) ((j11 >> 48) & 255);
        bArr[2] = (byte) ((j11 >> 40) & 255);
        bArr[3] = (byte) ((j11 >> 32) & 255);
        bArr[4] = (byte) ((j11 >> 24) & 255);
        bArr[5] = (byte) ((j11 >> 16) & 255);
        bArr[6] = (byte) ((j11 >> 8) & 255);
        bArr[7] = (byte) (j11 & 255);
        this.f96754a.write(bArr, 0, 8);
    }

    @Override // ws.i
    public void r0() throws IOException {
        u((byte) 0);
    }

    @Override // ws.i
    public boolean readBool() throws IOException {
        return readByte() == 1;
    }

    @Override // ws.i
    public byte readByte() throws IOException {
        c(this.f96763f, 1);
        return this.f96763f[0];
    }

    @Override // ws.i
    public double readDouble() throws IOException {
        w wVar = w.f67042a;
        return Double.longBitsToDouble(T1());
    }

    @Override // ws.i
    @m80.k
    public String readString() throws IOException {
        int s82 = s8();
        long j11 = this.f96759b;
        if (j11 == -1 || s82 <= j11) {
            return e(s82);
        }
        throw new ProtocolException("String size limit exceeded");
    }

    @Override // ws.i
    public int s8() throws IOException {
        c(this.f96763f, 4);
        byte[] bArr = this.f96763f;
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    @Override // ws.i
    public void u(byte b11) throws IOException {
        byte[] bArr = this.f96763f;
        bArr[0] = b11;
        this.f96754a.write(bArr, 0, 1);
    }

    @Override // ws.i
    @m80.k
    public k u0() throws IOException {
        return f96758j;
    }

    @Override // ws.i
    @m80.k
    public f v4() throws IOException {
        byte readByte = readByte();
        int s82 = s8();
        long j11 = this.f96760c;
        if (j11 == -1 || s82 <= j11) {
            return new f(readByte, s82);
        }
        throw new ProtocolException("Container size limit exceeded");
    }

    @Override // ws.i
    public short w6() throws IOException {
        c(this.f96763f, 2);
        byte[] bArr = this.f96763f;
        return (short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8));
    }

    @Override // ws.i
    public void writeDouble(double d11) throws IOException {
        q7(Double.doubleToRawLongBits(d11));
    }

    @Override // ws.i
    public void y2(byte b11, int i11) throws IOException {
        u(b11);
        l5(i11);
    }

    @Override // ws.i
    public void z1(@m80.k ByteString buf) throws IOException {
        g0.p(buf, "buf");
        l5(buf.size());
        this.f96754a.write(buf.toByteArray());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public b(@m80.k zs.e transport, long j11) {
        this(transport, j11, 0L, false, false, 28, null);
        g0.p(transport, "transport");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public b(@m80.k zs.e transport, long j11, long j12) {
        this(transport, j11, j12, false, false, 24, null);
        g0.p(transport, "transport");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public b(@m80.k zs.e transport, long j11, long j12, boolean z11) {
        this(transport, j11, j12, z11, false, 16, null);
        g0.p(transport, "transport");
    }

    public /* synthetic */ b(zs.e eVar, long j11, long j12, boolean z11, boolean z12, int i11, v vVar) {
        this(eVar, (i11 & 2) != 0 ? -1L : j11, (i11 & 4) != 0 ? -1L : j12, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public b(@m80.k zs.e transport, long j11, long j12, boolean z11, boolean z12) {
        super(transport);
        g0.p(transport, "transport");
        this.f96759b = j11;
        this.f96760c = j12;
        this.f96761d = z11;
        this.f96762e = z12;
        this.f96763f = new byte[8];
    }

    @Override // ws.i
    public void A7() throws IOException {
    }

    @Override // ws.i
    public void E6() throws IOException {
    }

    @Override // ws.i
    public void I4() throws IOException {
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
