package androidx.compose.animation.core;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class StartOffsetType {

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m177constructorimpl(-1);
    private static final int FastForward = m177constructorimpl(1);
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m183getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m184getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StartOffsetType(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m176boximpl(int i11) {
        return new StartOffsetType(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m178equalsimpl(int i11, Object obj) {
        return (obj instanceof StartOffsetType) && i11 == ((StartOffsetType) obj).m182unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m179equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m180hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m181toStringimpl(int i11) {
        return "StartOffsetType(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m178equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m180hashCodeimpl(this.value);
    }

    public String toString() {
        return m181toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m182unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m177constructorimpl(int i11) {
        return i11;
    }
}
