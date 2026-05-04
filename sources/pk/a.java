package pk;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a<Data> implements o<Uri, Data> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f80658c = "android_asset";

    /* renamed from: d, reason: collision with root package name */
    public static final String f80659d = "file:///android_asset/";

    /* renamed from: e, reason: collision with root package name */
    public static final int f80660e = 22;

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f80661a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0988a<Data> f80662b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: pk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0988a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    public a(AssetManager assetManager, InterfaceC0988a<Data> interfaceC0988a) {
        this.f80661a = assetManager;
        this.f80662b = interfaceC0988a;
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<Data> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        return new o.a<>(new el.e(uri), this.f80662b.a(this.f80661a, uri.toString().substring(f80660e)));
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC0988a<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f80663a;

        public b(AssetManager assetManager) {
            this.f80663a = assetManager;
        }

        @Override // pk.a.InterfaceC0988a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // pk.p
        @NonNull
        public o<Uri, AssetFileDescriptor> build(s sVar) {
            return new a(this.f80663a, this);
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements p<Uri, InputStream>, InterfaceC0988a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f80664a;

        public c(AssetManager assetManager) {
            this.f80664a = assetManager;
        }

        @Override // pk.a.InterfaceC0988a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // pk.p
        @NonNull
        public o<Uri, InputStream> build(s sVar) {
            return new a(this.f80664a, this);
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
