package xl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c10.d;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k Context context, int i11) {
        super(context, i11);
        g0.q(context, "context");
    }

    @Override // xl.a
    public void e(@k Canvas canvas, @k RecyclerView parent) {
        int height;
        int i11;
        g0.q(canvas, "canvas");
        g0.q(parent, "parent");
        Drawable c11 = c();
        if (c11 != null) {
            canvas.save();
            if (parent.getClipToPadding()) {
                i11 = parent.getPaddingTop();
                height = parent.getHeight() - parent.getPaddingBottom();
                canvas.clipRect(parent.getPaddingLeft(), i11, parent.getWidth() - parent.getPaddingRight(), height);
            } else {
                height = parent.getHeight();
                i11 = 0;
            }
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                for (int i12 = 0; i12 < itemCount; i12++) {
                    View child = parent.getChildAt(i12);
                    int childAdapterPosition = parent.getChildAdapterPosition(child);
                    if (childAdapterPosition != -1 && childAdapterPosition != itemCount - 1) {
                        parent.getDecoratedBoundsWithMargins(child, a());
                        int i13 = a().right;
                        g0.h(child, "child");
                        int L0 = i13 + d.L0(child.getTranslationX());
                        c11.setBounds(L0 - c11.getIntrinsicWidth(), i11, L0, height);
                        c11.draw(canvas);
                    }
                }
                canvas.restore();
            }
        }
    }

    @Override // xl.a
    public void f(@k Canvas canvas, @k RecyclerView parent) {
        int width;
        int i11;
        g0.q(canvas, "canvas");
        g0.q(parent, "parent");
        Drawable c11 = c();
        if (c11 != null) {
            canvas.save();
            if (parent.getClipToPadding()) {
                i11 = parent.getPaddingLeft();
                width = parent.getWidth() - parent.getPaddingRight();
                canvas.clipRect(i11, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
            } else {
                width = parent.getWidth();
                i11 = 0;
            }
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                for (int i12 = 0; i12 < itemCount; i12++) {
                    View child = parent.getChildAt(i12);
                    int childAdapterPosition = parent.getChildAdapterPosition(child);
                    if (childAdapterPosition != -1 && childAdapterPosition != itemCount - 1) {
                        parent.getDecoratedBoundsWithMargins(child, a());
                        int i13 = a().bottom;
                        g0.h(child, "child");
                        int L0 = i13 + d.L0(child.getTranslationY());
                        c11.setBounds(i11, L0 - c11.getIntrinsicHeight(), width, L0);
                        c11.draw(canvas);
                    }
                }
                canvas.restore();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@k Rect outRect, @k View view, @k RecyclerView parent, @k RecyclerView.State state) {
        g2 g2Var;
        g0.q(outRect, "outRect");
        g0.q(view, "view");
        g0.q(parent, "parent");
        g0.q(state, "state");
        Drawable c11 = c();
        if (c11 != null) {
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                if (d() == 1) {
                    if (parent.getChildAdapterPosition(view) < itemCount - 1) {
                        outRect.set(0, 0, 0, c11.getIntrinsicHeight());
                    } else {
                        outRect.set(0, 0, 0, 0);
                    }
                } else if (parent.getChildAdapterPosition(view) < itemCount - 1) {
                    outRect.set(0, 0, c11.getIntrinsicWidth(), 0);
                } else {
                    outRect.set(0, 0, 0, 0);
                }
                g2Var = g2.f100423a;
            } else {
                g2Var = null;
            }
            if (g2Var != null) {
                return;
            }
        }
        outRect.set(0, 0, 0, 0);
        g2 g2Var2 = g2.f100423a;
    }
}
