package pk;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h implements ik.b {

    /* renamed from: j, reason: collision with root package name */
    public static final String f80697j = "@#&=*+-_.,:!?()/~'%;$[]";

    /* renamed from: c, reason: collision with root package name */
    public final i f80698c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final URL f80699d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f80700e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public String f80701f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public URL f80702g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public volatile byte[] f80703h;

    /* renamed from: i, reason: collision with root package name */
    public int f80704i;

    public h(URL url) {
        this(url, i.f80706b);
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f80700e;
        return str != null ? str : ((URL) fl.m.e(this.f80699d)).toString();
    }

    public final byte[] d() {
        if (this.f80703h == null) {
            this.f80703h = c().getBytes(ik.b.f60686b);
        }
        return this.f80703h;
    }

    public Map<String, String> e() {
        return this.f80698c.a();
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f80698c.equals(hVar.f80698c)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f80701f)) {
            String str = this.f80700e;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) fl.m.e(this.f80699d)).toString();
            }
            this.f80701f = Uri.encode(str, f80697j);
        }
        return this.f80701f;
    }

    public final URL g() throws MalformedURLException {
        if (this.f80702g == null) {
            this.f80702g = new URL(f());
        }
        return this.f80702g;
    }

    public String h() {
        return f();
    }

    @Override // ik.b
    public int hashCode() {
        if (this.f80704i == 0) {
            int hashCode = c().hashCode();
            this.f80704i = hashCode;
            this.f80704i = (hashCode * 31) + this.f80698c.hashCode();
        }
        return this.f80704i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f80706b);
    }

    public h(URL url, i iVar) {
        this.f80699d = (URL) fl.m.e(url);
        this.f80700e = null;
        this.f80698c = (i) fl.m.e(iVar);
    }

    public h(String str, i iVar) {
        this.f80699d = null;
        this.f80700e = fl.m.c(str);
        this.f80698c = (i) fl.m.e(iVar);
    }
}
