package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public final long playbackPositionUs;
    public final long ptsTime;

    private TimeSignalCommand(long j11, long j12) {
        this.ptsTime = j11;
        this.playbackPositionUs = j12;
    }

    public static TimeSignalCommand parseFromSection(ParsableByteArray parsableByteArray, long j11, TimestampAdjuster timestampAdjuster) {
        long parseSpliceTime = parseSpliceTime(parsableByteArray, j11);
        return new TimeSignalCommand(parseSpliceTime, timestampAdjuster.adjustTsTimestamp(parseSpliceTime));
    }

    public static long parseSpliceTime(ParsableByteArray parsableByteArray, long j11) {
        long readUnsignedByte = parsableByteArray.readUnsignedByte();
        return (128 & readUnsignedByte) != 0 ? 8589934591L & ((((readUnsignedByte & 1) << 32) | parsableByteArray.readUnsignedInt()) + j11) : C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.ptsTime + ", playbackPositionUs= " + this.playbackPositionUs + " }";
    }
}
