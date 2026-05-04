package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRemaining;

    @Nullable
    private byte[] data;

    @Nullable
    private DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        Uri normalizeScheme = dataSpec.uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        Assertions.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] split = Util.split(normalizeScheme.getSchemeSpecificPart(), ",");
        if (split.length != 2) {
            throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = split[1];
        if (split[0].contains(pk.e.f80674c)) {
            try {
                this.data = Base64.decode(str, 0);
            } catch (IllegalArgumentException e11) {
                throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e11);
            }
        } else {
            this.data = Util.getUtf8Bytes(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j11 = dataSpec.position;
        byte[] bArr = this.data;
        if (j11 > bArr.length) {
            this.data = null;
            throw new DataSourceException(2008);
        }
        int i11 = (int) j11;
        this.readPosition = i11;
        int length = bArr.length - i11;
        this.bytesRemaining = length;
        long j12 = dataSpec.length;
        if (j12 != -1) {
            this.bytesRemaining = (int) Math.min(length, j12);
        }
        transferStarted(dataSpec);
        long j13 = dataSpec.length;
        return j13 != -1 ? j13 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.bytesRemaining;
        if (i13 == 0) {
            return -1;
        }
        int min = Math.min(i12, i13);
        System.arraycopy(Util.castNonNull(this.data), this.readPosition, bArr, i11, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }
}
