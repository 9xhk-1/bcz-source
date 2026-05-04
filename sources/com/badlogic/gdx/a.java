package com.badlogic.gdx;

import com.badlogic.gdx.utils.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements Input {

    /* renamed from: d, reason: collision with root package name */
    public int f11480d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11481e;

    /* renamed from: c, reason: collision with root package name */
    public final e f11479c = new e();

    /* renamed from: a, reason: collision with root package name */
    public final boolean[] f11477a = new boolean[256];

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f11478b = new boolean[256];

    @Override // com.badlogic.gdx.Input
    public boolean J(int i11) {
        return this.f11479c.j(i11);
    }

    @Override // com.badlogic.gdx.Input
    public void O(int i11, boolean z11) {
        if (z11) {
            this.f11479c.a(i11);
        } else {
            this.f11479c.r(i11);
        }
    }

    @Override // com.badlogic.gdx.Input
    public boolean c(int i11) {
        if (i11 == -1) {
            return this.f11480d > 0;
        }
        if (i11 < 0 || i11 > 255) {
            return false;
        }
        return this.f11477a[i11];
    }

    @Override // com.badlogic.gdx.Input
    public boolean t(int i11) {
        if (i11 == -1) {
            return this.f11481e;
        }
        if (i11 < 0 || i11 > 255) {
            return false;
        }
        return this.f11478b[i11];
    }
}
