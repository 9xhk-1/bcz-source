package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public static final int $stable = 0;

    @k
    private final LazyLayoutItemContentFactory itemContentFactory;

    @k
    private final LazyLayoutItemProvider itemProvider;

    @k
    private final MutableIntObjectMap<List<Placeable>> placeablesCache = IntObjectMapKt.mutableIntObjectMapOf();

    @k
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    public LazyLayoutMeasureScopeImpl(@k LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @k SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = lazyLayoutItemContentFactory.getItemProvider().invoke();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @k
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @k
    public MeasureResult layout(int i11, int i12, @k Map<AlignmentLine, Integer> map, @k l<? super Placeable.PlacementScope, g2> lVar) {
        return this.subcomposeMeasureScope.layout(i11, i12, map, lVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    @k
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo900measure0kLqBqw(int i11, long j11) {
        List<Placeable> list = this.placeablesCache.get(i11);
        if (list != null) {
            return list;
        }
        Object key = this.itemProvider.getKey(i11);
        List<Measurable> subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i11, key, this.itemProvider.getContentType(i11)));
        int size = subcompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(subcompose.get(i12).mo3857measureBRTryo0(j11));
        }
        this.placeablesCache.set(i11, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo370roundToPxR2X_6o(long j11) {
        return this.subcomposeMeasureScope.mo370roundToPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo371roundToPx0680j_4(float f11) {
        return this.subcomposeMeasureScope.mo371roundToPx0680j_4(f11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo372toDpGaN1DYA(long j11) {
        return this.subcomposeMeasureScope.mo372toDpGaN1DYA(j11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo374toDpu2uoSUM(int i11) {
        return this.subcomposeMeasureScope.mo374toDpu2uoSUM(i11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo375toDpSizekrfVVM(long j11) {
        return this.subcomposeMeasureScope.mo375toDpSizekrfVVM(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo376toPxR2X_6o(long j11) {
        return this.subcomposeMeasureScope.mo376toPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo377toPx0680j_4(float f11) {
        return this.subcomposeMeasureScope.mo377toPx0680j_4(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @k
    public Rect toRect(@k DpRect dpRect) {
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo378toSizeXkaWNTQ(long j11) {
        return this.subcomposeMeasureScope.mo378toSizeXkaWNTQ(j11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo379toSp0xMU5do(float f11) {
        return this.subcomposeMeasureScope.mo379toSp0xMU5do(f11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo380toSpkPz2Gy4(float f11) {
        return this.subcomposeMeasureScope.mo380toSpkPz2Gy4(f11);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @k
    public MeasureResult layout(int i11, int i12, @k Map<AlignmentLine, Integer> map, @m80.l l<? super RulerScope, g2> lVar, @k l<? super Placeable.PlacementScope, g2> lVar2) {
        return this.subcomposeMeasureScope.layout(i11, i12, map, lVar, lVar2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo373toDpu2uoSUM(float f11) {
        return this.subcomposeMeasureScope.mo373toDpu2uoSUM(f11);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo381toSpkPz2Gy4(int i11) {
        return this.subcomposeMeasureScope.mo381toSpkPz2Gy4(i11);
    }
}
