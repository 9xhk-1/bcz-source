package h70;

import java.nio.channels.SelectionKey;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final SelectionKey f58806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58807b;

    public k(SelectionKey selectionKey, int i11) {
        e80.a.j(selectionKey, "Selection key");
        this.f58806a = selectionKey;
        this.f58807b = i11;
    }

    public int a() {
        return this.f58807b;
    }

    public SelectionKey b() {
        return this.f58806a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f58806a.equals(((k) obj).f58806a);
        }
        return false;
    }

    public int hashCode() {
        return this.f58806a.hashCode();
    }
}
