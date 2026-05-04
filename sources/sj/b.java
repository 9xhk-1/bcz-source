package sj;

import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f88729a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f88730b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f88731c;

    public b(int size) {
        this.f88729a = size;
        this.f88730b = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            this.f88730b[i11] = 0;
        }
        int i12 = size + 1;
        int[] iArr = new int[i12];
        this.f88731c = iArr;
        iArr[0] = Integer.MIN_VALUE;
        Arrays.fill(iArr, 1, i12, Integer.MAX_VALUE);
    }

    public static void e(String[] args) {
        int[][] iArr = {new int[]{1, 3, 4, 5, 7, 10}, new int[]{2, 5, 8, 9}, new int[]{3, 6, 9}};
        b bVar = new b(3);
        int[] iArr2 = new int[3];
        iArr2[0] = 1;
        iArr2[1] = 1;
        iArr2[2] = 1;
        for (int i11 = 0; i11 < 3; i11++) {
            bVar.f(i11, iArr[i11][0]);
        }
        while (bVar.b() != Integer.MAX_VALUE) {
            int c11 = bVar.c();
            int b11 = bVar.b();
            System.out.println(c11 + " => " + b11);
            System.out.println("cursor " + iArr2[c11] + j2.O + iArr[c11].length);
            int i12 = iArr2[c11];
            int[] iArr3 = iArr[c11];
            if (i12 < iArr3.length) {
                bVar.f(c11, iArr3[i12]);
                iArr2[c11] = iArr2[c11] + 1;
            } else {
                bVar.f(c11, Integer.MAX_VALUE);
            }
        }
    }

    public void a(int s11) {
        for (int i11 = ((this.f88729a + s11) - 1) / 2; i11 > 0; i11 >>= 1) {
            int[] iArr = this.f88731c;
            int i12 = iArr[s11];
            int[] iArr2 = this.f88730b;
            int i13 = iArr2[i11];
            if (i12 > iArr[i13]) {
                iArr2[i11] = s11;
                s11 = i13;
            }
        }
        this.f88730b[0] = s11;
    }

    public int b() {
        return this.f88731c[this.f88730b[0]];
    }

    public int c() {
        return this.f88730b[0] - 1;
    }

    public void d() {
        System.out.println("leaves " + Arrays.toString(this.f88731c));
        System.out.println("losers " + Arrays.toString(this.f88730b));
    }

    public void f(int index, int value) {
        int i11 = index + 1;
        this.f88731c[i11] = value;
        a(i11);
    }
}
