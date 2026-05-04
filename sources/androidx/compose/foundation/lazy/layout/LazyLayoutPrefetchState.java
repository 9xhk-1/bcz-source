package androidx.compose.foundation.lazy.layout;

import a00.h0;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;

    @l
    private final x00.l<NestedPrefetchScope, g2> onNestedPrefetch;

    @l
    private PrefetchHandleProvider prefetchHandleProvider;

    @k
    private final PrefetchMetrics prefetchMetrics;

    @l
    private final PrefetchScheduler prefetchScheduler;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class NestedPrefetchScopeImpl implements NestedPrefetchScope {

        @k
        private final List<PrefetchRequest> _requests = new ArrayList();

        public NestedPrefetchScopeImpl() {
        }

        @k
        public final List<PrefetchRequest> getRequests() {
            return this._requests;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public void schedulePrefetch(int i11) {
            long j11;
            j11 = LazyLayoutPrefetchStateKt.ZeroConstraints;
            mo904schedulePrefetch0kLqBqw(i11, j11);
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
        public void mo904schedulePrefetch0kLqBqw(int i11, long j11) {
            PrefetchHandleProvider prefetchHandleProvider$foundation_release = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation_release();
            if (prefetchHandleProvider$foundation_release == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider$foundation_release.m915createNestedPrefetchRequestVKLhPVY(i11, j11, LazyLayoutPrefetchState.this.prefetchMetrics));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PrefetchHandle {
        void cancel();

        void markAsUrgent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPrefetchState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @k
    public final List<PrefetchRequest> collectNestedPrefetchRequests$foundation_release() {
        x00.l<NestedPrefetchScope, g2> lVar = this.onNestedPrefetch;
        if (lVar == null) {
            return h0.J();
        }
        NestedPrefetchScopeImpl nestedPrefetchScopeImpl = new NestedPrefetchScopeImpl();
        lVar.invoke(nestedPrefetchScopeImpl);
        return nestedPrefetchScopeImpl.getRequests();
    }

    @l
    public final PrefetchHandleProvider getPrefetchHandleProvider$foundation_release() {
        return this.prefetchHandleProvider;
    }

    @l
    public final PrefetchScheduler getPrefetchScheduler$foundation_release() {
        return this.prefetchScheduler;
    }

    @k
    public final PrefetchHandle schedulePrefetch(int i11) {
        long j11;
        j11 = LazyLayoutPrefetchStateKt.ZeroConstraints;
        return m903schedulePrefetch0kLqBqw(i11, j11);
    }

    @k
    /* renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
    public final PrefetchHandle m903schedulePrefetch0kLqBqw(int i11, long j11) {
        PrefetchHandle m916schedulePrefetchVKLhPVY;
        PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return (prefetchHandleProvider == null || (m916schedulePrefetchVKLhPVY = prefetchHandleProvider.m916schedulePrefetchVKLhPVY(i11, j11, this.prefetchMetrics)) == null) ? DummyHandle.INSTANCE : m916schedulePrefetchVKLhPVY;
    }

    public final void setPrefetchHandleProvider$foundation_release(@l PrefetchHandleProvider prefetchHandleProvider) {
        this.prefetchHandleProvider = prefetchHandleProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPrefetchState(@l PrefetchScheduler prefetchScheduler, @l x00.l<? super NestedPrefetchScope, g2> lVar) {
        this.prefetchScheduler = prefetchScheduler;
        this.onNestedPrefetch = lVar;
        this.prefetchMetrics = new PrefetchMetrics();
    }

    public /* synthetic */ LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, x00.l lVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : prefetchScheduler, (i11 & 2) != 0 ? null : lVar);
    }
}
