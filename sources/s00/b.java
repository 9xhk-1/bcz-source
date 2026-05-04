package s00;

import a00.q;
import kotlin.jvm.internal.u0;
import kx.a0;
import m80.k;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,843:1\n13880#2,3:844\n13880#2,3:847\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n785#1:844,3\n801#1:847,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final byte[] f87068a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final int[] f87069b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final byte[] f87070c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final int[] f87071d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f87068a = bArr;
        int[] iArr = new int[256];
        q.T1(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            iArr[bArr[i12]] = i13;
            i12++;
            i13++;
        }
        f87069b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, a0.f68904b, s60.b.f88049h};
        f87070c = bArr2;
        int[] iArr2 = new int[256];
        q.T1(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i14 = 0;
        while (i11 < length2) {
            iArr2[bArr2[i11]] = i14;
            i11++;
            i14++;
        }
        f87071d = iArr2;
    }

    @y0(version = "1.8")
    public static final boolean e(int i11) {
        if (i11 < 0) {
            return false;
        }
        int[] iArr = f87069b;
        return i11 < iArr.length && iArr[i11] != -1;
    }
}
