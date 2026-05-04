package g10;

import java.lang.Comparable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g<T extends Comparable<? super T>> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@m80.k g<T> gVar, @m80.k T value) {
            g0.p(value, "value");
            return value.compareTo(gVar.getStart()) >= 0 && value.compareTo(gVar.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@m80.k g<T> gVar) {
            return gVar.getStart().compareTo(gVar.getEndInclusive()) > 0;
        }
    }

    boolean contains(@m80.k T t11);

    @m80.k
    T getEndInclusive();

    @m80.k
    T getStart();

    boolean isEmpty();
}
