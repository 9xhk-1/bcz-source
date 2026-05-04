package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,67:1\n85#2:68\n113#2,2:69\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n63#1:68\n63#1:69,2\n*E\n"})
/* loaded from: classes.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 0;

    @k
    private final MutableState inputMode$delegate;

    @k
    private final l<InputMode, Boolean> onRequestInputModeChange;

    public /* synthetic */ InputModeManagerImpl(int i11, l lVar, v vVar) {
        this(i11, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo3272getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m3269unboximpl();
    }

    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo3273requestInputModeiuPiT84(int i11) {
        return this.onRequestInputModeChange.invoke(InputMode.m3263boximpl(i11)).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m3274setInputModeiuPiT84(int i11) {
        this.inputMode$delegate.setValue(InputMode.m3263boximpl(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InputModeManagerImpl(int i11, l<? super InputMode, Boolean> lVar) {
        this.onRequestInputModeChange = lVar;
        this.inputMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m3263boximpl(i11), null, 2, null);
    }
}
