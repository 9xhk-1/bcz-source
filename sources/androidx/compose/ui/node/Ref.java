package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Ref<T> {
    public static final int $stable = 8;

    @l
    private T value;

    @l
    public final T getValue() {
        return this.value;
    }

    public final void setValue(@l T t11) {
        this.value = t11;
    }
}
