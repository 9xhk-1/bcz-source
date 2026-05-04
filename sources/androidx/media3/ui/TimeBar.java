package androidx.media3.ui;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes.dex */
public interface TimeBar {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long j11);

        void onScrubStart(TimeBar timeBar, long j11);

        void onScrubStop(TimeBar timeBar, long j11, boolean z11);
    }

    void addListener(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void removeListener(OnScrubListener onScrubListener);

    void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i11);

    void setBufferedPosition(long j11);

    void setDuration(long j11);

    void setEnabled(boolean z11);

    void setKeyCountIncrement(int i11);

    void setKeyTimeIncrement(long j11);

    void setPosition(long j11);
}
