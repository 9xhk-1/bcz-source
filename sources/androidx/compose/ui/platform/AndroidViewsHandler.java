package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nAndroidViewsHandler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n102#2,5:109\n102#2,5:114\n1855#3,2:119\n1855#3,2:121\n*S KotlinDebug\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n*L\n47#1:109,5\n50#1:114,5\n60#1:119,2\n67#1:121,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidViewsHandler extends ViewGroup {
    public static final int $stable = 8;

    @m80.k
    private final HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode;

    @m80.k
    private final HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder;

    public AndroidViewsHandler(@m80.k Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@m80.l MotionEvent motionEvent) {
        return true;
    }

    public final void drawView(@m80.k AndroidViewHolder androidViewHolder, @m80.k Canvas canvas) {
        androidViewHolder.draw(canvas);
    }

    @m80.k
    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    @m80.k
    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @m80.l
    public Void invalidateChildInParent(@m80.l int[] iArr, @m80.l Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        for (AndroidViewHolder androidViewHolder : this.holderToLayoutNode.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            InlineClassHelperKt.throwIllegalArgumentException("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i12) == 1073741824)) {
            InlineClassHelperKt.throwIllegalArgumentException("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
        Iterator<T> it = this.holderToLayoutNode.keySet().iterator();
        while (it.hasNext()) {
            ((AndroidViewHolder) it.next()).remeasure();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, false, 7, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@m80.k Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(@m80.k View view, @m80.k View view2) {
    }
}
