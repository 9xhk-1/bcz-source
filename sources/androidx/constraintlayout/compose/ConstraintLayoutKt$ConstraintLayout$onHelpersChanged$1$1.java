package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.Lambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1 extends Lambda implements x00.a<g2> {
    final /* synthetic */ ConstraintSetForInlineDsl $constraintSet;
    final /* synthetic */ MutableState<Boolean> $remeasureRequesterState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(MutableState<Boolean> mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.$remeasureRequesterState = mutableState;
        this.$constraintSet = constraintSetForInlineDsl;
    }

    @Override // x00.a
    public /* bridge */ /* synthetic */ g2 invoke() {
        invoke2();
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$remeasureRequesterState.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
        this.$constraintSet.setKnownDirty(true);
    }
}
