package bk;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.Shapes;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/baicizhan/platform/base/theme/ThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,224:1\n75#2:225\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/baicizhan/platform/base/theme/ThemeKt\n*L\n180#1:225\n*E\n"})
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Colors f6917a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final FontFamily f6918b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final FontFamily f6919c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Typography f6920d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Typography f6921e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final Shapes f6922f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final Colors f6923g;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Colors m1592copypvPzIIM;
        Colors m1622lightColors2qZNXz8$default = ColorsKt.m1622lightColors2qZNXz8$default(b.t(), b.u(), b.v(), b.w(), b.n(), Color.Companion.m2546getWhite0d7_KjU(), b.o(), b.r(), b.s(), b.q(), b.z(), 0L, 2048, null);
        f6917a = m1622lightColors2qZNXz8$default;
        FontWeight.Companion companion = FontWeight.Companion;
        f6918b = FontFamilyKt.FontFamily(FontKt.m4651FontYpTlLL0$default(R.font.noto_sans_sc_regular, companion.getNormal(), 0, 0, 12, null), FontKt.m4651FontYpTlLL0$default(R.font.noto_sans_sc_medium, companion.getMedium(), 0, 0, 12, null), FontKt.m4651FontYpTlLL0$default(R.font.noto_sans_sc_semi_bold, companion.getSemiBold(), 0, 0, 12, null), FontKt.m4651FontYpTlLL0$default(R.font.noto_sans_sc_bold, companion.getBold(), 0, 0, 12, null));
        f6919c = FontFamilyKt.FontFamily(FontKt.m4651FontYpTlLL0$default(R.font.lilita_one_regular, companion.getNormal(), 0, 0, 12, null));
        int i11 = 16777208;
        v vVar = null;
        FontStyle fontStyle = null;
        long j11 = 0;
        BaselineShift baselineShift = null;
        long j12 = 0;
        TextDecoration textDecoration = null;
        int i12 = 0;
        int i13 = 0;
        long j13 = 0;
        TextIndent textIndent = null;
        int i14 = 0;
        int i15 = 0;
        TextMotion textMotion = null;
        TextStyle textStyle = new TextStyle(b.q(), d.p(), companion.getMedium(), fontStyle, (FontSynthesis) null, (FontFamily) null, (String) null, j11, baselineShift, (TextGeometricTransform) null, (LocaleList) null, j12, textDecoration, (Shadow) null, (DrawStyle) null, i12, i13, j13, textIndent, (PlatformTextStyle) null, (LineHeightStyle) null, i14, i15, textMotion, i11, vVar);
        TextStyle textStyle2 = new TextStyle(b.q(), d.o(), companion.getBold(), fontStyle, (FontSynthesis) (0 == true ? 1 : 0), (FontFamily) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), j11, baselineShift, (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) (0 == true ? 1 : 0), j12, textDecoration, (Shadow) (0 == true ? 1 : 0), (DrawStyle) (0 == true ? 1 : 0), i12, i13, j13, textIndent, (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) (0 == true ? 1 : 0), i14, i15, textMotion, i11, vVar);
        int i16 = 0;
        int i17 = 0;
        TextStyle textStyle3 = new TextStyle(b.q(), d.m(), companion.getMedium(), (FontStyle) (0 == true ? 1 : 0), (FontSynthesis) (0 == true ? 1 : 0), (FontFamily) (0 == true ? 1 : 0), (String) null, 0L, (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) null, 0L, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (DrawStyle) null, i13, i16, 0L, (TextIndent) (0 == true ? 1 : 0), (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) null, i15, i17, (TextMotion) null, 16777208, (v) null);
        FontWeight normal = companion.getNormal();
        int i18 = 0;
        int i19 = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        TextStyle textStyle4 = new TextStyle(b.D(), d.m(), normal, (FontStyle) objArr, (FontSynthesis) objArr2, (FontFamily) (0 == true ? 1 : 0), (String) null, 0L, (BaselineShift) objArr3, (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) null, 0L, (TextDecoration) objArr4, (Shadow) (0 == true ? 1 : 0), (DrawStyle) null, i16, i18, 0L, (TextIndent) objArr5, (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) null, i17, i19, (TextMotion) null, 16777208, (v) null);
        FontWeight medium = companion.getMedium();
        int i21 = 16777208;
        v vVar2 = null;
        long j14 = 0;
        long j15 = 0;
        DrawStyle drawStyle = null;
        int i22 = 0;
        long j16 = 0;
        int i23 = 0;
        TextStyle textStyle5 = new TextStyle(b.D(), d.l(), medium, (FontStyle) (0 == true ? 1 : 0), (FontSynthesis) (0 == true ? 1 : 0), (FontFamily) (0 == true ? 1 : 0), (String) null, j14, (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) null, j15, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), drawStyle, i18, i22, j16, (TextIndent) (0 == true ? 1 : 0), (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) null, i19, i23, (TextMotion) null, i21, vVar2);
        FontWeight normal2 = companion.getNormal();
        long l11 = d.l();
        TextStyle textStyle6 = new TextStyle(b.q(), l11, normal2, (FontStyle) (0 == true ? 1 : 0), (FontSynthesis) (0 == true ? 1 : 0), (FontFamily) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), j14, (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) (0 == true ? 1 : 0), j15, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), drawStyle, i18, i22, j16, (TextIndent) (0 == true ? 1 : 0), (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) (0 == true ? 1 : 0), i19, i23, (TextMotion) (0 == true ? 1 : 0), i21, vVar2);
        FontWeight medium2 = companion.getMedium();
        long m11 = d.m();
        TextStyle textStyle7 = new TextStyle(b.q(), m11, medium2, (FontStyle) (0 == true ? 1 : 0), (FontSynthesis) (0 == true ? 1 : 0), (FontFamily) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), j14, (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) (0 == true ? 1 : 0), j15, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), drawStyle, i18, i22, j16, (TextIndent) (0 == true ? 1 : 0), (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) (0 == true ? 1 : 0), i19, i23, (TextMotion) (0 == true ? 1 : 0), i21, vVar2);
        FontWeight medium3 = companion.getMedium();
        long m12 = d.m();
        FontFamily fontFamily = null;
        TextStyle textStyle8 = null;
        TextStyle textStyle9 = null;
        TextStyle textStyle10 = null;
        TextStyle textStyle11 = null;
        TextStyle textStyle12 = null;
        f6920d = new Typography(fontFamily, textStyle8, textStyle9, textStyle, textStyle2, textStyle10, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, new TextStyle(b.r(), m12, medium3, (FontStyle) (0 == true ? 1 : 0), (FontSynthesis) (0 == true ? 1 : 0), (FontFamily) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), j14, (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) (0 == true ? 1 : 0), j15, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), drawStyle, i18, i22, j16, (TextIndent) (0 == true ? 1 : 0), (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) (0 == true ? 1 : 0), i19, i23, (TextMotion) (0 == true ? 1 : 0), i21, vVar2), textStyle11, textStyle12, 12327, null);
        v vVar3 = null;
        long j17 = 0;
        FontStyle fontStyle2 = null;
        long j18 = 0;
        int i24 = 0;
        int i25 = 0;
        TextIndent textIndent2 = null;
        int i26 = 0;
        int i27 = 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        TextStyle textStyle13 = new TextStyle(j17, TextUnitKt.getSp(24), companion.getBlack(), fontStyle2, (FontSynthesis) null, (FontFamily) null, (String) objArr6, TextUnitKt.getSp(0), (BaselineShift) objArr7, (TextGeometricTransform) null, (LocaleList) null, j18, (TextDecoration) objArr8, (Shadow) null, (DrawStyle) null, i24, i25, TextUnitKt.getSp(34), textIndent2, (PlatformTextStyle) null, (LineHeightStyle) null, i26, i27, (TextMotion) (0 == true ? 1 : 0), 16646009, vVar3);
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        TextStyle textStyle14 = new TextStyle(j17, TextUnitKt.getSp(18), companion.getExtraBold(), fontStyle2, (FontSynthesis) (0 == true ? 1 : 0), (FontFamily) (0 == true ? 1 : 0), (String) objArr9, 0L, (BaselineShift) objArr10, (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) (0 == true ? 1 : 0), j18, (TextDecoration) objArr11, (Shadow) (0 == true ? 1 : 0), (DrawStyle) (0 == true ? 1 : 0), i24, i25, 0L, textIndent2, (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) (0 == true ? 1 : 0), i26, i27, (TextMotion) objArr12, 16777209, vVar3);
        long j19 = 0;
        int i28 = 0;
        int i29 = 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        TextStyle textStyle15 = new TextStyle(j19, TextUnitKt.getSp(20), companion.getBold(), (FontStyle) objArr15, (FontSynthesis) objArr16, (FontFamily) objArr13, (String) null, TextUnitKt.getSp(0), (BaselineShift) objArr17, (TextGeometricTransform) objArr18, (LocaleList) null, 0L, (TextDecoration) objArr19, (Shadow) objArr20, (DrawStyle) null, i25, i28, TextUnitKt.getSp(28), (TextIndent) (0 == true ? 1 : 0), (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) null, i27, i29, (TextMotion) null, 16646009, (v) objArr14);
        long j21 = 0;
        int i31 = 0;
        int i32 = 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        TextStyle textStyle16 = new TextStyle(j21, TextUnitKt.getSp(12), companion.getBold(), (FontStyle) objArr22, (FontSynthesis) objArr21, (FontFamily) objArr26, (String) null, TextUnitKt.getSp(0), (BaselineShift) objArr23, (TextGeometricTransform) objArr27, (LocaleList) null, 0L, (TextDecoration) objArr24, (Shadow) objArr28, (DrawStyle) null, i28, i31, TextUnitKt.getSp(17), (TextIndent) objArr25, (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) null, i29, i32, (TextMotion) null, 16646009, (v) null);
        int i33 = 0;
        int i34 = 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        TextStyle textStyle17 = new TextStyle(0L, TextUnitKt.getSp(11), companion.getSemiBold(), (FontStyle) objArr29, (FontSynthesis) objArr30, (FontFamily) (0 == true ? 1 : 0), (String) null, 0L, (BaselineShift) objArr31, (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) null, 0L, (TextDecoration) objArr32, (Shadow) (0 == true ? 1 : 0), (DrawStyle) null, i31, i33, TextUnitKt.getSp(11), (TextIndent) objArr33, (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) null, i32, i34, (TextMotion) null, 16646137, vVar2);
        long j22 = 0;
        int i35 = 0;
        int i36 = 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        TextStyle textStyle18 = new TextStyle(j22, TextUnitKt.getSp(16), companion.getBold(), (FontStyle) objArr34, (FontSynthesis) objArr35, (FontFamily) objArr39, (String) null, TextUnitKt.getSp(0), (BaselineShift) objArr36, (TextGeometricTransform) objArr40, (LocaleList) null, 0L, (TextDecoration) objArr37, (Shadow) objArr41, (DrawStyle) null, i33, i35, TextUnitKt.getSp(22), (TextIndent) objArr38, (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) null, i34, i36, (TextMotion) null, 16646009, (v) null);
        long j23 = 0;
        int i37 = 0;
        int i38 = 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        TextStyle textStyle19 = new TextStyle(j23, TextUnitKt.getSp(14), companion.getBold(), (FontStyle) objArr42, (FontSynthesis) objArr43, (FontFamily) objArr47, (String) null, TextUnitKt.getSp(0), (BaselineShift) objArr44, (TextGeometricTransform) objArr48, (LocaleList) null, 0L, (TextDecoration) objArr45, (Shadow) objArr49, (DrawStyle) null, i35, i37, TextUnitKt.getSp(20), (TextIndent) objArr46, (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) null, i36, i38, (TextMotion) null, 16646009, (v) null);
        long j24 = 0;
        int i39 = 0;
        int i41 = 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        long j25 = 0;
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        Object[] objArr62 = 0 == true ? 1 : 0;
        Object[] objArr63 = 0 == true ? 1 : 0;
        Object[] objArr64 = 0 == true ? 1 : 0;
        Object[] objArr65 = 0 == true ? 1 : 0;
        Object[] objArr66 = 0 == true ? 1 : 0;
        TextStyle textStyle20 = null;
        TextStyle textStyle21 = null;
        Object[] objArr67 = 0 == true ? 1 : 0;
        f6921e = new Typography(objArr67, textStyle9, textStyle13, textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle11, new TextStyle(j24, TextUnitKt.getSp(11), companion.getMedium(), (FontStyle) objArr50, (FontSynthesis) objArr51, (FontFamily) objArr55, (String) null, TextUnitKt.getSp(0), (BaselineShift) objArr52, (TextGeometricTransform) objArr56, (LocaleList) null, 0L, (TextDecoration) objArr53, (Shadow) objArr57, (DrawStyle) null, i37, i39, TextUnitKt.getSp(11), (TextIndent) objArr54, (PlatformTextStyle) (0 == true ? 1 : 0), (LineHeightStyle) null, i38, i41, (TextMotion) null, 16646009, (v) null), new TextStyle(j25, TextUnitKt.getSp(10), companion.getMedium(), (FontStyle) objArr58, (FontSynthesis) objArr59, (FontFamily) objArr63, (String) null, TextUnitKt.getSp(0), (BaselineShift) objArr60, (TextGeometricTransform) objArr64, (LocaleList) null, 0L, (TextDecoration) objArr61, (Shadow) objArr65, (DrawStyle) null, i39, 0, TextUnitKt.getSp(10), (TextIndent) objArr62, (PlatformTextStyle) objArr66, (LineHeightStyle) null, i41, 0, (TextMotion) null, 16646009, (v) null), 3587, null);
        f6922f = new Shapes(RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(d.i()), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(d.h()), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(d.f()));
        m1592copypvPzIIM = m1622lightColors2qZNXz8$default.m1592copypvPzIIM((r45 & 1) != 0 ? m1622lightColors2qZNXz8$default.m1600getPrimary0d7_KjU() : ColorKt.Color(4280639473L), (r45 & 2) != 0 ? m1622lightColors2qZNXz8$default.m1601getPrimaryVariant0d7_KjU() : 0L, (r45 & 4) != 0 ? m1622lightColors2qZNXz8$default.m1602getSecondary0d7_KjU() : 0L, (r45 & 8) != 0 ? m1622lightColors2qZNXz8$default.m1603getSecondaryVariant0d7_KjU() : 0L, (r45 & 16) != 0 ? m1622lightColors2qZNXz8$default.m1593getBackground0d7_KjU() : 0L, (r45 & 32) != 0 ? m1622lightColors2qZNXz8$default.m1604getSurface0d7_KjU() : 0L, (r45 & 64) != 0 ? m1622lightColors2qZNXz8$default.m1594getError0d7_KjU() : 0L, (r45 & 128) != 0 ? m1622lightColors2qZNXz8$default.m1597getOnPrimary0d7_KjU() : 0L, (r45 & 256) != 0 ? m1622lightColors2qZNXz8$default.m1598getOnSecondary0d7_KjU() : 0L, (r45 & 512) != 0 ? m1622lightColors2qZNXz8$default.m1595getOnBackground0d7_KjU() : 0L, (r45 & 1024) != 0 ? m1622lightColors2qZNXz8$default.m1599getOnSurface0d7_KjU() : 0L, (r45 & 2048) != 0 ? m1622lightColors2qZNXz8$default.m1596getOnError0d7_KjU() : 0L, (r45 & 4096) != 0 ? m1622lightColors2qZNXz8$default.isLight() : false);
        f6923g = m1592copypvPzIIM;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0074  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@m80.l androidx.compose.material.Colors r14, @m80.l androidx.compose.material.Typography r15, @m80.l androidx.compose.material.Shapes r16, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r17, @m80.l androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.k.e(androidx.compose.material.Colors, androidx.compose.material.Typography, androidx.compose.material.Shapes, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final g2 f(p pVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621243072, i11, -1, "com.baicizhan.platform.base.theme.MagicTheme.<anonymous> (Theme.kt:185)");
            }
            pVar.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 g(Colors colors, Typography typography, Shapes shapes, p pVar, int i11, int i12, Composer composer, int i13) {
        e(colors, typography, shapes, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@m80.l androidx.compose.material.Colors r14, @m80.l androidx.compose.material.Typography r15, @m80.l androidx.compose.material.Shapes r16, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r17, @m80.l androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.k.h(androidx.compose.material.Colors, androidx.compose.material.Typography, androidx.compose.material.Shapes, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final g2 i(p pVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-946429032, i11, -1, "com.baicizhan.platform.base.theme.PlayerTheme.<anonymous> (Theme.kt:220)");
            }
            pVar.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 j(Colors colors, Typography typography, Shapes shapes, p pVar, int i11, int i12, Composer composer, int i13) {
        h(colors, typography, shapes, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @m80.k
    public static final Colors k() {
        return f6917a;
    }

    @m80.k
    public static final FontFamily l() {
        return f6918b;
    }

    @m80.k
    public static final Colors m() {
        return f6923g;
    }

    @m80.k
    public static final FontFamily n() {
        return f6919c;
    }
}
