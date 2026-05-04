package xy;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface v1 {
    @m80.l
    List<String> a(@m80.k String str);

    boolean b();

    @m80.k
    u1 build();

    boolean c(@m80.k String str, @m80.k String str2);

    void clear();

    boolean contains(@m80.k String str);

    void d(@m80.k String str, @m80.k String str2);

    boolean e(@m80.k String str, @m80.k String str2);

    @m80.k
    Set<Map.Entry<String, List<String>>> entries();

    void f(@m80.k String str, @m80.k Iterable<String> iterable);

    void g();

    @m80.l
    String get(@m80.k String str);

    void h(@m80.k String str, @m80.k Iterable<String> iterable);

    void i(@m80.k u1 u1Var);

    boolean isEmpty();

    void j(@m80.k u1 u1Var);

    void k(@m80.k String str, @m80.k String str2);

    @m80.k
    Set<String> names();

    void remove(@m80.k String str);
}
