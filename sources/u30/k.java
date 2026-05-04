package u30;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k implements Iterator<String>, y00.a {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f91669f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f91670g = 0;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final int f91671h = 1;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f91672i = 2;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final CharSequence f91673a;

    /* renamed from: b, reason: collision with root package name */
    public int f91674b;

    /* renamed from: c, reason: collision with root package name */
    public int f91675c;

    /* renamed from: d, reason: collision with root package name */
    public int f91676d;

    /* renamed from: e, reason: collision with root package name */
    public int f91677e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public k(@m80.k CharSequence string) {
        kotlin.jvm.internal.g0.p(string, "string");
        this.f91673a = string;
    }

    @Override // java.util.Iterator
    @m80.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f91674b = 0;
        int i11 = this.f91676d;
        int i12 = this.f91675c;
        this.f91675c = this.f91677e + i11;
        return this.f91673a.subSequence(i12, i11).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i11;
        int i12;
        int i13 = this.f91674b;
        if (i13 != 0) {
            return i13 == 1;
        }
        if (this.f91677e < 0) {
            this.f91674b = 2;
            return false;
        }
        int length = this.f91673a.length();
        int length2 = this.f91673a.length();
        for (int i14 = this.f91675c; i14 < length2; i14++) {
            char charAt = this.f91673a.charAt(i14);
            if (charAt == '\n' || charAt == '\r') {
                i11 = (charAt == '\r' && (i12 = i14 + 1) < this.f91673a.length() && this.f91673a.charAt(i12) == '\n') ? 2 : 1;
                length = i14;
                this.f91674b = 1;
                this.f91677e = i11;
                this.f91676d = length;
                return true;
            }
        }
        i11 = -1;
        this.f91674b = 1;
        this.f91677e = i11;
        this.f91676d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
