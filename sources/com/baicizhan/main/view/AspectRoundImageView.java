package com.baicizhan.main.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import com.makeramen.roundedimageview.RoundedImageView;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import qb.c;
import w00.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AspectRoundImageView extends RoundedImageView {
    public static final int A = 8;

    /* renamed from: z, reason: collision with root package name */
    public float f25105z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public AspectRoundImageView(@m80.k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    public final float getRatio() {
        return this.f25105z;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.f25105z <= 0.0f) {
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.rint(r3 / this.f25105z), 1073741824));
    }

    public final void setRatio(float f11) {
        if (f11 > 0.0f) {
            this.f25105z = f11;
            requestLayout();
        } else {
            c.q("AspectRoundImageView", "unsupported ration value " + f11, new Object[0]);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public AspectRoundImageView(@m80.k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public AspectRoundImageView(@m80.k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AspectRoundImageView);
        g0.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setRatio(obtainStyledAttributes.getFloat(0, 0.0f));
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ AspectRoundImageView(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
