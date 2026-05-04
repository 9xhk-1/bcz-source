package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static void closeQuietly(@Nullable DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(DataSource dataSource, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int read = dataSource.read(bArr, i12, i11 - i12);
            if (read == -1) {
                throw new IllegalStateException("Not enough data could be read: " + i12 + " < " + i11);
            }
            i12 += read;
        }
        return bArr;
    }

    public static byte[] readToEnd(DataSource dataSource) throws IOException {
        byte[] bArr = new byte[1024];
        int i11 = 0;
        int i12 = 0;
        while (i11 != -1) {
            if (i12 == bArr.length) {
                bArr = Arrays.copyOf(bArr, bArr.length * 2);
            }
            i11 = dataSource.read(bArr, i12, bArr.length - i12);
            if (i11 != -1) {
                i12 += i11;
            }
        }
        return Arrays.copyOf(bArr, i12);
    }
}
