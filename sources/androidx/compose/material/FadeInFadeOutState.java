package androidx.compose.material;

import androidx.compose.runtime.RecomposeScope;
import java.util.ArrayList;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FadeInFadeOutState<T> {

    @l
    private Object current = new Object();

    @k
    private List<FadeInFadeOutAnimationItem<T>> items = new ArrayList();

    @l
    private RecomposeScope scope;

    @l
    public final Object getCurrent() {
        return this.current;
    }

    @k
    public final List<FadeInFadeOutAnimationItem<T>> getItems() {
        return this.items;
    }

    @l
    public final RecomposeScope getScope() {
        return this.scope;
    }

    public final void setCurrent(@l Object obj) {
        this.current = obj;
    }

    public final void setItems(@k List<FadeInFadeOutAnimationItem<T>> list) {
        this.items = list;
    }

    public final void setScope(@l RecomposeScope recomposeScope) {
        this.scope = recomposeScope;
    }
}
