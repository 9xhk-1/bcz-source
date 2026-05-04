package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,737:1\n677#1,6:776\n683#1,2:783\n685#1:791\n686#1:802\n687#1,7:807\n677#1,6:814\n683#1,2:821\n685#1:829\n686#1:840\n687#1,7:845\n1#2:738\n56#3,5:739\n30#4:744\n30#4:748\n30#4:758\n30#4:762\n30#4:766\n30#4:803\n30#4:841\n30#4:866\n53#5,3:745\n53#5,3:749\n60#5:753\n70#5:756\n53#5,3:759\n53#5,3:763\n53#5,3:767\n60#5:771\n70#5:774\n85#5:787\n90#5:790\n53#5,3:804\n85#5:825\n90#5:828\n53#5,3:842\n85#5:856\n90#5:859\n85#5:862\n90#5:865\n53#5,3:867\n65#6:752\n69#6:755\n65#6:770\n69#6:773\n22#7:754\n22#7:757\n22#7:772\n22#7:775\n105#8:782\n105#8:820\n105#8:852\n105#8:853\n105#8:870\n105#8:871\n105#8:872\n105#8:873\n105#8:874\n105#8:875\n61#9:785\n54#9:786\n63#9:788\n59#9:789\n54#9,10:792\n61#9:823\n54#9:824\n63#9:826\n59#9:827\n54#9,10:830\n61#9:854\n54#9:855\n63#9:857\n59#9:858\n61#9:860\n54#9:861\n63#9:863\n59#9:864\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n*L\n668#1:776,6\n668#1:783,2\n668#1:791\n668#1:802\n668#1:807,7\n672#1:814,6\n672#1:821,2\n672#1:829\n672#1:840\n672#1:845,7\n199#1:739,5\n594#1:744\n595#1:748\n612#1:758\n613#1:762\n622#1:766\n668#1:803\n672#1:841\n686#1:866\n594#1:745,3\n595#1:749,3\n598#1:753\n599#1:756\n612#1:759,3\n613#1:763,3\n622#1:767,3\n625#1:771\n626#1:774\n668#1:787\n668#1:790\n668#1:804,3\n672#1:825\n672#1:828\n672#1:842,3\n684#1:856\n684#1:859\n685#1:862\n685#1:865\n686#1:867,3\n598#1:752\n599#1:755\n625#1:770\n626#1:773\n598#1:754\n599#1:757\n625#1:772\n626#1:775\n668#1:782\n672#1:820\n682#1:852\n683#1:853\n687#1:870\n688#1:871\n699#1:872\n700#1:873\n701#1:874\n702#1:875\n668#1:785\n668#1:786\n668#1:788\n668#1:789\n668#1:792,10\n672#1:823\n672#1:824\n672#1:826\n672#1:827\n672#1:830,10\n684#1:854\n684#1:855\n684#1:857\n684#1:858\n685#1:860\n685#1:861\n685#1:863\n685#1:864\n*E\n"})
/* loaded from: classes2.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    private final int compositeKeyHash;

    @k
    private Density density;

    @k
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;

    @l
    private WindowInsetsCompat insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;

    @k
    private final LayoutNode layoutNode;

    @l
    private LifecycleOwner lifecycleOwner;

    @k
    private final int[] location;

    @k
    private Modifier modifier;

    @k
    private final NestedScrollingParentHelper nestedScrollingParentHelper;

    @l
    private x00.l<? super Density, g2> onDensityChanged;

    @l
    private x00.l<? super Modifier, g2> onModifierChanged;

    @l
    private x00.l<? super Boolean, g2> onRequestDisallowInterceptTouchEvent;

    @k
    private final Owner owner;

    @k
    private final int[] position;

    @k
    private x00.a<g2> release;

    @k
    private x00.a<g2> reset;

    @k
    private final x00.a<g2> runInvalidate;

    @k
    private final x00.a<g2> runUpdate;

    @l
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private long size;

    @k
    private x00.a<g2> update;

    @k
    private final View view;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final x00.l<AndroidViewHolder, g2> OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidViewHolder(@k Context context, @l CompositionContext compositionContext, int i11, @k NestedScrollDispatcher nestedScrollDispatcher, @k View view, @k Owner owner) {
        super(context);
        AndroidViewHolder_androidKt$NoOpScrollConnection$1 androidViewHolder_androidKt$NoOpScrollConnection$1;
        this.compositeKeyHash = i11;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        ViewCompat.setWindowInsetsAnimationCallback(this, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
                return AndroidViewHolder.this.insetToLayoutPosition(windowInsetsCompat);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                return AndroidViewHolder.this.insetBounds(boundsCompat);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(this, this);
        this.update = new x00.a<g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }
        };
        this.reset = new x00.a<g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }
        };
        this.release = new x00.a<g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }
        };
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.Companion.m5291getZeroYbymL2g();
        this.runUpdate = new x00.a<g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
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
                boolean z11;
                OwnerSnapshotObserver snapshotObserver;
                x00.l lVar;
                z11 = AndroidViewHolder.this.hasUpdateBlock;
                if (z11 && AndroidViewHolder.this.isAttachedToWindow()) {
                    ViewParent parent = AndroidViewHolder.this.getView().getParent();
                    AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                    if (parent == androidViewHolder) {
                        snapshotObserver = androidViewHolder.getSnapshotObserver();
                        AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                        lVar = AndroidViewHolder.OnCommitAffectingUpdate;
                        snapshotObserver.observeReads$ui_release(androidViewHolder2, lVar, AndroidViewHolder.this.getUpdate());
                    }
                }
            }
        };
        this.runInvalidate = new x00.a<g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
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
                AndroidViewHolder.this.getLayoutNode().invalidateLayer$ui_release();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        final LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setForceUseOldLayers(true);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        androidViewHolder_androidKt$NoOpScrollConnection$1 = AndroidViewHolder_androidKt.NoOpScrollConnection;
        final Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, androidViewHolder_androidKt$NoOpScrollConnection$1, nestedScrollDispatcher), true, new x00.l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return g2.f100423a;
            }
        }), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new x00.l<DrawScope, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    Owner owner$ui_release = layoutNode2.getOwner$ui_release();
                    AndroidComposeView androidComposeView = owner$ui_release instanceof AndroidComposeView ? (AndroidComposeView) owner$ui_release : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }
        }), new x00.l<LayoutCoordinates, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                Owner owner2;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                long j11;
                WindowInsetsCompat windowInsetsCompat;
                int[] iArr4;
                int[] iArr5;
                long j12;
                AndroidViewHolder_androidKt.layoutAccordingTo(AndroidViewHolder.this, layoutNode);
                owner2 = AndroidViewHolder.this.owner;
                owner2.onInteropViewLayoutChange(AndroidViewHolder.this);
                iArr = AndroidViewHolder.this.position;
                int i12 = iArr[0];
                iArr2 = AndroidViewHolder.this.position;
                int i13 = iArr2[1];
                View view2 = AndroidViewHolder.this.getView();
                iArr3 = AndroidViewHolder.this.position;
                view2.getLocationOnScreen(iArr3);
                j11 = AndroidViewHolder.this.size;
                AndroidViewHolder.this.size = layoutCoordinates.mo3865getSizeYbymL2g();
                windowInsetsCompat = AndroidViewHolder.this.insets;
                if (windowInsetsCompat != null) {
                    iArr4 = AndroidViewHolder.this.position;
                    if (i12 == iArr4[0]) {
                        iArr5 = AndroidViewHolder.this.position;
                        if (i13 == iArr5[1]) {
                            j12 = AndroidViewHolder.this.size;
                            if (IntSize.m5284equalsimpl0(j11, j12)) {
                                return;
                            }
                        }
                    }
                    WindowInsets windowInsets = AndroidViewHolder.this.insetToLayoutPosition(windowInsetsCompat).toWindowInsets();
                    if (windowInsets != null) {
                        AndroidViewHolder.this.getView().dispatchApplyWindowInsets(windowInsets);
                    }
                }
            }
        });
        layoutNode.setCompositeKeyHash(i11);
        layoutNode.setModifier(this.modifier.then(onGloballyPositioned));
        this.onModifierChanged = new x00.l<Modifier, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Modifier modifier) {
                invoke2(modifier);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Modifier modifier) {
                LayoutNode.this.setModifier(modifier.then(onGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new x00.l<Density, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Density density) {
                invoke2(density);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Density density) {
                LayoutNode.this.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui_release(new x00.l<Owner, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Owner owner2) {
                invoke2(owner2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(AndroidViewHolder.this, layoutNode);
                }
                ViewParent parent = AndroidViewHolder.this.getView().getParent();
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }
        });
        layoutNode.setOnDetach$ui_release(new x00.l<Owner, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Owner owner2) {
                invoke2(owner2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                if (ComposeUiFlags.isViewFocusFixEnabled && AndroidViewHolder.this.hasFocus()) {
                    owner2.getFocusOwner().clearFocus(true);
                }
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(AndroidViewHolder.this);
                }
                AndroidViewHolder.this.removeAllViewsInLayout();
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int i12) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                g0.m(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i12, layoutParams.width);
                androidViewHolder.measure(obtainMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                return AndroidViewHolder.this.getMeasuredHeight();
            }

            private final int intrinsicWidth(int i12) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                g0.m(layoutParams);
                obtainMeasureSpec = androidViewHolder2.obtainMeasureSpec(0, i12, layoutParams.height);
                androidViewHolder.measure(makeMeasureSpec, obtainMeasureSpec);
                return AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i12) {
                return intrinsicHeight(i12);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i12) {
                return intrinsicWidth(i12);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                int obtainMeasureSpec;
                int obtainMeasureSpec2;
                if (AndroidViewHolder.this.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return g2.f100423a;
                        }
                    }, 4, null);
                }
                if (Constraints.m5070getMinWidthimpl(j11) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumWidth(Constraints.m5070getMinWidthimpl(j11));
                }
                if (Constraints.m5069getMinHeightimpl(j11) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumHeight(Constraints.m5069getMinHeightimpl(j11));
                }
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int m5070getMinWidthimpl = Constraints.m5070getMinWidthimpl(j11);
                int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
                ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
                g0.m(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(m5070getMinWidthimpl, m5068getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                int m5069getMinHeightimpl = Constraints.m5069getMinHeightimpl(j11);
                int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
                ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
                g0.m(layoutParams2);
                obtainMeasureSpec2 = androidViewHolder2.obtainMeasureSpec(m5069getMinHeightimpl, m5067getMaxHeightimpl, layoutParams2.height);
                androidViewHolder.measure(obtainMeasureSpec, obtainMeasureSpec2);
                int measuredWidth = AndroidViewHolder.this.getMeasuredWidth();
                int measuredHeight = AndroidViewHolder.this.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = AndroidViewHolder.this;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.layoutAccordingTo(AndroidViewHolder.this, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i12) {
                return intrinsicHeight(i12);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i12) {
                return intrinsicWidth(i12);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    private final Insets inset(Insets insets, int i11, int i12, int i13, int i14) {
        int i15 = insets.left - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = insets.top - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = insets.right - i13;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = insets.bottom - i14;
        return Insets.of(i15, i16, i17, i18 >= 0 ? i18 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsAnimationCompat.BoundsCompat insetBounds(WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long m5260roundk4lQ0M = IntOffsetKt.m5260roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int m5243getXimpl = IntOffset.m5243getXimpl(m5260roundk4lQ0M);
            if (m5243getXimpl < 0) {
                m5243getXimpl = 0;
            }
            int m5244getYimpl = IntOffset.m5244getYimpl(m5260roundk4lQ0M);
            int i11 = m5244getYimpl < 0 ? 0 : m5244getYimpl;
            long mo3865getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo3865getSizeYbymL2g();
            int i12 = (int) (mo3865getSizeYbymL2g >> 32);
            int i13 = (int) (mo3865getSizeYbymL2g & 4294967295L);
            long mo3865getSizeYbymL2g2 = innerCoordinator$ui_release.mo3865getSizeYbymL2g();
            long m5260roundk4lQ0M2 = IntOffsetKt.m5260roundk4lQ0M(innerCoordinator$ui_release.mo3868localToRootMKHz9U(Offset.m2260constructorimpl((4294967295L & Float.floatToRawIntBits((int) (mo3865getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (mo3865getSizeYbymL2g2 >> 32)) << 32))));
            int m5243getXimpl2 = i12 - IntOffset.m5243getXimpl(m5260roundk4lQ0M2);
            if (m5243getXimpl2 < 0) {
                m5243getXimpl2 = 0;
            }
            int m5244getYimpl2 = i13 - IntOffset.m5244getYimpl(m5260roundk4lQ0M2);
            int i14 = m5244getYimpl2 >= 0 ? m5244getYimpl2 : 0;
            if (m5243getXimpl != 0 || i11 != 0 || m5243getXimpl2 != 0 || i14 != 0) {
                int i15 = m5243getXimpl;
                int i16 = m5243getXimpl2;
                return new WindowInsetsAnimationCompat.BoundsCompat(inset(boundsCompat.getLowerBound(), i15, i11, i16, i14), inset(boundsCompat.getUpperBound(), i15, i11, i16, i14));
            }
        }
        return boundsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsCompat insetToLayoutPosition(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat.hasInsets()) {
            NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
            if (innerCoordinator$ui_release.isAttached()) {
                long m5260roundk4lQ0M = IntOffsetKt.m5260roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
                int m5243getXimpl = IntOffset.m5243getXimpl(m5260roundk4lQ0M);
                if (m5243getXimpl < 0) {
                    m5243getXimpl = 0;
                }
                int m5244getYimpl = IntOffset.m5244getYimpl(m5260roundk4lQ0M);
                if (m5244getYimpl < 0) {
                    m5244getYimpl = 0;
                }
                long mo3865getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo3865getSizeYbymL2g();
                int i11 = (int) (mo3865getSizeYbymL2g >> 32);
                int i12 = (int) (mo3865getSizeYbymL2g & 4294967295L);
                long mo3865getSizeYbymL2g2 = innerCoordinator$ui_release.mo3865getSizeYbymL2g();
                long m5260roundk4lQ0M2 = IntOffsetKt.m5260roundk4lQ0M(innerCoordinator$ui_release.mo3868localToRootMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits((int) (mo3865getSizeYbymL2g2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (mo3865getSizeYbymL2g2 >> 32)) << 32))));
                int m5243getXimpl2 = i11 - IntOffset.m5243getXimpl(m5260roundk4lQ0M2);
                if (m5243getXimpl2 < 0) {
                    m5243getXimpl2 = 0;
                }
                int m5244getYimpl2 = i12 - IntOffset.m5244getYimpl(m5260roundk4lQ0M2);
                int i13 = m5244getYimpl2 < 0 ? 0 : m5244getYimpl2;
                if (m5243getXimpl != 0 || m5244getYimpl != 0 || m5243getXimpl2 != 0 || i13 != 0) {
                    return windowInsetsCompat.inset(m5243getXimpl, m5244getYimpl, m5243getXimpl2, i13);
                }
            }
        }
        return windowInsetsCompat;
    }

    private final <T> T insetValue(T t11, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> rVar) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long m5260roundk4lQ0M = IntOffsetKt.m5260roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int m5243getXimpl = IntOffset.m5243getXimpl(m5260roundk4lQ0M);
            if (m5243getXimpl < 0) {
                m5243getXimpl = 0;
            }
            int m5244getYimpl = IntOffset.m5244getYimpl(m5260roundk4lQ0M);
            if (m5244getYimpl < 0) {
                m5244getYimpl = 0;
            }
            long mo3865getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo3865getSizeYbymL2g();
            int i11 = (int) (mo3865getSizeYbymL2g >> 32);
            int i12 = (int) (mo3865getSizeYbymL2g & 4294967295L);
            long mo3865getSizeYbymL2g2 = innerCoordinator$ui_release.mo3865getSizeYbymL2g();
            long m5260roundk4lQ0M2 = IntOffsetKt.m5260roundk4lQ0M(innerCoordinator$ui_release.mo3868localToRootMKHz9U(Offset.m2260constructorimpl((4294967295L & Float.floatToRawIntBits((int) (mo3865getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (mo3865getSizeYbymL2g2 >> 32)) << 32))));
            int m5243getXimpl2 = i11 - IntOffset.m5243getXimpl(m5260roundk4lQ0M2);
            if (m5243getXimpl2 < 0) {
                m5243getXimpl2 = 0;
            }
            int m5244getYimpl2 = i12 - IntOffset.m5244getYimpl(m5260roundk4lQ0M2);
            int i13 = m5244getYimpl2 >= 0 ? m5244getYimpl2 : 0;
            if (m5243getXimpl != 0 || m5244getYimpl != 0 || m5243getXimpl2 != 0 || i13 != 0) {
                return rVar.invoke(Integer.valueOf(m5243getXimpl), Integer.valueOf(m5244getYimpl), Integer.valueOf(m5243getXimpl2), Integer.valueOf(i13));
            }
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i11, int i12, int i13) {
        return (i13 >= 0 || i11 == i12) ? View.MeasureSpec.makeMeasureSpec(u.I(i13, i11, i12), 1073741824) : (i13 != -2 || i12 == Integer.MAX_VALUE) ? (i13 != -1 || i12 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@l Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i11 = iArr[0];
        region.op(i11, iArr[1], i11 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @k
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @k
    public final Density getDensity() {
        return this.density;
    }

    @l
    public final View getInteropView() {
        return this.view;
    }

    @k
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @l
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @l
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @k
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    @l
    public final x00.l<Density, g2> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    @l
    public final x00.l<Modifier, g2> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    @l
    public final x00.l<Boolean, g2> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @k
    public final x00.a<g2> getRelease() {
        return this.release;
    }

    @k
    public final x00.a<g2> getReset() {
        return this.reset;
    }

    @l
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @k
    public final x00.a<g2> getUpdate() {
        return this.update;
    }

    @k
    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @l
    public ViewParent invalidateChildInParent(@l int[] iArr, @l Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui_release();
            return;
        }
        View view = this.view;
        final x00.a<g2> aVar = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                x00.a.this.invoke();
            }
        });
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @k
    public WindowInsetsCompat onApplyWindowInsets(@k View view, @k WindowInsetsCompat windowInsetsCompat) {
        this.insets = new WindowInsetsCompat(windowInsetsCompat);
        return insetToLayoutPosition(windowInsetsCompat);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled && hasFocus() && isInTouchMode() && Build.VERSION.SDK_INT > 28) {
            findFocus().clearFocus();
        }
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@k View view, @k View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.view.layout(0, 0, i13 - i11, i14 - i12);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(i11, i12);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = i11;
        this.lastHeightMeasureSpec = i12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@k View view, float f11, float f12, boolean z11) {
        float composeVelocity;
        float composeVelocity2;
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        composeVelocity = AndroidViewHolder_androidKt.toComposeVelocity(f11);
        composeVelocity2 = AndroidViewHolder_androidKt.toComposeVelocity(f12);
        c40.k.f(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedFling$1(z11, this, VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@k View view, float f11, float f12) {
        float composeVelocity;
        float composeVelocity2;
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        composeVelocity = AndroidViewHolder_androidKt.toComposeVelocity(f11);
        composeVelocity2 = AndroidViewHolder_androidKt.toComposeVelocity(f12);
        c40.k.f(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@k View view, int i11, int i12, @k int[] iArr, int i13) {
        float composeOffset;
        float composeOffset2;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i11);
            composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i12);
            long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            nestedScrollSource = AndroidViewHolder_androidKt.toNestedScrollSource(i13);
            long m3609dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m3609dispatchPreScrollOzD1aCk(m2260constructorimpl, nestedScrollSource);
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (m3609dispatchPreScrollOzD1aCk >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (m3609dispatchPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@k View view, int i11, int i12, int i13, int i14, int i15, @k int[] iArr) {
        float composeOffset;
        float composeOffset2;
        float composeOffset3;
        float composeOffset4;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i11);
            composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i12);
            long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i13);
            composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i14);
            long m2260constructorimpl2 = Offset.m2260constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32));
            nestedScrollSource = AndroidViewHolder_androidKt.toNestedScrollSource(i15);
            long m3607dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m3607dispatchPostScrollDzOQY0M(m2260constructorimpl, m2260constructorimpl2, nestedScrollSource);
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (m3607dispatchPostScrollDzOQY0M >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (m3607dispatchPostScrollDzOQY0M & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@k View view, @k View view2, int i11, int i12) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i11, i12);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@k View view, @k View view2, int i11, int i12) {
        return ((i11 & 2) == 0 && (i11 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@k View view, int i11) {
        this.nestedScrollingParentHelper.onStopNestedScroll(view, i11);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
    }

    public final void remeasure() {
        int i11;
        int i12 = this.lastWidthMeasureSpec;
        if (i12 == Integer.MIN_VALUE || (i11 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i12, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        x00.l<? super Boolean, g2> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z11));
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public final void setDensity(@k Density density) {
        if (density != this.density) {
            this.density = density;
            x00.l<? super Density, g2> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(@l LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(@k Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            x00.l<? super Modifier, g2> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@l x00.l<? super Density, g2> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void setOnModifierChanged$ui_release(@l x00.l<? super Modifier, g2> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@l x00.l<? super Boolean, g2> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    public final void setRelease(@k x00.a<g2> aVar) {
        this.release = aVar;
    }

    public final void setReset(@k x00.a<g2> aVar) {
        this.reset = aVar;
    }

    public final void setSavedStateRegistryOwner(@l SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(@k x00.a<g2> aVar) {
        this.update = aVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@k View view, int i11, int i12, int i13, int i14, int i15) {
        float composeOffset;
        float composeOffset2;
        float composeOffset3;
        float composeOffset4;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i11);
            composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i12);
            long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i13);
            composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i14);
            long m2260constructorimpl2 = Offset.m2260constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32));
            nestedScrollSource = AndroidViewHolder_androidKt.toNestedScrollSource(i15);
            nestedScrollDispatcher.m3607dispatchPostScrollDzOQY0M(m2260constructorimpl, m2260constructorimpl2, nestedScrollSource);
        }
    }
}
