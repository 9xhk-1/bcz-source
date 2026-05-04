package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    protected final BinarySearchSeekMap seekMap;

    @Nullable
    protected SeekOperationParams seekOperationParams;
    protected final TimestampSeeker timestampSeeker;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BinarySearchSeekMap implements SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.seekTimestampConverter = seekTimestampConverter;
            this.durationUs = j11;
            this.floorTimePosition = j12;
            this.ceilingTimePosition = j13;
            this.floorBytePosition = j14;
            this.ceilingBytePosition = j15;
            this.approxBytesPerFrame = j16;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j11) {
            return new SeekMap.SeekPoints(new SeekPoint(j11, SeekOperationParams.calculateNextSearchBytePosition(this.seekTimestampConverter.timeUsToTargetTime(j11), this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame)));
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j11) {
            return this.seekTimestampConverter.timeUsToTargetTime(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        public SeekOperationParams(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
            this.seekTimeUs = j11;
            this.targetTimePosition = j12;
            this.floorTimePosition = j13;
            this.ceilingTimePosition = j14;
            this.floorBytePosition = j15;
            this.ceilingBytePosition = j16;
            this.approxBytesPerFrame = j17;
            this.nextSearchBytePosition = calculateNextSearchBytePosition(j12, j13, j14, j15, j16, j17);
        }

        public static long calculateNextSearchBytePosition(long j11, long j12, long j13, long j14, long j15, long j16) {
            if (j14 + 1 >= j15 || j12 + 1 >= j13) {
                return j14;
            }
            long j17 = (long) ((j11 - j12) * ((j15 - j14) / (j13 - j12)));
            return Util.constrainValue(((j17 + j14) - j16) - (j17 / 20), j14, j15 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.ceilingBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.floorBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.nextSearchBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.seekTimeUs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.targetTimePosition;
        }

        private void updateNextSearchBytePosition() {
            this.nextSearchBytePosition = calculateNextSearchBytePosition(this.targetTimePosition, this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekCeiling(long j11, long j12) {
            this.ceilingTimePosition = j11;
            this.ceilingBytePosition = j12;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekFloor(long j11, long j12) {
            this.floorTimePosition = j11;
            this.floorBytePosition = j12;
            updateNextSearchBytePosition();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, C.TIME_UNSET, -1);
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        private TimestampSearchResult(int i11, long j11, long j12) {
            this.type = i11;
            this.timestampToUpdate = j11;
            this.bytePositionToUpdate = j12;
        }

        public static TimestampSearchResult overestimatedResult(long j11, long j12) {
            return new TimestampSearchResult(-1, j11, j12);
        }

        public static TimestampSearchResult targetFoundResult(long j11) {
            return new TimestampSearchResult(0, C.TIME_UNSET, j11);
        }

        public static TimestampSearchResult underestimatedResult(long j11, long j12) {
            return new TimestampSearchResult(-2, j11, j12);
        }
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j11, long j12, long j13, long j14, long j15, long j16, int i11) {
        this.timestampSeeker = timestampSeeker;
        this.minimumSearchRange = i11;
        this.seekMap = new BinarySearchSeekMap(seekTimestampConverter, j11, j12, j13, j14, j15, j16);
    }

    public SeekOperationParams createSeekParamsForTargetTimeUs(long j11) {
        return new SeekOperationParams(j11, this.seekMap.timeUsToTargetTime(j11), this.seekMap.floorTimePosition, this.seekMap.ceilingTimePosition, this.seekMap.floorBytePosition, this.seekMap.ceilingBytePosition, this.seekMap.approxBytesPerFrame);
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public int handlePendingSeek(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            SeekOperationParams seekOperationParams = (SeekOperationParams) Assertions.checkStateNotNull(this.seekOperationParams);
            long floorBytePosition = seekOperationParams.getFloorBytePosition();
            long ceilingBytePosition = seekOperationParams.getCeilingBytePosition();
            long nextSearchBytePosition = seekOperationParams.getNextSearchBytePosition();
            if (ceilingBytePosition - floorBytePosition <= this.minimumSearchRange) {
                markSeekOperationFinished(false, floorBytePosition);
                return seekToPosition(extractorInput, floorBytePosition, positionHolder);
            }
            if (!skipInputUntilPosition(extractorInput, nextSearchBytePosition)) {
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            extractorInput.resetPeekPosition();
            TimestampSearchResult searchForTimestamp = this.timestampSeeker.searchForTimestamp(extractorInput, seekOperationParams.getTargetTimePosition());
            int i11 = searchForTimestamp.type;
            if (i11 == -3) {
                markSeekOperationFinished(false, nextSearchBytePosition);
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            if (i11 == -2) {
                seekOperationParams.updateSeekFloor(searchForTimestamp.timestampToUpdate, searchForTimestamp.bytePositionToUpdate);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    skipInputUntilPosition(extractorInput, searchForTimestamp.bytePositionToUpdate);
                    markSeekOperationFinished(true, searchForTimestamp.bytePositionToUpdate);
                    return seekToPosition(extractorInput, searchForTimestamp.bytePositionToUpdate, positionHolder);
                }
                seekOperationParams.updateSeekCeiling(searchForTimestamp.timestampToUpdate, searchForTimestamp.bytePositionToUpdate);
            }
        }
    }

    public final boolean isSeeking() {
        return this.seekOperationParams != null;
    }

    public final void markSeekOperationFinished(boolean z11, long j11) {
        this.seekOperationParams = null;
        this.timestampSeeker.onSeekFinished();
        onSeekOperationFinished(z11, j11);
    }

    public final int seekToPosition(ExtractorInput extractorInput, long j11, PositionHolder positionHolder) {
        if (j11 == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j11;
        return 1;
    }

    public final void setSeekTargetUs(long j11) {
        SeekOperationParams seekOperationParams = this.seekOperationParams;
        if (seekOperationParams == null || seekOperationParams.getSeekTimeUs() != j11) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(j11);
        }
    }

    public final boolean skipInputUntilPosition(ExtractorInput extractorInput, long j11) throws IOException {
        long position = j11 - extractorInput.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        extractorInput.skipFully((int) position);
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface TimestampSeeker {
        TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j11) throws IOException;

        default void onSeekFinished() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long j11) {
            return j11;
        }
    }

    public void onSeekOperationFinished(boolean z11, long j11) {
    }
}
