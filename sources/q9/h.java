package q9;

import android.content.Context;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f81937a = "CheckInfoManager";

    /* renamed from: b, reason: collision with root package name */
    public static final String f81938b = "conan";

    /* renamed from: c, reason: collision with root package name */
    public static final String f81939c = "mall";

    /* renamed from: d, reason: collision with root package name */
    public static final String f81940d = "avatar";

    /* renamed from: e, reason: collision with root package name */
    public static final String f81941e = "passport";

    /* renamed from: f, reason: collision with root package name */
    public static final String f81942f = "learn";

    /* renamed from: g, reason: collision with root package name */
    public static final String f81943g = "notify";

    /* renamed from: h, reason: collision with root package name */
    public static final String f81944h = "assistant";

    /* renamed from: i, reason: collision with root package name */
    public static final String f81945i = "system";

    /* renamed from: j, reason: collision with root package name */
    public static final String f81946j = "advertise";

    /* renamed from: k, reason: collision with root package name */
    public static final String f81947k = "resource";

    /* renamed from: l, reason: collision with root package name */
    public static final String f81948l = "pk";

    /* renamed from: m, reason: collision with root package name */
    public static final String f81949m = "hero";

    /* renamed from: n, reason: collision with root package name */
    public static final String f81950n = "course";

    /* renamed from: o, reason: collision with root package name */
    public static final String f81951o = "mywordfavorites";

    /* renamed from: p, reason: collision with root package name */
    public static final String f81952p = "activity";

    /* renamed from: q, reason: collision with root package name */
    public static final String f81953q = "report";

    /* renamed from: r, reason: collision with root package name */
    public static final String f81954r = "game";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.p<BczSystemApiService.Client, Boolean> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(BczSystemApiService.Client client) {
            try {
                x.r().l0(client.check_infos());
                return Boolean.TRUE;
            } catch (Throwable th2) {
                qb.c.c(h.f81937a, "refresh checkinfo failed. ", th2);
                return Boolean.FALSE;
            }
        }
    }

    public static rx.c<Boolean> a(final Context context) {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/bcz_system").c(3)).c3(new a()).w5(bc0.c.e());
    }
}
