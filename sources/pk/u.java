package pk;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.List;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f80760c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final String f80761d = "ResourceUriLoader";

    /* renamed from: a, reason: collision with root package name */
    public final Context f80762a;

    /* renamed from: b, reason: collision with root package name */
    public final o<Integer, DataT> f80763b;

    public u(Context context, o<Integer, DataT> oVar) {
        this.f80762a = context.getApplicationContext();
        this.f80763b = oVar;
    }

    public static p<Uri, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> d(Context context) {
        return new b(context);
    }

    @Override // pk.o
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return e(uri, i11, i12, eVar);
        }
        if (pathSegments.size() == 2) {
            return f(uri, i11, i12, eVar);
        }
        if (!Log.isLoggable(f80761d, 5)) {
            return null;
        }
        Log.w(f80761d, "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f80762a.getPackageName().equals(uri.getAuthority());
    }

    @Nullable
    public final o.a<DataT> e(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f80763b.buildLoadData(Integer.valueOf(parseInt), i11, i12, eVar);
            }
            if (Log.isLoggable(f80761d, 5)) {
                Log.w(f80761d, "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e11) {
            if (Log.isLoggable(f80761d, 5)) {
                Log.w(f80761d, "Failed to parse resource id from: " + uri, e11);
            }
            return null;
        }
    }

    @Nullable
    public final o.a<DataT> f(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f80762a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f80762a.getPackageName());
        if (identifier != 0) {
            return this.f80763b.buildLoadData(Integer.valueOf(identifier), i11, i12, eVar);
        }
        if (!Log.isLoggable(f80761d, 5)) {
            return null;
        }
        Log.w(f80761d, "Failed to find resource id for: " + uri);
        return null;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements p<Uri, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f80764a;

        public a(Context context) {
            this.f80764a = context;
        }

        @Override // pk.p
        @NonNull
        public o<Uri, AssetFileDescriptor> build(@NonNull s sVar) {
            return new u(this.f80764a, sVar.d(Integer.class, AssetFileDescriptor.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f80765a;

        public b(Context context) {
            this.f80765a = context;
        }

        @Override // pk.p
        @NonNull
        public o<Uri, InputStream> build(@NonNull s sVar) {
            return new u(this.f80765a, sVar.d(Integer.class, InputStream.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
