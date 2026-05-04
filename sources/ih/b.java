package ih;

import android.content.res.AssetManager;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b implements ih.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f60542d = "MultiPhraseLoader";

    /* renamed from: a, reason: collision with root package name */
    public d f60543a;

    /* renamed from: b, reason: collision with root package name */
    public e f60544b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0700b f60545c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<Integer> f60546a;

        /* renamed from: b, reason: collision with root package name */
        public AssetManager f60547b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC0700b f60548c;

        public b a() {
            b bVar = new b();
            bVar.f60543a.f60555a = this.f60547b;
            bVar.f60543a.f60559e = this.f60546a;
            bVar.f60543a.f60558d = bVar;
            bVar.f60545c = this.f60548c;
            bVar.f60544b = new e(bVar.f60543a);
            return bVar;
        }

        public a b(AssetManager am2) {
            this.f60547b = am2;
            return this;
        }

        public a c(InterfaceC0700b callback) {
            this.f60548c = callback;
            return this;
        }

        public a d(List<Integer> groupIds) {
            this.f60546a = groupIds;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ih.b$b, reason: collision with other inner class name */
    public interface InterfaceC0700b {
        void b(int progress, float completed, float total);

        void c(boolean success, int code);

        void d();

        void e(int progress, float completed, float total);
    }

    @Override // ih.a
    public void c() {
        InterfaceC0700b interfaceC0700b = this.f60545c;
        if (interfaceC0700b != null) {
            interfaceC0700b.d();
        }
        qb.c.b(f60542d, "on multi load cancelled", new Object[0]);
    }

    @Override // ih.a
    public void d(boolean success, int code) {
        InterfaceC0700b interfaceC0700b = this.f60545c;
        if (interfaceC0700b != null) {
            interfaceC0700b.c(success, code);
        }
        qb.c.b(f60542d, "on multi loaded: " + success + "; code: " + code, new Object[0]);
    }

    @Override // ih.a
    public void e(int progress, float completed, float total) {
        InterfaceC0700b interfaceC0700b = this.f60545c;
        if (interfaceC0700b != null) {
            interfaceC0700b.e(progress, completed, total);
            qb.c.b("whiz", "on multi load progress: " + progress + "; completed: " + completed + "; total: " + total, new Object[0]);
        }
    }

    @Override // ih.a
    public void f(int progress, float completed, float total) {
        InterfaceC0700b interfaceC0700b = this.f60545c;
        if (interfaceC0700b != null) {
            interfaceC0700b.b(progress, completed, total);
        }
    }

    public void h() {
        this.f60544b.i();
    }

    public void i() {
        this.f60544b.n();
    }

    public boolean j() {
        return this.f60544b.o();
    }

    public void k() {
        this.f60544b.j();
    }

    public void l() {
        this.f60544b.p();
    }

    public void m(AssetManager am2) {
        this.f60543a.f60555a = am2;
    }

    public void n(InterfaceC0700b callback) {
        this.f60545c = callback;
    }

    public void o(List<Integer> groupIds) {
        List<Integer> list = this.f60543a.f60559e;
        if (list == groupIds) {
            this.f60544b.f60570c = false;
            return;
        }
        if (groupIds == null || list == null || groupIds.size() != this.f60543a.f60559e.size()) {
            this.f60544b.f60570c = true;
            this.f60543a.f60559e = groupIds;
            return;
        }
        Iterator<Integer> it = groupIds.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (this.f60543a.f60559e.get(i11).intValue() != it.next().intValue()) {
                break;
            } else {
                i11++;
            }
        }
        this.f60544b.f60570c = false;
    }

    public b() {
        this.f60543a = new d();
    }
}
