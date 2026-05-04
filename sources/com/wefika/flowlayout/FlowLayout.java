package com.wefika.flowlayout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TargetApi(14)
/* loaded from: classes6.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f45137a;

    /* renamed from: b, reason: collision with root package name */
    public final List<List<View>> f45138b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Integer> f45139c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Integer> f45140d;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public static boolean e() {
        return true;
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p11) {
        return super.checkLayoutParams(p11) && (p11 instanceof a);
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams p11) {
        return new a(p11);
    }

    public int getGravity() {
        return this.f45137a;
    }

    public int getLineSize() {
        List<List<View>> list = this.f45138b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        int i11;
        int i12;
        int i13;
        int i14;
        FlowLayout flowLayout = this;
        flowLayout.f45138b.clear();
        flowLayout.f45139c.clear();
        flowLayout.f45140d.clear();
        int width = flowLayout.getWidth();
        int height = flowLayout.getHeight();
        int paddingTop = flowLayout.getPaddingTop();
        ArrayList arrayList = new ArrayList();
        int i15 = flowLayout.f45137a & 7;
        float f11 = i15 != 1 ? i15 != 5 ? 0.0f : 1.0f : 0.5f;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i11 = 8;
            if (i16 >= flowLayout.getChildCount()) {
                break;
            }
            View childAt = flowLayout.getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                if (i18 + measuredWidth > width) {
                    flowLayout.f45139c.add(Integer.valueOf(i17));
                    flowLayout.f45138b.add(arrayList);
                    flowLayout.f45140d.add(Integer.valueOf(((int) ((width - i18) * f11)) + flowLayout.getPaddingLeft()));
                    paddingTop += i17;
                    arrayList = new ArrayList();
                    i17 = 0;
                    i18 = 0;
                }
                i18 += measuredWidth;
                i17 = Math.max(i17, measuredHeight);
                arrayList.add(childAt);
            }
            i16++;
        }
        flowLayout.f45139c.add(Integer.valueOf(i17));
        flowLayout.f45138b.add(arrayList);
        flowLayout.f45140d.add(Integer.valueOf(((int) ((width - i18) * f11)) + flowLayout.getPaddingLeft()));
        int i19 = paddingTop + i17;
        int i21 = flowLayout.f45137a & 112;
        int i22 = i21 != 16 ? i21 != 80 ? 0 : height - i19 : (height - i19) / 2;
        int size = flowLayout.f45138b.size();
        int paddingTop2 = flowLayout.getPaddingTop();
        int i23 = 0;
        while (i23 < size) {
            int intValue = flowLayout.f45139c.get(i23).intValue();
            List<View> list = flowLayout.f45138b.get(i23);
            int intValue2 = flowLayout.f45140d.get(i23).intValue();
            int size2 = list.size();
            int i24 = 0;
            while (i24 < size2) {
                View view = list.get(i24);
                if (view.getVisibility() == i11) {
                    i13 = size;
                } else {
                    a aVar2 = (a) view.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) aVar2).height == -1) {
                        int i25 = ((ViewGroup.MarginLayoutParams) aVar2).width;
                        if (i25 == -1) {
                            i14 = 1073741824;
                        } else if (i25 >= 0) {
                            i14 = 1073741824;
                            view.measure(View.MeasureSpec.makeMeasureSpec(i25, i14), View.MeasureSpec.makeMeasureSpec((intValue - ((ViewGroup.MarginLayoutParams) aVar2).topMargin) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin, 1073741824));
                        } else {
                            i14 = Integer.MIN_VALUE;
                        }
                        i25 = i18;
                        view.measure(View.MeasureSpec.makeMeasureSpec(i25, i14), View.MeasureSpec.makeMeasureSpec((intValue - ((ViewGroup.MarginLayoutParams) aVar2).topMargin) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin, 1073741824));
                    }
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (Gravity.isVertical(aVar2.f45141a)) {
                        int i26 = aVar2.f45141a;
                        if (i26 == 16 || i26 == 17) {
                            i12 = (((intValue - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar2).topMargin) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin) / 2;
                        } else if (i26 == 80) {
                            i12 = ((intValue - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar2).topMargin) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                        }
                        int i27 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                        i13 = size;
                        int i28 = ((ViewGroup.MarginLayoutParams) aVar2).topMargin;
                        view.layout(intValue2 + i27, paddingTop2 + i28 + i12 + i22, intValue2 + measuredWidth2 + i27, measuredHeight2 + paddingTop2 + i28 + i12 + i22);
                        intValue2 += measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                    }
                    i12 = 0;
                    int i272 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i13 = size;
                    int i282 = ((ViewGroup.MarginLayoutParams) aVar2).topMargin;
                    view.layout(intValue2 + i272, paddingTop2 + i282 + i12 + i22, intValue2 + measuredWidth2 + i272, measuredHeight2 + paddingTop2 + i282 + i12 + i22);
                    intValue2 += measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
                i24++;
                size = i13;
                i11 = 8;
            }
            paddingTop2 += intValue;
            i23++;
            flowLayout = this;
            i11 = 8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wefika.flowlayout.FlowLayout.onMeasure(int, int):void");
    }

    @TargetApi(14)
    public void setGravity(int gravity) {
        if (this.f45137a != gravity) {
            if ((8388615 & gravity) == 0) {
                gravity |= e() ? GravityCompat.START : 3;
            }
            if ((gravity & 112) == 0) {
                gravity |= 48;
            }
            this.f45137a = gravity;
            requestLayout();
        }
    }

    public FlowLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FlowLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f45137a = (e() ? GravityCompat.START : 3) | 48;
        this.f45138b = new ArrayList();
        this.f45139c = new ArrayList();
        this.f45140d = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FlowLayout, defStyle, 0);
        try {
            int i11 = obtainStyledAttributes.getInt(0, -1);
            if (i11 > 0) {
                setGravity(i11);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f45141a;

        public a(Context c11, AttributeSet attrs) {
            super(c11, attrs);
            this.f45141a = -1;
            TypedArray obtainStyledAttributes = c11.obtainStyledAttributes(attrs, R.styleable.FlowLayout_Layout);
            try {
                this.f45141a = obtainStyledAttributes.getInt(0, -1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public a(int width, int height) {
            super(width, height);
            this.f45141a = -1;
        }

        public a(ViewGroup.LayoutParams source) {
            super(source);
            this.f45141a = -1;
        }
    }
}
