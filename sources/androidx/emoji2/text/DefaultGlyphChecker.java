package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@AnyThread
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {
    private static final int PAINT_TEXT_SIZE = 10;
    private static final ThreadLocal<StringBuilder> sStringBuilder = new ThreadLocal<>();
    private final TextPaint mTextPaint;

    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.mTextPaint = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder getStringBuilder() {
        ThreadLocal<StringBuilder> threadLocal = sStringBuilder;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(@NonNull CharSequence charSequence, int i11, int i12, int i13) {
        StringBuilder stringBuilder = getStringBuilder();
        stringBuilder.setLength(0);
        while (i11 < i12) {
            stringBuilder.append(charSequence.charAt(i11));
            i11++;
        }
        return PaintCompat.hasGlyph(this.mTextPaint, stringBuilder.toString());
    }
}
