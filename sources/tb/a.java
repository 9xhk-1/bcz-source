package tb;

import xb.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final long f90423a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f90424b = 1;

    @Override // xb.l
    public long a(int maxRetry, int retried) {
        if (maxRetry == 0) {
            maxRetry = 1;
        }
        int i11 = (retried % maxRetry) + 1;
        return (1 == i11 % 2 ? (r6 + 2) / 2 : i11) * 1000;
    }
}
