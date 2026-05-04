package androidx.compose.ui.graphics.layer.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.R;
import androidx.compose.ui.graphics.layer.ViewLayer;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DrawChildContainer extends ViewGroup {
    private boolean isDrawing;

    public DrawChildContainer(@k Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@k Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            g0.n(childAt, "null cannot be cast to non-null type androidx.compose.ui.graphics.layer.ViewLayer");
            if (((ViewLayer) childAt).isInvalidated()) {
                this.isDrawing = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.isDrawing = false;
                }
            }
        }
    }

    public final void drawChild$ui_graphics_release(@k androidx.compose.ui.graphics.Canvas canvas, @k View view, long j11) {
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas), view, j11);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.isDrawing) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @l
    public ViewParent invalidateChildInParent(@l int[] iArr, @l Rect rect) {
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
