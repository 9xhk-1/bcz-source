package e40;

import c40.a3;
import e40.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import yz.g2;
import yz.v0;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f49167a = "Channel was closed";

    @v0
    @m80.k
    public static final <E, R> k0<R> J(@m80.k k0<? extends E> k0Var, @m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super E, ? super j00.c<? super R>, ? extends Object> pVar) {
        return a0.M(k0Var, dVar, pVar);
    }

    @v0
    @m80.k
    public static final <E, R> k0<R> L(@m80.k k0<? extends E> k0Var, @m80.k kotlin.coroutines.d dVar, @m80.k x00.q<? super Integer, ? super E, ? super j00.c<? super R>, ? extends Object> qVar) {
        return a0.O(k0Var, dVar, qVar);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ k0 W(k0 k0Var) {
        k0 N;
        N = a0.N(k0Var, null, new a0.b0(k0Var, null), 1, null);
        return N;
    }

    @v0
    public static final void b(@m80.k k0<?> k0Var, @m80.l Throwable th2) {
        w.a(k0Var, th2);
    }

    @a3
    @yz.n(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R c(@m80.k d<E> dVar, @m80.k x00.l<? super k0<? extends E>, ? extends R> lVar) {
        return (R) a0.e(dVar, lVar);
    }

    public static final <E, R> R d(@m80.k k0<? extends E> k0Var, @m80.k x00.l<? super k0<? extends E>, ? extends R> lVar) {
        return (R) w.b(k0Var, lVar);
    }

    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> Object e(@m80.k d<E> dVar, @m80.k x00.l<? super E, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        return a0.f(dVar, lVar, cVar);
    }

    @m80.l
    @v0
    public static final <E, C extends l0<? super E>> Object e0(@m80.k k0<? extends E> k0Var, @m80.k C c11, @m80.k j00.c<? super C> cVar) {
        return a0.e0(k0Var, c11, cVar);
    }

    @m80.l
    public static final <E> Object f(@m80.k k0<? extends E> k0Var, @m80.k x00.l<? super E, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        return w.c(k0Var, lVar, cVar);
    }

    @m80.l
    @v0
    public static final <E, C extends Collection<? super E>> Object f0(@m80.k k0<? extends E> k0Var, @m80.k C c11, @m80.k j00.c<? super C> cVar) {
        return a0.f0(k0Var, c11, cVar);
    }

    @v0
    @m80.k
    public static final x00.l<Throwable, g2> g(@m80.k k0<?> k0Var) {
        return a0.h(k0Var);
    }

    @m80.l
    public static final <E> Object g0(@m80.k k0<? extends E> k0Var, @m80.k j00.c<? super List<? extends E>> cVar) {
        return w.g(k0Var, cVar);
    }

    @v0
    @m80.k
    public static final x00.l<Throwable, g2> h(@m80.k k0<?>... k0VarArr) {
        return a0.j(k0VarArr);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object h0(k0 k0Var, j00.c cVar) {
        Object i02;
        i02 = i0(k0Var, new LinkedHashMap(), cVar);
        return i02;
    }

    @m80.l
    @v0
    public static final <K, V, M extends Map<? super K, ? super V>> Object i0(@m80.k k0<? extends Pair<? extends K, ? extends V>> k0Var, @m80.k M m11, @m80.k j00.c<? super M> cVar) {
        return a0.h0(k0Var, m11, cVar);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ k0 j(k0 k0Var) {
        k0 o11;
        o11 = a0.o(k0Var, null, new a0.d(null), 1, null);
        return o11;
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object j0(k0 k0Var, j00.c cVar) {
        Object f02;
        f02 = f0(k0Var, new ArrayList(), cVar);
        return f02;
    }

    @v0
    @m80.k
    public static final <E, K> k0<E> k(@m80.k k0<? extends E> k0Var, @m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super E, ? super j00.c<? super K>, ? extends Object> pVar) {
        return a0.n(k0Var, dVar, pVar);
    }

    @m80.l
    @v0
    public static final <E> Object k0(@m80.k k0<? extends E> k0Var, @m80.k j00.c<? super Set<E>> cVar) {
        return a0.j0(k0Var, cVar);
    }

    @m80.k
    public static final <E> Object m0(@m80.k l0<? super E> l0Var, E e11) {
        return v.b(l0Var, e11);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ k0 p0(k0 k0Var, k0 k0Var2) {
        k0 p02;
        p02 = a0.p0(k0Var, k0Var2, null, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: INVOKE (r0v1 'p02' e40.k0) = 
              (r0v0 'k0Var' e40.k0)
              (r1v0 'k0Var2' e40.k0)
              (null kotlin.coroutines.d)
              (wrap:x00.p:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:3) call: e40.z.<init>():void type: CONSTRUCTOR)
              (2 int)
              (null java.lang.Object)
             STATIC call: e40.a0.p0(e40.k0, e40.k0, kotlin.coroutines.d, x00.p, int, java.lang.Object):e40.k0 A[MD:(e40.k0, e40.k0, kotlin.coroutines.d, x00.p, int, java.lang.Object):e40.k0 (m), WRAPPED] (LINE:1) in method: e40.u.p0(e40.k0, e40.k0):e40.k0, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: e40.z, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            e40.k0 r0 = e40.a0.n0(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.u.p0(e40.k0, e40.k0):e40.k0");
    }

    @v0
    @m80.k
    public static final <E, R, V> k0<V> q0(@m80.k k0<? extends E> k0Var, @m80.k k0<? extends R> k0Var2, @m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super E, ? super R, ? extends V> pVar) {
        return a0.o0(k0Var, k0Var2, dVar, pVar);
    }

    @v0
    @m80.k
    public static final <E> k0<E> s(@m80.k k0<? extends E> k0Var, @m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super E, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        return a0.v(k0Var, dVar, pVar);
    }

    @v0
    @m80.k
    public static final <E> k0<E> y(@m80.k k0<? extends E> k0Var) {
        return a0.B(k0Var);
    }
}
