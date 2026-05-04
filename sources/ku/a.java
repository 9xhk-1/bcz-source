package ku;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a implements lu.c {
    public abstract Collection<b2> a();

    @Override // lu.c
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = a().iterator();
        while (it.hasNext()) {
            sb2.append(((b2) it.next()).e());
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b().equals(((a) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
