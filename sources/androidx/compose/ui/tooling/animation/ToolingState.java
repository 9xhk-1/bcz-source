package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
@u0({"SMAP\nToolingState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolingState.android.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n85#2:41\n113#2,2:42\n*S KotlinDebug\n*F\n+ 1 ToolingState.android.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n*L\n38#1:41\n38#1:42,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ToolingState<T> implements State<T> {
    public static final int $stable = 0;

    @k
    private final MutableState value$delegate;

    public ToolingState(T t11) {
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value$delegate.getValue();
    }

    public void setValue(T t11) {
        this.value$delegate.setValue(t11);
    }
}
