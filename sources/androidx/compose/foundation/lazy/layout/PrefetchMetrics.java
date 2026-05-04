package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n683#2:542\n1#3:543\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n*L\n170#1:542\n170#1:543\n*E\n"})
/* loaded from: classes.dex */
public final class PrefetchMetrics {
    public static final int $stable = 8;

    @l
    private Averages lastUsedAverage;

    @l
    private Object lastUsedContentType;

    @k
    private final Averages overallAverage = new Averages();

    @k
    private final MutableScatterMap<Object, Averages> averagesByContentType = ScatterMapKt.mutableScatterMapOf();

    private final Averages getAverage(Object obj) {
        Averages averages = this.lastUsedAverage;
        if (this.lastUsedContentType == obj && averages != null) {
            return averages;
        }
        MutableScatterMap<Object, Averages> mutableScatterMap = this.averagesByContentType;
        Averages averages2 = mutableScatterMap.get(obj);
        if (averages2 == null) {
            averages2 = this.overallAverage.copy();
            mutableScatterMap.set(obj, averages2);
        }
        Averages averages3 = averages2;
        this.lastUsedContentType = obj;
        this.lastUsedAverage = averages3;
        return averages3;
    }

    public final long getCompositionTimeNanos(@l Object obj) {
        return getAverage(obj).getCompositionTimeNanos();
    }

    public final long getMeasureTimeNanos(@l Object obj) {
        return getAverage(obj).getMeasureTimeNanos();
    }

    public final void saveCompositionTime(@l Object obj, long j11) {
        this.overallAverage.saveCompositionTimeNanos(j11);
        getAverage(obj).saveCompositionTimeNanos(j11);
    }

    public final void saveMeasureTime(@l Object obj, long j11) {
        this.overallAverage.saveMeasureTimeNanos(j11);
        getAverage(obj).saveMeasureTimeNanos(j11);
    }
}
