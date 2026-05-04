package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,599:1\n34#2,6:600\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n161#1:600,6\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidClipboardManager_androidKt {
    private static final byte BACKGROUND_ID = 10;
    private static final byte BASELINE_SHIFT_ID = 8;
    private static final int BASELINE_SHIFT_SIZE = 4;
    private static final int BYTE_SIZE = 1;
    private static final byte COLOR_ID = 1;
    private static final int COLOR_SIZE = 8;
    private static final int FLOAT_SIZE = 4;
    private static final byte FONT_FEATURE_SETTINGS_ID = 6;
    private static final byte FONT_SIZE_ID = 2;
    private static final byte FONT_STYLE_ID = 4;
    private static final byte FONT_STYLE_ITALIC = 1;
    private static final byte FONT_STYLE_NORMAL = 0;
    private static final int FONT_STYLE_SIZE = 1;
    private static final byte FONT_SYNTHESIS_ALL = 1;
    private static final byte FONT_SYNTHESIS_ID = 5;
    private static final byte FONT_SYNTHESIS_NONE = 0;
    private static final int FONT_SYNTHESIS_SIZE = 1;
    private static final byte FONT_SYNTHESIS_STYLE = 3;
    private static final byte FONT_SYNTHESIS_WEIGHT = 2;
    private static final byte FONT_WEIGHT_ID = 3;
    private static final int FONT_WEIGHT_SIZE = 4;
    private static final int INT_SIZE = 4;
    private static final byte LETTER_SPACING_ID = 7;
    private static final int LONG_SIZE = 8;

    @m80.k
    private static final String PLAIN_TEXT_LABEL = "plain text";
    private static final byte SHADOW_ID = 12;
    private static final int SHADOW_SIZE = 20;
    private static final byte TEXT_DECORATION_ID = 11;
    private static final int TEXT_DECORATION_SIZE = 4;
    private static final byte TEXT_GEOMETRIC_TRANSFORM_ID = 9;
    private static final int TEXT_GEOMETRIC_TRANSFORM_SIZE = 8;
    private static final int TEXT_UNIT_SIZE = 5;
    private static final byte UNIT_TYPE_EM = 2;
    private static final byte UNIT_TYPE_SP = 1;
    private static final byte UNIT_TYPE_UNSPECIFIED = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public static final AnnotatedString convertToAnnotatedString(@m80.l CharSequence charSequence) {
        List list = null;
        Object[] objArr = 0;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), list, 2, objArr == true ? 1 : 0);
        }
        Spanned spanned = (Spanned) charSequence;
        int i11 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int Oe = a00.a0.Oe(annotationArr);
        if (Oe >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i11];
                if (kotlin.jvm.internal.g0.g(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new AnnotatedString.Range(new DecodeHelper(annotation.getValue()).decodeSpanStyle(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i11 == Oe) {
                    break;
                }
                i11++;
            }
        }
        return new AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }

    @m80.k
    public static final CharSequence convertToCharSequence(@m80.k AnnotatedString annotatedString) {
        if (annotatedString.getSpanStyles().isEmpty()) {
            return annotatedString.getText();
        }
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        EncodeHelper encodeHelper = new EncodeHelper();
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        int size = spanStyles.size();
        for (int i11 = 0; i11 < size; i11++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i11);
            SpanStyle component1 = range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            encodeHelper.reset();
            encodeHelper.encode(component1);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper.encodedString()), component2, component3, 33);
        }
        return spannableString;
    }

    @m80.k
    public static final ClipEntry toClipEntry(@m80.k ClipData clipData) {
        return new ClipEntry(clipData);
    }

    @m80.k
    public static final ClipMetadata toClipMetadata(@m80.k ClipDescription clipDescription) {
        return new ClipMetadata(clipDescription);
    }
}
