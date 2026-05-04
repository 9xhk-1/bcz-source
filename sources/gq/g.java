package gq;

import com.google.zxing.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f54012a;

    public g(boolean z11) {
        this.f54012a = z11;
    }

    public void a(l[] lVarArr) {
        if (!this.f54012a || lVarArr == null || lVarArr.length < 3) {
            return;
        }
        l lVar = lVarArr[0];
        lVarArr[0] = lVarArr[2];
        lVarArr[2] = lVar;
    }

    public boolean b() {
        return this.f54012a;
    }
}
