package tk;

import androidx.annotation.NonNull;
import fl.m;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b implements u<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f90766a;

    public b(byte[] bArr) {
        this.f90766a = (byte[]) m.e(bArr);
    }

    @Override // kk.u
    @NonNull
    public Class<byte[]> a() {
        return byte[].class;
    }

    @Override // kk.u
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f90766a;
    }

    @Override // kk.u
    public int getSize() {
        return this.f90766a.length;
    }

    @Override // kk.u
    public void recycle() {
    }
}
