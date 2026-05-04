package androidx.compose.ui.text;

import a00.h0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ParagraphIntrinsicsKt {
    @n(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @w0(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    @k
    public static final ParagraphIntrinsics ParagraphIntrinsics(@k String str, @k TextStyle textStyle, @k List<AnnotatedString.Range<SpanStyle>> list, @k List<AnnotatedString.Range<Placeholder>> list2, @k Density density, @k Font.ResourceLoader resourceLoader) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, Font.ResourceLoader resourceLoader, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = h0.J();
        }
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list2, density, resourceLoader);
    }

    @n(message = "Use an overload that takes `annotations` instead", replaceWith = @w0(expression = "ParagraphIntrinsics(text, style, spanStyles, density, fontFamilyResolver, placeholders)", imports = {}))
    @k
    public static final ParagraphIntrinsics ParagraphIntrinsics(@k String str, @k TextStyle textStyle, @k List<AnnotatedString.Range<SpanStyle>> list, @k List<AnnotatedString.Range<Placeholder>> list2, @k Density density, @k FontFamily.Resolver resolver) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    @k
    public static final ParagraphIntrinsics ParagraphIntrinsics(@k String str, @k TextStyle textStyle, @k List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, @k Density density, @k FontFamily.Resolver resolver, @k List<AnnotatedString.Range<Placeholder>> list2) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, FontFamily.Resolver resolver, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = h0.J();
        }
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list2, density, resolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, Density density, FontFamily.Resolver resolver, List list2, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            list2 = h0.J();
        }
        return ParagraphIntrinsics(str, textStyle, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) list, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list2);
    }
}
