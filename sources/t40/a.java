package t40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import u30.f0;
import yz.g2;
import yz.o1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBinaryDataReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryDataReader.kt\nkotlinx/datetime/internal/BinaryDataReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final byte[] f89481a;

    /* renamed from: b, reason: collision with root package name */
    public int f89482b;

    public a(@k byte[] bytes, int i11) {
        g0.p(bytes, "bytes");
        this.f89481a = bytes;
        this.f89482b = i11;
    }

    public final char a() {
        return (char) b();
    }

    public final byte b() {
        byte[] bArr = this.f89481a;
        int i11 = this.f89482b;
        this.f89482b = i11 + 1;
        return bArr[i11];
    }

    public final int c() {
        byte[] bArr = this.f89481a;
        int i11 = this.f89482b;
        int i12 = ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
        int i13 = bArr[i11 + 3] & 255;
        this.f89482b = i11 + 4;
        g2 g2Var = g2.f100423a;
        return i13 | i12;
    }

    public final long d() {
        byte[] bArr = this.f89481a;
        long j11 = ((bArr[r1] & 255) << 56) | ((bArr[r1 + 1] & 255) << 48) | ((bArr[r1 + 2] & 255) << 40) | ((bArr[r1 + 3] & 255) << 32) | ((bArr[r1 + 4] & 255) << 24) | ((bArr[r1 + 5] & 255) << 16) | ((bArr[r1 + 6] & 255) << 8);
        long j12 = 255 & bArr[r1 + 7];
        this.f89482b = this.f89482b + 8;
        g2 g2Var = g2.f100423a;
        return j11 | j12;
    }

    @k
    public final String e(int i11) {
        int i12;
        byte[] bArr;
        int i13 = 0;
        while (true) {
            i12 = this.f89482b;
            int i14 = i12 + i13;
            bArr = this.f89481a;
            if (i14 >= bArr.length || bArr[i12 + i13] == 0 || i13 >= i11) {
                break;
            }
            i13++;
        }
        String W1 = f0.W1(bArr, i12, i12 + i13, false, 4, null);
        this.f89482b += i11;
        return W1;
    }

    public final byte f() {
        return o1.i(b());
    }

    @k
    public final String g(int i11) {
        byte[] bArr = this.f89481a;
        int i12 = this.f89482b;
        String W1 = f0.W1(bArr, i12, i12 + i11, false, 4, null);
        this.f89482b += i11;
        return W1;
    }

    public final void h(int i11) {
        this.f89482b += i11;
    }

    public /* synthetic */ a(byte[] bArr, int i11, int i12, v vVar) {
        this(bArr, (i12 & 2) != 0 ? 0 : i11);
    }
}
