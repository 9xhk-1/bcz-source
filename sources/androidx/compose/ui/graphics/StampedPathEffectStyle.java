package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class StampedPathEffectStyle {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Translate = m2846constructorimpl(0);
    private static final int Rotate = m2846constructorimpl(1);
    private static final int Morph = m2846constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getMorph-Ypspkwk, reason: not valid java name */
        public final int m2852getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* renamed from: getRotate-Ypspkwk, reason: not valid java name */
        public final int m2853getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* renamed from: getTranslate-Ypspkwk, reason: not valid java name */
        public final int m2854getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StampedPathEffectStyle(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m2845boximpl(int i11) {
        return new StampedPathEffectStyle(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2847equalsimpl(int i11, Object obj) {
        return (obj instanceof StampedPathEffectStyle) && i11 == ((StampedPathEffectStyle) obj).m2851unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2848equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2849hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2850toStringimpl(int i11) {
        return m2848equalsimpl0(i11, Translate) ? "Translate" : m2848equalsimpl0(i11, Rotate) ? "Rotate" : m2848equalsimpl0(i11, Morph) ? "Morph" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2847equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2849hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2850toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2851unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2846constructorimpl(int i11) {
        return i11;
    }
}
