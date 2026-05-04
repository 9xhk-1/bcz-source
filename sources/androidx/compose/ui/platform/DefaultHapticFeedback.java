package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DefaultHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;

    @m80.k
    private final View view;

    public DefaultHapticFeedback(@m80.k View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo3231performHapticFeedbackCdsT49E(int i11) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3239getConfirm5zf0vsI())) {
            this.view.performHapticFeedback(16);
            return;
        }
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3240getContextClick5zf0vsI())) {
            this.view.performHapticFeedback(6);
            return;
        }
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3241getGestureEnd5zf0vsI())) {
            this.view.performHapticFeedback(13);
            return;
        }
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3242getGestureThresholdActivate5zf0vsI())) {
            this.view.performHapticFeedback(23);
            return;
        }
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3243getLongPress5zf0vsI())) {
            this.view.performHapticFeedback(0);
            return;
        }
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3244getReject5zf0vsI())) {
            this.view.performHapticFeedback(17);
            return;
        }
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3245getSegmentFrequentTick5zf0vsI())) {
            this.view.performHapticFeedback(27);
            return;
        }
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3246getSegmentTick5zf0vsI())) {
            this.view.performHapticFeedback(26);
            return;
        }
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3247getTextHandleMove5zf0vsI())) {
            this.view.performHapticFeedback(9);
            return;
        }
        if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3248getToggleOff5zf0vsI())) {
            this.view.performHapticFeedback(22);
        } else if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3249getToggleOn5zf0vsI())) {
            this.view.performHapticFeedback(21);
        } else if (HapticFeedbackType.m3235equalsimpl0(i11, companion.m3250getVirtualKey5zf0vsI())) {
            this.view.performHapticFeedback(1);
        }
    }
}
