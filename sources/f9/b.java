package f9;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int[][] f51344a;

    /* renamed from: b, reason: collision with root package name */
    public int f51345b;

    /* renamed from: c, reason: collision with root package name */
    public int f51346c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f51347d = -1;

    public static void e(String[] args) {
        b bVar = new b();
        int c11 = bVar.c("wealthy", "healthy");
        bVar.a();
        System.out.println(c11);
        bVar.f();
    }

    public int[] a() {
        int i11 = this.f51346c;
        return i11 == -1 ? new int[2] : new int[]{(i11 + 1) - this.f51345b, i11 + 1};
    }

    public int[] b() {
        int i11 = this.f51347d;
        return i11 == -1 ? new int[2] : new int[]{(i11 + 1) - this.f51345b, i11 + 1};
    }

    public int c(String a11, String b11) {
        return d(a11.toCharArray(), b11.toCharArray());
    }

    public int d(char[] a11, char[] b11) {
        this.f51344a = null;
        this.f51345b = 0;
        this.f51346c = -1;
        this.f51347d = -1;
        if (a11 == null || a11.length == 0 || b11 == null || b11.length == 0) {
            return 0;
        }
        this.f51344a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, a11.length, b11.length);
        for (int i11 = 0; i11 < a11.length; i11++) {
            for (int i12 = 0; i12 < b11.length; i12++) {
                if (a11[i11] == b11[i12]) {
                    if (i11 == 0 || i12 == 0) {
                        this.f51344a[i11][i12] = 1;
                    } else {
                        int[][] iArr = this.f51344a;
                        iArr[i11][i12] = iArr[i11 - 1][i12 - 1] + 1;
                    }
                    int i13 = this.f51344a[i11][i12];
                    if (i13 > this.f51345b) {
                        this.f51345b = i13;
                        this.f51347d = i12;
                        this.f51346c = i11;
                    }
                } else {
                    this.f51344a[i11][i12] = 0;
                }
            }
        }
        return this.f51345b;
    }

    public void f() {
        for (int i11 = 0; i11 < this.f51344a.length; i11++) {
            int i12 = 0;
            while (true) {
                int[][] iArr = this.f51344a;
                if (i12 < iArr[0].length) {
                    System.out.print(iArr[i11][i12]);
                    i12++;
                }
            }
            System.out.println();
        }
        System.out.println("mMaxIndexA" + this.f51346c + " mMaxIndexB " + this.f51347d);
        System.out.println();
    }
}
