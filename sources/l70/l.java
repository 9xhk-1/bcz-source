package l70;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class l implements org.apache.http.h {

    /* renamed from: a, reason: collision with root package name */
    public final List<org.apache.http.e> f70710a;

    /* renamed from: b, reason: collision with root package name */
    public int f70711b = b(-1);

    /* renamed from: c, reason: collision with root package name */
    public int f70712c = -1;

    /* renamed from: d, reason: collision with root package name */
    public String f70713d;

    public l(List<org.apache.http.e> list, String str) {
        this.f70710a = (List) e80.a.j(list, "Header list");
        this.f70713d = str;
    }

    public boolean a(int i11) {
        if (this.f70713d == null) {
            return true;
        }
        return this.f70713d.equalsIgnoreCase(this.f70710a.get(i11).getName());
    }

    public int b(int i11) {
        if (i11 < -1) {
            return -1;
        }
        int size = this.f70710a.size() - 1;
        boolean z11 = false;
        while (!z11 && i11 < size) {
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
        return this.f70711b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return r();
    }

    @Override // org.apache.http.h
    public org.apache.http.e r() throws NoSuchElementException {
        int i11 = this.f70711b;
        if (i11 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.f70712c = i11;
        this.f70711b = b(i11);
        return this.f70710a.get(i11);
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        e80.b.a(this.f70712c >= 0, "No header to remove");
        this.f70710a.remove(this.f70712c);
        this.f70712c = -1;
        this.f70711b--;
    }
}
