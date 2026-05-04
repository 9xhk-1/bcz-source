package a3;

import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o0<T> {

    /* renamed from: a, reason: collision with root package name */
    public T[] f1609a;

    /* renamed from: b, reason: collision with root package name */
    public Comparator<? super T> f1610b;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r6, int r7) {
        /*
            r5 = this;
            T[] r0 = r5.f1609a
            r1 = r0[r6]
            int r2 = r6 + r7
            int r2 = r2 / 2
            r3 = r0[r2]
            r0 = r0[r7]
            java.util.Comparator<? super T> r4 = r5.f1610b
            int r4 = r4.compare(r1, r3)
            if (r4 <= 0) goto L26
            java.util.Comparator<? super T> r4 = r5.f1610b
            int r3 = r4.compare(r3, r0)
            if (r3 <= 0) goto L1d
            goto L38
        L1d:
            java.util.Comparator<? super T> r2 = r5.f1610b
            int r0 = r2.compare(r1, r0)
            if (r0 <= 0) goto L2e
            goto L37
        L26:
            java.util.Comparator<? super T> r4 = r5.f1610b
            int r1 = r4.compare(r1, r0)
            if (r1 <= 0) goto L2f
        L2e:
            return r6
        L2f:
            java.util.Comparator<? super T> r6 = r5.f1610b
            int r6 = r6.compare(r3, r0)
            if (r6 <= 0) goto L38
        L37:
            return r7
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.o0.a(int, int):int");
    }

    public final int b(int i11, int i12, int i13) {
        T t11 = this.f1609a[i13];
        e(i12, i13);
        int i14 = i11;
        while (i11 < i12) {
            if (this.f1610b.compare(this.f1609a[i11], t11) < 0) {
                e(i14, i11);
                i14++;
            }
            i11++;
        }
        e(i12, i14);
        return i14;
    }

    public final int c(int i11, int i12, int i13) {
        if (i11 == i12) {
            return i11;
        }
        int b11 = b(i11, i12, a(i11, i12));
        int i14 = (b11 - i11) + 1;
        return i14 == i13 ? b11 : i13 < i14 ? c(i11, b11 - 1, i13) : c(b11 + 1, i12, i13 - i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int d(T[] tArr, Comparator<T> comparator, int i11, int i12) {
        this.f1609a = tArr;
        this.f1610b = comparator;
        return c(0, i12 - 1, i11);
    }

    public final void e(int i11, int i12) {
        T[] tArr = this.f1609a;
        T t11 = tArr[i11];
        tArr[i11] = tArr[i12];
        tArr[i12] = t11;
    }
}
