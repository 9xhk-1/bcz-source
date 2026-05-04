package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import g10.u;
import java.lang.reflect.Method;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class UnprojectedRipple extends RippleDrawable {

    @k
    public static final Companion Companion = new Companion(null);
    private static boolean setMaxRadiusFetched;

    @l
    private static Method setMaxRadiusMethod;
    private final boolean bounded;
    private boolean projected;

    @l
    private Color rippleColor;

    @l
    private Integer rippleRadius;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static final class MRadiusHelper {

        @k
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        public final void setRadius(@k RippleDrawable rippleDrawable, int i11) {
            rippleDrawable.setRadius(i11);
        }
    }

    public UnprojectedRipple(boolean z11) {
        super(ColorStateList.valueOf(-16777216), null, z11 ? new ColorDrawable(-1) : null);
        this.bounded = z11;
    }

    /* renamed from: calculateRippleColor-5vOe2sY, reason: not valid java name */
    private final long m1883calculateRippleColor5vOe2sY(long j11, float f11) {
        if (Build.VERSION.SDK_INT < 28) {
            f11 *= 2;
        }
        return Color.m2508copywmQWz5c$default(j11, u.A(f11, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @k
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    /* renamed from: setColor-DxMtmZc, reason: not valid java name */
    public final void m1884setColorDxMtmZc(long j11, float f11) {
        long m1883calculateRippleColor5vOe2sY = m1883calculateRippleColor5vOe2sY(j11, f11);
        Color color = this.rippleColor;
        if (color == null ? false : Color.m2510equalsimpl0(color.m2519unboximpl(), m1883calculateRippleColor5vOe2sY)) {
            return;
        }
        this.rippleColor = Color.m2499boximpl(m1883calculateRippleColor5vOe2sY);
        setColor(ColorStateList.valueOf(ColorKt.m2563toArgb8_81llA(m1883calculateRippleColor5vOe2sY)));
    }

    public final void trySetRadius(int i11) {
        Integer num = this.rippleRadius;
        if (num != null && num.intValue() == i11) {
            return;
        }
        this.rippleRadius = Integer.valueOf(i11);
        MRadiusHelper.INSTANCE.setRadius(this, i11);
    }
}
