package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextInputService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {
    public static final int $stable = 0;

    @m80.k
    private final TextInputService textInputService;

    public DelegatingSoftwareKeyboardController(@m80.k TextInputService textInputService) {
        this.textInputService = textInputService;
    }

    @m80.k
    public final TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public void hide() {
        this.textInputService.hideSoftwareKeyboard();
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public void show() {
        this.textInputService.showSoftwareKeyboard();
    }
}
