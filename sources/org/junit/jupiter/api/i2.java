package org.junit.jupiter.api;

import java.net.URI;
import java.util.Iterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.3", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public class i2 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final r80.a f77959c;

    public i2(String displayName, URI testSourceUri, r80.a executable) {
        super(displayName, testSourceUri);
        this.f77959c = (r80.a) ba0.c2.r(executable, "executable must not be null");
    }

    public static i2 h(String displayName, URI testSourceUri, r80.a executable) {
        return new i2(displayName, testSourceUri, executable);
    }

    public static i2 i(String displayName, r80.a executable) {
        return new i2(displayName, null, executable);
    }

    @API(since = "5.11", status = API.Status.EXPERIMENTAL)
    public static <T extends t2<E>, E extends r80.a> Stream<i2> k(Iterator<? extends T> iterator) {
        ba0.c2.r(iterator, "iterator must not be null");
        return n(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, 16), false));
    }

    public static <T> Stream<i2> l(Iterator<T> inputGenerator, Function<? super T, String> displayNameGenerator, r80.b<? super T> testExecutor) {
        ba0.c2.r(inputGenerator, "inputGenerator must not be null");
        return o(StreamSupport.stream(Spliterators.spliteratorUnknownSize(inputGenerator, 16), false), displayNameGenerator, testExecutor);
    }

    @API(since = "5.8", status = API.Status.MAINTAINED)
    public static <T> Stream<i2> m(Iterator<? extends t2<T>> inputGenerator, r80.b<? super T> testExecutor) {
        ba0.c2.r(inputGenerator, "inputGenerator must not be null");
        return p(StreamSupport.stream(Spliterators.spliteratorUnknownSize(inputGenerator, 16), false), testExecutor);
    }

    @API(since = "5.11", status = API.Status.EXPERIMENTAL)
    public static <T extends t2<E>, E extends r80.a> Stream<i2> n(Stream<? extends T> inputStream) {
        ba0.c2.r(inputStream, "inputStream must not be null");
        return inputStream.map(new Function() { // from class: org.junit.jupiter.api.h2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                i2 i11;
                i11 = i2.i(r1.getName(), (r80.a) ((t2) obj).a());
                return i11;
            }
        });
    }

    @API(since = "5.7", status = API.Status.MAINTAINED)
    public static <T> Stream<i2> o(Stream<T> inputStream, final Function<? super T, String> displayNameGenerator, final r80.b<? super T> testExecutor) {
        ba0.c2.r(inputStream, "inputStream must not be null");
        ba0.c2.r(displayNameGenerator, "displayNameGenerator must not be null");
        ba0.c2.r(testExecutor, "testExecutor must not be null");
        return inputStream.map(new Function() { // from class: org.junit.jupiter.api.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                i2 i11;
                i11 = i2.i((String) displayNameGenerator.apply(obj), new r80.a() { // from class: org.junit.jupiter.api.f2
                    @Override // r80.a
                    public final void execute() {
                        r80.b.this.accept(obj);
                    }
                });
                return i11;
            }
        });
    }

    @API(since = "5.8", status = API.Status.MAINTAINED)
    public static <T> Stream<i2> p(Stream<? extends t2<T>> inputStream, final r80.b<? super T> testExecutor) {
        ba0.c2.r(inputStream, "inputStream must not be null");
        ba0.c2.r(testExecutor, "testExecutor must not be null");
        return inputStream.map(new Function() { // from class: org.junit.jupiter.api.d2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                i2 i11;
                i11 = i2.i(r2.getName(), new r80.a() { // from class: org.junit.jupiter.api.e2
                    @Override // r80.a
                    public final void execute() {
                        r80.b.this.accept(r2.a());
                    }
                });
                return i11;
            }
        });
    }

    public r80.a j() {
        return this.f77959c;
    }
}
