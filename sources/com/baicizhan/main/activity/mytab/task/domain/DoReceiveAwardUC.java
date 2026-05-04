package com.baicizhan.main.activity.mytab.task.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.mytab.task.data.h;
import javax.inject.Inject;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.i;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DoReceiveAwardUC {

    /* renamed from: b, reason: collision with root package name */
    public static final int f18797b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f18798a;

    @Inject
    public DoReceiveAwardUC(@k h tasksRepo) {
        g0.p(tasksRepo, "tasksRepo");
        this.f18798a = tasksRepo;
    }

    @k
    public final i<String> b(int i11) {
        return kotlinx.coroutines.flow.k.C0(this.f18798a.c(i11), new DoReceiveAwardUC$invoke$1(this, null));
    }
}
