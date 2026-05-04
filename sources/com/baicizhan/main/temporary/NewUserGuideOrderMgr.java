package com.baicizhan.main.temporary;

import com.baicizhan.client.business.thrift.l;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import com.baicizhan.online.bcz_system_api.GuideForNewStrategy;
import com.google.gson.d;
import com.xiaomi.mipush.sdk.MiPushClient;
import gi.v;
import i9.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ma.t;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NewUserGuideOrderMgr {

    /* renamed from: b, reason: collision with root package name */
    public static final String f25044b = "NewUserGuideOrderMgr";

    /* renamed from: c, reason: collision with root package name */
    public static final String f25045c = "key_show_first";

    /* renamed from: d, reason: collision with root package name */
    public static final String f25046d = "key_new_user";

    /* renamed from: e, reason: collision with root package name */
    public static final String f25047e = "key_orders";

    /* renamed from: f, reason: collision with root package name */
    public static final int f25048f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f25049g = 1;

    /* renamed from: a, reason: collision with root package name */
    public List<Integer> f25050a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ShowType {
        Praise,
        Remind,
        None
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends bp.a<List<Integer>> {
        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static NewUserGuideOrderMgr f25052a = new NewUserGuideOrderMgr();
    }

    public static NewUserGuideOrderMgr a() {
        return b.f25052a;
    }

    public void b() {
        this.f25050a = null;
        h.f().j(f25047e, "");
        h.f().g(f25046d, false);
        ia.a.i(ia.a.f60471v, false);
    }

    public void c() {
        try {
            ia.a.i(ia.a.f60471v, true);
            GuideForNewStrategy guideForNewStrategy = ((BczSystemApiService.Client) new l("/rpc/bcz_system").a()).get_guide_for_new_strategy();
            this.f25050a = guideForNewStrategy.actionSequence;
            String z11 = new d().z(this.f25050a);
            c.i(f25044b, "%s", z11);
            h.f().h(f25045c, guideForNewStrategy.actionSequence.get(0).intValue());
            h.f().g(f25046d, true);
            h.f().j(f25047e, z11);
            HashMap hashMap = new HashMap();
            hashMap.put("user_group", String.valueOf(guideForNewStrategy.user_group));
            ma.l.b(t.f73002a, MiPushClient.COMMAND_REGISTER, hashMap);
        } catch (Exception e11) {
            c.c(f25044b, "", e11);
        }
    }

    public ShowType d() {
        if (!h.f().a(f25046d, false)) {
            c.i(f25044b, "old orders", new Object[0]);
            return v.c(8192) ? ShowType.Praise : ia.a.a(ia.a.f60471v, false) ? ShowType.Remind : ShowType.None;
        }
        if (this.f25050a == null) {
            List<Integer> list = (List) new d().o(h.f().d(f25047e), new a().getType());
            this.f25050a = list;
            if (list == null) {
                this.f25050a = new ArrayList();
            }
        }
        c.i(f25044b, "new orders %s", new d().z(this.f25050a));
        if (this.f25050a.isEmpty()) {
            return ShowType.None;
        }
        for (int i11 = 0; i11 < this.f25050a.size(); i11++) {
            int intValue = this.f25050a.get(i11).intValue();
            if (intValue == 0 && v.c(8192)) {
                return ShowType.Praise;
            }
            if (intValue == 1 && ia.a.a(ia.a.f60471v, false)) {
                return ShowType.Remind;
            }
        }
        return ShowType.None;
    }

    public NewUserGuideOrderMgr() {
        this.f25050a = null;
    }
}
