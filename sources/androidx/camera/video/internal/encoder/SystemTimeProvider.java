package androidx.camera.video.internal.encoder;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class SystemTimeProvider implements TimeProvider {
    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long realtimeUs() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long uptimeUs() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
