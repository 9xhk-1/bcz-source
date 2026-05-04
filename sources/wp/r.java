package wp;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class r implements com.google.zxing.j {
    public static float e(int[] iArr, int[] iArr2, float f11) {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            i11 += iArr[i13];
            i12 += iArr2[i13];
        }
        if (i11 < i12) {
            return Float.POSITIVE_INFINITY;
        }
        float f12 = i11;
        float f13 = f12 / i12;
        float f14 = f11 * f13;
        float f15 = 0.0f;
        for (int i14 = 0; i14 < length; i14++) {
            float f16 = iArr2[i14] * f13;
            float f17 = iArr[i14];
            float f18 = f17 > f16 ? f17 - f16 : f16 - f17;
            if (f18 > f14) {
                return Float.POSITIVE_INFINITY;
            }
            f15 += f18;
        }
        return f15 / f12;
    }

    public static void f(kp.a aVar, int i11, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i12 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int m11 = aVar.m();
        if (i11 >= m11) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z11 = !aVar.h(i11);
        while (i11 < m11) {
            if (aVar.h(i11) == z11) {
                i12++;
                if (i12 == length) {
                    break;
                }
                iArr[i12] = 1;
                z11 = !z11;
            } else {
                iArr[i12] = iArr[i12] + 1;
            }
            i11++;
        }
        if (i12 != length) {
            if (i12 != length - 1 || i11 != m11) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void g(kp.a aVar, int i11, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean h11 = aVar.h(i11);
        while (i11 > 0 && length >= 0) {
            i11--;
            if (aVar.h(i11) != h11) {
                length--;
                h11 = !h11;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        f(aVar, i11 + 1, iArr);
    }

    @Override // com.google.zxing.j
    public com.google.zxing.k a(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return d(bVar, map);
        } catch (NotFoundException e11) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !bVar.g()) {
                throw e11;
            }
            com.google.zxing.b h11 = bVar.h();
            com.google.zxing.k d11 = d(h11, map);
            Map<ResultMetadataType, Object> e12 = d11.e();
            int i11 = 270;
            if (e12 != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (e12.containsKey(resultMetadataType)) {
                    i11 = (((Integer) e12.get(resultMetadataType)).intValue() + 270) % 360;
                }
            }
            d11.j(ResultMetadataType.ORIENTATION, Integer.valueOf(i11));
            com.google.zxing.l[] f11 = d11.f();
            if (f11 != null) {
                int d12 = h11.d();
                for (int i12 = 0; i12 < f11.length; i12++) {
                    f11[i12] = new com.google.zxing.l((d12 - f11[i12].d()) - 1.0f, f11[i12].c());
                }
            }
            return d11;
        }
    }

    public abstract com.google.zxing.k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    @Override // com.google.zxing.j
    public com.google.zxing.k c(com.google.zxing.b bVar) throws NotFoundException, FormatException {
        return a(bVar, null);
    }

    public final com.google.zxing.k d(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        Map<DecodeHintType, ?> map2;
        int i11;
        int i12;
        Map<DecodeHintType, ?> map3 = map;
        int e11 = bVar.e();
        int d11 = bVar.d();
        kp.a aVar = new kp.a(e11);
        int i13 = 1;
        boolean z11 = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int max = Math.max(1, d11 >> (z11 ? 8 : 5));
        int i14 = z11 ? d11 : 15;
        int i15 = d11 / 2;
        int i16 = 0;
        while (i16 < i14) {
            int i17 = i16 + 1;
            int i18 = i17 / 2;
            if ((i16 & 1) != 0) {
                i18 = -i18;
            }
            int i19 = (i18 * max) + i15;
            if (i19 < 0 || i19 >= d11) {
                break;
            }
            try {
                aVar = bVar.c(i19, aVar);
                int i21 = 0;
                while (i21 < 2) {
                    if (i21 == i13) {
                        aVar.q();
                        if (map3 != null) {
                            DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(decodeHintType)) {
                                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                                enumMap.putAll(map3);
                                enumMap.remove(decodeHintType);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        com.google.zxing.k b11 = b(i19, aVar, map3);
                        if (i21 == i13) {
                            try {
                                b11.j(ResultMetadataType.ORIENTATION, 180);
                                com.google.zxing.l[] f11 = b11.f();
                                if (f11 != null) {
                                    i12 = i13;
                                    float f12 = e11;
                                    try {
                                        map2 = map3;
                                    } catch (ReaderException unused) {
                                        map2 = map3;
                                    }
                                    try {
                                        i11 = e11;
                                        try {
                                            f11[0] = new com.google.zxing.l((f12 - f11[0].c()) - 1.0f, f11[0].d());
                                            f11[i12] = new com.google.zxing.l((f12 - f11[i12].c()) - 1.0f, f11[i12].d());
                                        } catch (ReaderException unused2) {
                                            continue;
                                            i21++;
                                            map3 = map2;
                                            i13 = i12;
                                            e11 = i11;
                                        }
                                    } catch (ReaderException unused3) {
                                        i11 = e11;
                                        i21++;
                                        map3 = map2;
                                        i13 = i12;
                                        e11 = i11;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = map3;
                                i11 = e11;
                                i12 = i13;
                            }
                        }
                        return b11;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i11 = e11;
                        i12 = i13;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i16 = i17;
            i13 = i13;
            e11 = e11;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.j
    public void reset() {
    }
}
