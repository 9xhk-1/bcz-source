package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface ViewRootForInspector {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @m80.l
        @Deprecated
        public static AbstractComposeView getSubCompositionView(@m80.k ViewRootForInspector viewRootForInspector) {
            return ViewRootForInspector.super.getSubCompositionView();
        }

        @m80.l
        @Deprecated
        public static View getViewRoot(@m80.k ViewRootForInspector viewRootForInspector) {
            return ViewRootForInspector.super.getViewRoot();
        }
    }

    @m80.l
    default AbstractComposeView getSubCompositionView() {
        return null;
    }

    @m80.l
    default View getViewRoot() {
        return null;
    }
}
