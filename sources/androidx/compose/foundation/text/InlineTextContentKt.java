package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInlineTextContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineTextContent.kt\nandroidx/compose/foundation/text/InlineTextContentKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,86:1\n96#2,5:87\n*S KotlinDebug\n*F\n+ 1 InlineTextContent.kt\nandroidx/compose/foundation/text/InlineTextContentKt\n*L\n52#1:87,5\n*E\n"})
/* loaded from: classes.dex */
public final class InlineTextContentKt {

    @k
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";

    @k
    private static final String REPLACEMENT_CHAR = "�";

    public static final void appendInlineContent(@k AnnotatedString.Builder builder, @k String str, @k String str2) {
        if (!(str2.length() > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("alternateText can't be an empty string.");
        }
        builder.pushStringAnnotation(INLINE_CONTENT_TAG, str);
        builder.append(str2);
        builder.pop();
    }

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = REPLACEMENT_CHAR;
        }
        appendInlineContent(builder, str, str2);
    }
}
