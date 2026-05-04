package rn;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.android.material.internal.d0;
import en.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @Px
    public int f84320a;

    /* renamed from: b, reason: collision with root package name */
    @Px
    public int f84321b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public int[] f84322c = new int[0];

    /* renamed from: d, reason: collision with root package name */
    @ColorInt
    public int f84323d;

    /* renamed from: e, reason: collision with root package name */
    public int f84324e;

    /* renamed from: f, reason: collision with root package name */
    public int f84325f;

    /* renamed from: g, reason: collision with root package name */
    @Px
    public int f84326g;

    public b(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray k11 = d0.k(context, attributeSet, R.styleable.BaseProgressIndicator, i11, i12, new int[0]);
        this.f84320a = sn.c.d(context, k11, R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f84321b = Math.min(sn.c.d(context, k11, R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.f84320a / 2);
        this.f84324e = k11.getInt(R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f84325f = k11.getInt(R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.f84326g = k11.getDimensionPixelSize(R.styleable.BaseProgressIndicator_indicatorTrackGapSize, 0);
        c(context, k11);
        d(context, k11);
        k11.recycle();
    }

    public boolean a() {
        return this.f84325f != 0;
    }

    public boolean b() {
        return this.f84324e != 0;
    }

    public final void c(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i11 = R.styleable.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i11)) {
            this.f84322c = new int[]{u.b(context, R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(i11).type != 1) {
            this.f84322c = new int[]{typedArray.getColor(i11, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i11, -1));
        this.f84322c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public final void d(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i11 = R.styleable.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i11)) {
            this.f84323d = typedArray.getColor(i11, -1);
            return;
        }
        this.f84323d = this.f84322c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
        float f11 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f84323d = u.a(this.f84323d, (int) (f11 * 255.0f));
    }

    @CallSuper
    public void e() {
        if (this.f84326g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
