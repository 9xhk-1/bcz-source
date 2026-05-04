package g10;

import java.lang.Comparable;
import kotlin.jvm.internal.g0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.1")
/* loaded from: classes8.dex */
public interface f<T extends Comparable<? super T>> extends g<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@m80.k f<T> fVar, @m80.k T value) {
            g0.p(value, "value");
            return fVar.a(fVar.getStart(), value) && fVar.a(value, fVar.getEndInclusive());
        }

        public static <T extends Comparable<? super T>> boolean b(@m80.k f<T> fVar) {
            return !fVar.a(fVar.getStart(), fVar.getEndInclusive());
        }
    }

    boolean a(@m80.k T t11, @m80.k T t12);

    @Override // g10.g
    boolean contains(@m80.k T t11);

    @Override // g10.g
    boolean isEmpty();
}
