package rq;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mq.a;

/* loaded from: classes7.dex */
public class a extends mq.a {

    /* renamed from: b, reason: collision with root package name */
    public static final List<a.InterfaceC0889a> f84515b = new CopyOnWriteArrayList();

    public static void c() {
        Iterator<a.InterfaceC0889a> it = f84515b.iterator();
        while (it.hasNext()) {
            it.next().onFinish();
        }
    }

    @Override // mq.a
    public void a(a.InterfaceC0889a interfaceC0889a) {
        if (interfaceC0889a != null) {
            f84515b.add(interfaceC0889a);
        }
    }
}
