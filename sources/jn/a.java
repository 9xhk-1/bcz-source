package jn;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.m0;
import sn.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends RecyclerView.ItemDecoration {

    /* renamed from: i, reason: collision with root package name */
    public static final int f64439i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f64440j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f64441k = R.style.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public Drawable f64442a;

    /* renamed from: b, reason: collision with root package name */
    public int f64443b;

    /* renamed from: c, reason: collision with root package name */
    @ColorInt
    public int f64444c;

    /* renamed from: d, reason: collision with root package name */
    public int f64445d;

    /* renamed from: e, reason: collision with root package name */
    public int f64446e;

    /* renamed from: f, reason: collision with root package name */
    public int f64447f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f64448g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f64449h;

    public a(@NonNull Context context, int i11) {
        this(context, null, i11);
    }

    public final void a(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int height;
        int i11;
        int i12;
        int i13;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i11, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i11 = 0;
        }
        int i14 = i11 + this.f64446e;
        int i15 = height - this.f64447f;
        boolean s11 = m0.s(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = recyclerView.getChildAt(i16);
            if (s(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f64449h);
                int round = Math.round(childAt.getTranslationX());
                if (s11) {
                    i13 = this.f64449h.left + round;
                    i12 = this.f64443b + i13;
                } else {
                    i12 = round + this.f64449h.right;
                    i13 = i12 - this.f64443b;
                }
                this.f64442a.setBounds(i13, i14, i12, i15);
                this.f64442a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f64442a.draw(canvas);
            }
        }
        canvas.restore();
    }

    public final void b(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int width;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i11, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i11 = 0;
        }
        boolean s11 = m0.s(recyclerView);
        int i12 = i11 + (s11 ? this.f64447f : this.f64446e);
        int i13 = width - (s11 ? this.f64446e : this.f64447f);
        int childCount = recyclerView.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = recyclerView.getChildAt(i14);
            if (s(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f64449h);
                int round = this.f64449h.bottom + Math.round(childAt.getTranslationY());
                this.f64442a.setBounds(i12, round - this.f64443b, i13, round);
                this.f64442a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f64442a.draw(canvas);
            }
        }
        canvas.restore();
    }

    @ColorInt
    public int c() {
        return this.f64444c;
    }

    @Px
    public int d() {
        return this.f64447f;
    }

    @Px
    public int e() {
        return this.f64446e;
    }

    @Px
    public int f() {
        return this.f64443b;
    }

    public int g() {
        return this.f64445d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (s(recyclerView, view)) {
            if (this.f64445d == 1) {
                rect.bottom = this.f64443b;
            } else if (m0.s(recyclerView)) {
                rect.left = this.f64443b;
            } else {
                rect.right = this.f64443b;
            }
        }
    }

    public boolean h() {
        return this.f64448g;
    }

    public void i(@ColorInt int i11) {
        this.f64444c = i11;
        Drawable wrap = DrawableCompat.wrap(this.f64442a);
        this.f64442a = wrap;
        DrawableCompat.setTint(wrap, i11);
    }

    public void j(@NonNull Context context, @ColorRes int i11) {
        i(ContextCompat.getColor(context, i11));
    }

    public void k(@Px int i11) {
        this.f64447f = i11;
    }

    public void l(@NonNull Context context, @DimenRes int i11) {
        k(context.getResources().getDimensionPixelOffset(i11));
    }

    public void m(@Px int i11) {
        this.f64446e = i11;
    }

    public void n(@NonNull Context context, @DimenRes int i11) {
        m(context.getResources().getDimensionPixelOffset(i11));
    }

    public void o(@Px int i11) {
        this.f64443b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f64445d == 1) {
            b(canvas, recyclerView);
        } else {
            a(canvas, recyclerView);
        }
    }

    public void p(@NonNull Context context, @DimenRes int i11) {
        o(context.getResources().getDimensionPixelSize(i11));
    }

    public void q(boolean z11) {
        this.f64448g = z11;
    }

    public boolean r(int i11, @Nullable RecyclerView.Adapter<?> adapter) {
        return true;
    }

    public final boolean s(@NonNull RecyclerView recyclerView, @NonNull View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.f64448g) && r(childAdapterPosition, adapter);
    }

    public void setOrientation(int i11) {
        if (i11 == 0 || i11 == 1) {
            this.f64445d = i11;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i11 + ". It should be either HORIZONTAL or VERTICAL");
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, R.attr.materialDividerStyle, i11);
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        this.f64449h = new Rect();
        TypedArray k11 = d0.k(context, attributeSet, R.styleable.MaterialDivider, i11, f64441k, new int[0]);
        this.f64444c = c.a(context, k11, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.f64443b = k11.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f64446e = k11.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f64447f = k11.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.f64448g = k11.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        k11.recycle();
        this.f64442a = new ShapeDrawable();
        i(this.f64444c);
        setOrientation(i12);
    }
}
