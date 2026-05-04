package mq;

import android.content.Context;
import fr.k;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final String f73638f = "/client/product_id";

    /* renamed from: g, reason: collision with root package name */
    public static final String f73639g = "/client/app_id";

    /* renamed from: h, reason: collision with root package name */
    public static final String f73640h = "/client/cp_id";

    /* renamed from: i, reason: collision with root package name */
    public static final String f73641i = "/client/api_key";

    /* renamed from: j, reason: collision with root package name */
    public static final String f73642j = "/client/client_id";

    /* renamed from: k, reason: collision with root package name */
    public static final String f73643k = "/client/client_secret";

    /* renamed from: a, reason: collision with root package name */
    public String f73644a;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f73646c;

    /* renamed from: b, reason: collision with root package name */
    public mq.b f73645b = mq.b.f73632b;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, String> f73647d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final List<qq.c> f73648e = new ArrayList();

    public class a implements tq.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f73649a;

        public a(h hVar) {
            this.f73649a = hVar;
        }

        @Override // tq.b
        public k<tq.d> a(boolean z11) {
            return this.f73649a.a(z11);
        }

        @Override // tq.b
        public k<tq.d> b() {
            return this.f73649a.a(false);
        }
    }

    public e a(Context context) {
        return new pq.d(context, this.f73644a, this.f73645b, this.f73646c, this.f73647d, this.f73648e, null);
    }

    public e b(Context context, String str) {
        return new pq.d(context, this.f73644a, this.f73645b, this.f73646c, this.f73647d, this.f73648e, str);
    }

    public Map<String, String> c() {
        return new HashMap(this.f73647d);
    }

    public InputStream d() {
        return this.f73646c;
    }

    public mq.b e() {
        return this.f73645b;
    }

    public f f(String str) {
        this.f73647d.put(f73641i, str);
        return this;
    }

    public f g(String str) {
        this.f73647d.put(f73639g, str);
        return this;
    }

    public f h(String str) {
        this.f73647d.put(f73640h, str);
        return this;
    }

    public f i(String str) {
        this.f73647d.put(f73642j, str);
        return this;
    }

    public f j(String str) {
        this.f73647d.put(f73643k, str);
        return this;
    }

    public f k(g gVar) {
        if (gVar != null) {
            this.f73648e.add(qq.c.e(tq.a.class, new b(gVar)).a());
        }
        return this;
    }

    public f l(h hVar) {
        if (hVar != null) {
            this.f73648e.add(qq.c.e(tq.b.class, new a(hVar)).a());
        }
        return this;
    }

    public f m(String str, String str2) {
        this.f73647d.put(str, str2);
        return this;
    }

    public f n(InputStream inputStream) {
        this.f73646c = inputStream;
        return this;
    }

    public f o(String str) {
        this.f73644a = str;
        return this;
    }

    public f p(String str) {
        this.f73647d.put(f73638f, str);
        return this;
    }

    public f q(mq.b bVar) {
        this.f73645b = bVar;
        return this;
    }

    public class b implements tq.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f73651a;

        public b(g gVar) {
            this.f73651a = gVar;
        }

        @Override // tq.a
        public k<tq.d> a(boolean z11) {
            return this.f73651a.a(z11);
        }

        @Override // tq.a
        public k<tq.d> b() {
            return this.f73651a.a(false);
        }

        @Override // tq.a
        public String getUid() {
            return this.f73651a.getUid();
        }

        @Override // tq.a
        public void c(tq.c cVar) {
        }

        @Override // tq.a
        public void d(tq.c cVar) {
        }
    }
}
