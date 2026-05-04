package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface LayoutInformationReceiver {
    @k
    MotionLayoutDebugFlags getForcedDrawDebug();

    int getForcedHeight();

    float getForcedProgress();

    int getForcedWidth();

    @k
    LayoutInfoFlags getLayoutInformationMode();

    void onNewProgress(float f11);

    void resetForcedProgress();

    void setLayoutInformation(@k String str);

    void setUpdateFlag(@k MutableState<Long> mutableState);
}
