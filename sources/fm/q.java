package fm;

import com.github.mikephil.charting.data.Entry;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class q extends k<km.j> {

    /* renamed from: j, reason: collision with root package name */
    public List<String> f52075j;

    public q() {
    }

    public List<String> Q() {
        return this.f52075j;
    }

    public void R(List<String> list) {
        this.f52075j = list;
    }

    public void S(String... strArr) {
        this.f52075j = Arrays.asList(strArr);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.github.mikephil.charting.data.Entry] */
    @Override // fm.k
    public Entry s(im.d dVar) {
        return k(dVar.d()).m((int) dVar.h());
    }

    public q(List<km.j> list) {
        super(list);
    }

    public q(km.j... jVarArr) {
        super(jVarArr);
    }
}
