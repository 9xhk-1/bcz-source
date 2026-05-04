package androidx.compose.ui.text.input;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(34)
/* loaded from: classes2.dex */
class NullableInputConnectionWrapperApi34 extends NullableInputConnectionWrapperApi25 {
    public NullableInputConnectionWrapperApi34(@k InputConnection inputConnection, @k l<? super NullableInputConnectionWrapper, g2> lVar) {
        super(inputConnection, lVar);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(@k HandwritingGesture handwritingGesture, @m80.l Executor executor, @m80.l IntConsumer intConsumer) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            delegate.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(@k PreviewableHandwritingGesture previewableHandwritingGesture, @m80.l CancellationSignal cancellationSignal) {
        boolean previewHandwritingGesture;
        InputConnection delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        previewHandwritingGesture = delegate.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        return previewHandwritingGesture;
    }
}
