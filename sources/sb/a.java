package sb;

import com.baicizhan.client.framework.network.http.HttpRequest;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public HttpRequest f88199a = new HttpRequest();

    /* renamed from: b, reason: collision with root package name */
    public d f88200b = new d();

    /* renamed from: c, reason: collision with root package name */
    public LinkedList<e> f88201c = new LinkedList<>();

    public HttpRequest a() {
        return this.f88199a;
    }

    public d b() {
        return this.f88200b;
    }

    public List<e> c() {
        return Collections.unmodifiableList(this.f88201c);
    }

    public void d(e stat) {
        if (stat != null) {
            this.f88201c.add(stat);
        }
    }
}
