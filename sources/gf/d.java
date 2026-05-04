package gf;

import com.baicizhan.online.unified_user_service.SearchSchoolItem;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f53662a;

    /* renamed from: b, reason: collision with root package name */
    public int f53663b;

    /* renamed from: c, reason: collision with root package name */
    public String f53664c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f53665d;

    public static d a(SearchSchoolItem searchSchoolItem) {
        d dVar = new d();
        dVar.f53664c = searchSchoolItem.getDescrp();
        dVar.f53662a = searchSchoolItem.getSchool_name();
        dVar.f53663b = searchSchoolItem.school_id;
        dVar.f53665d = searchSchoolItem.is_university;
        return dVar;
    }
}
