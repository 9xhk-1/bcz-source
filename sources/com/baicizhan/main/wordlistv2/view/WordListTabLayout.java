package com.baicizhan.main.wordlistv2.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.google.android.material.tabs.TabLayout;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class WordListTabLayout extends TabLayout {
    public static final int I1 = 8;

    @k
    public final Paint F1;
    public final float G1;
    public final float H1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordListTabLayout(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@k Canvas canvas) {
        TabLayout.i D;
        Canvas canvas2;
        g0.p(canvas, "canvas");
        super.dispatchDraw(canvas);
        int tabCount = getTabCount() - 1;
        int i11 = 0;
        while (i11 < tabCount) {
            TabLayout.i D2 = D(i11);
            if (D2 == null || (D = D(i11 + 1)) == null || D2.o() || D.o()) {
                canvas2 = canvas;
            } else {
                TabLayout.TabView view = D2.f32310i;
                g0.o(view, "view");
                float right = view.getRight();
                float f11 = this.H1;
                canvas2 = canvas;
                canvas2.drawLine(right, f11, right, f11 + this.G1, this.F1);
            }
            i11++;
            canvas = canvas2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordListTabLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordListTabLayout(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.color_surface_container_highest));
        paint.setStrokeWidth(KotlinExtKt.getDpFloat(1));
        this.F1 = paint;
        float dpFloat = KotlinExtKt.getDpFloat(13);
        this.G1 = dpFloat;
        this.H1 = (KotlinExtKt.getDpFloat(32) - dpFloat) / 2;
        h(new a());
    }

    public /* synthetic */ WordListTabLayout(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements TabLayout.f {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.i iVar) {
            WordListTabLayout.this.invalidate();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.i iVar) {
            WordListTabLayout.this.invalidate();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.i iVar) {
        }
    }
}
