package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m4537isEllipsisMW5ApA(int i11) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m5019equalsimpl0(i11, companion.m5029getEllipsisgIe3tQ8()) || TextOverflow.m5019equalsimpl0(i11, companion.m5031getStartEllipsisgIe3tQ8()) || TextOverflow.m5019equalsimpl0(i11, companion.m5030getMiddleEllipsisgIe3tQ8());
    }
}
