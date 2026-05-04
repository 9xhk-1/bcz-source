package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelLazy.kt\nandroidx/lifecycle/ViewModelLazy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewModelLazy<VM extends ViewModel> implements c0<VM> {

    @l
    private VM cached;

    @k
    private final x00.a<CreationExtras> extrasProducer;

    @k
    private final x00.a<ViewModelProvider.Factory> factoryProducer;

    @k
    private final x00.a<ViewModelStore> storeProducer;

    @k
    private final h10.d<VM> viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public ViewModelLazy(@k h10.d<VM> viewModelClass, @k x00.a<? extends ViewModelStore> storeProducer, @k x00.a<? extends ViewModelProvider.Factory> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        g0.p(viewModelClass, "viewModelClass");
        g0.p(storeProducer, "storeProducer");
        g0.p(factoryProducer, "factoryProducer");
    }

    @Override // yz.c0
    public boolean isInitialized() {
        return this.cached != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public ViewModelLazy(@k h10.d<VM> viewModelClass, @k x00.a<? extends ViewModelStore> storeProducer, @k x00.a<? extends ViewModelProvider.Factory> factoryProducer, @k x00.a<? extends CreationExtras> extrasProducer) {
        g0.p(viewModelClass, "viewModelClass");
        g0.p(storeProducer, "storeProducer");
        g0.p(factoryProducer, "factoryProducer");
        g0.p(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // yz.c0
    @k
    public VM getValue() {
        VM vm2 = this.cached;
        if (vm2 != null) {
            return vm2;
        }
        VM vm3 = (VM) ViewModelProvider.Companion.create(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm3;
        return vm3;
    }

    public /* synthetic */ ViewModelLazy(h10.d dVar, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, v vVar) {
        this(dVar, aVar, aVar2, (i11 & 8) != 0 ? new x00.a<CreationExtras.Empty>() { // from class: androidx.lifecycle.ViewModelLazy.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @k
            public final CreationExtras.Empty invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : aVar3);
    }
}
