package z0;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final List<a<e1.i, Path>> f100501a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a<Integer, Integer>> f100502b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Mask> f100503c;

    public h(List<Mask> list) {
        this.f100503c = list;
        this.f100501a = new ArrayList(list.size());
        this.f100502b = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f100501a.add(list.get(i11).b().k());
            this.f100502b.add(list.get(i11).c().k());
        }
    }

    public List<a<e1.i, Path>> a() {
        return this.f100501a;
    }

    public List<Mask> b() {
        return this.f100503c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f100502b;
    }
}
