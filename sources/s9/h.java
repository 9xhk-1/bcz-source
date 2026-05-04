package s9;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.auth.WeixinAuthHelper;
import com.baicizhan.client.business.managers.ad.entity.Action;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h extends a {
    @Override // s9.g
    public boolean a() {
        if (TextUtils.isEmpty(this.f88137a.mini_program_id) || !c9.a.f(b())) {
            return false;
        }
        WeixinAuthHelper A = WeixinAuthHelper.A();
        Context b11 = b();
        Action action = this.f88137a;
        A.D(b11, action.mini_program_id, action.mini_program_path, null);
        return true;
    }
}
