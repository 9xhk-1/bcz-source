package kb0;

import org.mozilla.classfile.ClassFileWriter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f66276a;

    /* renamed from: b, reason: collision with root package name */
    public String f66277b;

    /* renamed from: c, reason: collision with root package name */
    public short f66278c;

    /* renamed from: d, reason: collision with root package name */
    public short f66279d;

    /* renamed from: e, reason: collision with root package name */
    public short f66280e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f66281f;

    public c(String str, short s11, String str2, short s12, short s13) {
        this.f66276a = str;
        this.f66278c = s11;
        this.f66277b = str2;
        this.f66279d = s12;
        this.f66280e = s13;
    }

    public short a() {
        return this.f66280e;
    }

    public String b() {
        return this.f66276a;
    }

    public String c() {
        return this.f66277b;
    }

    public int d() {
        return this.f66281f.length + 8;
    }

    public void e(byte[] bArr) {
        this.f66281f = bArr;
    }

    public int f(byte[] bArr, int i11) {
        int G0 = ClassFileWriter.G0(1, bArr, ClassFileWriter.G0(this.f66279d, bArr, ClassFileWriter.G0(this.f66278c, bArr, ClassFileWriter.G0(this.f66280e, bArr, i11))));
        byte[] bArr2 = this.f66281f;
        System.arraycopy(bArr2, 0, bArr, G0, bArr2.length);
        return G0 + this.f66281f.length;
    }
}
