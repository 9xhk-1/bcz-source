package k3;

import com.baicizhan.app.api.service.BizException;
import com.baicizhan.app.api.service.GameCategoryVo;
import com.baicizhan.app.api.service.GameType;
import com.baicizhan.app.api.service.model.BookLanguageType;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j3.a
/* loaded from: classes3.dex */
public interface s0 extends x2 {
    @m80.l
    Object D1(@m80.k j00.c<? super l3.q> cVar) throws BizException, CancellationException;

    @m80.k
    Map<String, String> G() throws BizException, CancellationException;

    @m80.l
    Object P(@m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.l
    Object T(@m80.k j00.c<? super l3.c> cVar) throws BizException, CancellationException;

    @m80.l
    Object U1(@m80.k j00.c<? super List<Integer>> cVar) throws BizException, CancellationException;

    @m80.l
    Object V0(@m80.k String str, @m80.l String str2, @m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    long X1() throws BizException, CancellationException;

    @m80.l
    Object a0(int i11, @m80.k GameCategoryVo gameCategoryVo, @m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.k
    Map<String, String> d0();

    @m80.l
    Object e1(@m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.l
    Object i0(@m80.k j00.c<? super Map<String, String>> cVar) throws BizException, CancellationException;

    @m80.l
    Object n2(@m80.k GameCategoryVo gameCategoryVo, @m80.k j00.c<? super l3.n> cVar) throws BizException, CancellationException;

    @m80.l
    Object o2(@m80.k Map<String, String> map, @m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;

    @m80.l
    Object r0(int i11, @m80.k j00.c<? super BookLanguageType> cVar) throws BizException, CancellationException;

    @m80.l
    Object s0(@m80.k j00.c<? super l3.b> cVar) throws BizException, CancellationException;

    @m80.l
    Object s2(@m80.k j00.c<? super GameType> cVar) throws BizException, CancellationException;

    @m80.l
    Object u1(int i11, @m80.k j00.c<? super Integer> cVar) throws BizException, CancellationException;

    @m80.l
    Object z(int i11, @m80.k j00.c<? super yz.g2> cVar) throws BizException, CancellationException;
}
