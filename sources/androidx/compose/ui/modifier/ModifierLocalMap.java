package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    public /* synthetic */ ModifierLocalMap(v vVar) {
        this();
    }

    public abstract boolean contains$ui_release(@k ModifierLocal<?> modifierLocal);

    @l
    public abstract <T> T get$ui_release(@k ModifierLocal<T> modifierLocal);

    /* renamed from: set$ui_release */
    public abstract <T> void mo3963set$ui_release(@k ModifierLocal<T> modifierLocal, T t11);

    private ModifierLocalMap() {
    }
}
