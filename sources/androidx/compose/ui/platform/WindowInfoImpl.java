package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@kotlin.jvm.internal.u0({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,90:1\n85#2:91\n113#2,2:92\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoImpl\n*L\n70#1:91\n70#1:92,2\n*E\n"})
/* loaded from: classes2.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final int $stable = 0;

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final MutableState<PointerKeyboardModifiers> GlobalKeyboardModifiers = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m3793boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), null, 2, null);

    @m80.k
    private final MutableState<IntSize> _containerSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.Companion.m5291getZeroYbymL2g()), null, 2, null);

    @m80.k
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui_release() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g */
    public long mo4273getContainerSizeYbymL2g() {
        return this._containerSize.getValue().m5290unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo4274getKeyboardModifiersk7X9c1A() {
        return GlobalKeyboardModifiers.getValue().m3799unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setContainerSize-ozmzZPI, reason: not valid java name */
    public void m4305setContainerSizeozmzZPI(long j11) {
        this._containerSize.setValue(IntSize.m5278boximpl(j11));
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m4306setKeyboardModifiers5xRPYO0(int i11) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m3793boximpl(i11));
    }

    public void setWindowFocused(boolean z11) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z11));
    }
}
