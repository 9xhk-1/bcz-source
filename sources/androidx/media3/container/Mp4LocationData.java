package androidx.media3.container;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import ro.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public final float latitude;
    public final float longitude;

    public Mp4LocationData(@FloatRange(from = -90.0d, to = 90.0d) float f11, @FloatRange(from = -180.0d, to = 180.0d) float f12) {
        Assertions.checkArgument(f11 >= -90.0f && f11 <= 90.0f && f12 >= -180.0f && f12 <= 180.0f, "Invalid latitude or longitude");
        this.latitude = f11;
        this.longitude = f12;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Mp4LocationData.class == obj.getClass()) {
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
            if (this.latitude == mp4LocationData.latitude && this.longitude == mp4LocationData.longitude) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + g.j(this.latitude)) * 31) + g.j(this.longitude);
    }

    public String toString() {
        return "xyz: latitude=" + this.latitude + ", longitude=" + this.longitude;
    }
}
