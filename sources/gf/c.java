package gf;

import com.baicizhan.online.unified_user_service.SchoolMajorItem;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public String f53660a;

    /* renamed from: b, reason: collision with root package name */
    public int f53661b;

    public static c a(SchoolMajorItem item) {
        if (item == null) {
            return null;
        }
        c cVar = new c();
        cVar.f53661b = item.getMajor_id();
        cVar.f53660a = item.getMajor_name();
        return cVar;
    }
}
