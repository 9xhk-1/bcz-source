package op;

import com.google.zxing.FormatException;
import com.jiongji.andriod.card.R;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import kp.k;
import l70.f;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import qp.j;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f77610a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f77611b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f77612c;

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f77613d;

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f77614e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77615a;

        static {
            int[] iArr = new int[b.values().length];
            f77615a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77615a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77615a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77615a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77615a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {PublicSuffixDatabase.f77441i, '\"', '#', '$', '%', u0.f91708d, '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', f.f70689d, u0.f91709e, '=', u0.f91710f, s60.d.f88057a, '@', '[', '\\', l50.b.f69930l, '^', '_'};
        f77611b = cArr;
        f77612c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i};
        f77613d = cArr;
        f77614e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', l50.b.f69927i, '|', l50.b.f69928j, '~', 127};
    }

    public static kp.d a(byte[] bArr) throws FormatException {
        kp.c cVar = new kp.c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVar = b.ASCII_ENCODE;
        do {
            b bVar2 = b.ASCII_ENCODE;
            if (bVar == bVar2) {
                bVar = c(cVar, sb2, sb3);
            } else {
                int i11 = a.f77615a[bVar.ordinal()];
                if (i11 == 1) {
                    e(cVar, sb2);
                } else if (i11 == 2) {
                    g(cVar, sb2);
                } else if (i11 == 3) {
                    b(cVar, sb2);
                } else if (i11 == 4) {
                    f(cVar, sb2);
                } else {
                    if (i11 != 5) {
                        throw FormatException.getFormatInstance();
                    }
                    d(cVar, sb2, arrayList);
                }
                bVar = bVar2;
            }
            if (bVar == b.PAD_ENCODE) {
                break;
            }
        } while (cVar.a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String sb4 = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new kp.d(bArr, sb4, arrayList, null);
    }

    public static void b(kp.c cVar, StringBuilder sb2) throws FormatException {
        int d11;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (d11 = cVar.d(8)) != 254) {
            h(d11, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    sb2.append('\r');
                } else if (i12 == 1) {
                    sb2.append('*');
                } else if (i12 == 2) {
                    sb2.append(u0.f91710f);
                } else if (i12 == 3) {
                    sb2.append(' ');
                } else if (i12 < 14) {
                    sb2.append((char) (i12 + 44));
                } else {
                    if (i12 >= 40) {
                        throw FormatException.getFormatInstance();
                    }
                    sb2.append((char) (i12 + 51));
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static b c(kp.c cVar, StringBuilder sb2, StringBuilder sb3) throws FormatException {
        boolean z11 = false;
        do {
            int d11 = cVar.d(8);
            if (d11 == 0) {
                throw FormatException.getFormatInstance();
            }
            if (d11 > 128) {
                if (d11 != 129) {
                    if (d11 > 229) {
                        switch (d11) {
                            case R.styleable.Theme_drawable_tab_friends /* 230 */:
                                return b.C40_ENCODE;
                            case R.styleable.Theme_drawable_tab_friends_new /* 231 */:
                                return b.BASE256_ENCODE;
                            case R.styleable.Theme_drawable_tab_home /* 232 */:
                                sb2.append(sp.b.f88893o);
                                break;
                            case R.styleable.Theme_drawable_tab_lecture /* 233 */:
                            case R.styleable.Theme_drawable_tab_lecture_new /* 234 */:
                            case R.styleable.Theme_drawable_test_nodate /* 241 */:
                                break;
                            case R.styleable.Theme_drawable_tab_mall /* 235 */:
                                z11 = true;
                                break;
                            case R.styleable.Theme_drawable_tab_mall_1111 /* 236 */:
                                sb2.append(j.f82615l);
                                sb3.insert(0, j.f82617n);
                                break;
                            case R.styleable.Theme_drawable_tab_mall_new /* 237 */:
                                sb2.append(j.f82616m);
                                sb3.insert(0, j.f82617n);
                                break;
                            case R.styleable.Theme_drawable_tab_review /* 238 */:
                                return b.ANSIX12_ENCODE;
                            case R.styleable.Theme_drawable_tab_surrounding /* 239 */:
                                return b.TEXT_ENCODE;
                            case 240:
                                return b.EDIFACT_ENCODE;
                            default:
                                if (d11 != 254 || cVar.a() != 0) {
                                    throw FormatException.getFormatInstance();
                                }
                                break;
                        }
                    } else {
                        int i11 = d11 - 130;
                        if (i11 < 10) {
                            sb2.append('0');
                        }
                        sb2.append(i11);
                    }
                } else {
                    return b.PAD_ENCODE;
                }
            } else {
                if (z11) {
                    d11 += 128;
                }
                sb2.append((char) (d11 - 1));
                return b.ASCII_ENCODE;
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    public static void d(kp.c cVar, StringBuilder sb2, Collection<byte[]> collection) throws FormatException {
        int c11 = cVar.c();
        int i11 = c11 + 2;
        int i12 = i(cVar.d(8), c11 + 1);
        if (i12 == 0) {
            i12 = cVar.a() / 8;
        } else if (i12 >= 250) {
            i12 = ((i12 - 249) * 250) + i(cVar.d(8), i11);
            i11 = c11 + 3;
        }
        if (i12 < 0) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i12];
        int i13 = 0;
        while (i13 < i12) {
            if (cVar.a() < 8) {
                throw FormatException.getFormatInstance();
            }
            bArr[i13] = (byte) i(cVar.d(8), i11);
            i13++;
            i11++;
        }
        collection.add(bArr);
        try {
            sb2.append(new String(bArr, k.f68585f));
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e11)));
        }
    }

    public static void e(kp.c cVar, StringBuilder sb2) throws FormatException {
        int d11;
        int[] iArr = new int[3];
        boolean z11 = false;
        int i11 = 0;
        while (cVar.a() != 8 && (d11 = cVar.d(8)) != 254) {
            h(d11, cVar.d(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            char[] cArr = f77611b;
                            if (i13 < cArr.length) {
                                char c11 = cArr[i13];
                                if (z11) {
                                    sb2.append((char) (c11 + 128));
                                    z11 = false;
                                } else {
                                    sb2.append(c11);
                                }
                            } else if (i13 == 27) {
                                sb2.append(sp.b.f88893o);
                            } else {
                                if (i13 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z11 = true;
                            }
                            i11 = 0;
                        } else {
                            if (i11 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            if (z11) {
                                sb2.append((char) (i13 + 224));
                                z11 = false;
                                i11 = 0;
                            } else {
                                sb2.append((char) (i13 + 96));
                                i11 = 0;
                            }
                        }
                    } else if (z11) {
                        sb2.append((char) (i13 + 128));
                        z11 = false;
                        i11 = 0;
                    } else {
                        sb2.append((char) i13);
                        i11 = 0;
                    }
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr2 = f77610a;
                    if (i13 >= cArr2.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c12 = cArr2[i13];
                    if (z11) {
                        sb2.append((char) (c12 + 128));
                        z11 = false;
                    } else {
                        sb2.append(c12);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static void f(kp.c cVar, StringBuilder sb2) {
        while (cVar.a() > 16) {
            for (int i11 = 0; i11 < 4; i11++) {
                int d11 = cVar.d(6);
                if (d11 == 31) {
                    int b11 = 8 - cVar.b();
                    if (b11 != 8) {
                        cVar.d(b11);
                        return;
                    }
                    return;
                }
                if ((d11 & 32) == 0) {
                    d11 |= 64;
                }
                sb2.append((char) d11);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static void g(kp.c cVar, StringBuilder sb2) throws FormatException {
        int d11;
        int[] iArr = new int[3];
        boolean z11 = false;
        int i11 = 0;
        while (cVar.a() != 8 && (d11 = cVar.d(8)) != 254) {
            h(d11, cVar.d(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            char[] cArr = f77613d;
                            if (i13 < cArr.length) {
                                char c11 = cArr[i13];
                                if (z11) {
                                    sb2.append((char) (c11 + 128));
                                    z11 = false;
                                } else {
                                    sb2.append(c11);
                                }
                            } else if (i13 == 27) {
                                sb2.append(sp.b.f88893o);
                            } else {
                                if (i13 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z11 = true;
                            }
                            i11 = 0;
                        } else {
                            if (i11 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            char[] cArr2 = f77614e;
                            if (i13 >= cArr2.length) {
                                throw FormatException.getFormatInstance();
                            }
                            char c12 = cArr2[i13];
                            if (z11) {
                                sb2.append((char) (c12 + 128));
                                z11 = false;
                                i11 = 0;
                            } else {
                                sb2.append(c12);
                                i11 = 0;
                            }
                        }
                    } else if (z11) {
                        sb2.append((char) (i13 + 128));
                        z11 = false;
                        i11 = 0;
                    } else {
                        sb2.append((char) i13);
                        i11 = 0;
                    }
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr3 = f77612c;
                    if (i13 >= cArr3.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c13 = cArr3[i13];
                    if (z11) {
                        sb2.append((char) (c13 + 128));
                        z11 = false;
                    } else {
                        sb2.append(c13);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static void h(int i11, int i12, int[] iArr) {
        int i13 = ((i11 << 8) + i12) - 1;
        int i14 = i13 / 1600;
        iArr[0] = i14;
        int i15 = i13 - (i14 * 1600);
        int i16 = i15 / 40;
        iArr[1] = i16;
        iArr[2] = i15 - (i16 * 40);
    }

    public static int i(int i11, int i12) {
        int i13 = i11 - (((i12 * 149) % 255) + 1);
        return i13 >= 0 ? i13 : i13 + 256;
    }
}
