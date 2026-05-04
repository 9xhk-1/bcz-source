package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@h
/* loaded from: classes.dex */
public final class Strings {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int NavigationMenu = m1769constructorimpl(0);
    private static final int CloseDrawer = m1769constructorimpl(1);
    private static final int CloseSheet = m1769constructorimpl(2);
    private static final int DefaultErrorMessage = m1769constructorimpl(3);
    private static final int ExposedDropdownMenu = m1769constructorimpl(4);
    private static final int SliderRangeStart = m1769constructorimpl(5);
    private static final int SliderRangeEnd = m1769constructorimpl(6);
    private static final int SnackbarPaneTitle = m1769constructorimpl(7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getCloseDrawer-UdPEhr4, reason: not valid java name */
        public final int m1775getCloseDrawerUdPEhr4() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-UdPEhr4, reason: not valid java name */
        public final int m1776getCloseSheetUdPEhr4() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-UdPEhr4, reason: not valid java name */
        public final int m1777getDefaultErrorMessageUdPEhr4() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getExposedDropdownMenu-UdPEhr4, reason: not valid java name */
        public final int m1778getExposedDropdownMenuUdPEhr4() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getNavigationMenu-UdPEhr4, reason: not valid java name */
        public final int m1779getNavigationMenuUdPEhr4() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getSliderRangeEnd-UdPEhr4, reason: not valid java name */
        public final int m1780getSliderRangeEndUdPEhr4() {
            return Strings.SliderRangeEnd;
        }

        /* renamed from: getSliderRangeStart-UdPEhr4, reason: not valid java name */
        public final int m1781getSliderRangeStartUdPEhr4() {
            return Strings.SliderRangeStart;
        }

        /* renamed from: getSnackbarPaneTitle-UdPEhr4, reason: not valid java name */
        public final int m1782getSnackbarPaneTitleUdPEhr4() {
            return Strings.SnackbarPaneTitle;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Strings(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Strings m1768boximpl(int i11) {
        return new Strings(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1770equalsimpl(int i11, Object obj) {
        return (obj instanceof Strings) && i11 == ((Strings) obj).m1774unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1771equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1772hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1773toStringimpl(int i11) {
        return "Strings(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m1770equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1772hashCodeimpl(this.value);
    }

    public String toString() {
        return m1773toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1774unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1769constructorimpl(int i11) {
        return i11;
    }
}
