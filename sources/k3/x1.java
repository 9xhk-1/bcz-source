package k3;

import com.baicizhan.app.api.service.BizException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j3.a
/* loaded from: classes3.dex */
public interface x1 extends x2 {
    @m80.k
    kotlinx.coroutines.flow.m0<w1> getState();

    @m80.l
    Object h2(@m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.k
    l3.m o(@m80.k x00.l<? super w1, yz.g2> lVar);
}
