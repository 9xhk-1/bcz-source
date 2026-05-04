package qk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import pk.o;
import pk.p;
import pk.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes6.dex */
public final class f<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f82351a;

    /* renamed from: b, reason: collision with root package name */
    public final o<File, DataT> f82352b;

    /* renamed from: c, reason: collision with root package name */
    public final o<Uri, DataT> f82353c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<DataT> f82354d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: k, reason: collision with root package name */
        public static final String[] f82357k = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final Context f82358a;

        /* renamed from: b, reason: collision with root package name */
        public final o<File, DataT> f82359b;

        /* renamed from: c, reason: collision with root package name */
        public final o<Uri, DataT> f82360c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f82361d;

        /* renamed from: e, reason: collision with root package name */
        public final int f82362e;

        /* renamed from: f, reason: collision with root package name */
        public final int f82363f;

        /* renamed from: g, reason: collision with root package name */
        public final ik.e f82364g;

        /* renamed from: h, reason: collision with root package name */
        public final Class<DataT> f82365h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f82366i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        public volatile com.bumptech.glide.load.data.d<DataT> f82367j;

        public d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i11, int i12, ik.e eVar, Class<DataT> cls) {
            this.f82358a = context.getApplicationContext();
            this.f82359b = oVar;
            this.f82360c = oVar2;
            this.f82361d = uri;
            this.f82362e = i11;
            this.f82363f = i12;
            this.f82364g = eVar;
            this.f82365h = cls;
        }

        @Nullable
        public final o.a<DataT> a() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f82359b.buildLoadData(d(this.f82361d), this.f82362e, this.f82363f, this.f82364g);
            }
            if (jk.b.a(this.f82361d)) {
                return this.f82360c.buildLoadData(this.f82361d, this.f82362e, this.f82363f, this.f82364g);
            }
            return this.f82360c.buildLoadData(c() ? MediaStore.setRequireOriginal(this.f82361d) : this.f82361d, this.f82362e, this.f82363f, this.f82364g);
        }

        @Nullable
        public final com.bumptech.glide.load.data.d<DataT> b() throws FileNotFoundException {
            o.a<DataT> a11 = a();
            if (a11 != null) {
                return a11.f80730c;
            }
            return null;
        }

        public final boolean c() {
            return this.f82358a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f82366i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f82367j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f82367j;
            if (dVar != null) {
                dVar.cleanup();
            }
        }

        @NonNull
        public final File d(Uri uri) throws FileNotFoundException {
            try {
                Cursor query = this.f82358a.getContentResolver().query(uri, f82357k, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    query.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<DataT> getDataClass() {
            return this.f82365h;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(@NonNull Priority priority, @NonNull d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> b11 = b();
                if (b11 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f82361d));
                    return;
                }
                this.f82367j = b11;
                if (this.f82366i) {
                    cancel();
                } else {
                    b11.loadData(priority, aVar);
                }
            } catch (FileNotFoundException e11) {
                aVar.c(e11);
            }
        }
    }

    public f(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f82351a = context.getApplicationContext();
        this.f82352b = oVar;
        this.f82353c = oVar2;
        this.f82354d = cls;
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        return new o.a<>(new el.e(uri), new d(this.f82351a, this.f82352b, this.f82353c, uri, i11, i12, eVar, this.f82354d));
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && jk.b.d(uri);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f82355a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<DataT> f82356b;

        public a(Context context, Class<DataT> cls) {
            this.f82355a = context;
            this.f82356b = cls;
        }

        @Override // pk.p
        @NonNull
        public final o<Uri, DataT> build(@NonNull s sVar) {
            return new f(this.f82355a, sVar.d(File.class, this.f82356b), sVar.d(Uri.class, this.f82356b), this.f82356b);
        }

        @Override // pk.p
        public final void teardown() {
        }
    }
}
