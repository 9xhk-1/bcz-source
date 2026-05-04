package androidx.compose.ui.platform;

import android.content.ClipDescription;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ClipMetadata {
    public static final int $stable = 8;

    @m80.k
    private final ClipDescription clipDescription;

    public ClipMetadata(@m80.k ClipDescription clipDescription) {
        this.clipDescription = clipDescription;
    }

    @m80.k
    public final ClipDescription getClipDescription() {
        return this.clipDescription;
    }
}
