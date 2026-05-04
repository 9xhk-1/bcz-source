package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class DummyTrackOutput implements TrackOutput {
    private final DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        this.discardingTrackOutput.format(format);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i11, boolean z11) throws IOException {
        return this.discardingTrackOutput.sampleData(dataReader, i11, z11);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable TrackOutput.CryptoData cryptoData) {
        this.discardingTrackOutput.sampleMetadata(j11, i11, i12, i13, cryptoData);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i11) {
        this.discardingTrackOutput.sampleData(parsableByteArray, i11);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i11, boolean z11, int i12) throws IOException {
        return this.discardingTrackOutput.sampleData(dataReader, i11, z11, i12);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i11, int i12) {
        this.discardingTrackOutput.sampleData(parsableByteArray, i11, i12);
    }
}
