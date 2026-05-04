package gn;

import androidx.compose.material.Typography;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final TextStyle f53974a = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0, (TextIndent) null, 262143, (v) null);

    @k
    public static final Typography a(@k Typography typography, @k TextStyle h12, @k TextStyle h22, @k TextStyle h32, @k TextStyle h42, @k TextStyle h52, @k TextStyle h62, @k TextStyle subtitle1, @k TextStyle subtitle2, @k TextStyle body1, @k TextStyle body2, @k TextStyle button, @k TextStyle caption, @k TextStyle overline) {
        g0.p(typography, "<this>");
        g0.p(h12, "h1");
        g0.p(h22, "h2");
        g0.p(h32, "h3");
        g0.p(h42, "h4");
        g0.p(h52, "h5");
        g0.p(h62, "h6");
        g0.p(subtitle1, "subtitle1");
        g0.p(subtitle2, "subtitle2");
        g0.p(body1, "body1");
        g0.p(body2, "body2");
        g0.p(button, "button");
        g0.p(caption, "caption");
        g0.p(overline, "overline");
        return typography.copy(typography.getH1().merge(h12), typography.getH2().merge(h22), typography.getH3().merge(h32), typography.getH4().merge(h42), typography.getH5().merge(h52), typography.getH6().merge(h62), typography.getSubtitle1().merge(subtitle1), typography.getSubtitle2().merge(subtitle2), typography.getBody1().merge(body1), typography.getBody2().merge(body2), typography.getButton().merge(button), typography.getCaption().merge(caption), typography.getOverline().merge(overline));
    }

    public static /* synthetic */ Typography b(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textStyle = f53974a;
        }
        if ((i11 & 2) != 0) {
            textStyle2 = f53974a;
        }
        return a(typography, textStyle, textStyle2, (i11 & 4) != 0 ? f53974a : textStyle3, (i11 & 8) != 0 ? f53974a : textStyle4, (i11 & 16) != 0 ? f53974a : textStyle5, (i11 & 32) != 0 ? f53974a : textStyle6, (i11 & 64) != 0 ? f53974a : textStyle7, (i11 & 128) != 0 ? f53974a : textStyle8, (i11 & 256) != 0 ? f53974a : textStyle9, (i11 & 512) != 0 ? f53974a : textStyle10, (i11 & 1024) != 0 ? f53974a : textStyle11, (i11 & 2048) != 0 ? f53974a : textStyle12, (i11 & 4096) != 0 ? f53974a : textStyle13);
    }
}
