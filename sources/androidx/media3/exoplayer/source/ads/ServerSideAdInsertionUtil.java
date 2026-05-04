package androidx.media3.exoplayer.source.ads;

import androidx.annotation.CheckResult;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ServerSideAdInsertionUtil {
    private ServerSideAdInsertionUtil() {
    }

    @CheckResult
    public static AdPlaybackState addAdGroupToAdPlaybackState(AdPlaybackState adPlaybackState, long j11, long j12, long... jArr) {
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j11, -1, adPlaybackState);
        int i11 = adPlaybackState.removedAdGroupCount;
        while (i11 < adPlaybackState.adGroupCount && adPlaybackState.getAdGroup(i11).timeUs != Long.MIN_VALUE && adPlaybackState.getAdGroup(i11).timeUs <= mediaPeriodPositionUsForContent) {
            i11++;
        }
        AdPlaybackState withContentResumeOffsetUs = adPlaybackState.withNewAdGroup(i11, mediaPeriodPositionUsForContent).withIsServerSideInserted(i11, true).withAdCount(i11, jArr.length).withAdDurationsUs(i11, jArr).withContentResumeOffsetUs(i11, j12);
        AdPlaybackState adPlaybackState2 = withContentResumeOffsetUs;
        for (int i12 = 0; i12 < jArr.length && jArr[i12] == 0; i12++) {
            adPlaybackState2 = adPlaybackState2.withSkippedAd(i11, i12);
        }
        return correctFollowingAdGroupTimes(adPlaybackState2, i11, Util.sum(jArr), j12);
    }

    private static AdPlaybackState correctFollowingAdGroupTimes(AdPlaybackState adPlaybackState, int i11, long j11, long j12) {
        long j13 = (-j11) + j12;
        while (true) {
            i11++;
            if (i11 >= adPlaybackState.adGroupCount) {
                return adPlaybackState;
            }
            long j14 = adPlaybackState.getAdGroup(i11).timeUs;
            if (j14 != Long.MIN_VALUE) {
                adPlaybackState = adPlaybackState.withAdGroupTimeUs(i11, j14 + j13);
            }
        }
    }

    public static int getAdCountInGroup(AdPlaybackState adPlaybackState, int i11) {
        int i12 = adPlaybackState.getAdGroup(i11).count;
        if (i12 == -1) {
            return 0;
        }
        return i12;
    }

    public static long getMediaPeriodPositionUs(long j11, MediaSource.MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        return mediaPeriodId.isAd() ? getMediaPeriodPositionUsForAd(j11, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : getMediaPeriodPositionUsForContent(j11, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }

    public static long getMediaPeriodPositionUsForAd(long j11, int i11, int i12, AdPlaybackState adPlaybackState) {
        int i13;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i11);
        long j12 = j11 - adGroup.timeUs;
        int i14 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i13 = 0;
            if (i14 >= i11) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i14);
            while (i13 < getAdCountInGroup(adPlaybackState, i14)) {
                j12 -= adGroup2.durationsUs[i13];
                i13++;
            }
            j12 += adGroup2.contentResumeOffsetUs;
            i14++;
        }
        if (i12 < getAdCountInGroup(adPlaybackState, i11)) {
            while (i13 < i12) {
                j12 -= adGroup.durationsUs[i13];
                i13++;
            }
        }
        return j12;
    }

    public static long getMediaPeriodPositionUsForContent(long j11, int i11, AdPlaybackState adPlaybackState) {
        if (i11 == -1) {
            i11 = adPlaybackState.adGroupCount;
        }
        long j12 = 0;
        for (int i12 = adPlaybackState.removedAdGroupCount; i12 < i11; i12++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i12);
            long j13 = adGroup.timeUs;
            if (j13 == Long.MIN_VALUE || j13 > j11 - j12) {
                break;
            }
            for (int i13 = 0; i13 < getAdCountInGroup(adPlaybackState, i12); i13++) {
                j12 += adGroup.durationsUs[i13];
            }
            long j14 = adGroup.contentResumeOffsetUs;
            j12 -= j14;
            long j15 = adGroup.timeUs;
            long j16 = j11 - j12;
            if (j14 + j15 > j16) {
                return Math.max(j15, j16);
            }
        }
        return j11 - j12;
    }

    public static long getStreamPositionUs(Player player, AdPlaybackState adPlaybackState) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return C.TIME_UNSET;
        }
        Timeline.Period period = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), new Timeline.Period());
        if (!Objects.equals(period.getAdsId(), adPlaybackState.adsId)) {
            return C.TIME_UNSET;
        }
        if (!player.isPlayingAd()) {
            return getStreamPositionUsForContent(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs(), -1, adPlaybackState);
        }
        return getStreamPositionUsForAd(Util.msToUs(player.getCurrentPosition()), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adPlaybackState);
    }

    public static long getStreamPositionUsForAd(long j11, int i11, int i12, AdPlaybackState adPlaybackState) {
        int i13;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i11);
        long j12 = j11 + adGroup.timeUs;
        int i14 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i13 = 0;
            if (i14 >= i11) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i14);
            while (i13 < getAdCountInGroup(adPlaybackState, i14)) {
                j12 += adGroup2.durationsUs[i13];
                i13++;
            }
            j12 -= adGroup2.contentResumeOffsetUs;
            i14++;
        }
        if (i12 < getAdCountInGroup(adPlaybackState, i11)) {
            while (i13 < i12) {
                j12 += adGroup.durationsUs[i13];
                i13++;
            }
        }
        return j12;
    }

    public static long getStreamPositionUsForContent(long j11, int i11, AdPlaybackState adPlaybackState) {
        if (i11 == -1) {
            i11 = adPlaybackState.adGroupCount;
        }
        long j12 = 0;
        for (int i12 = adPlaybackState.removedAdGroupCount; i12 < i11; i12++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i12);
            long j13 = adGroup.timeUs;
            if (j13 == Long.MIN_VALUE || j13 > j11) {
                break;
            }
            long j14 = j13 + j12;
            for (int i13 = 0; i13 < getAdCountInGroup(adPlaybackState, i12); i13++) {
                j12 += adGroup.durationsUs[i13];
            }
            long j15 = adGroup.contentResumeOffsetUs;
            j12 -= j15;
            if (adGroup.timeUs + j15 > j11) {
                return Math.max(j14, j11 + j12);
            }
        }
        return j11 + j12;
    }

    public static long getStreamPositionUs(long j11, MediaSource.MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        if (mediaPeriodId.isAd()) {
            return getStreamPositionUsForAd(j11, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        }
        return getStreamPositionUsForContent(j11, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }
}
