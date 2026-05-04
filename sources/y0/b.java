package y0;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final List<v> f98804a = new ArrayList();

    public void a(v vVar) {
        this.f98804a.add(vVar);
    }

    public void b(Path path) {
        for (int size = this.f98804a.size() - 1; size >= 0; size--) {
            j1.j.b(path, this.f98804a.get(size));
        }
    }
}
