package lk;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g implements a<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f71445a = "ByteArrayPool";

    @Override // lk.a
    public int b() {
        return 1;
    }

    @Override // lk.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // lk.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i11) {
        return new byte[i11];
    }

    @Override // lk.a
    public String getTag() {
        return f71445a;
    }
}
