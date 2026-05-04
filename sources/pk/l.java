package pk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class l implements o<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f80716a;

    public l(Context context) {
        this.f80716a = context;
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<File> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        return new o.a<>(new el.e(uri), new b(this.f80716a, uri));
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Uri uri) {
        return jk.b.d(uri);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements p<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f80717a;

        public a(Context context) {
            this.f80717a = context;
        }

        @Override // pk.p
        @NonNull
        public o<Uri, File> build(s sVar) {
            return new l(this.f80717a);
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: c, reason: collision with root package name */
        public static final String[] f80718c = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final Context f80719a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f80720b;

        public b(Context context, Uri uri) {
            this.f80719a = context;
            this.f80720b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<File> getDataClass() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(@NonNull Priority priority, @NonNull d.a<? super File> aVar) {
            Cursor query = this.f80719a.getContentResolver().query(this.f80720b, f80718c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    query.close();
                } catch (Throwable th2) {
                    query.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.b(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f80720b));
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
        }
    }
}
