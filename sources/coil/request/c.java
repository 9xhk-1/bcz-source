package coil.request;

import a00.l1;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f9803b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @g
    @k
    public static final c f9804c = new c(l1.z());

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<Class<?>, Object> f9805a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @o
        @k
        public final c a(@k Map<Class<?>, ? extends Object> map) {
            return new c(u0.c.h(map), null);
        }

        public a() {
        }
    }

    public /* synthetic */ c(Map map, v vVar) {
        this(map);
    }

    @o
    @k
    public static final c b(@k Map<Class<?>, ? extends Object> map) {
        return f9803b.a(map);
    }

    @k
    public final Map<Class<?>, Object> a() {
        return this.f9805a;
    }

    public final /* synthetic */ <T> T c() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) d(Object.class);
    }

    @l
    public final <T> T d(@k Class<? extends T> cls) {
        return cls.cast(this.f9805a.get(cls));
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && g0.g(this.f9805a, ((c) obj).f9805a);
    }

    public int hashCode() {
        return this.f9805a.hashCode();
    }

    @k
    public String toString() {
        return "Tags(tags=" + this.f9805a + ')';
    }

    public c(Map<Class<?>, ? extends Object> map) {
        this.f9805a = map;
    }
}
