package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class l1 {
    public static /* synthetic */ long a(long j11, long j12) {
        if (j12 < 0) {
            return (j11 ^ Long.MIN_VALUE) < (j12 ^ Long.MIN_VALUE) ? j11 : j11 - j12;
        }
        if (j11 >= 0) {
            return j11 % j12;
        }
        long j13 = j11 - ((((j11 >>> 1) / j12) << 1) * j12);
        if ((j13 ^ Long.MIN_VALUE) < (j12 ^ Long.MIN_VALUE)) {
            j12 = 0;
        }
        return j13 - j12;
    }
}
