package gi;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.online.notify.NotifyResult;
import com.jiongji.andriod.card.R;
import kc.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public FragmentActivity f53765a;

    /* renamed from: b, reason: collision with root package name */
    public hg.s f53766b;

    /* renamed from: c, reason: collision with root package name */
    public qb0.h f53767c;

    public g0(@NonNull FragmentActivity activity) {
        this.f53765a = activity;
    }

    public void b() {
        qb0.h hVar = this.f53767c;
        if (hVar == null || hVar.isUnsubscribed()) {
            UserRecord p11 = q9.x.r().p();
            this.f53767c = ha.c.b(this.f53765a, p11 != null ? p11.getToken() : null).I3(tb0.a.a()).r5(new a());
        }
    }

    public void c() {
        this.f53765a = null;
        qb0.h hVar = this.f53767c;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.f53767c.unsubscribe();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<NotifyResult> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v6, types: [kc.d, kc.h] */
        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(NotifyResult notifyResult) {
            if (g0.this.f53765a == null || notifyResult.emergency == null) {
                return;
            }
            mc.a.n(g0.this.f53765a, ((u.a) new u.a(g0.this.f53765a).b0(ButtonType.SINGLE_POSITIVE).X(R.drawable.warning_img_normal_default).M(notifyResult.emergency.title).V(notifyResult.emergency.content).C(R.string.i_know)).d(), "server_fatal_error");
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }
}
