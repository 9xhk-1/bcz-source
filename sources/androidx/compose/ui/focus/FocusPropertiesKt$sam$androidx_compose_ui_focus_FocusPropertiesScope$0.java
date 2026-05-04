package androidx.compose.ui.focus;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 implements FocusPropertiesScope, b0 {
    private final /* synthetic */ l function;

    public FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(l lVar) {
        this.function = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public final /* synthetic */ void apply(FocusProperties focusProperties) {
        this.function.invoke(focusProperties);
    }

    public final boolean equals(@m80.l Object obj) {
        if ((obj instanceof FocusPropertiesScope) && (obj instanceof b0)) {
            return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.b0
    @k
    public final w<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
