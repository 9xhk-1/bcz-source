package com.baicizhan.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AspectFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f25102a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f25103b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final float f25104c = 1.29f;

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
    public AspectFrameLayout(@k Context context) {
        this(context, null, 0, 0, 14, null);
        g0.p(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.rint(r3 / 1.29f), 1073741824));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public AspectFrameLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public AspectFrameLayout(@k Context context, @l AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public AspectFrameLayout(@k Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        g0.p(context, "context");
    }

    public /* synthetic */ AspectFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
