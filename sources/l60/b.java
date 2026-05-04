package l60;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.n(message = "changed in Okio 2.x")
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f70366a = new b();

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @m80.k
    public final e1 a(@m80.k File file) {
        kotlin.jvm.internal.g0.p(file, "file");
        return r0.a(file);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @m80.k
    public final e1 b() {
        return r0.c();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @m80.k
    public final l c(@m80.k e1 sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        return r0.d(sink);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "source.buffer()", imports = {"okio.buffer"}))
    @m80.k
    public final m d(@m80.k g1 source) {
        kotlin.jvm.internal.g0.p(source, "source");
        return r0.e(source);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "file.sink()", imports = {"okio.sink"}))
    @m80.k
    public final e1 e(@m80.k File file) {
        kotlin.jvm.internal.g0.p(file, "file");
        return s0.o(file, false, 1, null);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @m80.k
    public final e1 f(@m80.k OutputStream outputStream) {
        kotlin.jvm.internal.g0.p(outputStream, "outputStream");
        return r0.p(outputStream);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "socket.sink()", imports = {"okio.sink"}))
    @m80.k
    public final e1 g(@m80.k Socket socket) {
        kotlin.jvm.internal.g0.p(socket, "socket");
        return r0.q(socket);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @m80.k
    public final e1 h(@m80.k Path path, @m80.k OpenOption... options) {
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(options, "options");
        return r0.r(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "file.source()", imports = {"okio.source"}))
    @m80.k
    public final g1 i(@m80.k File file) {
        kotlin.jvm.internal.g0.p(file, "file");
        return r0.u(file);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "inputStream.source()", imports = {"okio.source"}))
    @m80.k
    public final g1 j(@m80.k InputStream inputStream) {
        kotlin.jvm.internal.g0.p(inputStream, "inputStream");
        return r0.v(inputStream);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "socket.source()", imports = {"okio.source"}))
    @m80.k
    public final g1 k(@m80.k Socket socket) {
        kotlin.jvm.internal.g0.p(socket, "socket");
        return r0.w(socket);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "path.source(*options)", imports = {"okio.source"}))
    @m80.k
    public final g1 l(@m80.k Path path, @m80.k OpenOption... options) {
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(options, "options");
        return r0.x(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }
}
