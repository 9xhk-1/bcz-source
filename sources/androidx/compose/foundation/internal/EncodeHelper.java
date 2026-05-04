package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nClipboardUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/EncodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,556:1\n65#2:557\n69#2:560\n60#3:558\n70#3:561\n22#4:559\n22#4:562\n*S KotlinDebug\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/EncodeHelper\n*L\n269#1:557\n270#1:560\n269#1:558\n270#1:561\n269#1:559\n270#1:562\n*E\n"})
/* loaded from: classes.dex */
public final class EncodeHelper {
    public static final int $stable = 8;

    @k
    private Parcel parcel = Parcel.obtain();

    public final void encode(@k SpanStyle spanStyle) {
        long m4500getColor0d7_KjU = spanStyle.m4500getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m2510equalsimpl0(m4500getColor0d7_KjU, companion.m2545getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m558encode8_81llA(spanStyle.m4500getColor0d7_KjU());
        }
        long m4501getFontSizeXSAIIZE = spanStyle.m4501getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m5306equalsimpl0(m4501getFontSizeXSAIIZE, companion2.m5320getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m555encodeR2X_6o(spanStyle.m4501getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m4502getFontStyle4Lr2A7w = spanStyle.m4502getFontStyle4Lr2A7w();
        if (m4502getFontStyle4Lr2A7w != null) {
            int m4673unboximpl = m4502getFontStyle4Lr2A7w.m4673unboximpl();
            encode((byte) 4);
            m560encodenzbMABs(m4673unboximpl);
        }
        FontSynthesis m4503getFontSynthesisZQGJjVo = spanStyle.m4503getFontSynthesisZQGJjVo();
        if (m4503getFontSynthesisZQGJjVo != null) {
            int m4686unboximpl = m4503getFontSynthesisZQGJjVo.m4686unboximpl();
            encode((byte) 5);
            m557encode6p3vJLY(m4686unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m5306equalsimpl0(spanStyle.m4504getLetterSpacingXSAIIZE(), companion2.m5320getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m555encodeR2X_6o(spanStyle.m4504getLetterSpacingXSAIIZE());
        }
        BaselineShift m4499getBaselineShift5SSeXJ0 = spanStyle.m4499getBaselineShift5SSeXJ0();
        if (m4499getBaselineShift5SSeXJ0 != null) {
            float m4855unboximpl = m4499getBaselineShift5SSeXJ0.m4855unboximpl();
            encode((byte) 8);
            m556encode4Dl_Bck(m4855unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m2510equalsimpl0(spanStyle.m4498getBackground0d7_KjU(), companion.m2545getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m558encode8_81llA(spanStyle.m4498getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m555encodeR2X_6o(long j11) {
        long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(j11);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b11 = 0;
        if (!TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5343getUnspecifiedUIouoOA())) {
            if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA())) {
                b11 = 1;
            } else if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA())) {
                b11 = 2;
            }
        }
        encode(b11);
        if (TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j11), companion.m5343getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m5309getValueimpl(j11));
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m556encode4Dl_Bck(float f11) {
        encode(f11);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m557encode6p3vJLY(int i11) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b11 = 0;
        if (!FontSynthesis.m4681equalsimpl0(i11, companion.m4688getNoneGVVA2EU())) {
            if (FontSynthesis.m4681equalsimpl0(i11, companion.m4687getAllGVVA2EU())) {
                b11 = 1;
            } else if (FontSynthesis.m4681equalsimpl0(i11, companion.m4690getWeightGVVA2EU())) {
                b11 = 2;
            } else if (FontSynthesis.m4681equalsimpl0(i11, companion.m4689getStyleGVVA2EU())) {
                b11 = 3;
            }
        }
        encode(b11);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m558encode8_81llA(long j11) {
        m559encodeVKZWuLQ(j11);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m559encodeVKZWuLQ(long j11) {
        this.parcel.writeLong(j11);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m560encodenzbMABs(int i11) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b11 = 0;
        if (!FontStyle.m4670equalsimpl0(i11, companion.m4677getNormal_LCdwA()) && FontStyle.m4670equalsimpl0(i11, companion.m4676getItalic_LCdwA())) {
            b11 = 1;
        }
        encode(b11);
    }

    @k
    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void encode(@k FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    public final void encode(@k TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(@k TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(@k Shadow shadow) {
        m558encode8_81llA(shadow.m2834getColor0d7_KjU());
        encode(Float.intBitsToFloat((int) (shadow.m2835getOffsetF1C5BW0() >> 32)));
        encode(Float.intBitsToFloat((int) (shadow.m2835getOffsetF1C5BW0() & 4294967295L)));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b11) {
        this.parcel.writeByte(b11);
    }

    public final void encode(int i11) {
        this.parcel.writeInt(i11);
    }

    public final void encode(float f11) {
        this.parcel.writeFloat(f11);
    }

    public final void encode(@k String str) {
        this.parcel.writeString(str);
    }
}
