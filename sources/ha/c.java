package ha;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.util.AdCommonHelper;
import com.baicizhan.online.notify.NotifyResult;
import com.baicizhan.online.notify.NotifyService;
import com.google.gson.d;
import i9.m;
import qb0.g;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c.a<NotifyResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f59094a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f59095b;

        public a(final String val$userToken, final Context val$context) {
            this.f59094a = val$userToken;
            this.f59095b = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g<? super NotifyResult> subscriber) {
            try {
                String str = this.f59094a;
                if (TextUtils.isEmpty(str)) {
                    str = m.d();
                }
                NotifyResult notifyResult = c.a(this.f59095b, str).get_latest_notify_v2(AdCommonHelper.INSTANCE.buildAdDeviceInfoSync());
                qb.c.i("RxNotify", "%s", new d().z(notifyResult));
                subscriber.onNext(notifyResult);
                subscriber.onCompleted();
            } catch (Throwable th2) {
                subscriber.onError(th2);
            }
        }
    }

    public static NotifyService.Client a(Context context, String token) throws Exception {
        return (NotifyService.Client) new l("/rpc/notify").e(false).g(token).f(com.baicizhan.client.business.thrift.c.f16594v).c(1).a();
    }

    public static rx.c<NotifyResult> b(final Context context, final String userToken) {
        return rx.c.j1(new a(userToken, context)).w5(bc0.c.e());
    }
}
