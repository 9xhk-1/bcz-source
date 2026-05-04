package mk;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.File;
import mk.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g extends d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f73449a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f73450b;

        public a(Context context, String str) {
            this.f73449a = context;
            this.f73450b = str;
        }

        @Override // mk.d.c
        public File a() {
            File b11 = b();
            if (b11 != null && b11.exists()) {
                return b11;
            }
            File externalCacheDir = this.f73449a.getExternalCacheDir();
            return (externalCacheDir == null || !externalCacheDir.canWrite()) ? b11 : this.f73450b != null ? new File(externalCacheDir, this.f73450b) : externalCacheDir;
        }

        @Nullable
        public final File b() {
            File cacheDir = this.f73449a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f73450b != null ? new File(cacheDir, this.f73450b) : cacheDir;
        }
    }

    public g(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public g(Context context, long j11) {
        this(context, "image_manager_disk_cache", j11);
    }

    public g(Context context, String str, long j11) {
        super(new a(context, str), j11);
    }
}
