package hq;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import com.google.zxing.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static final int f59751f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f59752g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f59753h = 97;

    /* renamed from: a, reason: collision with root package name */
    public final kp.b f59754a;

    /* renamed from: b, reason: collision with root package name */
    public final List<d> f59755b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f59756c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f59757d;

    /* renamed from: e, reason: collision with root package name */
    public final m f59758e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Serializable, Comparator<d> {

        /* renamed from: a, reason: collision with root package name */
        public final float f59759a;

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            int compare = Integer.compare(dVar2.h(), dVar.h());
            return compare == 0 ? Float.compare(Math.abs(dVar.i() - this.f59759a), Math.abs(dVar2.i() - this.f59759a)) : compare;
        }

        public b(float f11) {
            this.f59759a = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Serializable, Comparator<d> {

        /* renamed from: a, reason: collision with root package name */
        public final float f59760a;

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return Float.compare(Math.abs(dVar2.i() - this.f59760a), Math.abs(dVar.i() - this.f59760a));
        }

        public c(float f11) {
            this.f59760a = f11;
        }
    }

    public e(kp.b bVar) {
        this(bVar, null);
    }

    public static float a(int[] iArr, int i11) {
        return ((i11 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean h(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            int i13 = iArr[i12];
            if (i13 == 0) {
                return false;
            }
            i11 += i13;
        }
        if (i11 < 7) {
            return false;
        }
        float f11 = i11 / 7.0f;
        float f12 = f11 / 2.0f;
        return Math.abs(f11 - ((float) iArr[0])) < f12 && Math.abs(f11 - ((float) iArr[1])) < f12 && Math.abs((f11 * 3.0f) - ((float) iArr[2])) < 3.0f * f12 && Math.abs(f11 - ((float) iArr[3])) < f12 && Math.abs(f11 - ((float) iArr[4])) < f12;
    }

    public static boolean i(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            int i13 = iArr[i12];
            if (i13 == 0) {
                return false;
            }
            i11 += i13;
        }
        if (i11 < 7) {
            return false;
        }
        float f11 = i11 / 7.0f;
        float f12 = f11 / 1.333f;
        return Math.abs(f11 - ((float) iArr[0])) < f12 && Math.abs(f11 - ((float) iArr[1])) < f12 && Math.abs((f11 * 3.0f) - ((float) iArr[2])) < 3.0f * f12 && Math.abs(f11 - ((float) iArr[3])) < f12 && Math.abs(f11 - ((float) iArr[4])) < f12;
    }

    public final void b(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = 0;
        }
    }

    public final boolean c(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int[] j11 = j();
        int i16 = 0;
        while (i11 >= i16 && i12 >= i16 && this.f59754a.e(i12 - i16, i11 - i16)) {
            j11[2] = j11[2] + 1;
            i16++;
        }
        if (j11[2] == 0) {
            return false;
        }
        while (i11 >= i16 && i12 >= i16 && !this.f59754a.e(i12 - i16, i11 - i16)) {
            j11[1] = j11[1] + 1;
            i16++;
        }
        if (j11[1] == 0) {
            return false;
        }
        while (i11 >= i16 && i12 >= i16 && this.f59754a.e(i12 - i16, i11 - i16)) {
            j11[0] = j11[0] + 1;
            i16++;
        }
        if (j11[0] == 0) {
            return false;
        }
        int h11 = this.f59754a.h();
        int m11 = this.f59754a.m();
        int i17 = 1;
        while (true) {
            int i18 = i11 + i17;
            if (i18 >= h11 || (i15 = i12 + i17) >= m11 || !this.f59754a.e(i15, i18)) {
                break;
            }
            j11[2] = j11[2] + 1;
            i17++;
        }
        while (true) {
            int i19 = i11 + i17;
            if (i19 >= h11 || (i14 = i12 + i17) >= m11 || this.f59754a.e(i14, i19)) {
                break;
            }
            j11[3] = j11[3] + 1;
            i17++;
        }
        if (j11[3] == 0) {
            return false;
        }
        while (true) {
            int i21 = i11 + i17;
            if (i21 >= h11 || (i13 = i12 + i17) >= m11 || !this.f59754a.e(i13, i21)) {
                break;
            }
            j11[4] = j11[4] + 1;
            i17++;
        }
        if (j11[4] == 0) {
            return false;
        }
        return i(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0082, code lost:
    
        if (r2[3] < r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
    
        if (r11 >= r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008c, code lost:
    
        if (r0.e(r11, r12) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008e, code lost:
    
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0090, code lost:
    
        if (r9 >= r13) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
    
        if (r12 < r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009d, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b1, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b3, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b8, code lost:
    
        if (h(r2) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00be, code lost:
    
        return a(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float d(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            kp.b r0 = r10.f59754a
            int r1 = r0.m()
            int[] r2 = r10.j()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.e(r3, r12)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.e(r3, r12)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lbf
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lbf
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.e(r3, r12)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.e(r11, r12)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.e(r11, r12)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lbf
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lbf
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.e(r11, r12)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            if (r12 < r14) goto Lb4
            return r6
        Lb4:
            boolean r12 = h(r2)
            if (r12 == 0) goto Lbf
            float r11 = a(r2, r11)
            return r11
        Lbf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hq.e.d(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0082, code lost:
    
        if (r2[3] < r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
    
        if (r11 >= r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008c, code lost:
    
        if (r0.e(r12, r11) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008e, code lost:
    
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0090, code lost:
    
        if (r9 >= r13) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
    
        if (r12 < r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009d, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b2, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b4, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b9, code lost:
    
        if (h(r2) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bf, code lost:
    
        return a(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float e(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            kp.b r0 = r10.f59754a
            int r1 = r0.h()
            int[] r2 = r10.j()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.e(r12, r3)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.e(r12, r3)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lc0
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lc0
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.e(r12, r3)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.e(r12, r11)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.e(r12, r11)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lc0
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lc0
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.e(r12, r11)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            int r14 = r14 * r4
            if (r12 < r14) goto Lb5
            return r6
        Lb5:
            boolean r12 = h(r2)
            if (r12 == 0) goto Lc0
            float r11 = a(r2, r11)
            return r11
        Lc0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hq.e.e(int, int, int, int):float");
    }

    public final f f(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z11 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int h11 = this.f59754a.h();
        int m11 = this.f59754a.m();
        int i11 = (h11 * 3) / 388;
        if (i11 < 3 || z11) {
            i11 = 3;
        }
        int[] iArr = new int[5];
        int i12 = i11 - 1;
        boolean z12 = false;
        while (i12 < h11 && !z12) {
            b(iArr);
            int i13 = 0;
            int i14 = 0;
            while (i13 < m11) {
                if (this.f59754a.e(i13, i12)) {
                    if ((i14 & 1) == 1) {
                        i14++;
                    }
                    iArr[i14] = iArr[i14] + 1;
                } else if ((i14 & 1) != 0) {
                    iArr[i14] = iArr[i14] + 1;
                } else if (i14 == 4) {
                    if (!h(iArr)) {
                        q(iArr);
                    } else if (m(iArr, i12, i13)) {
                        if (this.f59756c) {
                            z12 = o();
                        } else {
                            int g11 = g();
                            int i15 = iArr[2];
                            if (g11 > i15) {
                                i12 += (g11 - i15) - 2;
                                i13 = m11 - 1;
                            }
                        }
                        b(iArr);
                        i11 = 2;
                        i14 = 0;
                    } else {
                        q(iArr);
                    }
                    i14 = 3;
                } else {
                    i14++;
                    iArr[i14] = iArr[i14] + 1;
                }
                i13++;
            }
            if (h(iArr) && m(iArr, i12, m11)) {
                i11 = iArr[0];
                if (this.f59756c) {
                    z12 = o();
                }
            }
            i12 += i11;
        }
        d[] p11 = p();
        l.e(p11);
        return new f(p11);
    }

    public final int g() {
        if (this.f59755b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d dVar2 : this.f59755b) {
            if (dVar2.h() >= 2) {
                if (dVar != null) {
                    this.f59756c = true;
                    return ((int) (Math.abs(dVar.c() - dVar2.c()) - Math.abs(dVar.d() - dVar2.d()))) / 2;
                }
                dVar = dVar2;
            }
        }
        return 0;
    }

    public final int[] j() {
        b(this.f59757d);
        return this.f59757d;
    }

    public final kp.b k() {
        return this.f59754a;
    }

    public final List<d> l() {
        return this.f59755b;
    }

    public final boolean m(int[] iArr, int i11, int i12) {
        int i13 = 0;
        int i14 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a11 = (int) a(iArr, i12);
        float e11 = e(i11, a11, iArr[2], i14);
        if (!Float.isNaN(e11)) {
            int i15 = (int) e11;
            float d11 = d(a11, i15, iArr[2], i14);
            if (!Float.isNaN(d11) && c(i15, (int) d11)) {
                float f11 = i14 / 7.0f;
                while (true) {
                    if (i13 < this.f59755b.size()) {
                        d dVar = this.f59755b.get(i13);
                        if (dVar.f(f11, e11, d11)) {
                            this.f59755b.set(i13, dVar.g(e11, d11, f11));
                            break;
                        }
                        i13++;
                    } else {
                        d dVar2 = new d(d11, e11, f11);
                        this.f59755b.add(dVar2);
                        m mVar = this.f59758e;
                        if (mVar != null) {
                            mVar.a(dVar2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final boolean n(int[] iArr, int i11, int i12, boolean z11) {
        return m(iArr, i11, i12);
    }

    public final boolean o() {
        int size = this.f59755b.size();
        float f11 = 0.0f;
        int i11 = 0;
        float f12 = 0.0f;
        for (d dVar : this.f59755b) {
            if (dVar.h() >= 2) {
                i11++;
                f12 += dVar.i();
            }
        }
        if (i11 < 3) {
            return false;
        }
        float f13 = f12 / size;
        Iterator<d> it = this.f59755b.iterator();
        while (it.hasNext()) {
            f11 += Math.abs(it.next().i() - f13);
        }
        return f11 <= f12 * 0.05f;
    }

    public final d[] p() throws NotFoundException {
        int size = this.f59755b.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float f11 = 0.0f;
        if (size > 3) {
            Iterator<d> it = this.f59755b.iterator();
            float f12 = 0.0f;
            float f13 = 0.0f;
            while (it.hasNext()) {
                float i11 = it.next().i();
                f12 += i11;
                f13 += i11 * i11;
            }
            float f14 = f12 / size;
            float sqrt = (float) Math.sqrt((f13 / r0) - (f14 * f14));
            Collections.sort(this.f59755b, new c(f14));
            float max = Math.max(0.2f * f14, sqrt);
            int i12 = 0;
            while (i12 < this.f59755b.size() && this.f59755b.size() > 3) {
                if (Math.abs(this.f59755b.get(i12).i() - f14) > max) {
                    this.f59755b.remove(i12);
                    i12--;
                }
                i12++;
            }
        }
        if (this.f59755b.size() > 3) {
            Iterator<d> it2 = this.f59755b.iterator();
            while (it2.hasNext()) {
                f11 += it2.next().i();
            }
            Collections.sort(this.f59755b, new b(f11 / this.f59755b.size()));
            List<d> list = this.f59755b;
            list.subList(3, list.size()).clear();
        }
        return new d[]{this.f59755b.get(0), this.f59755b.get(1), this.f59755b.get(2)};
    }

    public final void q(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public e(kp.b bVar, m mVar) {
        this.f59754a = bVar;
        this.f59755b = new ArrayList();
        this.f59757d = new int[5];
        this.f59758e = mVar;
    }
}
