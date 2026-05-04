package s9;

import android.text.TextUtils;
import com.baicizhan.client.business.webview.BczWebExecutorKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i extends a {
    @Override // s9.g
    public boolean a() {
        if (TextUtils.isEmpty(this.f88137a.link)) {
            return false;
        }
        BczWebExecutorKt.startNormalWeb(b(), this.f88137a.link);
        return true;
    }
}
