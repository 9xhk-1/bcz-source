package androidx.media3.common.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class GlRect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public GlRect(int i11, int i12) {
        this(0, 0, i11, i12);
    }

    public GlRect(int i11, int i12, int i13, int i14) {
        Assertions.checkArgument(i11 <= i13 && i12 <= i14);
        this.left = i11;
        this.bottom = i12;
        this.right = i13;
        this.top = i14;
    }
}
