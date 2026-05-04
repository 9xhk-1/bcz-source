package io.ktor.server.engine;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String[] f61474a;

    static {
        String[] strArr = new String[1024];
        for (int i11 = 0; i11 < 1024; i11++) {
            strArr[i11] = String.valueOf(i11);
        }
        f61474a = strArr;
    }

    @m80.k
    public static final String a(long j11) {
        return (0 > j11 || j11 >= 1024) ? String.valueOf(j11) : f61474a[(int) j11];
    }
}
