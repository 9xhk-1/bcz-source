package y0;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TargetApi(19)
/* loaded from: classes3.dex */
public class l implements n, j {

    /* renamed from: d, reason: collision with root package name */
    public final String f98872d;

    /* renamed from: f, reason: collision with root package name */
    public final MergePaths f98874f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f98869a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f98870b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f98871c = new Path();

    /* renamed from: e, reason: collision with root package name */
    public final List<n> f98873e = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98875a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f98875a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98875a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98875a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98875a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98875a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(MergePaths mergePaths) {
        this.f98872d = mergePaths.c();
        this.f98874f = mergePaths;
    }

    public final void b() {
        for (int i11 = 0; i11 < this.f98873e.size(); i11++) {
            this.f98871c.addPath(this.f98873e.get(i11).getPath());
        }
    }

    @Override // y0.j
    public void c(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof n) {
                this.f98873e.add((n) previous);
                listIterator.remove();
            }
        }
    }

    @TargetApi(19)
    public final void e(Path.Op op2) {
        this.f98870b.reset();
        this.f98869a.reset();
        for (int size = this.f98873e.size() - 1; size >= 1; size--) {
            n nVar = this.f98873e.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                List<n> j11 = dVar.j();
                for (int size2 = j11.size() - 1; size2 >= 0; size2--) {
                    Path path = j11.get(size2).getPath();
                    path.transform(dVar.k());
                    this.f98870b.addPath(path);
                }
            } else {
                this.f98870b.addPath(nVar.getPath());
            }
        }
        n nVar2 = this.f98873e.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> j12 = dVar2.j();
            for (int i11 = 0; i11 < j12.size(); i11++) {
                Path path2 = j12.get(i11).getPath();
                path2.transform(dVar2.k());
                this.f98869a.addPath(path2);
            }
        } else {
            this.f98869a.set(nVar2.getPath());
        }
        this.f98871c.op(this.f98869a, this.f98870b, op2);
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < this.f98873e.size(); i11++) {
            this.f98873e.get(i11).f(list, list2);
        }
    }

    @Override // y0.c
    public String getName() {
        return this.f98872d;
    }

    @Override // y0.n
    public Path getPath() {
        this.f98871c.reset();
        if (this.f98874f.d()) {
            return this.f98871c;
        }
        int i11 = a.f98875a[this.f98874f.b().ordinal()];
        if (i11 == 1) {
            b();
        } else if (i11 == 2) {
            e(Path.Op.UNION);
        } else if (i11 == 3) {
            e(Path.Op.REVERSE_DIFFERENCE);
        } else if (i11 == 4) {
            e(Path.Op.INTERSECT);
        } else if (i11 == 5) {
            e(Path.Op.XOR);
        }
        return this.f98871c;
    }
}
