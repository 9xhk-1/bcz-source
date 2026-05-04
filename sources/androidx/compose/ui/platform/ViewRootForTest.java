package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.node.RootForTest;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@VisibleForTesting
/* loaded from: classes2.dex */
public interface ViewRootForTest extends RootForTest {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean getHasPendingMeasureOrLayout();

    @m80.k
    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @m80.l
        private static x00.l<? super ViewRootForTest, g2> onViewCreatedCallback;

        private Companion() {
        }

        @m80.l
        public final x00.l<ViewRootForTest, g2> getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(@m80.l x00.l<? super ViewRootForTest, g2> lVar) {
            onViewCreatedCallback = lVar;
        }

        @VisibleForTesting
        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }
    }
}
