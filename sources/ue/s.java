package ue;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.baicizhan.client.business.managers.upgrade.UpgradeManager;
import com.baicizhan.client.business.util.ChannelUtils;
import com.baicizhan.online.bcz_system_api.AppBetaUpdateRequest;
import com.baicizhan.online.bcz_system_api.AppNewVersionResult;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import gi.k0;
import java.util.Locale;
import java.util.Map;
import org.apache.thrift.TException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class s {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.p<AppNewVersionResult, Boolean> {
        public a() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(AppNewVersionResult res) {
            return Boolean.valueOf(UpgradeManager.UpdateType.typeOf(res.type) == UpgradeManager.UpdateType.NEW);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.p<BczSystemApiService.Client, rx.c<AppNewVersionResult>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppBetaUpdateRequest f92162a;

        public b(final AppBetaUpdateRequest val$appRequest) {
            this.f92162a = val$appRequest;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<AppNewVersionResult> call(BczSystemApiService.Client client) {
            try {
                return rx.c.M2(client.get_app_new_version_info(this.f92162a));
            } catch (TException e11) {
                return rx.c.T1(e11);
            }
        }
    }

    public static /* synthetic */ rx.c a(BczSystemApiService.Client client) {
        try {
            return rx.c.M2(client.get_app_feedback_info());
        } catch (TException e11) {
            return rx.c.T1(e11);
        }
    }

    public rx.c<Boolean> b(Context context) {
        AppBetaUpdateRequest appBetaUpdateRequest = new AppBetaUpdateRequest();
        appBetaUpdateRequest.setDevice_id(xb.o.a(context));
        appBetaUpdateRequest.setDevice_manufacturer(Build.MANUFACTURER);
        appBetaUpdateRequest.setDevice_model(Build.MODEL);
        appBetaUpdateRequest.setOs_name("android");
        appBetaUpdateRequest.setOs_sdk(Integer.toString(Build.VERSION.SDK_INT));
        appBetaUpdateRequest.setApp_name("baicizhan");
        appBetaUpdateRequest.setApp_channel(ChannelUtils.getChannel(context));
        Pair<String, Integer> c11 = k0.c(context);
        appBetaUpdateRequest.setShort_version((String) c11.first);
        appBetaUpdateRequest.setLong_version(((Integer) c11.second).intValue());
        return com.baicizhan.client.business.thrift.p.b("/rpc/bcz_system").b2(new b(appBetaUpdateRequest)).w5(bc0.c.a()).c3(new a()).I3(tb0.a.a());
    }

    public rx.c<Map<String, String>> c() {
        return com.baicizhan.client.business.thrift.p.b("/rpc/bcz_system").b2(new wb0.p() { // from class: ue.r
            @Override // wb0.p
            public final Object call(Object obj) {
                return s.a((BczSystemApiService.Client) obj);
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
    }

    public long d() {
        return ia.a.d(ia.a.f60467r);
    }

    public String e(Context context) {
        String f11 = xb.o.f(context);
        if (!xb.o.h(context)) {
            return f11;
        }
        return String.format(Locale.CHINA, "(%s): %s", xb.o.e(context, "DEPLOY_DATE"), f11);
    }
}
