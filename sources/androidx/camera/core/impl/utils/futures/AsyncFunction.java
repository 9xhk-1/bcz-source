package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@FunctionalInterface
/* loaded from: classes.dex */
public interface AsyncFunction<I, O> {
    @NonNull
    p1<O> apply(@Nullable I i11) throws Exception;
}
