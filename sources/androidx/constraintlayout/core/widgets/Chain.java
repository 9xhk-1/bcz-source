package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i11) {
        int i12;
        ChainHead[] chainHeadArr;
        int i13;
        if (i11 == 0) {
            i12 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i13 = 0;
        } else {
            i12 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i13 = 2;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            ChainHead chainHead = chainHeadArr[i14];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i11, i13, chainHead);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0035, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0047, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r4v44, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r37, androidx.constraintlayout.core.LinearSystem r38, int r39, int r40, androidx.constraintlayout.core.widgets.ChainHead r41) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.LinearSystem, int, int, androidx.constraintlayout.core.widgets.ChainHead):void");
    }
}
