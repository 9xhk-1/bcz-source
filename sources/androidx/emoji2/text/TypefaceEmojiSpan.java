package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class TypefaceEmojiSpan extends EmojiSpan {

    @Nullable
    private static Paint sDebugPaint;

    @Nullable
    private TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        super(typefaceEmojiRasterizer);
    }

    @Nullable
    private TextPaint applyCharacterSpanStyles(@Nullable CharSequence charSequence, int i11, int i12, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i11, i12, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.mWorkingPaint;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.mWorkingPaint = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    @NonNull
    private static Paint getDebugPaint() {
        if (sDebugPaint == null) {
            TextPaint textPaint = new TextPaint();
            sDebugPaint = textPaint;
            textPaint.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
            sDebugPaint.setStyle(Paint.Style.FILL);
        }
        return sDebugPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, float f11, int i13, int i14, int i15, @NonNull Paint paint) {
        TextPaint applyCharacterSpanStyles = applyCharacterSpanStyles(charSequence, i11, i12, paint);
        if (applyCharacterSpanStyles != null && applyCharacterSpanStyles.bgColor != 0) {
            drawBackground(canvas, applyCharacterSpanStyles, f11, f11 + getWidth(), i13, i15);
        }
        Paint paint2 = applyCharacterSpanStyles;
        if (EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            canvas.drawRect(f11, i13, f11 + getWidth(), i15, getDebugPaint());
        }
        TypefaceEmojiRasterizer typefaceRasterizer = getTypefaceRasterizer();
        float f12 = i14;
        if (paint2 == null) {
            paint2 = paint;
        }
        typefaceRasterizer.draw(canvas, f11, f12, paint2);
    }

    public void drawBackground(Canvas canvas, TextPaint textPaint, float f11, float f12, float f13, float f14) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f11, f13, f12, f14, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
