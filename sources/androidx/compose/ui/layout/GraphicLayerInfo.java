package androidx.compose.ui.layout;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface GraphicLayerInfo {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static long getOwnerViewId(@k GraphicLayerInfo graphicLayerInfo) {
            return GraphicLayerInfo.super.getOwnerViewId();
        }
    }

    long getLayerId();

    default long getOwnerViewId() {
        return 0L;
    }
}
