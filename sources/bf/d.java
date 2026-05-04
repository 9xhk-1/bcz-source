package bf;

import com.baicizhan.online.notify.NotifyService;
import com.baicizhan.online.notify.UserRemindInfo;
import org.apache.thrift.TException;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<UserRemindInfo, c> {
        public a() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c call(UserRemindInfo userRemindInfo) {
            c cVar = new c();
            cVar.f6810b = userRemindInfo.isEnable();
            cVar.f6809a = userRemindInfo.isWx_enable();
            return cVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<NotifyService.Client, rx.c<UserRemindInfo>> {
        public b() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<UserRemindInfo> call(NotifyService.Client client) {
            try {
                return rx.c.M2(client.get_remind_info());
            } catch (TException e11) {
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f6809a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6810b;
    }

    public rx.c<c> a() {
        return com.baicizhan.client.business.thrift.p.b("/rpc/notify").w5(bc0.c.e()).b2(new b()).c3(new a()).I3(tb0.a.a());
    }
}
