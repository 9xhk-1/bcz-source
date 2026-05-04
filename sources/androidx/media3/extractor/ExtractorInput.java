package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface ExtractorInput extends DataReader {
    void advancePeekPosition(int i11) throws IOException;

    boolean advancePeekPosition(int i11, boolean z11) throws IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i11, int i12) throws IOException;

    void peekFully(byte[] bArr, int i11, int i12) throws IOException;

    boolean peekFully(byte[] bArr, int i11, int i12, boolean z11) throws IOException;

    @Override // androidx.media3.common.DataReader
    int read(byte[] bArr, int i11, int i12) throws IOException;

    void readFully(byte[] bArr, int i11, int i12) throws IOException;

    boolean readFully(byte[] bArr, int i11, int i12, boolean z11) throws IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j11, E e11) throws Throwable;

    int skip(int i11) throws IOException;

    void skipFully(int i11) throws IOException;

    boolean skipFully(int i11, boolean z11) throws IOException;
}
