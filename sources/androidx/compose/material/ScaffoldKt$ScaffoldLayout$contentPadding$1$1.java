package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayout$contentPadding$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,582:1\n149#2:583\n85#3:584\n113#3,2:585\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayout$contentPadding$1$1\n*L\n386#1:583\n386#1:584\n386#1:585,2\n*E\n"})
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$contentPadding$1$1 implements PaddingValues {
    private final MutableState paddingHolder$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)), null, 2, null);

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo675calculateBottomPaddingD9Ej5fM() {
        return getPaddingHolder().mo675calculateBottomPaddingD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo676calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return getPaddingHolder().mo676calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo677calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return getPaddingHolder().mo677calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo678calculateTopPaddingD9Ej5fM() {
        return getPaddingHolder().mo678calculateTopPaddingD9Ej5fM();
    }

    public final PaddingValues getPaddingHolder() {
        return (PaddingValues) this.paddingHolder$delegate.getValue();
    }

    public final void setPaddingHolder(PaddingValues paddingValues) {
        this.paddingHolder$delegate.setValue(paddingValues);
    }
}
