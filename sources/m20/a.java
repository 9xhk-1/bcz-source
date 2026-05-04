package m20;

import m80.k;
import n6.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f71793a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f71794b = false;

    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        f71793a = m.f74525c.equals(str);
    }

    public static /* synthetic */ void a(int i11) {
        String str = (i11 == 1 || i11 == 3 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 12 || i11 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 3 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 12 || i11 == 14) ? 2 : 3];
        if (i11 == 1 || i11 == 3 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 12 || i11 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i11 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i11 == 3) {
            objArr[1] = "encode8to7";
        } else if (i11 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i11 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i11 == 10) {
            objArr[1] = "dropMarker";
        } else if (i11 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i11 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i11) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 3 && i11 != 6 && i11 != 8 && i11 != 10 && i11 != 12 && i11 != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static void b(@k byte[] bArr, int i11) {
        if (bArr == null) {
            a(4);
        }
        int length = bArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i12] = (byte) ((bArr[i12] + i11) & 127);
        }
    }

    @k
    public static byte[] c(@k String[] strArr) {
        if (strArr == null) {
            a(11);
        }
        int i11 = 0;
        for (String str : strArr) {
            i11 += str.length();
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i13 = 0;
            while (i13 < length) {
                bArr[i12] = (byte) str2.charAt(i13);
                i13++;
                i12++;
            }
        }
        return bArr;
    }

    @k
    public static byte[] d(@k byte[] bArr) {
        if (bArr == null) {
            a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i11 + 1;
            int i15 = i12 + 1;
            bArr2[i13] = (byte) (((bArr[i11] & 255) >>> i12) + ((bArr[i14] & ((1 << i15) - 1)) << (7 - i12)));
            if (i12 == 6) {
                i11 += 2;
                i12 = 0;
            } else {
                i11 = i14;
                i12 = i15;
            }
        }
        return bArr2;
    }

    @k
    public static byte[] e(@k String[] strArr) {
        if (strArr == null) {
            a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                byte[] a11 = j.a(f(strArr));
                if (a11 == null) {
                    a(8);
                }
                return a11;
            }
            if (charAt == 65535) {
                strArr = f(strArr);
            }
        }
        byte[] c11 = c(strArr);
        b(c11, 127);
        return d(c11);
    }

    @k
    public static String[] f(@k String[] strArr) {
        if (strArr == null) {
            a(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
