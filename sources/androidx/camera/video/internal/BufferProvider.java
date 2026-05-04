package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Observable;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface BufferProvider<T> extends Observable<State> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        ACTIVE,
        INACTIVE
    }

    @NonNull
    p1<T> acquireBuffer();
}
