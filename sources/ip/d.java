package ip;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final int f62648c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f62649d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f62650e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f62651f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f62652g = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int[][] f62654i;

    /* renamed from: j, reason: collision with root package name */
    public static final int[][] f62655j;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f62656a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f62647b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: h, reason: collision with root package name */
    public static final int[][] f62653h = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<f> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f62654i = iArr;
        iArr[0][32] = 1;
        for (int i11 = 65; i11 <= 90; i11++) {
            f62654i[0][i11] = i11 - 63;
        }
        f62654i[1][32] = 1;
        for (int i12 = 97; i12 <= 122; i12++) {
            f62654i[1][i12] = i12 - 95;
        }
        f62654i[2][32] = 1;
        for (int i13 = 48; i13 <= 57; i13++) {
            f62654i[2][i13] = i13 - 46;
        }
        int[] iArr2 = f62654i[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i14 = 0; i14 < 28; i14++) {
            f62654i[3][iArr3[i14]] = i14;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i15 = 0; i15 < 31; i15++) {
            int i16 = iArr4[i15];
            if (i16 > 0) {
                f62654i[4][i16] = i15;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f62655j = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f62655j;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public d(byte[] bArr) {
        this.f62656a = bArr;
    }

    public static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.add(fVar);
                    break;
                }
                f fVar2 = (f) it.next();
                if (fVar2.g(fVar)) {
                    break;
                }
                if (fVar.g(fVar2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    public static void d(f fVar, int i11, int i12, Collection<f> collection) {
        f b11 = fVar.b(i11);
        collection.add(b11.h(4, i12));
        if (fVar.e() != 4) {
            collection.add(b11.i(4, i12));
        }
        if (i12 == 3 || i12 == 4) {
            collection.add(b11.h(2, 16 - i12).h(2, 1));
        }
        if (fVar.c() > 0) {
            collection.add(fVar.a(i11).a(i11 + 1));
        }
    }

    public static Collection<f> f(Iterable<f> iterable, int i11, int i12) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next(), i11, i12, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kp.a a() {
        /*
            r8 = this;
            ip.f r0 = ip.f.f62660e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L8:
            byte[] r3 = r8.f62656a
            int r4 = r3.length
            if (r2 >= r4) goto L4c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L15
            r5 = r3[r4]
            goto L16
        L15:
            r5 = r1
        L16:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L38
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L34
            r6 = 46
            if (r3 == r6) goto L30
            r6 = 58
            if (r3 == r6) goto L2c
        L2a:
            r3 = r1
            goto L3d
        L2c:
            if (r5 != r7) goto L2a
            r3 = 5
            goto L3d
        L30:
            if (r5 != r7) goto L2a
            r3 = 3
            goto L3d
        L34:
            if (r5 != r7) goto L2a
            r3 = 4
            goto L3d
        L38:
            r3 = 10
            if (r5 != r3) goto L2a
            r3 = 2
        L3d:
            if (r3 <= 0) goto L45
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L49
        L45:
            java.util.Collection r0 = r8.e(r0, r2)
        L49:
            int r2 = r2 + 1
            goto L8
        L4c:
            ip.d$a r1 = new ip.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            ip.f r0 = (ip.f) r0
            byte[] r1 = r8.f62656a
            kp.a r0 = r0.j(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ip.d.a():kp.a");
    }

    public final void c(f fVar, int i11, Collection<f> collection) {
        char c11 = (char) (this.f62656a[i11] & 255);
        boolean z11 = f62654i[fVar.e()][c11] > 0;
        f fVar2 = null;
        for (int i12 = 0; i12 <= 4; i12++) {
            int i13 = f62654i[i12][c11];
            if (i13 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.b(i11);
                }
                if (!z11 || i12 == fVar.e() || i12 == 2) {
                    collection.add(fVar2.h(i12, i13));
                }
                if (!z11 && f62655j[fVar.e()][i12] >= 0) {
                    collection.add(fVar2.i(i12, i13));
                }
            }
        }
        if (fVar.c() > 0 || f62654i[fVar.e()][c11] == 0) {
            collection.add(fVar.a(i11));
        }
    }

    public final Collection<f> e(Iterable<f> iterable, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next(), i11, linkedList);
        }
        return b(linkedList);
    }
}
