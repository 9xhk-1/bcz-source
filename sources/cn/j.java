package cn;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface j {
    @NonNull
    RectF getMaskRectF();

    @FloatRange(from = 0.0d, to = 1.0d)
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@NonNull RectF rectF);

    @Deprecated
    void setMaskXPercentage(@FloatRange(from = 0.0d, to = 1.0d) float f11);

    void setOnMaskChangedListener(@Nullable n nVar);
}
