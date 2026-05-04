package eu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends RecyclerView.ItemDecoration {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f50136i = {R.attr.color_message_line};

    /* renamed from: j, reason: collision with root package name */
    public static final int f50137j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f50138k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f50139l = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f50140a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f50141b = 1;

    /* renamed from: c, reason: collision with root package name */
    public SparseIntArray f50142c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f50143d;

    /* renamed from: e, reason: collision with root package name */
    public int f50144e;

    /* renamed from: f, reason: collision with root package name */
    public int f50145f;

    /* renamed from: g, reason: collision with root package name */
    public int f50146g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f50147h;

    public a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f50136i);
        this.f50147h = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public final int a(int orientation) {
        Drawable drawable = this.f50147h;
        return (drawable == null || (drawable instanceof ColorDrawable)) ? this.f50141b : 1 == orientation ? drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth();
    }

    public final int b(RecyclerView parent) {
        try {
            return ((LinearLayoutManager) parent.getLayoutManager()).getOrientation();
        } catch (ClassCastException e11) {
            throw new IllegalStateException("DividerDecoration can only be used with a LinearLayoutManager.", e11);
        }
    }

    public final boolean c(int idx) {
        SparseIntArray sparseIntArray = this.f50142c;
        return (sparseIntArray == null || sparseIntArray.indexOfKey(idx) == -1) ? false : true;
    }

    public void d(Drawable divider) {
        this.f50147h = divider;
    }

    public void drawHorizontal(Canvas c11, RecyclerView parent) {
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int childCount = this.f50140a ? parent.getChildCount() - 1 : parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (!c(i11)) {
                View childAt = parent.getChildAt(i11);
                int max = Math.max(paddingLeft, childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin);
                this.f50147h.setBounds(max, this.f50144e + paddingTop, Math.min(width, a(0) + max), height - this.f50146g);
                this.f50147h.draw(c11);
            }
        }
    }

    public void drawVertical(Canvas c11, RecyclerView parent) {
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        int childCount = this.f50140a ? parent.getChildCount() - 1 : parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            int max = Math.max(paddingTop, childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin);
            this.f50147h.setBounds(this.f50143d + paddingLeft, max, width - this.f50145f, Math.min(height, a(1) + max));
            this.f50147h.draw(c11);
        }
    }

    public void e(int size) {
        this.f50141b = size;
    }

    public void f(boolean ignoreEnd) {
        this.f50140a = ignoreEnd;
    }

    public void g(int[] ignoreList) {
        if (ignoreList == null) {
            return;
        }
        this.f50142c = new SparseIntArray();
        for (int i11 : ignoreList) {
            this.f50142c.put(i11, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        if (c(parent.getChildAdapterPosition(view))) {
            return;
        }
        if (b(parent) == 1) {
            outRect.set(0, 0, 0, a(1));
        } else {
            outRect.set(0, 0, a(0), 0);
        }
    }

    public void h(int leftMargine, int topMargine, int rightMargine, int bottomMargine) {
        this.f50143d = leftMargine;
        this.f50144e = topMargine;
        this.f50145f = rightMargine;
        this.f50146g = bottomMargine;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas c11, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c11, parent, state);
        if (b(parent) == 1) {
            drawVertical(c11, parent);
        } else {
            drawHorizontal(c11, parent);
        }
    }
}
