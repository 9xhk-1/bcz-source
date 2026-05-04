package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends FunctionReferenceImpl implements p<Integer, Integer, int[]> {
    public LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ int[] invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    public final int[] invoke(int i11, int i12) {
        int[] fillNearestIndices;
        fillNearestIndices = ((LazyStaggeredGridState) this.receiver).fillNearestIndices(i11, i12);
        return fillNearestIndices;
    }
}
