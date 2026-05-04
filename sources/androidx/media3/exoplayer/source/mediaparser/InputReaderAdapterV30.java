package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
@UnstableApi
/* loaded from: classes2.dex */
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {
    private long currentPosition;

    @Nullable
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j11 = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j11;
    }

    public long getLength() {
        return this.resourceLength;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int read = ((DataReader) Util.castNonNull(this.dataReader)).read(bArr, i11, i12);
        this.currentPosition += read;
        return read;
    }

    public void seekToPosition(long j11) {
        this.lastSeekPosition = j11;
    }

    public void setCurrentPosition(long j11) {
        this.currentPosition = j11;
    }

    public void setDataReader(DataReader dataReader, long j11) {
        this.dataReader = dataReader;
        this.resourceLength = j11;
        this.lastSeekPosition = -1L;
    }
}
