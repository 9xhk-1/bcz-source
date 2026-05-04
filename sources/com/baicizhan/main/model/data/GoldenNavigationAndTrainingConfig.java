package com.baicizhan.main.model.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import zg.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GoldenNavigationAndTrainingConfig {
    public static final int $stable = 8;

    @l
    private final List<h> banner;

    @k
    private final List<GoldenItem> goldenItems;

    /* renamed from: on, reason: collision with root package name */
    private final boolean f24423on;

    @k
    private final List<TrainingConfig> trainingItems;

    public GoldenNavigationAndTrainingConfig(boolean z11, @k List<GoldenItem> goldenItems, @k List<TrainingConfig> trainingItems, @l List<h> list) {
        g0.p(goldenItems, "goldenItems");
        g0.p(trainingItems, "trainingItems");
        this.f24423on = z11;
        this.goldenItems = goldenItems;
        this.trainingItems = trainingItems;
        this.banner = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoldenNavigationAndTrainingConfig copy$default(GoldenNavigationAndTrainingConfig goldenNavigationAndTrainingConfig, boolean z11, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = goldenNavigationAndTrainingConfig.f24423on;
        }
        if ((i11 & 2) != 0) {
            list = goldenNavigationAndTrainingConfig.goldenItems;
        }
        if ((i11 & 4) != 0) {
            list2 = goldenNavigationAndTrainingConfig.trainingItems;
        }
        if ((i11 & 8) != 0) {
            list3 = goldenNavigationAndTrainingConfig.banner;
        }
        return goldenNavigationAndTrainingConfig.copy(z11, list, list2, list3);
    }

    public final boolean component1() {
        return this.f24423on;
    }

    @k
    public final List<GoldenItem> component2() {
        return this.goldenItems;
    }

    @k
    public final List<TrainingConfig> component3() {
        return this.trainingItems;
    }

    @l
    public final List<h> component4() {
        return this.banner;
    }

    @k
    public final GoldenNavigationAndTrainingConfig copy(boolean z11, @k List<GoldenItem> goldenItems, @k List<TrainingConfig> trainingItems, @l List<h> list) {
        g0.p(goldenItems, "goldenItems");
        g0.p(trainingItems, "trainingItems");
        return new GoldenNavigationAndTrainingConfig(z11, goldenItems, trainingItems, list);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoldenNavigationAndTrainingConfig)) {
            return false;
        }
        GoldenNavigationAndTrainingConfig goldenNavigationAndTrainingConfig = (GoldenNavigationAndTrainingConfig) obj;
        return this.f24423on == goldenNavigationAndTrainingConfig.f24423on && g0.g(this.goldenItems, goldenNavigationAndTrainingConfig.goldenItems) && g0.g(this.trainingItems, goldenNavigationAndTrainingConfig.trainingItems) && g0.g(this.banner, goldenNavigationAndTrainingConfig.banner);
    }

    @l
    public final List<h> getBanner() {
        return this.banner;
    }

    @k
    public final List<GoldenItem> getGoldenItems() {
        return this.goldenItems;
    }

    public final boolean getOn() {
        return this.f24423on;
    }

    @k
    public final List<TrainingConfig> getTrainingItems() {
        return this.trainingItems;
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.f24423on) * 31) + this.goldenItems.hashCode()) * 31) + this.trainingItems.hashCode()) * 31;
        List<h> list = this.banner;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        return "GoldenNavigationAndTrainingConfig(on=" + this.f24423on + ", goldenItems=" + this.goldenItems + ", trainingItems=" + this.trainingItems + ", banner=" + this.banner + j.f81007d;
    }
}
