package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import uo.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TtmlStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int RUBY_TYPE_BASE = 2;
    public static final int RUBY_TYPE_CONTAINER = 1;
    public static final int RUBY_TYPE_DELIMITER = 4;
    public static final int RUBY_TYPE_TEXT = 3;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    public static final float UNSPECIFIED_SHEAR = Float.MAX_VALUE;
    private int backgroundColor;

    @Nullable
    private String extent;
    private int fontColor;

    @Nullable
    private String fontFamily;
    private float fontSize;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;

    /* renamed from: id, reason: collision with root package name */
    @Nullable
    private String f5244id;

    @Nullable
    private Layout.Alignment multiRowAlign;

    @Nullable
    private String origin;

    @Nullable
    private Layout.Alignment textAlign;

    @Nullable
    private TextEmphasis textEmphasis;
    private int linethrough = -1;
    private int underline = -1;
    private int bold = -1;
    private int italic = -1;
    private int fontSizeUnit = -1;
    private int rubyType = -1;
    private int rubyPosition = -1;
    private int textCombine = -1;
    private float shearPercentage = Float.MAX_VALUE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    @a
    public TtmlStyle chain(@Nullable TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, true);
    }

    public int getBackgroundColor() {
        if (this.hasBackgroundColor) {
            return this.backgroundColor;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    @Nullable
    public String getExtent() {
        return this.extent;
    }

    public int getFontColor() {
        if (this.hasFontColor) {
            return this.fontColor;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @Nullable
    public String getFontFamily() {
        return this.fontFamily;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public int getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    @Nullable
    public String getId() {
        return this.f5244id;
    }

    @Nullable
    public Layout.Alignment getMultiRowAlign() {
        return this.multiRowAlign;
    }

    @Nullable
    public String getOrigin() {
        return this.origin;
    }

    public int getRubyPosition() {
        return this.rubyPosition;
    }

    public int getRubyType() {
        return this.rubyType;
    }

    public float getShearPercentage() {
        return this.shearPercentage;
    }

    public int getStyle() {
        int i11 = this.bold;
        if (i11 == -1 && this.italic == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.italic == 1 ? 2 : 0);
    }

    @Nullable
    public Layout.Alignment getTextAlign() {
        return this.textAlign;
    }

    public boolean getTextCombine() {
        return this.textCombine == 1;
    }

    @Nullable
    public TextEmphasis getTextEmphasis() {
        return this.textEmphasis;
    }

    public boolean hasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    public boolean hasFontColor() {
        return this.hasFontColor;
    }

    @a
    public TtmlStyle inherit(@Nullable TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, false);
    }

    public boolean isLinethrough() {
        return this.linethrough == 1;
    }

    public boolean isUnderline() {
        return this.underline == 1;
    }

    @a
    public TtmlStyle setBackgroundColor(int i11) {
        this.backgroundColor = i11;
        this.hasBackgroundColor = true;
        return this;
    }

    @a
    public TtmlStyle setBold(boolean z11) {
        this.bold = z11 ? 1 : 0;
        return this;
    }

    @a
    public TtmlStyle setExtent(@Nullable String str) {
        this.extent = str;
        return this;
    }

    @a
    public TtmlStyle setFontColor(int i11) {
        this.fontColor = i11;
        this.hasFontColor = true;
        return this;
    }

    @a
    public TtmlStyle setFontFamily(@Nullable String str) {
        this.fontFamily = str;
        return this;
    }

    @a
    public TtmlStyle setFontSize(float f11) {
        this.fontSize = f11;
        return this;
    }

    @a
    public TtmlStyle setFontSizeUnit(int i11) {
        this.fontSizeUnit = i11;
        return this;
    }

    @a
    public TtmlStyle setId(@Nullable String str) {
        this.f5244id = str;
        return this;
    }

    @a
    public TtmlStyle setItalic(boolean z11) {
        this.italic = z11 ? 1 : 0;
        return this;
    }

    @a
    public TtmlStyle setLinethrough(boolean z11) {
        this.linethrough = z11 ? 1 : 0;
        return this;
    }

    @a
    public TtmlStyle setMultiRowAlign(@Nullable Layout.Alignment alignment) {
        this.multiRowAlign = alignment;
        return this;
    }

    @a
    public TtmlStyle setOrigin(@Nullable String str) {
        this.origin = str;
        return this;
    }

    @a
    public TtmlStyle setRubyPosition(int i11) {
        this.rubyPosition = i11;
        return this;
    }

    @a
    public TtmlStyle setRubyType(int i11) {
        this.rubyType = i11;
        return this;
    }

    @a
    public TtmlStyle setShearPercentage(float f11) {
        this.shearPercentage = f11;
        return this;
    }

    @a
    public TtmlStyle setTextAlign(@Nullable Layout.Alignment alignment) {
        this.textAlign = alignment;
        return this;
    }

    @a
    public TtmlStyle setTextCombine(boolean z11) {
        this.textCombine = z11 ? 1 : 0;
        return this;
    }

    @a
    public TtmlStyle setTextEmphasis(@Nullable TextEmphasis textEmphasis) {
        this.textEmphasis = textEmphasis;
        return this;
    }

    @a
    public TtmlStyle setUnderline(boolean z11) {
        this.underline = z11 ? 1 : 0;
        return this;
    }

    @a
    private TtmlStyle inherit(@Nullable TtmlStyle ttmlStyle, boolean z11) {
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.hasFontColor && ttmlStyle.hasFontColor) {
                setFontColor(ttmlStyle.fontColor);
            }
            if (this.bold == -1) {
                this.bold = ttmlStyle.bold;
            }
            if (this.italic == -1) {
                this.italic = ttmlStyle.italic;
            }
            if (this.fontFamily == null && (str = ttmlStyle.fontFamily) != null) {
                this.fontFamily = str;
            }
            if (this.linethrough == -1) {
                this.linethrough = ttmlStyle.linethrough;
            }
            if (this.underline == -1) {
                this.underline = ttmlStyle.underline;
            }
            if (this.rubyPosition == -1) {
                this.rubyPosition = ttmlStyle.rubyPosition;
            }
            if (this.textAlign == null && (alignment2 = ttmlStyle.textAlign) != null) {
                this.textAlign = alignment2;
            }
            if (this.multiRowAlign == null && (alignment = ttmlStyle.multiRowAlign) != null) {
                this.multiRowAlign = alignment;
            }
            if (this.textCombine == -1) {
                this.textCombine = ttmlStyle.textCombine;
            }
            if (this.fontSizeUnit == -1) {
                this.fontSizeUnit = ttmlStyle.fontSizeUnit;
                this.fontSize = ttmlStyle.fontSize;
            }
            if (this.textEmphasis == null) {
                this.textEmphasis = ttmlStyle.textEmphasis;
            }
            if (this.shearPercentage == Float.MAX_VALUE) {
                this.shearPercentage = ttmlStyle.shearPercentage;
            }
            if (this.origin == null) {
                this.origin = ttmlStyle.origin;
            }
            if (this.extent == null) {
                this.extent = ttmlStyle.extent;
            }
            if (z11 && !this.hasBackgroundColor && ttmlStyle.hasBackgroundColor) {
                setBackgroundColor(ttmlStyle.backgroundColor);
            }
            if (z11 && this.rubyType == -1 && (i11 = ttmlStyle.rubyType) != -1) {
                this.rubyType = i11;
            }
        }
        return this;
    }
}
