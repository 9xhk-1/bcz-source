package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TextStyleKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    @k
    public static final TextStyle lerp(@k TextStyle textStyle, @k TextStyle textStyle2, float f11) {
        return new TextStyle(SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f11), ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f11));
    }

    @k
    public static final TextStyle resolveDefaults(@k TextStyle textStyle, @k LayoutDirection layoutDirection) {
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle$ui_text_release()), ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle$ui_text_release(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-IhaHGbI, reason: not valid java name */
    public static final int m4605resolveTextDirectionIhaHGbI(@k LayoutDirection layoutDirection, int i11) {
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m4987equalsimpl0(i11, companion.m4991getContents_7Xco())) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i12 == 1) {
                return companion.m4992getContentOrLtrs_7Xco();
            }
            if (i12 == 2) {
                return companion.m4993getContentOrRtls_7Xco();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!TextDirection.m4987equalsimpl0(i11, companion.m4996getUnspecifieds_7Xco())) {
            return i11;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i13 == 1) {
            return companion.m4994getLtrs_7Xco();
        }
        if (i13 == 2) {
            return companion.m4995getRtls_7Xco();
        }
        throw new NoWhenBranchMatchedException();
    }
}
