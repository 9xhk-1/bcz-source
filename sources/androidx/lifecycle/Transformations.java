package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "Transformations")
/* loaded from: classes2.dex */
public final class Transformations {
    @w00.j(name = "distinctUntilChanged")
    @k
    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(@k LiveData<X> liveData) {
        final MediatorLiveData mediatorLiveData;
        g0.p(liveData, "<this>");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (liveData.isInitialized()) {
            booleanRef.element = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new l<X, g2>() { // from class: androidx.lifecycle.Transformations$distinctUntilChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2((Transformations$distinctUntilChanged$1<X>) obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(X x11) {
                X value = mediatorLiveData.getValue();
                if (booleanRef.element || ((value == null && x11 != null) || !(value == null || g0.g(value, x11)))) {
                    booleanRef.element = false;
                    mediatorLiveData.setValue(x11);
                }
            }
        }));
        return mediatorLiveData;
    }

    @w00.j(name = "map")
    @k
    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(@k LiveData<X> liveData, @k final l<X, Y> transform) {
        g0.p(liveData, "<this>");
        g0.p(transform, "transform");
        final MediatorLiveData mediatorLiveData = liveData.isInitialized() ? new MediatorLiveData(transform.invoke(liveData.getValue())) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new l<X, g2>() { // from class: androidx.lifecycle.Transformations$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2((Transformations$map$1<X>) obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(X x11) {
                mediatorLiveData.setValue(transform.invoke(x11));
            }
        }));
        return mediatorLiveData;
    }

    @w00.j(name = "switchMap")
    @k
    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(@k LiveData<X> liveData, @k final l<X, LiveData<Y>> transform) {
        final MediatorLiveData mediatorLiveData;
        g0.p(liveData, "<this>");
        g0.p(transform, "transform");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (liveData.isInitialized()) {
            LiveData<Y> invoke = transform.invoke(liveData.getValue());
            mediatorLiveData = (invoke == null || !invoke.isInitialized()) ? new MediatorLiveData() : new MediatorLiveData(invoke.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new l<X, g2>() { // from class: androidx.lifecycle.Transformations$switchMap$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2((Transformations$switchMap$1<X>) obj);
                return g2.f100423a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.lifecycle.LiveData, java.lang.Object] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(X x11) {
                ?? r42 = (LiveData) transform.invoke(x11);
                T t11 = objectRef.element;
                if (t11 != r42) {
                    if (t11 != 0) {
                        MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                        g0.m(t11);
                        mediatorLiveData2.removeSource((LiveData) t11);
                    }
                    objectRef.element = r42;
                    if (r42 != 0) {
                        MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                        g0.m(r42);
                        final MediatorLiveData<Y> mediatorLiveData4 = mediatorLiveData;
                        mediatorLiveData3.addSource(r42, new Transformations$sam$androidx_lifecycle_Observer$0(new l<Y, g2>() { // from class: androidx.lifecycle.Transformations$switchMap$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                                invoke2((AnonymousClass1<Y>) obj);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Y y11) {
                                mediatorLiveData4.setValue(y11);
                            }
                        }));
                    }
                }
            }
        }));
        return mediatorLiveData;
    }

    @w00.j(name = "map")
    @CheckResult
    @n(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, final Function mapFunction) {
        g0.p(liveData, "<this>");
        g0.p(mapFunction, "mapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new l<Object, g2>() { // from class: androidx.lifecycle.Transformations$map$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                mediatorLiveData.setValue(mapFunction.apply(obj));
            }
        }));
        return mediatorLiveData;
    }

    @w00.j(name = "switchMap")
    @CheckResult
    @n(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final Function switchMapFunction) {
        g0.p(liveData, "<this>");
        g0.p(switchMapFunction, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<Object>() { // from class: androidx.lifecycle.Transformations$switchMap$2

            @m80.l
            private LiveData<Object> liveData;

            @m80.l
            public final LiveData<Object> getLiveData() {
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object obj) {
                LiveData<Object> apply = switchMapFunction.apply(obj);
                LiveData<Object> liveData2 = this.liveData;
                if (liveData2 == apply) {
                    return;
                }
                if (liveData2 != null) {
                    MediatorLiveData<Object> mediatorLiveData2 = mediatorLiveData;
                    g0.m(liveData2);
                    mediatorLiveData2.removeSource(liveData2);
                }
                this.liveData = apply;
                if (apply != null) {
                    MediatorLiveData<Object> mediatorLiveData3 = mediatorLiveData;
                    g0.m(apply);
                    final MediatorLiveData<Object> mediatorLiveData4 = mediatorLiveData;
                    mediatorLiveData3.addSource(apply, new Transformations$sam$androidx_lifecycle_Observer$0(new l<Object, g2>() { // from class: androidx.lifecycle.Transformations$switchMap$2$onChanged$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(Object obj2) {
                            invoke2(obj2);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object obj2) {
                            mediatorLiveData4.setValue(obj2);
                        }
                    }));
                }
            }

            public final void setLiveData(@m80.l LiveData<Object> liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }
}
