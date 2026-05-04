package androidx.camera.core.internal.compat.workaround;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class SurfaceSorter {
    private static final int PRIORITY_MEDIA_CODEC_SURFACE = 2;
    private static final int PRIORITY_OTHERS = 1;
    private static final int PRIORITY_PREVIEW_SURFACE = 0;
    private final boolean mHasQuirk;

    public SurfaceSorter() {
        this.mHasQuirk = DeviceQuirks.get(SurfaceOrderQuirk.class) != null;
    }

    public static /* synthetic */ int a(SurfaceSorter surfaceSorter, SessionConfig.OutputConfig outputConfig, SessionConfig.OutputConfig outputConfig2) {
        surfaceSorter.getClass();
        return surfaceSorter.getSurfacePriority(outputConfig.getSurface()) - surfaceSorter.getSurfacePriority(outputConfig2.getSurface());
    }

    private int getSurfacePriority(@NonNull DeferrableSurface deferrableSurface) {
        if (deferrableSurface.getContainerClass() == MediaCodec.class) {
            return 2;
        }
        return deferrableSurface.getContainerClass() == Preview.class ? 0 : 1;
    }

    public void sort(@NonNull List<SessionConfig.OutputConfig> list) {
        if (this.mHasQuirk) {
            Collections.sort(list, new Comparator() { // from class: androidx.camera.core.internal.compat.workaround.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SurfaceSorter.a(SurfaceSorter.this, (SessionConfig.OutputConfig) obj, (SessionConfig.OutputConfig) obj2);
                }
            });
        }
    }
}
