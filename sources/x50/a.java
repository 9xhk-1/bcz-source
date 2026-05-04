package x50;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FileChannel f97544a;

    public a(@k FileChannel fileChannel) {
        g0.p(fileChannel, "fileChannel");
        this.f97544a = fileChannel;
    }

    public final void a(long j11, @k l60.k sink, long j12) {
        g0.p(sink, "sink");
        if (j12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j13 = j11;
        long j14 = j12;
        while (j14 > 0) {
            long transferTo = this.f97544a.transferTo(j13, j14, sink);
            j13 += transferTo;
            j14 -= transferTo;
        }
    }

    public final void b(long j11, @k l60.k source, long j12) throws IOException {
        g0.p(source, "source");
        if (j12 < 0 || j12 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j13 = j11;
        long j14 = j12;
        while (j14 > 0) {
            long transferFrom = this.f97544a.transferFrom(source, j13, j14);
            j13 += transferFrom;
            j14 -= transferFrom;
        }
    }
}
