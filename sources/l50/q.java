package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final q f70048a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final char[] f70049b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final byte[] f70050c;

    static {
        q qVar = new q();
        f70048a = qVar;
        f70049b = new char[117];
        f70050c = new byte[126];
        qVar.f();
        qVar.e();
    }

    public final void a(char c11, char c12) {
        b(c11, c12);
    }

    public final void b(int i11, char c11) {
        if (c11 != 'u') {
            f70049b[c11] = (char) i11;
        }
    }

    public final void c(char c11, byte b11) {
        d(c11, b11);
    }

    public final void d(int i11, byte b11) {
        f70050c[i11] = b11;
    }

    public final void e() {
        for (int i11 = 0; i11 < 33; i11++) {
            d(i11, Byte.MAX_VALUE);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c(b.f69927i, (byte) 6);
        c(b.f69928j, (byte) 7);
        c('[', (byte) 8);
        c(b.f69930l, (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    public final void f() {
        for (int i11 = 0; i11 < 32; i11++) {
            b(i11, b.f69934p);
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
