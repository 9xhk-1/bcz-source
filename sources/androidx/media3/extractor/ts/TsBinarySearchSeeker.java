package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TsBinarySearchSeeker extends BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 940;
    private static final long SEEK_TOLERANCE_US = 100000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TsPcrSeeker implements BinarySearchSeeker.TimestampSeeker {
        private final ParsableByteArray packetBuffer = new ParsableByteArray();
        private final int pcrPid;
        private final TimestampAdjuster pcrTimestampAdjuster;
        private final int timestampSearchBytes;

        public TsPcrSeeker(int i11, TimestampAdjuster timestampAdjuster, int i12) {
            this.pcrPid = i11;
            this.pcrTimestampAdjuster = timestampAdjuster;
            this.timestampSearchBytes = i12;
        }

        private BinarySearchSeeker.TimestampSearchResult searchForPcrValueInBuffer(ParsableByteArray parsableByteArray, long j11, long j12) {
            int findSyncBytePosition;
            int findSyncBytePosition2;
            int limit = parsableByteArray.limit();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 188 && (findSyncBytePosition2 = (findSyncBytePosition = TsUtil.findSyncBytePosition(parsableByteArray.getData(), parsableByteArray.getPosition(), limit)) + 188) <= limit) {
                long readPcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, findSyncBytePosition, this.pcrPid);
                if (readPcrFromPacket != C.TIME_UNSET) {
                    long adjustTsTimestamp = this.pcrTimestampAdjuster.adjustTsTimestamp(readPcrFromPacket);
                    if (adjustTsTimestamp > j11) {
                        return j15 == C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.overestimatedResult(adjustTsTimestamp, j12) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j12 + j14);
                    }
                    if (100000 + adjustTsTimestamp > j11) {
                        return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j12 + findSyncBytePosition);
                    }
                    j14 = findSyncBytePosition;
                    j15 = adjustTsTimestamp;
                }
                parsableByteArray.setPosition(findSyncBytePosition2);
                j13 = findSyncBytePosition2;
            }
            return j15 != C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j15, j12 + j13) : BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j11) throws IOException {
            long position = extractorInput.getPosition();
            int min = (int) Math.min(this.timestampSearchBytes, extractorInput.getLength() - position);
            this.packetBuffer.reset(min);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, min);
            return searchForPcrValueInBuffer(this.packetBuffer, j11, position);
        }
    }

    public TsBinarySearchSeeker(TimestampAdjuster timestampAdjuster, long j11, long j12, int i11, int i12) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new TsPcrSeeker(i11, timestampAdjuster, i12), j11, 0L, j11 + 1, 0L, j12, 188L, MINIMUM_SEARCH_RANGE_BYTES);
    }
}
