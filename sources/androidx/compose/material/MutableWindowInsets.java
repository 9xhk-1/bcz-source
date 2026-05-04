package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nMutableWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,51:1\n85#2:52\n113#2,2:53\n*S KotlinDebug\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material/MutableWindowInsets\n*L\n39#1:52\n39#1:53,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable = 0;

    @k
    private final MutableState insets$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableWindowInsets() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@k Density density) {
        return getInsets().getBottom(density);
    }

    @k
    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@k Density density, @k LayoutDirection layoutDirection) {
        return getInsets().getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@k Density density, @k LayoutDirection layoutDirection) {
        return getInsets().getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@k Density density) {
        return getInsets().getTop(density);
    }

    public final void setInsets(@k WindowInsets windowInsets) {
        this.insets$delegate.setValue(windowInsets);
    }

    public MutableWindowInsets(@k WindowInsets windowInsets) {
        this.insets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
    }

    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i11, v vVar) {
        this((i11 & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }
}
