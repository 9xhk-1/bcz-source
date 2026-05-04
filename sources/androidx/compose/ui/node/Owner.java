package androidx.compose.ui.node;

import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.collection.IntObjectMap;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import j00.c;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface Owner extends PositionCalculator {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z11) {
            enableExtraAssertions = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    static /* synthetic */ OwnedLayer createLayer$default(Owner owner, p pVar, x00.a aVar, GraphicsLayer graphicsLayer, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i11 & 4) != 0) {
            graphicsLayer = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return owner.createLayer(pVar, aVar, graphicsLayer, z11);
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z11);
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        owner.measureAndLayout(z11);
    }

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        if ((i11 & 8) != 0) {
            z13 = true;
        }
        owner.onRequestMeasure(layoutNode, z11, z12, z13);
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        owner.onRequestRelayout(layoutNode, z11, z12);
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo4176calculateLocalPositionMKHz9U(long j11);

    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo4177calculatePositionInWindowMKHz9U(long j11);

    @k
    OwnedLayer createLayer(@k p<? super Canvas, ? super GraphicsLayer, g2> pVar, @k x00.a<g2> aVar, @l GraphicsLayer graphicsLayer, boolean z11);

    void forceMeasureTheSubtree(@k LayoutNode layoutNode, boolean z11);

    @k
    AccessibilityManager getAccessibilityManager();

    @l
    Autofill getAutofill();

    @l
    AutofillManager getAutofillManager();

    @k
    AutofillTree getAutofillTree();

    @k
    Clipboard getClipboard();

    @k
    ClipboardManager getClipboardManager();

    @k
    d getCoroutineContext();

    @k
    Density getDensity();

    @k
    DragAndDropManager getDragAndDropManager();

    @l
    /* renamed from: getFocusDirection-P8AzH3I, reason: not valid java name */
    FocusDirection mo4178getFocusDirectionP8AzH3I(@k KeyEvent keyEvent);

    @k
    FocusOwner getFocusOwner();

    @k
    FontFamily.Resolver getFontFamilyResolver();

    @k
    Font.ResourceLoader getFontLoader();

    @k
    GraphicsContext getGraphicsContext();

    @k
    HapticFeedback getHapticFeedBack();

    @k
    InputModeManager getInputModeManager();

    @k
    LayoutDirection getLayoutDirection();

    @k
    IntObjectMap<LayoutNode> getLayoutNodes();

    long getMeasureIteration();

    @k
    ModifierLocalManager getModifierLocalManager();

    @k
    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @k
    PointerIconService getPointerIconService();

    @k
    RectManager getRectManager();

    @k
    LayoutNode getRoot();

    @k
    RootForTest getRootForTest();

    @k
    SemanticsOwner getSemanticsOwner();

    @k
    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    @k
    OwnerSnapshotObserver getSnapshotObserver();

    @k
    SoftwareKeyboardController getSoftwareKeyboardController();

    @k
    TextInputService getTextInputService();

    @k
    TextToolbar getTextToolbar();

    @k
    ViewConfiguration getViewConfiguration();

    @k
    WindowInfo getWindowInfo();

    void measureAndLayout(boolean z11);

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo4179measureAndLayout0kLqBqw(@k LayoutNode layoutNode, long j11);

    void onDetach(@k LayoutNode layoutNode);

    void onEndApplyChanges();

    @InternalComposeUiApi
    void onInteropViewLayoutChange(@k View view);

    void onLayoutChange(@k LayoutNode layoutNode);

    void onLayoutNodeDeactivated(@k LayoutNode layoutNode);

    void onPostAttach(@k LayoutNode layoutNode);

    void onPreAttach(@k LayoutNode layoutNode);

    void onRequestMeasure(@k LayoutNode layoutNode, boolean z11, boolean z12, boolean z13);

    void onRequestRelayout(@k LayoutNode layoutNode, boolean z11, boolean z12);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(@k x00.a<g2> aVar);

    void registerOnLayoutCompletedListener(@k OnLayoutCompletedListener onLayoutCompletedListener);

    void requestAutofill(@k LayoutNode layoutNode);

    boolean requestFocus();

    void requestOnPositionedCallback(@k LayoutNode layoutNode);

    @InternalCoreApi
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void setShowLayoutBounds(boolean z11);

    @l
    Object textInputSession(@k p<? super PlatformTextInputSessionScope, ? super c<?>, ? extends Object> pVar, @k c<?> cVar);

    @n(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @w0(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void getFontLoader$annotations() {
    }

    default void decrementSensitiveComponentCount() {
    }

    default void incrementSensitiveComponentCount() {
    }

    default void onPostLayoutNodeReused(@k LayoutNode layoutNode, int i11) {
    }

    default void onPreLayoutNodeReused(@k LayoutNode layoutNode, int i11) {
    }
}
