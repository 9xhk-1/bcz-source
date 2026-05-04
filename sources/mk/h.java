package mk;

import android.content.Context;
import java.io.File;
import mk.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class h extends d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f73451a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f73452b;

        public a(Context context, String str) {
            this.f73451a = context;
            this.f73452b = str;
        }

        @Override // mk.d.c
        public File a() {
            File cacheDir = this.f73451a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f73452b != null ? new File(cacheDir, this.f73452b) : cacheDir;
        }
    }

    public h(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public h(Context context, long j11) {
        this(context, "image_manager_disk_cache", j11);
    }

    public h(Context context, String str, long j11) {
        super(new a(context, str), j11);
    }
}
