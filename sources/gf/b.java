package gf;

import com.baicizhan.online.unified_user_service.Position;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f53657a;

    /* renamed from: b, reason: collision with root package name */
    public String f53658b;

    /* renamed from: c, reason: collision with root package name */
    public int f53659c;

    public static b a(Position position) {
        b bVar = new b();
        bVar.f53659c = position.position_code;
        String str = position.display_name;
        bVar.f53657a = str;
        String str2 = position.name;
        bVar.f53658b = str2;
        if (str == null) {
            bVar.f53657a = "";
        }
        if (str2 == null) {
            bVar.f53658b = "";
        }
        return bVar;
    }
}
