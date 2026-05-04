package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import com.alipay.sdk.m.u.i;
import java.util.Iterator;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CLObjectIterator implements Iterator<CLKey> {
        int mIndex = 0;
        CLObject mObject;

        public CLObjectIterator(CLObject cLObject) {
            this.mObject = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mObject.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public CLKey next() {
            CLKey cLKey = (CLKey) this.mObject.mElements.get(this.mIndex);
            this.mIndex++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + "{ ");
        Iterator<CLElement> it = this.mElements.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            CLElement next = it.next();
            if (z11) {
                z11 = false;
            } else {
                sb2.append(j2.O);
            }
            sb2.append(next.toJSON());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(getDebugName());
        sb2.append("{\n");
        Iterator<CLElement> it = this.mElements.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            CLElement next = it.next();
            if (z11) {
                z11 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(next.toFormattedJSON(CLElement.sBaseIndent + i11, i12 - 1));
        }
        sb2.append("\n");
        addIndent(sb2, i11);
        sb2.append(i.f11099d);
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    @NonNull
    /* renamed from: clone */
    public CLObject mo5597clone() {
        return (CLObject) super.mo5597clone();
    }
}
