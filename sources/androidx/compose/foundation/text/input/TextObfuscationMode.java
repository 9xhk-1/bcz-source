package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class TextObfuscationMode {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Visible = m1205constructorimpl(0);
    private static final int RevealLastTyped = m1205constructorimpl(1);
    private static final int Hidden = m1205constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getHidden-vTwcZD0, reason: not valid java name */
        public final int m1211getHiddenvTwcZD0() {
            return TextObfuscationMode.Hidden;
        }

        /* renamed from: getRevealLastTyped-vTwcZD0, reason: not valid java name */
        public final int m1212getRevealLastTypedvTwcZD0() {
            return TextObfuscationMode.RevealLastTyped;
        }

        /* renamed from: getVisible-vTwcZD0, reason: not valid java name */
        public final int m1213getVisiblevTwcZD0() {
            return TextObfuscationMode.Visible;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextObfuscationMode(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextObfuscationMode m1204boximpl(int i11) {
        return new TextObfuscationMode(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1206equalsimpl(int i11, Object obj) {
        return (obj instanceof TextObfuscationMode) && i11 == ((TextObfuscationMode) obj).m1210unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1207equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1208hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1209toStringimpl(int i11) {
        return "TextObfuscationMode(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m1206equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1208hashCodeimpl(this.value);
    }

    public String toString() {
        return m1209toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1210unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1205constructorimpl(int i11) {
        return i11;
    }
}
