package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.camera.view.q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Use PlatformTextInputModifierNode instead.")
/* loaded from: classes2.dex */
public class TextInputService {
    public static final int $stable = 8;

    @k
    private final AtomicReference<TextInputSession> _currentInputSession = new AtomicReference<>(null);

    @k
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(@k PlatformTextInputService platformTextInputService) {
        this.platformTextInputService = platformTextInputService;
    }

    @l
    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return this._currentInputSession.get();
    }

    @n(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @w0(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }

    @n(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @w0(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text_release() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    @k
    public TextInputSession startInput(@k TextFieldValue textFieldValue, @k ImeOptions imeOptions, @k x00.l<? super List<? extends EditCommand>, g2> lVar, @k x00.l<? super ImeAction, g2> lVar2) {
        this.platformTextInputService.startInput(textFieldValue, imeOptions, lVar, lVar2);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(@k TextInputSession textInputSession) {
        if (q.a(this._currentInputSession, textInputSession, null)) {
            this.platformTextInputService.stopInput();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public final void stopInput() {
        this._currentInputSession.set(null);
        this.platformTextInputService.stopInput();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public final void startInput() {
        this.platformTextInputService.startInput();
        this._currentInputSession.set(new TextInputSession(this, this.platformTextInputService));
    }
}
