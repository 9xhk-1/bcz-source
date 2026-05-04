package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,498:1\n247#2:499\n142#3,2:500\n142#3,2:502\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n*L\n486#1:499\n489#1:500,2\n491#1:502,2\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m1414timesNB67dxo(long j11, long j12) {
        if (!TextUnit.m5311isEmimpl(j12)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m5316toStringimpl(j12)) + '.');
        }
        if (TextUnit.m5311isEmimpl(j11)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m5316toStringimpl(j12)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (TextUnit.m5307getRawTypeimpl(j11) != 0) {
            float m5309getValueimpl = TextUnit.m5309getValueimpl(j12);
            TextUnitKt.m5322checkArithmeticR2X_6o(j11);
            return TextUnitKt.pack(TextUnit.m5307getRawTypeimpl(j11), TextUnit.m5309getValueimpl(j11) * m5309getValueimpl);
        }
        long j13 = DefaultFontSize;
        float m5309getValueimpl2 = TextUnit.m5309getValueimpl(j12);
        TextUnitKt.m5322checkArithmeticR2X_6o(j13);
        return TextUnitKt.pack(TextUnit.m5307getRawTypeimpl(j13), TextUnit.m5309getValueimpl(j13) * m5309getValueimpl2);
    }
}
