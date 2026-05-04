package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidParagraphIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraphIntrinsics.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphIntrinsics\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n117#2,2:207\n34#2,6:209\n119#2:215\n*S KotlinDebug\n*F\n+ 1 AndroidParagraphIntrinsics.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphIntrinsics\n*L\n112#1:207,2\n112#1:209,6\n112#1:215\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;

    @k
    private final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations;

    @k
    private final CharSequence charSequence;

    @k
    private final Density density;
    private final boolean emojiCompatProcessed;

    @k
    private final FontFamily.Resolver fontFamilyResolver;

    @k
    private final LayoutIntrinsics layoutIntrinsics;

    @k
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    @l
    private TypefaceDirtyTrackerLinkedList resolvedTypefaces;

    @k
    private final TextStyle style;

    @k
    private final String text;
    private final int textDirectionHeuristic;

    @k
    private final AndroidTextPaint textPaint;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<? extends androidx.compose.ui.text.AnnotatedString$Range<? extends androidx.compose.ui.text.AnnotatedString$Annotation>>, java.util.List<androidx.compose.ui.text.AnnotatedString$Range<? extends androidx.compose.ui.text.AnnotatedString$Annotation>>] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List<androidx.compose.ui.text.AnnotatedString$Range<? extends androidx.compose.ui.text.AnnotatedString$Annotation>>] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    public AndroidParagraphIntrinsics(@k String str, @k TextStyle textStyle, @k List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, @k List<AnnotatedString.Range<Placeholder>> list2, @k FontFamily.Resolver resolver, @k Density density) {
        boolean hasEmojiCompat;
        Object obj;
        List list3;
        this.text = str;
        this.style = textStyle;
        this.annotations = list;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        hasEmojiCompat = AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(textStyle);
        this.emojiCompatProcessed = !hasEmojiCompat ? false : EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m4816resolveTextDirectionHeuristicsHklW4sA(textStyle.m4602getTextDirections_7Xco(), textStyle.getLocaleList());
        r<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> rVar = new r<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface>() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ Typeface invoke(FontFamily fontFamily, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis) {
                return m4815invokeDPcqOEQ(fontFamily, fontWeight, fontStyle.m4673unboximpl(), fontSynthesis.m4686unboximpl());
            }

            /* renamed from: invoke-DPcqOEQ, reason: not valid java name */
            public final Typeface m4815invokeDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i11, int i12) {
                TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
                State<Object> mo4643resolveDPcqOEQ = AndroidParagraphIntrinsics.this.getFontFamilyResolver().mo4643resolveDPcqOEQ(fontFamily, fontWeight, i11, i12);
                if (mo4643resolveDPcqOEQ instanceof TypefaceResult.Immutable) {
                    Object value = mo4643resolveDPcqOEQ.getValue();
                    g0.n(value, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) value;
                }
                typefaceDirtyTrackerLinkedList = AndroidParagraphIntrinsics.this.resolvedTypefaces;
                TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList2 = new TypefaceDirtyTrackerLinkedList(mo4643resolveDPcqOEQ, typefaceDirtyTrackerLinkedList);
                AndroidParagraphIntrinsics.this.resolvedTypefaces = typefaceDirtyTrackerLinkedList2;
                return typefaceDirtyTrackerLinkedList2.getTypeface();
            }
        };
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, textStyle.getTextMotion());
        SpanStyle spanStyle = textStyle.toSpanStyle();
        int size = ((Collection) list).size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (((AnnotatedString.Range) obj).getItem() instanceof SpanStyle) {
                break;
            } else {
                i11++;
            }
        }
        SpanStyle applySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, spanStyle, rVar, density, obj != null);
        if (applySpanStyle != null) {
            int size2 = this.annotations.size() + 1;
            list3 = new ArrayList(size2);
            int i12 = 0;
            while (i12 < size2) {
                list3.add(i12 == 0 ? new AnnotatedString.Range<>(applySpanStyle, 0, this.text.length()) : this.annotations.get(i12 - 1));
                i12++;
            }
        } else {
            list3 = this.annotations;
        }
        CharSequence createCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, list3, this.placeholders, this.density, rVar, this.emojiCompatProcessed);
        this.charSequence = createCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(createCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    @k
    public final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getAnnotations() {
        return this.annotations;
    }

    @k
    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    @k
    public final Density getDensity() {
        return this.density;
    }

    @k
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        boolean hasEmojiCompat;
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        if (typefaceDirtyTrackerLinkedList != null ? typefaceDirtyTrackerLinkedList.isStaleResolvedFont() : false) {
            return true;
        }
        if (!this.emojiCompatProcessed) {
            hasEmojiCompat = AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(this.style);
            if (hasEmojiCompat && EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @k
    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    @k
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @k
    public final TextStyle getStyle() {
        return this.style;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.textDirectionHeuristic;
    }

    @k
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.textPaint;
    }
}
