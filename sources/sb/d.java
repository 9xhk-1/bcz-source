package sb;

import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public int f88212c;

    /* renamed from: h, reason: collision with root package name */
    public Map<String, List<String>> f88217h;

    /* renamed from: i, reason: collision with root package name */
    public String f88218i;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f88220k;

    /* renamed from: l, reason: collision with root package name */
    public int f88221l;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f88210a = false;

    /* renamed from: b, reason: collision with root package name */
    public xb.c f88211b = new xb.c();

    /* renamed from: d, reason: collision with root package name */
    public String f88213d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f88214e = "";

    /* renamed from: f, reason: collision with root package name */
    public String f88215f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f88216g = "";

    /* renamed from: j, reason: collision with root package name */
    public int f88219j = 0;

    public String a() {
        return this.f88218i;
    }

    public void b(HttpURLConnection mConn) throws Exception {
        if (mConn != null) {
            this.f88212c = mConn.getResponseCode();
            this.f88213d = mConn.getContentEncoding();
            this.f88214e = mConn.getContentType();
            this.f88217h = mConn.getHeaderFields();
            this.f88216g = mConn.getHeaderField("Content-Disposition");
        }
    }

    public boolean c() {
        int i11 = this.f88212c;
        return i11 == 200 || i11 == 206;
    }

    public boolean d() {
        int i11 = this.f88212c;
        return i11 == 200 || i11 / 100 == 3;
    }

    public void e(String path) {
        this.f88218i = path;
    }
}
