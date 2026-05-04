package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    private static int anchorTypeToTranslatePercent(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String convertAlignmentToCss(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i11 = AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        return i11 != 1 ? i11 != 2 ? TtmlNode.CENTER : TtmlNode.END : TtmlNode.START;
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i11 = captionStyleCompat.edgeType;
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "unset" : Util.formatInvariant("-0.05em -0.05em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor)) : Util.formatInvariant("0.06em 0.08em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor)) : Util.formatInvariant("0.1em 0.12em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor)) : Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
    }

    private String convertTextSizeToCss(int i11, float f11) {
        float resolveTextSize = SubtitleViewUtils.resolveTextSize(i11, f11, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return resolveTextSize == -3.4028235E38f ? "unset" : Util.formatInvariant("%.2fpx", Float.valueOf(resolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    private static String convertVerticalTypeToCss(int i11) {
        return i11 != 1 ? i11 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String getBlockShearTransformFunction(Cue cue) {
        float f11 = cue.shearDegrees;
        if (f11 == 0.0f) {
            return "";
        }
        int i11 = cue.verticalType;
        return Util.formatInvariant("%s(%.2fdeg)", (i11 == 2 || i11 == 1) ? "skewY" : "skewX", Float.valueOf(f11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0145, code lost:
    
        if (r10 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0148, code lost:
    
        r12 = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        r21 = r12;
        r19 = "top";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014f, code lost:
    
        if (r10 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateWebView() {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.WebViewSubtitleOutput.updateWebView():void");
    }

    public void destroy() {
        this.webView.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (!z11 || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f11, int i11, float f12) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f11;
        this.defaultTextSizeType = i11;
        this.bottomPaddingFraction = f12;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            Cue cue = list.get(i12);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f11, i11, f12);
        invalidate();
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.EMPTY_LIST;
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }
}
