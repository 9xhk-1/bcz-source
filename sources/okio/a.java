package okio;

import java.util.Arrays;
import kotlin.jvm.internal.g0;
import l60.l1;
import m80.k;
import m80.l;
import okio.ByteString;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "-Base64")
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final byte[] f77532a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final byte[] f77533b;

    static {
        ByteString.a aVar = ByteString.Companion;
        f77532a = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        f77533b = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    @l
    public static final byte[] a(@k String str) {
        int i11;
        char charAt;
        g0.p(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i12 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char charAt2 = str.charAt(i16);
            if ('A' <= charAt2 && charAt2 < '[') {
                i11 = charAt2 - 'A';
            } else if ('a' <= charAt2 && charAt2 < '{') {
                i11 = charAt2 - 'G';
            } else if ('0' <= charAt2 && charAt2 < ':') {
                i11 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i11 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i11 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i14 = (i14 << 6) | i11;
            i13++;
            if (i13 % 4 == 0) {
                bArr[i15] = (byte) (i14 >> 16);
                int i17 = i15 + 2;
                bArr[i15 + 1] = (byte) (i14 >> 8);
                i15 += 3;
                bArr[i17] = (byte) i14;
            }
        }
        int i18 = i13 % 4;
        if (i18 == 1) {
            return null;
        }
        if (i18 == 2) {
            bArr[i15] = (byte) ((i14 << 12) >> 16);
            i15++;
        } else if (i18 == 3) {
            int i19 = i14 << 6;
            int i21 = i15 + 1;
            bArr[i15] = (byte) (i19 >> 16);
            i15 += 2;
            bArr[i21] = (byte) (i19 >> 8);
        }
        if (i15 == i12) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i15);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @k
    public static final String b(@k byte[] bArr, @k byte[] map) {
        g0.p(bArr, "<this>");
        g0.p(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            byte b11 = bArr[i11];
            int i13 = i11 + 2;
            byte b12 = bArr[i11 + 1];
            i11 += 3;
            byte b13 = bArr[i13];
            bArr2[i12] = map[(b11 & 255) >> 2];
            bArr2[i12 + 1] = map[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            int i14 = i12 + 3;
            bArr2[i12 + 2] = map[((b12 & 15) << 2) | ((b13 & 255) >> 6)];
            i12 += 4;
            bArr2[i14] = map[b13 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b14 = bArr[i11];
            bArr2[i12] = map[(b14 & 255) >> 2];
            bArr2[i12 + 1] = map[(b14 & 3) << 4];
            bArr2[i12 + 2] = 61;
            bArr2[i12 + 3] = 61;
        } else if (length2 == 2) {
            int i15 = i11 + 1;
            byte b15 = bArr[i11];
            byte b16 = bArr[i15];
            bArr2[i12] = map[(b15 & 255) >> 2];
            bArr2[i12 + 1] = map[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr2[i12 + 2] = map[(b16 & 15) << 2];
            bArr2[i12 + 3] = 61;
        }
        return l1.c(bArr2);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr2 = f77532a;
        }
        return b(bArr, bArr2);
    }

    @k
    public static final byte[] d() {
        return f77532a;
    }

    @k
    public static final byte[] e() {
        return f77533b;
    }
}
