package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4OrientationData implements Metadata.Entry {
    public final int orientation;

    public Mp4OrientationData(int i11) {
        Assertions.checkArgument(i11 == 0 || i11 == 90 || i11 == 180 || i11 == 270, "Unsupported orientation");
        this.orientation = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4OrientationData) && this.orientation == ((Mp4OrientationData) obj).orientation;
    }

    public int hashCode() {
        return 527 + Integer.hashCode(this.orientation);
    }

    public String toString() {
        return "Orientation= " + this.orientation;
    }
}
