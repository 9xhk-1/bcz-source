package j90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class l extends n<String> implements m, Cloneable {
    @Override // j90.m
    public int[] V(NormalizedString[] normalizedStringArr) {
        if (normalizedStringArr == null) {
            return null;
        }
        ArrayList<NormalizedString> arrayList = NormalizedString.toArrayList(e());
        NormalizedString[] normalizedStringArr2 = (NormalizedString[]) arrayList.toArray(new NormalizedString[0]);
        Object[] d11 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.d(normalizedStringArr, normalizedStringArr2);
        if (d11.length > 0 && !arrayList.containsAll(Arrays.asList(normalizedStringArr)) && d11.length == normalizedStringArr2.length) {
            return new int[0];
        }
        int[] iArr = new int[arrayList.size()];
        Arrays.fill(iArr, -1);
        Iterator<NormalizedString> it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int[] i12 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.i(normalizedStringArr, it.next());
            if (i12.length > 1) {
                iArr = Arrays.copyOf(iArr, (iArr.length + i12.length) - 1);
            }
            if (i12.length != 0) {
                int i13 = 0;
                while (i13 < i12.length) {
                    iArr[i11] = i12[i13];
                    i13++;
                    i11++;
                }
            } else {
                i11++;
            }
        }
        return iArr;
    }

    @Override // j90.m
    public int[] i0(String[] strArr) {
        return V(NormalizedString.toIdentifierGroupArray(strArr));
    }

    public int j(String str) {
        return V(new NormalizedString[]{NormalizedString.valueOf(str)})[0];
    }
}
