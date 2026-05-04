package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class FrameInfo {
    public final Format format;
    public final long offsetToAddUs;

    public FrameInfo(Format format, long j11) {
        Assertions.checkArgument(format.colorInfo != null, "format colorInfo must be set");
        Assertions.checkArgument(format.width > 0, "format width must be positive, but is: " + format.width);
        Assertions.checkArgument(format.height > 0, "format height must be positive, but is: " + format.height);
        this.format = format;
        this.offsetToAddUs = j11;
    }
}
