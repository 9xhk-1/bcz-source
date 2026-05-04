package androidx.compose.foundation;

import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes.dex */
public final class AndroidExternalSurfaceZOrder {
    private final int zOrder;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Behind = m220constructorimpl(0);
    private static final int MediaOverlay = m220constructorimpl(1);
    private static final int OnTop = m220constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getBehind-B_4ceCc, reason: not valid java name */
        public final int m226getBehindB_4ceCc() {
            return AndroidExternalSurfaceZOrder.Behind;
        }

        /* renamed from: getMediaOverlay-B_4ceCc, reason: not valid java name */
        public final int m227getMediaOverlayB_4ceCc() {
            return AndroidExternalSurfaceZOrder.MediaOverlay;
        }

        /* renamed from: getOnTop-B_4ceCc, reason: not valid java name */
        public final int m228getOnTopB_4ceCc() {
            return AndroidExternalSurfaceZOrder.OnTop;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AndroidExternalSurfaceZOrder(int i11) {
        this.zOrder = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidExternalSurfaceZOrder m219boximpl(int i11) {
        return new AndroidExternalSurfaceZOrder(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m221equalsimpl(int i11, Object obj) {
        return (obj instanceof AndroidExternalSurfaceZOrder) && i11 == ((AndroidExternalSurfaceZOrder) obj).m225unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m222equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m223hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m224toStringimpl(int i11) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m221equalsimpl(this.zOrder, obj);
    }

    public final int getZOrder() {
        return this.zOrder;
    }

    public int hashCode() {
        return m223hashCodeimpl(this.zOrder);
    }

    public String toString() {
        return m224toStringimpl(this.zOrder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m225unboximpl() {
        return this.zOrder;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m220constructorimpl(int i11) {
        return i11;
    }
}
