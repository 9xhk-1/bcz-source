package androidx.compose.foundation.pager;

import a00.h0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.a;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DefaultPagerState extends PagerState {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Saver<DefaultPagerState, ?> Saver = ListSaverKt.listSaver(new p<SaverScope, DefaultPagerState, List<? extends Object>>() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$1
        @Override // x00.p
        public final List<Object> invoke(SaverScope saverScope, DefaultPagerState defaultPagerState) {
            return h0.Q(Integer.valueOf(defaultPagerState.getCurrentPage()), Float.valueOf(u.H(defaultPagerState.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState.getPageCount()));
        }
    }, new l<List, DefaultPagerState>() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ DefaultPagerState invoke(List list) {
            return invoke2((List<? extends Object>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final DefaultPagerState invoke2(final List<? extends Object> list) {
            Object obj = list.get(0);
            g0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            g0.n(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new DefaultPagerState(intValue, ((Float) obj2).floatValue(), new a<Integer>() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Integer invoke() {
                    Object obj3 = list.get(2);
                    g0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return (Integer) obj3;
                }
            });
        }
    });

    @k
    private MutableState<a<Integer>> pageCountState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<DefaultPagerState, ?> getSaver() {
            return DefaultPagerState.Saver;
        }

        private Companion() {
        }
    }

    public DefaultPagerState(int i11, float f11, @k a<Integer> aVar) {
        super(i11, f11);
        this.pageCountState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return this.pageCountState.getValue().invoke().intValue();
    }

    @k
    public final MutableState<a<Integer>> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(@k MutableState<a<Integer>> mutableState) {
        this.pageCountState = mutableState;
    }
}
