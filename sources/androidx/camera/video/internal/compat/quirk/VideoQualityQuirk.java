package androidx.camera.video.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Quirk;
import androidx.camera.video.Quality;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface VideoQualityQuirk extends Quirk {
    boolean isProblematicVideoQuality(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull Quality quality);
}
