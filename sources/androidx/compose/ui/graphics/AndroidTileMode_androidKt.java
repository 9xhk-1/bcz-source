package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidTileMode_androidKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m2413isSupported0vamqd0(int i11) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m2878equalsimpl0(i11, TileMode.Companion.m2883getDecal3opZhB0());
    }

    @m80.k
    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m2414toAndroidTileMode0vamqd0(int i11) {
        TileMode.Companion companion = TileMode.Companion;
        return TileMode.m2878equalsimpl0(i11, companion.m2882getClamp3opZhB0()) ? Shader.TileMode.CLAMP : TileMode.m2878equalsimpl0(i11, companion.m2885getRepeated3opZhB0()) ? Shader.TileMode.REPEAT : TileMode.m2878equalsimpl0(i11, companion.m2884getMirror3opZhB0()) ? Shader.TileMode.MIRROR : TileMode.m2878equalsimpl0(i11, companion.m2883getDecal3opZhB0()) ? Build.VERSION.SDK_INT >= 31 ? TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(@m80.k Shader.TileMode tileMode) {
        Shader.TileMode tileMode2;
        int i11 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i11 == 1) {
            return TileMode.Companion.m2882getClamp3opZhB0();
        }
        if (i11 == 2) {
            return TileMode.Companion.m2884getMirror3opZhB0();
        }
        if (i11 == 3) {
            return TileMode.Companion.m2885getRepeated3opZhB0();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            tileMode2 = Shader.TileMode.DECAL;
            if (tileMode == tileMode2) {
                return TileModeVerificationHelper.INSTANCE.m2886getComposeTileModeDecal3opZhB0();
            }
        }
        return TileMode.Companion.m2882getClamp3opZhB0();
    }
}
