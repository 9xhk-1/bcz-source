package l70;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d implements org.apache.http.h {

    /* renamed from: a, reason: collision with root package name */
    public final org.apache.http.e[] f70680a;

    /* renamed from: b, reason: collision with root package name */
    public int f70681b = b(-1);

    /* renamed from: c, reason: collision with root package name */
    public String f70682c;

    public d(org.apache.http.e[] eVarArr, String str) {
        this.f70680a = (org.apache.http.e[]) e80.a.j(eVarArr, "Header array");
        this.f70682c = str;
    }

    public boolean a(int i11) {
        String str = this.f70682c;
        return str == null || str.equalsIgnoreCase(this.f70680a[i11].getName());
    }

    public int b(int i11) {
        if (i11 < -1) {
            return -1;
        }
        int length = this.f70680a.length - 1;
        boolean z11 = false;
        while (!z11 && i11 < length) {
            i11++;
            z11 = a(i11);
        }
        if (z11) {
            return i11;
        }
        return -1;
    }

    @Override // org.apache.http.h, java.util.Iterator
    public boolean hasNext() {
        return this.f70681b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return r();
    }

    @Override // org.apache.http.h
    public org.apache.http.e r() throws NoSuchElementException {
        int i11 = this.f70681b;
        if (i11 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.f70681b = b(i11);
        return this.f70680a[i11];
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}
