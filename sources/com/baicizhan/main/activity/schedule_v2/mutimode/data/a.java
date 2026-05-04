package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import android.os.Parcel;
import androidx.compose.runtime.internal.StabilityInferred;
import e50.f;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class a implements e50.f<ContentType> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f19299a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f19300b = 0;

    @Override // e50.f
    @k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ContentType a(@k Parcel parcel) {
        g0.p(parcel, "parcel");
        return ContentType.Companion.a(parcel.readInt());
    }

    @Override // e50.f
    @k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* bridge */ ContentType[] newArray(int i11) {
        return (ContentType[]) f.a.a(this, i11);
    }

    @Override // e50.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void b(@k ContentType contentType, @k Parcel parcel, int i11) {
        g0.p(contentType, "<this>");
        g0.p(parcel, "parcel");
        parcel.writeInt(contentType.getId());
    }
}
