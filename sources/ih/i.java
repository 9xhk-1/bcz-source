package ih;

import android.content.res.AssetManager;
import com.baicizhan.main.phrasetraining.data.bean.Phrase;
import com.baicizhan.main.phrasetraining.data.bean.TopicPatterns;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i implements ih.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f60595d = "SinglePhraseLoader";

    /* renamed from: a, reason: collision with root package name */
    public d f60596a;

    /* renamed from: b, reason: collision with root package name */
    public e f60597b;

    /* renamed from: c, reason: collision with root package name */
    public b f60598c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f60599a;

        /* renamed from: b, reason: collision with root package name */
        public AssetManager f60600b;

        /* renamed from: c, reason: collision with root package name */
        public b f60601c;

        public i a() {
            i iVar = new i();
            iVar.f60596a.f60555a = this.f60600b;
            iVar.f60596a.f60559e = new ArrayList(1);
            iVar.f60596a.f60559e.add(Integer.valueOf(this.f60599a));
            iVar.f60596a.f60558d = iVar;
            iVar.f60598c = this.f60601c;
            iVar.f60597b = new e(iVar.f60596a);
            return iVar;
        }

        public a b(AssetManager am2) {
            this.f60600b = am2;
            return this;
        }

        public a c(b callback) {
            this.f60601c = callback;
            return this;
        }

        public a d(int groupId) {
            this.f60599a = groupId;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void c();

        void d(boolean success, int code);

        void g(int progress);
    }

    @Override // ih.a
    public void c() {
        b bVar = this.f60598c;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // ih.a
    public void d(boolean success, int code) {
        b bVar = this.f60598c;
        if (bVar != null) {
            bVar.d(success, code);
        }
        qb.c.b(f60595d, "single on loaded: " + success + "; code: " + code, new Object[0]);
    }

    @Override // ih.a
    public void e(int progress, float completed, float total) {
        b bVar = this.f60598c;
        if (bVar != null) {
            bVar.g(progress);
            qb.c.b("whiz", "on load progress: " + progress + "; completed: " + completed + "; total: " + total, new Object[0]);
        }
    }

    public void h() {
        this.f60597b.i();
    }

    public Map<Integer, Phrase> i() {
        if (this.f60596a.f60557c.isEmpty()) {
            return null;
        }
        return this.f60596a.f60557c.get(0);
    }

    public TopicPatterns j() {
        if (this.f60596a.f60556b.isEmpty()) {
            return null;
        }
        return this.f60596a.f60556b.get(0);
    }

    public boolean k() {
        return this.f60597b.o();
    }

    public void l() {
        this.f60597b.j();
    }

    public void m() {
        this.f60597b.p();
    }

    public void n(AssetManager am2) {
        this.f60596a.f60555a = am2;
    }

    public void o(b callback) {
        this.f60598c = callback;
    }

    public void p(int groupId) {
        List<Integer> list = this.f60596a.f60559e;
        if (list != null && 1 == list.size() && this.f60596a.f60559e.get(0).intValue() == groupId) {
            this.f60597b.f60570c = false;
            return;
        }
        List<Integer> list2 = this.f60596a.f60559e;
        if (list2 != null) {
            list2.clear();
        }
        this.f60596a.f60559e.add(Integer.valueOf(groupId));
        this.f60597b.f60570c = true;
    }

    public i() {
        this.f60596a = new d();
    }

    @Override // ih.a
    public void f(int progress, float completed, float total) {
    }
}
