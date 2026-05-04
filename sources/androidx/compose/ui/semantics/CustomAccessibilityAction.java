package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;

    @k
    private final a<Boolean> action;

    @k
    private final String label;

    public CustomAccessibilityAction(@k String str, @k a<Boolean> aVar) {
        this.label = str;
        this.action = aVar;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return g0.g(this.label, customAccessibilityAction.label) && this.action == customAccessibilityAction.action;
    }

    @k
    public final a<Boolean> getAction() {
        return this.action;
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    @k
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
