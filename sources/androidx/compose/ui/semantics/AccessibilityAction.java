package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AccessibilityAction<T extends w<? extends Boolean>> {
    public static final int $stable = 0;

    @l
    private final T action;

    @l
    private final String label;

    public AccessibilityAction(@l String str, @l T t11) {
        this.label = str;
        this.action = t11;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        return g0.g(this.label, accessibilityAction.label) && g0.g(this.action, accessibilityAction.action);
    }

    @l
    public final T getAction() {
        return this.action;
    }

    @l
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.label;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t11 = this.action;
        return hashCode + (t11 != null ? t11.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
