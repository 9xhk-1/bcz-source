package s3;

import com.huawei.hms.framework.common.ContainerUtils;
import m80.k;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f87544a = new g();

    @k
    public final String a() {
        return n3.d.f74377a.a();
    }

    @k
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BCZ Biz v");
        sb2.append(c());
        sb2.append(" (");
        sb2.append(d() ? "Debug" : "Release");
        sb2.append(')');
        return sb2.toString();
    }

    @k
    public final String c() {
        return n3.d.f74377a.d();
    }

    public final boolean d() {
        return n3.d.f74377a.c();
    }

    public final void e() {
        String v22 = f0.v2(ContainerUtils.KEY_VALUE_DELIMITER, 50);
        z6.b bVar = z6.b.f101032b;
        z6.b.j(bVar, h.f87545a, v22, null, 4, null);
        z6.b.j(bVar, h.f87545a, "BCZ Business Module Build Information", null, 4, null);
        z6.b.j(bVar, h.f87545a, v22, null, 4, null);
        z6.b.j(bVar, h.f87545a, "Version: " + c(), null, 4, null);
        z6.b.j(bVar, h.f87545a, "Build Time: " + a(), null, 4, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Build Type: ");
        sb2.append(d() ? "Debug" : "Release");
        z6.b.j(bVar, h.f87545a, sb2.toString(), null, 4, null);
        z6.b.j(bVar, h.f87545a, "Full Info: " + b(), null, 4, null);
        z6.b.j(bVar, h.f87545a, v22, null, 4, null);
    }
}
