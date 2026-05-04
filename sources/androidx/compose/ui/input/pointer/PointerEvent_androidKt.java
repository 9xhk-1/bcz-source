package androidx.compose.ui.input.pointer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m3794constructorimpl(0);
    }

    /* renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3692getAreAnyPressedaHzCxE(int i11) {
        return i11 != 0;
    }

    /* renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m3693indexOfFirstPressedaHzCxE(int i11) {
        if (i11 == 0) {
            return -1;
        }
        int i12 = 0;
        for (int i13 = (i11 & (-97)) | ((i11 & 96) >>> 5); (i13 & 1) == 0; i13 >>>= 1) {
            i12++;
        }
        return i12;
    }

    /* renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m3694indexOfLastPressedaHzCxE(int i11) {
        int i12 = -1;
        for (int i13 = (i11 & (-97)) | ((i11 & 96) >>> 5); i13 != 0; i13 >>>= 1) {
            i12++;
        }
        return i12;
    }

    /* renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3695isAltGraphPressed5xRPYO0(int i11) {
        return false;
    }

    /* renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3696isAltPressed5xRPYO0(int i11) {
        return (i11 & 2) != 0;
    }

    /* renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3697isBackPressedaHzCxE(int i11) {
        return (i11 & 8) != 0;
    }

    /* renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m3698isCapsLockOn5xRPYO0(int i11) {
        return (i11 & 1048576) != 0;
    }

    /* renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3699isCtrlPressed5xRPYO0(int i11) {
        return (i11 & 4096) != 0;
    }

    /* renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3700isForwardPressedaHzCxE(int i11) {
        return (i11 & 16) != 0;
    }

    /* renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3701isFunctionPressed5xRPYO0(int i11) {
        return (i11 & 8) != 0;
    }

    /* renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3702isMetaPressed5xRPYO0(int i11) {
        return (i11 & 65536) != 0;
    }

    /* renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m3703isNumLockOn5xRPYO0(int i11) {
        return (i11 & 2097152) != 0;
    }

    /* renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m3704isPressedbNIWhpI(int i11, int i12) {
        return i12 != 0 ? i12 != 1 ? (i12 == 2 || i12 == 3 || i12 == 4) ? (i11 & (1 << i12)) != 0 : (i11 & (1 << (i12 + 2))) != 0 : m3707isSecondaryPressedaHzCxE(i11) : m3705isPrimaryPressedaHzCxE(i11);
    }

    /* renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3705isPrimaryPressedaHzCxE(int i11) {
        return (i11 & 33) != 0;
    }

    /* renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m3706isScrollLockOn5xRPYO0(int i11) {
        return (i11 & 4194304) != 0;
    }

    /* renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3707isSecondaryPressedaHzCxE(int i11) {
        return (i11 & 66) != 0;
    }

    /* renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3708isShiftPressed5xRPYO0(int i11) {
        return (i11 & 1) != 0;
    }

    /* renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3709isSymPressed5xRPYO0(int i11) {
        return (i11 & 4) != 0;
    }

    /* renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3710isTertiaryPressedaHzCxE(int i11) {
        return (i11 & 4) != 0;
    }
}
