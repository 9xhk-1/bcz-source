package s9;

import android.content.Context;
import com.baicizhan.client.business.managers.ad.entity.Action;
import com.baicizhan.client.business.managers.ad.entity.AdItem;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f {
    public static g a(Context context, AdItem adItem) {
        Action action = adItem.action;
        if (action == null || adItem.backup_atcion == null) {
            if (action != null) {
                return b(context, action);
            }
            Action action2 = adItem.backup_atcion;
            return action2 != null ? b(context, action2) : new e();
        }
        d dVar = new d();
        dVar.b(b(context, adItem.action));
        dVar.b(b(context, adItem.backup_atcion));
        return dVar;
    }

    public static g b(Context context, Action action) {
        int i11 = action.jump_type;
        a hVar = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? null : new h() : new b() : new c() : new i();
        if (hVar == null) {
            qb.c.i("ActionFactory", "%s", new com.google.gson.d().z(action));
            hVar = new e();
        }
        hVar.f88137a = action;
        hVar.f88138b = context;
        return hVar;
    }
}
