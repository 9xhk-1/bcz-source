package ee;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public int f49657a;

    /* renamed from: b, reason: collision with root package name */
    public int f49658b;

    /* renamed from: c, reason: collision with root package name */
    public int f49659c;

    public b(int itemPadding, int itemTop, int titleTop) {
        this.f49657a = itemPadding;
        this.f49658b = itemTop;
        this.f49659c = titleTop;
    }

    public final void a(Rect outRect, RecyclerView.Adapter adapter, int pos) {
        int i11 = pos;
        while (i11 >= 0 && adapter.getItemViewType(i11) != 1) {
            i11--;
        }
        outRect.top = this.f49658b;
        int i12 = ((pos - i11) - 1) % 3;
        if (i12 == 0) {
            outRect.left = 0;
            outRect.right = (this.f49657a * 2) / 3;
        } else if (i12 == 2) {
            outRect.left = (this.f49657a * 2) / 3;
            outRect.right = 0;
        } else {
            int i13 = this.f49657a;
            outRect.left = i13 / 3;
            outRect.right = i13 / 3;
        }
        if (adapter.getItemCount() - pos <= 1) {
            outRect.bottom = this.f49658b * 4;
        } else {
            outRect.bottom = 0;
        }
    }

    public final void b(Rect outRect) {
        outRect.top = this.f49659c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter.getItemViewType(childAdapterPosition) == 1) {
            b(outRect);
        } else if (adapter.getItemViewType(childAdapterPosition) == 2) {
            a(outRect, adapter, childAdapterPosition);
        }
    }
}
