package t00;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "2.1")
@yz.j2(markerClass = {n.class})
/* loaded from: classes8.dex */
public interface o {
    void a(@m80.k x00.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void b(@m80.k x00.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void c(@m80.k x00.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void d(@m80.k x00.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);
}
