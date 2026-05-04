package qj;

import com.baicizhan.online.user_activity_api.ExportActivityInfo;
import com.baicizhan.online.user_activity_api.ExportParam;
import com.baicizhan.online.user_activity_api.ExportQuota;
import kotlin.Result;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public interface p {
    @m80.l
    Object a(@m80.k ExportParam exportParam, @m80.k j00.c<? super Result<g2>> cVar);

    @m80.l
    Object b(@m80.k j00.c<? super Result<? extends ExportQuota>> cVar);

    @m80.l
    Object c(@m80.k j00.c<? super kotlinx.coroutines.flow.i<? extends ExportActivityInfo>> cVar);
}
