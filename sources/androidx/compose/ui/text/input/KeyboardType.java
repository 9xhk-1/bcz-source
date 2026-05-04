package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class KeyboardType {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m4776constructorimpl(0);
    private static final int Text = m4776constructorimpl(1);
    private static final int Ascii = m4776constructorimpl(2);
    private static final int Number = m4776constructorimpl(3);
    private static final int Phone = m4776constructorimpl(4);
    private static final int Uri = m4776constructorimpl(5);
    private static final int Email = m4776constructorimpl(6);
    private static final int Password = m4776constructorimpl(7);
    private static final int NumberPassword = m4776constructorimpl(8);
    private static final int Decimal = m4776constructorimpl(9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m4792getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m4793getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m4794getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m4795getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m4796getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m4797getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m4798getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m4799getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUnspecified-PjHm6EE, reason: not valid java name */
        public final int m4800getUnspecifiedPjHm6EE() {
            return KeyboardType.Unspecified;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m4801getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4782getAsciiPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4783getDecimalPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4784getEmailPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4785getNumberPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4786getNumberPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4787getPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4788getPhonePjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4789getTextPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4790getUnspecifiedPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4791getUriPjHm6EE$annotations() {
        }
    }

    private /* synthetic */ KeyboardType(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m4775boximpl(int i11) {
        return new KeyboardType(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4777equalsimpl(int i11, Object obj) {
        return (obj instanceof KeyboardType) && i11 == ((KeyboardType) obj).m4781unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4778equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4779hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4780toStringimpl(int i11) {
        return m4778equalsimpl0(i11, Unspecified) ? "Unspecified" : m4778equalsimpl0(i11, Text) ? "Text" : m4778equalsimpl0(i11, Ascii) ? "Ascii" : m4778equalsimpl0(i11, Number) ? "Number" : m4778equalsimpl0(i11, Phone) ? "Phone" : m4778equalsimpl0(i11, Uri) ? "Uri" : m4778equalsimpl0(i11, Email) ? "Email" : m4778equalsimpl0(i11, Password) ? "Password" : m4778equalsimpl0(i11, NumberPassword) ? "NumberPassword" : m4778equalsimpl0(i11, Decimal) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4777equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4779hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4780toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4781unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4776constructorimpl(int i11) {
        return i11;
    }
}
