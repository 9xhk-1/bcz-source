package androidx.compose.ui.input.pointer;

import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class PointerButtons {
    private final int packedValue;

    private /* synthetic */ PointerButtons(int i11) {
        this.packedValue = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerButtons m3664boximpl(int i11) {
        return new PointerButtons(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3666equalsimpl(int i11, Object obj) {
        return (obj instanceof PointerButtons) && i11 == ((PointerButtons) obj).m3670unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3667equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3668hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3669toStringimpl(int i11) {
        return "PointerButtons(packedValue=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m3666equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3668hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3669toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3670unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3665constructorimpl(int i11) {
        return i11;
    }
}
