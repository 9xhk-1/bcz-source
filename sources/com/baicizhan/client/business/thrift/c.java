package com.baicizhan.client.business.thrift;

import android.content.Context;
import com.baicizhan.client.business.thrift.r;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import com.baicizhan.online.bcz_system_api.BczSystemInfos;
import com.baicizhan.online.bs_fights.BSFights;
import com.baicizhan.online.bs_socials.BSSocials;
import com.baicizhan.online.bs_studys.BSStudys;
import com.baicizhan.online.bs_users.BSUsers;
import com.baicizhan.online.bs_words.BSWords;
import com.baicizhan.online.course_api.CourseApiService;
import com.baicizhan.online.game_api.GameApiService;
import com.baicizhan.online.hero_api.HeroApi;
import com.baicizhan.online.notify.NotifyService;
import com.baicizhan.online.pk_api.PkApiService;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.user_activity_api.UserActivityApiService;
import com.baicizhan.online.user_assistant_api.UserAssistantApiService;
import com.baicizhan.online.user_book.UserBookService;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16573a = "/rpc/users";

    /* renamed from: b, reason: collision with root package name */
    public static final String f16574b = "/rpc/words";

    /* renamed from: c, reason: collision with root package name */
    public static final String f16575c = "/rpc/fights";

    /* renamed from: d, reason: collision with root package name */
    public static final String f16576d = "/rpc/studys";

    /* renamed from: e, reason: collision with root package name */
    public static final String f16577e = "/rpc/socials";

    /* renamed from: f, reason: collision with root package name */
    public static final String f16578f = "/rpc/stats";

    /* renamed from: g, reason: collision with root package name */
    public static final String f16579g = "/rpc/notify";

    /* renamed from: h, reason: collision with root package name */
    public static final String f16580h = "/rpc/unified_user_service";

    /* renamed from: i, reason: collision with root package name */
    public static final String f16581i = "/rpc/user_study";

    /* renamed from: j, reason: collision with root package name */
    public static final String f16582j = "/rpc/assistant";

    /* renamed from: k, reason: collision with root package name */
    public static final String f16583k = "/rpc/bcz_system";

    /* renamed from: l, reason: collision with root package name */
    public static final String f16584l = "/rpc/advertise";

    /* renamed from: m, reason: collision with root package name */
    public static final String f16585m = "/rpc/resource_api";

    /* renamed from: n, reason: collision with root package name */
    public static final String f16586n = "/rpc/pk";

    /* renamed from: o, reason: collision with root package name */
    public static final String f16587o = "/rpc/hero_api";

    /* renamed from: p, reason: collision with root package name */
    public static final String f16588p = "/rpc/course";

    /* renamed from: q, reason: collision with root package name */
    public static final String f16589q = "/rpc/user_book";

    /* renamed from: r, reason: collision with root package name */
    public static final String f16590r = "/rpc/activity";

    /* renamed from: s, reason: collision with root package name */
    public static final String f16591s = "/rpc/bcz_report";

    /* renamed from: t, reason: collision with root package name */
    public static final String f16592t = "/rpc/game";

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f16593u;

    /* renamed from: v, reason: collision with root package name */
    public static final i f16594v;

    /* renamed from: w, reason: collision with root package name */
    public static r f16595w;

    static {
        int[] iArr = {3000, 5000, 10000};
        f16593u = iArr;
        f16594v = new g(iArr);
    }

    public static void a(r.a entry, List<String> dns) {
        if (xb.e.h(dns)) {
            return;
        }
        entry.f16678b.b(dns.get(0));
        if (dns.size() > 1) {
            entry.f16678b.d(dns.get(1));
        }
    }

    public static r b() {
        return f16595w;
    }

    public static void c(Context context) {
        if (f16595w == null) {
            synchronized (r.class) {
                try {
                    if (f16595w == null) {
                        b bVar = new b(context);
                        r rVar = new r();
                        f16595w = rVar;
                        rVar.n(bVar);
                        r rVar2 = f16595w;
                        String[] strArr = h.f16601p;
                        rVar2.l(new r.a("/rpc/users", new a("/rpc/users", strArr[0], strArr[1]), new BSUsers.Client.Factory()));
                        f16595w.l(new r.a("/rpc/words", new a("/rpc/words", strArr[0], strArr[1]), new BSWords.Client.Factory()));
                        f16595w.l(new r.a("/rpc/fights", new a("/rpc/fights", strArr[0], strArr[1]), new BSFights.Client.Factory()));
                        f16595w.l(new r.a("/rpc/studys", new a("/rpc/studys", strArr[0], strArr[1]), new BSStudys.Client.Factory()));
                        f16595w.l(new r.a("/rpc/socials", new a("/rpc/socials", strArr[0], strArr[1]), new BSSocials.Client.Factory()));
                        r rVar3 = f16595w;
                        String[] strArr2 = h.f16603r;
                        rVar3.l(new r.a("/rpc/notify", new a("/rpc/notify", strArr2[0], strArr2[1]), new NotifyService.Client.Factory()));
                        r rVar4 = f16595w;
                        String[] strArr3 = h.f16604s;
                        rVar4.l(new r.a("/rpc/unified_user_service", new a("/rpc/unified_user_service", strArr3[0], strArr3[1]), new UnifiedUserService.Client.Factory()));
                        r rVar5 = f16595w;
                        String[] strArr4 = h.f16605t;
                        rVar5.l(new r.a("/rpc/user_study", new a("/rpc/user_study", strArr4[0], strArr4[1]), new UserStudyApiService.Client.Factory()));
                        r rVar6 = f16595w;
                        String[] strArr5 = h.f16606u;
                        rVar6.l(new r.a("/rpc/assistant", new a("/rpc/assistant", strArr5[0], strArr5[1]), new UserAssistantApiService.Client.Factory()));
                        r rVar7 = f16595w;
                        String[] strArr6 = h.f16607v;
                        rVar7.l(new r.a("/rpc/bcz_system", new a("/rpc/bcz_system", strArr6[0], strArr6[1]), new BczSystemApiService.Client.Factory()));
                        r rVar8 = f16595w;
                        String[] strArr7 = h.f16608w;
                        rVar8.l(new r.a("/rpc/advertise", new a("/rpc/advertise", strArr7[0], strArr7[1]), new AdvertiseApiService.Client.Factory()));
                        r rVar9 = f16595w;
                        String[] strArr8 = h.f16609x;
                        rVar9.l(new r.a("/rpc/resource_api", new a("/rpc/resource_api", strArr8[0], strArr8[1]), new ResourceService.Client.Factory()));
                        r rVar10 = f16595w;
                        String[] strArr9 = h.f16610y;
                        rVar10.l(new r.a("/rpc/pk", new a("/rpc/pk", strArr9[0], strArr9[1]), new PkApiService.Client.Factory()));
                        r rVar11 = f16595w;
                        String[] strArr10 = h.f16611z;
                        rVar11.l(new r.a("/rpc/course", new a("/rpc/course", strArr10[0], strArr10[1]), new CourseApiService.Client.Factory()));
                        f16595w.o();
                        r rVar12 = f16595w;
                        String[] strArr11 = h.E;
                        rVar12.l(new r.a("/rpc/hero_api", new a("/rpc/hero_api", strArr11[0], strArr11[1]), new HeroApi.Client.Factory()));
                        r rVar13 = f16595w;
                        String[] strArr12 = h.A;
                        rVar13.l(new r.a("/rpc/user_book", new a("/rpc/user_book", strArr12[0], strArr12[1]), new UserBookService.Client.Factory()));
                        r rVar14 = f16595w;
                        String[] strArr13 = h.B;
                        rVar14.l(new r.a("/rpc/activity", new a("/rpc/activity", strArr13[0], strArr13[1]), new UserActivityApiService.Client.Factory()));
                        r rVar15 = f16595w;
                        String[] strArr14 = h.C;
                        rVar15.l(new r.a("/rpc/bcz_report", new a("/rpc/bcz_report", strArr14[0], strArr14[1]), new ResourceService.Client.Factory()));
                        r rVar16 = f16595w;
                        String str = h.D[0];
                        rVar16.l(new r.a("/rpc/game", new a("/rpc/game", str, str), new GameApiService.Client.Factory()));
                        f16595w.o();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void d(BczSystemInfos checkInfo) {
        Map<String, List<String>> map = checkInfo.other_dns;
        for (r.a aVar : f16595w.g().values()) {
            String str = aVar.f16677a;
            str.getClass();
            switch (str) {
                case "/rpc/bcz_report":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81953q));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/bcz_system":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81945i));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/socials":
                case "/rpc/fights":
                case "/rpc/studys":
                case "/rpc/users":
                case "/rpc/words":
                    a(aVar, checkInfo.data_dns);
                    break;
                case "/rpc/user_book":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81951o));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/course":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81950n));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/resource_api":
                    if (map != null) {
                        a(aVar, map.get("resource"));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/notify":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81943g));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/activity":
                    if (map != null) {
                        a(aVar, map.get("activity"));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/assistant":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81944h));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/unified_user_service":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81941e));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/hero_api":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81949m));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/stats":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81938b));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/user_study":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81942f));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/game":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81954r));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/advertise":
                    if (map != null) {
                        a(aVar, map.get(q9.h.f81946j));
                        break;
                    } else {
                        break;
                    }
                case "/rpc/pk":
                    if (map != null) {
                        a(aVar, map.get("pk"));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }
}
