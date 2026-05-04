package gq;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kp.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f54004a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final int f54005b = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54006a;

        static {
            int[] iArr = new int[Mode.values().length];
            f54006a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54006a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54006a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54006a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54006a[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54006a[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54006a[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54006a[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f54006a[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f54006a[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static kp.d a(byte[] bArr, h hVar, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        byte[] bArr2 = bArr;
        kp.c cVar = new kp.c(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i11 = -1;
        int i12 = -1;
        boolean z11 = false;
        CharacterSetECI characterSetECI = null;
        while (true) {
            try {
                Mode forBits = cVar.a() < 4 ? Mode.TERMINATOR : Mode.forBits(cVar.d(4));
                int[] iArr = a.f54006a;
                switch (iArr[forBits.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z11 = true;
                        break;
                    case 8:
                        if (cVar.a() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        i11 = cVar.d(8);
                        i12 = cVar.d(8);
                        break;
                    case 9:
                        characterSetECI = CharacterSetECI.getCharacterSetECIByValue(g(cVar));
                        if (characterSetECI == null) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 10:
                        int d11 = cVar.d(4);
                        int d12 = cVar.d(forBits.getCharacterCountBits(hVar));
                        if (d11 == 1) {
                            d(cVar, sb2, d12);
                            break;
                        }
                        break;
                    default:
                        int d13 = cVar.d(forBits.getCharacterCountBits(hVar));
                        int i13 = iArr[forBits.ordinal()];
                        if (i13 == 1) {
                            f(cVar, sb2, d13);
                            break;
                        } else if (i13 == 2) {
                            b(cVar, sb2, d13, z11);
                            break;
                        } else if (i13 == 3) {
                            c(cVar, sb2, d13, characterSetECI, arrayList, map);
                            break;
                        } else {
                            if (i13 != 4) {
                                throw FormatException.getFormatInstance();
                            }
                            e(cVar, sb2, d13);
                            break;
                        }
                }
                if (forBits == Mode.TERMINATOR) {
                    String sb3 = sb2.toString();
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    return new kp.d(bArr2, sb3, arrayList, errorCorrectionLevel != null ? errorCorrectionLevel.toString() : null, i11, i12);
                }
                bArr2 = bArr;
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    public static void b(kp.c cVar, StringBuilder sb2, int i11, boolean z11) throws FormatException {
        while (i11 > 1) {
            if (cVar.a() < 11) {
                throw FormatException.getFormatInstance();
            }
            int d11 = cVar.d(11);
            sb2.append(h(d11 / 45));
            sb2.append(h(d11 % 45));
            i11 -= 2;
        }
        if (i11 == 1) {
            if (cVar.a() < 6) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(h(cVar.d(6)));
        }
        if (z11) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i12 = length + 1;
                        if (sb2.charAt(i12) == '%') {
                            sb2.deleteCharAt(i12);
                        }
                    }
                    sb2.setCharAt(length, sp.b.f88893o);
                }
            }
        }
    }

    public static void c(kp.c cVar, StringBuilder sb2, int i11, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        if ((i11 << 3) > cVar.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) cVar.d(8);
        }
        try {
            sb2.append(new String(bArr, characterSetECI == null ? k.a(bArr, map) : characterSetECI.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void d(kp.c cVar, StringBuilder sb2, int i11) throws FormatException {
        if (i11 * 13 > cVar.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i11 * 2];
        int i12 = 0;
        while (i11 > 0) {
            int d11 = cVar.d(13);
            int i13 = (d11 % 96) | ((d11 / 96) << 8);
            int i14 = i13 + (i13 < 959 ? 41377 : 42657);
            bArr[i12] = (byte) (i14 >> 8);
            bArr[i12 + 1] = (byte) i14;
            i12 += 2;
            i11--;
        }
        try {
            sb2.append(new String(bArr, k.f68582c));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void e(kp.c cVar, StringBuilder sb2, int i11) throws FormatException {
        if (i11 * 13 > cVar.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i11 * 2];
        int i12 = 0;
        while (i11 > 0) {
            int d11 = cVar.d(13);
            int i13 = (d11 % 192) | ((d11 / 192) << 8);
            int i14 = i13 + (i13 < 7936 ? 33088 : 49472);
            bArr[i12] = (byte) (i14 >> 8);
            bArr[i12 + 1] = (byte) i14;
            i12 += 2;
            i11--;
        }
        try {
            sb2.append(new String(bArr, k.f68581b));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void f(kp.c cVar, StringBuilder sb2, int i11) throws FormatException {
        while (i11 >= 3) {
            if (cVar.a() < 10) {
                throw FormatException.getFormatInstance();
            }
            int d11 = cVar.d(10);
            if (d11 >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(h(d11 / 100));
            sb2.append(h((d11 / 10) % 10));
            sb2.append(h(d11 % 10));
            i11 -= 3;
        }
        if (i11 == 2) {
            if (cVar.a() < 7) {
                throw FormatException.getFormatInstance();
            }
            int d12 = cVar.d(7);
            if (d12 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(h(d12 / 10));
            sb2.append(h(d12 % 10));
            return;
        }
        if (i11 == 1) {
            if (cVar.a() < 4) {
                throw FormatException.getFormatInstance();
            }
            int d13 = cVar.d(4);
            if (d13 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(h(d13));
        }
    }

    public static int g(kp.c cVar) throws FormatException {
        int d11 = cVar.d(8);
        if ((d11 & 128) == 0) {
            return d11 & 127;
        }
        if ((d11 & 192) == 128) {
            return cVar.d(8) | ((d11 & 63) << 8);
        }
        if ((d11 & 224) == 192) {
            return cVar.d(16) | ((d11 & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    public static char h(int i11) throws FormatException {
        char[] cArr = f54004a;
        if (i11 < cArr.length) {
            return cArr[i11];
        }
        throw FormatException.getFormatInstance();
    }
}
