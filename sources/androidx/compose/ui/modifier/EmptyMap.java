package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class EmptyMap extends ModifierLocalMap {
    public static final int $stable = 0;

    @k
    public static final EmptyMap INSTANCE = new EmptyMap();

    private EmptyMap() {
        super(null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@k ModifierLocal<?> modifierLocal) {
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(@k ModifierLocal<T> modifierLocal) {
        throw new IllegalStateException("");
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo3963set$ui_release(ModifierLocal modifierLocal, Object obj) {
        set$ui_release((ModifierLocal<ModifierLocal>) modifierLocal, (ModifierLocal) obj);
    }

    @k
    public <T> Void set$ui_release(@k ModifierLocal<T> modifierLocal, T t11) {
        throw new IllegalStateException("");
    }
}
