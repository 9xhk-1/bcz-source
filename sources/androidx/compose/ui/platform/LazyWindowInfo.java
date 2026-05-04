package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@kotlin.jvm.internal.u0({"SMAP\nAndroidWindowInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/LazyWindowInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n85#2:393\n113#2,2:394\n1#3:396\n*S KotlinDebug\n*F\n+ 1 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/LazyWindowInfo\n*L\n49#1:393\n49#1:394,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LazyWindowInfo implements WindowInfo {
    public static final int $stable = 0;

    @m80.l
    private MutableState<IntSize> _containerSize;

    @m80.k
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @m80.l
    private x00.a<IntSize> onInitializeContainerSize;

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public long mo4273getContainerSizeYbymL2g() {
        if (this._containerSize == null) {
            x00.a<IntSize> aVar = this.onInitializeContainerSize;
            this._containerSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(aVar != null ? aVar.invoke().m5290unboximpl() : IntSize.Companion.m5291getZeroYbymL2g()), null, 2, null);
            this.onInitializeContainerSize = null;
        }
        MutableState<IntSize> mutableState = this._containerSize;
        kotlin.jvm.internal.g0.m(mutableState);
        return mutableState.getValue().m5290unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public int mo4274getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue().m3799unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m4275setKeyboardModifiers5xRPYO0(int i11) {
        WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().setValue(PointerKeyboardModifiers.m3793boximpl(i11));
    }

    public final void setOnInitializeContainerSize(@m80.l x00.a<IntSize> aVar) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = aVar;
        }
    }

    public void setWindowFocused(boolean z11) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void updateContainerSizeIfObserved(@m80.k x00.a<IntSize> aVar) {
        MutableState mutableState = this._containerSize;
        if (mutableState != null) {
            mutableState.setValue(aVar.invoke());
        }
    }
}
