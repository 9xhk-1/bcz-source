package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidParagraphIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraphIntrinsics.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphIntrinsics_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    @k
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@k String str, @k TextStyle textStyle, @k List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, @k List<AnnotatedString.Range<Placeholder>> list2, @k Density density, @k FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m4396boximpl(paragraphStyle.m4477getEmojiSupportMatch_3YsG6Y())) == null ? false : EmojiSupportMatch.m4399equalsimpl0(r1.m4402unboximpl(), EmojiSupportMatch.Companion.m4405getNone_3YsG6Y()));
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m4816resolveTextDirectionHeuristicsHklW4sA(int i11, @l LocaleList localeList) {
        Locale locale;
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m4987equalsimpl0(i11, companion.m4992getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (TextDirection.m4987equalsimpl0(i11, companion.m4993getContentOrRtls_7Xco())) {
            return 3;
        }
        if (TextDirection.m4987equalsimpl0(i11, companion.m4994getLtrs_7Xco())) {
            return 0;
        }
        if (TextDirection.m4987equalsimpl0(i11, companion.m4995getRtls_7Xco())) {
            return 1;
        }
        if (!(TextDirection.m4987equalsimpl0(i11, companion.m4991getContents_7Xco()) ? true : TextDirection.m4987equalsimpl0(i11, companion.m4996getUnspecifieds_7Xco()))) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (localeList == null || (locale = localeList.get(0).getPlatformLocale()) == null) {
            locale = Locale.getDefault();
        }
        int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(locale);
        return (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m4817resolveTextDirectionHeuristicsHklW4sA$default(int i11, LocaleList localeList, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            localeList = null;
        }
        return m4816resolveTextDirectionHeuristicsHklW4sA(i11, localeList);
    }
}
