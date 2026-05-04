package kotlinx.coroutines.flow;

import a00.a1;
import c40.a2;
import c40.l2;
import c40.y1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;
import yz.v0;
import yz.w0;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f68297a = "kotlinx.coroutines.flow.defaultConcurrency";

    @m80.k
    public static final e40.k0<g2> A0(@m80.k c40.r0 r0Var, long j11) {
        return r.j(r0Var, j11);
    }

    @m80.k
    public static final <T> i<T> A1(@m80.k i<? extends T> iVar, @m80.k x00.r<? super j<? super T>, ? super Throwable, ? super Long, ? super j00.c<? super Boolean>, ? extends Object> rVar) {
        return FlowKt__ErrorsKt.g(iVar, rVar);
    }

    @m80.l
    public static final <T> Object B(@m80.k i<? extends T> iVar, @m80.k x00.q<? super Integer, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar, @m80.k j00.c<? super g2> cVar) {
        return FlowKt__CollectKt.d(iVar, qVar, cVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @w0(expression = "flatMapConcat(mapper)", imports = {}))
    @m80.k
    public static final <T, R> i<R> B0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.m(iVar, pVar);
    }

    @m80.k
    public static final <T, R> i<R> B1(@m80.k i<? extends T> iVar, R r11, @yz.b @m80.k x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.j(iVar, r11, qVar);
    }

    @m80.l
    public static final <T> Object C(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        return FlowKt__CollectKt.f(iVar, pVar, cVar);
    }

    @y1
    @m80.k
    public static final <T, R> i<R> C0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.a(iVar, pVar);
    }

    @m80.k
    public static final <T> i<T> C1(@m80.k i<? extends T> iVar, @m80.k x00.q<? super T, ? super T, ? super j00.c<? super T>, ? extends Object> qVar) {
        return FlowKt__TransformKt.k(iVar, qVar);
    }

    @m80.l
    public static final <T> Object D(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        return FlowKt__LimitKt.b(iVar, pVar, cVar);
    }

    @y1
    @m80.k
    public static final <T, R> i<R> D0(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.b(iVar, pVar);
    }

    @a2
    @m80.k
    public static final <T> i<T> D1(@m80.k i<? extends T> iVar, long j11) {
        return r.k(iVar, j11);
    }

    @y1
    @m80.k
    public static final <T, R> i<R> E0(@m80.k i<? extends T> iVar, int i11, @m80.k x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.c(iVar, i11, pVar);
    }

    @a2
    @m80.k
    public static final <T> i<T> E1(@m80.k i<? extends T> iVar, long j11) {
        return r.l(iVar, j11);
    }

    @m80.k
    public static final <T1, T2, T3, T4, T5, R> i<R> F(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k i<? extends T5> iVar5, @m80.k x00.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super j00.c<? super R>, ? extends Object> tVar) {
        return FlowKt__ZipKt.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @m80.k
    public static final <T, R> i<R> F1(@m80.k i<? extends T> iVar, R r11, @yz.b @m80.k x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.l(iVar, r11, qVar);
    }

    @m80.k
    public static final <T1, T2, T3, T4, R> i<R> G(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k x00.s<? super T1, ? super T2, ? super T3, ? super T4, ? super j00.c<? super R>, ? extends Object> sVar) {
        return FlowKt__ZipKt.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @w0(expression = "flattenConcat()", imports = {}))
    @m80.k
    public static final <T> i<T> G0(@m80.k i<? extends i<? extends T>> iVar) {
        return FlowKt__MigrationKt.n(iVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @w0(expression = "scan(initial, operation)", imports = {}))
    @m80.k
    public static final <T, R> i<R> G1(@m80.k i<? extends T> iVar, R r11, @yz.b @m80.k x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.D(iVar, r11, qVar);
    }

    @m80.k
    public static final <T1, T2, T3, R> i<R> H(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @yz.b @m80.k x00.r<? super T1, ? super T2, ? super T3, ? super j00.c<? super R>, ? extends Object> rVar) {
        return FlowKt__ZipKt.e(iVar, iVar2, iVar3, rVar);
    }

    @y1
    @m80.k
    public static final <T> i<T> H0(@m80.k i<? extends i<? extends T>> iVar) {
        return FlowKt__MergeKt.e(iVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @w0(expression = "runningReduce(operation)", imports = {}))
    @m80.k
    public static final <T> i<T> H1(@m80.k i<? extends T> iVar, @m80.k x00.q<? super T, ? super T, ? super j00.c<? super T>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.E(iVar, qVar);
    }

    @m80.k
    public static final <T1, T2, R> i<R> I(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.f(iVar, iVar2, qVar);
    }

    @y1
    @m80.k
    public static final <T> i<T> I0(@m80.k i<? extends i<? extends T>> iVar, int i11) {
        return FlowKt__MergeKt.f(iVar, i11);
    }

    @m80.k
    public static final <T> c0<T> I1(@m80.k i<? extends T> iVar, @m80.k c40.r0 r0Var, @m80.k h0 h0Var, int i11) {
        return w.g(iVar, r0Var, h0Var, i11);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @w0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @m80.k
    public static final <T1, T2, T3, T4, T5, R> i<R> K(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k i<? extends T5> iVar5, @m80.k x00.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super j00.c<? super R>, ? extends Object> tVar) {
        return FlowKt__MigrationKt.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @m80.k
    public static final <T> i<T> K0(@yz.b @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.n(pVar);
    }

    @m80.l
    public static final <T> Object K1(@m80.k i<? extends T> iVar, @m80.k j00.c<? super T> cVar) {
        return FlowKt__ReduceKt.j(iVar, cVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @w0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @m80.k
    public static final <T1, T2, T3, T4, R> i<R> L(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k x00.s<? super T1, ? super T2, ? super T3, ? super T4, ? super j00.c<? super R>, ? extends Object> sVar) {
        return FlowKt__MigrationKt.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @w00.j(name = "flowCombine")
    @m80.k
    public static final <T1, T2, R> i<R> L0(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.p(iVar, iVar2, qVar);
    }

    @m80.l
    public static final <T> Object L1(@m80.k i<? extends T> iVar, @m80.k j00.c<? super T> cVar) {
        return FlowKt__ReduceKt.k(iVar, cVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @w0(expression = "combine(this, other, other2, transform)", imports = {}))
    @m80.k
    public static final <T1, T2, T3, R> i<R> M(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k x00.r<? super T1, ? super T2, ? super T3, ? super j00.c<? super R>, ? extends Object> rVar) {
        return FlowKt__MigrationKt.e(iVar, iVar2, iVar3, rVar);
    }

    @w00.j(name = "flowCombineTransform")
    @m80.k
    public static final <T1, T2, R> i<R> M0(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @yz.b @m80.k x00.r<? super j<? super R>, ? super T1, ? super T2, ? super j00.c<? super g2>, ? extends Object> rVar) {
        return FlowKt__ZipKt.q(iVar, iVar2, rVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @w0(expression = "drop(count)", imports = {}))
    @m80.k
    public static final <T> i<T> M1(@m80.k i<? extends T> iVar, int i11) {
        return FlowKt__MigrationKt.F(iVar, i11);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @w0(expression = "this.combine(other, transform)", imports = {}))
    @m80.k
    public static final <T1, T2, R> i<R> N(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.f(iVar, iVar2, qVar);
    }

    @m80.k
    public static final <T> i<T> N0(T t11) {
        return FlowKt__BuildersKt.o(t11);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @w0(expression = "onStart { emit(value) }", imports = {}))
    @m80.k
    public static final <T> i<T> N1(@m80.k i<? extends T> iVar, T t11) {
        return FlowKt__MigrationKt.G(iVar, t11);
    }

    @m80.k
    public static final <T> i<T> O0(@m80.k T... tArr) {
        return FlowKt__BuildersKt.p(tArr);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @w0(expression = "onStart { emitAll(other) }", imports = {}))
    @m80.k
    public static final <T> i<T> O1(@m80.k i<? extends T> iVar, @m80.k i<? extends T> iVar2) {
        return FlowKt__MigrationKt.H(iVar, iVar2);
    }

    @m80.k
    public static final <T1, T2, T3, T4, T5, R> i<R> P(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k i<? extends T5> iVar5, @yz.b @m80.k x00.u<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super j00.c<? super g2>, ? extends Object> uVar) {
        return FlowKt__ZipKt.i(iVar, iVar2, iVar3, iVar4, iVar5, uVar);
    }

    @m80.k
    public static final <T> i<T> P0(@m80.k i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar) {
        return n.h(iVar, dVar);
    }

    @m80.l
    public static final <T> Object P1(@m80.k i<? extends T> iVar, @m80.k c40.r0 r0Var, @m80.k j00.c<? super m0<? extends T>> cVar) {
        return w.i(iVar, r0Var, cVar);
    }

    @m80.k
    public static final <T1, T2, T3, T4, R> i<R> Q(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @yz.b @m80.k x00.t<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super j00.c<? super g2>, ? extends Object> tVar) {
        return FlowKt__ZipKt.j(iVar, iVar2, iVar3, iVar4, tVar);
    }

    @m80.l
    public static final <T, R> Object Q0(@m80.k i<? extends T> iVar, R r11, @m80.k x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar, @m80.k j00.c<? super R> cVar) {
        return FlowKt__ReduceKt.e(iVar, r11, qVar, cVar);
    }

    @m80.k
    public static final <T> m0<T> Q1(@m80.k i<? extends T> iVar, @m80.k c40.r0 r0Var, @m80.k h0 h0Var, T t11) {
        return w.j(iVar, r0Var, h0Var, t11);
    }

    @m80.k
    public static final <T1, T2, T3, R> i<R> R(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @yz.b @m80.k x00.s<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super j00.c<? super g2>, ? extends Object> sVar) {
        return FlowKt__ZipKt.k(iVar, iVar2, iVar3, sVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @w0(expression = "collect(action)", imports = {}))
    public static final <T> void R0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar) {
        FlowKt__MigrationKt.o(iVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void R1(@m80.k i<? extends T> iVar) {
        FlowKt__MigrationKt.I(iVar);
    }

    @m80.k
    public static final <T1, T2, R> i<R> S(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @yz.b @m80.k x00.r<? super j<? super R>, ? super T1, ? super T2, ? super j00.c<? super g2>, ? extends Object> rVar) {
        return FlowKt__ZipKt.l(iVar, iVar2, rVar);
    }

    public static final int S0() {
        return FlowKt__MergeKt.h();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void S1(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar) {
        FlowKt__MigrationKt.J(iVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void T1(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k x00.p<? super Throwable, ? super j00.c<? super g2>, ? extends Object> pVar2) {
        FlowKt__MigrationKt.K(iVar, pVar, pVar2);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @w0(expression = "let(transformer)", imports = {}))
    @m80.k
    public static final <T, R> i<R> U(@m80.k i<? extends T> iVar, @m80.k x00.l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        return FlowKt__MigrationKt.g(iVar, lVar);
    }

    @m80.l
    public static final <T> Object U0(@m80.k i<? extends T> iVar, @m80.k j00.c<? super T> cVar) {
        return FlowKt__ReduceKt.g(iVar, cVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @m80.k
    public static final <T> i<T> U1(@m80.k i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar) {
        return FlowKt__MigrationKt.L(iVar, dVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @w0(expression = "flatMapConcat(mapper)", imports = {}))
    @m80.k
    public static final <T, R> i<R> V(@m80.k i<? extends T> iVar, @m80.k x00.l<? super T, ? extends i<? extends R>> lVar) {
        return FlowKt__MigrationKt.h(iVar, lVar);
    }

    @m80.l
    public static final <T> Object V0(@m80.k i<? extends T> iVar, @m80.k j00.c<? super T> cVar) {
        return FlowKt__ReduceKt.h(iVar, cVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @w0(expression = "this.flatMapLatest(transform)", imports = {}))
    @m80.k
    public static final <T, R> i<R> V1(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.M(iVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @w0(expression = "onCompletion { emit(value) }", imports = {}))
    @m80.k
    public static final <T> i<T> W(@m80.k i<? extends T> iVar, T t11) {
        return FlowKt__MigrationKt.i(iVar, t11);
    }

    @m80.k
    public static final <T> l2 W0(@m80.k i<? extends T> iVar, @m80.k c40.r0 r0Var) {
        return FlowKt__CollectKt.h(iVar, r0Var);
    }

    @m80.k
    public static final <T> i<T> W1(@m80.k i<? extends T> iVar, int i11) {
        return FlowKt__LimitKt.g(iVar, i11);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @w0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @m80.k
    public static final <T> i<T> X(@m80.k i<? extends T> iVar, @m80.k i<? extends T> iVar2) {
        return FlowKt__MigrationKt.j(iVar, iVar2);
    }

    @m80.k
    public static final <T, R> i<R> X0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.g(iVar, pVar);
    }

    @m80.k
    public static final <T> i<T> X1(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.h(iVar, pVar);
    }

    @m80.k
    public static final <T> i<T> Y(@m80.k i<? extends T> iVar) {
        return n.g(iVar);
    }

    @y1
    @m80.k
    public static final <T, R> i<R> Y0(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.p<? super T, ? super j00.c<? super R>, ? extends Object> pVar) {
        return FlowKt__MergeKt.k(iVar, pVar);
    }

    @a2
    @m80.k
    public static final <T> i<T> Y1(@m80.k i<? extends T> iVar, long j11) {
        return r.m(iVar, j11);
    }

    @m80.k
    public static final <T> i<T> Z(@m80.k e40.k0<? extends T> k0Var) {
        return l.b(k0Var);
    }

    @m80.k
    public static final <T, R> i<R> Z0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.h(iVar, pVar);
    }

    @m80.l
    public static final <T, C extends Collection<? super T>> Object Z1(@m80.k i<? extends T> iVar, @m80.k C c11, @m80.k j00.c<? super C> cVar) {
        return m.a(iVar, c11, cVar);
    }

    @m80.l
    public static final <T> Object a(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar, @m80.k j00.c<? super Boolean> cVar) {
        return FlowKt__LogicKt.a(iVar, pVar, cVar);
    }

    @m80.l
    public static final <T> Object a0(@m80.k i<? extends T> iVar, @m80.k j00.c<? super Integer> cVar) {
        return o.a(iVar, cVar);
    }

    @m80.k
    public static final <T> i<T> a1(@m80.k Iterable<? extends i<? extends T>> iterable) {
        return FlowKt__MergeKt.l(iterable);
    }

    @m80.l
    public static final <T> Object a2(@m80.k i<? extends T> iVar, @m80.k List<T> list, @m80.k j00.c<? super List<? extends T>> cVar) {
        return m.b(iVar, list, cVar);
    }

    @m80.l
    public static final <T> Object b(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar, @m80.k j00.c<? super Boolean> cVar) {
        return FlowKt__LogicKt.b(iVar, pVar, cVar);
    }

    @m80.l
    public static final <T> Object b0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar, @m80.k j00.c<? super Integer> cVar) {
        return o.b(iVar, pVar, cVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @w0(expression = "flattenConcat()", imports = {}))
    @m80.k
    public static final <T> i<T> b1(@m80.k i<? extends i<? extends T>> iVar) {
        return FlowKt__MigrationKt.p(iVar);
    }

    @m80.k
    public static final i<Integer> c(@m80.k g10.l lVar) {
        return FlowKt__BuildersKt.a(lVar);
    }

    @a2
    @m80.k
    public static final <T> i<T> c0(@m80.k i<? extends T> iVar, long j11) {
        return r.c(iVar, j11);
    }

    @m80.k
    public static final <T> i<T> c1(@m80.k i<? extends T>... iVarArr) {
        return FlowKt__MergeKt.m(iVarArr);
    }

    @m80.l
    public static final <T> Object c2(@m80.k i<? extends T> iVar, @m80.k Set<T> set, @m80.k j00.c<? super Set<? extends T>> cVar) {
        return m.d(iVar, set, cVar);
    }

    @m80.k
    public static final i<Long> d(@m80.k g10.o oVar) {
        return FlowKt__BuildersKt.b(oVar);
    }

    @a2
    @m80.k
    @yz.p0
    public static final <T> i<T> d0(@m80.k i<? extends T> iVar, @m80.k x00.l<? super T, Long> lVar) {
        return r.d(iVar, lVar);
    }

    @m80.k
    public static final Void d1() {
        return FlowKt__MigrationKt.q();
    }

    @m80.k
    public static final <T> i<T> e(@m80.k Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.c(iterable);
    }

    @a2
    @m80.k
    public static final <T> i<T> e0(@m80.k i<? extends T> iVar, long j11) {
        return r.g(iVar, j11);
    }

    @m80.l
    public static final <T> Object e1(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar, @m80.k j00.c<? super Boolean> cVar) {
        return FlowKt__LogicKt.c(iVar, pVar, cVar);
    }

    @m80.k
    public static final <T, R> i<R> e2(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.q<? super j<? super R>, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.g(iVar, qVar);
    }

    @m80.k
    public static final <T> i<T> f(@m80.k Iterator<? extends T> it) {
        return FlowKt__BuildersKt.d(it);
    }

    @w00.j(name = "debounceDuration")
    @m80.k
    @yz.p0
    @a2
    public static final <T> i<T> f0(@m80.k i<? extends T> iVar, @m80.k x00.l<? super T, kotlin.time.e> lVar) {
        return r.h(iVar, lVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @m80.k
    public static final <T> i<T> f1(@m80.k i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar) {
        return FlowKt__MigrationKt.r(iVar, dVar);
    }

    @y1
    @m80.k
    public static final <T, R> i<R> f2(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.q<? super j<? super R>, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return FlowKt__MergeKt.n(iVar, qVar);
    }

    @m80.k
    public static final <T> i<T> g(@m80.k q30.m<? extends T> mVar) {
        return FlowKt__BuildersKt.e(mVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @w0(expression = "onEach { delay(timeMillis) }", imports = {}))
    @m80.k
    public static final <T> i<T> g0(@m80.k i<? extends T> iVar, long j11) {
        return FlowKt__MigrationKt.k(iVar, j11);
    }

    @m80.k
    public static final <T> i<T> g1(@m80.k i<? extends T> iVar, @m80.k x00.q<? super j<? super T>, ? super Throwable, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.d(iVar, qVar);
    }

    @m80.k
    public static final <T, R> i<R> g2(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.q<? super j<? super R>, ? super T, ? super j00.c<? super Boolean>, ? extends Object> qVar) {
        return FlowKt__LimitKt.i(iVar, qVar);
    }

    @m80.k
    public static final <T> i<T> h(@m80.k x00.a<? extends T> aVar) {
        return FlowKt__BuildersKt.f(aVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @w0(expression = "onStart { delay(timeMillis) }", imports = {}))
    @m80.k
    public static final <T> i<T> h0(@m80.k i<? extends T> iVar, long j11) {
        return FlowKt__MigrationKt.l(iVar, j11);
    }

    @m80.k
    public static final <T> i<T> h1(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return FlowKt__TransformKt.i(iVar, pVar);
    }

    @v0
    @m80.k
    public static final <T, R> i<R> h2(@m80.k i<? extends T> iVar, @yz.b @m80.k x00.q<? super j<? super R>, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.h(iVar, qVar);
    }

    @m80.k
    public static final <T> i<T> i(@m80.k x00.l<? super j00.c<? super T>, ? extends Object> lVar) {
        return FlowKt__BuildersKt.g(lVar);
    }

    @m80.k
    public static final <T> i<T> i0(@m80.k i<? extends T> iVar) {
        return u.e(iVar);
    }

    @m80.k
    public static final <T> i<T> i1(@m80.k i<? extends T> iVar, @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.e(iVar, pVar);
    }

    @m80.k
    public static final <T> i<a1<T>> i2(@m80.k i<? extends T> iVar) {
        return FlowKt__TransformKt.m(iVar);
    }

    @m80.k
    public static final i<Integer> j(@m80.k int[] iArr) {
        return FlowKt__BuildersKt.h(iArr);
    }

    @m80.k
    public static final <T> i<T> j0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super T, Boolean> pVar) {
        return u.f(iVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @w0(expression = "catch { emitAll(fallback) }", imports = {}))
    @m80.k
    public static final <T> i<T> j1(@m80.k i<? extends T> iVar, @m80.k i<? extends T> iVar2) {
        return FlowKt__MigrationKt.s(iVar, iVar2);
    }

    @m80.k
    public static final <T1, T2, R> i<R> j2(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.s(iVar, iVar2, qVar);
    }

    @m80.k
    public static final i<Long> k(@m80.k long[] jArr) {
        return FlowKt__BuildersKt.i(jArr);
    }

    @m80.k
    public static final <T, K> i<T> k0(@m80.k i<? extends T> iVar, @m80.k x00.l<? super T, ? extends K> lVar) {
        return u.g(iVar, lVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @w0(expression = "catch { emitAll(fallback) }", imports = {}))
    @m80.k
    public static final <T> i<T> k1(@m80.k i<? extends T> iVar, @m80.k i<? extends T> iVar2) {
        return FlowKt__MigrationKt.t(iVar, iVar2);
    }

    @m80.k
    public static final <T> i<T> l(@m80.k T[] tArr) {
        return FlowKt__BuildersKt.j(tArr);
    }

    @m80.k
    public static final <T> i<T> l0(@m80.k i<? extends T> iVar, int i11) {
        return FlowKt__LimitKt.d(iVar, i11);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @w0(expression = "catch { emit(fallback) }", imports = {}))
    @m80.k
    public static final <T> i<T> l1(@m80.k i<? extends T> iVar, T t11) {
        return FlowKt__MigrationKt.u(iVar, t11);
    }

    @m80.k
    public static final <T> c0<T> m(@m80.k x<T> xVar) {
        return w.a(xVar);
    }

    @m80.k
    public static final <T> i<T> m0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.e(iVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @w0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @m80.k
    public static final <T> i<T> m1(@m80.k i<? extends T> iVar, T t11, @m80.k x00.l<? super Throwable, Boolean> lVar) {
        return FlowKt__MigrationKt.v(iVar, t11, lVar);
    }

    @m80.k
    public static final <T> m0<T> n(@m80.k y<T> yVar) {
        return w.b(yVar);
    }

    @m80.l
    public static final <T> Object n0(@m80.k j<? super T> jVar, @m80.k e40.k0<? extends T> k0Var, @m80.k j00.c<? super g2> cVar) {
        return l.c(jVar, k0Var, cVar);
    }

    @m80.l
    public static final <T> Object o0(@m80.k j<? super T> jVar, @m80.k i<? extends T> iVar, @m80.k j00.c<? super g2> cVar) {
        return FlowKt__CollectKt.g(jVar, iVar, cVar);
    }

    @m80.k
    public static final <T> i<T> o1(@m80.k i<? extends T> iVar, @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.f(iVar, pVar);
    }

    @m80.k
    public static final <T> i<T> p(@m80.k i<? extends T> iVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return n.b(iVar, i11, bufferOverflow);
    }

    @m80.k
    public static final <T> i<T> p0() {
        return FlowKt__BuildersKt.m();
    }

    @m80.k
    public static final <T> c0<T> p1(@m80.k c0<? extends T> c0Var, @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return w.f(c0Var, pVar);
    }

    public static final void q0(@m80.k j<?> jVar) {
        FlowKt__EmittersKt.b(jVar);
    }

    @m80.k
    public static final <T> e40.k0<T> q1(@m80.k i<? extends T> iVar, @m80.k c40.r0 r0Var) {
        return l.e(iVar, r0Var);
    }

    @m80.k
    public static final <T> i<T> r0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.b(iVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @w0(expression = "this.shareIn(scope, 0)", imports = {}))
    @m80.k
    public static final <T> i<T> r1(@m80.k i<? extends T> iVar) {
        return FlowKt__MigrationKt.y(iVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStarted.Lazily' argument'", replaceWith = @w0(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    @m80.k
    public static final <T> i<T> s(@m80.k i<? extends T> iVar) {
        return FlowKt__MigrationKt.b(iVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @w0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @m80.k
    public static final <T> i<T> s1(@m80.k i<? extends T> iVar, int i11) {
        return FlowKt__MigrationKt.z(iVar, i11);
    }

    @m80.k
    public static final <T> i<T> t(@yz.b @m80.k x00.p<? super e40.i0<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.k(pVar);
    }

    @m80.k
    public static final <R> i<R> t0(@m80.k i<?> iVar, @m80.k h10.d<R> dVar) {
        return FlowKt__TransformKt.d(iVar, dVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @m80.k
    public static final <T> i<T> t1(@m80.k i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar) {
        return FlowKt__MigrationKt.A(iVar, dVar);
    }

    @m80.k
    public static final <T> i<T> u(@m80.k i<? extends T> iVar) {
        return n.e(iVar);
    }

    @m80.k
    public static final <T> i<T> u0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.e(iVar, pVar);
    }

    @m80.k
    public static final <T> i<T> u1(@m80.k e40.k0<? extends T> k0Var) {
        return l.f(k0Var);
    }

    @m80.k
    public static final <T> i<T> v(@m80.k i<? extends T> iVar, @m80.k x00.q<? super j<? super T>, ? super Throwable, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return FlowKt__ErrorsKt.a(iVar, qVar);
    }

    @m80.k
    public static final <T> i<T> v0(@m80.k i<? extends T> iVar) {
        return FlowKt__TransformKt.f(iVar);
    }

    @m80.l
    public static final <S, T extends S> Object v1(@m80.k i<? extends T> iVar, @m80.k x00.q<? super S, ? super T, ? super j00.c<? super S>, ? extends Object> qVar, @m80.k j00.c<? super S> cVar) {
        return FlowKt__ReduceKt.i(iVar, qVar, cVar);
    }

    @m80.l
    public static final <T> Object w(@m80.k i<? extends T> iVar, @m80.k j<? super T> jVar, @m80.k j00.c<? super Throwable> cVar) {
        return FlowKt__ErrorsKt.b(iVar, jVar, cVar);
    }

    @m80.l
    public static final <T> Object w0(@m80.k i<? extends T> iVar, @m80.k j00.c<? super T> cVar) {
        return FlowKt__ReduceKt.a(iVar, cVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @w0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @m80.k
    public static final <T> i<T> w1(@m80.k i<? extends T> iVar) {
        return FlowKt__MigrationKt.B(iVar);
    }

    @m80.k
    public static final <T> i<T> x(@yz.b @m80.k x00.p<? super e40.i0<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.l(pVar);
    }

    @m80.l
    public static final <T> Object x0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar, @m80.k j00.c<? super T> cVar) {
        return FlowKt__ReduceKt.b(iVar, pVar, cVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @w0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @m80.k
    public static final <T> i<T> x1(@m80.k i<? extends T> iVar, int i11) {
        return FlowKt__MigrationKt.C(iVar, i11);
    }

    @y1
    @m80.k
    public static final <T> i<List<T>> y(@m80.k i<? extends T> iVar, int i11) {
        return FlowKt__TransformKt.a(iVar, i11);
    }

    @m80.l
    public static final <T> Object y0(@m80.k i<? extends T> iVar, @m80.k j00.c<? super T> cVar) {
        return FlowKt__ReduceKt.c(iVar, cVar);
    }

    @m80.k
    public static final <T> i<T> y1(@m80.k i<? extends T> iVar, long j11, @m80.k x00.p<? super Throwable, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__ErrorsKt.e(iVar, j11, pVar);
    }

    @m80.l
    public static final Object z(@m80.k i<?> iVar, @m80.k j00.c<? super g2> cVar) {
        return FlowKt__CollectKt.a(iVar, cVar);
    }

    @m80.l
    public static final <T> Object z0(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super Boolean>, ? extends Object> pVar, @m80.k j00.c<? super T> cVar) {
        return FlowKt__ReduceKt.d(iVar, pVar, cVar);
    }
}
