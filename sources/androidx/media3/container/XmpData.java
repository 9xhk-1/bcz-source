package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class XmpData implements Metadata.Entry {
    public final byte[] data;

    public XmpData(byte[] bArr) {
        this.data = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XmpData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.data, ((XmpData) obj).data);
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public String toString() {
        return "XMP: " + Util.toHexString(this.data);
    }
}
