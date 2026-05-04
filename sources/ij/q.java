package ij;

import java.util.List;
import java.util.Set;
import kotlin.Result;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public interface q extends m, g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ Object E(q qVar, long j11, boolean z11, j00.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWords-0E7RQCE");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return qVar.k0(j11, z11, cVar);
    }

    static /* synthetic */ Object X(q qVar, boolean z11, j00.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooksInfo-gIAlu-s");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return qVar.L(z11, cVar);
    }

    @m80.l
    Object A(@m80.k byte[] bArr, @m80.k j00.c<? super Result<? extends List<c0>>> cVar);

    @m80.l
    Object B(long j11, @m80.k j00.c<? super Result<String>> cVar);

    @m80.l
    Object D(long j11, long j12, int i11, @m80.k j00.c<? super Result<Boolean>> cVar);

    @m80.l
    Object I(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super Result<? extends List<c0>>> cVar);

    @m80.l
    Object K(@m80.k j00.c<? super Result<Boolean>> cVar);

    @m80.l
    Object L(boolean z11, @m80.k j00.c<? super Result<x>> cVar);

    @m80.l
    Object P(@m80.k j00.c<? super Result<g2>> cVar);

    @m80.l
    Object Q(@m80.k String str, @m80.k j00.c<? super Result<kj.a>> cVar);

    @m80.l
    Object S(long j11, @m80.k j00.c<? super Result<Boolean>> cVar);

    @m80.l
    Object V(@m80.k byte[] bArr, @m80.k j00.c<? super Result<? extends List<c0>>> cVar);

    @m80.k
    kotlinx.coroutines.flow.i<x> W();

    boolean Z();

    @m80.l
    Object a0(@m80.k String str, @m80.k j00.c<? super Result<? extends List<c0>>> cVar);

    @m80.k
    kotlinx.coroutines.flow.i<List<z>> b(long j11);

    @m80.l
    Object b0(@m80.k String str, @m80.k List<Integer> list, @m80.k j00.c<? super Result<kj.a>> cVar);

    @m80.k
    kotlinx.coroutines.flow.i<List<z>> c();

    @m80.l
    Object c0(@m80.k c0 c0Var, @m80.k Set<Long> set, @m80.k j00.c<? super Result<Boolean>> cVar);

    @m80.k
    kotlinx.coroutines.flow.i<kj.a> f(long j11);

    @m80.l
    Object h0(@m80.k String str, @m80.k j00.c<? super Result<kj.a>> cVar);

    @m80.l
    Object i(@m80.k Set<Long> set, @m80.k List<c0> list, @m80.k j00.c<? super Result<Boolean>> cVar);

    @m80.l
    Object j0(long j11, @m80.k j00.c<? super Result<kj.a>> cVar);

    @m80.l
    Object k(@m80.k j00.c<? super Boolean> cVar);

    @m80.l
    Object k0(long j11, boolean z11, @m80.k j00.c<? super Result<? extends List<z>>> cVar);

    @m80.l
    Object m(@m80.k j00.c<? super Result<b>> cVar);

    @m80.l
    Object m0(long j11, @m80.k List<c0> list, @m80.k j00.c<? super Result<Boolean>> cVar);

    @m80.l
    Object n0(@m80.k j00.c<? super Result<ij.a>> cVar);

    @m80.l
    Object p(long j11, @m80.k String str, @m80.k j00.c<? super Result<kj.a>> cVar);

    @m80.l
    Object r(long j11, @m80.k j00.c<? super Result<? extends Set<Long>>> cVar);

    @m80.l
    Object t(long j11, @m80.k j00.c<? super Result<z>> cVar);

    @m80.l
    Object v(int i11, @m80.k j00.c<? super Result<? extends Set<Long>>> cVar);

    @m80.l
    Object y(long j11, @m80.k String str, @m80.k List<Integer> list, @m80.k j00.c<? super Result<kj.a>> cVar);

    @m80.l
    Object z(long j11, @m80.k List<Long> list, @m80.k j00.c<? super Result<Boolean>> cVar);
}
