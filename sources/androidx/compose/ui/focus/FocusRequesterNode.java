package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,79:1\n641#2,2:80\n646#2,2:82\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n*L\n71#1:80,2\n75#1:82,2\n*E\n"})
/* loaded from: classes.dex */
final class FocusRequesterNode extends Modifier.Node implements FocusRequesterModifierNode {

    @k
    private FocusRequester focusRequester;

    public FocusRequesterNode(@k FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    @k
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.focusRequester.getFocusRequesterNodes$ui_release().add(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.focusRequester.getFocusRequesterNodes$ui_release().remove(this);
        super.onDetach();
    }

    public final void setFocusRequester(@k FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }
}
