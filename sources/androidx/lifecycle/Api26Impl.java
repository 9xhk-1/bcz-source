package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class Api26Impl {

    @k
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final long toMillis(@k Duration timeout) {
        g0.p(timeout, "timeout");
        return timeout.toMillis();
    }
}
