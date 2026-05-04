package nk;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f75175a = "GlideRuntimeCompat";

    /* renamed from: b, reason: collision with root package name */
    public static final String f75176b = "cpu[0-9]+";

    /* renamed from: c, reason: collision with root package name */
    public static final String f75177c = "/sys/devices/system/cpu/";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Pattern f75178a;

        public a(Pattern pattern) {
            this.f75178a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f75178a.matcher(str).matches();
        }
    }

    public static int a() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static int b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File(f75177c).listFiles(new a(Pattern.compile(f75176b)));
        } catch (Throwable th2) {
            try {
                if (Log.isLoggable(f75175a, 6)) {
                    Log.e(f75175a, "Failed to calculate accurate cpu count", th2);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                fileArr = null;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
