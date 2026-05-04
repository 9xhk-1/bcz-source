package androidx.constraintlayout.core.parser;

import java.util.Iterator;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        String json = toJSON();
        if (i12 > 0 || json.length() + i11 >= CLElement.sMaxLine) {
            sb2.append("[\n");
            Iterator<CLElement> it = this.mElements.iterator();
            boolean z11 = true;
            while (it.hasNext()) {
                CLElement next = it.next();
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(",\n");
                }
                addIndent(sb2, CLElement.sBaseIndent + i11);
                sb2.append(next.toFormattedJSON(CLElement.sBaseIndent + i11, i12 - 1));
            }
            sb2.append("\n");
            addIndent(sb2, i11);
            sb2.append("]");
        } else {
            sb2.append(json);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + "[");
        boolean z11 = true;
        for (int i11 = 0; i11 < this.mElements.size(); i11++) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(j2.O);
            }
            sb2.append(this.mElements.get(i11).toJSON());
        }
        return ((Object) sb2) + "]";
    }
}
