package tz;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class p {

    /* renamed from: c, reason: collision with root package name */
    public ClipboardManager f91345c;

    /* renamed from: a, reason: collision with root package name */
    public final String f91343a = "s_r";

    /* renamed from: b, reason: collision with root package name */
    public final String f91344b = "s_l";

    /* renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f91346d = new LinkedBlockingQueue(10);

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f91347e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f91348f = 0;

    public p(Context context) {
        try {
            this.f91345c = (ClipboardManager) context.getSystemService("clipboard");
        } catch (Exception unused) {
        }
    }

    public ClipData a(boolean z11) {
        Object obj;
        if (this.f91345c == null) {
            return null;
        }
        ClipData f11 = f();
        while (z11 && f11 == null) {
            try {
                obj = this.f91346d.poll(1L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                obj = null;
            }
            ClipData f12 = f();
            if ("s_l".equals(obj) && f12 == null) {
                if (j0.f91313a) {
                    j0.b("疑似应用处于后台不可见状态下调用init，并且接着调用其它api，数据大概率丢失，请检查代码", new Object[0]);
                }
                return f12;
            }
            f11 = f12;
        }
        return f11;
    }

    public void b() {
        this.f91346d.offer("s_r");
    }

    public void c(WeakReference weakReference) {
        this.f91347e = weakReference;
    }

    public void d() {
        this.f91346d.offer("s_l");
    }

    public boolean e() {
        Activity activity;
        WeakReference weakReference = this.f91347e;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
            return false;
        }
        return activity.hasWindowFocus();
    }

    public final ClipData f() {
        ClipDescription clipDescription;
        ClipData clipData = null;
        try {
            clipDescription = this.f91345c.getPrimaryClipDescription();
        } catch (Exception unused) {
            clipDescription = null;
        }
        if (clipDescription == null) {
            return g();
        }
        if (!clipDescription.hasMimeType("text/html") && !clipDescription.hasMimeType("text/plain")) {
            return ClipData.newPlainText("custom", "don't match");
        }
        try {
            clipData = this.f91345c.getPrimaryClip();
        } catch (Exception unused2) {
        }
        return clipData == null ? g() : clipData;
    }

    public final ClipData g() {
        if (!e()) {
            return null;
        }
        int i11 = this.f91348f;
        if (i11 >= 3) {
            this.f91348f = 0;
            return ClipData.newPlainText("custom", "app focus");
        }
        this.f91348f = i11 + 1;
        return null;
    }
}
