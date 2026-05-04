package androidx.compose.ui.platform;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@kotlin.jvm.internal.u0({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfo\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,90:1\n30#2:91\n80#3:92\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfo\n*L\n55#1:91\n55#1:92\n*E\n"})
/* loaded from: classes2.dex */
public interface WindowInfo {
    /* renamed from: getContainerSize-YbymL2g */
    default long mo4273getContainerSizeYbymL2g() {
        long j11 = Integer.MIN_VALUE;
        return IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A */
    default int mo4274getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue().m3799unboximpl();
    }

    boolean isWindowFocused();

    /* renamed from: getKeyboardModifiers-k7X9c1A$annotations, reason: not valid java name */
    static /* synthetic */ void m4304getKeyboardModifiersk7X9c1A$annotations() {
    }
}
