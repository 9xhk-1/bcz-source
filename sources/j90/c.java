package j90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c implements m {
    @Override // j90.m
    public String H() {
        return "all fields";
    }

    @Override // j90.m
    public int[] V(NormalizedString[] normalizedStringArr) {
        if (normalizedStringArr == null) {
            return null;
        }
        int length = normalizedStringArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    @Override // j90.m
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // j90.m
    public int[] i0(String[] strArr) {
        return V(NormalizedString.toIdentifierGroupArray(strArr));
    }
}
