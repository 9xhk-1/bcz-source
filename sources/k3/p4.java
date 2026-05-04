package k3;

import com.baicizhan.app.api.service.BizException;
import com.baicizhan.app.api.service.GameType;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j3.a
/* loaded from: classes3.dex */
public interface p4 extends x2 {
    @m80.l
    Object c(@m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.l
    Object c2(@m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.l
    Object f(@m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.k
    kotlinx.coroutines.flow.m0<o4> getState();

    @m80.k
    l3.m o(@m80.k x00.l<? super o4, yz.g2> lVar);

    @m80.l
    Object q(@m80.k j00.c<? super l3.s> cVar) throws BizException, CancellationException;

    @m80.k
    kotlinx.coroutines.flow.c0<l3.o> u();

    @m80.k
    l3.m w1(@m80.k x00.l<? super l3.o, yz.g2> lVar);

    @m80.l
    Object y0(@m80.k GameType gameType, int i11, @m80.k j00.c<? super p.a<Integer>> cVar) throws BizException, CancellationException;
}
