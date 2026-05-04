package kotlinx.coroutines.flow;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.p<e40.i0<? super T>, j00.c<? super g2>, Object> f68131d;

    public /* synthetic */ f(x00.p pVar, kotlin.coroutines.d dVar, int i11, BufferOverflow bufferOverflow, int i12, kotlin.jvm.internal.v vVar) {
        this(pVar, (i12 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i12 & 4) != 0 ? -2 : i11, (i12 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static /* synthetic */ <T> Object o(f<T> fVar, e40.i0<? super T> i0Var, j00.c<? super g2> cVar) {
        Object invoke = fVar.f68131d.invoke(i0Var, cVar);
        return invoke == kotlin.coroutines.intrinsics.b.l() ? invoke : g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.l
    public Object i(@m80.k e40.i0<? super T> i0Var, @m80.k j00.c<? super g2> cVar) {
        return o(this, i0Var, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public kotlinx.coroutines.flow.internal.d<T> j(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return new f(this.f68131d, dVar, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public String toString() {
        return "block[" + this.f68131d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@m80.k x00.p<? super e40.i0<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        super(dVar, i11, bufferOverflow);
        this.f68131d = pVar;
    }
}
