package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4AlternateGroupData implements Metadata.Entry {
    public final int alternateGroup;

    public Mp4AlternateGroupData(int i11) {
        this.alternateGroup = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4AlternateGroupData) && this.alternateGroup == ((Mp4AlternateGroupData) obj).alternateGroup;
    }

    public int hashCode() {
        return this.alternateGroup;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.alternateGroup;
    }
}
