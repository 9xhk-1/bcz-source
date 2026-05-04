package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@UiToolingDataApi
/* loaded from: classes2.dex */
public final class ContextCache {
    public static final int $stable = 8;

    @k
    private final Map<String, Object> contexts = new LinkedHashMap();

    public final void clear() {
        this.contexts.clear();
    }

    @k
    public final Map<String, Object> getContexts$ui_tooling_data() {
        return this.contexts;
    }
}
