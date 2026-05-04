package androidx.camera.camera2.internal.compat.workaround;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.Quirks;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class MeteringRegionCorrection {
    private final Quirks mCameraQuirks;

    public MeteringRegionCorrection(@NonNull Quirks quirks) {
        this.mCameraQuirks = quirks;
    }

    @NonNull
    public PointF getCorrectedPoint(@NonNull MeteringPoint meteringPoint, int i11) {
        return (i11 == 1 && this.mCameraQuirks.contains(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - meteringPoint.getX(), meteringPoint.getY()) : new PointF(meteringPoint.getX(), meteringPoint.getY());
    }
}
