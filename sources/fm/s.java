package fm;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class s extends c<km.k> {
    public s() {
    }

    public float Q() {
        Iterator it = this.f52067i.iterator();
        float f11 = 0.0f;
        while (it.hasNext()) {
            float q11 = ((km.k) it.next()).q();
            if (q11 > f11) {
                f11 = q11;
            }
        }
        return f11;
    }

    public s(List<km.k> list) {
        super(list);
    }

    public s(km.k... kVarArr) {
        super(kVarArr);
    }
}
