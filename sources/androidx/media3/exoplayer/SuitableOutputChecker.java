package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
/* loaded from: classes2.dex */
public interface SuitableOutputChecker {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Callback {
        void onSelectedOutputSuitabilityChanged(boolean z11);
    }

    void disable();

    void enable(Callback callback, Context context, Looper looper, Looper looper2, Clock clock);

    boolean isSelectedOutputSuitableForPlayback();
}
