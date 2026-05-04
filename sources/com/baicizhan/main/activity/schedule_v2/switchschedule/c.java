package com.baicizhan.main.activity.schedule_v2.switchschedule;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public int f19480a;

    /* renamed from: b, reason: collision with root package name */
    public int f19481b = 0;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = this.f19480a;
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            outRect.top = xb.f.a(parent.getContext(), 16.0f);
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        outRect.bottom = xb.f.a(parent.getContext(), 5.0f);
        if (adapter != null && childAdapterPosition == adapter.getItemCount()) {
            outRect.bottom = xb.f.a(parent.getContext(), 68.0f);
        }
        int a11 = xb.f.a(parent.getContext(), 13.0f);
        outRect.left = a11;
        outRect.right = a11;
    }
}
