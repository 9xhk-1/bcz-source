package androidx.lifecycle;

import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0, 0, 1}, l = {R.styleable.Theme_drawable_syncview_error, R.styleable.Theme_drawable_syncview_update}, m = "emitSource$lifecycle_livedata_release", n = {"this", "source", "this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes2.dex */
public final class CoroutineLiveData$emitSource$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutineLiveData<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$emitSource$1(CoroutineLiveData<T> coroutineLiveData, j00.c<? super CoroutineLiveData$emitSource$1> cVar) {
        super(cVar);
        this.this$0 = coroutineLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitSource$lifecycle_livedata_release(null, this);
    }
}
