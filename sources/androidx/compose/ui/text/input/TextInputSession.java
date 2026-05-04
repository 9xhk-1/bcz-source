package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Use PlatformTextInputModifierNode instead.")
@u0({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,365:1\n176#1,5:366\n176#1,5:371\n176#1,5:376\n176#1,5:381\n176#1,5:386\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n195#1:366,5\n219#1:371,5\n246#1:376,5\n266#1:381,5\n283#1:386,5\n*E\n"})
/* loaded from: classes2.dex */
public final class TextInputSession {
    public static final int $stable = 8;

    @k
    private final PlatformTextInputService platformTextInputService;

    @k
    private final TextInputService textInputService;

    public TextInputSession(@k TextInputService textInputService, @k PlatformTextInputService platformTextInputService) {
        this.textInputService = textInputService;
        this.platformTextInputService = platformTextInputService;
    }

    private final boolean ensureOpenSession(x00.a<g2> aVar) {
        boolean isOpen = isOpen();
        if (isOpen) {
            aVar.invoke();
        }
        return isOpen;
    }

    public final void dispose() {
        this.textInputService.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.hideSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean isOpen() {
        return g0.g(this.textInputService.getCurrentInputSession$ui_text_release(), this);
    }

    public final boolean notifyFocusedRect(@k Rect rect) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.notifyFocusedRect(rect);
        }
        return isOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean updateState(@l TextFieldValue textFieldValue, @k TextFieldValue textFieldValue2) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateState(textFieldValue, textFieldValue2);
        }
        return isOpen;
    }

    public final boolean updateTextLayoutResult(@k TextFieldValue textFieldValue, @k OffsetMapping offsetMapping, @k TextLayoutResult textLayoutResult, @k x00.l<? super Matrix, g2> lVar, @k Rect rect, @k Rect rect2) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, lVar, rect, rect2);
        }
        return isOpen;
    }
}
