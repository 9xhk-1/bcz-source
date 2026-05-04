package i9;

import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.PathUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f60404a = "KVHelperLarge";

    /* renamed from: b, reason: collision with root package name */
    public static g f60405b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f60406c = "KVHelperLarge/";

    public static g c() {
        if (f60405b == null) {
            synchronized (h.class) {
                try {
                    if (f60405b == null) {
                        f60405b = new g();
                    }
                } finally {
                }
            }
        }
        return f60405b;
    }

    public final File a(String key) {
        return PathUtil.getBaicizhanFile(new File(f60406c, key + PathUtil.BAICIZHAN_RESOURCE_EXTENSION).getPath());
    }

    public String b(String key) {
        File a11 = a(key);
        try {
            return a11.exists() ? FileUtils.readAll(new FileInputStream(a11)) : "";
        } catch (Exception e11) {
            qb.c.c(f60404a, "", e11);
            return "";
        }
    }

    public void d(String key, String value) {
        File a11 = a(key);
        try {
            if (a11 == null) {
                throw new IOException("roadmap file failed ");
            }
            if (!a11.getParentFile().exists()) {
                a11.getParentFile().mkdirs();
            }
            FileUtils.stringToFile(a11.getAbsolutePath(), value);
        } catch (Exception e11) {
            qb.c.c(f60404a, "", e11);
        }
    }
}
