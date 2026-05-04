package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,451:1\n1#2:452\n*E\n"})
/* loaded from: classes2.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;

    @m80.l
    private WeakReference<CompositionContext> cachedViewTreeCompositionContext;

    @m80.l
    private Composition composition;
    private boolean creatingComposition;

    @m80.l
    private x00.a<g2> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;

    @m80.l
    private CompositionContext parentContext;

    @m80.l
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    @w00.k
    public AbstractComposeView(@m80.k Context context) {
        this(context, null, 0, 6, null);
    }

    private final CompositionContext cacheIfAlive(CompositionContext compositionContext) {
        CompositionContext compositionContext2 = isAlive(compositionContext) ? compositionContext : null;
        if (compositionContext2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(compositionContext2);
        }
        return compositionContext;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = Wrapper_androidKt.setContent(this, resolveParentCompositionContext(), ComposableLambdaKt.composableLambdaInstance(-656146368, true, new x00.p<Composer, Integer, g2>() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return g2.f100423a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(Composer composer, int i11) {
                        if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-656146368, i11, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:249)");
                        }
                        AbstractComposeView.this.Content(composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private final boolean isAlive(CompositionContext compositionContext) {
        return !(compositionContext instanceof Recomposer) || ((Recomposer) compositionContext).getCurrentState().getValue().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    private final CompositionContext resolveParentCompositionContext() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2 = this.parentContext;
        if (compositionContext2 == null) {
            CompositionContext findViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
            CompositionContext compositionContext3 = null;
            compositionContext2 = findViewTreeCompositionContext != null ? cacheIfAlive(findViewTreeCompositionContext) : null;
            if (compositionContext2 == null) {
                WeakReference<CompositionContext> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (compositionContext = weakReference.get()) != null && isAlive(compositionContext)) {
                    compositionContext3 = compositionContext;
                }
                return compositionContext3 == null ? cacheIfAlive(WindowRecomposer_androidKt.getWindowRecomposer(this)) : compositionContext3;
            }
        }
        return compositionContext2;
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            Composition composition = this.composition;
            if (composition != null) {
                composition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    @Composable
    @UiComposable
    public abstract void Content(@m80.l Composer composer, int i11);

    @Override // android.view.ViewGroup
    public void addView(@m80.l View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@m80.l View view, int i11, @m80.l ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i11, layoutParams);
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        ensureCompositionCreated();
    }

    public final void disposeComposition() {
        Composition composition = this.composition;
        if (composition != null) {
            composition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z11, int i11, int i12, int i13, int i14) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i13 - i11) - getPaddingRight(), (i14 - i12) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i11, i12);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i11)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i12) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i12)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        internalOnLayout$ui_release(z11, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i11, i12);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i11);
    }

    public final void setParentCompositionContext(@m80.l CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setShowLayoutBounds(boolean z11) {
        this.showLayoutBounds = z11;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z11);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z11) {
        super.setTransitionGroup(z11);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(@m80.k ViewCompositionStrategy viewCompositionStrategy) {
        x00.a<g2> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.installFor(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @w00.k
    public AbstractComposeView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup
    public void addView(@m80.l View view, int i11) {
        checkAddView();
        super.addView(view, i11);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@m80.l View view, int i11, @m80.l ViewGroup.LayoutParams layoutParams, boolean z11) {
        checkAddView();
        return super.addViewInLayout(view, i11, layoutParams, z11);
    }

    @w00.k
    public AbstractComposeView(@m80.k Context context, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    @Override // android.view.ViewGroup
    public void addView(@m80.l View view, int i11, int i12) {
        checkAddView();
        super.addView(view, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@m80.l View view, @m80.l ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(@m80.l View view, int i11, @m80.l ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i11, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
