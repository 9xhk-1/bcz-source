package j90;

import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k extends n<Integer> implements m {
    @Override // j90.m
    public int[] V(NormalizedString[] normalizedStringArr) {
        List<Integer> e11 = e();
        int[] iArr = new int[e11.size()];
        Iterator<Integer> it = e11.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        return iArr;
    }

    @Override // j90.m
    public int[] i0(String[] strArr) {
        return V(NormalizedString.toIdentifierGroupArray(strArr));
    }
}
