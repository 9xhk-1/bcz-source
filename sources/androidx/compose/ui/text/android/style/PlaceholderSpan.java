package androidx.compose.ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.KotlinNothingValueException;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import zz.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPlaceholderSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.android.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,191:1\n77#2,8:192\n77#2,8:200\n114#2,8:208\n*S KotlinDebug\n*F\n+ 1 PlaceholderSpan.android.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n*L\n92#1:192,8\n100#1:200,8\n118#1:208,8\n*E\n"})
/* loaded from: classes2.dex */
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Unit {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface VerticalAlign {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public PlaceholderSpan(float f11, int i11, float f12, int i12, float f13, int i13) {
        this.width = f11;
        this.widthUnit = i11;
        this.height = f12;
        this.heightUnit = i12;
        this.pxPerSp = f13;
        this.verticalAlign = i13;
    }

    @k
    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        g0.S("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(@k Paint paint, @l CharSequence charSequence, int i11, int i12, @l Paint.FontMetricsInt fontMetricsInt) {
        float f11;
        int ceilToInt;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (!(getFontMetrics().descent > getFontMetrics().ascent)) {
            InlineClassHelperKt.throwIllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i13 = this.widthUnit;
        if (i13 == 0) {
            f11 = this.width * this.pxPerSp;
        } else {
            if (i13 != 1) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f11 = this.width * textSize;
        }
        this.widthPx = PlaceholderSpan_androidKt.ceilToInt(f11);
        int i14 = this.heightUnit;
        if (i14 == 0) {
            ceilToInt = PlaceholderSpan_androidKt.ceilToInt(this.height * this.pxPerSp);
        } else {
            if (i14 != 1) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            ceilToInt = PlaceholderSpan_androidKt.ceilToInt(this.height * textSize);
        }
        this.heightPx = ceilToInt;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = getFontMetrics().ascent;
            fontMetricsInt.descent = getFontMetrics().descent;
            fontMetricsInt.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fontMetricsInt.ascent > (-getHeightPx())) {
                        fontMetricsInt.ascent = -getHeightPx();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + getHeightPx() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                        int heightPx = fontMetricsInt.ascent - ((getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = heightPx;
                        fontMetricsInt.descent = heightPx + getHeightPx();
                        break;
                    }
                    break;
                default:
                    InlineClassHelperKt.throwIllegalArgumentException("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
        }
        return getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@k Canvas canvas, @l CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, @k Paint paint) {
    }
}
