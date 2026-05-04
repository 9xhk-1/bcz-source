package sj;

import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f88723d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static final int f88724e = 1024;

    /* renamed from: f, reason: collision with root package name */
    public static final int f88725f = 1023;

    /* renamed from: a, reason: collision with root package name */
    public int[][] f88726a;

    /* renamed from: b, reason: collision with root package name */
    public int f88727b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f88728c = 0;

    public int a(int position) {
        if (position < 0 || position >= this.f88727b) {
            throw new IndexOutOfBoundsException();
        }
        return this.f88726a[position >> 10][position & 1023];
    }

    public int b() {
        return this.f88728c;
    }

    public int c() {
        return (this.f88728c * 4) + (this.f88726a.length * 12);
    }

    public void d(int value) {
        e(this.f88727b + 1);
        int i11 = this.f88727b;
        int i12 = i11 & 1023;
        this.f88727b = i11 + 1;
        this.f88726a[i11 >> 10][i12] = value;
    }

    public void e(int size) {
        int i11;
        if (size <= this.f88728c) {
            return;
        }
        System.out.print("reserve " + size + j2.O + 1023);
        int i12 = (size & 1023) > 0 ? (size >> 10) + 1 : size >> 10;
        System.out.println(" blockCount " + i12);
        int[][] iArr = new int[i12][];
        System.out.println("newBlocks " + i12);
        int i13 = 0;
        while (true) {
            i11 = this.f88727b;
            if (i13 > ((i11 - 1) >> 10)) {
                break;
            }
            iArr[i13] = this.f88726a[i13];
            System.out.println("copy old " + i13);
            i13++;
        }
        for (int i14 = i11 >> 10; i14 < i12; i14++) {
            iArr[i14] = new int[1024];
            System.out.println("create new " + i14);
        }
        this.f88726a = iArr;
        this.f88728c = i12 << 10;
        System.out.println("mCapacity " + this.f88728c);
    }

    public int f() {
        return this.f88727b;
    }
}
