package vn;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m extends h {

    /* renamed from: a, reason: collision with root package name */
    public final h f94150a;

    /* renamed from: b, reason: collision with root package name */
    public final float f94151b;

    public m(@NonNull h hVar, float f11) {
        this.f94150a = hVar;
        this.f94151b = f11;
    }

    @Override // vn.h
    public boolean a() {
        return this.f94150a.a();
    }

    @Override // vn.h
    public void b(float f11, float f12, float f13, @NonNull r rVar) {
        this.f94150a.b(f11, f12 - this.f94151b, f13, rVar);
    }
}
