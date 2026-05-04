package h40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,103:1\n37#1:104\n37#1:105\n28#1,10:106\n37#1:126\n1557#2:116\n1628#2,2:117\n1630#2:121\n1557#2:122\n1628#2,3:123\n97#3,2:119\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n31#1:104\n50#1:105\n72#1:106,10\n88#1:126\n73#1:116\n73#1:117,2\n73#1:121\n87#1:122\n87#1:123,3\n75#1:119,2\n*E\n"})
/* loaded from: classes8.dex */
public final class n0<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f58255d = AtomicIntegerFieldUpdater.newUpdater(n0.class, "controlState$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final int f58256a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<Integer, T> f58257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f58258c;
    private volatile /* synthetic */ int controlState$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(int i11, @m80.k x00.l<? super Integer, ? extends T> lVar) {
        this.f58256a = i11;
        this.f58257b = lVar;
        this.f58258c = new AtomicReferenceArray(i11);
    }

    public final boolean a() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f58255d;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i11) != 0) {
                return false;
            }
            if (i11 >= this.f58256a) {
                return true;
            }
        } while (!f58255d.compareAndSet(this, i11, i11 + 1));
        e().set(i11, this.f58257b.invoke(Integer.valueOf(i11)));
        return true;
    }

    @m80.k
    public final List<T> b() {
        int i11;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f58255d;
        while (true) {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i11 = 0;
                break;
            }
            if (f58255d.compareAndSet(this, i11, Integer.MIN_VALUE | i11)) {
                break;
            }
        }
        g10.l W1 = g10.u.W1(0, i11);
        ArrayList arrayList = new ArrayList(a00.i0.d0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int nextInt = ((a00.d1) it).nextInt();
            do {
                andSet = e().getAndSet(nextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final /* synthetic */ int c() {
        return this.controlState$volatile;
    }

    public final /* synthetic */ AtomicReferenceArray e() {
        return this.f58258c;
    }

    public final boolean f(int i11) {
        return (i11 & Integer.MIN_VALUE) != 0;
    }

    public final /* synthetic */ void g(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, x00.l<? super Integer, g2> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void h(int i11) {
        this.controlState$volatile = i11;
    }

    @m80.k
    public final String i() {
        int i11 = f58255d.get(this);
        g10.l W1 = g10.u.W1(0, Integer.MAX_VALUE & i11);
        ArrayList arrayList = new ArrayList(a00.i0.d0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(e().get(((a00.d1) it).nextInt()));
        }
        return arrayList.toString() + ((i11 & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    public final int j() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f58255d;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!f58255d.compareAndSet(this, i11, Integer.MIN_VALUE | i11));
        return i11;
    }

    @m80.k
    public String toString() {
        return "OnDemandAllocatingPool(" + i() + ')';
    }
}
