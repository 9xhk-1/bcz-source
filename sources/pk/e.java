package pk;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final String f80673b = "data:image";

    /* renamed from: c, reason: collision with root package name */
    public static final String f80674c = ";base64";

    /* renamed from: a, reason: collision with root package name */
    public final a<Data> f80675a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<Data> {
        void a(Data data) throws IOException;

        Data b(String str) throws IllegalArgumentException;

        Class<Data> getDataClass();
    }

    public e(a<Data> aVar) {
        this.f80675a = aVar;
    }

    @Override // pk.o
    public o.a<Data> buildLoadData(@NonNull Model model, int i11, int i12, @NonNull ik.e eVar) {
        return new o.a<>(new el.e(model), new b(model.toString(), this.f80675a));
    }

    @Override // pk.o
    public boolean handles(@NonNull Model model) {
        return model.toString().startsWith(f80673b);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final String f80676a;

        /* renamed from: b, reason: collision with root package name */
        public final a<Data> f80677b;

        /* renamed from: c, reason: collision with root package name */
        public Data f80678c;

        public b(String str, a<Data> aVar) {
            this.f80676a = str;
            this.f80677b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            try {
                this.f80677b.a(this.f80678c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> getDataClass() {
            return this.f80677b.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void loadData(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            try {
                Data b11 = this.f80677b.b(this.f80676a);
                this.f80678c = b11;
                aVar.b(b11);
            } catch (IllegalArgumentException e11) {
                aVar.c(e11);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final a<InputStream> f80679a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements a<InputStream> {
            public a() {
            }

            @Override // pk.e.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // pk.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream b(String str) {
                if (!str.startsWith(e.f80673b)) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(e.f80674c)) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }

            @Override // pk.e.a
            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }
        }

        @Override // pk.p
        @NonNull
        public o<Model, InputStream> build(@NonNull s sVar) {
            return new e(this.f80679a);
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
