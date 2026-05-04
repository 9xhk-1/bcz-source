package j90;

import java.util.HashSet;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h extends n<String> implements m, Cloneable {
    @Override // j90.n, j90.m
    public String H() {
        return "undesired " + super.H();
    }

    @Override // j90.m
    public int[] V(NormalizedString[] normalizedStringArr) {
        if (normalizedStringArr == null) {
            return null;
        }
        HashSet<NormalizedString> hashSet = NormalizedString.toHashSet(e());
        int[] iArr = new int[normalizedStringArr.length - (hashSet.size() - org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.c(normalizedStringArr, hashSet).length)];
        int i11 = 0;
        for (int i12 = 0; i12 < normalizedStringArr.length; i12++) {
            if (!hashSet.contains(normalizedStringArr[i12])) {
                iArr[i11] = i12;
                i11++;
            }
        }
        return iArr;
    }

    @Override // j90.m
    public int[] i0(String[] strArr) {
        return V(NormalizedString.toIdentifierGroupArray(strArr));
    }
}
