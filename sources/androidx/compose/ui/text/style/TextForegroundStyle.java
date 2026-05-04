package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface TextForegroundStyle {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,147:1\n635#2:148\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n78#1:148\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @k
        public final TextForegroundStyle from(@l Brush brush, float f11) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m4998from8_81llA(TextDrawStyleKt.m4997modulateDxMtmZc(((SolidColor) brush).m2844getValue0d7_KjU(), f11));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f11);
            }
            throw new NoWhenBranchMatchedException();
        }

        @k
        /* renamed from: from-8_81llA, reason: not valid java name */
        public final TextForegroundStyle m4998from8_81llA(long j11) {
            return j11 != 16 ? new ColorStyle(j11, null) : Unspecified.INSTANCE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Unspecified implements TextForegroundStyle {
        public static final int $stable = 0;

        @k
        public static final Unspecified INSTANCE = new Unspecified();

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        @l
        public Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: getColor-0d7_KjU */
        public long mo4863getColor0d7_KjU() {
            return Color.Companion.m2545getUnspecified0d7_KjU();
        }
    }

    float getAlpha();

    @l
    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo4863getColor0d7_KjU();

    @k
    default TextForegroundStyle merge(@k TextForegroundStyle textForegroundStyle) {
        float takeOrElse;
        boolean z11 = textForegroundStyle instanceof BrushStyle;
        if (!z11 || !(this instanceof BrushStyle)) {
            return (!z11 || (this instanceof BrushStyle)) ? (z11 || !(this instanceof BrushStyle)) ? textForegroundStyle.takeOrElse(new a<TextForegroundStyle>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final TextForegroundStyle invoke() {
                    return TextForegroundStyle.this;
                }
            }) : this : textForegroundStyle;
        }
        ShaderBrush value = ((BrushStyle) textForegroundStyle).getValue();
        takeOrElse = TextDrawStyleKt.takeOrElse(textForegroundStyle.getAlpha(), new a<Float>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                return Float.valueOf(TextForegroundStyle.this.getAlpha());
            }
        });
        return new BrushStyle(value, takeOrElse);
    }

    @k
    default TextForegroundStyle takeOrElse(@k a<? extends TextForegroundStyle> aVar) {
        return !g0.g(this, Unspecified.INSTANCE) ? this : aVar.invoke();
    }
}
