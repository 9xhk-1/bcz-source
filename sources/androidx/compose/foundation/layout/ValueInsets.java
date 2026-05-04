package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,710:1\n85#2:711\n113#2,2:712\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n350#1:711\n350#1:712,2\n*E\n"})
/* loaded from: classes.dex */
public final class ValueInsets implements WindowInsets {
    public static final int $stable = 0;

    @m80.k
    private final String name;

    @m80.k
    private final MutableState value$delegate;

    public ValueInsets(@m80.k InsetsValues insetsValues, @m80.k String str) {
        this.name = str;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insetsValues, null, 2, null);
    }

    public boolean equals(@l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueInsets) {
            return g0.g(getValue$foundation_layout_release(), ((ValueInsets) obj).getValue$foundation_layout_release());
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@m80.k Density density) {
        return getValue$foundation_layout_release().getBottom();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return getValue$foundation_layout_release().getLeft();
    }

    @m80.k
    public final String getName() {
        return this.name;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return getValue$foundation_layout_release().getRight();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@m80.k Density density) {
        return getValue$foundation_layout_release().getTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final InsetsValues getValue$foundation_layout_release() {
        return (InsetsValues) this.value$delegate.getValue();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setValue$foundation_layout_release(@m80.k InsetsValues insetsValues) {
        this.value$delegate.setValue(insetsValues);
    }

    @m80.k
    public String toString() {
        return this.name + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + ')';
    }
}
