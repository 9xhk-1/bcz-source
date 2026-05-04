package n90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k extends o90.g<org.junit.jupiter.params.shadow.com.univocity.parsers.common.y> implements y {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.a0 {

        /* renamed from: b, reason: collision with root package name */
        public final String[] f74976b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f74977c;

        public a(org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
            super(yVar);
            this.f74976b = k.this.b();
            this.f74977c = k.this.c();
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
        public String[] a() {
            String[] strArr = this.f74976b;
            return (strArr == null || strArr.length == 0) ? ((org.junit.jupiter.params.shadow.com.univocity.parsers.common.y) this.f78166a).a() : strArr;
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
        public int[] g() {
            int[] iArr = this.f74977c;
            return (iArr == null || iArr.length == 0) ? ((org.junit.jupiter.params.shadow.com.univocity.parsers.common.y) this.f78166a).g() : iArr;
        }
    }

    public k() {
        this(0);
    }

    @Override // n90.y
    public /* bridge */ /* synthetic */ void g(org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
        super.i(yVar);
    }

    @Override // n90.y
    public /* bridge */ /* synthetic */ void s(org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
        super.h(yVar);
    }

    @Override // n90.y
    public /* bridge */ /* synthetic */ void t(String[] strArr, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
        super.q(strArr, yVar);
    }

    @Override // o90.r
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final org.junit.jupiter.params.shadow.com.univocity.parsers.common.y j(org.junit.jupiter.params.shadow.com.univocity.parsers.common.y yVar) {
        return new a(yVar);
    }

    public k(int i11) {
        super(i11);
    }

    public k(String str) {
        super(str);
    }
}
