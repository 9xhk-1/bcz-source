package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.impl.SessionProcessor;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SessionProcessorUtil {
    private SessionProcessorUtil() {
    }

    @Nullable
    public static FocusMeteringAction getModifiedFocusMeteringAction(@Nullable SessionProcessor sessionProcessor, @NonNull FocusMeteringAction focusMeteringAction) {
        boolean z11;
        if (sessionProcessor == null) {
            return focusMeteringAction;
        }
        FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(focusMeteringAction);
        boolean z12 = true;
        if (focusMeteringAction.getMeteringPointsAf().isEmpty() || isOperationSupported(sessionProcessor, 1, 2)) {
            z11 = false;
        } else {
            builder.removePoints(1);
            z11 = true;
        }
        if (!focusMeteringAction.getMeteringPointsAe().isEmpty() && !isOperationSupported(sessionProcessor, 3)) {
            builder.removePoints(2);
            z11 = true;
        }
        if (focusMeteringAction.getMeteringPointsAwb().isEmpty() || isOperationSupported(sessionProcessor, 4)) {
            z12 = z11;
        } else {
            builder.removePoints(4);
        }
        if (!z12) {
            return focusMeteringAction;
        }
        FocusMeteringAction build = builder.build();
        if (build.getMeteringPointsAf().isEmpty() && build.getMeteringPointsAe().isEmpty() && build.getMeteringPointsAwb().isEmpty()) {
            return null;
        }
        return builder.build();
    }

    public static boolean isOperationSupported(@Nullable SessionProcessor sessionProcessor, @NonNull int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return sessionProcessor.getSupportedCameraOperations().containsAll(arrayList);
    }
}
