package com.baicizhan.main.word_book.list;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27080a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final byte[] f27081b;

    public e2(int i11, @m80.k byte[] bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        this.f27080a = i11;
        this.f27081b = bytes;
    }

    public static /* synthetic */ e2 d(e2 e2Var, int i11, byte[] bArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = e2Var.f27080a;
        }
        if ((i12 & 2) != 0) {
            bArr = e2Var.f27081b;
        }
        return e2Var.c(i11, bArr);
    }

    public final int a() {
        return this.f27080a;
    }

    @m80.k
    public final byte[] b() {
        return this.f27081b;
    }

    @m80.k
    public final e2 c(int i11, @m80.k byte[] bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return new e2(i11, bytes);
    }

    @m80.k
    public final byte[] e() {
        return this.f27081b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.g0.g(e2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type com.baicizhan.main.word_book.list.TakenImage");
        e2 e2Var = (e2) obj;
        return this.f27080a == e2Var.f27080a && Arrays.equals(this.f27081b, e2Var.f27081b);
    }

    public final int f() {
        return this.f27080a;
    }

    public int hashCode() {
        return (this.f27080a * 31) + Arrays.hashCode(this.f27081b);
    }

    @m80.k
    public String toString() {
        return "TakenImage(rotation=" + this.f27080a + ", bytes=" + Arrays.toString(this.f27081b) + pn.j.f81007d;
    }
}
