package fa;

import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public List<String> f51449d;

    /* renamed from: e, reason: collision with root package name */
    public int f51450e;

    /* renamed from: f, reason: collision with root package name */
    public String f51451f;

    public c(List<String> dnsList, String path) {
        this.f51449d = dnsList;
        this.f51451f = path;
    }

    @Override // fa.a
    public void a() {
        super.a();
        if (e.h(this.f51449d)) {
            return;
        }
        this.f51450e = (this.f51450e + 1) % this.f51449d.size();
    }

    @Override // fa.a
    public void c() {
        super.c();
        this.f51450e = 0;
    }

    @Override // fa.b
    public String getUrl() {
        if (!b() || TextUtils.isEmpty(this.f51451f) || e.h(this.f51449d)) {
            return null;
        }
        String format = String.format(Locale.CHINA, "%s%s", this.f51449d.get(this.f51450e), this.f51451f);
        a();
        return format;
    }
}
