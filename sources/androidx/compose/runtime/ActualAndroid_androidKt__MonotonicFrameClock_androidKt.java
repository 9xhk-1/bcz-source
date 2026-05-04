package androidx.compose.runtime;

import android.os.Looper;
import m80.k;
import yz.c0;
import yz.e0;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {

    @k
    private static final c0 DefaultMonotonicFrameClock$delegate = e0.c(new x00.a<MonotonicFrameClock>() { // from class: androidx.compose.runtime.ActualAndroid_androidKt__MonotonicFrameClock_androidKt$DefaultMonotonicFrameClock$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final MonotonicFrameClock invoke() {
            return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : FallbackFrameClock.INSTANCE;
        }
    });
    private static final boolean DisallowDefaultMonotonicFrameClock = false;

    @k
    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    @n(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }
}
