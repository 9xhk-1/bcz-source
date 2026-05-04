package s9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public List<g> f88140a = new ArrayList();

    @Override // s9.g
    public boolean a() {
        Iterator<g> it = this.f88140a.iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public void b(g actionStrategy) {
        this.f88140a.add(actionStrategy);
    }
}
