package h40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class c1 {
    public static final int a(@m80.k String str, int i11, int i12, int i13) {
        return (int) a1.c(str, i11, i12, i13);
    }

    public static final long b(@m80.k String str, long j11, long j12, long j13) {
        String d11 = a1.d(str);
        if (d11 == null) {
            return j11;
        }
        Long r12 = u30.e0.r1(d11);
        if (r12 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d11 + '\'').toString());
        }
        long longValue = r12.longValue();
        if (j12 <= longValue && longValue <= j13) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j12 + zr.m.f102856e + j13 + ", but is '" + longValue + '\'').toString());
    }

    @m80.k
    public static final String c(@m80.k String str, @m80.k String str2) {
        String d11 = a1.d(str);
        return d11 == null ? str2 : d11;
    }

    public static final boolean d(@m80.k String str, boolean z11) {
        String d11 = a1.d(str);
        return d11 != null ? Boolean.parseBoolean(d11) : z11;
    }

    public static /* synthetic */ int e(String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = 1;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a1.b(str, i11, i12, i13);
    }

    public static /* synthetic */ long f(String str, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j12 = 1;
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            j13 = Long.MAX_VALUE;
        }
        return a1.c(str, j11, j14, j13);
    }
}
