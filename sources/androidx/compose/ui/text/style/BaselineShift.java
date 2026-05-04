package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@h
/* loaded from: classes2.dex */
public final class BaselineShift {
    private final float multiplier;

    @k
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m4850constructorimpl(0.5f);
    private static final float Subscript = m4850constructorimpl(-0.5f);
    private static final float None = m4850constructorimpl(0.0f);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m4859getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m4860getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m4861getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4856getNoney9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4857getSubscripty9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4858getSuperscripty9eOQZs$annotations() {
        }
    }

    private /* synthetic */ BaselineShift(float f11) {
        this.multiplier = f11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m4849boximpl(float f11) {
        return new BaselineShift(f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4851equalsimpl(float f11, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f11, ((BaselineShift) obj).m4855unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4852equalsimpl0(float f11, float f12) {
        return Float.compare(f11, f12) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4853hashCodeimpl(float f11) {
        return Float.hashCode(f11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4854toStringimpl(float f11) {
        return "BaselineShift(multiplier=" + f11 + ')';
    }

    public boolean equals(Object obj) {
        return m4851equalsimpl(this.multiplier, obj);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return m4853hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m4854toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m4855unboximpl() {
        return this.multiplier;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m4850constructorimpl(float f11) {
        return f11;
    }
}
