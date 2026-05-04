package fl;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final double f52007a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j11) {
        return (b() - j11) * f52007a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
