package f40;

import a00.a0;
import a00.i0;
import a00.k1;
import a00.r0;
import c40.l2;
import c40.m0;
import c40.n2;
import c40.p0;
import c40.q0;
import c40.r2;
import f40.m;
import g10.u;
import h40.t0;
import h40.w0;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.debug.internal.DebuggerInfo;
import q30.k0;
import u30.f0;
import u30.y;
import yz.g2;
import yz.h1;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
@u0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,616:1\n146#1:640\n147#1,4:642\n152#1,5:647\n146#1:652\n147#1,4:654\n152#1,5:659\n1#2:617\n1#2:641\n1#2:653\n774#3:618\n865#3,2:619\n1216#3,2:621\n1246#3,4:623\n1863#3,2:667\n360#3,7:675\n1827#3,8:682\n607#4:627\n607#4:646\n607#4:658\n607#4:664\n1317#4,2:665\n37#5:628\n36#5,3:629\n37#5:632\n36#5,3:633\n37#5:636\n36#5,3:637\n1682#6,6:669\n1790#6,6:690\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n241#1:640\n241#1:642,4\n241#1:647,5\n248#1:652\n248#1:654,4\n248#1:659,5\n241#1:641\n248#1:653\n106#1:618\n106#1:619,2\n107#1:621,2\n107#1:623,4\n303#1:667,2\n412#1:675,7\n502#1:682,8\n150#1:627\n241#1:646\n248#1:658\n283#1:664\n284#1:665,2\n207#1:628\n207#1:629,3\n208#1:632\n208#1:633,3\n209#1:636\n209#1:637,3\n351#1:669,6\n554#1:690,6\n*E\n"})
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m f50946a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final StackTraceElement f50947b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final SimpleDateFormat f50948c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public static Thread f50949d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final f40.f<a<?>, Boolean> f50950e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicInteger f50951f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLong f50952g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f50953h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f50954i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f50955j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public static final x00.l<Boolean, g2> f50956k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final f40.f<l00.c, i> f50957l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements j00.c<T>, l00.c {

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        @m80.k
        public final j00.c<T> f50958a;

        /* renamed from: b, reason: collision with root package name */
        @w00.g
        @m80.k
        public final i f50959b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k j00.c<? super T> cVar, @m80.k i iVar) {
            this.f50958a = cVar;
            this.f50959b = iVar;
        }

        public final r b() {
            return this.f50959b.d();
        }

        @Override // l00.c
        @m80.l
        public l00.c getCallerFrame() {
            r b11 = b();
            if (b11 != null) {
                return b11.getCallerFrame();
            }
            return null;
        }

        @Override // j00.c
        @m80.k
        public kotlin.coroutines.d getContext() {
            return this.f50958a.getContext();
        }

        @Override // l00.c
        @m80.l
        public StackTraceElement getStackTraceElement() {
            r b11 = b();
            if (b11 != null) {
                return b11.getStackTraceElement();
            }
            return null;
        }

        @Override // j00.c
        public void resumeWith(@m80.k Object obj) {
            m.f50946a.J(this);
            this.f50958a.resumeWith(obj);
        }

        @m80.k
        public String toString() {
            return this.f50958a.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n241#3:618\n*E\n"})
    public static final class b implements x00.l<a<?>, h> {
        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke(a<?> aVar) {
            kotlin.coroutines.d c11;
            if (m.f50946a.D(aVar) || (c11 = aVar.f50959b.c()) == null) {
                return null;
            }
            return new h(aVar.f50959b, c11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,102:1\n150#2:103\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((a) t11).f50959b.f50930b), Long.valueOf(((a) t12).f50959b.f50930b));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,616:1\n1#2:617\n*E\n"})
    public static final class d<R> implements x00.l<a<?>, R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.p<a<?>, kotlin.coroutines.d, R> f50960a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(x00.p<? super a<?>, ? super kotlin.coroutines.d, ? extends R> pVar) {
            this.f50960a = pVar;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(a<?> aVar) {
            kotlin.coroutines.d c11;
            if (m.f50946a.D(aVar) || (c11 = aVar.f50959b.c()) == null) {
                return null;
            }
            return this.f50960a.invoke(aVar, c11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,102:1\n283#2:103\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((a) t11).f50959b.f50930b), Long.valueOf(((a) t12).f50959b.f50930b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n248#3:618\n*E\n"})
    public static final class f implements x00.l<a<?>, DebuggerInfo> {
        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DebuggerInfo invoke(a<?> aVar) {
            kotlin.coroutines.d c11;
            if (m.f50946a.D(aVar) || (c11 = aVar.f50959b.c()) == null) {
                return null;
            }
            return new DebuggerInfo(aVar.f50959b, c11);
        }
    }

    static {
        m mVar = new m();
        f50946a = mVar;
        f50947b = new b.a().b();
        f50948c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f50950e = new f40.f<>(false, 1, null);
        f50951f = new AtomicInteger(0);
        f50952g = new AtomicLong(0L);
        f50953h = true;
        f50955j = true;
        f50956k = mVar.v();
        f50957l = new f40.f<>(true);
    }

    public static final g2 T() {
        f50957l.u();
        return g2.f100423a;
    }

    public static final boolean l(a aVar) {
        return !f50946a.D(aVar);
    }

    public final /* synthetic */ AtomicLong A() {
        return f50952g;
    }

    @m80.k
    public final String B(@m80.k l2 l2Var) {
        if (!E()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        Set<a<?>> s11 = s();
        ArrayList<a> arrayList = new ArrayList();
        for (Object obj : s11) {
            if (((a) obj).f50958a.getContext().get(l2.f7886e0) != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(arrayList, 10)), 16));
        for (a aVar : arrayList) {
            linkedHashMap.put(n2.A(aVar.f50958a.getContext()), aVar.f50959b);
        }
        StringBuilder sb2 = new StringBuilder();
        f50946a.e(l2Var, linkedHashMap, sb2, "");
        return sb2.toString();
    }

    public final void C() {
        x00.l<Boolean, g2> lVar;
        if (y().incrementAndGet() > 1) {
            return;
        }
        S();
        if (f40.a.f50892a.a() || (lVar = f50956k) == null) {
            return;
        }
        lVar.invoke(Boolean.TRUE);
    }

    public final boolean D(a<?> aVar) {
        l2 l2Var;
        kotlin.coroutines.d c11 = aVar.f50959b.c();
        if (c11 == null || (l2Var = (l2) c11.get(l2.f7886e0)) == null || !l2Var.e()) {
            return false;
        }
        f50950e.remove(aVar);
        return true;
    }

    @w00.j(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean E() {
        return y().get() > 0;
    }

    public final boolean F(StackTraceElement stackTraceElement) {
        return f0.J2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    public final a<?> G(j00.c<?> cVar) {
        l00.c cVar2 = cVar instanceof l00.c ? (l00.c) cVar : null;
        if (cVar2 != null) {
            return H(cVar2);
        }
        return null;
    }

    public final a<?> H(l00.c cVar) {
        while (!(cVar instanceof a)) {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        }
        return (a) cVar;
    }

    public final void I(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    public final void J(a<?> aVar) {
        l00.c N;
        f50950e.remove(aVar);
        l00.c f11 = aVar.f50959b.f();
        if (f11 == null || (N = N(f11)) == null) {
            return;
        }
        f50957l.remove(N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final <T> j00.c<T> K(@m80.k j00.c<? super T> cVar) {
        if (E()) {
            if (f50955j && cVar.getContext() == EmptyCoroutineContext.INSTANCE) {
                return cVar;
            }
            if (G(cVar) == null) {
                return f(cVar, f50954i ? V(O(new Exception())) : null);
            }
        }
        return cVar;
    }

    public final void L(@m80.k j00.c<?> cVar) {
        a0(cVar, j.f50944b);
    }

    public final void M(@m80.k j00.c<?> cVar) {
        a0(cVar, j.f50945c);
    }

    public final l00.c N(l00.c cVar) {
        do {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        } while (cVar.getStackTraceElement() == null);
        return cVar;
    }

    public final <T extends Throwable> List<StackTraceElement> O(T t11) {
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i12 = length2 - 1;
                if (g0.g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i11 = length2;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length2 = i12;
            }
        }
        int i13 = i11 + 1;
        if (!f50953h) {
            int i14 = length - i13;
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList.add(stackTrace[i15 + i13]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i13) + 1);
        while (i13 < length) {
            if (F(stackTrace[i13])) {
                arrayList2.add(stackTrace[i13]);
                int i16 = i13 + 1;
                while (i16 < length && F(stackTrace[i16])) {
                    i16++;
                }
                int i17 = i16 - 1;
                int i18 = i17;
                while (i18 > i13 && stackTrace[i18].getFileName() == null) {
                    i18--;
                }
                if (i18 > i13 && i18 < i17) {
                    arrayList2.add(stackTrace[i18]);
                }
                arrayList2.add(stackTrace[i17]);
                i13 = i16;
            } else {
                arrayList2.add(stackTrace[i13]);
                i13++;
            }
        }
        return arrayList2;
    }

    public final void P(boolean z11) {
        f50954i = z11;
    }

    public final void Q(boolean z11) {
        f50955j = z11;
    }

    public final void R(boolean z11) {
        f50953h = z11;
    }

    public final void S() {
        f50949d = f00.b.c(false, true, null, "Coroutines Debugger Cleaner", 0, new x00.a() { // from class: f40.l
            @Override // x00.a
            public final Object invoke() {
                g2 T;
                T = m.T();
                return T;
            }
        }, 21, null);
    }

    public final void U() {
        Thread thread = f50949d;
        if (thread == null) {
            return;
        }
        f50949d = null;
        thread.interrupt();
        thread.join();
    }

    public final r V(List<StackTraceElement> list) {
        r rVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                rVar = new r(rVar, listIterator.previous());
            }
        }
        return new r(rVar, f50947b);
    }

    public final String W(Object obj) {
        String b11;
        b11 = n.b(obj.toString());
        return b11;
    }

    public final void X() {
        x00.l<Boolean, g2> lVar;
        if (!E()) {
            throw new IllegalStateException("Agent was not installed");
        }
        if (y().decrementAndGet() != 0) {
            return;
        }
        U();
        f50950e.clear();
        f50957l.clear();
        if (f40.a.f50892a.a() || (lVar = f50956k) == null) {
            return;
        }
        lVar.invoke(Boolean.FALSE);
    }

    public final void Y(l00.c cVar, String str) {
        boolean z11;
        if (E()) {
            f40.f<l00.c, i> fVar = f50957l;
            i remove = fVar.remove(cVar);
            if (remove != null) {
                z11 = false;
            } else {
                a<?> H = H(cVar);
                if (H == null || (remove = H.f50959b) == null) {
                    return;
                }
                l00.c f11 = remove.f();
                l00.c N = f11 != null ? N(f11) : null;
                if (N != null) {
                    fVar.remove(N);
                }
                z11 = true;
            }
            g0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            remove.j(str, (j00.c) cVar, z11);
            l00.c N2 = N(cVar);
            if (N2 == null) {
                return;
            }
            fVar.put(N2, remove);
        }
    }

    public final void Z(a<?> aVar, j00.c<?> cVar, String str) {
        if (E()) {
            aVar.f50959b.j(str, cVar, true);
        }
    }

    public final void a0(j00.c<?> cVar, String str) {
        if (E()) {
            if (f50955j && cVar.getContext() == EmptyCoroutineContext.INSTANCE) {
                return;
            }
            if (g0.g(str, j.f50944b)) {
                l00.c cVar2 = cVar instanceof l00.c ? (l00.c) cVar : null;
                if (cVar2 == null) {
                    return;
                }
                Y(cVar2, str);
                return;
            }
            a<?> G = G(cVar);
            if (G == null) {
                return;
            }
            Z(G, cVar, str);
        }
    }

    public final void e(l2 l2Var, Map<l2, i> map, StringBuilder sb2, String str) {
        i iVar = map.get(l2Var);
        if (iVar != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) r0.L2(iVar.h());
            sb2.append(str + t(l2Var) + ", continuation is " + iVar.g() + " at line " + stackTraceElement + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        } else if (!(l2Var instanceof t0)) {
            sb2.append(str + t(l2Var) + '\n');
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append('\t');
            str = sb4.toString();
        }
        Iterator<l2> it = l2Var.C().iterator();
        while (it.hasNext()) {
            e(it.next(), map, sb2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> j00.c<T> f(j00.c<? super T> cVar, r rVar) {
        if (!E()) {
            return cVar;
        }
        a<?> aVar = new a<>(cVar, new i(cVar.getContext(), rVar, A().incrementAndGet()));
        f40.f<a<?>, Boolean> fVar = f50950e;
        fVar.put(aVar, Boolean.TRUE);
        if (!E()) {
            fVar.clear();
        }
        return aVar;
    }

    @w00.j(name = "dumpCoroutines")
    public final void g(@m80.k PrintStream printStream) {
        synchronized (printStream) {
            f50946a.k(printStream);
            g2 g2Var = g2.f100423a;
        }
    }

    @m80.k
    public final List<h> h() {
        if (E()) {
            return k0.I3(k0.S1(k0.q3(r0.E1(s()), new c()), new b()));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @m80.k
    public final Object[] i() {
        String H;
        List<h> h11 = h();
        int size = h11.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (h hVar : h11) {
            kotlin.coroutines.d a11 = hVar.a();
            q0 q0Var = (q0) a11.get(q0.f7924b);
            Long l11 = null;
            String W = (q0Var == null || (H = q0Var.H()) == null) ? null : W(H);
            m0 m0Var = (m0) a11.get(m0.Key);
            String W2 = m0Var != null ? W(m0Var) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                {\n                    \"name\": ");
            sb2.append(W);
            sb2.append(",\n                    \"id\": ");
            p0 p0Var = (p0) a11.get(p0.f7906b);
            if (p0Var != null) {
                l11 = Long.valueOf(p0Var.H());
            }
            sb2.append(l11);
            sb2.append(",\n                    \"dispatcher\": ");
            sb2.append(W2);
            sb2.append(",\n                    \"sequenceNumber\": ");
            sb2.append(hVar.f());
            sb2.append(",\n                    \"state\": \"");
            sb2.append(hVar.g());
            sb2.append("\"\n                } \n                ");
            arrayList3.add(y.v(sb2.toString()));
            arrayList2.add(hVar.d());
            arrayList.add(hVar.e());
        }
        return new Object[]{'[' + r0.r3(arrayList3, null, null, null, 0, null, null, 63, null) + l50.b.f69930l, arrayList.toArray(new Thread[0]), arrayList2.toArray(new l00.c[0]), h11.toArray(new h[0])};
    }

    public final <R> List<R> j(x00.p<? super a<?>, ? super kotlin.coroutines.d, ? extends R> pVar) {
        if (E()) {
            return k0.I3(k0.S1(k0.q3(r0.E1(s()), new c()), new d(pVar)));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final void k(PrintStream printStream) {
        if (!E()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        printStream.print("Coroutines dump " + f50948c.format(Long.valueOf(System.currentTimeMillis())));
        for (a aVar : k0.q3(k0.P0(r0.E1(s()), new x00.l() { // from class: f40.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean l11;
                l11 = m.l((m.a) obj);
                return Boolean.valueOf(l11);
            }
        }), new e())) {
            i iVar = aVar.f50959b;
            List<StackTraceElement> h11 = iVar.h();
            m mVar = f50946a;
            List<StackTraceElement> p11 = mVar.p(iVar.g(), iVar.lastObservedThread, h11);
            printStream.print("\n\nCoroutine " + aVar.f50958a + ", state: " + ((g0.g(iVar.g(), j.f50944b) && p11 == h11) ? iVar.g() + " (Last suspension stacktrace, not an actual stacktrace)" : iVar.g()));
            if (h11.isEmpty()) {
                printStream.print("\n\tat " + f50947b);
                mVar.I(printStream, iVar.e());
            } else {
                mVar.I(printStream, p11);
            }
        }
    }

    @m80.k
    public final List<DebuggerInfo> m() {
        if (E()) {
            return k0.I3(k0.S1(k0.q3(r0.E1(s()), new c()), new f()));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @m80.k
    public final List<StackTraceElement> n(@m80.k h hVar, @m80.k List<StackTraceElement> list) {
        return p(hVar.g(), hVar.e(), list);
    }

    @m80.k
    public final String o(@m80.k h hVar) {
        List<StackTraceElement> n11 = n(hVar, hVar.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : n11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                {\n                    \"declaringClass\": \"");
            sb2.append(stackTraceElement.getClassName());
            sb2.append("\",\n                    \"methodName\": \"");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb2.append(fileName != null ? W(fileName) : null);
            sb2.append(",\n                    \"lineNumber\": ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append("\n                }\n                ");
            arrayList.add(y.v(sb2.toString()));
        }
        return '[' + r0.r3(arrayList, null, null, null, 0, null, null, 63, null) + l50.b.f69930l;
    }

    public final List<StackTraceElement> p(String str, Thread thread, List<StackTraceElement> list) {
        Object m6308constructorimpl;
        if (g0.g(str, j.f50944b) && thread != null) {
            try {
                Result.a aVar = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(thread.getStackTrace());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6314isFailureimpl(m6308constructorimpl)) {
                m6308constructorimpl = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m6308constructorimpl;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i11];
                    if (g0.g(stackTraceElement.getClassName(), w0.f58279a) && g0.g(stackTraceElement.getMethodName(), "resumeWith") && g0.g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i11++;
                }
                Pair<Integer, Integer> q11 = q(i11, stackTraceElementArr, list);
                int intValue = q11.component1().intValue();
                int intValue2 = q11.component2().intValue();
                if (intValue != -1) {
                    ArrayList arrayList = new ArrayList((((list.size() + i11) - intValue) - 1) - intValue2);
                    int i12 = i11 - intValue2;
                    for (int i13 = 0; i13 < i12; i13++) {
                        arrayList.add(stackTraceElementArr[i13]);
                    }
                    int size = list.size();
                    for (int i14 = intValue + 1; i14 < size; i14++) {
                        arrayList.add(list.get(i14));
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    public final Pair<Integer, Integer> q(int i11, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i12 = 0; i12 < 3; i12++) {
            int r11 = f50946a.r((i11 - 1) - i12, stackTraceElementArr, list);
            if (r11 != -1) {
                return h1.a(Integer.valueOf(r11), Integer.valueOf(i12));
            }
        }
        return h1.a(-1, 0);
    }

    public final int r(int i11, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) a0.hf(stackTraceElementArr, i11);
        if (stackTraceElement == null) {
            return -1;
        }
        int i12 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (g0.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && g0.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && g0.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public final Set<a<?>> s() {
        return f50950e.keySet();
    }

    public final String t(l2 l2Var) {
        return l2Var instanceof r2 ? ((r2) l2Var).S1() : l2Var.toString();
    }

    public final x00.l<Boolean, g2> v() {
        Object m6308constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            g0.n(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            m6308constructorimpl = Result.m6308constructorimpl((x00.l) x0.q(newInstance, 1));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        return (x00.l) (Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
    }

    public final boolean w() {
        return f50954i;
    }

    public final boolean x() {
        return f50955j;
    }

    public final /* synthetic */ AtomicInteger y() {
        return f50951f;
    }

    public final boolean z() {
        return f50953h;
    }

    public static /* synthetic */ void u(l2 l2Var) {
    }
}
