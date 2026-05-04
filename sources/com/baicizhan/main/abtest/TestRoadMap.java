package com.baicizhan.main.abtest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.NoProguard;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TestRoadMap implements NoProguard {
    public static final int $stable = 8;

    /* renamed from: id, reason: collision with root package name */
    private int f17840id;

    @k
    private Integer[] options = new Integer[0];

    public final int getId() {
        return this.f17840id;
    }

    @k
    public final Integer[] getOptions() {
        return this.options;
    }

    public final void setId(int i11) {
        this.f17840id = i11;
    }

    public final void setOptions(@k Integer[] numArr) {
        g0.p(numArr, "<set-?>");
        this.options = numArr;
    }
}
