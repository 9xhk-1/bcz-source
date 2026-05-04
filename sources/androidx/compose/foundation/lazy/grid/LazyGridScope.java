package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import m80.k;
import x00.l;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LazyGridScopeMarker
/* loaded from: classes.dex */
public interface LazyGridScope {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, l lVar, Object obj2, q qVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, lVar, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i11, l lVar, p pVar, l lVar2, r rVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i12 & 2) != 0) {
            lVar = null;
        }
        if ((i12 & 4) != 0) {
            pVar = null;
        }
        if ((i12 & 8) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope$items$1
                public final Void invoke(int i13) {
                    return null;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyGridScope.items(i11, lVar, pVar, lVar2, rVar);
    }

    static /* synthetic */ void stickyHeader$default(LazyGridScope lazyGridScope, Object obj, Object obj2, r rVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        lazyGridScope.stickyHeader(obj, obj2, rVar);
    }

    void item(@m80.l Object obj, @m80.l l<? super LazyGridItemSpanScope, GridItemSpan> lVar, @m80.l Object obj2, @k q<? super LazyGridItemScope, ? super Composer, ? super Integer, g2> qVar);

    void items(int i11, @m80.l l<? super Integer, ? extends Object> lVar, @m80.l p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, @k l<? super Integer, ? extends Object> lVar2, @k r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar);

    void stickyHeader(@m80.l Object obj, @m80.l Object obj2, @k r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, g2> rVar);
}
