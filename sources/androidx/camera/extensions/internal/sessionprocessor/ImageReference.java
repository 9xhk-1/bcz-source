package androidx.camera.extensions.internal.sessionprocessor;

import android.media.Image;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ImageReference {
    boolean decrement();

    @Nullable
    Image get();

    boolean increment();
}
