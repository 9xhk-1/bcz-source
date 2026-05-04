package vj;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class e extends RecyclerView.ItemDecoration {

    /* renamed from: c, reason: collision with root package name */
    public static final int f93979c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Pair<Integer, ? extends RecyclerView.ViewHolder> f93980a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Paint f93981b;

    public e() {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FAF8FF"));
        this.f93981b = paint;
    }

    public final void a() {
        this.f93980a = null;
    }

    public final void b(Canvas canvas, View view, int i11) {
        canvas.save();
        canvas.translate(0.0f, i11);
        canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), this.f93981b);
        view.draw(canvas);
        canvas.restore();
    }

    public final View c(RecyclerView recyclerView, int i11) {
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            Rect rect = new Rect();
            recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
            if (rect.bottom > i11 && rect.top <= i11) {
                return childAt;
            }
        }
        return null;
    }

    public final View d(int i11, RecyclerView recyclerView) {
        RecyclerView.ViewHolder second;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        p pVar = adapter instanceof p ? (p) adapter : null;
        if (pVar == null) {
            return null;
        }
        while (i11 >= 0 && !pVar.p(i11)) {
            i11--;
        }
        if (i11 < 0) {
            return null;
        }
        Pair<Integer, ? extends RecyclerView.ViewHolder> pair = this.f93980a;
        if (pair != null && pair.getFirst().intValue() == i11) {
            Pair<Integer, ? extends RecyclerView.ViewHolder> pair2 = this.f93980a;
            if (pair2 == null || (second = pair2.getSecond()) == null) {
                return null;
            }
            return second.itemView;
        }
        RecyclerView.ViewHolder createViewHolder = pVar.createViewHolder(recyclerView, pVar.getItemViewType(i11));
        g0.o(createViewHolder, "createViewHolder(...)");
        pVar.bindViewHolder(createViewHolder, i11);
        createViewHolder.itemView.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), createViewHolder.itemView.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), createViewHolder.itemView.getLayoutParams().height));
        View view = createViewHolder.itemView;
        view.layout(0, 0, view.getMeasuredWidth(), createViewHolder.itemView.getMeasuredHeight());
        this.f93980a = h1.a(Integer.valueOf(i11), createViewHolder);
        return createViewHolder.itemView;
    }

    public final boolean e(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return false;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        p pVar = adapter instanceof p ? (p) adapter : null;
        return pVar != null && pVar.p(childAdapterPosition);
    }

    public final void f(Canvas canvas, View view, View view2, int i11) {
        canvas.save();
        canvas.translate(0.0f, view2.getTop() - view.getHeight());
        canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), this.f93981b);
        view.draw(canvas);
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@m80.k Canvas c11, @m80.k RecyclerView parent, @m80.k RecyclerView.State state) {
        int childAdapterPosition;
        View d11;
        View c12;
        g0.p(c11, "c");
        g0.p(parent, "parent");
        g0.p(state, "state");
        super.onDrawOver(c11, parent, state);
        View childAt = parent.getChildAt(0);
        if (childAt == null || (childAdapterPosition = parent.getChildAdapterPosition(childAt)) == -1 || (d11 = d(childAdapterPosition, parent)) == null || (c12 = c(parent, d11.getBottom() + parent.getPaddingTop())) == null) {
            return;
        }
        if (e(parent, c12)) {
            f(c11, d11, c12, parent.getPaddingTop());
        } else {
            b(c11, d11, parent.getPaddingTop());
        }
    }
}
