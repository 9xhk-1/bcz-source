package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,235:1\n65#2,5:236\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n*L\n71#1:236,5\n*E\n"})
/* loaded from: classes.dex */
public final class BackwardsCompatLocalMap extends ModifierLocalMap {
    public static final int $stable = 8;

    @k
    private ModifierLocalProvider<?> element;

    public BackwardsCompatLocalMap(@k ModifierLocalProvider<?> modifierLocalProvider) {
        super(null);
        this.element = modifierLocalProvider;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@k ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.element.getKey();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    @l
    public <T> T get$ui_release(@k ModifierLocal<T> modifierLocal) {
        if (!(modifierLocal == this.element.getKey())) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        return (T) this.element.getValue();
    }

    @k
    public final ModifierLocalProvider<?> getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo3963set$ui_release(@k ModifierLocal<T> modifierLocal, T t11) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    public final void setElement(@k ModifierLocalProvider<?> modifierLocalProvider) {
        this.element = modifierLocalProvider;
    }
}
