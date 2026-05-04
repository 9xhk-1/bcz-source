package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.R;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
@u0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 10 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,957:1\n113#2:958\n1#3:959\n85#4:960\n113#4,2:961\n85#4:963\n113#4,2:964\n85#4:966\n85#4:967\n113#4,2:968\n65#5:970\n69#5:977\n60#6:971\n70#6:978\n80#6:980\n80#6:982\n85#6:984\n90#6:986\n22#7,5:972\n32#8:979\n30#9:981\n54#10:983\n59#10:985\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n502#1:958\n491#1:960\n491#1:961,2\n492#1:963\n492#1:964,2\n496#1:966\n556#1:967\n556#1:968,2\n729#1:970\n729#1:977\n729#1:971\n729#1:978\n729#1:980\n744#1:982\n763#1:984\n763#1:986\n729#1:972,5\n729#1:979\n744#1:981\n763#1:983\n763#1:985\n*E\n"})
/* loaded from: classes2.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {

    @l
    private Object backCallback;

    @k
    private final State canCalculatePosition$delegate;

    @k
    private final View composeView;

    @k
    private final MutableState content$delegate;

    @k
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;

    @l
    private x00.a<g2> onDismissRequest;

    @k
    private final WindowManager.LayoutParams params;

    @l
    private IntRect parentBounds;

    @k
    private final MutableState parentLayoutCoordinates$delegate;

    @k
    private LayoutDirection parentLayoutDirection;

    @k
    private final MutableState popupContentSize$delegate;

    @k
    private final PopupLayoutHelper popupLayoutHelper;

    @k
    private PopupPositionProvider positionProvider;

    @k
    private final Rect previousWindowVisibleFrame;

    @k
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @k
    private final SnapshotStateObserver snapshotStateObserver;

    @k
    private String testTag;

    @k
    private final WindowManager windowManager;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final x00.l<PopupLayout, g2> onCommitAffectingPopupPosition = new x00.l<PopupLayout, g2>() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(PopupLayout popupLayout) {
            invoke2(popupLayout);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.updatePosition();
            }
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PopupLayout(x00.a r11, androidx.compose.ui.window.PopupProperties r12, java.lang.String r13, android.view.View r14, androidx.compose.ui.unit.Density r15, androidx.compose.ui.window.PopupPositionProvider r16, java.util.UUID r17, androidx.compose.ui.window.PopupLayoutHelper r18, int r19, kotlin.jvm.internal.v r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L23
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            androidx.compose.ui.window.PopupLayoutHelperImpl29 r0 = new androidx.compose.ui.window.PopupLayoutHelperImpl29
            r0.<init>()
            goto L17
        L12:
            androidx.compose.ui.window.PopupLayoutHelperImpl r0 = new androidx.compose.ui.window.PopupLayoutHelperImpl
            r0.<init>()
        L17:
            r9 = r0
        L18:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            goto L26
        L23:
            r9 = r18
            goto L18
        L26:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupLayout.<init>(x00.a, androidx.compose.ui.window.PopupProperties, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID, androidx.compose.ui.window.PopupLayoutHelper, int, kotlin.jvm.internal.v):void");
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        int flagsWithSecureFlagInherited;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        flagsWithSecureFlagInherited = AndroidPopup_androidKt.flagsWithSecureFlagInherited(this.properties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        layoutParams.flags = flagsWithSecureFlagInherited;
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(R.string.default_popup_window_title));
        return layoutParams;
    }

    private final p<Composer, Integer, g2> getContent() {
        return (p) this.content$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates$delegate.getValue();
    }

    private final IntRect getVisibleDisplayBounds() {
        IntRect intBounds;
        Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, rect);
        intBounds = AndroidPopup_androidKt.toIntBounds(rect);
        return intBounds;
    }

    private final void maybeRegisterBackCallback() {
        if (!this.properties.getDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = Api33Impl.createBackCallback(this.onDismissRequest);
        }
        Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void setContent(p<? super Composer, ? super Integer, g2> pVar) {
        this.content$delegate.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates$delegate.setValue(layoutCoordinates);
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

    private final void updatePopupProperties(PopupProperties popupProperties) {
        int flagsWithSecureFlagInherited;
        if (g0.g(this.properties, popupProperties)) {
            return;
        }
        if (popupProperties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.properties = popupProperties;
        WindowManager.LayoutParams layoutParams2 = this.params;
        flagsWithSecureFlagInherited = AndroidPopup_androidKt.flagsWithSecureFlagInherited(popupProperties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        layoutParams2.flags = flagsWithSecureFlagInherited;
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    @UiComposable
    public void Content(@l Composer composer, int i11) {
        composer.startReplaceGroup(-857613600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-857613600, i11, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
        }
        getContent().invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@k KeyEvent keyEvent) {
        if (!this.properties.getDismissOnBackPress()) {
            return super.dispatchKeyEvent(keyEvent);
        }
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
                x00.a<g2> aVar = this.onDismissRequest;
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

    @k
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.params;
    }

    @k
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m5371getPopupContentSizebOM6tXw() {
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

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z11, int i11, int i12, int i13, int i14) {
        View childAt;
        super.internalOnLayout$ui_release(z11, i11, i12, i13, i14);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i11, int i12) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(i11, i12);
        } else {
            IntRect visibleDisplayBounds = getVisibleDisplayBounds();
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.getHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.start();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
        maybeUnregisterBackCallback();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@l MotionEvent motionEvent) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            x00.a<g2> aVar = this.onDismissRequest;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        x00.a<g2> aVar2 = this.onDismissRequest;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.locationOnScreen;
        int i11 = iArr[0];
        int i12 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i11 == iArr2[0] && i12 == iArr2[1]) {
            return;
        }
        updateParentBounds$ui_release();
    }

    public final void setParentLayoutDirection(@k LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m5372setPopupContentSizefhxjrPA(@l IntSize intSize) {
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

    public final void updateParameters(@l x00.a<g2> aVar, @k PopupProperties popupProperties, @k String str, @k LayoutDirection layoutDirection) {
        this.onDismissRequest = aVar;
        this.testTag = str;
        updatePopupProperties(popupProperties);
        superSetLayoutDirection(layoutDirection);
    }

    @VisibleForTesting
    public final void updateParentBounds$ui_release() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long mo3865getSizeYbymL2g = parentLayoutCoordinates.mo3865getSizeYbymL2g();
            long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
            IntRect m5276IntRectVbeCjmY = IntRectKt.m5276IntRectVbeCjmY(IntOffset.m5237constructorimpl((Math.round(Float.intBitsToFloat((int) (positionInWindow >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (positionInWindow & 4294967295L))))), mo3865getSizeYbymL2g);
            if (g0.g(m5276IntRectVbeCjmY, this.parentBounds)) {
                return;
            }
            this.parentBounds = m5276IntRectVbeCjmY;
            updatePosition();
        }
    }

    public final void updateParentLayoutCoordinates(@k LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void updatePosition() {
        IntSize m5371getPopupContentSizebOM6tXw;
        final IntRect intRect = this.parentBounds;
        if (intRect == null || (m5371getPopupContentSizebOM6tXw = m5371getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long m5290unboximpl = m5371getPopupContentSizebOM6tXw.m5290unboximpl();
        IntRect visibleDisplayBounds = getVisibleDisplayBounds();
        final long m5281constructorimpl = IntSize.m5281constructorimpl((visibleDisplayBounds.getWidth() << 32) | (visibleDisplayBounds.getHeight() & 4294967295L));
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = IntOffset.Companion.m5254getZeronOccac();
        this.snapshotStateObserver.observeReads(this, onCommitAffectingPopupPosition, new x00.a<g2>() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Ref.LongRef.this.element = this.getPositionProvider().mo346calculatePositionllwVHH4(intRect, m5281constructorimpl, this.getParentLayoutDirection(), m5290unboximpl);
            }
        });
        this.params.x = IntOffset.m5243getXimpl(longRef.element);
        this.params.y = IntOffset.m5244getYimpl(longRef.element);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.setGestureExclusionRects(this, (int) (m5281constructorimpl >> 32), (int) (m5281constructorimpl & 4294967295L));
        }
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    public final void setContent(@k CompositionContext compositionContext, @k p<? super Composer, ? super Integer, g2> pVar) {
        setParentCompositionContext(compositionContext);
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public PopupLayout(@l x00.a<g2> aVar, @k PopupProperties popupProperties, @k String str, @k View view, @k Density density, @k PopupPositionProvider popupPositionProvider, @k UUID uuid, @k PopupLayoutHelper popupLayoutHelper) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = aVar;
        this.properties = popupProperties;
        this.testTag = str;
        this.composeView = view;
        this.popupLayoutHelper = popupLayoutHelper;
        Object systemService = view.getContext().getSystemService("window");
        g0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentLayoutCoordinates$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition$delegate = SnapshotStateKt.derivedStateOf(new x00.a<Boolean>() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                LayoutCoordinates parentLayoutCoordinates;
                parentLayoutCoordinates = PopupLayout.this.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || PopupLayout.this.m5371getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float m5115constructorimpl = Dp.m5115constructorimpl(8);
        this.maxSupportedElevation = m5115constructorimpl;
        this.previousWindowVisibleFrame = new Rect();
        this.snapshotStateObserver = new SnapshotStateObserver(new PopupLayout$snapshotStateObserver$1(this));
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo377toPx0680j_4(m5115constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m5370getLambda1$ui_release(), null, 2, null);
        this.locationOnScreen = new int[2];
    }

    @VisibleForTesting
    public static /* synthetic */ void getParams$ui_release$annotations() {
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
