package wp;

import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c extends r {

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f96559a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* renamed from: b, reason: collision with root package name */
    public static final float f96560b = 0.25f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f96561c = 0.7f;

    /* renamed from: d, reason: collision with root package name */
    public static final int f96562d = 98;

    /* renamed from: e, reason: collision with root package name */
    public static final int f96563e = 99;

    /* renamed from: f, reason: collision with root package name */
    public static final int f96564f = 100;

    /* renamed from: g, reason: collision with root package name */
    public static final int f96565g = 101;

    /* renamed from: h, reason: collision with root package name */
    public static final int f96566h = 102;

    /* renamed from: i, reason: collision with root package name */
    public static final int f96567i = 97;

    /* renamed from: j, reason: collision with root package name */
    public static final int f96568j = 96;

    /* renamed from: k, reason: collision with root package name */
    public static final int f96569k = 101;

    /* renamed from: l, reason: collision with root package name */
    public static final int f96570l = 100;

    /* renamed from: m, reason: collision with root package name */
    public static final int f96571m = 103;

    /* renamed from: n, reason: collision with root package name */
    public static final int f96572n = 104;

    /* renamed from: o, reason: collision with root package name */
    public static final int f96573o = 105;

    /* renamed from: p, reason: collision with root package name */
    public static final int f96574p = 106;

    public static int h(kp.a aVar, int[] iArr, int i11) throws NotFoundException {
        r.f(aVar, i11, iArr);
        float f11 = 0.25f;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int[][] iArr2 = f96559a;
            if (i13 >= iArr2.length) {
                break;
            }
            float e11 = r.e(iArr, iArr2[i13], 0.7f);
            if (e11 < f11) {
                i12 = i13;
                f11 = e11;
            }
            i13++;
        }
        if (i12 >= 0) {
            return i12;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] i(kp.a aVar) throws NotFoundException {
        int m11 = aVar.m();
        int j11 = aVar.j(0);
        int[] iArr = new int[6];
        boolean z11 = false;
        int i11 = 0;
        int i12 = j11;
        while (j11 < m11) {
            if (aVar.h(j11) != z11) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 == 5) {
                    int i13 = -1;
                    float f11 = 0.25f;
                    for (int i14 = 103; i14 <= 105; i14++) {
                        float e11 = r.e(iArr, f96559a[i14], 0.7f);
                        if (e11 < f11) {
                            i13 = i14;
                            f11 = e11;
                        }
                    }
                    if (i13 >= 0 && aVar.o(Math.max(0, i12 - ((j11 - i12) / 2)), i12, false)) {
                        return new int[]{i12, j11, i13};
                    }
                    i12 += iArr[0] + iArr[1];
                    int i15 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i15);
                    iArr[i15] = 0;
                    iArr[i11] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArr[i11] = 1;
                z11 = !z11;
            }
            j11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        if (r9 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e1, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0139, code lost:
    
        if (r9 != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a3 A[PHI: r3 r9 r17 r21
      0x00a3: PHI (r3v7 boolean) = 
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v12 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
     binds: [B:25:0x008b, B:73:0x0114, B:74:0x0118, B:78:0x0125, B:77:0x0120, B:65:0x00f9, B:51:0x00e3, B:30:0x00a2, B:39:0x00c0, B:40:0x00c4, B:44:0x00d0, B:43:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r9v4 boolean) = 
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v11 boolean)
      (r9v12 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
     binds: [B:25:0x008b, B:73:0x0114, B:74:0x0118, B:78:0x0125, B:77:0x0120, B:65:0x00f9, B:51:0x00e3, B:30:0x00a2, B:39:0x00c0, B:40:0x00c4, B:44:0x00d0, B:43:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r17v2 boolean) = 
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v5 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
      (r17v1 boolean)
     binds: [B:25:0x008b, B:73:0x0114, B:74:0x0118, B:78:0x0125, B:77:0x0120, B:65:0x00f9, B:51:0x00e3, B:30:0x00a2, B:39:0x00c0, B:40:0x00c4, B:44:0x00d0, B:43:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r21v3 boolean) = 
      (r21v2 boolean)
      (r21v9 boolean)
      (r21v9 boolean)
      (r21v9 boolean)
      (r21v9 boolean)
      (r21v11 boolean)
      (r21v14 boolean)
      (r21v17 boolean)
      (r21v18 boolean)
      (r21v18 boolean)
      (r21v18 boolean)
      (r21v18 boolean)
     binds: [B:25:0x008b, B:73:0x0114, B:74:0x0118, B:78:0x0125, B:77:0x0120, B:65:0x00f9, B:51:0x00e3, B:30:0x00a2, B:39:0x00c0, B:40:0x00c4, B:44:0x00d0, B:43:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed A[PHI: r21
      0x00ed: PHI (r21v12 boolean) = (r21v9 boolean), (r21v18 boolean) binds: [B:73:0x0114, B:39:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // wp.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.zxing.k b(int r27, kp.a r28, java.util.Map<com.google.zxing.DecodeHintType, ?> r29) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp.c.b(int, kp.a, java.util.Map):com.google.zxing.k");
    }
}
