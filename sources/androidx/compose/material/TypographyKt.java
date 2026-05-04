package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.LineHeightStyle;
import com.badlogic.gdx.math.n;
import kotlin.jvm.internal.v;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TypographyKt {

    @k
    private static final LineHeightStyle DefaultLineHeightStyle;

    @k
    private static final TextStyle DefaultTextStyle;

    @k
    private static final ProvidableCompositionLocal<Typography> LocalTypography;

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m4945getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m4969getNoneEVpEnUU(), (v) null);
        DefaultLineHeightStyle = lineHeightStyle;
        DefaultTextStyle = TextStyle.m4572copyp1EtxEg$default(TextStyle.Companion.getDefault(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), lineHeightStyle, 0, 0, null, 15204351, null);
        LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new a<Typography>() { // from class: androidx.compose.material.TypographyKt$LocalTypography$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Typography invoke() {
                return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, n.f12683h, null);
            }
        });
    }

    @k
    public static final LineHeightStyle getDefaultLineHeightStyle() {
        return DefaultLineHeightStyle;
    }

    @k
    public static final TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }

    @k
    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        return textStyle.getFontFamily() != null ? textStyle : TextStyle.m4572copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, fontFamily, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
    }
}
