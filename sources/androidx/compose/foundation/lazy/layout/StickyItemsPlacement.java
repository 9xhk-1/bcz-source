package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import g10.l;
import g10.u;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface StickyItemsPlacement {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final StickyItemsPlacement StickToTopPlacement = new StickyItemsPlacement() { // from class: androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion$StickToTopPlacement$1
            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> list, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem;
                int size = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size) {
                        lazyLayoutMeasuredItem = null;
                        break;
                    }
                    lazyLayoutMeasuredItem = list.get(i18);
                    if (lazyLayoutMeasuredItem.getIndex() != i11) {
                        break;
                    }
                    i18++;
                }
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = lazyLayoutMeasuredItem;
                int mainAxisOffset = lazyLayoutMeasuredItem2 != null ? LazyLayoutStickyItemsKt.getMainAxisOffset(lazyLayoutMeasuredItem2) : Integer.MIN_VALUE;
                int max = i13 == Integer.MIN_VALUE ? -i14 : Math.max(-i14, i13);
                return mainAxisOffset != Integer.MIN_VALUE ? Math.min(max, mainAxisOffset - i12) : max;
            }

            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public IntList getStickingIndices(int i11, int i12, IntList intList) {
                int i13;
                if (i12 - i11 < 0 || (i13 = intList._size) == 0) {
                    return IntListKt.emptyIntList();
                }
                l W1 = u.W1(0, i13);
                int d11 = W1.d();
                int f11 = W1.f();
                int i14 = -1;
                if (d11 <= f11) {
                    while (intList.get(d11) <= i11) {
                        i14 = intList.get(d11);
                        if (d11 == f11) {
                            break;
                        }
                        d11++;
                    }
                }
                return i14 == -1 ? IntListKt.emptyIntList() : IntListKt.intListOf(i14);
            }
        };

        private Companion() {
        }

        @k
        public final StickyItemsPlacement getStickToTopPlacement() {
            return StickToTopPlacement;
        }
    }

    int calculateStickingItemOffset(@k List<? extends LazyLayoutMeasuredItem> list, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    @k
    IntList getStickingIndices(int i11, int i12, @k IntList intList);
}
