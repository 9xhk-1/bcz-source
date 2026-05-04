package androidx.compose.ui.platform;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ClipEntry {
    public static final int $stable = 8;

    @m80.k
    private final ClipData clipData;

    public ClipEntry(@m80.k ClipData clipData) {
        this.clipData = clipData;
    }

    @m80.k
    public final ClipData getClipData() {
        return this.clipData;
    }

    @m80.k
    public final ClipMetadata getClipMetadata() {
        return AndroidClipboardManager_androidKt.toClipMetadata(this.clipData.getDescription());
    }
}
