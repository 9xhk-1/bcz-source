package androidx.compose.ui.graphics;

import androidx.annotation.IntRange;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PixelMap {

    @m80.k
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(@m80.k int[] iArr, int i11, int i12, int i13, int i14) {
        this.buffer = iArr;
        this.width = i11;
        this.height = i12;
        this.bufferOffset = i13;
        this.stride = i14;
    }

    /* renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m2806getWaAFU9c(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        return ColorKt.Color(this.buffer[this.bufferOffset + (i12 * this.stride) + i11]);
    }

    @m80.k
    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getStride() {
        return this.stride;
    }

    public final int getWidth() {
        return this.width;
    }
}
