package k3;

import com.baicizhan.app.api.service.BizException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j3.a
/* loaded from: classes3.dex */
public interface v2 extends x2 {
    @m80.k
    l3.m F2(@m80.k x00.l<? super u2, yz.g2> lVar);

    @m80.l
    Object I(@m80.k j00.c<? super yz.g2> cVar);

    @m80.l
    Object K0(boolean z11, @m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.l
    Object X(@m80.k j00.c<? super yz.g2> cVar);

    @m80.k
    l3.m Y1(@m80.k x00.l<? super l3.o, yz.g2> lVar);

    @m80.l
    Object b1(@m80.k j00.c<? super yz.g2> cVar);

    @m80.l
    Object c(@m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.l
    Object f(@m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.k
    kotlinx.coroutines.flow.m0<u2> getState();

    @m80.l
    Object q(@m80.k j00.c<? super l3.s> cVar) throws BizException, CancellationException;

    @m80.l
    Object q1(@m80.k j00.c<? super p.a<Integer>> cVar) throws BizException, CancellationException;

    @m80.k
    kotlinx.coroutines.flow.c0<l3.o> u();
}
