package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;

    @k
    private final Map<T, Float> anchors = new LinkedHashMap();

    public final void at(T t11, float f11) {
        this.anchors.put(t11, Float.valueOf(f11));
    }

    @k
    public final Map<T, Float> getAnchors$material_release() {
        return this.anchors;
    }
}
