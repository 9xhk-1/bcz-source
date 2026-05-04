package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.R;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public class DrawChildContainer extends ViewGroup {
    public static final int $stable = 8;
    private boolean isDrawing;

    public DrawChildContainer(@m80.k Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@m80.k Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            kotlin.jvm.internal.g0.n(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
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

    public final void drawChild$ui_release(@m80.k androidx.compose.ui.graphics.Canvas canvas, @m80.k View view, long j11) {
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas), view, j11);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.isDrawing) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
