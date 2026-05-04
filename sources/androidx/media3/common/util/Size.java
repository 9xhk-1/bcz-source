package androidx.media3.common.util;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Size {
    public static final Size UNKNOWN = new Size(-1, -1);
    public static final Size ZERO = new Size(0, 0);
    private final int height;
    private final int width;

    public Size(int i11, int i12) {
        Assertions.checkArgument((i11 == -1 || i11 >= 0) && (i12 == -1 || i12 >= 0));
        this.width = i11;
        this.height = i12;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i11 = this.height;
        int i12 = this.width;
        return i11 ^ ((i12 >>> 16) | (i12 << 16));
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
