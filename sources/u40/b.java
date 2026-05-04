package u40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface b<Object, Field> extends w40.a<Object, Field> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static <Object, Field> Field a(@m80.k b<? super Object, Field> bVar, Object object) {
            return (Field) b.super.c(object);
        }
    }

    @m80.l
    Field a(Object object);

    default Field c(Object object) {
        Field a11 = a(object);
        if (a11 != null) {
            return a11;
        }
        throw new IllegalStateException("Field " + getName() + " is not set");
    }
}
