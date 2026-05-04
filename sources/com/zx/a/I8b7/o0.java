package com.zx.a.I8b7;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class o0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public l0 f46630a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46631b = true;

    public o0(l0 l0Var) {
        this.f46630a = (l0) f2.a(l0Var);
    }

    @Override // com.zx.a.I8b7.j0
    public boolean a(int i11, String str) {
        int i12 = i11 & 240;
        if (i12 == 0 || i12 == 16) {
            return this.f46631b;
        }
        return false;
    }

    @Override // com.zx.a.I8b7.j0
    public void a(int i11, String str, String str2, Throwable th2) {
        if ((i11 & 240) != 0) {
            i11 &= 15;
        }
        this.f46630a.a(i11, str, str2, th2);
    }
}
