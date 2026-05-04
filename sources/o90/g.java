package o90;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class g<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends r<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final Comparator<String> f76652k = new a();

    /* renamed from: l, reason: collision with root package name */
    public static final Comparator<String> f76653l = new b();

    /* renamed from: d, reason: collision with root package name */
    public int f76654d;

    /* renamed from: e, reason: collision with root package name */
    public NormalizedString f76655e;

    /* renamed from: f, reason: collision with root package name */
    public c[] f76656f;

    /* renamed from: g, reason: collision with root package name */
    public c f76657g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f76658h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f76659i;

    /* renamed from: j, reason: collision with root package name */
    public Comparator<String> f76660j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            if (str != str2) {
                return (str == null || !str.equals(str2)) ? 1 : 0;
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Comparator<String> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            if (str != str2) {
                return (str == null || !str.equalsIgnoreCase(str2)) ? 1 : 0;
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> {

        /* renamed from: a, reason: collision with root package name */
        public final z<T> f76661a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f76662b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f76663c;

        /* renamed from: d, reason: collision with root package name */
        public final String f76664d;

        /* renamed from: e, reason: collision with root package name */
        public final n90.j f76665e;

        public c(z<T> zVar, String[] strArr, int[] iArr, String str, n90.j jVar) {
            this.f76661a = zVar;
            this.f76662b = (strArr == null || strArr.length == 0) ? null : strArr;
            this.f76663c = (iArr == null || iArr.length == 0) ? null : iArr;
            this.f76664d = str != null ? str.intern() : null;
            this.f76665e = jVar;
        }

        public String toString() {
            return "Switch{processor=" + this.f76661a + ", headers=" + Arrays.toString(this.f76662b) + ", indexes=" + Arrays.toString(this.f76663c) + ", value='" + this.f76664d + "', matcher=" + this.f76665e + l50.b.f69928j;
        }
    }

    public g() {
        this(0);
    }

    @Override // o90.r
    public String[] b() {
        return this.f76658h;
    }

    @Override // o90.r
    public int[] c() {
        return this.f76659i;
    }

    @Override // o90.r
    public final z<T> f(String[] strArr, T t11) {
        int i11;
        c cVar;
        if (this.f76654d == -1) {
            NormalizedString[] identifierGroupArray = NormalizedString.toIdentifierGroupArray(t11.a());
            if (identifierGroupArray == null) {
                throw new DataProcessingException("Unable to determine position of column named '" + ((Object) this.f76655e) + "' as no headers have been defined nor extracted from the input");
            }
            int f11 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f(identifierGroupArray, this.f76655e);
            this.f76654d = f11;
            if (f11 == -1) {
                throw new DataProcessingException("Unable to determine position of column named '" + ((Object) this.f76655e) + "' as it does not exist in the headers. Available headers are " + Arrays.toString(identifierGroupArray));
            }
        }
        int i12 = this.f76654d;
        if (i12 < strArr.length) {
            String str = strArr[i12];
            while (true) {
                c[] cVarArr = this.f76656f;
                if (i11 >= cVarArr.length) {
                    break;
                }
                cVar = cVarArr[i11];
                n90.j jVar = cVar.f76665e;
                i11 = ((jVar == null || !jVar.a(str)) && this.f76660j.compare(str, cVar.f76664d) != 0) ? i11 + 1 : 0;
            }
            this.f76658h = cVar.f76662b;
            this.f76659i = cVar.f76663c;
            return cVar.f76661a;
        }
        c cVar2 = this.f76657g;
        if (cVar2 != null) {
            this.f76658h = cVar2.f76662b;
            this.f76659i = cVar2.f76663c;
            return cVar2.f76661a;
        }
        this.f76658h = null;
        this.f76659i = null;
        throw new DataProcessingException("Unable to process input row. No switches activated and no default switch defined.", this.f76654d, strArr, null);
    }

    public void k(String str, z<T> zVar) {
        c[] cVarArr = this.f76656f;
        c[] cVarArr2 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length + 1);
        this.f76656f = cVarArr2;
        cVarArr2[cVarArr2.length - 1] = new c(zVar, null, null, str, null);
    }

    public void l(String str, z<T> zVar, int... iArr) {
        c[] cVarArr = this.f76656f;
        c[] cVarArr2 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length + 1);
        this.f76656f = cVarArr2;
        cVarArr2[cVarArr2.length - 1] = new c(zVar, null, iArr, str, null);
    }

    public void m(String str, z<T> zVar, String... strArr) {
        c[] cVarArr = this.f76656f;
        c[] cVarArr2 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length + 1);
        this.f76656f = cVarArr2;
        cVarArr2[cVarArr2.length - 1] = new c(zVar, strArr, null, str, null);
    }

    public void n(n90.j jVar, z<T> zVar) {
        c[] cVarArr = this.f76656f;
        c[] cVarArr2 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length + 1);
        this.f76656f = cVarArr2;
        cVarArr2[cVarArr2.length - 1] = new c(zVar, null, null, null, jVar);
    }

    public void o(n90.j jVar, z<T> zVar, int... iArr) {
        c[] cVarArr = this.f76656f;
        c[] cVarArr2 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length + 1);
        this.f76656f = cVarArr2;
        cVarArr2[cVarArr2.length - 1] = new c(zVar, null, iArr, null, jVar);
    }

    public void p(n90.j jVar, z<T> zVar, String... strArr) {
        c[] cVarArr = this.f76656f;
        c[] cVarArr2 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length + 1);
        this.f76656f = cVarArr2;
        cVarArr2[cVarArr2.length - 1] = new c(zVar, strArr, null, null, jVar);
    }

    public boolean r() {
        return this.f76657g != null;
    }

    public void u(boolean z11) {
        this.f76660j = z11 ? f76652k : f76653l;
    }

    public void v(Comparator<String> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Comparator must not be null");
        }
        this.f76660j = comparator;
    }

    public void w(z<T> zVar) {
        this.f76657g = new c(zVar, null, null, null, null);
    }

    public void x(z<T> zVar, int... iArr) {
        this.f76657g = new c(zVar, null, iArr, null, null);
    }

    public void y(z<T> zVar, String... strArr) {
        this.f76657g = new c(zVar, strArr, null, null, null);
    }

    public g(int i11) {
        this.f76654d = -1;
        this.f76655e = null;
        this.f76656f = new c[0];
        this.f76657g = null;
        this.f76660j = f76653l;
        if (i11 < 0) {
            throw new IllegalArgumentException("Column index must be positive");
        }
        this.f76654d = i11;
    }

    public g(String str) {
        this.f76654d = -1;
        this.f76655e = null;
        this.f76656f = new c[0];
        this.f76657g = null;
        this.f76660j = f76653l;
        if (str != null && !str.trim().isEmpty()) {
            this.f76655e = NormalizedString.valueOf(str);
            return;
        }
        throw new IllegalArgumentException("Column name cannot be blank");
    }
}
