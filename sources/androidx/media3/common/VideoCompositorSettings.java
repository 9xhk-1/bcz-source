package androidx.media3.common;

import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface VideoCompositorSettings {
    public static final VideoCompositorSettings DEFAULT = new VideoCompositorSettings() { // from class: androidx.media3.common.VideoCompositorSettings.1
        @Override // androidx.media3.common.VideoCompositorSettings
        public Size getOutputSize(List<Size> list) {
            return list.get(0);
        }

        @Override // androidx.media3.common.VideoCompositorSettings
        public OverlaySettings getOverlaySettings(int i11, long j11) {
            return new OverlaySettings() { // from class: androidx.media3.common.VideoCompositorSettings.1.1
            };
        }
    };

    Size getOutputSize(List<Size> list);

    OverlaySettings getOverlaySettings(int i11, long j11);
}
