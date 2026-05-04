package androidx.compose.ui.text;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class EmojiSupportMatch {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Default = m4397constructorimpl(0);
    private static final int None = m4397constructorimpl(1);
    private static final int All = m4397constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAll-_3YsG6Y, reason: not valid java name */
        public final int m4403getAll_3YsG6Y() {
            return EmojiSupportMatch.All;
        }

        /* renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m4404getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m4405getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ EmojiSupportMatch(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m4396boximpl(int i11) {
        return new EmojiSupportMatch(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4398equalsimpl(int i11, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i11 == ((EmojiSupportMatch) obj).m4402unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4399equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4400hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4401toStringimpl(int i11) {
        if (i11 == Default) {
            return "EmojiSupportMatch.Default";
        }
        if (i11 == None) {
            return "EmojiSupportMatch.None";
        }
        if (i11 == All) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m4398equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4400hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4401toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4402unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4397constructorimpl(int i11) {
        return i11;
    }
}
