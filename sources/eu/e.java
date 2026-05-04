package eu;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public final d f50157a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<Rect> f50158b;

    /* renamed from: c, reason: collision with root package name */
    public final fu.a f50159c;

    /* renamed from: d, reason: collision with root package name */
    public final iu.b f50160d;

    /* renamed from: e, reason: collision with root package name */
    public final b f50161e;

    /* renamed from: f, reason: collision with root package name */
    public final hu.a f50162f;

    /* renamed from: g, reason: collision with root package name */
    public final gu.a f50163g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f50164h;

    public e(d adapter) {
        this(adapter, new iu.a(), new gu.a());
    }

    public int a(int x11, int y11) {
        for (int i11 = 0; i11 < this.f50158b.size(); i11++) {
            SparseArray<Rect> sparseArray = this.f50158b;
            if (sparseArray.get(sparseArray.keyAt(i11)).contains(x11, y11)) {
                return this.f50158b.keyAt(i11);
            }
        }
        return -1;
    }

    public View b(RecyclerView parent, int position) {
        return this.f50159c.a(parent, position);
    }

    public void c() {
        this.f50159c.invalidate();
    }

    public final void d(Rect itemOffsets, View header, int orientation) {
        this.f50163g.b(this.f50164h, header);
        if (orientation == 1) {
            int height = header.getHeight();
            Rect rect = this.f50164h;
            itemOffsets.top = height + rect.top + rect.bottom;
        } else {
            int width = header.getWidth();
            Rect rect2 = this.f50164h;
            itemOffsets.left = width + rect2.left + rect2.right;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && this.f50161e.d(childAdapterPosition, this.f50160d.b(parent))) {
            d(outRect, b(parent, childAdapterPosition), this.f50160d.a(parent));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        boolean e11;
        RecyclerView recyclerView;
        super.onDrawOver(canvas, parent, state);
        int childCount = parent.getChildCount();
        if (childCount <= 0 || this.f50157a.getItemCount() <= 0) {
            return;
        }
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = parent.getChildAt(i11);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && ((e11 = this.f50161e.e(childAt, this.f50160d.a(parent), childAdapterPosition)) || this.f50161e.d(childAdapterPosition, this.f50160d.b(parent)))) {
                View a11 = this.f50159c.a(parent, childAdapterPosition);
                Rect rect = this.f50158b.get(childAdapterPosition);
                if (rect == null) {
                    rect = new Rect();
                    this.f50158b.put(childAdapterPosition, rect);
                }
                recyclerView = parent;
                this.f50161e.h(rect, recyclerView, a11, childAt, e11);
                this.f50162f.a(recyclerView, canvas, a11, rect);
            } else {
                recyclerView = parent;
            }
            i11++;
            parent = recyclerView;
        }
    }

    public e(d adapter, iu.b orientationProvider, gu.a dimensionCalculator) {
        this(adapter, orientationProvider, dimensionCalculator, new hu.a(orientationProvider), new fu.b(adapter, orientationProvider));
    }

    public e(d adapter, iu.b orientationProvider, gu.a dimensionCalculator, hu.a headerRenderer, fu.a headerProvider) {
        this(adapter, headerRenderer, orientationProvider, dimensionCalculator, headerProvider, new b(adapter, headerProvider, orientationProvider, dimensionCalculator));
    }

    public e(d adapter, hu.a headerRenderer, iu.b orientationProvider, gu.a dimensionCalculator, fu.a headerProvider, b headerPositionCalculator) {
        this.f50158b = new SparseArray<>();
        this.f50164h = new Rect();
        this.f50157a = adapter;
        this.f50159c = headerProvider;
        this.f50160d = orientationProvider;
        this.f50162f = headerRenderer;
        this.f50163g = dimensionCalculator;
        this.f50161e = headerPositionCalculator;
    }
}
