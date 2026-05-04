package com.google.accompanist.pager;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b
/* loaded from: classes6.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f30377a;

    public e(@k f state) {
        g0.p(state, "state");
        this.f30377a = state;
    }

    @Override // com.google.accompanist.pager.d
    public int a() {
        return this.f30377a.k();
    }

    @Override // com.google.accompanist.pager.d
    public float b() {
        return this.f30377a.l();
    }
}
