package com.baicizhan.app.biz.game.model;

import com.baicizhan.app.biz.game.model.RoundCateFlags;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f14174a;

    public static /* synthetic */ b c(b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return bVar.b(z11);
    }

    public static /* synthetic */ b e(b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return bVar.d(z11);
    }

    public final int a() {
        return RoundCateFlags.g(this.f14174a);
    }

    @k
    public final b b(boolean z11) {
        this.f14174a = z11 ? this.f14174a | RoundCateFlags.Flag.NEW_USER.getBit() : this.f14174a & (~RoundCateFlags.Flag.NEW_USER.getBit());
        return this;
    }

    @k
    public final b d(boolean z11) {
        this.f14174a = z11 ? this.f14174a | RoundCateFlags.Flag.PURCHASED_BOOK.getBit() : this.f14174a & (~RoundCateFlags.Flag.PURCHASED_BOOK.getBit());
        return this;
    }
}
