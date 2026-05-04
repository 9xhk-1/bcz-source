package jk;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: d, reason: collision with root package name */
    public static final String f64280d = "MediaStoreThumbFetcher";

    /* renamed from: a, reason: collision with root package name */
    public final Uri f64281a;

    /* renamed from: b, reason: collision with root package name */
    public final e f64282b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f64283c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f64284b = {"_data"};

        /* renamed from: c, reason: collision with root package name */
        public static final String f64285c = "kind = 1 AND image_id = ?";

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f64286a;

        public a(ContentResolver contentResolver) {
            this.f64286a = contentResolver;
        }

        @Override // jk.d
        public Cursor a(Uri uri) {
            return this.f64286a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f64284b, f64285c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f64287b = {"_data"};

        /* renamed from: c, reason: collision with root package name */
        public static final String f64288c = "kind = 1 AND video_id = ?";

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f64289a;

        public b(ContentResolver contentResolver) {
            this.f64289a = contentResolver;
        }

        @Override // jk.d
        public Cursor a(Uri uri) {
            return this.f64289a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f64287b, f64288c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public c(Uri uri, e eVar) {
        this.f64281a = uri;
        this.f64282b = eVar;
    }

    public static c a(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.e(context).n().g(), dVar, com.bumptech.glide.c.e(context).g(), context.getContentResolver()));
    }

    public static c b(Context context, Uri uri) {
        return a(context, uri, new a(context.getContentResolver()));
    }

    public static c c(Context context, Uri uri) {
        return a(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        InputStream inputStream = this.f64283c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final InputStream d() throws FileNotFoundException {
        InputStream d11 = this.f64282b.d(this.f64281a);
        int a11 = d11 != null ? this.f64282b.a(this.f64281a) : -1;
        return a11 != -1 ? new g(d11, a11) : d11;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(@NonNull Priority priority, @NonNull d.a<? super InputStream> aVar) {
        try {
            InputStream d11 = d();
            this.f64283c = d11;
            aVar.b(d11);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable(f64280d, 3)) {
                Log.d(f64280d, "Failed to find thumbnail file", e11);
            }
            aVar.c(e11);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
