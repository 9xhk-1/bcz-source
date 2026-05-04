package fm;

import android.graphics.Color;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class d<T extends Entry> extends DataSet<T> implements km.b<T> {

    /* renamed from: x, reason: collision with root package name */
    public int f52035x;

    public d(List<T> list, String str) {
        super(list, str);
        this.f52035x = Color.rgb(255, 187, 115);
    }

    public void Q1(d dVar) {
        super.M1(dVar);
        dVar.f52035x = this.f52035x;
    }

    public void R1(int i11) {
        this.f52035x = i11;
    }

    @Override // km.b
    public int k1() {
        return this.f52035x;
    }
}
