package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(34)
/* loaded from: classes2.dex */
public final class AndroidLayoutApi34 {
    public static final int $stable = 0;

    @m80.k
    public static final AndroidLayoutApi34 INSTANCE = new AndroidLayoutApi34();

    private AndroidLayoutApi34() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRangeForRect$lambda$0(x00.p pVar, RectF rectF, RectF rectF2) {
        return ((Boolean) pVar.invoke(rectF, rectF2)).booleanValue();
    }

    @m80.l
    public final int[] getRangeForRect$ui_text_release(@m80.k TextLayout textLayout, @m80.k RectF rectF, int i11, @m80.k final x00.p<? super RectF, ? super RectF, Boolean> pVar) {
        SegmentFinder a11;
        int[] rangeForRect;
        if (i11 == 1) {
            a11 = Api34SegmentFinder.INSTANCE.toAndroidSegmentFinder$ui_text_release(new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator()));
        } else {
            d.a();
            a11 = a.a(c.a(textLayout.getText(), textLayout.getTextPaint()));
        }
        rangeForRect = textLayout.getLayout().getRangeForRect(rectF, a11, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.e
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                boolean rangeForRect$lambda$0;
                rangeForRect$lambda$0 = AndroidLayoutApi34.getRangeForRect$lambda$0(x00.p.this, rectF2, rectF3);
                return rangeForRect$lambda$0;
            }
        });
        return rangeForRect;
    }
}
