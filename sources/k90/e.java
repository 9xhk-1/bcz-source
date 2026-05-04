package k90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f66086i = new char[0];

    /* renamed from: h, reason: collision with root package name */
    public int f66087h;

    public e(String str) {
        this(4096, str);
    }

    @Override // k90.d, k90.a
    public String A() {
        String A = super.A();
        int length = this.f66082c.length;
        int i11 = this.f66087h;
        if (length > i11) {
            this.f66082c = new char[i11];
        }
        return A;
    }

    public char[] G() {
        char[] cArr;
        int i11 = this.f66083d - this.f66085f;
        int i12 = 0;
        while (i12 < i11 && this.f66082c[i12] <= ' ') {
            i12++;
        }
        if (i12 >= i11) {
            return f66086i;
        }
        while (true) {
            cArr = this.f66082c;
            if (cArr[i11 - 1] > ' ') {
                break;
            }
            i11--;
        }
        int i13 = i11 - i12;
        if (i13 <= 0) {
            return f66086i;
        }
        char[] cArr2 = new char[i13];
        System.arraycopy(cArr, i12, cArr2, 0, i13);
        reset();
        return cArr2;
    }

    public String H() {
        char[] cArr;
        int i11 = this.f66083d - this.f66085f;
        int i12 = 0;
        while (i12 < i11 && this.f66082c[i12] <= ' ') {
            i12++;
        }
        if (i12 >= i11) {
            return this.f66084e;
        }
        while (true) {
            cArr = this.f66082c;
            if (cArr[i11 - 1] > ' ') {
                break;
            }
            i11--;
        }
        int i13 = i11 - i12;
        if (i13 <= 0) {
            return this.f66084e;
        }
        String str = new String(cArr, i12, i13);
        reset();
        return str;
    }

    @Override // k90.d, k90.a
    public void reset() {
        int length = this.f66082c.length;
        int i11 = this.f66087h;
        if (length > i11) {
            this.f66082c = new char[i11];
        }
        super.reset();
    }

    @Override // k90.d, k90.a
    public char[] t() {
        char[] t11 = super.t();
        int length = this.f66082c.length;
        int i11 = this.f66087h;
        if (length > i11) {
            this.f66082c = new char[i11];
        }
        return t11;
    }

    public e(int i11, String str) {
        super(i11, str, 0);
        this.f66087h = i11;
    }
}
