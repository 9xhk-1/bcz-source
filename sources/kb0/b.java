package kb0;

import org.mozilla.classfile.ClassFileWriter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public short f66268a;

    /* renamed from: b, reason: collision with root package name */
    public short f66269b;

    /* renamed from: c, reason: collision with root package name */
    public short f66270c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f66271d = false;

    /* renamed from: e, reason: collision with root package name */
    public short f66272e;

    /* renamed from: f, reason: collision with root package name */
    public short f66273f;

    /* renamed from: g, reason: collision with root package name */
    public short f66274g;

    /* renamed from: h, reason: collision with root package name */
    public int f66275h;

    public b(short s11, short s12, short s13) {
        this.f66268a = s11;
        this.f66269b = s12;
        this.f66270c = s13;
    }

    public int a() {
        return !this.f66271d ? 8 : 16;
    }

    public void b(short s11, short s12, short s13, int i11) {
        this.f66271d = true;
        this.f66272e = s11;
        this.f66273f = s12;
        this.f66274g = s13;
        this.f66275h = i11;
    }

    public int c(byte[] bArr, int i11) {
        int G0 = ClassFileWriter.G0(this.f66269b, bArr, ClassFileWriter.G0(this.f66268a, bArr, ClassFileWriter.G0(this.f66270c, bArr, i11)));
        if (!this.f66271d) {
            return ClassFileWriter.G0(0, bArr, G0);
        }
        return ClassFileWriter.G0(this.f66275h, bArr, ClassFileWriter.G0(this.f66274g, bArr, ClassFileWriter.G0(this.f66273f, bArr, ClassFileWriter.G0(this.f66272e, bArr, ClassFileWriter.G0(1, bArr, G0)))));
    }
}
