package sh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public LinkedList<Integer> f88520a;

    public b(Collection<Integer> ids) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        this.f88520a = linkedList;
        linkedList.addAll(ids);
    }

    @Override // sh.l
    public synchronized List<Integer> a(int count) {
        if (this.f88520a.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i11 = count - 1;
            if (count <= 0 || this.f88520a.size() <= 0) {
                break;
            }
            arrayList.add(this.f88520a.poll());
            count = i11;
        }
        return arrayList;
    }

    @Override // sh.l
    public boolean hasNext() {
        return this.f88520a.size() > 0;
    }
}
