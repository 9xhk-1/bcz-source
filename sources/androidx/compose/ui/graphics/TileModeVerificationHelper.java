package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
/* loaded from: classes.dex */
final class TileModeVerificationHelper {

    @m80.k
    public static final TileModeVerificationHelper INSTANCE = new TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    /* renamed from: getComposeTileModeDecal-3opZhB0, reason: not valid java name */
    public final int m2886getComposeTileModeDecal3opZhB0() {
        return TileMode.Companion.m2883getDecal3opZhB0();
    }

    @m80.k
    public final Shader.TileMode getFrameworkTileModeDecal() {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        return tileMode;
    }
}
