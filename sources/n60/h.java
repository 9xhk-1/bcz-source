package n60;

import java.util.Comparator;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final g f74539a;

    public h() {
        this.f74539a = null;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        try {
            return ((Comparable) this.f74539a.encode(obj)).compareTo((Comparable) this.f74539a.encode(obj2));
        } catch (EncoderException unused) {
            return 0;
        }
    }

    public h(g gVar) {
        this.f74539a = gVar;
    }
}
