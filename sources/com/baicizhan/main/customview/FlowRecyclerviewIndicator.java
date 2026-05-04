package com.baicizhan.main.customview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.jiongji.andriod.card.R;
import com.wefika.flowlayout.FlowLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FlowRecyclerviewIndicator extends FlowLayout {

    /* renamed from: e, reason: collision with root package name */
    public c f20033e;

    /* renamed from: f, reason: collision with root package name */
    public int f20034f;

    /* renamed from: g, reason: collision with root package name */
    public int f20035g;

    /* renamed from: h, reason: collision with root package name */
    public g f20036h;

    /* renamed from: i, reason: collision with root package name */
    public d f20037i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f20038j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f20039k;

    /* renamed from: l, reason: collision with root package name */
    public f f20040l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements d {
        public a() {
        }

        @Override // com.baicizhan.main.customview.FlowRecyclerviewIndicator.d
        public void a() {
            FlowRecyclerviewIndicator.this.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            FlowRecyclerviewIndicator.this.g(((Integer) v11.getTag()).intValue(), true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public d f20043a;

        public abstract int a();

        public abstract String b(int i11);

        public void c() {
            d dVar = this.f20043a;
            if (dVar != null) {
                dVar.a();
            }
        }

        public void d(d mListener) {
            this.f20043a = mListener;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements f {
        @Override // com.baicizhan.main.customview.FlowRecyclerviewIndicator.f
        public Drawable create(Context context) {
            GradientDrawable build = new ThemeResUtil.ShapeDrawableBuilder().with(context).setStrokeColor(0.5f, -2763307).setColor(-394757).setCorner(15).build();
            GradientDrawable build2 = new ThemeResUtil.ShapeDrawableBuilder().with(context).setStrokeColor(0.5f, context.getResources().getColor(R.color.main_color_blue_light)).setColor(422076918).setCorner(15).build();
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, build2);
            stateListDrawable.addState(new int[]{android.R.attr.state_selected, android.R.attr.state_enabled}, build2);
            stateListDrawable.addState(new int[0], build);
            return stateListDrawable;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        Drawable create(Context context);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        void a(int idx);
    }

    public FlowRecyclerviewIndicator(Context context) {
        super(context);
        this.f20037i = new a();
        this.f20038j = new b();
        this.f20039k = ColorStateList.valueOf(-1);
    }

    public void a() {
        removeAllViews();
        int a11 = this.f20033e.a();
        int a12 = xb.f.a(getContext(), 6.0f);
        int a13 = xb.f.a(getContext(), 6.0f);
        int a14 = xb.f.a(getContext(), 12.0f);
        int a15 = xb.f.a(getContext(), 4.0f);
        for (int i11 = 0; i11 < a11; i11++) {
            TextView textView = new TextView(getContext());
            FlowLayout.a aVar = new FlowLayout.a(-2, -2);
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = a12;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = a12;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = a13;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = a13;
            textView.setLayoutParams(aVar);
            textView.setPadding(a14, a15, a14, a15);
            textView.setTextSize(0, this.f20035g);
            textView.setTextColor(this.f20039k);
            f fVar = this.f20040l;
            lq.c.b(textView, fVar != null ? fVar.create(getContext()) : null);
            textView.setGravity(17);
            textView.setText(this.f20033e.b(i11));
            textView.setTag(Integer.valueOf(i11));
            textView.setOnClickListener(this.f20038j);
            addView(textView);
        }
        if (this.f20034f > a11) {
            this.f20034f = a11 - 1;
        }
        int i12 = this.f20034f;
        g(i12 > 0 ? i12 : 0, true);
        requestLayout();
    }

    public final void g(int item, boolean callback) {
        this.f20034f = item;
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            getChildAt(i11).setSelected(i11 == item);
            i11++;
        }
        g gVar = this.f20036h;
        if (gVar == null || !callback) {
            return;
        }
        gVar.a(this.f20034f);
    }

    public void setAdapter(c adapter) {
        c cVar = this.f20033e;
        if (cVar == adapter || adapter == null) {
            return;
        }
        if (cVar != null) {
            cVar.d(null);
        }
        this.f20033e = adapter;
        adapter.d(this.f20037i);
    }

    public void setCurrentItem(int item) {
        g(item, false);
    }

    public void setSelectListener(g listener) {
        this.f20036h = listener;
    }

    public void setTextBackgroundCreator(f creator) {
        this.f20040l = creator;
    }

    public void setTextColor(ColorStateList textColor) {
        this.f20039k = textColor;
    }

    public void setTextSize(int textSizePx) {
        this.f20035g = textSizePx;
    }

    public FlowRecyclerviewIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f20037i = new a();
        this.f20038j = new b();
        this.f20039k = ColorStateList.valueOf(-1);
    }

    public FlowRecyclerviewIndicator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f20037i = new a();
        this.f20038j = new b();
        this.f20039k = ColorStateList.valueOf(-1);
    }
}
