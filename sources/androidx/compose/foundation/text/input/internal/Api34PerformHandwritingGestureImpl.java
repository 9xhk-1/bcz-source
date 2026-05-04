package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(34)
/* loaded from: classes.dex */
final class Api34PerformHandwritingGestureImpl {

    @m80.k
    public static final Api34PerformHandwritingGestureImpl INSTANCE = new Api34PerformHandwritingGestureImpl();

    private Api34PerformHandwritingGestureImpl() {
    }

    public final void performHandwritingGesture(@m80.k TextInputSession textInputSession, @m80.k HandwritingGesture handwritingGesture, @m80.l Executor executor, @m80.l final IntConsumer intConsumer) {
        final int performHandwritingGesture = textInputSession.performHandwritingGesture(handwritingGesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.input.internal.e
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(performHandwritingGesture);
                }
            });
        } else {
            intConsumer.accept(performHandwritingGesture);
        }
    }

    public final boolean previewHandwritingGesture(@m80.k TextInputSession textInputSession, @m80.k PreviewableHandwritingGesture previewableHandwritingGesture, @m80.l CancellationSignal cancellationSignal) {
        return textInputSession.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}
