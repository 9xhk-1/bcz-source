package vt;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.RtlMode;
import com.rd.pageindicatorview.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f94264b = 3000;

    /* renamed from: a, reason: collision with root package name */
    public wt.a f94265a;

    public a(@NonNull wt.a aVar) {
        this.f94265a = aVar;
    }

    public final AnimationType a(int i11) {
        switch (i11) {
            case 0:
                return AnimationType.NONE;
            case 1:
                return AnimationType.COLOR;
            case 2:
                return AnimationType.SCALE;
            case 3:
                return AnimationType.WORM;
            case 4:
                return AnimationType.SLIDE;
            case 5:
                return AnimationType.FILL;
            case 6:
                return AnimationType.THIN_WORM;
            case 7:
                return AnimationType.DROP;
            case 8:
                return AnimationType.SWAP;
            case 9:
                return AnimationType.SCALE_DOWN;
            default:
                return AnimationType.NONE;
        }
    }

    public final RtlMode b(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? RtlMode.Auto : RtlMode.Auto : RtlMode.Off : RtlMode.On;
    }

    public void c(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PageIndicatorView, 0, 0);
        f(obtainStyledAttributes);
        e(obtainStyledAttributes);
        d(obtainStyledAttributes);
        g(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public final void d(@NonNull TypedArray typedArray) {
        boolean z11 = typedArray.getBoolean(R.styleable.PageIndicatorView_piv_interactiveAnimation, false);
        long j11 = typedArray.getInt(R.styleable.PageIndicatorView_piv_animationDuration, tt.a.f90880d);
        if (j11 < 0) {
            j11 = 0;
        }
        AnimationType a11 = a(typedArray.getInt(R.styleable.PageIndicatorView_piv_animationType, AnimationType.NONE.ordinal()));
        RtlMode b11 = b(typedArray.getInt(R.styleable.PageIndicatorView_piv_rtl_mode, RtlMode.Off.ordinal()));
        boolean z12 = typedArray.getBoolean(R.styleable.PageIndicatorView_piv_fadeOnIdle, false);
        long j12 = typedArray.getInt(R.styleable.PageIndicatorView_piv_idleDuration, 3000);
        this.f94265a.B(j11);
        this.f94265a.K(z11);
        this.f94265a.C(a11);
        this.f94265a.T(b11);
        this.f94265a.G(z12);
        this.f94265a.J(j12);
    }

    public final void e(@NonNull TypedArray typedArray) {
        int color = typedArray.getColor(R.styleable.PageIndicatorView_piv_unselectedColor, Color.parseColor(tt.b.f90884h));
        int color2 = typedArray.getColor(R.styleable.PageIndicatorView_piv_selectedColor, Color.parseColor(tt.b.f90885i));
        this.f94265a.Z(color);
        this.f94265a.V(color2);
    }

    public final void f(@NonNull TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(R.styleable.PageIndicatorView_piv_viewPager, -1);
        boolean z11 = typedArray.getBoolean(R.styleable.PageIndicatorView_piv_autoVisibility, true);
        int i11 = 0;
        boolean z12 = typedArray.getBoolean(R.styleable.PageIndicatorView_piv_dynamicCount, false);
        int i12 = typedArray.getInt(R.styleable.PageIndicatorView_piv_count, -1);
        if (i12 == -1) {
            i12 = 3;
        }
        int i13 = typedArray.getInt(R.styleable.PageIndicatorView_piv_select, 0);
        if (i13 >= 0 && (i12 <= 0 || i13 <= i12 - 1)) {
            i11 = i13;
        }
        this.f94265a.a0(resourceId);
        this.f94265a.D(z11);
        this.f94265a.F(z12);
        this.f94265a.E(i12);
        this.f94265a.W(i11);
        this.f94265a.X(i11);
        this.f94265a.L(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r4 > 1.0f) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@androidx.annotation.NonNull android.content.res.TypedArray r8) {
        /*
            r7 = this;
            int r0 = com.rd.pageindicatorview.R.styleable.PageIndicatorView_piv_orientation
            com.rd.draw.data.Orientation r1 = com.rd.draw.data.Orientation.HORIZONTAL
            int r2 = r1.ordinal()
            int r0 = r8.getInt(r0, r2)
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            com.rd.draw.data.Orientation r1 = com.rd.draw.data.Orientation.VERTICAL
        L11:
            int r0 = com.rd.pageindicatorview.R.styleable.PageIndicatorView_piv_radius
            r2 = 6
            int r2 = au.b.a(r2)
            float r2 = (float) r2
            float r0 = r8.getDimension(r0, r2)
            int r0 = (int) r0
            r2 = 0
            if (r0 >= 0) goto L22
            r0 = r2
        L22:
            int r3 = com.rd.pageindicatorview.R.styleable.PageIndicatorView_piv_padding
            r4 = 8
            int r4 = au.b.a(r4)
            float r4 = (float) r4
            float r3 = r8.getDimension(r3, r4)
            int r3 = (int) r3
            if (r3 >= 0) goto L33
            r3 = r2
        L33:
            int r4 = com.rd.pageindicatorview.R.styleable.PageIndicatorView_piv_scaleFactor
            r5 = 1060320051(0x3f333333, float:0.7)
            float r4 = r8.getFloat(r4, r5)
            r5 = 1050253722(0x3e99999a, float:0.3)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L45
        L43:
            r4 = r5
            goto L4c
        L45:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L4c
            goto L43
        L4c:
            int r5 = com.rd.pageindicatorview.R.styleable.PageIndicatorView_piv_strokeWidth
            r6 = 1
            int r6 = au.b.a(r6)
            float r6 = (float) r6
            float r8 = r8.getDimension(r5, r6)
            int r8 = (int) r8
            if (r8 <= r0) goto L5c
            r8 = r0
        L5c:
            wt.a r5 = r7.f94265a
            com.rd.animation.type.AnimationType r5 = r5.b()
            com.rd.animation.type.AnimationType r6 = com.rd.animation.type.AnimationType.FILL
            if (r5 == r6) goto L67
            goto L68
        L67:
            r2 = r8
        L68:
            wt.a r8 = r7.f94265a
            r8.S(r0)
            wt.a r8 = r7.f94265a
            r8.M(r1)
            wt.a r8 = r7.f94265a
            r8.N(r3)
            wt.a r8 = r7.f94265a
            r8.U(r4)
            wt.a r8 = r7.f94265a
            r8.Y(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.a.g(android.content.res.TypedArray):void");
    }
}
