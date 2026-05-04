package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private View innerSubtitleView;
    private Output output;
    private CaptionStyleCompat style;
    private int viewType;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Output {
        void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f11, int i11, float f12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.applyEmbeddedStyles && this.applyEmbeddedFontSizes) {
            return this.cues;
        }
        ArrayList arrayList = new ArrayList(this.cues.size());
        for (int i11 = 0; i11 < this.cues.size(); i11++) {
            arrayList.add(removeEmbeddedStyling(this.cues.get(i11)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        if (isInEditMode()) {
            return CaptionStyleCompat.DEFAULT;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? CaptionStyleCompat.DEFAULT : CaptionStyleCompat.createFromCaptionStyle(captioningManager.getUserStyle());
    }

    private Cue removeEmbeddedStyling(Cue cue) {
        Cue.Builder buildUpon = cue.buildUpon();
        if (!this.applyEmbeddedStyles) {
            SubtitleViewUtils.removeAllEmbeddedStyling(buildUpon);
        } else if (!this.applyEmbeddedFontSizes) {
            SubtitleViewUtils.removeEmbeddedFontSizes(buildUpon);
        }
        return buildUpon.build();
    }

    private void setTextSize(int i11, float f11) {
        this.defaultTextSizeType = i11;
        this.defaultTextSize = f11;
        updateOutput();
    }

    private <T extends View & Output> void setView(T t11) {
        removeView(this.innerSubtitleView);
        View view = this.innerSubtitleView;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).destroy();
        }
        this.innerSubtitleView = t11;
        this.output = t11;
        addView(t11);
    }

    private void updateOutput() {
        this.output.update(getCuesWithStylingPreferencesApplied(), this.style, this.defaultTextSize, this.defaultTextSizeType, this.bottomPaddingFraction);
    }

    public void setApplyEmbeddedFontSizes(boolean z11) {
        this.applyEmbeddedFontSizes = z11;
        updateOutput();
    }

    public void setApplyEmbeddedStyles(boolean z11) {
        this.applyEmbeddedStyles = z11;
        updateOutput();
    }

    public void setBottomPaddingFraction(float f11) {
        this.bottomPaddingFraction = f11;
        updateOutput();
    }

    public void setCues(@Nullable List<Cue> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.cues = list;
        updateOutput();
    }

    public void setFixedTextSize(@Dimension int i11, float f11) {
        Context context = getContext();
        setTextSize(2, TypedValue.applyDimension(i11, f11, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f11) {
        setFractionalTextSize(f11, false);
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.style = captionStyleCompat;
        updateOutput();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i11) {
        if (this.viewType == i11) {
            return;
        }
        if (i11 == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.viewType = i11;
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cues = Collections.EMPTY_LIST;
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSizeType = 0;
        this.defaultTextSize = 0.0533f;
        this.bottomPaddingFraction = 0.08f;
        this.applyEmbeddedStyles = true;
        this.applyEmbeddedFontSizes = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.output = canvasSubtitleOutput;
        this.innerSubtitleView = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.viewType = 1;
    }

    public void setFractionalTextSize(float f11, boolean z11) {
        setTextSize(z11 ? 1 : 0, f11);
    }
}
