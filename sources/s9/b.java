package s9;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.baicizhan.client.business.util.JumpUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f88139c = "taobao";

    @Override // s9.g
    public boolean a() {
        if (TextUtils.isEmpty(this.f88137a.link)) {
            return false;
        }
        String str = this.f88137a.link;
        if (str.startsWith(f88139c)) {
            return JumpUtils.redirectToTaobaoApp(b(), str);
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.addFlags(268435456);
            b().startActivity(intent);
            return true;
        } catch (Exception e11) {
            qb.c.c("AppStrategy", "", e11);
            return false;
        }
    }
}
