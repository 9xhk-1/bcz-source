package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.Output {
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private final List<SubtitlePainter> painters;
    private CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    private static Cue repositionVerticalCue(Cue cue) {
        Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        if (cue.lineType == 0) {
            textAlignment.setLine(1.0f - cue.line, 0);
        } else {
            textAlignment.setLine((-cue.line) - 1.0f, 1);
        }
        int i11 = cue.lineAnchor;
        if (i11 == 0) {
            textAlignment.setLineAnchor(2);
        } else if (i11 == 2) {
            textAlignment.setLineAnchor(0);
        }
        return textAlignment.build();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<Cue> list = this.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i11 = paddingBottom - paddingTop;
        float resolveTextSize = SubtitleViewUtils.resolveTextSize(this.textSizeType, this.textSize, height, i11);
        if (resolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Cue cue = list.get(i12);
            if (cue.verticalType != Integer.MIN_VALUE) {
                cue = repositionVerticalCue(cue);
            }
            this.painters.get(i12).draw(cue, this.style, resolveTextSize, SubtitleViewUtils.resolveTextSize(cue.textSizeType, cue.textSize, height, i11), this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f11, int i11, float f12) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f11;
        this.textSizeType = i11;
        this.bottomPaddingFraction = f12;
        while (this.painters.size() < list.size()) {
            this.painters.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new ArrayList();
        this.cues = Collections.EMPTY_LIST;
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }
}
