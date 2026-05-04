package com.baicizhan.main.model.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TrainingConfig {
    public static final int $stable = 8;

    @k
    private final List<Integer> items;

    @k
    private final String model;

    public TrainingConfig(@k String model, @k List<Integer> items) {
        g0.p(model, "model");
        g0.p(items, "items");
        this.model = model;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrainingConfig copy$default(TrainingConfig trainingConfig, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trainingConfig.model;
        }
        if ((i11 & 2) != 0) {
            list = trainingConfig.items;
        }
        return trainingConfig.copy(str, list);
    }

    @k
    public final String component1() {
        return this.model;
    }

    @k
    public final List<Integer> component2() {
        return this.items;
    }

    @k
    public final TrainingConfig copy(@k String model, @k List<Integer> items) {
        g0.p(model, "model");
        g0.p(items, "items");
        return new TrainingConfig(model, items);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrainingConfig)) {
            return false;
        }
        TrainingConfig trainingConfig = (TrainingConfig) obj;
        return g0.g(this.model, trainingConfig.model) && g0.g(this.items, trainingConfig.items);
    }

    @k
    public final List<Integer> getItems() {
        return this.items;
    }

    @k
    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return (this.model.hashCode() * 31) + this.items.hashCode();
    }

    @k
    public String toString() {
        return "TrainingConfig(model=" + this.model + ", items=" + this.items + j.f81007d;
    }
}
