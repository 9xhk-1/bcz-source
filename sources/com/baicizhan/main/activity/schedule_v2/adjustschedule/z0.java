package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class z0 extends m2 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f19223k = 8;

    public z0(@m80.l String str, @m80.l String str2) {
        super(str, str2);
    }

    @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.m2, com.baicizhan.main.activity.schedule_v2.adjustschedule.a
    public int f() {
        return 10;
    }

    @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.m2, com.baicizhan.main.activity.schedule_v2.adjustschedule.a
    public int g(int i11) {
        if (i11 < 200) {
            return 10;
        }
        return i11 < 400 ? 20 : 50;
    }
}
