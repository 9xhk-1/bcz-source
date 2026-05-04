package qk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pk.n;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a<Model> implements o<Model, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final o<pk.h, InputStream> f82342a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final n<Model, pk.h> f82343b;

    public a(o<pk.h, InputStream> oVar) {
        this(oVar, null);
    }

    public static List<ik.b> a(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new pk.h(it.next()));
        }
        return arrayList;
    }

    public List<String> b(Model model, int i11, int i12, ik.e eVar) {
        return Collections.EMPTY_LIST;
    }

    @Override // pk.o
    @Nullable
    public o.a<InputStream> buildLoadData(@NonNull Model model, int i11, int i12, @NonNull ik.e eVar) {
        n<Model, pk.h> nVar = this.f82343b;
        pk.h b11 = nVar != null ? nVar.b(model, i11, i12) : null;
        if (b11 == null) {
            String d11 = d(model, i11, i12, eVar);
            if (TextUtils.isEmpty(d11)) {
                return null;
            }
            pk.h hVar = new pk.h(d11, c(model, i11, i12, eVar));
            n<Model, pk.h> nVar2 = this.f82343b;
            if (nVar2 != null) {
                nVar2.c(model, i11, i12, hVar);
            }
            b11 = hVar;
        }
        List<String> b12 = b(model, i11, i12, eVar);
        o.a<InputStream> buildLoadData = this.f82342a.buildLoadData(b11, i11, i12, eVar);
        return (buildLoadData == null || b12.isEmpty()) ? buildLoadData : new o.a<>(buildLoadData.f80728a, a(b12), buildLoadData.f80730c);
    }

    @Nullable
    public pk.i c(Model model, int i11, int i12, ik.e eVar) {
        return pk.i.f80706b;
    }

    public abstract String d(Model model, int i11, int i12, ik.e eVar);

    public a(o<pk.h, InputStream> oVar, @Nullable n<Model, pk.h> nVar) {
        this.f82342a = oVar;
        this.f82343b = nVar;
    }
}
