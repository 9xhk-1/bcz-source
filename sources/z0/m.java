package z0;

import android.graphics.Path;
import androidx.annotation.Nullable;
import java.util.List;
import y0.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m extends a<e1.i, Path> {

    /* renamed from: i, reason: collision with root package name */
    public final e1.i f100512i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f100513j;

    /* renamed from: k, reason: collision with root package name */
    public List<t> f100514k;

    public m(List<k1.a<e1.i>> list) {
        super(list);
        this.f100512i = new e1.i();
        this.f100513j = new Path();
    }

    @Override // z0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Path i(k1.a<e1.i> aVar, float f11) {
        this.f100512i.c(aVar.f64876b, aVar.f64877c, f11);
        e1.i iVar = this.f100512i;
        List<t> list = this.f100514k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                iVar = this.f100514k.get(size).g(iVar);
            }
        }
        j1.i.i(iVar, this.f100513j);
        return this.f100513j;
    }

    public void q(@Nullable List<t> list) {
        this.f100514k = list;
    }
}
