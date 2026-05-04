package androidx.media3.datasource;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import androidx.annotation.RequiresExtension;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresExtension(extension = 31, version = 7)
/* loaded from: classes2.dex */
final class ByteArrayUploadDataProvider extends UploadDataProvider {
    private final byte[] data;
    private int position;

    public ByteArrayUploadDataProvider(byte[] bArr) {
        this.data = bArr;
    }

    public long getLength() {
        return this.data.length;
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int min = Math.min(byteBuffer.remaining(), this.data.length - this.position);
        byteBuffer.put(this.data, this.position, min);
        this.position += min;
        uploadDataSink.onReadSucceeded(false);
    }

    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.position = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
