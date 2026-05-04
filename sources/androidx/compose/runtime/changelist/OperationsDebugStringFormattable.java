package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.load.engine.GlideException;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class OperationsDebugStringFormattable {
    public static final int $stable = 0;

    public static /* synthetic */ String toDebugString$default(OperationsDebugStringFormattable operationsDebugStringFormattable, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if ((i11 & 1) != 0) {
            str = GlideException.a.f28776d;
        }
        return operationsDebugStringFormattable.toDebugString(str);
    }

    @k
    public abstract String toDebugString(@k String str);
}
