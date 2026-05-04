package sh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class o implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f88667a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ad.c f88668b;

    public o(ad.c ss2) {
        this.f88668b = ss2;
    }

    @Override // sh.l
    public synchronized List<Integer> a(int count) {
        try {
            List<yc.b> y11 = this.f88668b.y(this.f88667a, count);
            qb.c.b(k.f88617m, "getNext " + this.f88667a + j2.O + count, new Object[0]);
            if (y11 != null && y11.size() != 0) {
                ArrayList arrayList = new ArrayList(y11.size());
                Iterator<yc.b> it = y11.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(it.next().e0()));
                }
                this.f88667a += arrayList.size();
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        this.f88667a--;
        qb.c.b(k.f88617m, "advanced " + this.f88667a, new Object[0]);
    }

    @Override // sh.l
    public boolean hasNext() {
        return this.f88668b.hasNext();
    }
}
