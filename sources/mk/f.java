package mk;

import android.content.Context;
import java.io.File;
import mk.a;
import mk.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes6.dex */
public final class f extends d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f73447a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f73448b;

        public a(Context context, String str) {
            this.f73447a = context;
            this.f73448b = str;
        }

        @Override // mk.d.c
        public File a() {
            File externalCacheDir = this.f73447a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f73448b != null ? new File(externalCacheDir, this.f73448b) : externalCacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", a.InterfaceC0886a.f73425a);
    }

    public f(Context context, int i11) {
        this(context, "image_manager_disk_cache", i11);
    }

    public f(Context context, String str, int i11) {
        super(new a(context, str), i11);
    }
}
