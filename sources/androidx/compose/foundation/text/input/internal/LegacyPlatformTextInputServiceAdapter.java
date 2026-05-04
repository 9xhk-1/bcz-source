package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.PlatformTextInputService;
import c40.l2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nLegacyPlatformTextInputServiceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.kt\nandroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,84:1\n50#2,5:85\n50#2,5:90\n*S KotlinDebug\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.kt\nandroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter\n*L\n51#1:85,5\n58#1:90,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class LegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {
    public static final int $stable = 8;

    @m80.l
    private LegacyPlatformTextInputNode textInputModifierNode;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface LegacyPlatformTextInputNode {
        @m80.l
        LayoutCoordinates getLayoutCoordinates();

        @m80.l
        LegacyTextFieldState getLegacyTextFieldState();

        @m80.l
        SoftwareKeyboardController getSoftwareKeyboardController();

        @m80.l
        TextFieldSelectionManager getTextFieldSelectionManager();

        @m80.k
        ViewConfiguration getViewConfiguration();

        @m80.l
        l2 launchTextInputSession(@m80.k x00.p<? super PlatformTextInputSession, ? super j00.c<?>, ? extends Object> pVar);
    }

    @m80.l
    public final LegacyPlatformTextInputNode getTextInputModifierNode() {
        return this.textInputModifierNode;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    public final void registerModifier(@m80.k LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (!(this.textInputModifierNode == null)) {
            InlineClassHelperKt.throwIllegalStateException("Expected textInputModifierNode to be null");
        }
        this.textInputModifierNode = legacyPlatformTextInputNode;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    public abstract void startStylusHandwriting();

    public final void unregisterModifier(@m80.k LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (!(this.textInputModifierNode == legacyPlatformTextInputNode)) {
            InlineClassHelperKt.throwIllegalStateException("Expected textInputModifierNode to be " + legacyPlatformTextInputNode + " but was " + this.textInputModifierNode);
        }
        this.textInputModifierNode = null;
    }
}
