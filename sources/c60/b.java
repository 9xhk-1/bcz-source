package c60;

import kotlin.jvm.internal.g0;
import m80.k;
import okio.ByteString;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f8140c = 16384;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8141d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8142e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8143f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8144g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8145h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8146i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8147j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8148k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f8149l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f8150m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f8151n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f8152o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f8153p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f8154q = 4;

    /* renamed from: r, reason: collision with root package name */
    public static final int f8155r = 4;

    /* renamed from: s, reason: collision with root package name */
    public static final int f8156s = 8;

    /* renamed from: t, reason: collision with root package name */
    public static final int f8157t = 32;

    /* renamed from: u, reason: collision with root package name */
    public static final int f8158u = 32;

    /* renamed from: x, reason: collision with root package name */
    @k
    public static final String[] f8161x;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f8138a = new b();

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public static final ByteString f8139b = ByteString.Companion.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: v, reason: collision with root package name */
    @k
    public static final String[] f8159v = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final String[] f8160w = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            g0.o(binaryString, "toBinaryString(it)");
            strArr[i11] = f0.y2(u50.f.y("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f8161x = strArr;
        String[] strArr2 = f8160w;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = strArr2[i12] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            int i15 = iArr[0];
            String[] strArr3 = f8160w;
            int i16 = i15 | i14;
            strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
            strArr3[i16 | 8] = strArr3[i15] + '|' + strArr3[i14] + "|PADDED";
        }
        int length = f8160w.length;
        for (int i17 = 0; i17 < length; i17++) {
            String[] strArr4 = f8160w;
            if (strArr4[i17] == null) {
                strArr4[i17] = f8161x[i17];
            }
        }
    }

    @k
    public final String a(int i11, int i12) {
        String str;
        if (i12 == 0) {
            return "";
        }
        if (i11 != 2 && i11 != 3) {
            if (i11 == 4 || i11 == 6) {
                return i12 == 1 ? "ACK" : f8161x[i12];
            }
            if (i11 != 7 && i11 != 8) {
                String[] strArr = f8160w;
                if (i12 < strArr.length) {
                    str = strArr[i12];
                    g0.m(str);
                } else {
                    str = f8161x[i12];
                }
                String str2 = str;
                return (i11 != 5 || (i12 & 4) == 0) ? (i11 != 0 || (i12 & 32) == 0) ? str2 : f0.z2(str2, "PRIORITY", "COMPRESSED", false, 4, null) : f0.z2(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f8161x[i12];
    }

    @k
    public final String b(int i11) {
        String[] strArr = f8159v;
        return i11 < strArr.length ? strArr[i11] : u50.f.y("0x%02x", Integer.valueOf(i11));
    }

    @k
    public final String c(boolean z11, int i11, int i12, int i13, int i14) {
        return u50.f.y("%s 0x%08x %5d %-13s %s", z11 ? "<<" : ">>", Integer.valueOf(i11), Integer.valueOf(i12), b(i13), a(i13, i14));
    }
}
