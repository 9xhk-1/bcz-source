package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingExtractorInput implements ExtractorInput {
    private final ExtractorInput input;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.input = extractorInput;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean advancePeekPosition(int i11, boolean z11) throws IOException {
        return this.input.advancePeekPosition(i11, z11);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.input.getLength();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.input.getPeekPosition();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.input.getPosition();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int peek(byte[] bArr, int i11, int i12) throws IOException {
        return this.input.peek(bArr, i11, i12);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        return this.input.peekFully(bArr, i11, i12, z11);
    }

    @Override // androidx.media3.extractor.ExtractorInput, androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        return this.input.read(bArr, i11, i12);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        return this.input.readFully(bArr, i11, i12, z11);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.input.resetPeekPosition();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j11, E e11) throws Throwable {
        this.input.setRetryPosition(j11, e11);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int skip(int i11) throws IOException {
        return this.input.skip(i11);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean skipFully(int i11, boolean z11) throws IOException {
        return this.input.skipFully(i11, z11);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void advancePeekPosition(int i11) throws IOException {
        this.input.advancePeekPosition(i11);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i11, int i12) throws IOException {
        this.input.peekFully(bArr, i11, i12);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i11, int i12) throws IOException {
        this.input.readFully(bArr, i11, i12);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void skipFully(int i11) throws IOException {
        this.input.skipFully(i11);
    }
}
