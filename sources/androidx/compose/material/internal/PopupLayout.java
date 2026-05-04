package androidx.compose.material.internal;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
@u0({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,459:1\n149#2:460\n1#3:461\n85#4:462\n113#4,2:463\n85#4:465\n113#4,2:466\n85#4:468\n85#4:469\n113#4,2:470\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/PopupLayout\n*L\n237#1:460\n229#1:462\n229#1:463,2\n230#1:465\n230#1:466,2\n233#1:468\n288#1:469\n288#1:470,2\n*E\n"})
/* loaded from: classes.dex */
final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {

    @k
    private final State canCalculatePosition$delegate;

    @k
    private final View composeView;

    @k
    private final MutableState content$delegate;

    @k
    private final p<Offset, IntRect, Boolean> dismissOnOutsideClick;
    private final float maxSupportedElevation;

    @l
    private a<g2> onDismissRequest;

    @k
    private final WindowManager.LayoutParams params;

    @k
    private final MutableState parentBounds$delegate;

    @k
    private LayoutDirection parentLayoutDirection;

    @k
    private final MutableState popupContentSize$delegate;

    @k
    private PopupPositionProvider positionProvider;

    @k
    private final Rect previousWindowVisibleFrame;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @k
    private String testTag;

    @k
    private final Rect tmpWindowVisibleFrame;

    @k
    private final WindowManager windowManager;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PopupLayout(@l a<g2> aVar, @k String str, @k View view, @k Density density, @k PopupPositionProvider popupPositionProvider, @k UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = aVar;
        this.testTag = str;
        this.composeView = view;
        Object systemService = view.getContext().getSystemService("window");
        g0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.parentBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.popupContentSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition$delegate = SnapshotStateKt.derivedStateOf(new a<Boolean>() { // from class: androidx.compose.material.internal.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                return Boolean.valueOf((PopupLayout.this.getParentBounds() == null || PopupLayout.this.m1854getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float m5115constructorimpl = Dp.m5115constructorimpl(8);
        this.maxSupportedElevation = m5115constructorimpl;
        this.previousWindowVisibleFrame = new Rect();
        this.tmpWindowVisibleFrame = new Rect();
        this.dismissOnOutsideClick = new p<Offset, IntRect, Boolean>() { // from class: androidx.compose.material.internal.PopupLayout$dismissOnOutsideClick$1
            @Override // x00.p
            /* renamed from: invoke-KMgbckE, reason: not valid java name and merged with bridge method [inline-methods] */
            public final Boolean invoke(Offset offset, IntRect intRect) {
                boolean z11 = false;
                if (offset != null && (Offset.m2268getXimpl(offset.m2278unboximpl()) < intRect.getLeft() || Offset.m2268getXimpl(offset.m2278unboximpl()) > intRect.getRight() || Offset.m2269getYimpl(offset.m2278unboximpl()) < intRect.getTop() || Offset.m2269getYimpl(offset.m2278unboximpl()) > intRect.getBottom())) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        };
        setId(R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo377toPx0680j_4(m5115constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material.internal.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ExposedDropdownMenuPopup_androidKt.INSTANCE.m1850getLambda1$material_release(), null, 2, null);
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        return layoutParams;
    }

    private final p<Composer, Integer, g2> getContent() {
        return (p) this.content$delegate.getValue();
    }

    private final void setContent(p<? super Composer, ? super Integer, g2> pVar) {
        this.content$delegate.setValue(pVar);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i12);
    }

    private final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(@l Composer composer, int i11) {
        composer.startReplaceGroup(-864350873);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-864350873, i11, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:303)");
        }
        getContent().invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@k KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                a<g2> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final IntRect getParentBounds() {
        return (IntRect) this.parentBounds$delegate.getValue();
    }

    @k
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m1854getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize$delegate.getValue();
    }

    @k
    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @k
    public final String getTestTag() {
        return this.testTag;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (g0.g(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            return;
        }
        updatePosition();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r5.dismissOnOutsideClick.invoke((r6.getRawX() == 0.0f || r6.getRawY() == 0.0f) ? null : androidx.compose.ui.geometry.Offset.m2257boximpl(androidx.compose.ui.geometry.OffsetKt.Offset(r6.getRawX(), r6.getRawY())), r0).booleanValue() != false) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@m80.l android.view.MotionEvent r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L7
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L7:
            int r0 = r6.getAction()
            r1 = 0
            if (r0 != 0) goto L38
            float r0 = r6.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r6.getX()
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
            float r0 = r6.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r6.getY()
            int r2 = r5.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
        L38:
            int r0 = r6.getAction()
            r2 = 4
            if (r0 != r2) goto L7f
        L3f:
            androidx.compose.ui.unit.IntRect r0 = r5.getParentBounds()
            if (r0 == 0) goto L76
            x00.p<androidx.compose.ui.geometry.Offset, androidx.compose.ui.unit.IntRect, java.lang.Boolean> r2 = r5.dismissOnOutsideClick
            float r3 = r6.getRawX()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L50
            goto L58
        L50:
            float r3 = r6.getRawY()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
        L58:
            r1 = 0
            goto L6a
        L5a:
            float r1 = r6.getRawX()
            float r3 = r6.getRawY()
            long r3 = androidx.compose.ui.geometry.OffsetKt.Offset(r1, r3)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m2257boximpl(r3)
        L6a:
            java.lang.Object r0 = r2.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7f
        L76:
            x00.a<yz.g2> r6 = r5.onDismissRequest
            if (r6 == 0) goto L7d
            r6.invoke()
        L7d:
            r6 = 1
            return r6
        L7f:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setParentBounds(@l IntRect intRect) {
        this.parentBounds$delegate.setValue(intRect);
    }

    public final void setParentLayoutDirection(@k LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1855setPopupContentSizefhxjrPA(@l IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    public final void setPositionProvider(@k PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(@k String str) {
        this.testTag = str;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(@l a<g2> aVar, @k String str, @k LayoutDirection layoutDirection) {
        this.onDismissRequest = aVar;
        this.testTag = str;
        superSetLayoutDirection(layoutDirection);
    }

    public final void updatePosition() {
        IntSize m1854getPopupContentSizebOM6tXw;
        IntRect parentBounds = getParentBounds();
        if (parentBounds == null || (m1854getPopupContentSizebOM6tXw = m1854getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long m5290unboximpl = m1854getPopupContentSizebOM6tXw.m5290unboximpl();
        Rect rect = this.previousWindowVisibleFrame;
        this.composeView.getWindowVisibleDisplayFrame(rect);
        IntRect intBounds = toIntBounds(rect);
        long mo346calculatePositionllwVHH4 = this.positionProvider.mo346calculatePositionllwVHH4(parentBounds, IntSizeKt.IntSize(intBounds.getWidth(), intBounds.getHeight()), this.parentLayoutDirection, m5290unboximpl);
        this.params.x = IntOffset.m5243getXimpl(mo346calculatePositionllwVHH4);
        this.params.y = IntOffset.m5244getYimpl(mo346calculatePositionllwVHH4);
        this.windowManager.updateViewLayout(this, this.params);
    }

    public final void setContent(@k CompositionContext compositionContext, @k p<? super Composer, ? super Integer, g2> pVar) {
        setParentCompositionContext(compositionContext);
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @k
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
    }
}
