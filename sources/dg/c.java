package dg;

import android.content.Context;
import android.database.Cursor;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.RoadmapUtils;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f47950b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f47951c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f47952d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f47953e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f47954f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static volatile c f47955g;

    /* renamed from: a, reason: collision with root package name */
    public int f47956a;

    public static int b(Context context) {
        Cursor d11 = k9.c.j(a.c.f16132g, "select book_id from ZBOOKFINISHINFO where is_current_select_book =?", String.valueOf(1)).d(context);
        if (d11 == null) {
            return 0;
        }
        try {
            if (d11.moveToNext()) {
                return d11.getInt(0);
            }
            return 0;
        } finally {
            d11.close();
        }
    }

    public static c c() {
        if (f47955g == null) {
            synchronized (c.class) {
                try {
                    if (f47955g == null) {
                        f47955g = new c();
                    }
                } finally {
                }
            }
        }
        return f47955g;
    }

    public static boolean e(Context context) {
        Cursor d11 = k9.c.j(a.c.f16128c, "select count(*) from ZLOGINUSER where ZSAVESTATUS =?", String.valueOf(1)).d(context);
        if (d11 == null) {
            return false;
        }
        try {
            return d11.getCount() > 0;
        } finally {
            d11.close();
        }
    }

    public static boolean f(Context context, int bookId) {
        try {
            Cursor d11 = k9.c.j(a.c.f16130e, "select count(*) from " + a.j.b(bookId), new String[0]).d(context);
            if (d11 != null) {
                try {
                    return d11.getCount() > 0;
                } finally {
                    d11.close();
                }
            }
        } catch (Throwable th2) {
            qb.c.c("", "check has learn record failed.", th2);
        }
        return false;
    }

    public static boolean g(Context context, int bookId) {
        String roadmapName = RoadmapUtils.getRoadmapName(bookId);
        File baicizhanFile = PathUtil.getBaicizhanFile(new File(RoadmapUtils.ROADMAP_DIR, roadmapName + PathUtil.BAICIZHAN_RESOURCE_EXTENSION).getPath());
        if (baicizhanFile != null && baicizhanFile.exists() && !baicizhanFile.isDirectory()) {
            return true;
        }
        try {
            try {
                FileUtils.closeQuietly(context.getAssets().open(new File(RoadmapUtils.ROADMAP_DIR, roadmapName + ".json").getPath()));
                return true;
            } catch (IOException e11) {
                e11.printStackTrace();
                FileUtils.closeQuietly(null);
                return false;
            }
        } catch (Throwable th2) {
            FileUtils.closeQuietly(null);
            throw th2;
        }
    }

    public static boolean h(Context context) {
        Cursor d11 = k9.c.j(a.c.f16132g, "select count(*) from ZBOOKRESOURCE", new String[0]).d(context);
        if (d11 != null) {
            try {
                if (d11.moveToNext()) {
                    return d11.getInt(0) >= 68;
                }
            } finally {
                d11.close();
            }
        }
        return false;
    }

    public void a(Context context) {
        if (!e(context)) {
            this.f47956a = 0;
            return;
        }
        this.f47956a |= 1;
        int b11 = b(context);
        if (b11 <= 0) {
            return;
        }
        this.f47956a |= 2;
        if (h(context)) {
            this.f47956a |= 4;
        }
        if (g(context, b11)) {
            this.f47956a |= 8;
        }
        if (f(context, b11)) {
            this.f47956a |= 16;
        }
    }

    public boolean d() {
        return (this.f47956a & 1) == 1;
    }

    public boolean i() {
        return this.f47956a == 31;
    }
}
