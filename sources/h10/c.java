package h10;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface c<R> extends b {
    R call(@m80.k Object... objArr);

    R callBy(@m80.k Map<KParameter, ? extends Object> map);

    @m80.k
    String getName();

    @m80.k
    List<KParameter> getParameters();

    @m80.k
    r getReturnType();

    @m80.k
    List<s> getTypeParameters();

    @m80.l
    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @o00.g
        public static /* synthetic */ void a() {
        }

        @y0(version = "1.1")
        public static /* synthetic */ void b() {
        }

        @y0(version = "1.1")
        public static /* synthetic */ void c() {
        }

        @y0(version = "1.1")
        public static /* synthetic */ void d() {
        }

        @y0(version = "1.1")
        public static /* synthetic */ void e() {
        }

        @y0(version = "1.1")
        public static /* synthetic */ void f() {
        }

        @y0(version = "1.3")
        public static /* synthetic */ void g() {
        }
    }
}
