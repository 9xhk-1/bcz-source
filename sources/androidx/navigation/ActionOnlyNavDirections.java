package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ActionOnlyNavDirections implements NavDirections {
    private final int actionId;

    @k
    private final Bundle arguments = new Bundle();

    public ActionOnlyNavDirections(int i11) {
        this.actionId = i11;
    }

    public static /* synthetic */ ActionOnlyNavDirections copy$default(ActionOnlyNavDirections actionOnlyNavDirections, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = actionOnlyNavDirections.actionId;
        }
        return actionOnlyNavDirections.copy(i11);
    }

    public final int component1() {
        return this.actionId;
    }

    @k
    public final ActionOnlyNavDirections copy(int i11) {
        return new ActionOnlyNavDirections(i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g0.g(ActionOnlyNavDirections.class, obj.getClass()) && getActionId() == ((ActionOnlyNavDirections) obj).getActionId();
    }

    @Override // androidx.navigation.NavDirections
    public int getActionId() {
        return this.actionId;
    }

    @Override // androidx.navigation.NavDirections
    @k
    public Bundle getArguments() {
        return this.arguments;
    }

    public int hashCode() {
        return 31 + getActionId();
    }

    @k
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + ')';
    }
}
