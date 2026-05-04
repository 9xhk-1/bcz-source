package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes.dex */
final class BlendModeColorFilterHelper {

    @m80.k
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    @m80.k
    /* renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final android.graphics.BlendModeColorFilter m2455BlendModeColorFilterxETnrds(long j11, int i11) {
        t0.a();
        return s0.a(ColorKt.m2563toArgb8_81llA(j11), AndroidBlendMode_androidKt.m2360toAndroidBlendModes9anfk8(i11));
    }

    @m80.k
    public final BlendModeColorFilter createBlendModeColorFilter(@m80.k android.graphics.BlendModeColorFilter blendModeColorFilter) {
        int color;
        android.graphics.BlendMode mode;
        color = blendModeColorFilter.getColor();
        long Color = ColorKt.Color(color);
        mode = blendModeColorFilter.getMode();
        return new BlendModeColorFilter(Color, AndroidBlendMode_androidKt.toComposeBlendMode(mode), blendModeColorFilter, null);
    }
}
