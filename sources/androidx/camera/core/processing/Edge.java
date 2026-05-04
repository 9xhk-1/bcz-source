package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class Edge<T> implements Consumer<T> {
    private Consumer<T> mListener;

    @Override // androidx.core.util.Consumer
    public void accept(@NonNull T t11) {
        kotlin.jvm.internal.g0.n(this.mListener, "Listener is not set.");
        this.mListener.accept(t11);
    }

    public void setListener(@NonNull Consumer<T> consumer) {
        this.mListener = consumer;
    }
}
