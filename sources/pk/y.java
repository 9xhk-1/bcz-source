package pk;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class y<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f80772b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final c<Data> f80773a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f80774a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f80775b;

        public a(ContentResolver contentResolver) {
            this(contentResolver, false);
        }

        @Override // pk.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f80774a, uri, this.f80775b);
        }

        @Override // pk.p
        public o<Uri, AssetFileDescriptor> build(s sVar) {
            return new y(this);
        }

        public a(ContentResolver contentResolver, boolean z11) {
            this.f80774a = contentResolver;
            this.f80775b = z11;
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f80776a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f80777b;

        public b(ContentResolver contentResolver) {
            this(contentResolver, false);
        }

        @Override // pk.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f80776a, uri, this.f80777b);
        }

        @Override // pk.p
        @NonNull
        public o<Uri, ParcelFileDescriptor> build(s sVar) {
            return new y(this);
        }

        public b(ContentResolver contentResolver, boolean z11) {
            this.f80776a = contentResolver;
            this.f80777b = z11;
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f80778a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f80779b;

        public d(ContentResolver contentResolver) {
            this(contentResolver, false);
        }

        @Override // pk.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f80778a, uri, this.f80779b);
        }

        @Override // pk.p
        @NonNull
        public o<Uri, InputStream> build(s sVar) {
            return new y(this);
        }

        public d(ContentResolver contentResolver, boolean z11) {
            this.f80778a = contentResolver;
            this.f80779b = z11;
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    public y(c<Data> cVar) {
        this.f80773a = cVar;
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<Data> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        return new o.a<>(new el.e(uri), this.f80773a.a(uri));
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Uri uri) {
        return f80772b.contains(uri.getScheme());
    }
}
