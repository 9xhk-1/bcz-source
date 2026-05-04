package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class n extends r {

    /* renamed from: b, reason: collision with root package name */
    public static final float f96616b = 0.38f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f96617c = 0.5f;

    /* renamed from: d, reason: collision with root package name */
    public static final int f96618d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f96619e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f96620f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f96621g = {6, 8, 10, 12, 14};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f96622h = {1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    public static final int[][] f96623i = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: j, reason: collision with root package name */
    public static final int[][] f96624j = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    public int f96625a = -1;

    public static int h(int[] iArr) throws NotFoundException {
        int length = f96624j.length;
        float f11 = 0.38f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float e11 = r.e(iArr, f96624j[i12], 0.5f);
            if (e11 < f11) {
                i11 = i12;
                f11 = e11;
            } else if (e11 == f11) {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            return i11 % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static void j(kp.a aVar, int i11, int i12, StringBuilder sb2) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i11 < i12) {
            r.f(aVar, i11, iArr);
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = i13 * 2;
                iArr2[i13] = iArr[i14];
                iArr3[i13] = iArr[i14 + 1];
            }
            sb2.append((char) (h(iArr2) + 48));
            sb2.append((char) (h(iArr3) + 48));
            for (int i15 = 0; i15 < 10; i15++) {
                i11 += iArr[i15];
            }
        }
    }

    public static int[] l(kp.a aVar, int i11, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m11 = aVar.m();
        int i12 = i11;
        boolean z11 = false;
        int i13 = 0;
        while (i11 < m11) {
            if (aVar.h(i11) != z11) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else {
                    if (r.e(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i12, i11};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z11 = !z11;
            }
            i11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int m(kp.a aVar) throws NotFoundException {
        int m11 = aVar.m();
        int j11 = aVar.j(0);
        if (j11 != m11) {
            return j11;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // wp.r
    public com.google.zxing.k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws FormatException, NotFoundException {
        boolean z11;
        int[] k11 = k(aVar);
        int[] i12 = i(aVar);
        StringBuilder sb2 = new StringBuilder(20);
        j(aVar, k11[1], i12[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f96621g;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= length2) {
                z11 = false;
                break;
            }
            int i15 = iArr[i13];
            if (length == i15) {
                z11 = true;
                break;
            }
            if (i15 > i14) {
                i14 = i15;
            }
            i13++;
        }
        if (!z11 && length > i14) {
            z11 = true;
        }
        if (!z11) {
            throw FormatException.getFormatInstance();
        }
        float f11 = i11;
        return new com.google.zxing.k(sb3, null, new com.google.zxing.l[]{new com.google.zxing.l(k11[1], f11), new com.google.zxing.l(i12[0], f11)}, BarcodeFormat.ITF);
    }

    public final int[] i(kp.a aVar) throws NotFoundException {
        int[] l11;
        aVar.q();
        try {
            int m11 = m(aVar);
            try {
                l11 = l(aVar, m11, f96623i[0]);
            } catch (NotFoundException unused) {
                l11 = l(aVar, m11, f96623i[1]);
            }
            n(aVar, l11[0]);
            int i11 = l11[0];
            l11[0] = aVar.m() - l11[1];
            l11[1] = aVar.m() - i11;
            return l11;
        } finally {
            aVar.q();
        }
    }

    public final int[] k(kp.a aVar) throws NotFoundException {
        int[] l11 = l(aVar, m(aVar), f96622h);
        int i11 = l11[1];
        int i12 = l11[0];
        this.f96625a = (i11 - i12) / 4;
        n(aVar, i12);
        return l11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(kp.a r3, int r4) throws com.google.zxing.NotFoundException {
        /*
            r2 = this;
            int r0 = r2.f96625a
            int r0 = r0 * 10
            if (r0 >= r4) goto L7
            goto L8
        L7:
            r0 = r4
        L8:
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L19
            if (r4 < 0) goto L19
            boolean r1 = r3.h(r4)
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            com.google.zxing.NotFoundException r3 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wp.n.n(kp.a, int):void");
    }
}
