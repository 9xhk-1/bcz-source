package pk;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g<Data> implements o<File, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final String f80691b = "FileLoader";

    /* renamed from: a, reason: collision with root package name */
    public final d<Data> f80692a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements d<ParcelFileDescriptor> {
            @Override // pk.g.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // pk.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // pk.g.d
            public Class<ParcelFileDescriptor> getDataClass() {
                return ParcelFileDescriptor.class;
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d<Data> {
        void a(Data data) throws IOException;

        Data b(File file) throws FileNotFoundException;

        Class<Data> getDataClass();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends a<InputStream> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements d<InputStream> {
            @Override // pk.g.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // pk.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // pk.g.d
            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f80692a = dVar;
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<Data> buildLoadData(@NonNull File file, int i11, int i12, @NonNull ik.e eVar) {
        return new o.a<>(new el.e(file), new c(file, this.f80692a));
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull File file) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<Data> implements p<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final d<Data> f80693a;

        public a(d<Data> dVar) {
            this.f80693a = dVar;
        }

        @Override // pk.p
        @NonNull
        public final o<File, Data> build(@NonNull s sVar) {
            return new g(this.f80693a);
        }

        @Override // pk.p
        public final void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final File f80694a;

        /* renamed from: b, reason: collision with root package name */
        public final d<Data> f80695b;

        /* renamed from: c, reason: collision with root package name */
        public Data f80696c;

        public c(File file, d<Data> dVar) {
            this.f80694a = file;
            this.f80695b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            Data data = this.f80696c;
            if (data != null) {
                try {
                    this.f80695b.a(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> getDataClass() {
            return this.f80695b.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void loadData(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            try {
                Data b11 = this.f80695b.b(this.f80694a);
                this.f80696c = b11;
                aVar.b(b11);
            } catch (FileNotFoundException e11) {
                if (Log.isLoggable(g.f80691b, 3)) {
                    Log.d(g.f80691b, "Failed to open file", e11);
                }
                aVar.c(e11);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
