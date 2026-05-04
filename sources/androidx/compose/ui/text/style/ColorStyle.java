package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,147:1\n635#2:148\n114#3,8:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n93#1:148\n93#1:149,8\n*E\n"})
/* loaded from: classes2.dex */
final class ColorStyle implements TextForegroundStyle {
    private final long value;

    public /* synthetic */ ColorStyle(long j11, v vVar) {
        this(j11);
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ColorStyle m4864copy8_81llA$default(ColorStyle colorStyle, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = colorStyle.value;
        }
        return colorStyle.m4866copy8_81llA(j11);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m4865component10d7_KjU() {
        return this.value;
    }

    @k
    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final ColorStyle m4866copy8_81llA(long j11) {
        return new ColorStyle(j11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.m2510equalsimpl0(this.value, ((ColorStyle) obj).value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m2511getAlphaimpl(mo4863getColor0d7_KjU());
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    @l
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo4863getColor0d7_KjU() {
        return this.value;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m4867getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m2516hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m2517toStringimpl(this.value)) + ')';
    }

    private ColorStyle(long j11) {
        this.value = j11;
        if (j11 != 16) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }
}
