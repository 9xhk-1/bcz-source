package androidx.lifecycle;

import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {R.styleable.Theme_drawable_tab_mall}, m = "clearSource$lifecycle_livedata_release", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class CoroutineLiveData$clearSource$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutineLiveData<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$clearSource$1(CoroutineLiveData<T> coroutineLiveData, j00.c<? super CoroutineLiveData$clearSource$1> cVar) {
        super(cVar);
        this.this$0 = coroutineLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearSource$lifecycle_livedata_release(this);
    }
}
