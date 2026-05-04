package e40;

import e40.s;
import h40.p0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.UndeliveredElementException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,90:1\n1047#2,2:91\n1009#2,2:93\n1009#2,2:95\n1047#2,2:97\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n33#1:91,2\n45#1:93,2\n77#1:95,2\n80#1:97,2\n*E\n"})
/* loaded from: classes8.dex */
public class c0<E> extends m<E> {

    /* renamed from: m, reason: collision with root package name */
    public final int f49019m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final BufferOverflow f49020n;

    public /* synthetic */ c0(int i11, BufferOverflow bufferOverflow, x00.l lVar, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, bufferOverflow, (i12 & 4) != 0 ? null : lVar);
    }

    public static /* synthetic */ <E> Object y2(c0<E> c0Var, E e11, j00.c<? super g2> cVar) {
        UndeliveredElementException c11;
        Object B2 = c0Var.B2(e11, true);
        if (!(B2 instanceof s.a)) {
            return g2.f100423a;
        }
        s.f(B2);
        x00.l<E, g2> lVar = c0Var.f49072b;
        if (lVar == null || (c11 = p0.c(lVar, e11, null, 2, null)) == null) {
            throw c0Var.K0();
        }
        yz.r.a(c11, c0Var.K0());
        throw c11;
    }

    public static /* synthetic */ <E> Object z2(c0<E> c0Var, E e11, j00.c<? super Boolean> cVar) {
        Object B2 = c0Var.B2(e11, true);
        if (B2 instanceof s.c) {
            return l00.a.a(false);
        }
        return l00.a.a(true);
    }

    public final Object A2(E e11, boolean z11) {
        x00.l<E, g2> lVar;
        UndeliveredElementException c11;
        Object m11 = super.m(e11);
        if (s.m(m11) || s.k(m11)) {
            return m11;
        }
        if (!z11 || (lVar = this.f49072b) == null || (c11 = p0.c(lVar, e11, null, 2, null)) == null) {
            return s.f49161b.c(g2.f100423a);
        }
        throw c11;
    }

    public final Object B2(E e11, boolean z11) {
        return this.f49020n == BufferOverflow.DROP_LATEST ? A2(e11, z11) : n2(e11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e40.m
    public void N1(@m80.k k40.n<?> nVar, @m80.l Object obj) {
        Object m11 = m(obj);
        if (!(m11 instanceof s.c)) {
            nVar.e(g2.f100423a);
        } else {
            if (!(m11 instanceof s.a)) {
                throw new IllegalStateException("unreachable");
            }
            s.f(m11);
            nVar.e(n.z());
        }
    }

    @Override // e40.m
    @m80.l
    public Object T1(E e11, @m80.k j00.c<? super Boolean> cVar) {
        return z2(this, e11, cVar);
    }

    @Override // e40.m, e40.l0
    @m80.l
    public Object b(E e11, @m80.k j00.c<? super g2> cVar) {
        return y2(this, e11, cVar);
    }

    @Override // e40.m
    public boolean c1() {
        return this.f49020n == BufferOverflow.DROP_OLDEST;
    }

    @Override // e40.m
    public boolean j2() {
        return false;
    }

    @Override // e40.m, e40.l0
    @m80.k
    public Object m(E e11) {
        return B2(e11, false);
    }

    public c0(int i11, @m80.k BufferOverflow bufferOverflow, @m80.l x00.l<? super E, g2> lVar) {
        super(i11, lVar);
        this.f49019m = i11;
        this.f49020n = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + o0.d(m.class).C() + " instead").toString());
        }
        if (i11 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i11 + " was specified").toString());
    }
}
