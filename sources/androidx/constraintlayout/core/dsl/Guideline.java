package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class Guideline extends Helper {
    private int mEnd;
    private float mPercent;
    private int mStart;

    public Guideline(String str) {
        super(str, new Helper.HelperType(""));
        this.mStart = Integer.MIN_VALUE;
        this.mEnd = Integer.MIN_VALUE;
        this.mPercent = Float.NaN;
    }

    public int getEnd() {
        return this.mEnd;
    }

    public float getPercent() {
        return this.mPercent;
    }

    public int getStart() {
        return this.mStart;
    }

    public void setEnd(int i11) {
        this.mEnd = i11;
        this.configMap.put(TtmlNode.END, String.valueOf(i11));
    }

    public void setPercent(float f11) {
        this.mPercent = f11;
        this.configMap.put("percent", String.valueOf(f11));
    }

    public void setStart(int i11) {
        this.mStart = i11;
        this.configMap.put(TtmlNode.START, String.valueOf(i11));
    }
}
