package fu;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import eu.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final d f52372a;

    /* renamed from: b, reason: collision with root package name */
    public final LongSparseArray<View> f52373b = new LongSparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    public final iu.b f52374c;

    public b(d adapter, iu.b orientationProvider) {
        this.f52372a = adapter;
        this.f52374c = orientationProvider;
    }

    @Override // fu.a
    public View a(RecyclerView parent, int position) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        long c11 = this.f52372a.c(position);
        View view = this.f52373b.get(c11);
        if (view != null) {
            return view;
        }
        RecyclerView.ViewHolder a11 = this.f52372a.a(parent);
        this.f52372a.b(a11, position);
        View view2 = a11.itemView;
        if (view2.getLayoutParams() == null) {
            view2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        if (this.f52374c.a(parent) == 1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824);
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 0);
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 1073741824);
        }
        view2.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, parent.getPaddingLeft() + parent.getPaddingRight(), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, parent.getPaddingTop() + parent.getPaddingBottom(), view2.getLayoutParams().height));
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        this.f52373b.put(c11, view2);
        return view2;
    }

    @Override // fu.a
    public void invalidate() {
        this.f52373b.clear();
    }
}
