package androidx.compose.foundation.text;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class MenuItemsAvailability {
    private static final int AUTO_FILL = 16;
    private static final int COPY = 1;
    private static final int CUT = 4;
    private static final int NONE = 0;
    private static final int PASTE = 2;
    private static final int SELECT_ALL = 8;
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int None = m1109constructorimpl(0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getNone-JKCFgKw, reason: not valid java name */
        public final int m1121getNoneJKCFgKw() {
            return MenuItemsAvailability.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ MenuItemsAvailability(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuItemsAvailability m1108boximpl(int i11) {
        return new MenuItemsAvailability(i11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1109constructorimpl(int i11) {
        return i11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1111equalsimpl(int i11, Object obj) {
        return (obj instanceof MenuItemsAvailability) && i11 == ((MenuItemsAvailability) obj).m1120unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1112equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: getCanAutofill-impl, reason: not valid java name */
    public static final boolean m1113getCanAutofillimpl(int i11) {
        return (i11 & 16) == 16;
    }

    /* renamed from: getCanCopy-impl, reason: not valid java name */
    public static final boolean m1114getCanCopyimpl(int i11) {
        return (i11 & 1) == 1;
    }

    /* renamed from: getCanCut-impl, reason: not valid java name */
    public static final boolean m1115getCanCutimpl(int i11) {
        return (i11 & 4) == 4;
    }

    /* renamed from: getCanPaste-impl, reason: not valid java name */
    public static final boolean m1116getCanPasteimpl(int i11) {
        return (i11 & 2) == 2;
    }

    /* renamed from: getCanSelectAll-impl, reason: not valid java name */
    public static final boolean m1117getCanSelectAllimpl(int i11) {
        return (i11 & 8) == 8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1118hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1119toStringimpl(int i11) {
        return "MenuItemsAvailability(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m1111equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1118hashCodeimpl(this.value);
    }

    public String toString() {
        return m1119toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1120unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1110constructorimpl(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return m1109constructorimpl((z11 ? 1 : 0) | (z12 ? 2 : 0) | (z13 ? 4 : 0) | (z14 ? 8 : 0) | (z15 ? 16 : 0));
    }
}
