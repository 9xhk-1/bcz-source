package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,373:1\n78#2:374\n107#2,2:375\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n*L\n266#1:374\n266#1:375,2\n*E\n"})
/* loaded from: classes.dex */
public final class PasswordInputTransformation implements InputTransformation {
    public static final int $stable = 0;

    @k
    private final MutableIntState revealCodepointIndex$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);

    @k
    private final x00.a<g2> scheduleHide;

    public PasswordInputTransformation(@k x00.a<g2> aVar) {
        this.scheduleHide = aVar;
    }

    private final void setRevealCodepointIndex(int i11) {
        this.revealCodepointIndex$delegate.setIntValue(i11);
    }

    public final int getRevealCodepointIndex$foundation_release() {
        return this.revealCodepointIndex$delegate.getIntValue();
    }

    @k
    public final x00.a<g2> getScheduleHide() {
        return this.scheduleHide;
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(@k TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChanges().getChangeCount() != 1 || TextRange.m4555getLengthimpl(textFieldBuffer.getChanges().mo1186getRangejx7JFs(0)) != 1 || TextRange.m4555getLengthimpl(textFieldBuffer.getChanges().mo1185getOriginalRangejx7JFs(0)) != 0 || textFieldBuffer.hasSelection()) {
            setRevealCodepointIndex(-1);
            return;
        }
        int m4557getMinimpl = TextRange.m4557getMinimpl(textFieldBuffer.getChanges().mo1186getRangejx7JFs(0));
        if (getRevealCodepointIndex$foundation_release() != m4557getMinimpl) {
            this.scheduleHide.invoke();
            setRevealCodepointIndex(m4557getMinimpl);
        }
    }
}
