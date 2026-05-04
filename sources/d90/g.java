package d90;

import ba0.c2;
import ba0.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;
import p80.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.2", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final t f47505a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47506b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f47507c;

    public g(t parameterContext, int invocationIndex, Object... arguments) {
        c2.r(parameterContext, "ParameterContext must not be null");
        c2.f(invocationIndex >= 1, new Supplier() { // from class: d90.f
            @Override // java.util.function.Supplier
            public final Object get() {
                return g.f();
            }
        });
        c2.r(arguments, "Arguments array must not be null");
        this.f47505a = parameterContext;
        this.f47506b = invocationIndex;
        this.f47507c = arguments;
    }

    public static /* synthetic */ String f() {
        return "invocation index must be >= 1";
    }

    @Override // d90.b
    public <T> T a(int index, Class<T> requiredType) {
        c2.r(requiredType, "requiredType must not be null");
        Object obj = get(index);
        try {
            return requiredType.cast(e90.e.f49610a.b(obj, requiredType, this.f47505a));
        } catch (Exception e11) {
            throw new ArgumentAccessException(String.format("Argument at index [%d] with value [%s] and type [%s] could not be converted or cast to type [%s].", Integer.valueOf(index), obj, y.b(obj == null ? null : obj.getClass()), requiredType.getName()), e11);
        }
    }

    @Override // d90.b
    public Integer b(int index) {
        return (Integer) a(index, Integer.class);
    }

    @Override // d90.b
    public Character c(int index) {
        return (Character) a(index, Character.class);
    }

    @Override // d90.b
    public int d() {
        return this.f47506b;
    }

    @Override // d90.b
    public Object get(int index) {
        c2.f(index >= 0 && index < this.f47507c.length, new Supplier() { // from class: d90.e
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("index must be >= 0 and < %d", Integer.valueOf(g.this.f47507c.length));
                return format;
            }
        });
        return this.f47507c[index];
    }

    @Override // d90.b
    public Boolean getBoolean(int index) {
        return (Boolean) a(index, Boolean.class);
    }

    @Override // d90.b
    public Byte getByte(int index) {
        return (Byte) a(index, Byte.class);
    }

    @Override // d90.b
    public Double getDouble(int index) {
        return (Double) a(index, Double.class);
    }

    @Override // d90.b
    public Float getFloat(int index) {
        return (Float) a(index, Float.class);
    }

    @Override // d90.b
    public Long getLong(int index) {
        return (Long) a(index, Long.class);
    }

    @Override // d90.b
    public Short getShort(int index) {
        return (Short) a(index, Short.class);
    }

    @Override // d90.b
    public String getString(int index) {
        return (String) a(index, String.class);
    }

    @Override // d90.b
    public int size() {
        return this.f47507c.length;
    }

    @Override // d90.b
    public Object[] toArray() {
        Object[] objArr = this.f47507c;
        return Arrays.copyOf(objArr, objArr.length);
    }

    @Override // d90.b
    public List<Object> toList() {
        return Collections.unmodifiableList(Arrays.asList(this.f47507c));
    }
}
