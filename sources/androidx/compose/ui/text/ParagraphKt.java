package androidx.compose.ui.text;

import a00.h0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.DeprecationLevel;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    @n(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @w0(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @k
    public static final Paragraph Paragraph(@k String str, @k TextStyle textStyle, @k List<AnnotatedString.Range<SpanStyle>> list, @k List<AnnotatedString.Range<Placeholder>> list2, int i11, boolean z11, float f11, @k Density density, @k Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i11, z11, f11, density, resourceLoader);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i11, boolean z11, float f11, Density density, Font.ResourceLoader resourceLoader, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            list = h0.J();
        }
        List list3 = list;
        if ((i12 & 8) != 0) {
            list2 = h0.J();
        }
        List list4 = list2;
        if ((i12 & 16) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        int i13 = i11;
        if ((i12 & 32) != 0) {
            z11 = false;
        }
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list4, i13, z11, f11, density, resourceLoader);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes `ellipsis: Boolean` is deprecated, pass TextOverflow instead.")
    /* renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final /* synthetic */ Paragraph m4426ParagraphUdtVg6A(String str, TextStyle textStyle, long j11, Density density, FontFamily.Resolver resolver, List list, List list2, int i11, boolean z11) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4819ActualParagraphXGqx6AY(str, textStyle, list, list2, i11, z11 ? companion.m5029getEllipsisgIe3tQ8() : companion.m5028getClipgIe3tQ8(), j11, density, resolver);
    }

    @k
    /* renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m4428ParagraphUl8oQg4(@k String str, @k TextStyle textStyle, long j11, @k Density density, @k FontFamily.Resolver resolver, @k List<AnnotatedString.Range<SpanStyle>> list, @k List<AnnotatedString.Range<Placeholder>> list2, int i11, int i12) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4819ActualParagraphXGqx6AY(str, textStyle, list, list2, i11, i12, j11, density, resolver);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes ellipsis: Boolean is deprecated, pass TextOverflow instead.", replaceWith = @w0(expression = "Paragraph(paragraphIntrinsics, constraints, maxLines, if (ellipsis) TextOverflow.Ellipsis else TextOverflow.Clip", imports = {}))
    /* renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final /* synthetic */ Paragraph m4430Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j11, int i11, boolean z11) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4818ActualParagraph4FmOz70(paragraphIntrinsics, i11, z11 ? TextOverflow.Companion.m5029getEllipsisgIe3tQ8() : TextOverflow.Companion.m5028getClipgIe3tQ8(), j11);
    }

    /* renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m4431Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j11, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        return m4430Paragraph_EkL_Y(paragraphIntrinsics, j11, i11, z11);
    }

    @k
    /* renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m4432ParagraphczeNHc(@k ParagraphIntrinsics paragraphIntrinsics, long j11, int i11, int i12) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4818ActualParagraph4FmOz70(paragraphIntrinsics, i11, i12, j11);
    }

    /* renamed from: Paragraph-czeN-Hc$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m4433ParagraphczeNHc$default(ParagraphIntrinsics paragraphIntrinsics, long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i13 & 8) != 0) {
            i12 = TextOverflow.Companion.m5028getClipgIe3tQ8();
        }
        return m4432ParagraphczeNHc(paragraphIntrinsics, j11, i11, i12);
    }

    public static final int ceilToInt(float f11) {
        return (int) Math.ceil(f11);
    }

    @n(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @w0(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @k
    public static final Paragraph Paragraph(@k String str, @k TextStyle textStyle, float f11, @k Density density, @k FontFamily.Resolver resolver, @k List<AnnotatedString.Range<SpanStyle>> list, @k List<AnnotatedString.Range<Placeholder>> list2, int i11, boolean z11) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4819ActualParagraphXGqx6AY(str, textStyle, list, list2, i11, z11 ? companion.m5029getEllipsisgIe3tQ8() : companion.m5028getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f11), 0, 0, 13, null), density, resolver);
    }

    @n(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @w0(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @k
    public static final Paragraph Paragraph(@k ParagraphIntrinsics paragraphIntrinsics, int i11, boolean z11, float f11) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4818ActualParagraph4FmOz70(paragraphIntrinsics, i11, z11 ? TextOverflow.Companion.m5029getEllipsisgIe3tQ8() : TextOverflow.Companion.m5028getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f11), 0, 0, 13, null));
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i11, boolean z11, float f11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return Paragraph(paragraphIntrinsics, i11, z11, f11);
    }
}
