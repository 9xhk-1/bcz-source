package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.EditCommand;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(34)
/* loaded from: classes.dex */
final class Api34LegacyPerformHandwritingGestureImpl {

    @m80.k
    public static final Api34LegacyPerformHandwritingGestureImpl INSTANCE = new Api34LegacyPerformHandwritingGestureImpl();

    private Api34LegacyPerformHandwritingGestureImpl() {
    }

    public final void performHandwritingGesture(@m80.l LegacyTextFieldState legacyTextFieldState, @m80.l TextFieldSelectionManager textFieldSelectionManager, @m80.k HandwritingGesture handwritingGesture, @m80.l ViewConfiguration viewConfiguration, @m80.l Executor executor, @m80.l final IntConsumer intConsumer, @m80.k x00.l<? super EditCommand, g2> lVar) {
        final int performHandwritingGesture$foundation_release = legacyTextFieldState != null ? HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation_release(legacyTextFieldState, handwritingGesture, textFieldSelectionManager, viewConfiguration, lVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.input.internal.d
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(performHandwritingGesture$foundation_release);
                }
            });
        } else {
            intConsumer.accept(performHandwritingGesture$foundation_release);
        }
    }

    public final boolean previewHandwritingGesture(@m80.l LegacyTextFieldState legacyTextFieldState, @m80.l TextFieldSelectionManager textFieldSelectionManager, @m80.k PreviewableHandwritingGesture previewableHandwritingGesture, @m80.l CancellationSignal cancellationSignal) {
        if (legacyTextFieldState != null) {
            return HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation_release(legacyTextFieldState, previewableHandwritingGesture, textFieldSelectionManager, cancellationSignal);
        }
        return false;
    }
}
