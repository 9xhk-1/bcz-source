package pk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final List<o<Model, Data>> f80735a;

    /* renamed from: b, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f80736b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f80737a;

        /* renamed from: b, reason: collision with root package name */
        public final Pools.Pool<List<Throwable>> f80738b;

        /* renamed from: c, reason: collision with root package name */
        public int f80739c;

        /* renamed from: d, reason: collision with root package name */
        public Priority f80740d;

        /* renamed from: e, reason: collision with root package name */
        public d.a<? super Data> f80741e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public List<Throwable> f80742f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f80743g;

        public a(@NonNull List<com.bumptech.glide.load.data.d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f80738b = pool;
            fl.m.d(list);
            this.f80737a = list;
            this.f80739c = 0;
        }

        public final void a() {
            if (this.f80743g) {
                return;
            }
            if (this.f80739c < this.f80737a.size() - 1) {
                this.f80739c++;
                loadData(this.f80740d, this.f80741e);
            } else {
                fl.m.e(this.f80742f);
                this.f80741e.c(new GlideException("Fetch failed", new ArrayList(this.f80742f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void b(@Nullable Data data) {
            if (data != null) {
                this.f80741e.b(data);
            } else {
                a();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(@NonNull Exception exc) {
            ((List) fl.m.e(this.f80742f)).add(exc);
            a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f80743g = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f80737a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            List<Throwable> list = this.f80742f;
            if (list != null) {
                this.f80738b.release(list);
            }
            this.f80742f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f80737a.iterator();
            while (it.hasNext()) {
                it.next().cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> getDataClass() {
            return this.f80737a.get(0).getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource getDataSource() {
            return this.f80737a.get(0).getDataSource();
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            this.f80740d = priority;
            this.f80741e = aVar;
            this.f80742f = this.f80738b.acquire();
            this.f80737a.get(this.f80739c).loadData(priority, this);
            if (this.f80743g) {
                cancel();
            }
        }
    }

    public r(@NonNull List<o<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.f80735a = list;
        this.f80736b = pool;
    }

    @Override // pk.o
    public o.a<Data> buildLoadData(@NonNull Model model, int i11, int i12, @NonNull ik.e eVar) {
        o.a<Data> buildLoadData;
        int size = this.f80735a.size();
        ArrayList arrayList = new ArrayList(size);
        ik.b bVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            o<Model, Data> oVar = this.f80735a.get(i13);
            if (oVar.handles(model) && (buildLoadData = oVar.buildLoadData(model, i11, i12, eVar)) != null) {
                bVar = buildLoadData.f80728a;
                arrayList.add(buildLoadData.f80730c);
            }
        }
        if (arrayList.isEmpty() || bVar == null) {
            return null;
        }
        return new o.a<>(bVar, new a(arrayList, this.f80736b));
    }

    @Override // pk.o
    public boolean handles(@NonNull Model model) {
        Iterator<o<Model, Data>> it = this.f80735a.iterator();
        while (it.hasNext()) {
            if (it.next().handles(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f80735a.toArray()) + l50.b.f69928j;
    }
}
