package com.baicizhan.main.wordlistv2.sidebar;

import a00.h0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nIndexSideBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexSideBar.kt\ncom/baicizhan/main/wordlistv2/sidebar/IndexSideBar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1878#2,3:159\n*S KotlinDebug\n*F\n+ 1 IndexSideBar.kt\ncom/baicizhan/main/wordlistv2/sidebar/IndexSideBar\n*L\n120#1:159,3\n*E\n"})
/* loaded from: classes5.dex */
public final class IndexSideBar extends View {

    /* renamed from: j, reason: collision with root package name */
    public static final int f28055j = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public List<String> f28056a;

    /* renamed from: b, reason: collision with root package name */
    public int f28057b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public x00.l<? super String, g2> f28058c;

    /* renamed from: d, reason: collision with root package name */
    public float f28059d;

    /* renamed from: e, reason: collision with root package name */
    public int f28060e;

    /* renamed from: f, reason: collision with root package name */
    public float f28061f;

    /* renamed from: g, reason: collision with root package name */
    public float f28062g;

    /* renamed from: h, reason: collision with root package name */
    public float f28063h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Paint f28064i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public IndexSideBar(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    private final float getIndexHeight() {
        Paint.FontMetrics fontMetrics = this.f28064i.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }

    public final float a(float f11) {
        return f11 * getContext().getResources().getDisplayMetrics().density;
    }

    public final int b(int i11) {
        return (int) (i11 * getContext().getResources().getDisplayMetrics().density);
    }

    public final void c() {
        Float valueOf;
        Iterator<T> it = this.f28056a.iterator();
        if (it.hasNext()) {
            float measureText = this.f28064i.measureText((String) it.next());
            while (it.hasNext()) {
                measureText = Math.max(measureText, this.f28064i.measureText((String) it.next()));
            }
            valueOf = Float.valueOf(measureText);
        } else {
            valueOf = null;
        }
        this.f28061f = valueOf != null ? valueOf.floatValue() : 0.0f;
    }

    @Override // android.view.View
    public void onDraw(@k Canvas canvas) {
        g0.p(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f28056a.isEmpty()) {
            return;
        }
        float indexHeight = getIndexHeight();
        float f11 = 2;
        float paddingTop = getPaddingTop() + this.f28062g + (indexHeight / f11);
        float paddingLeft = getPaddingLeft() + this.f28063h + (this.f28061f / f11);
        int i11 = 0;
        for (Object obj : this.f28056a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            canvas.drawText((String) obj, paddingLeft, (i11 * indexHeight) + paddingTop + (this.f28064i.getTextSize() / 3), this.f28064i);
            i11 = i12;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        float f11 = this.f28061f;
        int paddingLeft = (int) (getPaddingLeft() + f11 + getPaddingRight());
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            size = u.B(paddingLeft, size);
        } else if (mode != 1073741824) {
            size = paddingLeft;
        }
        this.f28063h = size > paddingLeft ? (((size - f11) - getPaddingLeft()) - getPaddingRight()) / 2 : 0.0f;
        float indexHeight = getIndexHeight() * this.f28056a.size();
        int paddingTop = (int) (getPaddingTop() + indexHeight + getPaddingBottom());
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = u.B(paddingTop, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        this.f28062g = size2 > paddingTop ? (((size2 - indexHeight) - getPaddingTop()) - getPaddingBottom()) / 2 : 0.0f;
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@k MotionEvent event) {
        g0.p(event, "event");
        float x11 = (event.getX() - getPaddingLeft()) - this.f28063h;
        if (x11 < 0.0f || x11 > this.f28061f) {
            return false;
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(event);
                    }
                }
            }
            this.f28057b = -1;
            return true;
        }
        int I = u.I((int) (((event.getY() - getPaddingTop()) - this.f28062g) / getIndexHeight()), 0, this.f28056a.size() - 1);
        if (I != this.f28057b) {
            this.f28057b = I;
            x00.l<? super String, g2> lVar = this.f28058c;
            if (lVar != null) {
                lVar.invoke(this.f28056a.get(I));
            }
        }
        return true;
    }

    public final void setIndexList(@k List<String> list) {
        g0.p(list, "list");
        this.f28056a = list;
        c();
        requestLayout();
        invalidate();
    }

    public final void setOnIndexChangeListener(@k x00.l<? super String, g2> listener) {
        g0.p(listener, "listener");
        this.f28058c = listener;
    }

    public final void setTextColor(int i11) {
        this.f28060e = i11;
        this.f28064i.setColor(i11);
        invalidate();
    }

    public final void setTextSize(float f11) {
        this.f28059d = f11;
        this.f28064i.setTextSize(f11);
        c();
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public IndexSideBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public IndexSideBar(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f28056a = h0.J();
        this.f28057b = -1;
        this.f28059d = a(12.0f);
        this.f28060e = -7829368;
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(this.f28060e);
        paint.setTextSize(this.f28059d);
        this.f28064i = paint;
    }

    public /* synthetic */ IndexSideBar(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
