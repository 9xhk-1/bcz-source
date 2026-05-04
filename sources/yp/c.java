package yp;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f100240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100241b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f100242c;

    public c(List<b> list, int i11, boolean z11) {
        this.f100240a = new ArrayList(list);
        this.f100241b = i11;
        this.f100242c = z11;
    }

    public List<b> a() {
        return this.f100240a;
    }

    public int b() {
        return this.f100241b;
    }

    public boolean c(List<b> list) {
        return this.f100240a.equals(list);
    }

    public boolean d() {
        return this.f100242c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f100240a.equals(cVar.a()) && this.f100242c == cVar.f100242c;
    }

    public int hashCode() {
        return this.f100240a.hashCode() ^ Boolean.valueOf(this.f100242c).hashCode();
    }

    public String toString() {
        return "{ " + this.f100240a + " }";
    }
}
