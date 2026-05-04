package na;

import com.baicizhan.online.bcz_system_api.BczSystemInfos;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import q9.h;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static final String f75017b = "%s/rpc/hero_api/%s/%d";

    /* renamed from: c, reason: collision with root package name */
    public static int f75018c;

    /* renamed from: d, reason: collision with root package name */
    public static List<String> f75019d = Arrays.asList("http://e2.hero.baicizhan.com", "http://e2.hero.baicizhan.com", "http://116.62.77.31", "http://118.178.113.167");

    /* renamed from: a, reason: collision with root package name */
    public String f75020a;

    public static void d() {
        if (e.h(f75019d)) {
            return;
        }
        f75018c = (f75018c + 1) % f75019d.size();
    }

    public static void e(BczSystemInfos checkInfo) {
        List<String> list = checkInfo.other_dns.get(h.f81949m);
        if (e.h(list)) {
            return;
        }
        f75019d = list;
    }

    public final String a() {
        if (e.h(f75019d)) {
            return null;
        }
        int i11 = f75018c;
        if (i11 < 0) {
            f75018c = 0;
        } else if (i11 >= f75019d.size()) {
            d();
        }
        return f75019d.get(f75018c);
    }

    public String b() {
        long currentTimeMillis = System.currentTimeMillis();
        return String.format(Locale.US, f75017b, a(), this.f75020a, Long.valueOf(currentTimeMillis));
    }

    public void c(String methodName) {
        this.f75020a = methodName;
    }
}
