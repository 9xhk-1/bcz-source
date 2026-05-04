package i1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f60055a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f60056b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f60057c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f60058d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f60059e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f60060f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f60061g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f60062h = 8;

    public static String a(int i11, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i12]);
                sb2.append(l50.b.f69930l);
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append('.');
                String str = strArr[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }
}
