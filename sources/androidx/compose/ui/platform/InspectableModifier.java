package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.DeprecationLevel;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@yz.n(level = DeprecationLevel.WARNING, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
/* loaded from: classes2.dex */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;

    @m80.k
    private final End end;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class End implements Modifier.Element {
        public End() {
        }
    }

    public InspectableModifier(@m80.k x00.l<? super InspectorInfo, g2> lVar) {
        super(lVar);
        this.end = new End();
    }

    @m80.k
    public final End getEnd() {
        return this.end;
    }
}
