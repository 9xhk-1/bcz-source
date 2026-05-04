package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import android.os.Parcel;
import androidx.compose.runtime.internal.StabilityInferred;
import e50.f;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class f implements e50.f<e> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f19316a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final int f19317b = 0;

    @Override // e50.f
    @k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e a(@k Parcel parcel) {
        g0.p(parcel, "parcel");
        return e.f19301b.a(parcel.readInt());
    }

    @Override // e50.f
    @k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* bridge */ e[] newArray(int i11) {
        return (e[]) f.a.a(this, i11);
    }

    @Override // e50.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void b(@k e eVar, @k Parcel parcel, int i11) {
        g0.p(eVar, "<this>");
        g0.p(parcel, "parcel");
        parcel.writeInt(eVar.a());
    }
}
