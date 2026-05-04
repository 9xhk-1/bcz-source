package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable == null) {
            spannable = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.hasSpan(spannable, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.setSpan(spannable, new IndentationFixSpan(), spannable.length() - 1, spannable.length() - 1);
        }
        return spannable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i11) {
        int lineCount = textLayout.getLineCount();
        for (int i12 = 0; i12 < lineCount; i12++) {
            if (textLayout.getLineBottom(i12) > i11) {
                return i12;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z11) {
        if (z11 && !TextUnit.m5306equalsimpl0(textStyle.m4595getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) && !TextUnit.m5306equalsimpl0(textStyle.m4595getLetterSpacingXSAIIZE(), TextUnit.Companion.m5320getUnspecifiedXSAIIZE())) {
            int m4600getTextAligne0LSkKk = textStyle.m4600getTextAligne0LSkKk();
            TextAlign.Companion companion = TextAlign.Companion;
            if (!TextAlign.m4973equalsimpl0(m4600getTextAligne0LSkKk, companion.m4983getUnspecifiede0LSkKk()) && !TextAlign.m4973equalsimpl0(textStyle.m4600getTextAligne0LSkKk(), companion.m4982getStarte0LSkKk()) && !TextAlign.m4973equalsimpl0(textStyle.m4600getTextAligne0LSkKk(), companion.m4979getJustifye0LSkKk())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m4382toLayoutAlignaXe7zB0(int i11) {
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m4973equalsimpl0(i11, companion.m4980getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m4973equalsimpl0(i11, companion.m4981getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m4973equalsimpl0(i11, companion.m4977getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m4973equalsimpl0(i11, companion.m4982getStarte0LSkKk()) && TextAlign.m4973equalsimpl0(i11, companion.m4978getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m4383toLayoutBreakStrategyxImikfE(int i11) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        if (LineBreak.Strategy.m4902equalsimpl0(i11, companion.m4908getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m4902equalsimpl0(i11, companion.m4907getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m4902equalsimpl0(i11, companion.m4906getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m4384toLayoutHyphenationFrequency3fSNIE(int i11) {
        Hyphens.Companion companion = Hyphens.Companion;
        if (Hyphens.m4871equalsimpl0(i11, companion.m4875getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m4871equalsimpl0(i11, companion.m4876getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m4385toLayoutLineBreakStylehpcqdu8(int i11) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        if (LineBreak.Strictness.m4913equalsimpl0(i11, companion.m4917getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m4913equalsimpl0(i11, companion.m4918getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m4913equalsimpl0(i11, companion.m4919getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m4913equalsimpl0(i11, companion.m4920getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m4386toLayoutLineBreakWordStylewPN0Rpw(int i11) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        return (!LineBreak.WordBreak.m4925equalsimpl0(i11, companion.m4929getDefaultjp8hJ3c()) && LineBreak.WordBreak.m4925equalsimpl0(i11, companion.m4930getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m4387toLayoutTextGranularityduNsdkg(int i11) {
        TextGranularity.Companion companion = TextGranularity.Companion;
        return (!TextGranularity.m4517equalsimpl0(i11, companion.m4521getCharacterDRrd7Zo()) && TextGranularity.m4517equalsimpl0(i11, companion.m4522getWordDRrd7Zo())) ? 1 : 0;
    }
}
