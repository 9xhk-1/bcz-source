package wk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import hk.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b implements a.InterfaceC0675a {

    /* renamed from: a, reason: collision with root package name */
    public final lk.e f96423a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final lk.b f96424b;

    public b(lk.e eVar) {
        this(eVar, null);
    }

    @Override // hk.a.InterfaceC0675a
    @NonNull
    public byte[] a(int i11) {
        lk.b bVar = this.f96424b;
        return bVar == null ? new byte[i11] : (byte[]) bVar.a(i11, byte[].class);
    }

    @Override // hk.a.InterfaceC0675a
    @NonNull
    public Bitmap b(int i11, int i12, @NonNull Bitmap.Config config) {
        return this.f96423a.g(i11, i12, config);
    }

    @Override // hk.a.InterfaceC0675a
    public void c(@NonNull Bitmap bitmap) {
        this.f96423a.e(bitmap);
    }

    @Override // hk.a.InterfaceC0675a
    @NonNull
    public int[] d(int i11) {
        lk.b bVar = this.f96424b;
        return bVar == null ? new int[i11] : (int[]) bVar.a(i11, int[].class);
    }

    @Override // hk.a.InterfaceC0675a
    public void e(@NonNull byte[] bArr) {
        lk.b bVar = this.f96424b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // hk.a.InterfaceC0675a
    public void f(@NonNull int[] iArr) {
        lk.b bVar = this.f96424b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }

    public b(lk.e eVar, @Nullable lk.b bVar) {
        this.f96423a = eVar;
        this.f96424b = bVar;
    }
}
