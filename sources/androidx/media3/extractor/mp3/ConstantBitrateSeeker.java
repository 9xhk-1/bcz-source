package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.MpegAudioUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataEndPosition;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j11, long j12, MpegAudioUtil.Header header, boolean z11) {
        this(j11, j12, header.bitrate, header.frameSize, z11);
    }

    public ConstantBitrateSeeker copyWithNewDataEndPosition(long j11) {
        return new ConstantBitrateSeeker(j11, this.firstFramePosition, this.bitrate, this.frameSize, this.allowSeeksIfLengthUnknown);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j11) {
        return getTimeUsAtPosition(j11);
    }

    public ConstantBitrateSeeker(long j11, long j12, int i11, int i12, boolean z11) {
        super(j11, j12, i11, i12, z11);
        long j13 = j11;
        this.firstFramePosition = j12;
        this.bitrate = i11;
        this.frameSize = i12;
        this.allowSeeksIfLengthUnknown = z11;
        this.dataEndPosition = j13 == -1 ? -1L : j13;
    }
}
