package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TrackFragment {
    public long atomPosition;
    public long auxiliaryDataPosition;
    public long dataPosition;
    public boolean definesEncryptionData;
    public DefaultSampleValues header;
    public long nextFragmentDecodeTime;
    public boolean nextFragmentDecodeTimeIncludesMoov;
    public int sampleCount;
    public boolean sampleEncryptionDataNeedsFill;

    @Nullable
    public TrackEncryptionBox trackEncryptionBox;
    public int trunCount;
    public long[] trunDataPosition = new long[0];
    public int[] trunLength = new int[0];
    public int[] sampleSizeTable = new int[0];
    public long[] samplePresentationTimesUs = new long[0];
    public boolean[] sampleIsSyncFrameTable = new boolean[0];
    public boolean[] sampleHasSubsampleEncryptionTable = new boolean[0];
    public final ParsableByteArray sampleEncryptionData = new ParsableByteArray();

    public void fillEncryptionData(ExtractorInput extractorInput) throws IOException {
        extractorInput.readFully(this.sampleEncryptionData.getData(), 0, this.sampleEncryptionData.limit());
        this.sampleEncryptionData.setPosition(0);
        this.sampleEncryptionDataNeedsFill = false;
    }

    public long getSamplePresentationTimeUs(int i11) {
        return this.samplePresentationTimesUs[i11];
    }

    public void initEncryptionData(int i11) {
        this.sampleEncryptionData.reset(i11);
        this.definesEncryptionData = true;
        this.sampleEncryptionDataNeedsFill = true;
    }

    public void initTables(int i11, int i12) {
        this.trunCount = i11;
        this.sampleCount = i12;
        if (this.trunLength.length < i11) {
            this.trunDataPosition = new long[i11];
            this.trunLength = new int[i11];
        }
        if (this.sampleSizeTable.length < i12) {
            int i13 = (i12 * 125) / 100;
            this.sampleSizeTable = new int[i13];
            this.samplePresentationTimesUs = new long[i13];
            this.sampleIsSyncFrameTable = new boolean[i13];
            this.sampleHasSubsampleEncryptionTable = new boolean[i13];
        }
    }

    public void reset() {
        this.trunCount = 0;
        this.nextFragmentDecodeTime = 0L;
        this.nextFragmentDecodeTimeIncludesMoov = false;
        this.definesEncryptionData = false;
        this.sampleEncryptionDataNeedsFill = false;
        this.trackEncryptionBox = null;
    }

    public boolean sampleHasSubsampleEncryptionTable(int i11) {
        return this.definesEncryptionData && this.sampleHasSubsampleEncryptionTable[i11];
    }

    public void fillEncryptionData(ParsableByteArray parsableByteArray) {
        parsableByteArray.readBytes(this.sampleEncryptionData.getData(), 0, this.sampleEncryptionData.limit());
        this.sampleEncryptionData.setPosition(0);
        this.sampleEncryptionDataNeedsFill = false;
    }
}
