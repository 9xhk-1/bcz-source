package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class InvalidationStrategy {

    @l
    private final q<InvalidationStrategySpecification, Constraints, Constraints, Boolean> onIncomingConstraints;

    @l
    private final x00.a<g2> onObservedStateChange;

    @k
    private final InvalidationStrategySpecification scope;

    @l
    private final ShouldInvalidateCallback shouldInvalidate;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final InvalidationStrategy DefaultInvalidationStrategy = new InvalidationStrategy(null, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final InvalidationStrategy getDefaultInvalidationStrategy() {
            return InvalidationStrategy.DefaultInvalidationStrategy;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidationStrategy(@l q<? super InvalidationStrategySpecification, ? super Constraints, ? super Constraints, Boolean> qVar, @l x00.a<g2> aVar) {
        this.onIncomingConstraints = qVar;
        this.onObservedStateChange = aVar;
        this.scope = new InvalidationStrategySpecification();
        this.shouldInvalidate = qVar == 0 ? null : new ShouldInvalidateCallback() { // from class: androidx.constraintlayout.compose.InvalidationStrategy$shouldInvalidate$1$1
            @Override // androidx.constraintlayout.compose.ShouldInvalidateCallback
            /* renamed from: invoke-N9IONVI, reason: not valid java name */
            public final boolean mo5494invokeN9IONVI(long j11, long j12) {
                InvalidationStrategySpecification invalidationStrategySpecification;
                q<InvalidationStrategySpecification, Constraints, Constraints, Boolean> onIncomingConstraints = InvalidationStrategy.this.getOnIncomingConstraints();
                invalidationStrategySpecification = InvalidationStrategy.this.scope;
                return onIncomingConstraints.invoke(invalidationStrategySpecification, Constraints.m5055boximpl(j11), Constraints.m5055boximpl(j12)).booleanValue();
            }
        };
    }

    @l
    public final q<InvalidationStrategySpecification, Constraints, Constraints, Boolean> getOnIncomingConstraints() {
        return this.onIncomingConstraints;
    }

    @l
    public final x00.a<g2> getOnObservedStateChange() {
        return this.onObservedStateChange;
    }

    @l
    public final ShouldInvalidateCallback getShouldInvalidate$constraintlayout_compose_release() {
        return this.shouldInvalidate;
    }

    public /* synthetic */ InvalidationStrategy(q qVar, x00.a aVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : qVar, aVar);
    }
}
