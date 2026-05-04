package pk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements o<File, ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f80671a = "ByteBufferFileLoader";

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<ByteBuffer> buildLoadData(@NonNull File file, int i11, int i12, @NonNull ik.e eVar) {
        return new o.a<>(new el.e(file), new a(file));
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull File file) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a, reason: collision with root package name */
        public final File f80672a;

        public a(File file) {
            this.f80672a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(@NonNull Priority priority, @NonNull d.a<? super ByteBuffer> aVar) {
            try {
                aVar.b(fl.a.a(this.f80672a));
            } catch (IOException e11) {
                if (Log.isLoggable(d.f80671a, 3)) {
                    Log.d(d.f80671a, "Failed to obtain ByteBuffer for file", e11);
                }
                aVar.c(e11);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements p<File, ByteBuffer> {
        @Override // pk.p
        @NonNull
        public o<File, ByteBuffer> build(@NonNull s sVar) {
            return new d();
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
