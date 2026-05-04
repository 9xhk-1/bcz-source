package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;

    /* renamed from: id, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f4604id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final boolean isPrecededByTransitionFromSameStream;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16 = true;
        Assertions.checkArgument(!z15 || z13);
        Assertions.checkArgument(!z14 || z13);
        if (z12 && (z13 || z14 || z15)) {
            z16 = false;
        }
        Assertions.checkArgument(z16);
        this.f4604id = mediaPeriodId;
        this.startPositionUs = j11;
        this.requestedContentPositionUs = j12;
        this.endPositionUs = j13;
        this.durationUs = j14;
        this.isPrecededByTransitionFromSameStream = z11;
        this.isFollowedByTransitionToSameStream = z12;
        this.isLastInTimelinePeriod = z13;
        this.isLastInTimelineWindow = z14;
        this.isFinal = z15;
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long j11) {
        return j11 == this.requestedContentPositionUs ? this : new MediaPeriodInfo(this.f4604id, this.startPositionUs, j11, this.endPositionUs, this.durationUs, this.isPrecededByTransitionFromSameStream, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j11) {
        return j11 == this.startPositionUs ? this : new MediaPeriodInfo(this.f4604id, j11, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isPrecededByTransitionFromSameStream, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaPeriodInfo.class == obj.getClass()) {
            MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
            if (this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isPrecededByTransitionFromSameStream == mediaPeriodInfo.isPrecededByTransitionFromSameStream && this.isFollowedByTransitionToSameStream == mediaPeriodInfo.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && Objects.equals(this.f4604id, mediaPeriodInfo.f4604id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f4604id.hashCode()) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isPrecededByTransitionFromSameStream ? 1 : 0)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
