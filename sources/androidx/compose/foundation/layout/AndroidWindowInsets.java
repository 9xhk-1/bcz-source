package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.u0;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,729:1\n85#2:730\n113#2,2:731\n85#2:733\n113#2,2:734\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n56#1:730\n56#1:731,2\n62#1:733\n62#1:734,2\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidWindowInsets implements WindowInsets {
    public static final int $stable = 0;

    @m80.k
    private final MutableState insets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Insets.NONE, null, 2, null);

    @m80.k
    private final MutableState isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    @m80.k
    private final String name;
    private final int type;

    public AndroidWindowInsets(int i11, @m80.k String str) {
        this.type = i11;
        this.name = str;
    }

    private final void setVisible(boolean z11) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z11));
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidWindowInsets) && this.type == ((AndroidWindowInsets) obj).type;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@m80.k Density density) {
        return getInsets$foundation_layout_release().bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final Insets getInsets$foundation_layout_release() {
        return (Insets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return getInsets$foundation_layout_release().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return getInsets$foundation_layout_release().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@m80.k Density density) {
        return getInsets$foundation_layout_release().top;
    }

    public final int getType$foundation_layout_release() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout_release(@m80.k Insets insets) {
        this.insets$delegate.setValue(insets);
    }

    @m80.k
    public String toString() {
        return this.name + '(' + getInsets$foundation_layout_release().left + j2.O + getInsets$foundation_layout_release().top + j2.O + getInsets$foundation_layout_release().right + j2.O + getInsets$foundation_layout_release().bottom + ')';
    }

    public final void update$foundation_layout_release(@m80.k WindowInsetsCompat windowInsetsCompat, int i11) {
        if (i11 == 0 || (i11 & this.type) != 0) {
            setInsets$foundation_layout_release(windowInsetsCompat.getInsets(this.type));
            setVisible(windowInsetsCompat.isVisible(this.type));
        }
    }
}
