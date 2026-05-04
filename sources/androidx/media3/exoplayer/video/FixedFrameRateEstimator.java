package androidx.media3.exoplayer.video;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class FixedFrameRateEstimator {
    public static final int CONSECUTIVE_MATCHING_FRAME_DURATIONS_FOR_SYNC = 15;

    @VisibleForTesting
    static final long MAX_MATCHING_FRAME_DIFFERENCE_NS = 1000000;
    private boolean candidateMatcherActive;
    private int framesWithoutSyncCount;
    private boolean switchToCandidateMatcherWhenSynced;
    private Matcher currentMatcher = new Matcher();
    private Matcher candidateMatcher = new Matcher();
    private long lastFramePresentationTimeNs = C.TIME_UNSET;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Matcher {
        private long firstFrameDurationNs;
        private long firstFramePresentationTimeNs;
        private long frameCount;
        private long lastFramePresentationTimeNs;
        private long matchingFrameCount;
        private long matchingFrameDurationSumNs;
        private int recentFrameOutlierCount;
        private final boolean[] recentFrameOutlierFlags = new boolean[15];

        private static int getRecentFrameOutlierIndex(long j11) {
            return (int) (j11 % 15);
        }

        public long getFrameDurationNs() {
            long j11 = this.matchingFrameCount;
            if (j11 == 0) {
                return 0L;
            }
            return this.matchingFrameDurationSumNs / j11;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.matchingFrameDurationSumNs;
        }

        public boolean isLastFrameOutlier() {
            long j11 = this.frameCount;
            if (j11 == 0) {
                return false;
            }
            return this.recentFrameOutlierFlags[getRecentFrameOutlierIndex(j11 - 1)];
        }

        public boolean isSynced() {
            return this.frameCount > 15 && this.recentFrameOutlierCount == 0;
        }

        public void onNextFrame(long j11) {
            long j12 = this.frameCount;
            if (j12 == 0) {
                this.firstFramePresentationTimeNs = j11;
            } else if (j12 == 1) {
                long j13 = j11 - this.firstFramePresentationTimeNs;
                this.firstFrameDurationNs = j13;
                this.matchingFrameDurationSumNs = j13;
                this.matchingFrameCount = 1L;
            } else {
                long j14 = j11 - this.lastFramePresentationTimeNs;
                int recentFrameOutlierIndex = getRecentFrameOutlierIndex(j12);
                if (Math.abs(j14 - this.firstFrameDurationNs) <= 1000000) {
                    this.matchingFrameCount++;
                    this.matchingFrameDurationSumNs += j14;
                    boolean[] zArr = this.recentFrameOutlierFlags;
                    if (zArr[recentFrameOutlierIndex]) {
                        zArr[recentFrameOutlierIndex] = false;
                        this.recentFrameOutlierCount--;
                    }
                } else {
                    boolean[] zArr2 = this.recentFrameOutlierFlags;
                    if (!zArr2[recentFrameOutlierIndex]) {
                        zArr2[recentFrameOutlierIndex] = true;
                        this.recentFrameOutlierCount++;
                    }
                }
            }
            this.frameCount++;
            this.lastFramePresentationTimeNs = j11;
        }

        public void reset() {
            this.frameCount = 0L;
            this.matchingFrameCount = 0L;
            this.matchingFrameDurationSumNs = 0L;
            this.recentFrameOutlierCount = 0;
            Arrays.fill(this.recentFrameOutlierFlags, false);
        }
    }

    public long getFrameDurationNs() {
        return isSynced() ? this.currentMatcher.getFrameDurationNs() : C.TIME_UNSET;
    }

    public float getFrameRate() {
        if (isSynced()) {
            return (float) (1.0E9d / this.currentMatcher.getFrameDurationNs());
        }
        return -1.0f;
    }

    public int getFramesWithoutSyncCount() {
        return this.framesWithoutSyncCount;
    }

    public long getMatchingFrameDurationSumNs() {
        return isSynced() ? this.currentMatcher.getMatchingFrameDurationSumNs() : C.TIME_UNSET;
    }

    public boolean isSynced() {
        return this.currentMatcher.isSynced();
    }

    public void onNextFrame(long j11) {
        this.currentMatcher.onNextFrame(j11);
        if (this.currentMatcher.isSynced() && !this.switchToCandidateMatcherWhenSynced) {
            this.candidateMatcherActive = false;
        } else if (this.lastFramePresentationTimeNs != C.TIME_UNSET) {
            if (!this.candidateMatcherActive || this.candidateMatcher.isLastFrameOutlier()) {
                this.candidateMatcher.reset();
                this.candidateMatcher.onNextFrame(this.lastFramePresentationTimeNs);
            }
            this.candidateMatcherActive = true;
            this.candidateMatcher.onNextFrame(j11);
        }
        if (this.candidateMatcherActive && this.candidateMatcher.isSynced()) {
            Matcher matcher = this.currentMatcher;
            this.currentMatcher = this.candidateMatcher;
            this.candidateMatcher = matcher;
            this.candidateMatcherActive = false;
            this.switchToCandidateMatcherWhenSynced = false;
        }
        this.lastFramePresentationTimeNs = j11;
        this.framesWithoutSyncCount = this.currentMatcher.isSynced() ? 0 : this.framesWithoutSyncCount + 1;
    }

    public void reset() {
        this.currentMatcher.reset();
        this.candidateMatcher.reset();
        this.candidateMatcherActive = false;
        this.lastFramePresentationTimeNs = C.TIME_UNSET;
        this.framesWithoutSyncCount = 0;
    }
}
