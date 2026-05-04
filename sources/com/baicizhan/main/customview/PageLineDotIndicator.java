package com.baicizhan.main.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
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
public final class PageLineDotIndicator extends View {

    /* renamed from: i, reason: collision with root package name */
    public static final int f20101i = 8;

    /* renamed from: a, reason: collision with root package name */
    public int f20102a;

    /* renamed from: b, reason: collision with root package name */
    public int f20103b;

    /* renamed from: c, reason: collision with root package name */
    public int f20104c;

    /* renamed from: d, reason: collision with root package name */
    public int f20105d;

    /* renamed from: e, reason: collision with root package name */
    public int f20106e;

    /* renamed from: f, reason: collision with root package name */
    public int f20107f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public Paint f20108g;

    /* renamed from: h, reason: collision with root package name */
    public int f20109h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ViewPager2.OnPageChangeCallback {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            PageLineDotIndicator.this.setSelected(i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PageLineDotIndicator(@k Context context) {
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
        this.f20102a = obtainStyledAttributes.getDimensionPixelSize(2, KotlinExtKt.getDpPixels(4));
        this.f20103b = obtainStyledAttributes.getDimensionPixelSize(5, KotlinExtKt.getDpPixels(20));
        this.f20104c = obtainStyledAttributes.getDimensionPixelSize(1, KotlinExtKt.getDpPixels(8));
        this.f20105d = obtainStyledAttributes.getInt(0, 0);
        this.f20107f = obtainStyledAttributes.getInt(3, KotlinExtKt.getColorInt(R.color.main_color_blue_dark));
        this.f20106e = obtainStyledAttributes.getColor(4, KotlinExtKt.getColorInt(R.color.main_color_item_press));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(@k Canvas canvas) {
        int i11;
        int i12;
        g0.p(canvas, "canvas");
        super.onDraw(canvas);
        float paddingStart = getPaddingStart() + this.f20102a;
        float measuredHeight = getMeasuredHeight() / 2;
        int i13 = this.f20105d;
        int i14 = 0;
        while (i14 < i13) {
            this.f20108g.setColor(this.f20109h == i14 ? this.f20107f : this.f20106e);
            if (this.f20109h == i14) {
                int i15 = this.f20102a;
                float f11 = paddingStart - i15;
                float f12 = measuredHeight - i15;
                RectF rectF = new RectF(f11, f12, this.f20103b + f11, (i15 * 2) + f12);
                int i16 = this.f20102a;
                canvas.drawRoundRect(rectF, i16, i16, this.f20108g);
                i11 = this.f20104c;
                i12 = this.f20103b;
            } else {
                canvas.drawCircle(paddingStart, measuredHeight, this.f20102a, this.f20108g);
                i11 = this.f20104c;
                i12 = this.f20102a * 2;
            }
            paddingStart += i11 + i12;
            i14++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int paddingStart = getPaddingStart() + getPaddingEnd();
        int i13 = this.f20102a * 2;
        int i14 = this.f20105d;
        setMeasuredDimension(View.resolveSize(paddingStart + (i13 * (i14 - 1)) + this.f20103b + ((i14 - 1) * this.f20104c), i11), View.resolveSize(getPaddingTop() + getPaddingBottom() + (this.f20102a * 2), i12));
    }

    public final void setDotCount(int i11) {
        this.f20105d = i11;
        requestLayout();
    }

    public final void setSelected(int i11) {
        this.f20109h = i11;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PageLineDotIndicator(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public PageLineDotIndicator(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f20108g = new Paint(1);
        b(context, attributeSet);
    }

    public /* synthetic */ PageLineDotIndicator(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
