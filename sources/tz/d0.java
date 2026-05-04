package tz;

import android.content.Context;
import com.huawei.hms.update.UpdateConstants;
import java.io.File;
import java.io.IOException;

/* loaded from: classes8.dex */
public class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final sl.f f91256a;

    public d0(sl.f fVar) {
        this.f91256a = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        System.currentTimeMillis();
        Context h11 = m0.a().h();
        String str = h11.getApplicationInfo().sourceDir;
        String str2 = h11.getFilesDir() + File.separator + h11.getPackageName() + UpdateConstants.LOCAL_APK_FILE;
        File file = null;
        try {
            File file2 = new File(str);
            File file3 = new File(str2);
            r.e(null, file2, file3);
            file = file3;
        } catch (IOException e11) {
            if (j0.f91313a) {
                e11.printStackTrace();
            }
        }
        System.currentTimeMillis();
        this.f91256a.a(file);
    }
}
