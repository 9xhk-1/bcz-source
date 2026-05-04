package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class RendererConfiguration {
    public static final RendererConfiguration DEFAULT = new RendererConfiguration(0, false);
    public final int offloadModePreferred;
    public final boolean tunneling;

    public RendererConfiguration(boolean z11) {
        this.offloadModePreferred = 0;
        this.tunneling = z11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RendererConfiguration.class == obj.getClass()) {
            RendererConfiguration rendererConfiguration = (RendererConfiguration) obj;
            if (this.offloadModePreferred == rendererConfiguration.offloadModePreferred && this.tunneling == rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.offloadModePreferred << 1) + (this.tunneling ? 1 : 0);
    }

    public RendererConfiguration(int i11, boolean z11) {
        this.offloadModePreferred = i11;
        this.tunneling = z11;
    }
}
