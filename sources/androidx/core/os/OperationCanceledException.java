package androidx.core.os;

import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(@Nullable String str) {
        super(ObjectsCompat.toString(str, "The operation has been canceled."));
    }
}
