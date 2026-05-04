package androidx.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class BinaryFrame extends Id3Frame {
    public final byte[] data;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f5226id.equals(binaryFrame.f5226id) && Arrays.equals(this.data, binaryFrame.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f5226id.hashCode()) * 31) + Arrays.hashCode(this.data);
    }
}
