package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,235:1\n85#2:236\n113#2,2:237\n65#3,5:239\n65#3,5:244\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n44#1:236\n44#1:237,2\n51#1:239,5\n57#1:244,5\n*E\n"})
/* loaded from: classes.dex */
public final class SingleLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;

    @k
    private final ModifierLocal<?> key;

    @k
    private final MutableState value$delegate;

    public SingleLocalMap(@k ModifierLocal<?> modifierLocal) {
        super(null);
        this.key = modifierLocal;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final Object getValue() {
        return this.value$delegate.getValue();
    }

    private final void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@k ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.key;
    }

    public final void forceValue$ui_release(@l Object obj) {
        setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    @l
    public <T> T get$ui_release(@k ModifierLocal<T> modifierLocal) {
        if (!(modifierLocal == this.key)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        T t11 = (T) getValue();
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo3963set$ui_release(@k ModifierLocal<T> modifierLocal, T t11) {
        if (!(modifierLocal == this.key)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        setValue(t11);
    }
}
