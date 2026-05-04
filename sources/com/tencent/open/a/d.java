package com.tencent.open.a;

import java.io.IOException;
import okhttp3.n;
import okhttp3.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private n f44431a;

    /* renamed from: b, reason: collision with root package name */
    private String f44432b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f44433c;

    /* renamed from: d, reason: collision with root package name */
    private int f44434d;

    /* renamed from: e, reason: collision with root package name */
    private int f44435e;

    public d(n nVar, int i11) {
        this.f44431a = nVar;
        this.f44434d = i11;
        this.f44433c = nVar.Z();
        o L = this.f44431a.L();
        if (L != null) {
            this.f44435e = (int) L.q();
        } else {
            this.f44435e = 0;
        }
    }

    @Override // com.tencent.open.a.g
    public String a() throws IOException {
        if (this.f44432b == null) {
            o L = this.f44431a.L();
            if (L != null) {
                this.f44432b = L.Z();
            }
            if (this.f44432b == null) {
                this.f44432b = "";
            }
        }
        return this.f44432b;
    }

    @Override // com.tencent.open.a.g
    public int b() {
        return this.f44435e;
    }

    @Override // com.tencent.open.a.g
    public int c() {
        return this.f44434d;
    }

    @Override // com.tencent.open.a.g
    public int d() {
        return this.f44433c;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + this.f44432b + this.f44433c + this.f44434d + this.f44435e;
    }
}
