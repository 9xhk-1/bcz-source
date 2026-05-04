package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "AndroidParagraph_androidKt")
/* loaded from: classes2.dex */
public final class AndroidParagraph_androidKt {
    @n(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @w0(expression = "ActualParagraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @k
    public static final Paragraph ActualParagraph(@k String str, @k TextStyle textStyle, @k List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, @k List<AnnotatedString.Range<Placeholder>> list2, int i11, boolean z11, float f11, @k Density density, @k Font.ResourceLoader resourceLoader) {
        AndroidParagraphIntrinsics androidParagraphIntrinsics = new AndroidParagraphIntrinsics(str, textStyle, list, list2, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), density);
        TextOverflow.Companion companion = TextOverflow.Companion;
        return new AndroidParagraph(androidParagraphIntrinsics, i11, z11 ? companion.m5029getEllipsisgIe3tQ8() : companion.m5028getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f11), 0, 0, 13, null), null);
    }

    @k
    /* renamed from: ActualParagraph-4FmOz70, reason: not valid java name */
    public static final Paragraph m4818ActualParagraph4FmOz70(@k ParagraphIntrinsics paragraphIntrinsics, int i11, int i12, long j11) {
        g0.n(paragraphIntrinsics, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i11, i12, j11, null);
    }

    @k
    /* renamed from: ActualParagraph-XGqx6AY, reason: not valid java name */
    public static final Paragraph m4819ActualParagraphXGqx6AY(@k String str, @k TextStyle textStyle, @k List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, @k List<AnnotatedString.Range<Placeholder>> list2, int i11, int i12, long j11, @k Density density, @k FontFamily.Resolver resolver) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i11, i12, j11, null);
    }
}
