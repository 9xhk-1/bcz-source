package gp;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import c1.g;
import com.alipay.sdk.m.u.i;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import en.r;
import java.util.Arrays;
import kp.d;
import mp.c;
import org.junit.jupiter.api.j2;
import pn.j;
import yr.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f53975b = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f53976c = {"CTRL_PS", " ", "a", e.f100279a, "c", "d", "e", "f", "g", CmcdData.STREAMING_FORMAT_HLS, "i", "j", "k", "l", "m", "n", "o", "p", "q", r.f50027a, "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f53977d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", g.f7467d, "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", EmailAutoCompleteEditText.f17091d, "\\", "^", "_", "`", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, Constants.WAVE_SEPARATOR, "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f53978e = {"", g.f7467d, "\r\n", ". ", j2.O, ": ", "!", "\"", "#", "$", "%", "&", "'", j.f81006c, j.f81007d, "*", "+", ",", Constants.ACCEPT_TIME_SEPARATOR_SERVER, ".", "/", ":", i.f11097b, "<", ContainerUtils.KEY_VALUE_DELIMITER, ">", "?", "[", "]", "{", i.f11099d, "CTRL_UL"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f53979f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO, "7", com.tencent.connect.common.Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, com.tencent.connect.common.Constants.VIA_SHARE_TYPE_MINI_PROGRAM, ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a, reason: collision with root package name */
    public fp.a f53980a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gp.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0642a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53981a;

        static {
            int[] iArr = new int[b.values().length];
            f53981a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53981a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53981a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53981a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53981a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = i(zArr, i11 << 3);
        }
        return bArr;
    }

    public static String e(b bVar, int i11) {
        int i12 = C0642a.f53981a[bVar.ordinal()];
        if (i12 == 1) {
            return f53975b[i11];
        }
        if (i12 == 2) {
            return f53976c[i11];
        }
        if (i12 == 3) {
            return f53977d[i11];
        }
        if (i12 == 4) {
            return f53978e[i11];
        }
        if (i12 == 5) {
            return f53979f[i11];
        }
        throw new IllegalStateException("Bad table");
    }

    public static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        b bVar2 = bVar;
        int i11 = 0;
        while (i11 < length) {
            if (bVar != b.BINARY) {
                int i12 = bVar == b.DIGIT ? 4 : 5;
                if (length - i11 < i12) {
                    break;
                }
                int j11 = j(zArr, i11, i12);
                i11 += i12;
                String e11 = e(bVar, j11);
                if (e11.startsWith("CTRL_")) {
                    bVar2 = g(e11.charAt(5));
                    if (e11.charAt(6) != 'L') {
                        bVar2 = bVar;
                        bVar = bVar2;
                    }
                } else {
                    sb2.append(e11);
                }
                bVar = bVar2;
            } else {
                if (length - i11 < 5) {
                    break;
                }
                int j12 = j(zArr, i11, 5);
                int i13 = i11 + 5;
                if (j12 == 0) {
                    if (length - i13 < 11) {
                        break;
                    }
                    j12 = j(zArr, i13, 11) + 31;
                    i13 = i11 + 16;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= j12) {
                        i11 = i13;
                        break;
                    }
                    if (length - i13 < 8) {
                        i11 = length;
                        break;
                    }
                    sb2.append((char) j(zArr, i13, 8));
                    i13 += 8;
                    i14++;
                }
                bVar = bVar2;
            }
        }
        return sb2.toString();
    }

    public static b g(char c11) {
        return c11 != 'B' ? c11 != 'D' ? c11 != 'P' ? c11 != 'L' ? c11 != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : b.DIGIT : b.BINARY;
    }

    public static String h(boolean[] zArr) {
        return f(zArr);
    }

    public static byte i(boolean[] zArr, int i11) {
        int length = zArr.length - i11;
        return (byte) (length >= 8 ? j(zArr, i11, 8) : j(zArr, i11, length) << (8 - length));
    }

    public static int j(boolean[] zArr, int i11, int i12) {
        int i13 = 0;
        for (int i14 = i11; i14 < i11 + i12; i14++) {
            i13 <<= 1;
            if (zArr[i14]) {
                i13 |= 1;
            }
        }
        return i13;
    }

    public static int k(int i11, boolean z11) {
        return ((z11 ? 88 : 112) + (i11 << 4)) * i11;
    }

    public final boolean[] b(boolean[] zArr) throws FormatException {
        int i11;
        mp.a aVar;
        if (this.f53980a.d() <= 2) {
            aVar = mp.a.f73613j;
            i11 = 6;
        } else {
            i11 = 8;
            if (this.f53980a.d() <= 8) {
                aVar = mp.a.f73617n;
            } else if (this.f53980a.d() <= 22) {
                aVar = mp.a.f73612i;
                i11 = 10;
            } else {
                aVar = mp.a.f73611h;
                i11 = 12;
            }
        }
        int c11 = this.f53980a.c();
        int length = zArr.length / i11;
        if (length < c11) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i11;
        int[] iArr = new int[length];
        int i12 = 0;
        while (i12 < length) {
            iArr[i12] = j(zArr, length2, i11);
            i12++;
            length2 += i11;
        }
        try {
            new c(aVar).a(iArr, length - c11);
            int i13 = 1 << i11;
            int i14 = i13 - 1;
            int i15 = 0;
            for (int i16 = 0; i16 < c11; i16++) {
                int i17 = iArr[i16];
                if (i17 == 0 || i17 == i14) {
                    throw FormatException.getFormatInstance();
                }
                if (i17 == 1 || i17 == i13 - 2) {
                    i15++;
                }
            }
            boolean[] zArr2 = new boolean[(c11 * i11) - i15];
            int i18 = 0;
            for (int i19 = 0; i19 < c11; i19++) {
                int i21 = iArr[i19];
                if (i21 == 1 || i21 == i13 - 2) {
                    Arrays.fill(zArr2, i18, (i18 + i11) - 1, i21 > 1);
                    i18 += i11 - 1;
                } else {
                    int i22 = i11 - 1;
                    while (i22 >= 0) {
                        int i23 = i18 + 1;
                        zArr2[i18] = ((1 << i22) & i21) != 0;
                        i22--;
                        i18 = i23;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e11) {
            throw FormatException.getFormatInstance(e11);
        }
    }

    public d c(fp.a aVar) throws FormatException {
        this.f53980a = aVar;
        boolean[] b11 = b(d(aVar.a()));
        d dVar = new d(a(b11), f(b11), null, null);
        dVar.n(b11.length);
        return dVar;
    }

    public final boolean[] d(kp.b bVar) {
        boolean e11 = this.f53980a.e();
        int d11 = this.f53980a.d();
        int i11 = (e11 ? 11 : 14) + (d11 << 2);
        int[] iArr = new int[i11];
        boolean[] zArr = new boolean[k(d11, e11)];
        int i12 = 2;
        if (e11) {
            for (int i13 = 0; i13 < i11; i13++) {
                iArr[i13] = i13;
            }
        } else {
            int i14 = i11 / 2;
            int i15 = ((i11 + 1) + (((i14 - 1) / 15) * 2)) / 2;
            for (int i16 = 0; i16 < i14; i16++) {
                iArr[(i14 - i16) - 1] = (i15 - r12) - 1;
                iArr[i14 + i16] = (i16 / 15) + i16 + i15 + 1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < d11) {
            int i19 = ((d11 - i17) << i12) + (e11 ? 9 : 12);
            int i21 = i17 << 1;
            int i22 = (i11 - 1) - i21;
            int i23 = 0;
            while (i23 < i19) {
                int i24 = i23 << 1;
                int i25 = 0;
                while (i25 < i12) {
                    int i26 = i21 + i25;
                    int i27 = i21 + i23;
                    zArr[i18 + i24 + i25] = bVar.e(iArr[i26], iArr[i27]);
                    int i28 = i22 - i25;
                    zArr[(i19 * 2) + i18 + i24 + i25] = bVar.e(iArr[i27], iArr[i28]);
                    int i29 = iArr[i28];
                    int i31 = i22 - i23;
                    zArr[(i19 * 4) + i18 + i24 + i25] = bVar.e(i29, iArr[i31]);
                    zArr[(i19 * 6) + i18 + i24 + i25] = bVar.e(iArr[i31], iArr[i26]);
                    i25++;
                    i12 = 2;
                }
                i23++;
                i12 = 2;
            }
            i18 += i19 << 3;
            i17++;
            i12 = 2;
        }
        return zArr;
    }
}
