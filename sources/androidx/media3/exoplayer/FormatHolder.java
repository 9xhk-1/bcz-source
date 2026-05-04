package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DrmSession;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class FormatHolder {

    @Nullable
    public DrmSession drmSession;

    @Nullable
    public Format format;

    public void clear() {
        this.drmSession = null;
        this.format = null;
    }
}
