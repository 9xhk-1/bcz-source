package com.google.common.collect;

import com.google.common.collect.j7;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.c
/* loaded from: classes7.dex */
public final class o8 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Field f33697a;

        public void a(T instance, int value) {
            try {
                this.f33697a.set(instance, Integer.valueOf(value));
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public void b(T instance, Object value) {
            try {
                this.f33697a.set(instance, value);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public b(Field field) {
            this.f33697a = field;
            field.setAccessible(true);
        }
    }

    public static <T> b<T> a(Class<T> clazz, String fieldName) {
        try {
            return new b<>(clazz.getDeclaredField(fieldName));
        } catch (NoSuchFieldException e11) {
            throw new AssertionError(e11);
        }
    }

    public static <K, V> void b(Map<K, V> map, ObjectInputStream stream) throws IOException, ClassNotFoundException {
        c(map, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void c(Map<K, V> map, ObjectInputStream stream, int size) throws IOException, ClassNotFoundException {
        for (int i11 = 0; i11 < size; i11++) {
            map.put(stream.readObject(), stream.readObject());
        }
    }

    public static <K, V> void d(d7<K, V> multimap, ObjectInputStream stream) throws IOException, ClassNotFoundException {
        e(multimap, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void e(d7<K, V> multimap, ObjectInputStream stream, int distinctKeys) throws IOException, ClassNotFoundException {
        for (int i11 = 0; i11 < distinctKeys; i11++) {
            Collection collection = multimap.get(stream.readObject());
            int readInt = stream.readInt();
            for (int i12 = 0; i12 < readInt; i12++) {
                collection.add(stream.readObject());
            }
        }
    }

    public static <E> void f(j7<E> multiset, ObjectInputStream stream) throws IOException, ClassNotFoundException {
        g(multiset, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void g(j7<E> multiset, ObjectInputStream stream, int distinctElements) throws IOException, ClassNotFoundException {
        for (int i11 = 0; i11 < distinctElements; i11++) {
            multiset.add(stream.readObject(), stream.readInt());
        }
    }

    public static int h(ObjectInputStream stream) throws IOException {
        return stream.readInt();
    }

    public static <K, V> void i(Map<K, V> map, ObjectOutputStream stream) throws IOException {
        stream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    public static <K, V> void j(d7<K, V> multimap, ObjectOutputStream stream) throws IOException {
        stream.writeInt(multimap.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : multimap.asMap().entrySet()) {
            stream.writeObject(entry.getKey());
            stream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                stream.writeObject(it.next());
            }
        }
    }

    public static <E> void k(j7<E> multiset, ObjectOutputStream stream) throws IOException {
        stream.writeInt(multiset.entrySet().size());
        for (j7.a<E> aVar : multiset.entrySet()) {
            stream.writeObject(aVar.e());
            stream.writeInt(aVar.getCount());
        }
    }
}
