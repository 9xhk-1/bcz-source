package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Chain;
import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class HChain extends Chain {
    private HAnchor mEnd;
    private HAnchor mLeft;
    private HAnchor mRight;
    private HAnchor mStart;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class HAnchor extends Chain.Anchor {
        public HAnchor(Constraint.HSide hSide) {
            super(Constraint.Side.valueOf(hSide.name()));
        }
    }

    public HChain(String str) {
        super(str);
        this.mLeft = new HAnchor(Constraint.HSide.LEFT);
        this.mRight = new HAnchor(Constraint.HSide.RIGHT);
        this.mStart = new HAnchor(Constraint.HSide.START);
        this.mEnd = new HAnchor(Constraint.HSide.END);
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_CHAIN));
    }

    public HAnchor getEnd() {
        return this.mEnd;
    }

    public HAnchor getLeft() {
        return this.mLeft;
    }

    public HAnchor getRight() {
        return this.mRight;
    }

    public HAnchor getStart() {
        return this.mStart;
    }

    public void linkToEnd(Constraint.HAnchor hAnchor) {
        linkToEnd(hAnchor, 0);
    }

    public void linkToLeft(Constraint.HAnchor hAnchor) {
        linkToLeft(hAnchor, 0);
    }

    public void linkToRight(Constraint.HAnchor hAnchor) {
        linkToRight(hAnchor, 0);
    }

    public void linkToStart(Constraint.HAnchor hAnchor) {
        linkToStart(hAnchor, 0);
    }

    public void linkToEnd(Constraint.HAnchor hAnchor, int i11) {
        linkToEnd(hAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToLeft(Constraint.HAnchor hAnchor, int i11) {
        linkToLeft(hAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToRight(Constraint.HAnchor hAnchor, int i11) {
        linkToRight(hAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToStart(Constraint.HAnchor hAnchor, int i11) {
        linkToStart(hAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToEnd(Constraint.HAnchor hAnchor, int i11, int i12) {
        HAnchor hAnchor2 = this.mEnd;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i11;
        hAnchor2.mGoneMargin = i12;
        this.configMap.put(TtmlNode.END, hAnchor2.toString());
    }

    public void linkToLeft(Constraint.HAnchor hAnchor, int i11, int i12) {
        HAnchor hAnchor2 = this.mLeft;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i11;
        hAnchor2.mGoneMargin = i12;
        this.configMap.put(TtmlNode.LEFT, hAnchor2.toString());
    }

    public void linkToRight(Constraint.HAnchor hAnchor, int i11, int i12) {
        HAnchor hAnchor2 = this.mRight;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i11;
        hAnchor2.mGoneMargin = i12;
        this.configMap.put(TtmlNode.RIGHT, hAnchor2.toString());
    }

    public void linkToStart(Constraint.HAnchor hAnchor, int i11, int i12) {
        HAnchor hAnchor2 = this.mStart;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i11;
        hAnchor2.mGoneMargin = i12;
        this.configMap.put(TtmlNode.START, hAnchor2.toString());
    }

    public HChain(String str, String str2) {
        super(str);
        this.mLeft = new HAnchor(Constraint.HSide.LEFT);
        this.mRight = new HAnchor(Constraint.HSide.RIGHT);
        this.mStart = new HAnchor(Constraint.HSide.START);
        this.mEnd = new HAnchor(Constraint.HSide.END);
        this.config = str2;
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_CHAIN));
        Map<String, String> convertConfigToMap = convertConfigToMap();
        this.configMap = convertConfigToMap;
        if (convertConfigToMap.containsKey("contains")) {
            Ref.addStringToReferences(this.configMap.get("contains"), this.references);
        }
    }
}
