package ki;

import com.baicizhan.client.business.debug.DebugConfig;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements i {
    @Override // ki.i
    public boolean a() {
        UserLimitInfoV2 G = x.r().G();
        return (G != null && G.show_device == 1) || DebugConfig.getsIntance().vldCameraAdding;
    }
}
