package androidx.compose.ui.window;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import c10.d;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,627:1\n385#1,12:633\n85#2:628\n113#2,2:629\n105#3:631\n105#3:632\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n379#1:633,12\n229#1:628\n229#1:629,2\n305#1:631\n306#1:632\n*E\n"})
/* loaded from: classes2.dex */
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider, OnApplyWindowInsetsListener {

    @k
    private final MutableState content$delegate;
    private boolean decorFitsSystemWindows;
    private boolean hasCalledSetLayout;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;

    @k
    private final Window window;

    public DialogLayout(@k Context context, @k Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m5369getLambda1$ui_release(), null, 2, null);
        ViewCompat.setOnApplyWindowInsetsListener(this, this);
        ViewCompat.setWindowInsetsAnimationCallback(this, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.window.DialogLayout.1
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        return windowInsetsCompat.inset(max, max2, max3, max4);
                    }
                }
                return windowInsetsCompat;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        return boundsCompat.inset(Insets.of(max, max2, max3, max4));
                    }
                }
                return boundsCompat;
            }
        });
    }

    private final p<Composer, Integer, g2> getContent() {
        return (p) this.content$delegate.getValue();
    }

    private final <T> T insetValue(T t11, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> rVar) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return rVar.invoke(Integer.valueOf(max), Integer.valueOf(max2), Integer.valueOf(max3), Integer.valueOf(max4));
            }
        }
        return t11;
    }

    private final void setContent(p<? super Composer, ? super Integer, g2> pVar) {
        this.content$delegate.setValue(pVar);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(@l Composer composer, int i11) {
        composer.startReplaceGroup(1735448596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735448596, i11, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:410)");
        }
        getContent().invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    @k
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z11, int i11, int i12, int i13, int i14) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i15 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i16 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui_release(i11, i12);
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        int i13 = (mode != Integer.MIN_VALUE || this.usePlatformDefaultWidth || this.decorFitsSystemWindows || getWindow().getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i14 = size - paddingLeft;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = i13 - paddingTop;
        int i16 = i15 >= 0 ? i15 : 0;
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
        }
        childAt.measure(i11, i12);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingTop));
        if (this.usePlatformDefaultWidth || this.decorFitsSystemWindows || childAt.getMeasuredHeight() + paddingTop <= size2 || getWindow().getAttributes().height != -2) {
            return;
        }
        getWindow().setLayout(-1, -1);
    }

    public final boolean isInsideContent(@k MotionEvent motionEvent) {
        View childAt;
        int L0;
        float x11 = motionEvent.getX();
        if (!Float.isInfinite(x11) && !Float.isNaN(x11)) {
            float y11 = motionEvent.getY();
            if (Float.isInfinite(y11) || Float.isNaN(y11) || (childAt = getChildAt(0)) == null) {
                return false;
            }
            int left = getLeft() + childAt.getLeft();
            int width = childAt.getWidth() + left;
            int top = getTop() + childAt.getTop();
            int height = childAt.getHeight() + top;
            int L02 = d.L0(motionEvent.getX());
            if (left <= L02 && L02 <= width && top <= (L0 = d.L0(motionEvent.getY())) && L0 <= height) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @k
    public WindowInsetsCompat onApplyWindowInsets(@k View view, @k WindowInsetsCompat windowInsetsCompat) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return windowInsetsCompat.inset(max, max2, max3, max4);
            }
        }
        return windowInsetsCompat;
    }

    public final void updateProperties(boolean z11, boolean z12) {
        boolean z13 = (this.hasCalledSetLayout && z11 == this.usePlatformDefaultWidth && z12 == this.decorFitsSystemWindows) ? false : true;
        this.usePlatformDefaultWidth = z11;
        this.decorFitsSystemWindows = z12;
        if (z13) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i11 = z11 ? -2 : -1;
            if (i11 == attributes.width && this.hasCalledSetLayout) {
                return;
            }
            getWindow().setLayout(i11, -2);
            this.hasCalledSetLayout = true;
        }
    }

    public final void setContent(@k CompositionContext compositionContext, @k p<? super Composer, ? super Integer, g2> pVar) {
        setParentCompositionContext(compositionContext);
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }
}
