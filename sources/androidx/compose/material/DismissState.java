package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class DismissState extends SwipeableState<DismissValue> {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<DismissState, DismissValue> Saver(@k final l<? super DismissValue, Boolean> lVar) {
            return SaverKt.Saver(new p<SaverScope, DismissState, DismissValue>() { // from class: androidx.compose.material.DismissState$Companion$Saver$1
                @Override // x00.p
                public final DismissValue invoke(SaverScope saverScope, DismissState dismissState) {
                    return dismissState.getCurrentValue();
                }
            }, new l<DismissValue, DismissState>() { // from class: androidx.compose.material.DismissState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public final DismissState invoke(DismissValue dismissValue) {
                    return new DismissState(dismissValue, lVar);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ DismissState(DismissValue dismissValue, l lVar, int i11, v vVar) {
        this(dismissValue, (i11 & 2) != 0 ? new l<DismissValue, Boolean>() { // from class: androidx.compose.material.DismissState.1
            @Override // x00.l
            public final Boolean invoke(DismissValue dismissValue2) {
                return Boolean.TRUE;
            }
        } : lVar);
    }

    @m80.l
    public final Object dismiss(@k DismissDirection dismissDirection, @k c<? super g2> cVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, dismissDirection == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart, null, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    @m80.l
    public final DismissDirection getDismissDirection() {
        if (getOffset().getValue().floatValue() == 0.0f) {
            return null;
        }
        return getOffset().getValue().floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    public final boolean isDismissed(@k DismissDirection dismissDirection) {
        return getCurrentValue() == (dismissDirection == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart);
    }

    @m80.l
    public final Object reset(@k c<? super g2> cVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, DismissValue.Default, null, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    public DismissState(@k DismissValue dismissValue, @k l<? super DismissValue, Boolean> lVar) {
        super(dismissValue, null, lVar, 2, null);
    }
}
