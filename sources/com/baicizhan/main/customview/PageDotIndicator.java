package com.baicizhan.main.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PageDotIndicator extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final int f20092h = 8;

    /* renamed from: a, reason: collision with root package name */
    public int f20093a;

    /* renamed from: b, reason: collision with root package name */
    public int f20094b;

    /* renamed from: c, reason: collision with root package name */
    public int f20095c;

    /* renamed from: d, reason: collision with root package name */
    public int f20096d;

    /* renamed from: e, reason: collision with root package name */
    public int f20097e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public Paint f20098f;

    /* renamed from: g, reason: collision with root package name */
    public int f20099g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ViewPager2.OnPageChangeCallback {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            PageDotIndicator.this.setSelected(i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PageDotIndicator(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    public final void a(@k ViewPager2 pager) {
        g0.p(pager, "pager");
        pager.registerOnPageChangeCallback(new a());
        RecyclerView.Adapter adapter = pager.getAdapter();
        setDotCount(adapter != null ? adapter.getItemCount() : 0);
        requestLayout();
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PageDotIndicator);
        this.f20093a = obtainStyledAttributes.getDimensionPixelSize(2, KotlinExtKt.getDpPixels(4));
        this.f20094b = obtainStyledAttributes.getDimensionPixelSize(1, KotlinExtKt.getDpPixels(12));
        this.f20095c = obtainStyledAttributes.getInt(0, 0);
        this.f20097e = obtainStyledAttributes.getInt(3, KotlinExtKt.getColorInt(R.color.main_color_blue_dark));
        this.f20096d = obtainStyledAttributes.getColor(4, KotlinExtKt.getColorInt(R.color.main_color_item_press));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(@k Canvas canvas) {
        g0.p(canvas, "canvas");
        super.onDraw(canvas);
        float paddingStart = getPaddingStart() + this.f20093a;
        float measuredHeight = getMeasuredHeight() / 2;
        int i11 = this.f20095c;
        int i12 = 0;
        while (i12 < i11) {
            this.f20098f.setColor(this.f20099g == i12 ? this.f20097e : this.f20096d);
            if (canvas != null) {
                canvas.drawCircle(paddingStart, measuredHeight, this.f20093a, this.f20098f);
            }
            paddingStart += this.f20094b + (this.f20093a * 2);
            i12++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int paddingStart = getPaddingStart() + getPaddingEnd();
        int i13 = this.f20093a * 2;
        int i14 = this.f20095c;
        setMeasuredDimension(View.resolveSize(paddingStart + (i13 * i14) + ((i14 - 1) * this.f20094b), i11), View.resolveSize(getPaddingTop() + getPaddingBottom() + (this.f20093a * 2), i12));
    }

    public final void setDotCount(int i11) {
        this.f20095c = i11;
        requestLayout();
    }

    public final void setSelected(int i11) {
        this.f20099g = i11;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PageDotIndicator(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PageDotIndicator(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f20098f = new Paint(1);
        b(context, attributeSet);
    }

    public /* synthetic */ PageDotIndicator(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
