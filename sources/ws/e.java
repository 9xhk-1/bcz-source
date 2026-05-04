package ws;

import a00.m;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import okio.ByteString;
import u30.f0;
import u30.k0;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e extends ws.a {

    /* renamed from: q, reason: collision with root package name */
    public static final long f96808q = 1;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final String f96810s = "\"\\/bfnrt";

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96812b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final m<b> f96813c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public b f96814d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public f f96815e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final byte[] f96816f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f96798g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final byte[] f96799h = {44};

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final byte[] f96800i = {58};

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final byte[] f96801j = {123};

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final byte[] f96802k = {125};

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final byte[] f96803l = {91};

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final byte[] f96804m = {93};

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final byte[] f96805n = {34};

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final byte[] f96806o = {92};

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final byte[] f96807p = {92, 117, 48, 48};

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final byte[] f96809r = {0, 0, 0, 0, 0, 0, 0, 0, 98, 116, 110, 0, 102, 114, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 34, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final byte[] f96811t = {34, 92, 47, 8, 12, 10, 13, 9};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final byte c(byte b11) {
            byte b12 = (byte) (b11 & 15);
            return (byte) (b12 < 10 ? b12 + 48 : b12 + 87);
        }

        public final byte d(byte b11) throws IOException {
            int i11;
            if (b11 >= 48 && b11 <= 57) {
                i11 = ((char) b11) - '0';
            } else {
                if (b11 < 97 || b11 > 102) {
                    throw new ProtocolException("Expected hex character");
                }
                i11 = ((char) b11) - 'W';
            }
            return (byte) i11;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f96817a = true;

        public c() {
        }

        @Override // ws.e.b
        public void b() throws IOException {
            if (this.f96817a) {
                this.f96817a = false;
            } else {
                e.this.U(e.f96799h);
            }
        }

        @Override // ws.e.b
        public void c() throws IOException {
            if (this.f96817a) {
                this.f96817a = false;
            } else {
                e.this.f96754a.write(e.f96799h);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f96819a = true;

        /* renamed from: b, reason: collision with root package name */
        public boolean f96820b = true;

        public d() {
        }

        @Override // ws.e.b
        public boolean a() {
            return this.f96820b;
        }

        @Override // ws.e.b
        public void b() throws IOException {
            if (this.f96819a) {
                this.f96819a = false;
                this.f96820b = true;
            } else {
                e.this.U(this.f96820b ? e.f96800i : e.f96799h);
                this.f96820b = !this.f96820b;
            }
        }

        @Override // ws.e.b
        public void c() throws IOException {
            if (this.f96819a) {
                this.f96819a = false;
                this.f96820b = true;
            } else {
                e.this.f96754a.write(this.f96820b ? e.f96800i : e.f96799h);
                this.f96820b = !this.f96820b;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nJsonProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonProtocol.kt\ncom/microsoft/thrifty/protocol/JsonProtocol$JsonTypes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,851:1\n1#2:852\n*E\n"})
    /* renamed from: ws.e$e, reason: collision with other inner class name */
    public static final class C1297e {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final C1297e f96822a = new C1297e();

        /* renamed from: b, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96823b = {116, 102};

        /* renamed from: c, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96824c = {105, 56};

        /* renamed from: d, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96825d = {105, 49, 54};

        /* renamed from: e, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96826e = {105, 51, 50};

        /* renamed from: f, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96827f = {105, 54, 52};

        /* renamed from: g, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96828g = {100, 98, 108};

        /* renamed from: h, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96829h = {114, 101, 99};

        /* renamed from: i, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96830i = {115, 116, 114};

        /* renamed from: j, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96831j = {109, 97, 112};

        /* renamed from: k, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96832k = {108, 115, 116};

        /* renamed from: l, reason: collision with root package name */
        @w00.g
        @m80.k
        public static final byte[] f96833l = {115, 101, 116};

        @o
        public static final byte a(@m80.k byte[] jsonId) {
            g0.p(jsonId, "jsonId");
            byte b11 = 0;
            if (jsonId.length > 1) {
                char c11 = (char) jsonId[0];
                if (c11 == 'd') {
                    b11 = 4;
                } else if (c11 == 'i') {
                    char c12 = (char) jsonId[1];
                    if (c12 == '8') {
                        b11 = 3;
                    } else if (c12 == '1') {
                        b11 = 6;
                    } else if (c12 == '3') {
                        b11 = 8;
                    } else if (c12 == '6') {
                        b11 = 10;
                    }
                } else if (c11 == 'l') {
                    b11 = 15;
                } else if (c11 == 'm') {
                    b11 = 13;
                } else if (c11 == 'r') {
                    b11 = 12;
                } else if (c11 == 's') {
                    b11 = jsonId[1] == 116 ? (byte) 11 : (byte) 14;
                } else if (c11 == 't') {
                    b11 = 2;
                }
            }
            if (b11 != 0) {
                return b11;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown json type ID: ");
            String arrays = Arrays.toString(jsonId);
            g0.o(arrays, "toString(...)");
            sb2.append(arrays);
            throw new IllegalArgumentException(sb2.toString().toString());
        }

        @o
        @m80.k
        public static final byte[] b(byte b11) {
            if (b11 == 0) {
                throw new IllegalArgumentException("Unexpected STOP type");
            }
            if (b11 == 1) {
                throw new IllegalArgumentException("Unexpected VOID type");
            }
            if (b11 == 2) {
                return f96823b;
            }
            if (b11 == 3) {
                return f96824c;
            }
            if (b11 == 4) {
                return f96828g;
            }
            if (b11 == 6) {
                return f96825d;
            }
            if (b11 == 8) {
                return f96826e;
            }
            if (b11 == 10) {
                return f96827f;
            }
            if (b11 == 11) {
                return f96830i;
            }
            if (b11 == 12) {
                return f96829h;
            }
            if (b11 == 13) {
                return f96831j;
            }
            if (b11 == 14) {
                return f96833l;
            }
            if (b11 == 15) {
                return f96832k;
            }
            throw new IllegalArgumentException("Unknown TType ID: " + ((int) b11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class f {

        /* renamed from: a, reason: collision with root package name */
        public boolean f96834a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final byte[] f96835b = new byte[1];

        public f() {
        }

        public final byte a() throws IOException {
            if (!this.f96834a) {
                e.this.f96754a.read(this.f96835b, 0, 1);
            }
            this.f96834a = true;
            return this.f96835b[0];
        }

        public final byte b() throws IOException {
            if (this.f96834a) {
                this.f96834a = false;
            } else {
                e.this.f96754a.read(this.f96835b, 0, 1);
            }
            return this.f96835b[0];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public e(@m80.k zs.e transport) {
        this(transport, false, 2, null);
        g0.p(transport, "transport");
    }

    @Override // ws.i
    public void A7() throws IOException {
        I();
    }

    public final double C() throws IOException {
        this.f96814d.b();
        byte a11 = this.f96815e.a();
        byte[] bArr = f96805n;
        if (a11 != bArr[0]) {
            if (this.f96814d.a()) {
                U(bArr);
            }
            try {
                return Double.parseDouble(H());
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Bad data encountered in numeric data");
            }
        }
        double parseDouble = Double.parseDouble(S(true).utf8());
        if (this.f96814d.a() || Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
            return parseDouble;
        }
        throw new ProtocolException("Numeric data unexpectedly quoted");
    }

    public final long E() throws IOException {
        this.f96814d.b();
        if (this.f96814d.a()) {
            U(f96805n);
        }
        String H = H();
        if (this.f96814d.a()) {
            U(f96805n);
        }
        try {
            return Long.parseLong(H);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Bad data encountered in numeric data");
        }
    }

    @Override // ws.i
    public void E6() throws IOException {
        f0();
    }

    public final String H() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (i(this.f96815e.a())) {
            sb2.append((char) this.f96815e.b());
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @Override // ws.i
    public void H7(byte b11, int i11) throws IOException {
        a0();
        i0(C1297e.b(b11));
        d0(i11);
    }

    public final void I() throws IOException {
        U(f96802k);
        j();
    }

    @Override // ws.i
    public void I4() throws IOException {
        I();
    }

    @Override // ws.i
    @m80.k
    public ByteString K3() throws IOException {
        return w();
    }

    public final void L() throws IOException {
        this.f96814d.b();
        U(f96801j);
        k(new d());
    }

    @Override // ws.i
    public void L2(short s11) throws IOException {
        d0(s11);
    }

    @Override // ws.i
    public void N2() throws IOException {
        f0();
    }

    @Override // ws.i
    @m80.k
    public g O() throws IOException {
        r();
        byte a11 = C1297e.a(S(false).toByteArray());
        byte a12 = C1297e.a(S(false).toByteArray());
        int E = (int) E();
        L();
        return new g(a11, a12, E);
    }

    @Override // ws.i
    public void Q6(@m80.k String fieldName, int i11, byte b11) throws IOException {
        g0.p(fieldName, "fieldName");
        if (this.f96812b) {
            p1(fieldName);
        } else {
            d0(i11);
        }
        h0();
        i0(C1297e.b(b11));
    }

    public final ByteString S(boolean z11) throws IOException {
        l60.k kVar = new l60.k();
        ArrayList arrayList = new ArrayList();
        if (!z11) {
            this.f96814d.b();
        }
        U(f96805n);
        while (true) {
            byte b11 = this.f96815e.b();
            if (b11 == f96805n[0]) {
                return kVar.q3();
            }
            byte[] bArr = f96807p;
            if (b11 == bArr[0]) {
                byte b12 = this.f96815e.b();
                if (b12 == bArr[1]) {
                    this.f96754a.read(this.f96816f, 0, 4);
                    a aVar = f96798g;
                    short d11 = (short) ((aVar.d(this.f96816f[0]) << 12) + (aVar.d(this.f96816f[1]) << 8) + (aVar.d(this.f96816f[2]) << 4) + aVar.d(this.f96816f[3]));
                    char c11 = (char) d11;
                    try {
                        if (Character.isHighSurrogate(c11)) {
                            if (arrayList.size() > 0) {
                                throw new ProtocolException("Expected low surrogate char");
                            }
                            arrayList.add(Character.valueOf(c11));
                        } else if (!Character.isLowSurrogate(c11)) {
                            kVar.write(f0.X1(new l60.k().x4(d11).R3()));
                        } else {
                            if (arrayList.size() == 0) {
                                throw new ProtocolException("Expected high surrogate char");
                            }
                            arrayList.add(Character.valueOf(c11));
                            l60.k kVar2 = new l60.k();
                            Object obj = arrayList.get(0);
                            g0.o(obj, "get(...)");
                            l60.k x42 = kVar2.x4(((Character) obj).charValue());
                            Object obj2 = arrayList.get(1);
                            g0.o(obj2, "get(...)");
                            kVar.write(f0.X1(x42.x4(((Character) obj2).charValue()).R3()));
                            arrayList.clear();
                        }
                    } catch (IOException unused) {
                        throw new ProtocolException("Invalid unicode sequence");
                    }
                } else {
                    int I3 = k0.I3(f96810s, (char) b12, 0, false, 6, null);
                    if (I3 == -1) {
                        throw new ProtocolException("Expected control char");
                    }
                    b11 = f96811t[I3];
                }
            }
            kVar.write(new byte[]{b11});
        }
    }

    @Override // ws.i
    public long T1() throws IOException {
        return E();
    }

    @Override // ws.i
    @m80.k
    public h T8() throws IOException {
        V();
        r();
        if (E() == 1) {
            return new h(S(false).utf8(), (byte) E(), (int) E());
        }
        throw new ProtocolException("Message contained bad version.");
    }

    public final void U(byte[] bArr) throws IOException {
        byte b11 = this.f96815e.b();
        if (b11 == bArr[0]) {
            return;
        }
        throw new ProtocolException("Unexpected character:" + ((char) b11));
    }

    @Override // ws.i
    public void U3(@m80.k String name, byte b11, int i11) throws IOException {
        g0.p(name, "name");
        V();
        a0();
        d0(1L);
        i0(f0.X1(name));
        d0(b11);
        d0(i11);
    }

    public final void V() {
        while (!this.f96813c.isEmpty()) {
            j();
        }
    }

    @Override // ws.i
    public void V0() throws IOException {
        q();
    }

    @Override // ws.i
    public void W1() throws IOException {
        f0();
        Z();
    }

    @Override // ws.i
    @m80.k
    public j X0() throws IOException {
        r();
        return new j(C1297e.a(S(false).toByteArray()), (int) E());
    }

    public final void Z() throws IOException {
        j();
        this.f96754a.write(f96804m);
    }

    public final void a0() throws IOException {
        this.f96814d.c();
        this.f96754a.write(f96803l);
        k(new c());
    }

    @Override // ws.i
    public void a4(boolean z11) throws IOException {
        d0(z11 ? 1L : 0L);
    }

    @Override // ws.i
    @m80.k
    public ws.d a6() throws IOException {
        short E;
        byte b11 = 0;
        if (this.f96815e.a() == f96802k[0]) {
            E = 0;
        } else {
            E = (short) E();
            L();
            b11 = C1297e.a(S(false).toByteArray());
        }
        return new ws.d("", b11, E);
    }

    @Override // ws.i
    public void b3(byte b11, byte b12, int i11) throws IOException {
        a0();
        i0(C1297e.b(b11));
        i0(C1297e.b(b12));
        d0(i11);
        h0();
    }

    @Override // ws.i
    public void b6() throws IOException {
        I();
        q();
    }

    public final void c0(double d11) throws IOException {
        this.f96814d.c();
        String valueOf = String.valueOf(d11);
        char charAt = valueOf.charAt(0);
        boolean z11 = charAt == 'N' || charAt == 'I' || (charAt == '-' && valueOf.charAt(1) == 'I') || this.f96814d.a();
        if (z11) {
            this.f96754a.write(f96805n);
        }
        this.f96754a.write(f0.X1(valueOf));
        if (z11) {
            this.f96754a.write(f96805n);
        }
    }

    public final void d0(long j11) throws IOException {
        this.f96814d.c();
        String valueOf = String.valueOf(j11);
        boolean a11 = this.f96814d.a();
        if (a11) {
            this.f96754a.write(f96805n);
        }
        this.f96754a.write(f0.X1(valueOf));
        if (a11) {
            this.f96754a.write(f96805n);
        }
    }

    public final void f0() throws IOException {
        j();
        this.f96754a.write(f96802k);
    }

    @Override // ws.i
    public void g6(@m80.k String structName) throws IOException {
        g0.p(structName, "structName");
        h0();
    }

    public final void h0() throws IOException {
        this.f96814d.c();
        this.f96754a.write(f96801j);
        k(new d());
    }

    public final boolean i(byte b11) {
        char c11 = (char) b11;
        return c11 == '+' || c11 == '-' || c11 == '.' || c11 == '0' || c11 == '1' || c11 == '2' || c11 == '3' || c11 == '4' || c11 == '5' || c11 == '6' || c11 == '7' || c11 == '8' || c11 == '9' || c11 == 'E' || c11 == 'e';
    }

    public final void i0(byte[] bArr) throws IOException {
        this.f96814d.c();
        this.f96754a.write(f96805n);
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            byte b11 = bArr[i11];
            if ((b11 & 255) >= 48) {
                byte[] bArr2 = f96806o;
                if (b11 == bArr2[0]) {
                    this.f96754a.write(bArr2);
                    this.f96754a.write(bArr2);
                } else {
                    this.f96754a.write(bArr, i11, 1);
                }
            } else {
                byte[] bArr3 = this.f96816f;
                byte b12 = f96809r[b11];
                bArr3[0] = b12;
                if (b12 == 1) {
                    this.f96754a.write(bArr, i11, 1);
                } else if (b12 > 1) {
                    this.f96754a.write(f96806o);
                    this.f96754a.write(this.f96816f, 0, 1);
                } else {
                    this.f96754a.write(f96807p);
                    byte[] bArr4 = this.f96816f;
                    a aVar = f96798g;
                    bArr4[0] = aVar.c((byte) (bArr[i11] >> 4));
                    this.f96816f[1] = aVar.c(bArr[i11]);
                    this.f96754a.write(this.f96816f, 0, 2);
                }
            }
        }
        this.f96754a.write(f96805n);
    }

    @Override // ws.i
    public void i5() throws IOException {
        Z();
    }

    public final void j() {
        this.f96814d = this.f96813c.removeFirst();
    }

    public final void k(b bVar) {
        this.f96813c.addFirst(this.f96814d);
        this.f96814d = bVar;
    }

    @Override // ws.i
    public void l4() throws IOException {
        q();
    }

    @Override // ws.i
    public void l5(int i11) throws IOException {
        d0(i11);
    }

    @Override // ws.i
    public void l8() throws IOException {
        q();
    }

    @Override // ws.i
    public void o8() throws IOException {
        Z();
    }

    @Override // ws.i
    public void p1(@m80.k String str) throws IOException {
        g0.p(str, "str");
        i0(f0.X1(str));
    }

    public final void q() throws IOException {
        U(f96804m);
        j();
    }

    @Override // ws.i
    public void q7(long j11) throws IOException {
        d0(j11);
    }

    public final void r() throws IOException {
        this.f96814d.b();
        U(f96803l);
        k(new c());
    }

    @Override // ws.i
    public boolean readBool() throws IOException {
        return E() != 0;
    }

    @Override // ws.i
    public byte readByte() throws IOException {
        return (byte) E();
    }

    @Override // ws.i
    public double readDouble() throws IOException {
        return C();
    }

    @Override // ws.i
    @m80.k
    public String readString() throws IOException {
        return S(false).utf8();
    }

    @Override // ws.i
    public void reset() {
        this.f96813c.clear();
        this.f96814d = new b();
        this.f96815e = new f();
    }

    @Override // ws.i
    public int s8() throws IOException {
        return (int) E();
    }

    @Override // ws.i
    public void t4() throws IOException {
        Z();
    }

    @Override // ws.i
    public void u(byte b11) throws IOException {
        d0(b11);
    }

    @Override // ws.i
    @m80.k
    public k u0() throws IOException {
        L();
        return new k("");
    }

    @Override // ws.i
    @m80.k
    public ws.f v4() throws IOException {
        r();
        return new ws.f(C1297e.a(S(false).toByteArray()), (int) E());
    }

    public final ByteString w() throws IOException {
        ByteString h11 = ByteString.Companion.h(S(false).utf8());
        g0.m(h11);
        return h11;
    }

    @Override // ws.i
    public short w6() throws IOException {
        return (short) E();
    }

    @Override // ws.i
    public void writeDouble(double d11) throws IOException {
        c0(d11);
    }

    @Override // ws.i
    public void y2(byte b11, int i11) throws IOException {
        a0();
        i0(C1297e.b(b11));
        d0(i11);
    }

    @Override // ws.i
    public void z1(@m80.k ByteString buf) throws IOException {
        g0.p(buf, "buf");
        p1(buf.base64());
    }

    public /* synthetic */ e(zs.e eVar, boolean z11, int i11, v vVar) {
        this(eVar, (i11 & 2) != 0 ? false : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public e(@m80.k zs.e transport, boolean z11) {
        super(transport);
        g0.p(transport, "transport");
        this.f96812b = z11;
        this.f96813c = new m<>();
        this.f96814d = new b();
        this.f96815e = new f();
        this.f96816f = new byte[4];
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {
        public boolean a() {
            return false;
        }

        public void b() throws IOException {
        }

        public void c() throws IOException {
        }
    }

    @Override // ws.i
    public void r0() {
    }
}
