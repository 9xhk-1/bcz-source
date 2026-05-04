package com.baicizhan.client.business.util.report;

import a00.a0;
import android.util.Size;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.baicizhan.client.business.util.KotlinExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRecyclerViewExposureHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecyclerViewExposureHelper.kt\ncom/baicizhan/client/business/util/report/RecyclerViewExposureHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,203:1\n1869#2,2:204\n774#2:208\n865#2,2:209\n1869#2,2:211\n35#3:206\n35#3:207\n*S KotlinDebug\n*F\n+ 1 RecyclerViewExposureHelper.kt\ncom/baicizhan/client/business/util/report/RecyclerViewExposureHelper\n*L\n122#1:204,2\n149#1:208\n149#1:209,2\n150#1:211,2\n133#1:206\n140#1:207\n*E\n"})
/* loaded from: classes4.dex */
public final class RecyclerViewExposureHelper {
    public static final int $stable = 8;

    @l
    private ExposureDataCallback exposureCallback;
    private final int exposurePercent;

    @k
    private List<ExposureItemData> inExposureDataList;
    private boolean isManual;
    private boolean isVisible;

    @l
    private final Lifecycle lifecycle;

    @k
    private final RecyclerView recyclerView;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ExposureDataCallback {
        void onExposure(@k Object obj, int i11, @k Size size);

        void onUnExposure(@k Object obj, int i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public RecyclerViewExposureHelper(@k RecyclerView recyclerView) {
        this(recyclerView, null, 0, 6, null);
        g0.p(recyclerView, "recyclerView");
    }

    private final ExposureItemRange getVisibleItemRange(RecyclerView.LayoutManager layoutManager) {
        ExposureItemRange exposureItemRange;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            exposureItemRange = new ExposureItemRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            Integer Fn = a0.Fn(iArr);
            int[] iArr2 = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr2);
            exposureItemRange = (ExposureItemRange) KotlinExtKt.allNotNullLet(Fn, a0.hl(iArr2), new p() { // from class: com.baicizhan.client.business.util.report.b
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    ExposureItemRange visibleItemRange$lambda$2;
                    visibleItemRange$lambda$2 = RecyclerViewExposureHelper.getVisibleItemRange$lambda$2(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    return visibleItemRange$lambda$2;
                }
            });
        } else {
            exposureItemRange = null;
        }
        if (exposureItemRange == null || exposureItemRange.getFirstVisiblePosition() < 0 || exposureItemRange.getEndVisiblePosition() < 0) {
            return null;
        }
        return exposureItemRange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposureItemRange getVisibleItemRange$lambda$2(int i11, int i12) {
        return new ExposureItemRange(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVisible$lambda$0(RecyclerViewExposureHelper recyclerViewExposureHelper) {
        if (recyclerViewExposureHelper.isVisible) {
            recyclerViewExposureHelper.resolveExposureData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveExposureData() {
        ExposureItemRange visibleItemRange;
        Object data;
        ExposureDataCallback exposureDataCallback;
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (visibleItemRange = getVisibleItemRange(layoutManager)) == null) {
            return;
        }
        g10.l lVar = new g10.l(visibleItemRange.getFirstVisiblePosition(), visibleItemRange.getEndVisiblePosition());
        ArrayList arrayList = new ArrayList();
        int d11 = lVar.d();
        int f11 = lVar.f();
        if (d11 <= f11) {
            while (true) {
                RecyclerView.LayoutManager layoutManager2 = this.recyclerView.getLayoutManager();
                View findViewByPosition = layoutManager2 != null ? layoutManager2.findViewByPosition(d11) : null;
                if ((findViewByPosition instanceof IExposureData) && KotlinExtKt.getVisibleAreaPercent(findViewByPosition) >= this.exposurePercent && (data = ((IExposureData) findViewByPosition).getData()) != null) {
                    ExposureItemData exposureItemData = new ExposureItemData(data, d11);
                    arrayList.add(exposureItemData);
                    if (!this.inExposureDataList.contains(exposureItemData) && (exposureDataCallback = this.exposureCallback) != null) {
                        exposureDataCallback.onExposure(data, d11, new Size(findViewByPosition.getWidth(), findViewByPosition.getHeight()));
                    }
                }
                if (d11 == f11) {
                    break;
                } else {
                    d11++;
                }
            }
        }
        List<ExposureItemData> list = this.inExposureDataList;
        ArrayList<ExposureItemData> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!arrayList.contains((ExposureItemData) obj)) {
                arrayList2.add(obj);
            }
        }
        for (ExposureItemData exposureItemData2 : arrayList2) {
            ExposureDataCallback exposureDataCallback2 = this.exposureCallback;
            if (exposureDataCallback2 != null) {
                exposureDataCallback2.onUnExposure(exposureItemData2.getData(), exposureItemData2.getPosition());
            }
        }
        this.inExposureDataList = arrayList;
    }

    public final void clearExposureData() {
        for (ExposureItemData exposureItemData : this.inExposureDataList) {
            ExposureDataCallback exposureDataCallback = this.exposureCallback;
            if (exposureDataCallback != null) {
                exposureDataCallback.onUnExposure(exposureItemData.getData(), exposureItemData.getPosition());
            }
        }
        this.inExposureDataList.clear();
    }

    public final int getExposurePercent() {
        return this.exposurePercent;
    }

    @l
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @k
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final void onInvisible() {
        this.isManual = true;
        clearExposureData();
    }

    public final void onScroll() {
        resolveExposureData();
    }

    public final void onVisible() {
        if (this.isManual) {
            this.isManual = false;
            this.recyclerView.post(new Runnable() { // from class: com.baicizhan.client.business.util.report.a
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerViewExposureHelper.onVisible$lambda$0(RecyclerViewExposureHelper.this);
                }
            });
        }
    }

    public final void setExposureCallback(@k ExposureDataCallback callback) {
        g0.p(callback, "callback");
        this.exposureCallback = callback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public RecyclerViewExposureHelper(@k RecyclerView recyclerView, @l Lifecycle lifecycle) {
        this(recyclerView, lifecycle, 0, 4, null);
        g0.p(recyclerView, "recyclerView");
    }

    @w00.k
    public RecyclerViewExposureHelper(@k RecyclerView recyclerView, @l Lifecycle lifecycle, int i11) {
        g0.p(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        this.lifecycle = lifecycle;
        this.exposurePercent = i11;
        this.inExposureDataList = new ArrayList();
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i12, int i13) {
                g0.p(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, i12, i13);
                RecyclerViewExposureHelper.this.resolveExposureData();
            }
        });
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleObserver() { // from class: com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.2
                @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                public final void viewInvisible() {
                    RecyclerViewExposureHelper.this.isVisible = false;
                    RecyclerViewExposureHelper.this.clearExposureData();
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void viewVisible() {
                    RecyclerViewExposureHelper.this.isVisible = true;
                    if (RecyclerViewExposureHelper.this.isManual) {
                        return;
                    }
                    RecyclerViewExposureHelper.this.resolveExposureData();
                }
            });
        }
    }

    public /* synthetic */ RecyclerViewExposureHelper(RecyclerView recyclerView, Lifecycle lifecycle, int i11, int i12, v vVar) {
        this(recyclerView, (i12 & 2) != 0 ? null : lifecycle, (i12 & 4) != 0 ? 1 : i11);
    }
}
