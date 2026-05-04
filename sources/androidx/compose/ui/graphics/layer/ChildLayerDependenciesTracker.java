package androidx.compose.ui.graphics.layer;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChildLayerDependenciesTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,114:1\n1#2:115\n231#3,3:116\n200#3,7:119\n211#3,3:127\n214#3,9:131\n234#3:140\n231#3,3:146\n200#3,7:149\n211#3,3:157\n214#3,9:161\n234#3:170\n1399#4:126\n1270#4:130\n1399#4:156\n1270#4:160\n33#5,5:141\n*S KotlinDebug\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n*L\n63#1:116,3\n63#1:119,7\n63#1:127,3\n63#1:131,9\n63#1:140\n109#1:146,3\n109#1:149,7\n109#1:157,3\n109#1:161,9\n109#1:170\n63#1:126\n63#1:130\n109#1:156\n109#1:160\n71#1:141,5\n*E\n"})
/* loaded from: classes.dex */
public final class ChildLayerDependenciesTracker {

    @m80.l
    private MutableScatterSet<GraphicsLayer> dependenciesSet;

    @m80.l
    private GraphicsLayer dependency;

    @m80.l
    private MutableScatterSet<GraphicsLayer> oldDependenciesSet;

    @m80.l
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    public final boolean onDependencyAdded(@m80.k GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet = this.dependenciesSet;
        if (mutableScatterSet != null) {
            kotlin.jvm.internal.g0.m(mutableScatterSet);
            mutableScatterSet.add(graphicsLayer);
        } else if (this.dependency != null) {
            MutableScatterSet<GraphicsLayer> mutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            GraphicsLayer graphicsLayer2 = this.dependency;
            kotlin.jvm.internal.g0.m(graphicsLayer2);
            mutableScatterSetOf.add(graphicsLayer2);
            mutableScatterSetOf.add(graphicsLayer);
            this.dependenciesSet = mutableScatterSetOf;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet2 = this.oldDependenciesSet;
        if (mutableScatterSet2 != null) {
            kotlin.jvm.internal.g0.m(mutableScatterSet2);
            return !mutableScatterSet2.remove(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }

    public final void removeDependencies(@m80.k x00.l<? super GraphicsLayer, g2> lVar) {
        ChildLayerDependenciesTracker childLayerDependenciesTracker;
        GraphicsLayer graphicsLayer = this.dependency;
        if (graphicsLayer != null) {
            lVar.invoke(graphicsLayer);
            childLayerDependenciesTracker = this;
            childLayerDependenciesTracker.dependency = null;
        } else {
            childLayerDependenciesTracker = this;
        }
        MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.dependenciesSet;
        if (mutableScatterSet != null) {
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                lVar.invoke(objArr[(i11 << 3) + i13]);
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            mutableScatterSet.clear();
        }
    }

    public final void withTracking(@m80.k x00.l<? super GraphicsLayer, g2> lVar, @m80.k x00.a<g2> aVar) {
        this.oldDependency = this.dependency;
        MutableScatterSet mutableScatterSet = this.dependenciesSet;
        if (mutableScatterSet != null && mutableScatterSet.isNotEmpty()) {
            MutableScatterSet mutableScatterSet2 = this.oldDependenciesSet;
            if (mutableScatterSet2 == null) {
                mutableScatterSet2 = ScatterSetKt.mutableScatterSetOf();
                this.oldDependenciesSet = mutableScatterSet2;
            }
            mutableScatterSet2.addAll(mutableScatterSet);
            mutableScatterSet.clear();
        }
        this.trackingInProgress = true;
        aVar.invoke();
        this.trackingInProgress = false;
        GraphicsLayer graphicsLayer = this.oldDependency;
        if (graphicsLayer != null) {
            lVar.invoke(graphicsLayer);
        }
        MutableScatterSet mutableScatterSet3 = this.oldDependenciesSet;
        if (mutableScatterSet3 == null || !mutableScatterSet3.isNotEmpty()) {
            return;
        }
        Object[] objArr = mutableScatterSet3.elements;
        long[] jArr = mutableScatterSet3.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            lVar.invoke(objArr[(i11 << 3) + i13]);
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        mutableScatterSet3.clear();
    }
}
