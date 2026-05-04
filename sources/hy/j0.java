package hy;

import com.sun.nio.file.SensitivityWatchEventModifier;
import hy.f;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j0 implements f {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Path f59960b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ClassLoader f59961c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public f f59962d;

    /* renamed from: e, reason: collision with root package name */
    public final WatchService f59963e;

    public j0(@m80.k Path zip, @m80.k ClassLoader classLoader, @m80.k f delegate) {
        FileSystem fileSystem;
        WatchService newWatchService;
        Path parent;
        WatchEvent.Kind kind;
        WatchEvent.Kind kind2;
        WatchEvent.Kind kind3;
        WatchEvent.Kind kind4;
        kotlin.jvm.internal.g0.p(zip, "zip");
        kotlin.jvm.internal.g0.p(classLoader, "classLoader");
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f59960b = zip;
        this.f59961c = classLoader;
        this.f59962d = delegate;
        fileSystem = FileSystems.getDefault();
        newWatchService = fileSystem.newWatchService();
        this.f59963e = newWatchService;
        parent = zip.getParent();
        kind = StandardWatchEventKinds.ENTRY_CREATE;
        kind2 = StandardWatchEventKinds.ENTRY_DELETE;
        kind3 = StandardWatchEventKinds.ENTRY_MODIFY;
        kind4 = StandardWatchEventKinds.OVERFLOW;
        parent.register(newWatchService, new WatchEvent.Kind[]{kind, kind2, kind3, kind4}, SensitivityWatchEventModifier.HIGH);
    }

    @Override // hy.f
    @m80.k
    public Path a(@m80.k String first, @m80.k String... more) {
        WatchKey poll;
        List pollEvents;
        FileSystem A;
        kotlin.jvm.internal.g0.p(first, "first");
        kotlin.jvm.internal.g0.p(more, "more");
        poll = this.f59963e.poll();
        if (poll == null) {
            return this.f59962d.a(first, (String[]) Arrays.copyOf(more, more.length));
        }
        pollEvents = poll.pollEvents();
        kotlin.jvm.internal.g0.m(pollEvents);
        if (!pollEvents.isEmpty()) {
            f.a aVar = f.f59830a;
            A = i1.A(this.f59960b, this.f59961c);
            this.f59962d = aVar.a(A);
        }
        poll.reset();
        return this.f59962d.a(first, (String[]) Arrays.copyOf(more, more.length));
    }
}
