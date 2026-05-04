package d90;

import java.util.List;
import org.apiguardian.api.API;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.7", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface b {
    <T> T a(int index, Class<T> requiredType) throws ArgumentAccessException;

    Integer b(int index) throws ArgumentAccessException;

    Character c(int index) throws ArgumentAccessException;

    int d();

    Object get(int index) throws ArgumentAccessException;

    Boolean getBoolean(int index) throws ArgumentAccessException;

    Byte getByte(int index) throws ArgumentAccessException;

    Double getDouble(int index) throws ArgumentAccessException;

    Float getFloat(int index) throws ArgumentAccessException;

    Long getLong(int index) throws ArgumentAccessException;

    Short getShort(int index) throws ArgumentAccessException;

    String getString(int index) throws ArgumentAccessException;

    int size();

    Object[] toArray();

    List<Object> toList();
}
