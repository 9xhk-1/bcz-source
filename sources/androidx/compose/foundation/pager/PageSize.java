package androidx.compose.foundation.pager;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface PageSize {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Fixed implements PageSize {
        public static final int $stable = 0;
        private final float pageSize;

        public /* synthetic */ Fixed(float f11, v vVar) {
            this(f11);
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(@k Density density, int i11, int i12) {
            return density.mo371roundToPx0680j_4(this.pageSize);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Fixed) {
                return Dp.m5120equalsimpl0(this.pageSize, ((Fixed) obj).pageSize);
            }
            return false;
        }

        /* renamed from: getPageSize-D9Ej5fM, reason: not valid java name */
        public final float m969getPageSizeD9Ej5fM() {
            return this.pageSize;
        }

        public int hashCode() {
            return Dp.m5121hashCodeimpl(this.pageSize);
        }

        private Fixed(float f11) {
            this.pageSize = f11;
        }
    }

    int calculateMainAxisPageSize(@k Density density, int i11, int i12);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Fill implements PageSize {
        public static final int $stable = 0;

        @k
        public static final Fill INSTANCE = new Fill();

        private Fill() {
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(@k Density density, int i11, int i12) {
            return i11;
        }
    }
}
