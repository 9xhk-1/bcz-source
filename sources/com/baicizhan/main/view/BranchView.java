package com.baicizhan.main.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import qb.c;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class BranchView extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f25106g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f25107h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final float f25108i = 20.0f;

    /* renamed from: j, reason: collision with root package name */
    public static final float f25109j = 3.0f;

    /* renamed from: k, reason: collision with root package name */
    public static final float f25110k = 6.0f;

    /* renamed from: l, reason: collision with root package name */
    public static final float f25111l = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final String f25112m = "BranchView";

    /* renamed from: a, reason: collision with root package name */
    public final int f25113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25115c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f25116d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Paint f25117e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Picture f25118f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public BranchView(@k Context context) {
        this(context, null, 0, 0, 14, null);
        g0.p(context, "context");
    }

    public static final void b(Canvas canvas, float f11, Ref.FloatRef floatRef, BranchView branchView, float f12, float f13) {
        canvas.drawLine(f11, floatRef.element, f11, f13 - branchView.f25115c, branchView.f25117e);
        canvas.drawArc(new RectF(f11, f13 - (branchView.f25115c * 2), f12, f13), 90.0f, 90.0f, false, branchView.f25117e);
        floatRef.element = f13 - branchView.f25115c;
    }

    public final void a() {
        float f11;
        if (getChildCount() < 1) {
            c.b(f25112m, "no children, no drawing", new Object[0]);
            return;
        }
        Canvas beginRecording = this.f25118f.beginRecording(getMeasuredWidth(), getMeasuredHeight());
        g0.o(beginRecording, "beginRecording(...)");
        View childAt = getChildAt(0);
        float paddingLeft = (getPaddingLeft() - this.f25113a) + this.f25114b;
        Ref.FloatRef floatRef = new Ref.FloatRef();
        float paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2.0f);
        floatRef.element = paddingTop;
        beginRecording.drawCircle(paddingLeft, paddingTop, this.f25114b, this.f25116d);
        float f12 = (this.f25115c * 2) + paddingLeft;
        if (getChildCount() > 1) {
            float paddingTop2 = ((getPaddingTop() + childAt.getMeasuredHeight()) + (getChildAt(1).getMeasuredHeight() / 2.0f)) - this.f25115c;
            beginRecording.drawLine(paddingLeft, floatRef.element + this.f25114b, paddingLeft, paddingTop2, this.f25117e);
            f11 = paddingLeft;
            int i11 = this.f25115c;
            beginRecording.drawArc(new RectF(f11, paddingTop2 - i11, f12, i11 + paddingTop2), 90.0f, 90.0f, false, this.f25117e);
            floatRef.element = paddingTop2;
        } else {
            f11 = paddingLeft;
        }
        if (getChildCount() <= 2) {
            this.f25118f.endRecording();
            return;
        }
        int childCount = getChildCount();
        for (int i12 = 2; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g0.o(childAt2, "getChildAt(...)");
            b(beginRecording, f11, floatRef, this, f12, childAt2.getY() + (childAt2.getMeasuredHeight() / 2.0f));
        }
        this.f25118f.endRecording();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@k Canvas canvas) {
        g0.p(canvas, "canvas");
        super.dispatchDraw(canvas);
        canvas.drawPicture(this.f25118f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public BranchView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public BranchView(@k Context context, @l AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public BranchView(@k Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        g0.p(context, "context");
        setOrientation(1);
        int a11 = f.a(context, 20.0f);
        this.f25113a = a11;
        this.f25114b = f.a(context, 3.0f);
        this.f25115c = f.a(context, 6.0f);
        setPadding(a11 + getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f.a(context, 3.0f));
        paint.setColor(getResources().getColor(R.color.main_color_blue_dark));
        paint.setStyle(Paint.Style.FILL);
        this.f25116d = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(f.a(context, 0.5f));
        paint2.setColor(getResources().getColor(R.color.main_color_word_b8));
        paint2.setStyle(Paint.Style.STROKE);
        this.f25117e = paint2;
        this.f25118f = new Picture();
        setLayerType(1, null);
    }

    public /* synthetic */ BranchView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
