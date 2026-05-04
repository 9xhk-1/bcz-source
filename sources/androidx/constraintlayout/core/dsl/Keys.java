package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Keys {
    public void append(StringBuilder sb2, String str, int i11) {
        if (i11 != Integer.MIN_VALUE) {
            sb2.append(str);
            sb2.append(":'");
            sb2.append(i11);
            sb2.append("',\n");
        }
    }

    public String unpack(String[] strArr) {
        StringBuilder sb2 = new StringBuilder("[");
        int i11 = 0;
        while (i11 < strArr.length) {
            sb2.append(i11 == 0 ? "'" : ",'");
            sb2.append(strArr[i11]);
            sb2.append("'");
            i11++;
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void append(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb2.append(str);
            sb2.append(":'");
            sb2.append(str2);
            sb2.append("',\n");
        }
    }

    public void append(StringBuilder sb2, String str, float f11) {
        if (Float.isNaN(f11)) {
            return;
        }
        sb2.append(str);
        sb2.append(":");
        sb2.append(f11);
        sb2.append(",\n");
    }

    public void append(StringBuilder sb2, String str, String[] strArr) {
        if (strArr != null) {
            sb2.append(str);
            sb2.append(":");
            sb2.append(unpack(strArr));
            sb2.append(",\n");
        }
    }

    public void append(StringBuilder sb2, String str, float[] fArr) {
        if (fArr != null) {
            sb2.append(str);
            sb2.append("percentWidth:");
            sb2.append(Arrays.toString(fArr));
            sb2.append(",\n");
        }
    }
}
