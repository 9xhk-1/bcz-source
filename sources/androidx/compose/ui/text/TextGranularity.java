package androidx.compose.ui.text;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class TextGranularity {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Character = m4515constructorimpl(0);
    private static final int Word = m4515constructorimpl(1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getCharacter-DRrd7Zo, reason: not valid java name */
        public final int m4521getCharacterDRrd7Zo() {
            return TextGranularity.Character;
        }

        /* renamed from: getWord-DRrd7Zo, reason: not valid java name */
        public final int m4522getWordDRrd7Zo() {
            return TextGranularity.Word;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextGranularity(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextGranularity m4514boximpl(int i11) {
        return new TextGranularity(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4516equalsimpl(int i11, Object obj) {
        return (obj instanceof TextGranularity) && i11 == ((TextGranularity) obj).m4520unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4517equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4518hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4519toStringimpl(int i11) {
        return "TextGranularity(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m4516equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4518hashCodeimpl(this.value);
    }

    public String toString() {
        return m4519toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4520unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4515constructorimpl(int i11) {
        return i11;
    }
}
