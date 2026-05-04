package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private long lastRebufferRealtimeMs;
        private long playbackPositionUs;
        private float playbackSpeed;

        public LoadingInfo build() {
            return new LoadingInfo(this);
        }

        @uo.a
        public Builder setLastRebufferRealtimeMs(long j11) {
            Assertions.checkArgument(j11 >= 0 || j11 == C.TIME_UNSET);
            this.lastRebufferRealtimeMs = j11;
            return this;
        }

        @uo.a
        public Builder setPlaybackPositionUs(long j11) {
            this.playbackPositionUs = j11;
            return this;
        }

        @uo.a
        public Builder setPlaybackSpeed(float f11) {
            Assertions.checkArgument(f11 > 0.0f || f11 == -3.4028235E38f);
            this.playbackSpeed = f11;
            return this;
        }

        public Builder() {
            this.playbackPositionUs = C.TIME_UNSET;
            this.playbackSpeed = -3.4028235E38f;
            this.lastRebufferRealtimeMs = C.TIME_UNSET;
        }

        private Builder(LoadingInfo loadingInfo) {
            this.playbackPositionUs = loadingInfo.playbackPositionUs;
            this.playbackSpeed = loadingInfo.playbackSpeed;
            this.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.playbackPositionUs), Float.valueOf(this.playbackSpeed), Long.valueOf(this.lastRebufferRealtimeMs));
    }

    public boolean rebufferedSince(long j11) {
        long j12 = this.lastRebufferRealtimeMs;
        return (j12 == C.TIME_UNSET || j11 == C.TIME_UNSET || j12 < j11) ? false : true;
    }

    private LoadingInfo(Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }
}
