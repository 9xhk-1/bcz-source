package androidx.lifecycle;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements p<r0, j00.c<? super EmittedSource>, Object> {
    final /* synthetic */ LiveData<T> $source;
    final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, j00.c<? super CoroutineLiveDataKt$addDisposableSource$2> cVar) {
        super(2, cVar);
        this.$this_addDisposableSource = mediatorLiveData;
        this.$source = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.$this_addDisposableSource, this.$source, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l j00.c<? super EmittedSource> cVar) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        final MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
        mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new x00.l<T, g2>() { // from class: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj2) {
                invoke2((AnonymousClass1<T>) obj2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t11) {
                mediatorLiveData.setValue(t11);
            }
        }));
        return new EmittedSource(this.$source, this.$this_addDisposableSource);
    }
}
