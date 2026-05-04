package com.baicizhan.main.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.l;
import w00.k;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public final class ItalicTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20055a = 8;

    @k
    public ItalicTextView(@l Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth + f.a(getContext(), 2.0f), getMeasuredHeight());
        }
    }

    @k
    public ItalicTextView(@l Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @k
    public ItalicTextView(@l Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    public /* synthetic */ ItalicTextView(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
