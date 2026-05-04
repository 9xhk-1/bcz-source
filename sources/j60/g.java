package j60;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.k;
import m80.k;
import m80.l;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSocketProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketProtocol.kt\nokhttp3/internal/ws/WebSocketProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f63619a = new g();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f63620b = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* renamed from: c, reason: collision with root package name */
    public static final int f63621c = 128;

    /* renamed from: d, reason: collision with root package name */
    public static final int f63622d = 64;

    /* renamed from: e, reason: collision with root package name */
    public static final int f63623e = 32;

    /* renamed from: f, reason: collision with root package name */
    public static final int f63624f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static final int f63625g = 15;

    /* renamed from: h, reason: collision with root package name */
    public static final int f63626h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f63627i = 128;

    /* renamed from: j, reason: collision with root package name */
    public static final int f63628j = 127;

    /* renamed from: k, reason: collision with root package name */
    public static final int f63629k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f63630l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f63631m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f63632n = 8;

    /* renamed from: o, reason: collision with root package name */
    public static final int f63633o = 9;

    /* renamed from: p, reason: collision with root package name */
    public static final int f63634p = 10;

    /* renamed from: q, reason: collision with root package name */
    public static final long f63635q = 125;

    /* renamed from: r, reason: collision with root package name */
    public static final long f63636r = 123;

    /* renamed from: s, reason: collision with root package name */
    public static final int f63637s = 126;

    /* renamed from: t, reason: collision with root package name */
    public static final long f63638t = 65535;

    /* renamed from: u, reason: collision with root package name */
    public static final int f63639u = 127;

    /* renamed from: v, reason: collision with root package name */
    public static final int f63640v = 1001;

    /* renamed from: w, reason: collision with root package name */
    public static final int f63641w = 1005;

    @k
    public final String a(@k String key) {
        g0.p(key, "key");
        return ByteString.Companion.l(key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
    }

    @l
    public final String b(int i11) {
        if (i11 < 1000 || i11 >= 5000) {
            return "Code must be in range [1000,5000): " + i11;
        }
        if ((1004 > i11 || i11 >= 1007) && (1015 > i11 || i11 >= 3000)) {
            return null;
        }
        return "Code " + i11 + " is reserved and may not be used.";
    }

    public final void c(@k k.a cursor, @m80.k byte[] key) {
        g0.p(cursor, "cursor");
        g0.p(key, "key");
        int length = key.length;
        int i11 = 0;
        do {
            byte[] bArr = cursor.f70452e;
            int i12 = cursor.f70453f;
            int i13 = cursor.f70454g;
            if (bArr != null) {
                while (i12 < i13) {
                    int i14 = i11 % length;
                    bArr[i12] = (byte) (bArr[i12] ^ key[i14]);
                    i12++;
                    i11 = i14 + 1;
                }
            }
        } while (cursor.e() != -1);
    }

    public final void d(int i11) {
        String b11 = b(i11);
        if (b11 == null) {
            return;
        }
        g0.m(b11);
        throw new IllegalArgumentException(b11.toString());
    }
}
