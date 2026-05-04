package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@h
/* loaded from: classes2.dex */
public final class Role {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Button = m4317constructorimpl(0);
    private static final int Checkbox = m4317constructorimpl(1);
    private static final int Switch = m4317constructorimpl(2);
    private static final int RadioButton = m4317constructorimpl(3);
    private static final int Tab = m4317constructorimpl(4);
    private static final int Image = m4317constructorimpl(5);
    private static final int DropdownList = m4317constructorimpl(6);
    private static final int ValuePicker = m4317constructorimpl(7);
    private static final int Carousel = m4317constructorimpl(8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m4323getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCarousel-o7Vup1c, reason: not valid java name */
        public final int m4324getCarouselo7Vup1c() {
            return Role.Carousel;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m4325getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m4326getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m4327getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m4328getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m4329getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m4330getTabo7Vup1c() {
            return Role.Tab;
        }

        /* renamed from: getValuePicker-o7Vup1c, reason: not valid java name */
        public final int m4331getValuePickero7Vup1c() {
            return Role.ValuePicker;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Role(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m4316boximpl(int i11) {
        return new Role(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4318equalsimpl(int i11, Object obj) {
        return (obj instanceof Role) && i11 == ((Role) obj).m4322unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4319equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4320hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4321toStringimpl(int i11) {
        return m4319equalsimpl0(i11, Button) ? "Button" : m4319equalsimpl0(i11, Checkbox) ? "Checkbox" : m4319equalsimpl0(i11, Switch) ? "Switch" : m4319equalsimpl0(i11, RadioButton) ? "RadioButton" : m4319equalsimpl0(i11, Tab) ? "Tab" : m4319equalsimpl0(i11, Image) ? "Image" : m4319equalsimpl0(i11, DropdownList) ? "DropdownList" : m4319equalsimpl0(i11, ValuePicker) ? "Picker" : m4319equalsimpl0(i11, Carousel) ? "Carousel" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m4318equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4320hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4321toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4322unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4317constructorimpl(int i11) {
        return i11;
    }
}
