package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import m80.k;
import x00.l;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LazyStaggeredGridScopeMarker
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {
    static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, q qVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        if ((i11 & 4) != 0) {
            staggeredGridItemSpan = null;
        }
        lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i11, l lVar, l lVar2, l lVar3, r rVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i12 & 2) != 0) {
            lVar = null;
        }
        if ((i12 & 4) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$items$1
                public final Void invoke(int i13) {
                    return null;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        if ((i12 & 8) != 0) {
            lVar3 = null;
        }
        lazyStaggeredGridScope.items(i11, lVar, lVar2, lVar3, rVar);
    }

    void item(@m80.l Object obj, @m80.l Object obj2, @m80.l StaggeredGridItemSpan staggeredGridItemSpan, @k q<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, g2> qVar);

    void items(int i11, @m80.l l<? super Integer, ? extends Object> lVar, @k l<? super Integer, ? extends Object> lVar2, @m80.l l<? super Integer, StaggeredGridItemSpan> lVar3, @k r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar);
}
