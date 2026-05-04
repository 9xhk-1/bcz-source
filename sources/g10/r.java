package g10;

import java.lang.Comparable;
import kotlin.jvm.internal.g0;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.9")
@j2(markerClass = {kotlin.c.class})
/* loaded from: classes8.dex */
public interface r<T extends Comparable<? super T>> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@m80.k r<T> rVar, @m80.k T value) {
            g0.p(value, "value");
            return value.compareTo(rVar.getStart()) >= 0 && value.compareTo(rVar.b()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@m80.k r<T> rVar) {
            return rVar.getStart().compareTo(rVar.b()) >= 0;
        }
    }

    @m80.k
    T b();

    boolean contains(@m80.k T t11);

    @m80.k
    T getStart();

    boolean isEmpty();
}
