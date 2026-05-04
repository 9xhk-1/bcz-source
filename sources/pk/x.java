package pk;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class x<Model> implements o<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    public static final x<?> f80769a = new x<>();

    @Deprecated
    public x() {
    }

    public static <T> x<T> a() {
        return (x<T>) f80769a;
    }

    @Override // pk.o
    public o.a<Model> buildLoadData(@NonNull Model model, int i11, int i12, @NonNull ik.e eVar) {
        return new o.a<>(new el.e(model), new b(model));
    }

    @Override // pk.o
    public boolean handles(@NonNull Model model) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        public static final a<?> f80770a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f80770a;
        }

        @Override // pk.p
        @NonNull
        public o<Model, Model> build(s sVar) {
            return x.a();
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: a, reason: collision with root package name */
        public final Model f80771a;

        public b(Model model) {
            this.f80771a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Model> getDataClass() {
            return (Class<Model>) this.f80771a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(@NonNull Priority priority, @NonNull d.a<? super Model> aVar) {
            aVar.b(this.f80771a);
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
        }
    }
}
