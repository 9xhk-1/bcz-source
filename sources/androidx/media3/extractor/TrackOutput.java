package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface TrackOutput {
    public static final int SAMPLE_DATA_PART_ENCRYPTION = 1;
    public static final int SAMPLE_DATA_PART_MAIN = 0;
    public static final int SAMPLE_DATA_PART_SUPPLEMENTAL = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CryptoData {
        public final int clearBlocks;
        public final int cryptoMode;
        public final int encryptedBlocks;
        public final byte[] encryptionKey;

        public CryptoData(int i11, byte[] bArr, int i12, int i13) {
            this.cryptoMode = i11;
            this.encryptionKey = bArr;
            this.encryptedBlocks = i12;
            this.clearBlocks = i13;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CryptoData.class == obj.getClass()) {
                CryptoData cryptoData = (CryptoData) obj;
                if (this.cryptoMode == cryptoData.cryptoMode && this.encryptedBlocks == cryptoData.encryptedBlocks && this.clearBlocks == cryptoData.clearBlocks && Arrays.equals(this.encryptionKey, cryptoData.encryptionKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.cryptoMode * 31) + Arrays.hashCode(this.encryptionKey)) * 31) + this.encryptedBlocks) * 31) + this.clearBlocks;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    void format(Format format);

    default int sampleData(DataReader dataReader, int i11, boolean z11) throws IOException {
        return sampleData(dataReader, i11, z11, 0);
    }

    int sampleData(DataReader dataReader, int i11, boolean z11, int i12) throws IOException;

    void sampleData(ParsableByteArray parsableByteArray, int i11, int i12);

    void sampleMetadata(long j11, int i11, int i12, int i13, @Nullable CryptoData cryptoData);

    default void sampleData(ParsableByteArray parsableByteArray, int i11) {
        sampleData(parsableByteArray, i11, 0);
    }

    default void durationUs(long j11) {
    }
}
