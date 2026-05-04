package ih;

import android.content.res.AssetManager;
import android.util.SparseArray;
import com.baicizhan.client.framework.asynctask.LAsyncTask;
import com.baicizhan.main.phrasetraining.data.bean.PhraseGroup;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f60585d = "PhraseGroupLoader";

    /* renamed from: a, reason: collision with root package name */
    public AssetManager f60586a;

    /* renamed from: b, reason: collision with root package name */
    public c f60587b;

    /* renamed from: c, reason: collision with root package name */
    public b f60588c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public AssetManager f60589a;

        /* renamed from: b, reason: collision with root package name */
        public c f60590b;

        public g a() {
            g gVar = new g();
            gVar.f60586a = this.f60589a;
            gVar.f60587b = this.f60590b;
            return gVar;
        }

        public a b(AssetManager am2) {
            this.f60589a = am2;
            return this;
        }

        public a c(c callback) {
            this.f60590b = callback;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends LAsyncTask<Void, Void, d> {
        public b() {
            N(xb.f.o(g.class.getName()));
            A(1);
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public d f(Void... arg0) {
            d dVar = new d();
            try {
                List<PhraseGroup> phraseGroups = PhraseGroup.getPhraseGroups(g.this.f60586a);
                dVar.f60593b = phraseGroups;
                if (phraseGroups != null && !phraseGroups.isEmpty()) {
                    dVar.f60594c = new SparseArray<>(dVar.f60593b.size());
                    for (PhraseGroup phraseGroup : dVar.f60593b) {
                        dVar.f60594c.put(phraseGroup.getGroupId(), Boolean.valueOf(i9.j.b(hh.b.f59340j + phraseGroup.getGroupId())));
                    }
                    dVar.f60592a = true;
                    return dVar;
                }
                qb.c.d(g.f60585d, "phrase group failed for datas null or empty: " + dVar.f60593b, new Object[0]);
                dVar.f60592a = false;
                return dVar;
            } catch (Throwable th2) {
                qb.c.c(g.f60585d, "phrase group load failed. ", th2);
                return dVar;
            }
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void w(d result) {
            if (g.this.f60587b != null) {
                g.this.f60587b.h0(result.f60592a, result.f60593b, result.f60594c);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void h0(boolean success, List<PhraseGroup> datas, SparseArray<Boolean> studyTags);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f60592a;

        /* renamed from: b, reason: collision with root package name */
        public List<PhraseGroup> f60593b;

        /* renamed from: c, reason: collision with root package name */
        public SparseArray<Boolean> f60594c;

        public d() {
        }
    }

    public final b e() {
        String o11 = xb.f.o(g.class.getName());
        LAsyncTask<?, ?, ?> K = LAsyncTask.K(o11);
        if (K != null) {
            K.d();
            LAsyncTask.G(0, o11);
        }
        return new b();
    }

    public void f() {
        b e11 = e();
        this.f60588c = e11;
        e11.g(new Void[0]);
    }

    public void g(AssetManager am2) {
        this.f60586a = am2;
    }

    public void h(c callback) {
        this.f60587b = callback;
    }

    public g() {
    }
}
