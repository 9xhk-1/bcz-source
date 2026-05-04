package h50;

import a00.h0;
import f50.v;
import java.lang.annotation.Annotation;
import java.util.List;
import yz.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c1(markerClass = {v.class})
/* loaded from: classes8.dex */
public interface f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        @m80.k
        public static List<Annotation> a(@m80.k f fVar) {
            return f.super.getAnnotations();
        }

        @Deprecated
        public static boolean b(@m80.k f fVar) {
            return f.super.isInline();
        }

        @Deprecated
        public static boolean c(@m80.k f fVar) {
            return f.super.b();
        }
    }

    default boolean b() {
        return false;
    }

    int d(@m80.k String str);

    @m80.k
    f e(int i11);

    @m80.k
    default List<Annotation> getAnnotations() {
        return h0.J();
    }

    @m80.k
    m getKind();

    int h();

    @m80.k
    String i(int i11);

    default boolean isInline() {
        return false;
    }

    @m80.k
    List<Annotation> j(int i11);

    @m80.k
    String k();

    boolean l(int i11);
}
