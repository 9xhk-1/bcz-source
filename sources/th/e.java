package th;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.models.WordClozeRecord;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.bs_users.BSUsers;
import com.baicizhan.online.user_assistant_api.UserAssistantApiService;
import com.baicizhan.online.user_assistant_api.UserBetaInfo;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.baicizhan.online.user_study_api.UserStudyConfig;
import gi.a0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.apache.thrift.TException;
import org.json.JSONObject;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90593a = "HomelessObservables";

    /* renamed from: b, reason: collision with root package name */
    public static Executor f90594b = Executors.newSingleThreadExecutor();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90595a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f90596b;

        public a(final Context val$context, final int val$bookId) {
            this.f90595a = val$context;
            this.f90596b = val$bookId;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            i9.k.c(this.f90595a, this.f90596b);
            List<WordClozeRecord> j11 = i9.k.j(this.f90595a, this.f90596b);
            String str = "global.word_cloze_book_table_base." + this.f90596b;
            if (j11 == null || j11.isEmpty()) {
                i9.f.j(this.f90595a, str, false);
            }
            if (i9.f.c(this.f90595a, str)) {
                qb.c.b("whiz", "time consume cloze, pre inited: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                return Boolean.TRUE;
            }
            Map<Integer, WordClozeRecord> I = x.r().I();
            Collection<WordClozeRecord> values = I == null ? null : I.values();
            if (values == null || values.isEmpty()) {
                qb.c.b("whiz", "time consume cloze, records empty: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                return Boolean.TRUE;
            }
            i9.k.l(this.f90595a, this.f90596b, values);
            i9.f.j(this.f90595a, str, true);
            qb.c.b("whiz", "time consume cloze, aft inited: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.p<UserStudyApiService.Client, rx.c<UserStudyConfig>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f90597a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f90598b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserStudyConfig f90599c;

        public b(final String val$configKey, final int val$type, final UserStudyConfig val$cacheConfig) {
            this.f90597a = val$configKey;
            this.f90598b = val$type;
            this.f90599c = val$cacheConfig;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<UserStudyConfig> call(UserStudyApiService.Client client) {
            try {
                qb.c.i(e.f90593a, "syncExtraConfig [%s, %d] ", this.f90597a, Integer.valueOf(this.f90598b));
                UserStudyConfig userStudyConfig = this.f90599c;
                if (userStudyConfig == null) {
                    userStudyConfig = client.get_user_study_config();
                }
                if (userStudyConfig == null) {
                    userStudyConfig = new UserStudyConfig();
                }
                if (TextUtils.isEmpty(userStudyConfig.extra_config)) {
                    userStudyConfig.extra_config = "{}";
                }
                JSONObject jSONObject = new JSONObject(userStudyConfig.extra_config);
                jSONObject.put(this.f90597a, this.f90598b);
                String jSONObject2 = jSONObject.toString();
                userStudyConfig.extra_config = jSONObject2;
                qb.c.i(e.f90593a, "syncExtraConfig send %s", jSONObject2);
                client.set_study_extra_config(userStudyConfig.extra_config);
                return rx.c.M2(userStudyConfig);
            } catch (Exception e11) {
                qb.c.d(e.f90593a, "syncExtraConfig failed. " + e11, new Object[0]);
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements wb0.p<BSUsers.Client, rx.c<i>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90600a;

        public c(final Context val$context) {
            this.f90600a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<i> call(BSUsers.Client client) {
            try {
                UserAssistantApiService.Client client2 = (UserAssistantApiService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/assistant");
                i iVar = new i();
                iVar.f90603b = client2.check_feedback_msg(DeviceUtil.getUniqueID(this.f90600a));
                iVar.f90604c = client2.get_activity_updated_time();
                return rx.c.M2(iVar);
            } catch (TException e11) {
                qb.c.d(e.f90593a, "checkNew failed. " + e11, new Object[0]);
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements wb0.p<UserStudyApiService.Client, rx.c<Boolean>> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Boolean> call(UserStudyApiService.Client client) {
            int i11;
            try {
                if (TimeUtil.isLunarNewYear()) {
                    qb.c.i(e.f90593a, "request color egg", new Object[0]);
                    i11 = client.show_color_egg(0);
                } else {
                    i11 = 0;
                }
                return rx.c.M2(Boolean.valueOf(i11 != 0));
            } catch (TException e11) {
                qb.c.d(e.f90593a, "checkIfPopNewyearCoin failed. " + e11, new Object[0]);
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: th.e$e, reason: collision with other inner class name */
    public class CallableC1203e implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90601a;

        public CallableC1203e(final Context val$context) {
            this.f90601a = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            qb.c.i(e.f90593a, "mianRefreshTask", new Object[0]);
            try {
                UserAssistantApiService.Client client = (UserAssistantApiService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/assistant");
                AdvertiseApiService.Client client2 = (AdvertiseApiService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/advertise");
                e.l(this.f90601a);
                a0.g().n(this.f90601a);
                r9.e.g().i(client2);
                e.j(this.f90601a, client);
                q9.h.a(this.f90601a).t6().p();
                return Boolean.TRUE;
            } catch (Throwable th2) {
                qb.c.c(e.f90593a, "error ", th2);
                throw vb0.a.c(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends bp.a<List<Integer>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends bp.a<List<Integer>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements wb0.p<UserStudyApiService.Client, rx.c<UserStudyConfig>> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<UserStudyConfig> call(UserStudyApiService.Client client) {
            try {
                return rx.c.M2(client.get_user_study_config());
            } catch (TException e11) {
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f90602a;

        /* renamed from: b, reason: collision with root package name */
        public int f90603b;

        /* renamed from: c, reason: collision with root package name */
        public int f90604c;
    }

    public static rx.c<i> e(final Context context) {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/users")).b2(new c(context)).w5(bc0.c.a());
    }

    public static rx.c<Boolean> f() {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study")).b2(new d()).w5(bc0.c.a());
    }

    public static rx.c<UserStudyConfig> g() {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study")).b2(new h()).w5(bc0.c.a());
    }

    public static rx.c<Boolean> h(final Context context, final int bookId) {
        return rx.c.z2(new a(context, bookId)).w5(bc0.c.e());
    }

    public static rx.c<Boolean> i(final Context context) {
        return rx.c.z2(new CallableC1203e(context)).w5(bc0.c.e());
    }

    public static void j(Context context, UserAssistantApiService.Client client) {
        try {
            UserBetaInfo userBetaInfo = client.get_beta_user_types_v2();
            List<Integer> beta_types = userBetaInfo.getBeta_types();
            UserRecord p11 = x.r().p();
            if (p11 != null) {
                p11.setBetaTypeList(beta_types);
            }
            i9.f.l(context, i9.f.f60365c0, beta_types, new f().getType(), false);
            i9.f.l(context, i9.f.f60367d0, userBetaInfo.getHigh_level_book_ids(), new g().getType(), false);
            qb.c.b(f90593a, "beta types: " + beta_types, new Object[0]);
        } catch (TException e11) {
            qb.c.d(f90593a, "refreshBetaUser failed. " + e11, new Object[0]);
            e11.printStackTrace();
        }
    }

    public static rx.c<UserStudyConfig> k(final UserStudyConfig cacheConfig, final String configKey, final int type) {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study")).b2(new b(configKey, type, cacheConfig)).w5(bc0.c.b(f90594b));
    }

    public static void l(Context context) {
        SchedulePrepareObservables.T(context, x.r().k()).t6().x(new wb0.b() { // from class: th.c
            @Override // wb0.b
            public final void call(Object obj) {
                e.a((UserLimitInfoV2) obj);
            }
        }, new wb0.b() { // from class: th.d
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c(e.f90593a, "", (Throwable) obj);
            }
        });
    }

    public static /* synthetic */ void a(UserLimitInfoV2 userLimitInfoV2) {
    }
}
