package ma;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final String f72980b = "ReportV2";

    /* renamed from: c, reason: collision with root package name */
    public static final String f72981c = "report_ready_queue";

    /* renamed from: d, reason: collision with root package name */
    public static final String f72982d = "sending_queue";

    /* renamed from: a, reason: collision with root package name */
    public nc.a f72983a = nc.b.c(nc.b.f75051a);

    public synchronized void a() {
        Set<String> stringSet = this.f72983a.getStringSet(f72981c, new TreeSet());
        if (stringSet.isEmpty()) {
            return;
        }
        this.f72983a.q(f72981c, new TreeSet());
        Set<String> stringSet2 = this.f72983a.getStringSet(f72982d, new TreeSet());
        stringSet2.addAll(stringSet);
        this.f72983a.q(f72982d, stringSet2);
    }

    public Set<String> b() {
        return this.f72983a.getStringSet(f72982d, new TreeSet());
    }

    public boolean c() {
        return this.f72983a.getStringSet(f72981c, new TreeSet()).isEmpty();
    }

    public synchronized void d(String msg) {
        Set<String> stringSet = this.f72983a.getStringSet(f72981c, new TreeSet());
        stringSet.add(msg);
        this.f72983a.q(f72981c, stringSet);
    }

    public synchronized void e(List<String> msg) {
        Set<String> stringSet = this.f72983a.getStringSet(f72981c, new TreeSet());
        stringSet.addAll(msg);
        this.f72983a.q(f72981c, stringSet);
    }

    public void f(Collection<String> reports) {
        Set<String> b11 = b();
        b11.removeAll(reports);
        g(b11);
    }

    public void g(Set<String> queue) {
        this.f72983a.q(f72982d, queue);
    }
}
