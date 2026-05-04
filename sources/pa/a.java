package pa;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import qb0.g;
import qb0.h;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a implements pa.b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f80315c = ".mmap2";

    /* renamed from: a, reason: collision with root package name */
    public final String f80316a;

    /* renamed from: b, reason: collision with root package name */
    public h f80317b = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: pa.a$a, reason: collision with other inner class name */
    public class C0984a extends g<File> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f80318a;

        public C0984a(final List val$result) {
            this.f80318a = val$result;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(a.this.f80316a, e11.getMessage(), new Object[0]);
        }

        @Override // qb0.c
        public void onNext(File file) {
            this.f80318a.add(file);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<List<File>, rx.c<File>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f80320a;

        public b(final Object[] val$args) {
            this.f80320a = val$args;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<File> call(List<File> files) {
            return files.size() == 1 ? rx.c.u2(files) : rx.c.u2(a.this.b(files, this.f80320a));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<File, List<File>> {
        public c() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<File> call(File file) {
            ArrayList arrayList = new ArrayList();
            if (!file.exists()) {
                qb.c.d(a.this.f80316a, "file dose not exists path = ", file.getAbsolutePath());
                return arrayList;
            }
            if (file.isDirectory()) {
                arrayList.addAll(Arrays.asList(file.listFiles()));
                return arrayList;
            }
            arrayList.add(file);
            return arrayList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements p<String, File> {
        public d() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public File call(String s11) {
            return new File(s11);
        }
    }

    public a(String tag) {
        this.f80316a = tag;
    }

    @Override // pa.b
    public List<File> a(String crash, final String logPath, final Object... args) {
        h hVar = this.f80317b;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f80317b.unsubscribe();
        }
        ArrayList arrayList = new ArrayList();
        this.f80317b = rx.c.N2(crash, logPath).c3(new d()).c3(new c()).b2(new b(args)).r5(new C0984a(arrayList));
        return arrayList;
    }

    public abstract List<File> b(List<File> files, Object... args);
}
