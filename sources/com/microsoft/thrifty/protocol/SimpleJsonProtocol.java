package com.microsoft.thrifty.protocol;

import a00.m;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okio.ByteString;
import u30.f0;
import u30.h;
import ws.g;
import ws.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSimpleJsonProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleJsonProtocol.kt\ncom/microsoft/thrifty/protocol/SimpleJsonProtocol\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,434:1\n13365#2,2:435\n*S KotlinDebug\n*F\n+ 1 SimpleJsonProtocol.kt\ncom/microsoft/thrifty/protocol/SimpleJsonProtocol\n*L\n289#1:435,2\n*E\n"})
/* loaded from: classes7.dex */
public final class SimpleJsonProtocol extends ws.a {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f39993f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f39994g = true;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f40004b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final m<e> f40005c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public BinaryOutputMode f40006d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f39992e = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final char[][] f39995h = new char[128][];

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final byte[] f39996i = {116, 114, 117, 101};

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final byte[] f39997j = {102, 97, 108, 115, 101};

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final byte[] f39998k = {44};

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final byte[] f39999l = {58};

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final byte[] f40000m = {91};

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final byte[] f40001n = {93};

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final byte[] f40002o = {123};

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final byte[] f40003p = {125};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class BinaryOutputMode {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ BinaryOutputMode[] $VALUES;
        public static final BinaryOutputMode HEX = new BinaryOutputMode("HEX", 0);
        public static final BinaryOutputMode BASE_64 = new BinaryOutputMode("BASE_64", 1);
        public static final BinaryOutputMode UNICODE = new BinaryOutputMode("UNICODE", 2);

        private static final /* synthetic */ BinaryOutputMode[] $values() {
            return new BinaryOutputMode[]{HEX, BASE_64, UNICODE};
        }

        static {
            BinaryOutputMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private BinaryOutputMode(String str, int i11) {
        }

        @k
        public static m00.a<BinaryOutputMode> getEntries() {
            return $ENTRIES;
        }

        public static BinaryOutputMode valueOf(String str) {
            return (BinaryOutputMode) Enum.valueOf(BinaryOutputMode.class, str);
        }

        public static BinaryOutputMode[] values() {
            return (BinaryOutputMode[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f40007a;

        public b() {
        }

        @Override // com.microsoft.thrifty.protocol.SimpleJsonProtocol.e
        public void a() throws IOException {
            if (this.f40007a) {
                SimpleJsonProtocol.this.f96754a.write(SimpleJsonProtocol.f39998k);
            } else {
                this.f40007a = true;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f40009a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f40010b;

        public c() {
        }

        @Override // com.microsoft.thrifty.protocol.SimpleJsonProtocol.e
        public void a() throws IOException {
            if (!this.f40009a) {
                this.f40009a = true;
            } else if (this.f40010b) {
                SimpleJsonProtocol.this.f96754a.write(SimpleJsonProtocol.f39999l);
            } else {
                SimpleJsonProtocol.this.f96754a.write(SimpleJsonProtocol.f39998k);
            }
            this.f40010b = !this.f40010b;
        }

        @Override // com.microsoft.thrifty.protocol.SimpleJsonProtocol.e
        public void b() throws IOException {
            if (this.f40010b) {
                throw new ProtocolException("Incomplete JSON map, expected a value");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40012a;

        static {
            int[] iArr = new int[BinaryOutputMode.values().length];
            try {
                iArr[BinaryOutputMode.HEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BinaryOutputMode.BASE_64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BinaryOutputMode.UNICODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40012a = iArr;
        }
    }

    static {
        for (int i11 = 0; i11 < 32; i11++) {
            f39995h[i11] = new char[]{'\\', l50.b.f69934p, '0', '0', h.f91619a.charAt((i11 >> 4) & 15), h.f91619a.charAt(i11 & 15)};
        }
        char[][] cArr = f39995h;
        cArr[92] = new char[]{'\\', '\\'};
        cArr[34] = new char[]{'\\', '\"'};
        cArr[8] = new char[]{'\\', 'b'};
        cArr[12] = new char[]{'\\', 'f'};
        cArr[13] = new char[]{'\\', 'r'};
        cArr[10] = new char[]{'\\', 'n'};
        cArr[9] = new char[]{'\\', 't'};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleJsonProtocol(@l zs.e eVar) {
        super(eVar);
        g0.m(eVar);
        this.f40004b = new f();
        this.f40005c = new m<>();
        this.f40006d = BinaryOutputMode.HEX;
    }

    @Override // ws.i
    public void A7() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void E6() throws IOException {
        this.f96754a.write(f40003p);
        f();
    }

    @Override // ws.i
    public void H7(byte b11, int i11) throws IOException {
        k().a();
        i(new b());
        this.f96754a.write(f40000m);
    }

    @Override // ws.i
    public void I4() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    @k
    public ByteString K3() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void L2(short s11) throws IOException {
        k().a();
        this.f96754a.write(f0.X1(String.valueOf((int) s11)));
    }

    @Override // ws.i
    @k
    public g O() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void Q6(@k String fieldName, int i11, byte b11) throws IOException {
        g0.p(fieldName, "fieldName");
        p1(fieldName);
    }

    @Override // ws.i
    public long T1() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    @k
    public ws.h T8() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void U3(@k String name, byte b11, int i11) throws IOException {
        g0.p(name, "name");
        b3(b11, b11, 0);
        p1("name");
        p1(name);
        p1("value");
    }

    @Override // ws.i
    public void V0() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void W1() throws IOException {
        this.f96754a.write(f40003p);
        f();
    }

    @Override // ws.i
    @k
    public j X0() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void a4(boolean z11) throws IOException {
        k().a();
        this.f96754a.write(z11 ? f39996i : f39997j);
    }

    @Override // ws.i
    @k
    public ws.d a6() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void b3(byte b11, byte b12, int i11) throws IOException {
        k().a();
        i(new c());
        this.f96754a.write(f40002o);
    }

    @Override // ws.i
    public void b6() throws IOException {
        throw new UnsupportedOperationException();
    }

    public final void f() throws IOException {
        e s11 = this.f40005c.s();
        if (s11 == null) {
            throw new ProtocolException("stack underflow");
        }
        s11.b();
    }

    @Override // ws.i
    public void g6(@k String structName) throws IOException {
        g0.p(structName, "structName");
        k().a();
        i(new c());
        this.f96754a.write(f40002o);
        p1("__thriftStruct");
        p1(structName);
    }

    public final void i(e eVar) {
        this.f40005c.addFirst(eVar);
    }

    @Override // ws.i
    public void i5() throws IOException {
        this.f96754a.write(f40001n);
        f();
    }

    @k
    public final SimpleJsonProtocol j(@k BinaryOutputMode mode) {
        g0.p(mode, "mode");
        this.f40006d = mode;
        return this;
    }

    public final e k() {
        e h11 = this.f40005c.h();
        return h11 == null ? this.f40004b : h11;
    }

    @Override // ws.i
    public void l4() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void l5(int i11) throws IOException {
        k().a();
        this.f96754a.write(f0.X1(String.valueOf(i11)));
    }

    @Override // ws.i
    public void l8() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void o8() throws IOException {
        this.f96754a.write(f40001n);
        f();
    }

    @Override // ws.i
    public void p1(@k String str) throws IOException {
        g0.p(str, "str");
        k().a();
        int length = str.length();
        l60.k kVar = new l60.k();
        kVar.x4(34);
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                char[] cArr = f39995h[charAt];
                if (cArr != null) {
                    for (char c11 : cArr) {
                        kVar.x4(c11);
                    }
                } else {
                    kVar.x4(charAt);
                }
            } else {
                kVar.n5(String.valueOf(charAt));
            }
        }
        kVar.x4(34);
        byte[] w22 = kVar.w2();
        this.f96754a.write(w22, 0, w22.length);
    }

    @Override // ws.i
    public void q7(long j11) throws IOException {
        k().a();
        this.f96754a.write(f0.X1(String.valueOf(j11)));
    }

    @Override // ws.i
    public boolean readBool() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public byte readByte() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public double readDouble() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    @k
    public String readString() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public int s8() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void t4() throws IOException {
        W1();
    }

    @Override // ws.i
    public void u(byte b11) throws IOException {
        k().a();
        this.f96754a.write(f0.X1(String.valueOf((int) b11)));
    }

    @Override // ws.i
    @k
    public ws.k u0() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    @k
    public ws.f v4() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public short w6() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // ws.i
    public void writeDouble(double d11) throws IOException {
        k().a();
        this.f96754a.write(f0.X1(String.valueOf(d11)));
    }

    @Override // ws.i
    public void y2(byte b11, int i11) throws IOException {
        k().a();
        i(new b());
        this.f96754a.write(f40000m);
    }

    @Override // ws.i
    public void z1(@k ByteString buf) throws IOException {
        String hex;
        g0.p(buf, "buf");
        int i11 = d.f40012a[this.f40006d.ordinal()];
        if (i11 == 1) {
            hex = buf.hex();
        } else if (i11 == 2) {
            hex = buf.base64();
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            hex = buf.utf8();
        }
        p1(hex);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {
        public void a() throws IOException {
        }

        public void b() throws IOException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends e {
        @Override // com.microsoft.thrifty.protocol.SimpleJsonProtocol.e
        public void a() throws IOException {
        }
    }

    @Override // ws.i
    public void N2() throws IOException {
    }

    @Override // ws.i
    public void r0() throws IOException {
    }
}
