package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(message = "Use PlatformTextInputModifierNode instead.")
/* loaded from: classes2.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    void showSoftwareKeyboard();

    default void startInput() {
    }

    void startInput(@k TextFieldValue textFieldValue, @k ImeOptions imeOptions, @k l<? super List<? extends EditCommand>, g2> lVar, @k l<? super ImeAction, g2> lVar2);

    void stopInput();

    void updateState(@m80.l TextFieldValue textFieldValue, @k TextFieldValue textFieldValue2);

    default void notifyFocusedRect(@k Rect rect) {
    }

    default void updateTextLayoutResult(@k TextFieldValue textFieldValue, @k OffsetMapping offsetMapping, @k TextLayoutResult textLayoutResult, @k l<? super Matrix, g2> lVar, @k Rect rect, @k Rect rect2) {
    }
}
