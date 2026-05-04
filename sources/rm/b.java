package rm;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b implements Comparator<Entry> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Entry entry, Entry entry2) {
        float j11 = entry.j() - entry2.j();
        if (j11 == 0.0f) {
            return 0;
        }
        return j11 > 0.0f ? 1 : -1;
    }
}
