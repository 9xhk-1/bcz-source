package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ConvergenceUtils {
    private static final Set<CameraCaptureMetaData.AeState> AE_CONVERGED_STATE_SET;
    private static final Set<CameraCaptureMetaData.AeState> AE_TORCH_AS_FLASH_CONVERGED_STATE_SET;
    private static final Set<CameraCaptureMetaData.AfState> AF_CONVERGED_STATE_SET = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AfState.PASSIVE_FOCUSED, CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED));
    private static final Set<CameraCaptureMetaData.AwbState> AWB_CONVERGED_STATE_SET = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AwbState.CONVERGED, CameraCaptureMetaData.AwbState.UNKNOWN));
    private static final String TAG = "ConvergenceUtils";

    static {
        CameraCaptureMetaData.AeState aeState = CameraCaptureMetaData.AeState.CONVERGED;
        CameraCaptureMetaData.AeState aeState2 = CameraCaptureMetaData.AeState.FLASH_REQUIRED;
        CameraCaptureMetaData.AeState aeState3 = CameraCaptureMetaData.AeState.UNKNOWN;
        Set<CameraCaptureMetaData.AeState> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(aeState, aeState2, aeState3));
        AE_CONVERGED_STATE_SET = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(aeState2);
        copyOf.remove(aeState3);
        AE_TORCH_AS_FLASH_CONVERGED_STATE_SET = Collections.unmodifiableSet(copyOf);
    }

    private ConvergenceUtils() {
    }

    public static boolean is3AConverged(@NonNull CameraCaptureResult cameraCaptureResult, boolean z11) {
        boolean z12 = cameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.OFF || cameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.UNKNOWN || AF_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAfState());
        boolean z13 = cameraCaptureResult.getAeMode() == CameraCaptureMetaData.AeMode.OFF;
        boolean z14 = !z11 ? !(z13 || AE_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAeState())) : !(z13 || AE_TORCH_AS_FLASH_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAeState()));
        boolean z15 = cameraCaptureResult.getAwbMode() == CameraCaptureMetaData.AwbMode.OFF || AWB_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAwbState());
        Logger.d(TAG, "checkCaptureResult, AE=" + cameraCaptureResult.getAeState() + " AF =" + cameraCaptureResult.getAfState() + " AWB=" + cameraCaptureResult.getAwbState());
        return z12 && z14 && z15;
    }
}
