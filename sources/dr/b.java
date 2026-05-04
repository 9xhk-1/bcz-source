package dr;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f48108a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f48109b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(byte[] bArr, boolean z11) {
        return b(bArr, z11 ? f48109b : f48108a);
    }

    public static char[] b(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            cArr2[i11] = cArr[(b11 & 240) >>> 4];
            i11 += 2;
            cArr2[i12] = cArr[b11 & 15];
        }
        return cArr2;
    }

    public static String c(byte[] bArr, boolean z11) {
        return new String(a(bArr, z11));
    }
}
