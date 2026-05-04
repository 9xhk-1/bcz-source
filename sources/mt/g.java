package mt;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final String f73723e = "android.permission.ACCESS_BACKGROUND_LOCATION";

    public g(f fVar) {
        super(fVar);
    }

    @Override // mt.a, mt.b
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // mt.a, mt.b
    public /* bridge */ /* synthetic */ d b() {
        return super.b();
    }

    @Override // mt.b
    public void c(List<String> list) {
        this.f73674b.j(this);
    }

    @Override // mt.a, mt.b
    public /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    @Override // mt.b
    public void request() {
        f fVar = this.f73674b;
        if (fVar.f73692f) {
            boolean c11 = jt.c.c(fVar.f73687a, "android.permission.ACCESS_FINE_LOCATION");
            boolean c12 = jt.c.c(this.f73674b.f73687a, "android.permission.ACCESS_COARSE_LOCATION");
            if (c11 || c12) {
                f fVar2 = this.f73674b;
                if (fVar2.f73703q == null && fVar2.f73704r == null) {
                    c(null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(f73723e);
                f fVar3 = this.f73674b;
                kt.b bVar = fVar3.f73704r;
                if (bVar != null) {
                    bVar.a(this.f73675c, arrayList, true);
                    return;
                } else {
                    fVar3.f73703q.a(this.f73675c, arrayList);
                    return;
                }
            }
        }
        a();
    }
}
