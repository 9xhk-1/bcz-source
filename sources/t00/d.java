package t00;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.io.path.CopyActionResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n
/* loaded from: classes8.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d f89134a = new d();

    @Override // t00.a
    @m80.k
    public CopyActionResult a(@m80.k Path path, @m80.k Path target, boolean z11) {
        boolean isDirectory;
        Path copy;
        LinkOption linkOption;
        boolean isDirectory2;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(target, "target");
        LinkOption[] a11 = t.f89184a.a(z11);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a11, a11.length);
        isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (isDirectory) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory2 = Files.isDirectory(target, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (isDirectory2) {
                yz.g2 g2Var = yz.g2.f100423a;
                return CopyActionResult.CONTINUE;
            }
        }
        CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(a11, a11.length);
        copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.g0.o(copy, "copy(...)");
        return CopyActionResult.CONTINUE;
    }
}
