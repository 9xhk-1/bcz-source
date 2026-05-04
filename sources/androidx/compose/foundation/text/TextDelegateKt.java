package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,356:1\n26#2:357\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n*L\n310#1:357\n*E\n"})
/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f11) {
        return Math.round((float) Math.ceil(f11));
    }

    @k
    /* renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m1130updateTextDelegaterm0N8CA(@k TextDelegate textDelegate, @k AnnotatedString annotatedString, @k TextStyle textStyle, @k Density density, @k FontFamily.Resolver resolver, boolean z11, int i11, int i12, int i13, @k List<AnnotatedString.Range<Placeholder>> list) {
        FontFamily.Resolver resolver2;
        boolean z12;
        int i14;
        int i15;
        int i16;
        List<AnnotatedString.Range<Placeholder>> list2;
        if (g0.g(textDelegate.getText(), annotatedString) && g0.g(textDelegate.getStyle(), textStyle)) {
            z12 = z11;
            if (textDelegate.getSoftWrap() == z12) {
                i14 = i11;
                if (!TextOverflow.m5019equalsimpl0(textDelegate.m1128getOverflowgIe3tQ8(), i14)) {
                    resolver2 = resolver;
                    i15 = i12;
                    i16 = i13;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i15, i16, z12, i14, density, resolver2, list2, null);
                }
                i15 = i12;
                if (textDelegate.getMaxLines() != i15) {
                    resolver2 = resolver;
                    i16 = i13;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i15, i16, z12, i14, density, resolver2, list2, null);
                }
                i16 = i13;
                if (textDelegate.getMinLines() != i16 || !g0.g(textDelegate.getDensity(), density)) {
                    resolver2 = resolver;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i15, i16, z12, i14, density, resolver2, list2, null);
                }
                list2 = list;
                if (g0.g(textDelegate.getPlaceholders(), list2)) {
                    resolver2 = resolver;
                    if (textDelegate.getFontFamilyResolver() == resolver2) {
                        return textDelegate;
                    }
                } else {
                    resolver2 = resolver;
                }
                return new TextDelegate(annotatedString, textStyle, i15, i16, z12, i14, density, resolver2, list2, null);
            }
            resolver2 = resolver;
        } else {
            resolver2 = resolver;
            z12 = z11;
        }
        i14 = i11;
        i15 = i12;
        i16 = i13;
        list2 = list;
        return new TextDelegate(annotatedString, textStyle, i15, i16, z12, i14, density, resolver2, list2, null);
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default, reason: not valid java name */
    public static /* synthetic */ TextDelegate m1131updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z11, int i11, int i12, int i13, List list, int i14, Object obj) {
        if ((i14 & 32) != 0) {
            z11 = true;
        }
        if ((i14 & 64) != 0) {
            i11 = TextOverflow.Companion.m5028getClipgIe3tQ8();
        }
        if ((i14 & 128) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        if ((i14 & 256) != 0) {
            i13 = 1;
        }
        return m1130updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, z11, i11, i12, i13, list);
    }
}
