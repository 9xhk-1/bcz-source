package androidx.compose.ui.input.pointer;

import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i11) {
        this.packedValue = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m3793boximpl(int i11) {
        return new PointerKeyboardModifiers(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3795equalsimpl(int i11, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i11 == ((PointerKeyboardModifiers) obj).m3799unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3796equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3797hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3798toStringimpl(int i11) {
        return "PointerKeyboardModifiers(packedValue=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m3795equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3797hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3798toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3799unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3794constructorimpl(int i11) {
        return i11;
    }
}
